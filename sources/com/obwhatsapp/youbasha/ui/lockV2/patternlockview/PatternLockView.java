package com.obwhatsapp.youbasha.ui.lockV2.patternlockview;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import com.obwhatsapp.yo.ColorStore;
import com.obwhatsapp.yo.i0;
import com.obwhatsapp.yo.p;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.ui.lockV2.patternlockview.listener.PatternLockViewListener;
import com.obwhatsapp.youbasha.ui.lockV2.patternlockview.utils.PatternLockUtils;
import com.obwhatsapp.youbasha.ui.lockV2.patternlockview.utils.ResourceUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n.e;
import p.b;
import p.c;

public class PatternLockView extends View {
    public static int H;
    public float A;
    public float B;
    public final Path C;
    public final Rect D;
    public final Rect E;
    public Interpolator F;
    public Interpolator G;

    /* renamed from: a  reason: collision with root package name */
    public DotState[][] f1298a;

    /* renamed from: b  reason: collision with root package name */
    public int f1299b;

    /* renamed from: c  reason: collision with root package name */
    public long f1300c;

    /* renamed from: d  reason: collision with root package name */
    public final float f1301d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1302e;

    /* renamed from: f  reason: collision with root package name */
    public int f1303f;

    /* renamed from: g  reason: collision with root package name */
    public int f1304g;

    /* renamed from: h  reason: collision with root package name */
    public int f1305h;

    /* renamed from: i  reason: collision with root package name */
    public int f1306i;

    /* renamed from: j  reason: collision with root package name */
    public int f1307j;

    /* renamed from: k  reason: collision with root package name */
    public int f1308k;

    /* renamed from: l  reason: collision with root package name */
    public int f1309l;

    /* renamed from: m  reason: collision with root package name */
    public int f1310m;

    /* renamed from: n  reason: collision with root package name */
    public int f1311n;

    /* renamed from: o  reason: collision with root package name */
    public Paint f1312o;

    /* renamed from: p  reason: collision with root package name */
    public Paint f1313p;

    /* renamed from: q  reason: collision with root package name */
    public final ArrayList f1314q;

    /* renamed from: r  reason: collision with root package name */
    public ArrayList f1315r;

    /* renamed from: s  reason: collision with root package name */
    public boolean[][] f1316s;

    /* renamed from: t  reason: collision with root package name */
    public float f1317t;

    /* renamed from: u  reason: collision with root package name */
    public float f1318u;

    /* renamed from: v  reason: collision with root package name */
    public int f1319v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f1320w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f1321x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f1322y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f1323z;

    @Retention(RetentionPolicy.SOURCE)
    public @interface AspectRatio {
        public static final int ASPECT_RATIO_HEIGHT_BIAS = 2;
        public static final int ASPECT_RATIO_SQUARE = 0;
        public static final int ASPECT_RATIO_WIDTH_BIAS = 1;
    }

    public class Dot implements Parcelable {
        public static final Parcelable.Creator<Dot> CREATOR = new i0(1);

        /* renamed from: c  reason: collision with root package name */
        public static final Dot[][] f1324c;

        /* renamed from: a  reason: collision with root package name */
        public final int f1325a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1326b;

        static {
            String str = "ۥۨ۬ۖ۬ۨۘۘۤۤۛ۠ۤۢۛۨۤۦۨۘۚۙۖۘۗۡ۠";
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                switch ((str.hashCode() ^ 370) ^ -318622751) {
                    case -2123962679:
                        f1324c = (Dot[][]) Array.newInstance(Dot.class, new int[]{i6, i6});
                        str = "ۖ۠ۧۛۤ۟ۗۖ۬ۧۢۗ۠ۨۖۢۨۗۙۦ۫ۧۦۘ";
                        break;
                    case -1657785180:
                        str = "۫ۧۖۖۢۜ۫ۗۧۜۖۜ۟ۛۥ۟ۦۘ۠ۗۘ";
                        break;
                    case -1521752834:
                        str = "ۙ۟ۘۘۤۖۧۘۗ۠ۜۘ۟ۤۢۢۢۛ";
                        break;
                    case -1080873611:
                        str = "ۘۢ۬ۗۥ۟ۛۚۘۘۘۢ۟ۡ۬ۥۘۗۡۚۥۙۖ۬ۥ";
                        break;
                    case -1060990109:
                        str = "ۥ۟ۧۢۧ۟۟ۚۚۖۛۡۘۚۡ۬";
                        i5 = 0;
                        break;
                    case -1022219498:
                        f1324c[i5][i4] = new Dot(i5, i4);
                        str = "ۙۡۡۘۢۤۙۚ۟ۥۘۨۢۜ۟ۗۖۙ۬ۨ";
                        break;
                    case -744170780:
                        String str2 = "ۥۖۖۦۡۥۢۦۤۦۡۡۦۥۥۙ۟ۡۘ";
                        while (true) {
                            switch (str2.hashCode() ^ -987261658) {
                                case -1796736998:
                                    str = "ۨ۟ۥ۠ۧۥۥ۟ۡۘۢ۫ۦۘۚۙۗ۬ۧ۫ۤۧۘۘ";
                                    continue;
                                case -990901858:
                                    if (i5 >= PatternLockView.H) {
                                        str2 = "۬۬ۜۧ۬ۗ۫۟۬ۜۜ۟۬ۢۘۘۦۖۨ۬ۘۛ۠ۛۦۙۧ۫";
                                        break;
                                    } else {
                                        str2 = "ۡۥۡۦۥۜۘۙۨۨۘۨ۟ۙۚ۫ۘ";
                                        break;
                                    }
                                case -497862469:
                                    str = "ۘۧۜۦۛۜۘۧ۟ۜۘۦ۬ۘۘ۠ۛۦۘۤ۟ۛ۬ۙ۟";
                                    continue;
                                case 553409754:
                                    str2 = "۫۫ۜۘۥۖۛۧ۫ۨ۫ۗۘۘۤۖۤۡۥۦۘ۫ۤۜ";
                                    break;
                            }
                        }
                        break;
                    case -699617420:
                        str = "ۥ۟ۧۢۧ۟۟ۚۚۖۛۡۘۚۡ۬";
                        break;
                    case 253789485:
                        str = "ۨۡۦ۟ۗۜۧۥۨۘۙ۫ۙۙۨۛۧۖ۠ۖۘۖ";
                        i4 = i3;
                        break;
                    case 283637231:
                        str = "ۢۖۘۘ۠ۗۜۘۗۗۤۢۧۤ۠ۛۥۘۘ۫ۙ۬ۥۦۧۗ";
                        i5 = i2;
                        break;
                    case 541647606:
                        i2 = i5 + 1;
                        str = "ۘ۠ۖۚۦۦۥۘۧۘۡۖۨۢۖ۫ۥ۬ۗ";
                        break;
                    case 789643300:
                        str = "ۖ۠ۧۘۘۖۜۛۗۥۜ۠۫ۧۖۘۡۛ۠ۙۡۜ";
                        break;
                    case 840991663:
                        str = "ۙ۟ۘۘۤۖۧۘۗ۠ۜۘ۟ۤۢۢۢۛ";
                        i4 = 0;
                        break;
                    case 914988986:
                        i3 = i4 + 1;
                        str = "ۢۤ۫ۦۖۛۢۖۡۘۥۡۡۘۦۤۜ";
                        break;
                    case 915966469:
                        return;
                    case 1010828287:
                        String str3 = "۬ۤۖۘ۠ۥۤۛۧۧۘۘۖۤۖۤ";
                        while (true) {
                            switch (str3.hashCode() ^ -1408773830) {
                                case -2137740556:
                                    str = "ۧۡۥۘۖۘۘۥۜۗۜۢۤ۬ۚۢۜ۬ۜۘۚۥۨۘۦۦۧۘ";
                                    continue;
                                case -1822155448:
                                    if (i4 >= PatternLockView.H) {
                                        str3 = "ۨۤۥۘۚۖۨۙۢۖۘ۬ۚ۠ۜ۠";
                                        break;
                                    } else {
                                        str3 = "۫ۦۙۗۖۖۘ۬ۚۜۚۗۜۚۛۡ۫ۚۤ";
                                        break;
                                    }
                                case 34278330:
                                    str = "ۧ۫۠ۜۡۗۤۗۨۘۖۘۡۧ۠۬ۢ۬ۙۧ۬ۡۘۨۦۖۘۘۖۡ";
                                    continue;
                                case 1396188351:
                                    str3 = "ۤۨ۠ۤۨۗۥۤۦۘ۫۟ۧۗۥۜۘۤۦۗ";
                                    break;
                            }
                        }
                        break;
                    case 1488799225:
                        i6 = PatternLockView.H;
                        str = "ۖۜ۬ۥۥۡۛۦۦۡۙ۫ۡۜۦۤۜۨۖۘ";
                        break;
                }
            }
        }

        public Dot(int i2, int i3) {
            a(i2, i3);
            this.f1325a = i2;
            this.f1326b = i3;
        }

        public Dot(Parcel parcel) {
            this.f1326b = parcel.readInt();
            this.f1325a = parcel.readInt();
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x006c, code lost:
            r0 = "ۡۥۧۦۗ۫ۥۗۘۤۥ۫ۥ۬ۨۘ";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
            r0 = "ۙۡۡۛۘۙۤۜۜ۬ۗ۟ۜۨۖۘۚ۬ۨۘ";
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void a(int r7, int r8) {
            /*
                r2 = 0
                r4 = 0
                java.lang.String r0 = "ۜ۫ۧۧۖۤ۬۫۟ۗۙۢۥۧۘۖۥۘ"
                r1 = r2
                r3 = r2
            L_0x0006:
                int r2 = r0.hashCode()
                r5 = 827(0x33b, float:1.159E-42)
                r6 = 1340223203(0x4fe22ee3, float:7.5894472E9)
                r2 = r2 ^ r5
                r2 = r2 ^ r6
                switch(r2) {
                    case -1974342198: goto L_0x005e;
                    case -1970686126: goto L_0x001b;
                    case -1344607579: goto L_0x0018;
                    case -1262211266: goto L_0x003a;
                    case -1246745611: goto L_0x00a8;
                    case -1006384037: goto L_0x0040;
                    case -644647128: goto L_0x0015;
                    case -353883781: goto L_0x00b3;
                    case -246651946: goto L_0x00d3;
                    case 75455034: goto L_0x00c8;
                    case 380140453: goto L_0x007d;
                    case 810255451: goto L_0x00bd;
                    case 1383904791: goto L_0x00dd;
                    case 2138305098: goto L_0x009c;
                    default: goto L_0x0014;
                }
            L_0x0014:
                goto L_0x0006
            L_0x0015:
                java.lang.String r0 = "ۖ۬ۚۨۦۨۘ۫ۦۧ۠ۗۢۧ۬ۥۘۧۤۤۨۡ۟ۤۖۨۘۘ۫"
                goto L_0x0006
            L_0x0018:
                java.lang.String r0 = "۫ۘۙۦ۟ۜۨۗۦۚۦ۠ۥ۠ۡۚۢۤ۠۫۟"
                goto L_0x0006
            L_0x001b:
                r2 = 429292588(0x19967c2c, float:1.5559789E-23)
                java.lang.String r0 = "ۤ۫۠ۗۤۚ۫ۦۗۖۚۖۜ۫ۥۡۛۙۜۖۘ۟ۧۧ"
            L_0x0020:
                int r5 = r0.hashCode()
                r5 = r5 ^ r2
                switch(r5) {
                    case -1616565074: goto L_0x0037;
                    case -1067078920: goto L_0x002f;
                    case -500073928: goto L_0x0034;
                    case 1548382626: goto L_0x0029;
                    default: goto L_0x0028;
                }
            L_0x0028:
                goto L_0x0020
            L_0x0029:
                java.lang.String r0 = "ۙۡۡۛۘۙۤۜۜ۬ۗ۟ۜۨۖۘۚ۬ۨۘ"
                goto L_0x0006
            L_0x002c:
                java.lang.String r0 = "ۨۜۦۘۧ۠ۦۡۧۨۘۢۘۜۘ۬۬ۡۘ۬۠ۨ"
                goto L_0x0020
            L_0x002f:
                if (r7 < 0) goto L_0x002c
                java.lang.String r0 = "ۘ۬۬۟ۦۥۘۨۨۡ۟ۤۧۘۥۧۘ۠ۧۜۘ"
                goto L_0x0020
            L_0x0034:
                java.lang.String r0 = "ۧ۟ۨۘۥۥۦۘ۠۫۫۠ۨ۟۬ۛۢ"
                goto L_0x0020
            L_0x0037:
                java.lang.String r0 = "ۨ۠ۜۘۡۧۢۡ۟۬۟ۦۛ۠ۖۚۗۙ۬۟ۗۘۘۢۨۘۘۥۙۘۘ"
                goto L_0x0006
            L_0x003a:
                int r2 = com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView.H
                java.lang.String r0 = "ۘۛۦۚۙۡۙۚ۫۟۬ۢ۬ۛۜ"
                r4 = r2
                goto L_0x0006
            L_0x0040:
                r2 = 1948448239(0x7422f5ef, float:5.16443E31)
                java.lang.String r0 = "ۦۗۢۦۖۨۜ۫۠ۡۢۡۡۨۘ"
            L_0x0045:
                int r5 = r0.hashCode()
                r5 = r5 ^ r2
                switch(r5) {
                    case -1415716012: goto L_0x004e;
                    case -1254125730: goto L_0x005b;
                    case -1177606726: goto L_0x0029;
                    case 818332139: goto L_0x0058;
                    default: goto L_0x004d;
                }
            L_0x004d:
                goto L_0x0045
            L_0x004e:
                int r0 = r4 + -1
                if (r7 > r0) goto L_0x0055
                java.lang.String r0 = "۫ۜۢۙۤ۠۟ۗۙۗ۫ۜۡۖۤ"
                goto L_0x0045
            L_0x0055:
                java.lang.String r0 = "ۘۧۨۥ۠ۙ۫ۦۖۘۖۖۖۘۜۤ۬ۙۨۤ"
                goto L_0x0045
            L_0x0058:
                java.lang.String r0 = "۠ۖۖۘ۟ۦۨۛۤۡ۟ۡۢۜۢۘۘۧۘۗۡۙۘ۫۟ۖ"
                goto L_0x0045
            L_0x005b:
                java.lang.String r0 = "ۤۤۡۘۥۧۧۚۥۘۧۧۜۨۨ۟۠ۦۦۙۙۢۘۧۦۜۗ۠"
                goto L_0x0006
            L_0x005e:
                r2 = 1337802295(0x4fbd3e37, float:6.3499423E9)
                java.lang.String r0 = "۫ۤۜۡۨۗۗ۫ۡ۫ۚۖۖۦۧۘۖۡۨۨۨۗ"
            L_0x0063:
                int r5 = r0.hashCode()
                r5 = r5 ^ r2
                switch(r5) {
                    case -1544111179: goto L_0x0072;
                    case -1458840046: goto L_0x0077;
                    case -893504262: goto L_0x007a;
                    case 555769982: goto L_0x006c;
                    default: goto L_0x006b;
                }
            L_0x006b:
                goto L_0x0063
            L_0x006c:
                java.lang.String r0 = "ۡۥۧۦۗ۫ۥۗۘۤۥ۫ۥ۬ۨۘ"
                goto L_0x0006
            L_0x006f:
                java.lang.String r0 = "ۢۜۥۘۘ۫ۜۘ۠ۘۜۙۗۖ۟۟ۤۧ۫ۛۨۜۧۘۙۥۡۘۧۥ"
                goto L_0x0063
            L_0x0072:
                if (r8 < 0) goto L_0x006f
                java.lang.String r0 = "ۡۨۖۘۨۨۤۡۚۛۘۦۘۘۢۜۢۧ۬۠۠۬ۡۘۢۥ۫ۘۤۜۘ"
                goto L_0x0063
            L_0x0077:
                java.lang.String r0 = "ۜ۠ۨۘۛ۟۫ۘۨۖۘ۟ۚۨۘۥۗۗۙ۠۟ۚۜۘ۠ۛۛۛۡ۠"
                goto L_0x0063
            L_0x007a:
                java.lang.String r0 = "ۧۨۦ۟ۢ۫ۦۤۚۖۚۨۘ۠ۧۤۖۤۜۘ۫ۢۧۧۨۖۦۤ"
                goto L_0x0006
            L_0x007d:
                r2 = 37170249(0x2372c49, float:1.3457426E-37)
                java.lang.String r0 = "ۛۗۙۚ۟۫ۚۧۖۘۗۧ۫ۤ۠ۦ"
            L_0x0082:
                int r5 = r0.hashCode()
                r5 = r5 ^ r2
                switch(r5) {
                    case -1017977085: goto L_0x0099;
                    case -921601739: goto L_0x008b;
                    case 382740174: goto L_0x0092;
                    case 1747414791: goto L_0x006c;
                    default: goto L_0x008a;
                }
            L_0x008a:
                goto L_0x0082
            L_0x008b:
                java.lang.String r0 = "ۜۥۡۘۨۜۖۥۦۘ۟ۙۧۤۘ۫ۦۘۖۘۡ۫۬"
                goto L_0x0006
            L_0x008f:
                java.lang.String r0 = "ۘ۬۬ۥ۫۫ۘۘۥۘۙۢۖۤۥ۠ۧۥۙ۬ۙۤ"
                goto L_0x0082
            L_0x0092:
                int r0 = r4 + -1
                if (r8 > r0) goto L_0x008f
                java.lang.String r0 = "ۛۤۘۖۦۜۤۖۘۖ۬ۢۗۧۡۘ"
                goto L_0x0082
            L_0x0099:
                java.lang.String r0 = "ۖۘۚۙ۟ۡۘۙۚۨۘۤۧۜۘۢۧۦ"
                goto L_0x0082
            L_0x009c:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r0 = "mColumn must be in range 0-"
                r2.<init>(r0)
                java.lang.String r0 = "ۤۡۥۜۧۖۘۡۧۥۘۙۦۧۘۧۥۗ"
                r3 = r2
                goto L_0x0006
            L_0x00a8:
                int r0 = com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView.H
                int r0 = r0 + -1
                r3.append(r0)
                java.lang.String r0 = "ۧۡۧۘۜۡۖۘۦ۬ۗۜۧۖۦۗۖۚۨۘۚۗۦۘۗۘۤ"
                goto L_0x0006
            L_0x00b3:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r3.toString()
                r0.<init>(r1)
                throw r0
            L_0x00bd:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r0 = "mRow must be in range 0-"
                r1.<init>(r0)
                java.lang.String r0 = "ۜۘ۟ۤ۠ۖ۟۫ۘۘ۬ۦۦۘۜۜۦۘۨۧۦۘ۠ۘ۬"
                goto L_0x0006
            L_0x00c8:
                int r0 = com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView.H
                int r0 = r0 + -1
                r1.append(r0)
                java.lang.String r0 = "ۛۢۙۨۧۗۖۧۤۛۙۡ۠ۖۚ"
                goto L_0x0006
            L_0x00d3:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00dd:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView.Dot.a(int, int):void");
        }

        public static Dot of(int i2) {
            Dot of;
            synchronized (Dot.class) {
                try {
                    int i3 = PatternLockView.H;
                    of = of(i2 / i3, i2 % i3);
                } catch (Throwable th) {
                    Class<Dot> cls = Dot.class;
                    throw th;
                }
            }
            return of;
        }

        public static Dot of(int i2, int i3) {
            Dot dot;
            synchronized (Dot.class) {
                try {
                    a(i2, i3);
                    dot = f1324c[i2][i3];
                } catch (Throwable th) {
                    Class<Dot> cls = Dot.class;
                    throw th;
                }
            }
            return dot;
        }

        public int describeContents() {
            String str = "ۦۢۘۛۥۚۥۦۜۨۚۥۘۗۤۘۘۥۦۜۘۥ۟ۡۘۛۥۖۘ";
            while (true) {
                switch ((str.hashCode() ^ 153) ^ -1870973326) {
                    case -1004642699:
                        return 0;
                    case 1768152024:
                        str = "۟ۦۨۘۡۥۥۘۨۛۢۚۛۡۚۜۙۥ۠۠ۖۧ";
                        break;
                }
            }
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a8, code lost:
            r1 = "ۧۜۖۨۙ۠ۦ۟ۚۚ۫ۚۨۚۥۨۛۖۘۜ۠ۖۛۥۘۙ۟ۤ";
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r10) {
            /*
                r9 = this;
                r3 = 0
                r6 = 0
                java.lang.String r0 = "۠۠۠ۥۡۗۧ۫ۡۘ۠ۢ۫ۖۚۙۨۗۨۙۦۜ"
                r1 = r0
                r2 = r3
                r4 = r3
                r5 = r3
            L_0x0008:
                int r0 = r1.hashCode()
                r7 = 52
                r8 = -443482783(0xffffffffe590fd61, float:-8.558685E22)
                r0 = r0 ^ r7
                r0 = r0 ^ r8
                switch(r0) {
                    case -1933204716: goto L_0x001b;
                    case -1556200331: goto L_0x00ad;
                    case -1250905651: goto L_0x0045;
                    case -853104578: goto L_0x009d;
                    case -737812091: goto L_0x0098;
                    case -608161288: goto L_0x006a;
                    case -444783091: goto L_0x001f;
                    case -241186329: goto L_0x00a7;
                    case 97542934: goto L_0x003e;
                    case 743570576: goto L_0x0092;
                    case 764649389: goto L_0x0017;
                    case 1032360224: goto L_0x004b;
                    case 1296686931: goto L_0x00a3;
                    case 1707107504: goto L_0x008c;
                    default: goto L_0x0016;
                }
            L_0x0016:
                goto L_0x0008
            L_0x0017:
                java.lang.String r0 = "ۛۡۧۘ۫ۨۥۘۤۤۙۦۙۙۧۘۖۤۘۘۙۨۡ۫۠ۡ۫ۡۤ"
                r1 = r0
                goto L_0x0008
            L_0x001b:
                java.lang.String r0 = "ۢۧ۟۟۫ۨۘۚۜۦۘۦۦۢۧۗ۟ۡۥۡۦۘ"
                r1 = r0
                goto L_0x0008
            L_0x001f:
                r1 = -660527187(0xffffffffd8a127ad, float:-1.41753423E15)
                java.lang.String r0 = "۬ۙۢ۠ۙۡۘۢۤۚ۬ۜۜۘ۫ۜ۬ۧۨۨ۫ۦۖۘ"
            L_0x0024:
                int r7 = r0.hashCode()
                r7 = r7 ^ r1
                switch(r7) {
                    case -1827626455: goto L_0x003a;
                    case -880252016: goto L_0x0037;
                    case -116799499: goto L_0x00b2;
                    case 398403909: goto L_0x002d;
                    default: goto L_0x002c;
                }
            L_0x002c:
                goto L_0x0024
            L_0x002d:
                boolean r0 = r10 instanceof com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView.Dot
                if (r0 == 0) goto L_0x0034
                java.lang.String r0 = "ۖۥۙۜۥۡۖ۬۬ۘۧۥۧۖ"
                goto L_0x0024
            L_0x0034:
                java.lang.String r0 = "ۤ۟ۨۘۛۖۙۢۘۨۜۦۧ۟ۧۢۛۡۢۙۘۛ۠ۛۘۘۗۨ۠"
                goto L_0x0024
            L_0x0037:
                java.lang.String r0 = "ۗ۟ۦۢۢۗ۟ۘۚۙۤۘۘۤۙۘۘۗۘۖۘۢۙۦ"
                goto L_0x0024
            L_0x003a:
                java.lang.String r0 = "۠ۛۛۘۢۧ۠ۦۡۥۛۙ۟۬ۛ۬"
                r1 = r0
                goto L_0x0008
            L_0x003e:
                r0 = r10
                com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView$Dot r0 = (com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView.Dot) r0
                java.lang.String r1 = "ۜۘۙ۟ۥۜۖۢۛ۟۟ۜ۬۟ۙۨۘۧۖۖ۠۬ۨ۠ۜۡۘ"
                r6 = r0
                goto L_0x0008
            L_0x0045:
                int r5 = r6.f1326b
                java.lang.String r0 = "ۘ۬ۙۛۢ۟ۖۙۘۘۗۢۥۜۜۧۘ"
                r1 = r0
                goto L_0x0008
            L_0x004b:
                r1 = -1486715647(0xffffffffa7628501, float:-3.1435902E-15)
                java.lang.String r0 = "ۨ۫ۘۖۨۢۛۡۧۘۘۛۙۛۛ۟ۜۜۦۛ۟ۛ"
            L_0x0050:
                int r7 = r0.hashCode()
                r7 = r7 ^ r1
                switch(r7) {
                    case -1054355629: goto L_0x00a8;
                    case -463477555: goto L_0x0059;
                    case 145903776: goto L_0x0066;
                    case 2028974007: goto L_0x0063;
                    default: goto L_0x0058;
                }
            L_0x0058:
                goto L_0x0050
            L_0x0059:
                int r0 = r9.f1326b
                if (r0 != r5) goto L_0x0060
                java.lang.String r0 = "ۙۥ۠ۡۛۤۘۚ۠ۢ۠ۥ۬۠ۤۤۥۨ"
                goto L_0x0050
            L_0x0060:
                java.lang.String r0 = "ۚ۠ۖۥ۬ۨۡۗۦۧۗۦۘۥۖۛۜۡۖۘ۬ۜۦۘ"
                goto L_0x0050
            L_0x0063:
                java.lang.String r0 = "ۚ۠ۜۘۢ۫ۗۚ۬۫ۖۢۦۡ۬ۙ"
                goto L_0x0050
            L_0x0066:
                java.lang.String r0 = "ۙۖۦۘ۫ۖۨۘۘ۠ۖۘۙۜۖۡ۬۫۬ۘ"
                r1 = r0
                goto L_0x0008
            L_0x006a:
                r1 = 253594326(0xf1d8ad6, float:7.7674365E-30)
                java.lang.String r0 = "ۧ۬ۦۤۡۖۘ۟ۛۥۙۜ۫ۧۘۘ"
            L_0x006f:
                int r7 = r0.hashCode()
                r7 = r7 ^ r1
                switch(r7) {
                    case -1419452161: goto L_0x00a8;
                    case -655162754: goto L_0x007e;
                    case 296120252: goto L_0x0078;
                    case 1953426383: goto L_0x0087;
                    default: goto L_0x0077;
                }
            L_0x0077:
                goto L_0x006f
            L_0x0078:
                java.lang.String r0 = "ۦۡۘۘۦ۬۬ۗۢۡ۫ۨ۠۟ۡۘۙۡۦۙۡۡ"
                goto L_0x006f
            L_0x007b:
                java.lang.String r0 = "۫ۨۨۘ۟ۙۤۡ۬ۥۘۗۢۘۙۚۡۘ۠ۖۥۘۧۘ۠ۤۘ۟۟۫ۤ"
                goto L_0x006f
            L_0x007e:
                int r0 = r9.f1325a
                int r7 = r6.f1325a
                if (r0 != r7) goto L_0x007b
                java.lang.String r0 = "ۗۥۢۚۗۖۖۚۜۘۢ۫۠۟۫ۨ"
                goto L_0x006f
            L_0x0087:
                java.lang.String r0 = "ۙۖ۠ۖۗۛ۫ۜۤۢۧۘۘۨۤۜۘ۫ۘۘۖۘۙ"
                r1 = r0
                goto L_0x0008
            L_0x008c:
                r4 = 1
                java.lang.String r0 = "۠۠ۧ۫ۧۛۥۛۦ۬ۤۡۘۛۙۥۘۖ۠ۥۘۖ۬۬ۨۤۢ"
                r1 = r0
                goto L_0x0008
            L_0x0092:
                java.lang.String r0 = "ۜ۟ۖۘ۫ۙۖۤۧ۬ۙۡۤۚ۠ۨۘۗۧۦۖۢۨۘۡ۠ۥ"
                r1 = r0
                r2 = r4
                goto L_0x0008
            L_0x0098:
                java.lang.String r0 = "ۨۛۥۘۦۖۤۨۘۜۥۜۘۘۢۢ۫ۚۡۖۢۦۤۨۜۨۘ"
                r1 = r0
                goto L_0x0008
            L_0x009d:
                java.lang.String r0 = "۬۬ۥۘۛۨۡۗ۟ۦ۫ۥۦۜۢۧۙۧۦۘ"
                r1 = r0
                r2 = r3
                goto L_0x0008
            L_0x00a3:
                boolean r2 = super.equals(r10)
            L_0x00a7:
                return r2
            L_0x00a8:
                java.lang.String r0 = "ۧۜۖۨۙ۠ۦ۟ۚۚ۫ۚۨۚۥۨۛۖۘۜ۠ۖۛۥۘۙ۟ۤ"
                r1 = r0
                goto L_0x0008
            L_0x00ad:
                java.lang.String r0 = "۬۬ۥۘۛۨۡۗ۟ۦ۫ۥۦۜۢۧۙۧۦۘ"
                r1 = r0
                goto L_0x0008
            L_0x00b2:
                java.lang.String r0 = "ۤۥۥۘۤۦۖۖ۟ۛ۠ۖۘۢۘۗۥۢۜۨۢۜۘۖۘ"
                r1 = r0
                goto L_0x0008
            */
            throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView.Dot.equals(java.lang.Object):boolean");
        }

        public int getColumn() {
            String str = "ۚۗۚۦۗۙۥۨۦۚۨۥۘۦۚ۬ۗ۟۠ۚۙۨۘۤۧۘۘ";
            while (true) {
                switch ((str.hashCode() ^ 448) ^ -1221747507) {
                    case -909511322:
                        str = "ۧۤ۬ۙۥۡۘۚۛۥۘۘۖ۬۫ۖۜۘۗ۬ۜۘۡ۠ۜ";
                        break;
                    case 159965424:
                        return this.f1326b;
                }
            }
        }

        public int getId() {
            int i2 = 0;
            String str = "ۥۥۖۗۖۨۘ۟ۜۦۘۛۜۨۘ۫ۜۛۚۤ۫ۚ۠ۘۘ";
            while (true) {
                switch ((str.hashCode() ^ 518) ^ 2028400529) {
                    case -1306529355:
                        str = "۬ۥۦۘۦۡۘۛۢۡ۬ۛ۬۠ۢ۟ۚۘۖۘۙۦۦ";
                        break;
                    case 330214852:
                        return (this.f1325a * i2) + this.f1326b;
                    case 839787078:
                        i2 = PatternLockView.H;
                        str = "ۗ۬ۜۘۢ۫ۜۘۡۦۦۘۛۚۙۘ۠ۨ";
                        break;
                }
            }
        }

        public int getRow() {
            String str = "ۖ۟ۛۜۛۦ۬ۗۦۡۡۗۜۢۤ";
            while (true) {
                switch ((str.hashCode() ^ 546) ^ 748295824) {
                    case -1552849825:
                        return this.f1325a;
                    case -825374753:
                        str = "ۧۙۦۖۗۥ۬ۧۙۘۗۡۘ۫ۖۧ۟ۦۛ۠ۜۥ";
                        break;
                }
            }
        }

        public int hashCode() {
            String str = "۬ۘۡۘۜۘۡۚۦ۫ۙۦ۬ۘۛۘۘۨۘۘۘۥۥۨۘ";
            while (true) {
                switch ((str.hashCode() ^ 236) ^ 424840326) {
                    case -1125627697:
                        str = "ۘۚۖ۠۟ۜۘۗۢۚۚۨۙۥ۠۬";
                        break;
                    case -819349044:
                        return (this.f1325a * 31) + this.f1326b;
                }
            }
        }

        public String toString() {
            StringBuilder sb = null;
            String str = "ۡۚۚۤ۬ۢۗۥۗۤۥۘۚ۟۫ۨۗۡۘۧۥۙ۫ۧۙ";
            while (true) {
                switch ((str.hashCode() ^ 325) ^ 1019165487) {
                    case -1477838223:
                        sb.append(")");
                        str = "ۙۛۖۡ۠ۚ۫۠ۨۚ۫ۗۙۗۖۜۙۛۘۗ۫";
                        break;
                    case -787598282:
                        sb.append(", Col = ");
                        str = "۬ۤۙۦ۠ۤۛۧۖ۟ۗۜۘۥۘۨ۬ۘۦۛ۟ۡ";
                        break;
                    case 125897670:
                        sb.append(this.f1325a);
                        str = "۠ۜۡۘۤۤۙ۠ۦۘۚۗۨۧۘۜۚۦ۬ۙۡ";
                        break;
                    case 198811430:
                        return sb.toString();
                    case 588378477:
                        str = "ۙۧۗۛۦۨۘۖ۠ۛۛۡۦۦۨۜ۠ۘ۠ۙۥۤ۬ۨ۠۟ۨ۬";
                        break;
                    case 888020425:
                        sb.append(this.f1326b);
                        str = "ۜۢ۬۟۠ۡ۟ۖۥۨۜۤۢۦۛ";
                        break;
                    case 1438853980:
                        sb = new StringBuilder("(Row = ");
                        str = "ۨۖۨۘۚۚۙۘۧۙۖۨ۠۫ۜۜۘ";
                        break;
                }
            }
        }

        public void writeToParcel(Parcel parcel, int i2) {
            String str = "ۘۡۡۘ۠ۦۥۘۙۦۖۦ۠ۙۚۚۦۘ";
            while (true) {
                switch ((str.hashCode() ^ 949) ^ -1753138156) {
                    case -1979331545:
                        parcel.writeInt(this.f1326b);
                        str = "ۢۢۚ۬ۡۡۨۖ۬ۨۚ۟ۚ۫ۥ";
                        break;
                    case 88271634:
                        parcel.writeInt(this.f1325a);
                        str = "ۥۨۛ۟ۡۘۘ۟ۤۢۘۡۜۘۘۨۗۢ۟ۥۘۙۖۢ";
                        break;
                    case 933139191:
                        return;
                    case 990189953:
                        str = "ۦۤۜ۬ۗۢۦۜۜۘۢۗۨۘۛۛۖۘۜۢۦ۟ۜۜۘ۬ۚۧ";
                        break;
                    case 1368370816:
                        str = "۟ۤۙۜۧ۬ۧۖۦۖۘۚۢۦۢۜ۠ۦۖۜۘ";
                        break;
                    case 2041282419:
                        str = "۠ۘۡۡۙۦۗۗۦۘۨۨۦۘ۬ۧۖۘ";
                        break;
                }
            }
        }
    }

    public class DotState {

        /* renamed from: a  reason: collision with root package name */
        public final float f1327a = 1.0f;

        /* renamed from: b  reason: collision with root package name */
        public final float f1328b = 1.0f;

        /* renamed from: c  reason: collision with root package name */
        public float f1329c;

        /* renamed from: d  reason: collision with root package name */
        public float f1330d = Float.MIN_VALUE;

        /* renamed from: e  reason: collision with root package name */
        public float f1331e = Float.MIN_VALUE;

        /* renamed from: f  reason: collision with root package name */
        public ValueAnimator f1332f;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface PatternViewMode {
        public static final int AUTO_DRAW = 1;
        public static final int CORRECT = 0;
        public static final int WRONG = 2;
    }

    public PatternLockView(Context context) {
        this(context, (AttributeSet) null);
    }

    public PatternLockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1301d = 0.6f;
        this.f1317t = -1.0f;
        this.f1318u = -1.0f;
        this.f1319v = 0;
        this.f1320w = true;
        this.f1321x = false;
        this.f1322y = true;
        this.f1323z = false;
        this.C = new Path();
        this.D = new Rect();
        this.E = new Rect();
        H = 3;
        this.f1302e = true;
        this.f1303f = 0;
        this.f1307j = (int) ResourceUtils.getDimensionInPx(getContext(), yo.getID("pattern_lock_path_width", "dimen"));
        this.f1304g = ColorStore.getPrimaryTextColor();
        this.f1306i = ColorStore.getPrimaryTextColor();
        this.f1305h = Color.parseColor("#f4511e");
        this.f1308k = (int) ResourceUtils.getDimensionInPx(getContext(), yo.getID("pattern_lock_dot_size", "dimen"));
        this.f1309l = (int) ResourceUtils.getDimensionInPx(getContext(), yo.getID("pattern_lock_dot_selected_size", "dimen"));
        this.f1310m = 190;
        this.f1311n = 100;
        int i2 = H;
        this.f1299b = i2 * i2;
        this.f1315r = new ArrayList(this.f1299b);
        int i3 = H;
        this.f1316s = (boolean[][]) Array.newInstance(Boolean.TYPE, new int[]{i3, i3});
        int i4 = H;
        this.f1298a = (DotState[][]) Array.newInstance(DotState.class, new int[]{i4, i4});
        int i5 = 0;
        while (true) {
            String str = "ۚۤۖۢۨۥۖ۫۠۠ۨۗ۟ۛۨ۠ۚۛۜ۠ۥۘ";
            while (true) {
                switch (str.hashCode() ^ -466857461) {
                    case -1547871555:
                        str = "ۛۦۡ۟ۥۘۘ۠۬ۜۖ۬ۧۜۧۚ";
                        break;
                    case -178078712:
                        if (i5 >= H) {
                            str = "ۢ۫ۖ۠ۖ۫ۥۤۗۢۗۥۡ۟ۛ۠ۘۘ";
                            break;
                        } else {
                            str = "ۙۢۜۘۥۖۢۖۤۘ۬۬ۖۘۧۤۖۘۛۚۖۘۡۧۦۘۨۘۜۘ۠ۨۢ";
                            break;
                        }
                    case 514624217:
                        int i6 = 0;
                        while (true) {
                            String str2 = "ۛۢ۫ۨ۠ۖۚۛۡ۟ۧۗۜۛۜۖۘ";
                            while (true) {
                                switch (str2.hashCode() ^ -1161568326) {
                                    case -1670921716:
                                        if (i6 >= H) {
                                            str2 = "ۜۤۜۘۢ۬ۤۢۜ۠ۖۙ۠ۤۡۘۘۡۖ۠۫ۚۤ۠";
                                            break;
                                        } else {
                                            str2 = "ۖ۫ۦۥۨۥۘۗۖۚۨۦۥۘۢۖۚ۬ۤۗ";
                                            break;
                                        }
                                    case -754405649:
                                        this.f1298a[i5][i6] = new DotState();
                                        this.f1298a[i5][i6].f1329c = (float) this.f1308k;
                                        i6++;
                                    case 952053750:
                                        i5++;
                                    case 1443076644:
                                        str2 = "ۚۢۘ۬ۥ۫ۧۘ۬ۛۚۡۘۥۢۡ";
                                        break;
                                }
                            }
                        }
                        break;
                    case 1742007656:
                        this.f1314q = new ArrayList();
                        g();
                        return;
                }
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView.Dot r25) {
        /*
            r24 = this;
            r23 = 0
            r22 = 0
            r21 = 0
            r20 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r11 = 0
            r13 = 0
            r8 = 0
            r7 = 0
            r6 = 0
            r5 = 0
            r4 = 0
            java.lang.String r2 = "ۡۚۢ۫ۡۚ۠ۨ۬۬ۘۡۨ۟ۘۘۤۤۥۘۧۜۦۘ۬۫۫"
            r3 = r2
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r10
        L_0x001f:
            int r2 = r3.hashCode()
            r4 = 449(0x1c1, float:6.29E-43)
            r5 = 1873448586(0x6faa8e8a, float:1.0556954E29)
            r2 = r2 ^ r4
            r2 = r2 ^ r5
            switch(r2) {
                case -2135784832: goto L_0x01eb;
                case -2096597926: goto L_0x00d3;
                case -1906613483: goto L_0x0149;
                case -1720897130: goto L_0x0169;
                case -1548157872: goto L_0x017d;
                case -1477559064: goto L_0x012c;
                case -1435238074: goto L_0x0196;
                case -1225216850: goto L_0x004a;
                case -938283576: goto L_0x0070;
                case -863825282: goto L_0x0188;
                case -833540983: goto L_0x0036;
                case -621989008: goto L_0x0095;
                case -614637682: goto L_0x00f6;
                case -485264169: goto L_0x00c8;
                case -401160206: goto L_0x01b8;
                case -340591513: goto L_0x01f5;
                case -152527292: goto L_0x002e;
                case -150526148: goto L_0x0052;
                case -40855449: goto L_0x0151;
                case 56092776: goto L_0x015a;
                case 63306265: goto L_0x01e1;
                case 133668288: goto L_0x01c3;
                case 549558519: goto L_0x0063;
                case 571483986: goto L_0x00e9;
                case 639921877: goto L_0x00dc;
                case 1638438083: goto L_0x013a;
                case 1661771074: goto L_0x011a;
                case 1882986937: goto L_0x005c;
                case 1898481112: goto L_0x0032;
                case 2036115495: goto L_0x0040;
                case 2075849865: goto L_0x0107;
                case 2106211125: goto L_0x00a2;
                default: goto L_0x002d;
            }
        L_0x002d:
            goto L_0x001f
        L_0x002e:
            java.lang.String r2 = "ۨۜ۬ۚۘ۫ۢۨۨۗۙۘۧۧ۠ۦۢ"
            r3 = r2
            goto L_0x001f
        L_0x0032:
            java.lang.String r2 = "ۛۖۖ۫ۜ۟ۦۡۘۜۛۧ۟ۥ۟ۧۧۙ۟ۛۘۘۦۦ۟ۗ۫ۛ"
            r3 = r2
            goto L_0x001f
        L_0x0036:
            r0 = r24
            boolean[][] r4 = r0.f1316s
            java.lang.String r2 = "ۛۨۡۜۚۜۥۖۤ۫ۨ۟۠ۥۢۗۙۡۘۛ۠۬ۛۛ۠ۚ۠ۨۘ"
            r3 = r2
            r23 = r4
            goto L_0x001f
        L_0x0040:
            r0 = r25
            int r4 = r0.f1325a
            java.lang.String r2 = "ۙ۬ۦۘۙۚۨۥۚۛۨۤۚۡۡۘۚ۠ۘۥۜۖۨۢ"
            r3 = r2
            r22 = r4
            goto L_0x001f
        L_0x004a:
            r4 = r23[r22]
            java.lang.String r2 = "ۗۙۤۢۘۚۥۛ۬۠ۦۧۚ۠ۘۖۘۚۛۚۨ۫ۡۤۦۢ۫"
            r3 = r2
            r21 = r4
            goto L_0x001f
        L_0x0052:
            r0 = r25
            int r4 = r0.f1326b
            java.lang.String r2 = "ۡۖۘۘۢۜ۬ۡۤۜ۟۫ۚۜۙۗۤ۠ۤۨ۫ۖۘۧۘۨ"
            r3 = r2
            r20 = r4
            goto L_0x001f
        L_0x005c:
            r2 = 1
            r21[r20] = r2
            java.lang.String r2 = "ۡۡۘۘ۠ۦۗۡۦۨۘۛۘۛۘۜۘ"
            r3 = r2
            goto L_0x001f
        L_0x0063:
            r0 = r24
            java.util.ArrayList r2 = r0.f1315r
            r0 = r25
            r2.add(r0)
            java.lang.String r2 = "ۜۘ۬۬۟۟ۖۤۦۙ۫ۜۘۖۨۖۘۢۢۛ۬ۘۖۡۗ"
            r3 = r2
            goto L_0x001f
        L_0x0070:
            r3 = -1405845756(0xffffffffac347f04, float:-2.5650046E-12)
            java.lang.String r2 = "ۗۢۚۜۚۢۡۜۖۚۨۜۧۘۤ"
        L_0x0075:
            int r4 = r2.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case -1471382390: goto L_0x007e;
                case 688585354: goto L_0x008e;
                case 791866445: goto L_0x0091;
                case 2012730671: goto L_0x0085;
                default: goto L_0x007d;
            }
        L_0x007d:
            goto L_0x0075
        L_0x007e:
            java.lang.String r2 = "۫ۖۧۘۘۢۦ۬ۢۡۘۖۧۙۤۨ۬ۜۦۚ"
            r3 = r2
            goto L_0x001f
        L_0x0082:
            java.lang.String r2 = "۬ۜۘۥۘۡ۬ۜۢۢۦۡۦۨۖۘۖۖۙۛ۫ۦۥ۟ۖۘ"
            goto L_0x0075
        L_0x0085:
            r0 = r24
            boolean r2 = r0.f1321x
            if (r2 != 0) goto L_0x0082
            java.lang.String r2 = "ۘۜۘۘۡۘۜۘۛۚۗ۬۬ۚۜ۟ۦۘ"
            goto L_0x0075
        L_0x008e:
            java.lang.String r2 = "ۤۜۙ۠ۧ۟ۖۙۘۘۚۢ۟ۖۥۜۛ۟ۦۘۧۚۥۘ۫ۧۜۘۢۧۘۘ"
            goto L_0x0075
        L_0x0091:
            java.lang.String r2 = "ۗۙۛۦۛۙۡۛۛۚۦ۫ۧ۠ۛۥۨۘۥۦۘ"
            r3 = r2
            goto L_0x001f
        L_0x0095:
            r0 = r24
            com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView$DotState[][] r2 = r0.f1298a
            r2 = r2[r22]
            r9 = r2[r20]
            java.lang.String r2 = "ۢۡۧۘۡۜۖۡ۬ۘۛۦۧۢۖۘ۬ۡ۠ۤۛۖ"
            r3 = r2
            goto L_0x001f
        L_0x00a2:
            r0 = r24
            int r2 = r0.f1308k
            float r4 = (float) r2
            r0 = r24
            int r2 = r0.f1309l
            float r5 = (float) r2
            r0 = r24
            int r2 = r0.f1310m
            long r6 = (long) r2
            r0 = r24
            android.view.animation.Interpolator r8 = r0.G
            com.obwhatsapp.yo.p r10 = new com.obwhatsapp.yo.p
            r2 = 8
            r0 = r24
            r10.<init>(r0, r9, r2)
            r3 = r24
            r3.j(r4, r5, r6, r8, r9, r10)
            java.lang.String r2 = "ۥ۟۫ۛۖۢ۠ۗ۬ۛۛۦ۠ۗۚ"
            r3 = r2
            goto L_0x001f
        L_0x00c8:
            r0 = r24
            float r4 = r0.f1317t
            java.lang.String r2 = "ۥۧۡ۫ۥ۫۬ۛۡۘۙ۟ۗ۟ۖۗۗ۟۠"
            r3 = r2
            r19 = r4
            goto L_0x001f
        L_0x00d3:
            r0 = r24
            float r12 = r0.f1318u
            java.lang.String r2 = "ۤۙ۫ۗۗۜۘۦ۠ۜۘۨ۫ۡ۫ۘۨۥۧۤۧۗۦۘۛۗۦۘۜ۫ۖۘ"
            r3 = r2
            goto L_0x001f
        L_0x00dc:
            r0 = r24
            r1 = r20
            float r11 = r0.d(r1)
            java.lang.String r2 = "ۖ۟۟ۙۙۘۛ۟ۡۘۙۦۖۙۦ"
            r3 = r2
            goto L_0x001f
        L_0x00e9:
            r0 = r24
            r1 = r22
            float r13 = r0.e(r1)
            java.lang.String r2 = "ۗۖۨۧۖۘۘۛۤۜۘۧۧۦۘ۬ۜۛ۠۫ۖۤ۫ۥ۟ۦۛۥۥ"
            r3 = r2
            goto L_0x001f
        L_0x00f6:
            r2 = 2
            float[] r2 = new float[r2]
            r2 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r4 = android.animation.ValueAnimator.ofFloat(r2)
            java.lang.String r2 = "ۢۗۧۚ۟ۤ۫ۡۢ۬۟ۜۡۜۜۘۜۚۡ"
            r3 = r2
            r18 = r4
            goto L_0x001f
        L_0x0107:
            p.a r7 = new p.a
            r8 = r24
            r10 = r19
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r0 = r18
            r0.addUpdateListener(r7)
            java.lang.String r2 = "ۡۡۚۥۦۜۘۖۥۡۘۦۚۖۘۧۘۘۡ۠ۜۖۧۦۘۨۛۨ"
            r3 = r2
            goto L_0x001f
        L_0x011a:
            p.b r2 = new p.b
            r3 = 0
            r0 = r24
            r2.<init>(r0, r9, r3)
            r0 = r18
            r0.addListener(r2)
            java.lang.String r2 = "ۚ۟ۚۖۗۗ۫ۥ۟۬ۡۤ۫ۥۖۖ۫۫ۛۧۖۡۖ۟ۚۥۥۘ"
            r3 = r2
            goto L_0x001f
        L_0x012c:
            r0 = r24
            android.view.animation.Interpolator r2 = r0.F
            r0 = r18
            r0.setInterpolator(r2)
            java.lang.String r2 = "ۢۢۘۘۥۛۧ۬ۦۦۘۤۘۙ۟ۜۙ۠ۤۧ۫ۗۨ۟ۢۘ"
            r3 = r2
            goto L_0x001f
        L_0x013a:
            r0 = r24
            int r2 = r0.f1311n
            long r2 = (long) r2
            r0 = r18
            r0.setDuration(r2)
            java.lang.String r2 = "ۥۥۖۦۗۦۘۡۧۥۘۧۗۨۘۤۜۨ"
            r3 = r2
            goto L_0x001f
        L_0x0149:
            r18.start()
            java.lang.String r2 = "ۛۤ۠ۡۡۚ۠ۘ۟ۘۦۘ۬ۖۚۚ۟ۤۡۢۜۘۘۜ۬ۢۘ"
            r3 = r2
            goto L_0x001f
        L_0x0151:
            r0 = r18
            r9.f1332f = r0
            java.lang.String r2 = "۫ۖۧۘۘۢۦ۬ۢۡۘۖۧۙۤۨ۬ۜۦۚ"
            r3 = r2
            goto L_0x001f
        L_0x015a:
            java.lang.String r2 = "yoShareSbj"
            java.lang.String r3 = "string"
            int r4 = com.obwhatsapp.yo.yo.getID(r2, r3)
            java.lang.String r2 = "ۜۛۙۨ۟۟ۢۛۡۘۜۖۡۙۛۛۨۢۥۘ"
            r3 = r2
            r17 = r4
            goto L_0x001f
        L_0x0169:
            android.content.Context r2 = r24.getContext()
            r0 = r17
            java.lang.String r2 = r2.getString(r0)
            r0 = r24
            r0.announceForAccessibility(r2)
            java.lang.String r2 = "ۜ۟ۧۨۚۙۙۘ۠ۡۖۡۖۢۜۙۙۤۜۡ۠ۙۥۤ۬ۨ"
            r3 = r2
            goto L_0x001f
        L_0x017d:
            r0 = r24
            java.util.ArrayList r4 = r0.f1315r
            java.lang.String r2 = "ۙ۠۬ۡۚۨۤۢ۠ۡۤۜۘۚۧۙۤۤۘۘ"
            r3 = r2
            r16 = r4
            goto L_0x001f
        L_0x0188:
            r0 = r24
            java.util.ArrayList r2 = r0.f1314q
            java.util.Iterator r4 = r2.iterator()
            java.lang.String r2 = "ۡۨۗۘۧ۫ۨۜۦۘ۫ۖۛۧۜۨۘۖ۠ۚ"
            r3 = r2
            r15 = r4
            goto L_0x001f
        L_0x0196:
            r3 = -564690772(0xffffffffde5780ac, float:-3.88215016E18)
            java.lang.String r2 = "ۥۤ۫ۦۗۨۘۡۤ۬ۦۖۜۘۙۥ"
        L_0x019b:
            int r4 = r2.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case -1886067005: goto L_0x01b3;
                case -1777537007: goto L_0x01b0;
                case -782856840: goto L_0x01a4;
                case -414155030: goto L_0x01f0;
                default: goto L_0x01a3;
            }
        L_0x01a3:
            goto L_0x019b
        L_0x01a4:
            boolean r2 = r15.hasNext()
            if (r2 == 0) goto L_0x01ad
            java.lang.String r2 = "ۥۖۖۡۙۥۥۨۙۛ۠ۢ۫ۦۡۘۢۘۧۦۨ۟ۥۘۜۘۙ"
            goto L_0x019b
        L_0x01ad:
            java.lang.String r2 = "۫ۢ۬ۖۢۘۘۢ۫۬ۖ۠۟ۧۢۜ۠ۘ"
            goto L_0x019b
        L_0x01b0:
            java.lang.String r2 = "۬ۤۢۦ۬۟ۚۖۙۚۢۗۨۨۦ۠ۦۚ"
            goto L_0x019b
        L_0x01b3:
            java.lang.String r2 = "۬ۚۚۜ۠ۜۥۧۘۚۧۥۘۢۖۘۘۨۙۨ"
            r3 = r2
            goto L_0x001f
        L_0x01b8:
            java.lang.Object r2 = r15.next()
            com.obwhatsapp.youbasha.ui.lockV2.patternlockview.listener.PatternLockViewListener r2 = (com.obwhatsapp.youbasha.ui.lockV2.patternlockview.listener.PatternLockViewListener) r2
            java.lang.String r3 = "ۜۨۚ۟ۦۘۘۗ۬ۡۘۦۦ۟ۢۨۗۤۛۨۘۙۦۛۜۡۗ۬ۢ۟"
            r14 = r2
            goto L_0x001f
        L_0x01c3:
            r3 = -1774766700(0xffffffff96373594, float:-1.4799529E-25)
            java.lang.String r2 = "ۧ۠ۜۙۤۜ۫ۨۖۘ۠ۦۧۘ۟ۜۖۘ۟۠ۥۘۗۥۢ"
        L_0x01c8:
            int r4 = r2.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case -1122622672: goto L_0x01d9;
                case -444826174: goto L_0x01eb;
                case 1159939049: goto L_0x01d1;
                case 1942020446: goto L_0x01dc;
                default: goto L_0x01d0;
            }
        L_0x01d0:
            goto L_0x01c8
        L_0x01d1:
            if (r14 == 0) goto L_0x01d6
            java.lang.String r2 = "ۚۙۘۜۢۜۘۧۥۘ۫ۘۥۢۢۥۘۗ۬ۙۚۤۦ"
            goto L_0x01c8
        L_0x01d6:
            java.lang.String r2 = "۬ۡ۬ۧۢۜۙۛۜۜۖۥۤ۫ۨۜۛ۟ۗۗۜۘ"
            goto L_0x01c8
        L_0x01d9:
            java.lang.String r2 = "ۦۡۥۦۢۡۘۛ۠ۚۤۧۡ۫۟۬ۥۧ۬ۤۨۜۘۢ"
            goto L_0x01c8
        L_0x01dc:
            java.lang.String r2 = "ۨۦۨ۟ۢۤ۫۬ۚۡۨۖۤۘۧۘ"
            r3 = r2
            goto L_0x001f
        L_0x01e1:
            r0 = r16
            r14.onProgress(r0)
            java.lang.String r2 = "ۖۗ۬۟ۚۖۘۥۜۤۡۤۘۘۘۦۥۘ۬۠ۨ"
            r3 = r2
            goto L_0x001f
        L_0x01eb:
            java.lang.String r2 = "ۡۨۗۘۧ۫ۨۜۦۘ۫ۖۛۧۜۨۘۖ۠ۚ"
            r3 = r2
            goto L_0x001f
        L_0x01f0:
            java.lang.String r2 = "ۜۥ۫ۧۢ۫۟ۘۖۙۚۙۢۖۗۤۖۘۛۢ۟"
            r3 = r2
            goto L_0x001f
        L_0x01f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView.a(com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView$Dot):void");
    }

    public void addPatternLockListener(PatternLockViewListener patternLockViewListener) {
        String str = "ۤۡۢۥۘ۠ۤۛۨۘۨۡۙۡۥۡۘۛ۬ۖۘۤۘۢ";
        while (true) {
            switch ((str.hashCode() ^ 545) ^ -1849386440) {
                case -1587256820:
                    this.f1314q.add(patternLockViewListener);
                    str = "ۢۨۘۜۜۙۥۨۜۘۦ۠ۦۘۧۜۧۘۙۥۚۙۘۦۘۧۡۡۘۜۨۚ";
                    break;
                case -270391434:
                    str = "۠ۥۦۚۛۛ۫ۗ۠ۢۖۖ۫۫ۖۘ";
                    break;
                case -248206961:
                    return;
                case 309696528:
                    str = "ۧ۠ۜۥۡۡۘۙۛۙۢۜۘۢۜۧۘۨۦۛۡۤۥۘۧۙۡۦۨۛ";
                    break;
            }
        }
    }

    public final void b() {
        String str = "۠ۖۦۘۦۗۚۜۤۙۘۦ۟ۢۙۦۘ۠ۦۦۘۡۘۘۤۨۜۥۘ";
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            switch ((str.hashCode() ^ 101) ^ -1400139968) {
                case -2100663456:
                    return;
                case -1765451689:
                    str = "ۙۖۡۦۘۛۦ۠۟ۡۜۤ۬ۜۖۦۘۤ";
                    break;
                case -1519430895:
                    str = "ۥۚۨۘ۠ۖۘۛ۫ۖۘۢ۫۬ۤۧۧۢ۟ۗۛۜ";
                    i5 = i2;
                    break;
                case -1472546363:
                    str = "ۛۙۢۤۘۗ۟ۨ۠ۖۤۘۘ۫۫۟ۤۤۖ۫۟ۚۥ۬ۜۘۗۡ۟";
                    break;
                case -1357314508:
                    i3 = i4 + 1;
                    str = "ۦۛۨۧۡۥ۟ۤۧۤۖۢۙۛۗۛ۬ۗۘۙۥ";
                    break;
                case -893692306:
                    str = "ۥ۟ۥۘ۫۬ۡۖۥۡ۬ۜۧۘۨۧۨۘۙ۬ۥۘ";
                    break;
                case -527386928:
                    str = "ۛۙۢۤۘۗ۟ۨ۠ۖۤۘۘ۫۫۟ۤۤۖ۫۟ۚۥ۬ۜۘۗۡ۟";
                    i4 = 0;
                    break;
                case -521275755:
                    str = "ۗۗۛۢۨۧۨۖ۬۟ۨۜۧۥۨۘ";
                    break;
                case 382406504:
                    str = "ۦۤۜۘۘۙ۫ۧۜۧۨۛۨۘ۬ۖۧۙۡ۠";
                    i4 = i3;
                    break;
                case 455651916:
                    str = "ۥ۟ۥۘ۫۬ۡۖۥۡ۬ۜۧۘۨۧۨۘۙ۬ۥۘ";
                    i5 = 0;
                    break;
                case 789547119:
                    i2 = i5 + 1;
                    str = "ۧۖۥۢۙۦۘۢ۫ۢۗ۠ۡۖۚۖ";
                    break;
                case 985388393:
                    str = "ۤۛ۟ۛ۬ۡۘۜۡۧۘۙۤۦۥۢۢۡۧۦۘ۟ۨۡ";
                    break;
                case 1522714860:
                    String str2 = "ۗۚ۬ۨ۫ۡۘ۬ۗۨۧۙۥ۫ۙۥۘۥۨۢ۠ۨۨۙ۠ۡۘۘۙۨۘ";
                    while (true) {
                        switch (str2.hashCode() ^ -153797291) {
                            case -1704105012:
                                str = "۬ۦ۬۫۟ۢۨۙ۬ۖۢ۟ۢۛ۫۫ۛ۟ۧۦۧۘۤۥ۬";
                                continue;
                            case -1490935892:
                                str2 = "ۦۧۘۗ۟ۖۘۧۤۨ۬ۥۘۘ۠ۢۥۘۡۤۢۘۗۤ";
                                break;
                            case -810585697:
                                if (i4 >= H) {
                                    str2 = "ۡۧۚ۬۠۬ۢۤۡۥ۫ۖۘۢ۟ۙ";
                                    break;
                                } else {
                                    str2 = "ۡۤۖۘۨۜۖۘۧۗۤ۬۫ۡۘۚ۟ۛۖۥۡۘۛۡۙۘۥ۬";
                                    break;
                                }
                            case 1874526443:
                                str = "۟ۨۧ۟ۗۨۖ۟ۖۜۦۥۜۤ";
                                continue;
                        }
                    }
                    break;
                case 1805073040:
                    String str3 = "ۥۘۨۘۨ۫ۨۧۙۤۦۙۗۦۦۦۘۙۙۥۘ۫ۨۥۘۥ۠۟ۦ۬ۦ";
                    while (true) {
                        switch (str3.hashCode() ^ 1086704323) {
                            case -771362592:
                                str = "۬ۥۧۘۤۙۨۧ۫ۡ۟ۘۘۖۜۧۛ۬ۦۘۘۚۡۘ";
                                continue;
                            case -168823642:
                                if (i5 >= H) {
                                    str3 = "ۘ۠ۛۛۨۡۘ۠۠ۨ۫ۜۨۚۗۤ";
                                    break;
                                } else {
                                    str3 = "۟ۚۥۗۢۡۘۡۗۙۥۤ۫ۗۖۥ";
                                    break;
                                }
                            case 125649314:
                                str = "ۥۘۤۘۖ۟ۧۜۧۘۧۧۘۦۤۨۘۥۘۖۘ";
                                continue;
                            case 1288940434:
                                str3 = "ۡۖۢۧ۟ۖۥۤۡۘۢۨ۫ۡۖۨۨۨۘ";
                                break;
                        }
                    }
                    break;
                case 2050045101:
                    this.f1316s[i5][i4] = false;
                    str = "ۙ۫ۤۧۗۤۙۖۧۜ۬ۘ۫ۡۧۛۡۦۘۙۡۘۘ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x04aa, code lost:
        r3 = "ۦۙۨۛ۫ۛۢۨۛۢۛۡ۠ۛۜۘۘۗۜۘۢۦۥۧ۫ۨ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x055a, code lost:
        r3 = "ۧۨۨۘۗۦۦۘۡۤۜۘۚۤ۟ۚۘۦ۬ۖۚ۟ۨ۫";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x057d, code lost:
        r3 = "ۧۖۛۛۤۘۘ۫۠ۙۙ۫ۘۘۘۡۜۗۨۧۜ۟ۥ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0582, code lost:
        r3 = "ۛۖ۬ۡۖۧۘ۟ۧۗۢۥۢۗۙۜۥۘۘۘۚۦۖ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x011a, code lost:
        r3 = "ۦۗۤۥۙ۬۠ۨۨۨۘۢ۟ۗۦۘۜۡۥ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView.Dot c(float r52, float r53) {
        /*
            r51 = this;
            r48 = 0
            r47 = 0
            r46 = 0
            r45 = 0
            r44 = 0
            r30 = 0
            r43 = 0
            r42 = 0
            r8 = 0
            r41 = 0
            r38 = 0
            r40 = 0
            r37 = 0
            r39 = 0
            r22 = 0
            r36 = 0
            r34 = 0
            r33 = 0
            r32 = 0
            r31 = 0
            r29 = 0
            r26 = 0
            r28 = 0
            r25 = 0
            r27 = 0
            r24 = 0
            r35 = 0
            r23 = 0
            r20 = 0
            r16 = 0
            r19 = 0
            r18 = 0
            r10 = 0
            r17 = 0
            r14 = 0
            r12 = 0
            r13 = 0
            r11 = 0
            r15 = 0
            r6 = 0
            r7 = 0
            r5 = 0
            r9 = 0
            r4 = 0
            r21 = 0
            java.lang.String r2 = "ۜۚۙۜۙۤۗۘۘۦۡۧۨ۫ۥۦۢۡۘ۫ۥۤۘۖۜۖۥ۟"
            r3 = r2
        L_0x0051:
            int r2 = r3.hashCode()
            r49 = 729(0x2d9, float:1.022E-42)
            r50 = 1773161466(0x69b04bfa, float:2.6641217E25)
            r2 = r2 ^ r49
            r2 = r2 ^ r50
            switch(r2) {
                case -2051167906: goto L_0x047e;
                case -2031745396: goto L_0x0066;
                case -2018760337: goto L_0x0195;
                case -1939204931: goto L_0x03ee;
                case -1883616413: goto L_0x041b;
                case -1842646068: goto L_0x01dd;
                case -1797559321: goto L_0x006a;
                case -1774564794: goto L_0x0564;
                case -1735948321: goto L_0x0351;
                case -1703250374: goto L_0x023d;
                case -1694644092: goto L_0x053c;
                case -1631274353: goto L_0x02e2;
                case -1611543255: goto L_0x0578;
                case -1606655651: goto L_0x029d;
                case -1577020071: goto L_0x0478;
                case -1556593603: goto L_0x054b;
                case -1523862517: goto L_0x00b5;
                case -1507130169: goto L_0x050a;
                case -1501540384: goto L_0x049b;
                case -1485905513: goto L_0x017c;
                case -1438321746: goto L_0x0271;
                case -1406408151: goto L_0x0141;
                case -1339061717: goto L_0x018a;
                case -1325754415: goto L_0x00af;
                case -1323715592: goto L_0x022f;
                case -1304512607: goto L_0x02d0;
                case -1211024977: goto L_0x03c5;
                case -1172298501: goto L_0x015d;
                case -1125148203: goto L_0x0236;
                case -1110975814: goto L_0x009d;
                case -1102331682: goto L_0x0319;
                case -1082624052: goto L_0x0078;
                case -1046447998: goto L_0x044e;
                case -1009280414: goto L_0x0088;
                case -996269149: goto L_0x01a8;
                case -984998867: goto L_0x03a6;
                case -958265042: goto L_0x0082;
                case -944029787: goto L_0x0472;
                case -762847903: goto L_0x0148;
                case -633169493: goto L_0x0062;
                case -627849344: goto L_0x0539;
                case -616926987: goto L_0x04bf;
                case -581506211: goto L_0x02b1;
                case -565553212: goto L_0x01eb;
                case -560822157: goto L_0x0093;
                case -499909241: goto L_0x0244;
                case -482402672: goto L_0x02db;
                case -466949509: goto L_0x014f;
                case -464707193: goto L_0x048b;
                case -429137796: goto L_0x013a;
                case -412686161: goto L_0x052d;
                case -367528462: goto L_0x037f;
                case -367476764: goto L_0x00a3;
                case -356201882: goto L_0x03f4;
                case -149342135: goto L_0x00a9;
                case -10245553: goto L_0x0343;
                case 50209889: goto L_0x034a;
                case 85751642: goto L_0x0378;
                case 126019546: goto L_0x0183;
                case 176593779: goto L_0x03d7;
                case 253969925: goto L_0x0421;
                case 262854874: goto L_0x0555;
                case 263116244: goto L_0x010b;
                case 303501448: goto L_0x0546;
                case 361668388: goto L_0x0448;
                case 391689756: goto L_0x04f2;
                case 455569840: goto L_0x033a;
                case 570841175: goto L_0x00dc;
                case 572210106: goto L_0x03cb;
                case 600073693: goto L_0x04fe;
                case 673077569: goto L_0x0133;
                case 696724891: goto L_0x0305;
                case 741029527: goto L_0x01ba;
                case 743233326: goto L_0x03e8;
                case 753128809: goto L_0x0324;
                case 763814079: goto L_0x02aa;
                case 917626060: goto L_0x006e;
                case 1061401647: goto L_0x056e;
                case 1107805520: goto L_0x019c;
                case 1141972428: goto L_0x024b;
                case 1360677272: goto L_0x053b;
                case 1483690567: goto L_0x0485;
                case 1498346335: goto L_0x054b;
                case 1539482142: goto L_0x020c;
                case 1707326367: goto L_0x00ea;
                case 1709664561: goto L_0x0252;
                case 1799425825: goto L_0x01b3;
                case 1864837326: goto L_0x00ba;
                case 1954527986: goto L_0x03d1;
                case 2016595040: goto L_0x0494;
                case 2037249937: goto L_0x0156;
                case 2058010286: goto L_0x03dd;
                case 2127777848: goto L_0x032f;
                default: goto L_0x0061;
            }
        L_0x0061:
            goto L_0x0051
        L_0x0062:
            java.lang.String r2 = "ۜۖ۬ۡ۬ۡۘۙ۫ۡۘ۬ۛۥۦۗۚۢ۟ۦۚۢۤۘ۫۬۠ۖۛ"
            r3 = r2
            goto L_0x0051
        L_0x0066:
            java.lang.String r2 = "ۥۗۦ۠۟۬ۥۦۘۖ۠ۦۘۨۧۖۘۡۨۦ"
            r3 = r2
            goto L_0x0051
        L_0x006a:
            java.lang.String r2 = "ۢۧۚۙۚۨۚۗۢۖۧۡ۠۟۠ۘ۫ۦ"
            r3 = r2
            goto L_0x0051
        L_0x006e:
            r0 = r51
            float r0 = r0.B
            r48 = r0
            java.lang.String r2 = "ۨۨ۟ۚۛ۠۟ۡۢۥۡ۠ۙۚۧ۠ۗ۬ۡۖۖۙۤۨۘۜ۫ۧ"
            r3 = r2
            goto L_0x0051
        L_0x0078:
            r0 = r51
            float r0 = r0.f1301d
            r47 = r0
            java.lang.String r2 = "۠ۗۖ۫ۦ۠ۙۙ۟ۗۗۙۗۧۥۗ۠ۘ۟ۦ۫ۛۦۢ"
            r3 = r2
            goto L_0x0051
        L_0x0082:
            float r46 = r47 * r48
            java.lang.String r2 = "ۧۧۜۘۙۛۦۘ۫ۢۜ۟ۘۧۡۤ۠ۖ۟ۖۙۢۗ۠ۙ۟"
            r3 = r2
            goto L_0x0051
        L_0x0088:
            int r2 = r51.getPaddingTop()
            float r0 = (float) r2
            r45 = r0
            java.lang.String r2 = "۫ۚۖۘۨۡۘۘ۫۟۟ۖۤۚۛ۬ۜۨۙۥ۬۬ۜۘ"
            r3 = r2
            goto L_0x0051
        L_0x0093:
            float r2 = r48 - r46
            r3 = 1073741824(0x40000000, float:2.0)
            float r44 = r2 / r3
            java.lang.String r2 = "ۘۦۡۘۡۜۗ۟ۜۥۘۤۖۨۖۙۥۘۚ۫۬ۖۦۥۘ"
            r3 = r2
            goto L_0x0051
        L_0x009d:
            r30 = 0
            java.lang.String r2 = "۬ۧۖ۠ۜۖۜۛۧۘۡۧۖۨ"
            r3 = r2
            goto L_0x0051
        L_0x00a3:
            r43 = 0
            java.lang.String r2 = "ۢ۠ۖۘ۬ۙۢۗۛ۠ۜۥۜۘۤ۫۟ۤ۫ۜۘۙۘۥۘۨۛۤۧۥۘ"
            r3 = r2
            goto L_0x0051
        L_0x00a9:
            java.lang.String r2 = "ۢۘۨۦۤۛۥۢۡۤۖۖ۠ۘۥۘۚۘۜۚۘۘ"
            r3 = r2
            r40 = r43
            goto L_0x0051
        L_0x00af:
            int r42 = H
            java.lang.String r2 = "ۦۘۨ۠ۨۦۘۡۡۨۘ۟ۨۚ۫۬ۚ"
            r3 = r2
            goto L_0x0051
        L_0x00b5:
            r8 = -1
            java.lang.String r2 = "ۘ۬۬۟ۥۥۘۧۤ۬ۛۢۙۥ۠ۦۘ۫ۘۙۥۛۙ۫ۖۛۗ۬"
            r3 = r2
            goto L_0x0051
        L_0x00ba:
            r3 = -736973113(0xffffffffd412aec7, float:-2.51999001E12)
            java.lang.String r2 = "ۗۜۧۦۡ۟ۦ۬ۢۧۦۙۚۧۥۘۙۨۘۘۜۥۤ"
        L_0x00bf:
            int r49 = r2.hashCode()
            r49 = r49 ^ r3
            switch(r49) {
                case -267152679: goto L_0x00d9;
                case 1600342349: goto L_0x00c9;
                case 1761568683: goto L_0x0541;
                case 2063161259: goto L_0x00d0;
                default: goto L_0x00c8;
            }
        L_0x00c8:
            goto L_0x00bf
        L_0x00c9:
            java.lang.String r2 = "۠۟ۤۙۙۥۘۦۦۘۖۦۘۘۛۢ۫"
            r3 = r2
            goto L_0x0051
        L_0x00cd:
            java.lang.String r2 = "ۚۦۜۘۚ۫ۗۦۛۘۡۢۧۗۦۧۘۗۢۘۘۥۥ"
            goto L_0x00bf
        L_0x00d0:
            r0 = r40
            r1 = r42
            if (r0 >= r1) goto L_0x00cd
            java.lang.String r2 = "۬ۙۜۘ۠ۡۖۢۨ۫ۡۨۗۥۡۜۤۜۦۛۡۥۘ"
            goto L_0x00bf
        L_0x00d9:
            java.lang.String r2 = "ۢۦ۬ۤ۠ۧۛ۟ۖۢۧۨۘ۟۠ۡۘۨۛۙۖۗۘۗۢۢ"
            goto L_0x00bf
        L_0x00dc:
            r0 = r40
            float r2 = (float) r0
            float r2 = r2 * r48
            float r3 = r44 + r45
            float r41 = r2 + r3
            java.lang.String r2 = "ۚۚۘۘۚۢۖۘۡۨۦۘ۬ۧۡۘۨۙۜ۫ۚۨۘۚۢۙ"
            r3 = r2
            goto L_0x0051
        L_0x00ea:
            r3 = -805617451(0xffffffffcffb40d5, float:-8.4306601E9)
            java.lang.String r2 = "ۖۧۦۡۧۢۦ۬ۨۘۖۢۦۛۥۢۙۤۨۘ۟ۙۛ"
        L_0x00ef:
            int r49 = r2.hashCode()
            r49 = r49 ^ r3
            switch(r49) {
                case -2125342395: goto L_0x0108;
                case 893604637: goto L_0x00f9;
                case 1245411710: goto L_0x0101;
                case 1250356117: goto L_0x011a;
                default: goto L_0x00f8;
            }
        L_0x00f8:
            goto L_0x00ef
        L_0x00f9:
            java.lang.String r2 = "ۥۜۛ۟ۖۜۦۜۡۙۧۙۥۦۘۦ۬۟ۧۜۘ۠۫ۢ"
            r3 = r2
            goto L_0x0051
        L_0x00fe:
            java.lang.String r2 = "ۚ۫ۖۘۚ۫ۤۦۗۤۨۤۦۨۨۗ"
            goto L_0x00ef
        L_0x0101:
            int r2 = (r53 > r41 ? 1 : (r53 == r41 ? 0 : -1))
            if (r2 < 0) goto L_0x00fe
            java.lang.String r2 = "ۜۙۥۢۜۨۢ۫ۦ۫۫ۥۛ۫ۤۘۛۥۙۡۘۘ۫۟ۨ"
            goto L_0x00ef
        L_0x0108:
            java.lang.String r2 = "ۛ۠۠ۥۗۦۨۥۡ۬ۢ۟ۡۗۜۘۖۗۙۗۢۖۘۛۖۦۘۢۖۦۘ"
            goto L_0x00ef
        L_0x010b:
            r3 = -972768532(0xffffffffc604baec, float:-8494.73)
            java.lang.String r2 = "ۙۙۙ۟ۤۖۘۢ۫۠ۤۛۧ۬ۤۥۘ۠ۗۘۘۘۛۨۙۡۡۗۛۚ"
        L_0x0110:
            int r49 = r2.hashCode()
            r49 = r49 ^ r3
            switch(r49) {
                case -2114467882: goto L_0x012b;
                case -1501964869: goto L_0x011a;
                case 56497184: goto L_0x012e;
                case 1261483147: goto L_0x0122;
                default: goto L_0x0119;
            }
        L_0x0119:
            goto L_0x0110
        L_0x011a:
            java.lang.String r2 = "ۦۗۤۥۙ۬۠ۨۨۨۘۢ۟ۗۦۘۜۡۥ"
            r3 = r2
            goto L_0x0051
        L_0x011f:
            java.lang.String r2 = "ۢ۠ۜۛۖۨۘۗۖۡۘۛۢۡۘۨۗۡۘۦ۟ۜۘۢۡ"
            goto L_0x0110
        L_0x0122:
            float r2 = r41 + r46
            int r2 = (r53 > r2 ? 1 : (r53 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x011f
            java.lang.String r2 = "ۛۖۥ۟ۘۜۘۨۥۚ۠ۙ۫ۛۖۤ۠۬ۘۘۤۦۖۘۤۤ۟"
            goto L_0x0110
        L_0x012b:
            java.lang.String r2 = "ۡۚ۟ۗۥۨۡ۠ۤۗۗۨۘۧۘۧ۠ۜۘۦۜ۫ۜۘۖۘ"
            goto L_0x0110
        L_0x012e:
            java.lang.String r2 = "۟ۛ۟۫ۛۗۧ۬ۜ۬۟ۜۘۨ۠۟ۗۙۤ۟ۙۦ۠۟ۡۘ۠۫ۦۘ"
            r3 = r2
            goto L_0x0051
        L_0x0133:
            java.lang.String r2 = "ۤۡۦۧ۬ۢۡۧۘۘۖۧۙ۬ۨۜ۫ۖۧۘۗۨۘۘۨۦۦۦۚۨ"
            r3 = r2
            r39 = r40
            goto L_0x0051
        L_0x013a:
            int r38 = r40 + 1
            java.lang.String r2 = "ۥ۬ۥۘ۬۫۟ۨۡ۠ۛۚۘۖۙۦۢۡ"
            r3 = r2
            goto L_0x0051
        L_0x0141:
            java.lang.String r2 = "ۖۙۚۨ۬ۡۚۜۥۗۥۡۘۛ۟ۛۤۚۥۗۗ۟ۜۦۖ"
            r3 = r2
            r40 = r38
            goto L_0x0051
        L_0x0148:
            r37 = -1
            java.lang.String r2 = "۟ۘۛۚۚۢۗۖۘۜۤ۬۟ۛ۬ۡۜۡۘۖۘۚ۠ۡ۠ۧۖۥ"
            r3 = r2
            goto L_0x0051
        L_0x014f:
            java.lang.String r2 = "ۜۚۨۧ۬ۚۗۚۦۘۜۦۧۥۘۜۥۗۨۘۖۖۘۘۖۛۨ۫ۜۘ"
            r3 = r2
            r39 = r37
            goto L_0x0051
        L_0x0156:
            r22 = 0
            java.lang.String r2 = "ۛۨۘۘۜۥۙۢۧۚۧۗ۠۟ۘ۬ۥۧۤۢۤۗ۬ۗۥۜۗۥ"
            r3 = r2
            goto L_0x0051
        L_0x015d:
            r3 = 1399794385(0x536f2ad1, float:1.02721552E12)
            java.lang.String r2 = "ۤ۫ۜۘۨۜ۫ۙۨۥۘ۠ۨۧۦ۬ۥۢۜۘ"
        L_0x0162:
            int r49 = r2.hashCode()
            r49 = r49 ^ r3
            switch(r49) {
                case -2026625927: goto L_0x016c;
                case -345538621: goto L_0x0550;
                case 579414436: goto L_0x0174;
                case 1800196865: goto L_0x0177;
                default: goto L_0x016b;
            }
        L_0x016b:
            goto L_0x0162
        L_0x016c:
            if (r39 >= 0) goto L_0x0171
            java.lang.String r2 = "۠ۡ۠ۘۙۡۧۤۢۗۥۧۘ۟ۢۜۘ۬۟ۘۘ"
            goto L_0x0162
        L_0x0171:
            java.lang.String r2 = "ۨۙۖۘۢۘۨۘۥۤۙۖۚۤ۠ۖۦۙۧ۬۠ۦۘۘۡ۠ۤ"
            goto L_0x0162
        L_0x0174:
            java.lang.String r2 = "ۡ۬ۤۡ۟ۢ۠ۙۜۢۚۙۜۢۤ۫ۦ۠ۡۡۘۖۧۡۘ"
            goto L_0x0162
        L_0x0177:
            java.lang.String r2 = "۠ۡ۬ۨ۟ۧۙ۫ۢۘ۠ۨۘۖۡ۟ۥۖۦۘ"
            r3 = r2
            goto L_0x0051
        L_0x017c:
            r36 = 0
            java.lang.String r2 = "۬ۖۖۘۖۨ۫ۚۜۘۤۧ۟ۤۚۡ۫ۦۨ۟ۜ۟ۨۢ۟ۘۧ۠"
            r3 = r2
            goto L_0x0051
        L_0x0183:
            java.lang.String r2 = "ۦ۟ۨۘۤۖۚ۟ۘ۬۬ۤۙ۠۠ۙ"
            r3 = r2
            r35 = r36
            goto L_0x0051
        L_0x018a:
            r0 = r51
            float r0 = r0.A
            r34 = r0
            java.lang.String r2 = "ۤ۟ۛۧۖۢ۫ۙۡۘ۫ۙۘۘ۟ۜۡۘۚۥۨۘ۠ۗ"
            r3 = r2
            goto L_0x0051
        L_0x0195:
            float r33 = r47 * r34
            java.lang.String r2 = "ۦۨ۟ۗۥۨۘۗۧۢۢۘۤۘۤۜۛۥۨۚۨ"
            r3 = r2
            goto L_0x0051
        L_0x019c:
            int r2 = r51.getPaddingLeft()
            float r0 = (float) r2
            r32 = r0
            java.lang.String r2 = "ۖۚۦ۠ۘ۫ۜۥۙۚۥۘ۟ۚۢ۟۠ۥۘۢۖۡ"
            r3 = r2
            goto L_0x0051
        L_0x01a8:
            float r2 = r34 - r33
            r3 = 1073741824(0x40000000, float:2.0)
            float r31 = r2 / r3
            java.lang.String r2 = "ۜۜۨۘۢ۫ۚ۠ۡۖۘۧ۬ۡۘۤۜۨۙۦۤۧۤۚ۠ۢۚ"
            r3 = r2
            goto L_0x0051
        L_0x01b3:
            java.lang.String r2 = "۠۟ۤۙۤۖۘۛۗ۠ۡۦۚۥۦۘ"
            r3 = r2
            r28 = r30
            goto L_0x0051
        L_0x01ba:
            r3 = 1535953945(0x5b8ccc19, float:7.9261809E16)
            java.lang.String r2 = "۫ۤ۟ۜۧۧ۠۬ۖۘۢۨۢۜ۬ۜۘۢۢۦۘۡۡۦ۬ۦ۟"
        L_0x01bf:
            int r49 = r2.hashCode()
            r49 = r49 ^ r3
            switch(r49) {
                case -1535159001: goto L_0x01d8;
                case 355654507: goto L_0x01d5;
                case 1410752332: goto L_0x01c9;
                case 1610361097: goto L_0x055f;
                default: goto L_0x01c8;
            }
        L_0x01c8:
            goto L_0x01bf
        L_0x01c9:
            int r2 = H
            r0 = r28
            if (r0 >= r2) goto L_0x01d2
            java.lang.String r2 = "ۜۖۜۘۗ۠ۘ۫۫ۡۘۢۗۖۜۛۖۘ"
            goto L_0x01bf
        L_0x01d2:
            java.lang.String r2 = "ۦۡ۠ۤۧ۟ۡۛۙ۟ۧۥۥۘۘ"
            goto L_0x01bf
        L_0x01d5:
            java.lang.String r2 = "۟ۦۗۛۡ۠ۧ۠ۚۘۢ۬ۖ۟۫ۜۧۛۤۜۥۙۦ۟"
            goto L_0x01bf
        L_0x01d8:
            java.lang.String r2 = "ۙۘۜۨۨۦ۠۠ۨۘۗۘۖۘۗۤۨۘۗۖۗۤۙۖۘۢۨۥۘ"
            r3 = r2
            goto L_0x0051
        L_0x01dd:
            r0 = r28
            float r2 = (float) r0
            float r2 = r2 * r34
            float r3 = r31 + r32
            float r29 = r2 + r3
            java.lang.String r2 = "ۧۘۖۜۛۚ۫ۢۖۘۧۗۦۧۜۚۛ۬ۖ"
            r3 = r2
            goto L_0x0051
        L_0x01eb:
            r3 = -1660507388(0xffffffff9d06ab04, float:-1.7823165E-21)
            java.lang.String r2 = "ۤ۫ۡ۟ۦۤۥۖۢۢ۬ۥۘۡ۠ۙ۫ۤۛ۠۫ۨ"
        L_0x01f0:
            int r49 = r2.hashCode()
            r49 = r49 ^ r3
            switch(r49) {
                case -1304496973: goto L_0x01fa;
                case -1007134036: goto L_0x055a;
                case -851555762: goto L_0x0202;
                case 1493579356: goto L_0x0209;
                default: goto L_0x01f9;
            }
        L_0x01f9:
            goto L_0x01f0
        L_0x01fa:
            java.lang.String r2 = "ۢۜ۠ۦۨۘۛۙۦۘۗۚۡۘۦ۟ۙۜۧۦۘۨ۟۠ۜۜۘۘۨ۬ۧ"
            r3 = r2
            goto L_0x0051
        L_0x01ff:
            java.lang.String r2 = "۟۟ۦۘۥۙۥۨۢۥۘ۬ۢۤ۠ۦ"
            goto L_0x01f0
        L_0x0202:
            int r2 = (r52 > r29 ? 1 : (r52 == r29 ? 0 : -1))
            if (r2 < 0) goto L_0x01ff
            java.lang.String r2 = "۫۠۬ۙۚۥۘۘۜۚۧۛۦۘۡۙ۬ۙۤۦ"
            goto L_0x01f0
        L_0x0209:
            java.lang.String r2 = "ۨ۠ۤۜۜۗۢ۠۬ۧ۬ۜۥۨۙۢۜ۬ۧۦ۟ۦۘۦ۬۟"
            goto L_0x01f0
        L_0x020c:
            r3 = 1974096957(0x75aa543d, float:4.3183546E32)
            java.lang.String r2 = "ۨۖۥۘ۬ۗۨۘۙۖۡۖۘۨۘۤۨ۫"
        L_0x0211:
            int r49 = r2.hashCode()
            r49 = r49 ^ r3
            switch(r49) {
                case -595029872: goto L_0x0223;
                case -25669000: goto L_0x055a;
                case 127954814: goto L_0x021b;
                case 1260354185: goto L_0x022c;
                default: goto L_0x021a;
            }
        L_0x021a:
            goto L_0x0211
        L_0x021b:
            java.lang.String r2 = "ۡۛۨۥۜۨۘۜۢۘۤۦۦۨۧۡۢ۫ۙۡۚۘۘۖۤۗ"
            r3 = r2
            goto L_0x0051
        L_0x0220:
            java.lang.String r2 = "ۗ۟ۡۘۥۤۢۢ۠ۗۨۙۗۤۨۡ۠ۥۘ۟ۘۚۗ۫ۡۘ"
            goto L_0x0211
        L_0x0223:
            float r2 = r29 + r33
            int r2 = (r52 > r2 ? 1 : (r52 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0220
            java.lang.String r2 = "ۢۨۥۘ۬ۡۜ۫۫ۛۛۨۡۗۘ۠ۥ۟۟ۡۖۚۛۦۧۘ"
            goto L_0x0211
        L_0x022c:
            java.lang.String r2 = "ۛۧۨۛ۠۫ۚۗۘۘۚ۠ۜ۟ۢۖ۬ۡ۫ۥۥۦۘۨ۬۟ۢ۟ۗ"
            goto L_0x0211
        L_0x022f:
            java.lang.String r2 = "ۘۜۖۘۜۧ۬ۜۙۙۥۨۗۡۛۘۘۤ۠ۢۢۙ۟ۚۦ۠"
            r3 = r2
            r27 = r28
            goto L_0x0051
        L_0x0236:
            int r26 = r28 + 1
            java.lang.String r2 = "۟ۧۡۘۢۧۘۘ۟ۙۦۘۦۧۦۘۙۚۡۢۛۨۘ۬ۥۘ"
            r3 = r2
            goto L_0x0051
        L_0x023d:
            java.lang.String r2 = "ۖۘۨۘ۟ۡۨۘۖ۠ۡۘۧۘۜۙۢۨ"
            r3 = r2
            r28 = r26
            goto L_0x0051
        L_0x0244:
            r25 = -1
            java.lang.String r2 = "ۥۨۛۨ۫۠ۧۙ۟ۥۛۡۙۥ"
            r3 = r2
            goto L_0x0051
        L_0x024b:
            java.lang.String r2 = "ۜۤۡۖ۠ۡۢ۫ۘۜۚۨۘۘ۬ۢۜۘۖۙۥۘۡۖۨ"
            r3 = r2
            r27 = r25
            goto L_0x0051
        L_0x0252:
            r3 = -421830280(0xffffffffe6db6178, float:-5.1799812E23)
            java.lang.String r2 = "ۨۙۜۘۜۘۦ۟ۡۥۙ۠ۘۨۧۚۡۤۦ۠ۖ"
        L_0x0257:
            int r49 = r2.hashCode()
            r49 = r49 ^ r3
            switch(r49) {
                case -1035097167: goto L_0x0267;
                case -291277751: goto L_0x0261;
                case 1400425846: goto L_0x026c;
                case 1869614972: goto L_0x0569;
                default: goto L_0x0260;
            }
        L_0x0260:
            goto L_0x0257
        L_0x0261:
            java.lang.String r2 = "ۙۦۡۡۚۖۘۘۜۙۨۨۚۜۗ۬ۖۢۘۢۚۡۘۘۗۚ۫ۨۨ"
            goto L_0x0257
        L_0x0264:
            java.lang.String r2 = "ۤۛۙۧۦۖۘۨۡۡۚۥۤۤ۬۠"
            goto L_0x0257
        L_0x0267:
            if (r27 >= 0) goto L_0x0264
            java.lang.String r2 = "ۖ۫ۥۘۦۘۧۘۢۧۧۤۧۧۛ۠۟ۨۥۤۖۛۦۛۛۡۤۙۖۘ"
            goto L_0x0257
        L_0x026c:
            java.lang.String r2 = "ۡۗۡۘ۫ۜۚۘۖۦۘ۬۟ۤۦۡۤۥۨۡۘ"
            r3 = r2
            goto L_0x0051
        L_0x0271:
            r3 = -184260146(0xfffffffff50469ce, float:-1.678538E32)
            java.lang.String r2 = "ۜ۬ۖۗ۫ۘۡۘۘۘۖ۟ۘۘ۠۫ۨۘۢ۠۬ۦ۠ۙ"
        L_0x0276:
            int r49 = r2.hashCode()
            r49 = r49 ^ r3
            switch(r49) {
                case -1933553733: goto L_0x0298;
                case -1025250094: goto L_0x0295;
                case -112886108: goto L_0x0288;
                case 1553233293: goto L_0x0280;
                default: goto L_0x027f;
            }
        L_0x027f:
            goto L_0x0276
        L_0x0280:
            java.lang.String r2 = "ۨۗ۠۫ۗۗۖ۟ۥۚ۠ۤۦ۬ۜۘ"
            r3 = r2
            goto L_0x0051
        L_0x0285:
            java.lang.String r2 = "ۛ۟۬ۡۥۧۘۥۨۧ۬ۖۧۘۙۜۘۦۖۦ"
            goto L_0x0276
        L_0x0288:
            r0 = r51
            boolean[][] r2 = r0.f1316s
            r2 = r2[r39]
            boolean r2 = r2[r27]
            if (r2 == 0) goto L_0x0285
            java.lang.String r2 = "ۥۧ۬ۧ۟ۥۚۤۥۘۡۛۦۘۖۥۙۙۤۧۚ۟۟"
            goto L_0x0276
        L_0x0295:
            java.lang.String r2 = "۟ۗۨۤۚۡۡۢۨۘ۫ۗۧۤۜۛۘۢۡۘ"
            goto L_0x0276
        L_0x0298:
            java.lang.String r2 = "ۜۧۡۢۧۖۧۜۚۢۥۡۢۚۨ"
            r3 = r2
            goto L_0x0051
        L_0x029d:
            r0 = r39
            r1 = r27
            com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView$Dot r24 = com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView.Dot.of(r0, r1)
            java.lang.String r2 = "ۛۥۦۘۥۜ۟ۗۛۚۙۢۚۚۥۖۨۘۨۘ۠"
            r3 = r2
            goto L_0x0051
        L_0x02aa:
            java.lang.String r2 = "ۖۡۤۛۗ۫ۨۗۤۧۗۧۙۜۥ۠ۧۜۘۧۙۘۥۖۡ۠ۗ۬"
            r3 = r2
            r35 = r24
            goto L_0x0051
        L_0x02b1:
            r3 = -1144865354(0xffffffffbbc2bdb6, float:-0.0059430255)
            java.lang.String r2 = "ۚ۠ۚۥۙۚۧۤۧۖۜۜۘۧۜۧۘ"
        L_0x02b6:
            int r49 = r2.hashCode()
            r49 = r49 ^ r3
            switch(r49) {
                case -820965311: goto L_0x02cb;
                case -668299136: goto L_0x0591;
                case 759437099: goto L_0x02c0;
                case 1911415062: goto L_0x02c6;
                default: goto L_0x02bf;
            }
        L_0x02bf:
            goto L_0x02b6
        L_0x02c0:
            java.lang.String r2 = "ۦۖۜۥۡۧۘ۟ۖۡۖۡۗۘۦۚۦۙ۠ۢۤ۟ۘ"
            goto L_0x02b6
        L_0x02c3:
            java.lang.String r2 = "ۤۘۗۛ۟ۡۘۗۢۘۛ۬ۗۧۤۘۘۥۘۘۧۚ۟۬ۛ۠"
            goto L_0x02b6
        L_0x02c6:
            if (r35 == 0) goto L_0x02c3
            java.lang.String r2 = "۟ۥۖۘۦۨۜۘۥۚۧ۠ۙۗۥ۬ۥ۬۟ۜ"
            goto L_0x02b6
        L_0x02cb:
            java.lang.String r2 = "ۘۘۤ۟ۡ۫ۙ۟ۖۘۦۜۥ۟ۛۦۙۜ۟ۖ"
            r3 = r2
            goto L_0x0051
        L_0x02d0:
            r0 = r51
            java.util.ArrayList r0 = r0.f1315r
            r23 = r0
            java.lang.String r2 = "ۧۨۛۨۖۙۘ۟ۜۜ۟ۖۛ۬ۦۙۥۚۙۧۡ۠ۥۚ۫ۥۗ"
            r3 = r2
            goto L_0x0051
        L_0x02db:
            java.lang.String r2 = "۫ۦۖۘۨۦ۠۟ۡۜۥ۟۬۠۬ۗۥۤۖۘ۟ۚۖ"
            r3 = r2
            r21 = r22
            goto L_0x0051
        L_0x02e2:
            r3 = 280851093(0x10bd7295, float:7.47239E-29)
            java.lang.String r2 = "ۥۖۜۘۡ۫ۛۛ۬ۖۗ۟ۧۛۖ۫"
        L_0x02e7:
            int r49 = r2.hashCode()
            r49 = r49 ^ r3
            switch(r49) {
                case -1285994777: goto L_0x02fd;
                case -695324399: goto L_0x0587;
                case -161569721: goto L_0x02f1;
                case 496942934: goto L_0x0300;
                default: goto L_0x02f0;
            }
        L_0x02f0:
            goto L_0x02e7
        L_0x02f1:
            boolean r2 = r23.isEmpty()
            if (r2 != 0) goto L_0x02fa
            java.lang.String r2 = "ۘۚۗۡۦۢ۟۬ۙۢۦ۟ۜۦ۠ۖۤ۟"
            goto L_0x02e7
        L_0x02fa:
            java.lang.String r2 = "ۗۧۘۢۥۡۘ۟ۚۦۡۧۘۙۛۜۗۛۚۥۛۖ۟ۤۤ"
            goto L_0x02e7
        L_0x02fd:
            java.lang.String r2 = "ۛۘۨۜ۫ۜۘۘۙۡ۟ۡۢۤۨۘۘ۬ۖ۬ۗۗ۫"
            goto L_0x02e7
        L_0x0300:
            java.lang.String r2 = "۬۫ۤۗۜ۟ۚۖۗۧۙۚۛۗۘۘ۫۟ۜۘۡۦ۫"
            r3 = r2
            goto L_0x0051
        L_0x0305:
            int r2 = r23.size()
            int r2 = r2 + -1
            r0 = r23
            java.lang.Object r2 = r0.get(r2)
            com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView$Dot r2 = (com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView.Dot) r2
            java.lang.String r3 = "ۤ۠۟۫ۨۢۖۖۥۤۚۥۦۡۙۡۜۥۘۛۚۙۤۖۧۘ"
            r20 = r2
            goto L_0x0051
        L_0x0319:
            r0 = r20
            int r0 = r0.f1325a
            r16 = r0
            java.lang.String r2 = "۠ۨۗ۬ۢۨۧۡۖۗ۟ۥۘۡۦۧۘۡۨۛ"
            r3 = r2
            goto L_0x0051
        L_0x0324:
            r0 = r35
            int r2 = r0.f1325a
            int r19 = r2 - r16
            java.lang.String r2 = "ۧۤ۟۬ۤ۬ۖۡۨۖۡۘ۫ۦۨۘۨۖ"
            r3 = r2
            goto L_0x0051
        L_0x032f:
            r0 = r35
            int r0 = r0.f1326b
            r18 = r0
            java.lang.String r2 = "ۤ۫ۨ۠ۘۘۘۧۙۡۘۙۧۚ۫ۗۘۧۗۥ"
            r3 = r2
            goto L_0x0051
        L_0x033a:
            r0 = r20
            int r10 = r0.f1326b
            java.lang.String r2 = "ۥۗ۫۫ۜۢ۟۠ۘۥۡ۫ۦۚۡۗۖۜۧۖۜۘ۠ۢۨۘۖۥۘ"
            r3 = r2
            goto L_0x0051
        L_0x0343:
            int r17 = r18 - r10
            java.lang.String r2 = "ۙۛۡۘ۠ۥۛۖۧۛۚ۫ۙۚۦ۠۬ۧۖۘۧۜۡۘ"
            r3 = r2
            goto L_0x0051
        L_0x034a:
            java.lang.String r2 = "ۡ۠ۜۘ۬ۡۚۨۖۗۗ۟ۖۘۖۜ۫"
            r3 = r2
            r15 = r16
            goto L_0x0051
        L_0x0351:
            r3 = -1167847069(0xffffffffba641163, float:-8.7001006E-4)
            java.lang.String r2 = "۠ۛۡ۬۟۫ۜۛۘ۬ۤۦۖۗۖۚ۬ۛ۠ۤۥ"
        L_0x0356:
            int r49 = r2.hashCode()
            r49 = r49 ^ r3
            switch(r49) {
                case -570319547: goto L_0x0375;
                case 109805272: goto L_0x057d;
                case 130033414: goto L_0x0360;
                case 1280622853: goto L_0x0368;
                default: goto L_0x035f;
            }
        L_0x035f:
            goto L_0x0356
        L_0x0360:
            java.lang.String r2 = "ۚ۬ۗۤ۫ۧ۟ۘ۠ۦۘۚۦۜۨ۟ۧۖۘ۫ۤ"
            r3 = r2
            goto L_0x0051
        L_0x0365:
            java.lang.String r2 = "۟ۛۡۚۛۨۘۛۥۡۡۤ۟ۜۨۧۙ۟ۨۘۡۨۥۖۙۨۘ"
            goto L_0x0356
        L_0x0368:
            int r2 = java.lang.Math.abs(r19)
            r49 = 2
            r0 = r49
            if (r2 != r0) goto L_0x0365
            java.lang.String r2 = "ۥۚۢۘۖ۬ۛۧۛۨ۬ۖۘۗۢۡۙ۠ۦۘ۟ۙۘۘۘۖۙ"
            goto L_0x0356
        L_0x0375:
            java.lang.String r2 = "ۜۥۨۘۘۢۛۗۥۢۦۛۖۧۡۤ"
            goto L_0x0356
        L_0x0378:
            java.lang.String r2 = "۫ۢۖۜ۫ۦۛۡۡۘۦۘۜ۟ۧۨۖۜۘۘ"
            r3 = r2
            r15 = r16
            goto L_0x0051
        L_0x037f:
            r3 = -102640729(0xfffffffff9e1d3a7, float:-1.4656995E35)
            java.lang.String r2 = "ۜ۫ۡۘۢۥۖۘۖ۬۟۟ۡۖۘۨۖ"
        L_0x0384:
            int r49 = r2.hashCode()
            r49 = r49 ^ r3
            switch(r49) {
                case -1252444784: goto L_0x038e;
                case -891886345: goto L_0x0394;
                case -20076877: goto L_0x03a1;
                case 2131655452: goto L_0x057d;
                default: goto L_0x038d;
            }
        L_0x038d:
            goto L_0x0384
        L_0x038e:
            java.lang.String r2 = "ۗ۫ۤۙۜۦۚۥۖۘۛۘۚ۬ۘۨۘ۟ۘۦ"
            goto L_0x0384
        L_0x0391:
            java.lang.String r2 = "ۗۜ۫ۜۨ۫ۗ۫ۙ۟۬۠ۚۦۖۘۦۤۦۘۖۛۦۢۢۘۘ۠۬ۥۘ"
            goto L_0x0384
        L_0x0394:
            int r2 = java.lang.Math.abs(r17)
            r49 = 1
            r0 = r49
            if (r2 == r0) goto L_0x0391
            java.lang.String r2 = "۫ۧۢۘۛۘ۟ۢۚ۫۟ۖۘۡۡ۫۟۟ۡۖ۫ۗۚۖ۟ۚۦۘ"
            goto L_0x0384
        L_0x03a1:
            java.lang.String r2 = "ۡ۬۬ۦ۠ۘۘۗ۠ۜۘۧۖۡ۫ۙۤۗۖۡۘ۫ۘۢۘ۫ۖۘ۬ۧۙ"
            r3 = r2
            goto L_0x0051
        L_0x03a6:
            r3 = 548120027(0x20aba5db, float:2.907828E-19)
            java.lang.String r2 = "ۨۜ۟۟ۢۗۖۨۘۘۜۗ۠ۦۖۧۘۘ۟ۚۢ۟ۦ"
        L_0x03ab:
            int r49 = r2.hashCode()
            r49 = r49 ^ r3
            switch(r49) {
                case -1817056387: goto L_0x0573;
                case -1616957580: goto L_0x03c0;
                case -1443084384: goto L_0x03b5;
                case 1513912282: goto L_0x03bb;
                default: goto L_0x03b4;
            }
        L_0x03b4:
            goto L_0x03ab
        L_0x03b5:
            java.lang.String r2 = "ۥۖۤ۬ۙۨۧۢۜۘۢۚۨۘۡ۟ۛ۫ۡۗ۫ۙۗۧۚ۠"
            goto L_0x03ab
        L_0x03b8:
            java.lang.String r2 = "ۡۦ۫ۗۜۧۘۢۘۘۤۛۛ۟ۖ۬ۘ۟ۤ"
            goto L_0x03ab
        L_0x03bb:
            if (r19 <= 0) goto L_0x03b8
            java.lang.String r2 = "ۛۤۧ۬ۛۚۡۨ۟ۗۢۥۘۨ۠ۜ"
            goto L_0x03ab
        L_0x03c0:
            java.lang.String r2 = "ۥۗۢۛ۬ۤۢۚۢۡۦۘۨۨۜ۟ۗۧۨۜۥۧۡۘۘ"
            r3 = r2
            goto L_0x0051
        L_0x03c5:
            r14 = 1
            java.lang.String r2 = "ۛ۠ۖۘۦۡۢ۠۟ۢۘ۠ۖ۬ۗۜۘۚۜۗۛۛۥۙۦۜۢۢۦ"
            r3 = r2
            goto L_0x0051
        L_0x03cb:
            java.lang.String r2 = "ۢۚۖۘۜۦۦۘۚۚۘۚۖۚۘۙۖۘۗۡۜۘۙۖۦۘ۫ۡ"
            r3 = r2
            r13 = r14
            goto L_0x0051
        L_0x03d1:
            r12 = -1
            java.lang.String r2 = "ۚ۠ۖۘۖۦۛۜ۟ۧۥۧۧۖۦۗۙ۟۟ۢۢۦ"
            r3 = r2
            goto L_0x0051
        L_0x03d7:
            java.lang.String r2 = "ۖۖۧۤۙۘۤ۟ۤۢۥۥۛۡۗ۠ۜ۟ۚۘ۟ۢۥۧۘ۫ۜ۬"
            r3 = r2
            r13 = r12
            goto L_0x0051
        L_0x03dd:
            r0 = r20
            int r2 = r0.f1325a
            int r11 = r13 + r2
            java.lang.String r2 = "ۨۧۡۘۘۡ۟ۧۦۘۦۛۖۘۢۦۦ۬ۗۦۖۤۖۘ۬ۨ۫۠ۜ۟"
            r3 = r2
            goto L_0x0051
        L_0x03e8:
            java.lang.String r2 = "ۧۖۛۛۤۘۘ۫۠ۙۙ۫ۘۘۘۡۜۗۨۧۜ۟ۥ"
            r3 = r2
            r15 = r11
            goto L_0x0051
        L_0x03ee:
            java.lang.String r2 = "ۢۘۤۚ۟ۥۙۙۧۙ۠ۚ۠ۛۗۘۖۖ۟ۖۘ۠ۙۨۘۚۘۡۘ"
            r3 = r2
            r9 = r10
            goto L_0x0051
        L_0x03f4:
            r3 = -90538449(0xfffffffffa9a7e2f, float:-4.010865E35)
            java.lang.String r2 = "ۥۧۜۘۘ۟ۜۘۤۡۖ۬۠ۗ۬ۢۛ"
        L_0x03f9:
            int r49 = r2.hashCode()
            r49 = r49 ^ r3
            switch(r49) {
                case -1736867130: goto L_0x0582;
                case 46535881: goto L_0x0416;
                case 146778261: goto L_0x0403;
                case 1683242613: goto L_0x0409;
                default: goto L_0x0402;
            }
        L_0x0402:
            goto L_0x03f9
        L_0x0403:
            java.lang.String r2 = "ۛ۫۟۟ۦۡۘۗۛۛۦۙۡۘۥۗۘۜۘۛ۬ۚۜۤۗۙۘۘ۫"
            goto L_0x03f9
        L_0x0406:
            java.lang.String r2 = "ۖۖ۬ۗۛ۫۟ۧۥۙۛۨۘۧۚۚ۠ۘۜۘۚۘۧۤۙۦۘ"
            goto L_0x03f9
        L_0x0409:
            int r2 = java.lang.Math.abs(r17)
            r49 = 2
            r0 = r49
            if (r2 != r0) goto L_0x0406
            java.lang.String r2 = "ۙ۬۫ۧۗ۬ۖۚۡۘۥۗۜ۟۬ۨۘۡۦۗۥۧۜۘۦۘۘۘ"
            goto L_0x03f9
        L_0x0416:
            java.lang.String r2 = "ۥۢۨۘۖ۠۫۟ۦ۟ۜۤۧۗۥۜۘ۟ۗۨۘۚۨۧ۟ۦۨۘۗۤۨۘ"
            r3 = r2
            goto L_0x0051
        L_0x041b:
            java.lang.String r2 = "ۨۘۥۦ۬ۜۗۦۚۜۥ۠ۥ۬ۚ"
            r3 = r2
            r9 = r10
            goto L_0x0051
        L_0x0421:
            r3 = 1813854408(0x6c1d38c8, float:7.60278E26)
            java.lang.String r2 = "ۜۢۨۗۦۙۚۘۚۛۛۚۤۦۜۢۥ۫۟ۦۨۘۤ۫ۜۥ۬۫"
        L_0x0426:
            int r49 = r2.hashCode()
            r49 = r49 ^ r3
            switch(r49) {
                case -1296546084: goto L_0x0430;
                case -1175764204: goto L_0x0582;
                case -751926793: goto L_0x0445;
                case 1718393234: goto L_0x0438;
                default: goto L_0x042f;
            }
        L_0x042f:
            goto L_0x0426
        L_0x0430:
            java.lang.String r2 = "۟ۥ۠ۘۚۡۘ۫ۗۗۙ۟۟ۢ۟ۥ"
            r3 = r2
            goto L_0x0051
        L_0x0435:
            java.lang.String r2 = "ۢۨۧۘ۬ۙۥۘۧ۬ۜۘ۬ۨ۫ۧۛۗۦۚۤ۠"
            goto L_0x0426
        L_0x0438:
            int r2 = java.lang.Math.abs(r19)
            r49 = 1
            r0 = r49
            if (r2 == r0) goto L_0x0435
            java.lang.String r2 = "ۤۖۤۧۥۖۡۘۥۦ۟ۚۤۥ۟ۥۜۦۘۛۦۘ"
            goto L_0x0426
        L_0x0445:
            java.lang.String r2 = "۟ۡۘۚۢۜ۠ۚۥۥ۫ۚۜۨۚۡۢۚ۟ۜۘۖۢ۠ۙۢ"
            goto L_0x0426
        L_0x0448:
            java.lang.String r2 = "ۘۧ۫ۢۚۗ۫ۚۨۘۥۚ۟ۘۦۨۚۨۘۙۨۚۤ۟ۥۘ"
            r3 = r2
            r7 = r8
            goto L_0x0051
        L_0x044e:
            r3 = -519586541(0xffffffffe107bd13, float:-1.5649592E20)
            java.lang.String r2 = "ۙ۬ۡ۠ۢۛۡۧۗۛۗۥۘۥ۠ۘۘۙۙۗۗۖۡۘۘۢ۬"
        L_0x0453:
            int r49 = r2.hashCode()
            r49 = r49 ^ r3
            switch(r49) {
                case -878550418: goto L_0x045d;
                case 723494198: goto L_0x0465;
                case 1483331943: goto L_0x046a;
                case 1915427655: goto L_0x046d;
                default: goto L_0x045c;
            }
        L_0x045c:
            goto L_0x0453
        L_0x045d:
            java.lang.String r2 = "ۨۤۤۨۢۘۜ۟ۜۘۦۨۧۘۙ۟ۤ۟۠ۡۦۦۘۥۨۤ۠ۨۘ"
            r3 = r2
            goto L_0x0051
        L_0x0462:
            java.lang.String r2 = "۫۟ۥۘۢۙۥۧۧۗۛۨ۟ۜۨۗۘۢۦۘۡ۫ۨۘ۟۠ۧۢۥۧ"
            goto L_0x0453
        L_0x0465:
            if (r17 <= 0) goto L_0x0462
            java.lang.String r2 = "ۢۨۨۘۗۖ۠ۡۗۘۘۖۨۧ۟ۤۖۢ۬ۘۘۛۛۜ۠ۨ۫ۙۛۤ"
            goto L_0x0453
        L_0x046a:
            java.lang.String r2 = "ۚۡۛۦ۬ۖۘۦ۟ۛۗ۟ۚۤۨۖۨ۬ۥ۟ۨۨۘ"
            goto L_0x0453
        L_0x046d:
            java.lang.String r2 = "ۗۦۥۘۗۜۨۘۜۢۥۥۛ۠۟ۤۛۖ۬ۜۘ"
            r3 = r2
            goto L_0x0051
        L_0x0472:
            r6 = 1
            java.lang.String r2 = "ۡۛۙۜۥۙ۬ۢۖۚۥۡۥۛ۟ۦۘۙۖۧۘۖۖۜ"
            r3 = r2
            goto L_0x0051
        L_0x0478:
            java.lang.String r2 = "ۨۤۤۨۢۘۜ۟ۜۘۦۨۧۘۙ۟ۤ۟۠ۡۦۦۘۥۨۤ۠ۨۘ"
            r3 = r2
            r7 = r6
            goto L_0x0051
        L_0x047e:
            int r5 = r10 + r7
            java.lang.String r2 = "۬ۘۜۢۙ۫ۥۥۨۢۗ۠۟۫ۗ"
            r3 = r2
            goto L_0x0051
        L_0x0485:
            java.lang.String r2 = "ۛۖ۬ۡۖۧۘ۟ۧۗۢۥۢۗۙۜۥۘۘۘۚۦۖ"
            r3 = r2
            r9 = r5
            goto L_0x0051
        L_0x048b:
            com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView$Dot r4 = com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView.Dot.of(r15, r9)
            java.lang.String r2 = "ۦۧۜۨ۬۫۫ۚۦۘ۬ۛۡۘ۟ۨۨۗۗۡۘۜۦۦۘۡ۠ۦۘ۠ۜۡۘ"
            r3 = r2
            goto L_0x0051
        L_0x0494:
            java.lang.String r2 = "ۨۢۡۡۙۡۘۚۚۨۘۙۙۘۗۨۗۤۧۜۘۜۤۚۥ۟ۜ"
            r3 = r2
            r21 = r4
            goto L_0x0051
        L_0x049b:
            r3 = 1905131106(0x718dfe62, float:1.4062373E30)
            java.lang.String r2 = "ۛۜۡۘۥۧۖۘۤۙۘۜ۬۟ۥۨ۠"
        L_0x04a0:
            int r49 = r2.hashCode()
            r49 = r49 ^ r3
            switch(r49) {
                case -1586116269: goto L_0x04ba;
                case 78080375: goto L_0x04b2;
                case 969791538: goto L_0x04b7;
                case 1598634736: goto L_0x04aa;
                default: goto L_0x04a9;
            }
        L_0x04a9:
            goto L_0x04a0
        L_0x04aa:
            java.lang.String r2 = "ۦۙۨۛ۫ۛۢۨۛۢۛۡ۠ۛۜۘۘۗۜۘۢۦۥۧ۫ۨ"
            r3 = r2
            goto L_0x0051
        L_0x04af:
            java.lang.String r2 = "۬ۖۥۗۙ۫ۨۥ۠ۘۥۨۘۨۨ۫ۜ۬ۙۡۚۛ"
            goto L_0x04a0
        L_0x04b2:
            if (r21 == 0) goto L_0x04af
            java.lang.String r2 = "ۛۛۧۤۖۢ۫ۖۘۦۢۚۡۡۥۘۤ۫۬ۥۦۗۜۦۗۨۡۘ"
            goto L_0x04a0
        L_0x04b7:
            java.lang.String r2 = "ۖۦۧۘۨۖۡۥۥۗۦۙ۟ۨ۬ۡ۫۟ۘۘۚۧۖۘ۠ۡ۫"
            goto L_0x04a0
        L_0x04ba:
            java.lang.String r2 = "ۨۗۡۧۖۘ۟۟ۘۘۦۗۧۧ۟ۘۧ۫ۦۘۙۦۥۖۤۡۜ۬ۘ"
            r3 = r2
            goto L_0x0051
        L_0x04bf:
            r3 = 423951452(0x1944fc5c, float:1.0183926E-23)
            java.lang.String r2 = "ۦۘۛۥۤۙۥۤۘۘۜۤۧۢۖۥۜ۬ۜ"
        L_0x04c4:
            int r49 = r2.hashCode()
            r49 = r49 ^ r3
            switch(r49) {
                case 255348864: goto L_0x04ce;
                case 872249040: goto L_0x04ed;
                case 1044277725: goto L_0x04aa;
                case 1896262006: goto L_0x04d4;
                default: goto L_0x04cd;
            }
        L_0x04cd:
            goto L_0x04c4
        L_0x04ce:
            java.lang.String r2 = "ۚ۠۬ۦۧۗۜۛ۟۫ۦۙۘۧۥۥۥۖۜ۬۟ۨۦۘۧۛۙ"
            goto L_0x04c4
        L_0x04d1:
            java.lang.String r2 = "۬۠۠ۡۚۜۘۗۦۥۤۡۦۘۚ۬ۦۜۥۚ"
            goto L_0x04c4
        L_0x04d4:
            r0 = r51
            boolean[][] r2 = r0.f1316s
            r0 = r21
            int r0 = r0.f1325a
            r49 = r0
            r2 = r2[r49]
            r0 = r21
            int r0 = r0.f1326b
            r49 = r0
            boolean r2 = r2[r49]
            if (r2 != 0) goto L_0x04d1
            java.lang.String r2 = "۫ۥۛ۫ۡ۫۫۟ۥۜۡۨۘۤۦۘ۫ۥۦۦۘۘۖۘۜۘ"
            goto L_0x04c4
        L_0x04ed:
            java.lang.String r2 = "ۥۙ۟ۡۘ۟ۦۤۢۗۦۗۢۙۢۤۙ"
            r3 = r2
            goto L_0x0051
        L_0x04f2:
            r0 = r51
            r1 = r21
            r0.a(r1)
            java.lang.String r2 = "ۦۙۨۛ۫ۛۢۨۛۢۛۡ۠ۛۜۘۘۗۜۘۢۦۥۧ۫ۨ"
            r3 = r2
            goto L_0x0051
        L_0x04fe:
            r0 = r51
            r1 = r35
            r0.a(r1)
            java.lang.String r2 = "ۚۗۨۛۡۘۘۢۥۖۘۦ۠ۘۘۗۘۥۘ"
            r3 = r2
            goto L_0x0051
        L_0x050a:
            r3 = -248294861(0xfffffffff1335233, float:-8.87955E29)
            java.lang.String r2 = "ۦۦ۠ۤۢۘۥۜۧۚۡۥۜ۫ۘۦۢۖۡۛ۠"
        L_0x050f:
            int r49 = r2.hashCode()
            r49 = r49 ^ r3
            switch(r49) {
                case -1571623426: goto L_0x0519;
                case -834372752: goto L_0x058c;
                case -806824138: goto L_0x0525;
                case 1836934957: goto L_0x0528;
                default: goto L_0x0518;
            }
        L_0x0518:
            goto L_0x050f
        L_0x0519:
            r0 = r51
            boolean r2 = r0.f1322y
            if (r2 == 0) goto L_0x0522
            java.lang.String r2 = "۠ۘ۬ۖ۟ۦۘ۟۠ۡۘۗۥۨۘۗ۠ۦۘۖۧۖ"
            goto L_0x050f
        L_0x0522:
            java.lang.String r2 = "ۧ۟ۘۘ۠ۘۡۘۥۘ۟ۜۦۦۜۜۦۜۦۜ"
            goto L_0x050f
        L_0x0525:
            java.lang.String r2 = "۠۟ۡۘۗۚۡۘ۫۠ۧۙۛۤۛۙۜ"
            goto L_0x050f
        L_0x0528:
            java.lang.String r2 = "۫ۤۘۖۚۥۚۛۢۦۖۛ۬۠۬"
            r3 = r2
            goto L_0x0051
        L_0x052d:
            r2 = 1
            r3 = 3
            r0 = r51
            r0.performHapticFeedback(r2, r3)
            java.lang.String r2 = "ۢ۟ۛ۫ۙ۟ۘ۟۟ۚۢۡۥۘۚ۟ۗۨ۠ۤ۫ۨۙ"
            r3 = r2
            goto L_0x0051
        L_0x0539:
            r35 = 0
        L_0x053b:
            return r35
        L_0x053c:
            java.lang.String r2 = "ۢۘۨۦۤۛۥۢۡۤۖۖ۠ۘۥۘۚۘۜۚۘۘ"
            r3 = r2
            goto L_0x0051
        L_0x0541:
            java.lang.String r2 = "ۗۦۨۘ۫ۚۖ۟ۢۖ۠ۤۖ۠ۖ۟"
            r3 = r2
            goto L_0x0051
        L_0x0546:
            java.lang.String r2 = "ۜۚۨۧ۬ۚۗۚۦۘۜۦۧۥۘۜۥۗۨۘۖۖۘۘۖۛۨ۫ۜۘ"
            r3 = r2
            goto L_0x0051
        L_0x054b:
            java.lang.String r2 = "۠ۡ۬ۨ۟ۧۙ۫ۢۘ۠ۨۘۖۡ۟ۥۖۦۘ"
            r3 = r2
            goto L_0x0051
        L_0x0550:
            java.lang.String r2 = "ۤ۬ۗۙۥۜۘۤ۬ۘ۟ۤۥ۬ۢۙ۫ۦۦۘ۫۫ۖۨۚۤۥۚۢ"
            r3 = r2
            goto L_0x0051
        L_0x0555:
            java.lang.String r2 = "۠۟ۤۙۤۖۘۛۗ۠ۡۦۚۥۦۘ"
            r3 = r2
            goto L_0x0051
        L_0x055a:
            java.lang.String r2 = "ۧۨۨۘۗۦۦۘۡۤۜۘۚۤ۟ۚۘۦ۬ۖۚ۟ۨ۫"
            r3 = r2
            goto L_0x0051
        L_0x055f:
            java.lang.String r2 = "ۖۧۘۥۨۙۜۡۧۘۦ۫ۤۛ۬ۥ۟ۥۧۘ۟۫ۨۡۚ"
            r3 = r2
            goto L_0x0051
        L_0x0564:
            java.lang.String r2 = "ۜۤۡۖ۠ۡۢ۫ۘۜۚۨۘۘ۬ۢۜۘۖۙۥۘۡۖۨ"
            r3 = r2
            goto L_0x0051
        L_0x0569:
            java.lang.String r2 = "ۤۚ۠ۜۘۡ۬۬۬۠ۦۘ۬ۛۘۘۙ۠ۤ"
            r3 = r2
            goto L_0x0051
        L_0x056e:
            java.lang.String r2 = "ۖۡۤۛۗ۫ۨۗۤۧۗۧۙۜۥ۠ۧۜۘۧۙۘۥۖۡ۠ۗ۬"
            r3 = r2
            goto L_0x0051
        L_0x0573:
            java.lang.String r2 = "ۖۜۗۚۡۢۦ۫۠ۦۨۦۘۖۗۦۨۘۛۖۦۘۖ۠ۗۙۚ"
            r3 = r2
            goto L_0x0051
        L_0x0578:
            java.lang.String r2 = "ۖۖۧۤۙۘۤ۟ۤۢۥۥۛۡۗ۠ۜ۟ۚۘ۟ۢۥۧۘ۫ۜ۬"
            r3 = r2
            goto L_0x0051
        L_0x057d:
            java.lang.String r2 = "ۧۖۛۛۤۘۘ۫۠ۙۙ۫ۘۘۘۡۜۗۨۧۜ۟ۥ"
            r3 = r2
            goto L_0x0051
        L_0x0582:
            java.lang.String r2 = "ۛۖ۬ۡۖۧۘ۟ۧۗۢۥۢۗۙۜۥۘۘۘۚۦۖ"
            r3 = r2
            goto L_0x0051
        L_0x0587:
            java.lang.String r2 = "ۨۢۡۡۙۡۘۚۚۨۘۙۙۘۗۨۗۤۧۜۘۜۤۚۥ۟ۜ"
            r3 = r2
            goto L_0x0051
        L_0x058c:
            java.lang.String r2 = "ۢ۟ۛ۫ۙ۟ۘ۟۟ۚۢۡۥۘۚ۟ۗۨ۠ۤ۫ۨۙ"
            r3 = r2
            goto L_0x0051
        L_0x0591:
            java.lang.String r2 = "ۙ۬ۘۘۢۚۖۤۜۖۘۖۖۘۘۙۧۧۛ۫ۧۧۚۧۙ۫ۡ۠ۙۚ"
            r3 = r2
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView.c(float, float):com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView$Dot");
    }

    public void clearPattern() {
        String str = "ۙ۬ۖۡۧۖۘۨ۟ۧ۟ۨۢۧۜۧۘۖ۫ۖۧۤۜۘۙۧۖۡ";
        while (true) {
            switch ((str.hashCode() ^ 694) ^ -607029433) {
                case -1130621598:
                    this.f1315r.clear();
                    str = "ۜۧۛۢۨۜۘۜۚۚ۠ۥۡۗۘۨۘ";
                    break;
                case -822639324:
                    invalidate();
                    str = "۟۠ۢۢۘۙۙۡۛۜۖۘۨۗۧ۠ۧۗۤۙ";
                    break;
                case -160356981:
                    return;
                case 244988648:
                    str = "ۙۖۨ۠ۘ۬ۗۜۖۘۢ۬ۖۛۚۤ۫ۚۜۘۨۛۚ";
                    break;
                case 438554264:
                    this.f1319v = 0;
                    str = "ۦۗۤۥۘۤۘۗۨۘۚۨ۫ۧۥۡۘۤۡۗ";
                    break;
                case 675712786:
                    b();
                    str = "ۢ۫ۨۘۤۦۖۤۘۜۜۡۡۘۡۗۜۙۢۚۗ۬ۜۘ۬ۜۦۘۜۤۘ";
                    break;
            }
        }
    }

    public final float d(int i2) {
        String str = "ۙ۬ۘۡۧۖۘۧۖۦ۠۠ۧۡۜۥ";
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        while (true) {
            switch ((str.hashCode() ^ 386) ^ -1506942149) {
                case -2129566652:
                    f2 = this.A;
                    str = "ۨۖۧۘ۟ۦ۠ۜۤۜ۟ۚ۠ۖۗۖۤۥۘۘۛۤۤۙۤۢ۠ۢ۫";
                    break;
                case -1848785996:
                    str = "ۗۜۥۘۢۧۜۘۚۘۘۚۗۖۘۢۜۖ۬ۖۘۘۥۦ۬";
                    break;
                case -1462044772:
                    str = "ۜۦۤۜۖۦۖ۠ۖۖۗۖۘۢۤ۠۠ۢۥۛ۠ۧ";
                    f4 = (float) getPaddingLeft();
                    break;
                case -1066565388:
                    str = "ۜۗۛ۬ۜ۠ۦۨۦ۠ۜۥۘۤ۫ۗ";
                    break;
                case -406279143:
                    str = "ۗۘۢ۟۫ۘۘۢۢۚۡۢۡۘۨۛۨۘ۬ۡۚ";
                    f3 = (float) i2;
                    break;
                case -389642597:
                    return (f2 / 2.0f) + (f2 * f3) + f4;
            }
        }
    }

    public final float e(int i2) {
        String str = "ۦۛ۠ۜۚۖ۫ۨۚۡ۫۫ۨۧۘۗۤۗ";
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        while (true) {
            switch ((str.hashCode() ^ 624) ^ 790282645) {
                case -1587627322:
                    str = "ۧۜۥۛ۠ۖۜۦۖۘ۠ۜۦۜۖۢ";
                    f4 = (float) getPaddingTop();
                    break;
                case -1123182392:
                    str = "۟ۗۖۜ۟ۡۘۜۜۚۥ۠ۧۖۦۦۘۖۨۤۨ۠ۥۘۤۖ";
                    break;
                case -325593146:
                    return (f2 / 2.0f) + (f2 * f3) + f4;
                case -154026912:
                    f2 = this.B;
                    str = "ۘ۬ۘۘۧۚ۬ۢۦۖۚ۠ۚۥۦ۬۠ۖۚۖ۬ۜۨۗۦۘۖۥۙ";
                    break;
                case 250634510:
                    str = "ۘۦۥۘۗۨۘۘۙۡۘۘۦ۬ۦۤۧۥۘ۬ۧ۫ۙ";
                    f3 = (float) i2;
                    break;
                case 860579079:
                    str = "ۙۨ۟ۘۤ۫ۧۦۘۘۡۤۧۨ۠ۛ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int f(boolean r7) {
        /*
            r6 = this;
            r2 = 0
            r1 = 0
            java.lang.String r0 = "ۥ۬۬ۛ۠ۖۨ۬ۖۙۖۥ۫ۢۘۘ"
        L_0x0004:
            int r3 = r0.hashCode()
            r4 = 327(0x147, float:4.58E-43)
            r5 = 1680325269(0x6427ba95, float:1.2376204E22)
            r3 = r3 ^ r4
            r3 = r3 ^ r5
            switch(r3) {
                case -1961533273: goto L_0x0043;
                case -1626731245: goto L_0x00f9;
                case -1022475211: goto L_0x0016;
                case -793636394: goto L_0x007c;
                case -403499619: goto L_0x009a;
                case -5489454: goto L_0x0104;
                case 382612186: goto L_0x00ba;
                case 533763073: goto L_0x009d;
                case 935422288: goto L_0x00ec;
                case 1033575255: goto L_0x00f6;
                case 1329713193: goto L_0x0056;
                case 1429370630: goto L_0x0019;
                case 1591169259: goto L_0x0013;
                case 1699775556: goto L_0x0035;
                case 1759222536: goto L_0x00e3;
                case 1819418525: goto L_0x0077;
                case 1834680274: goto L_0x00d8;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0004
        L_0x0013:
            java.lang.String r0 = "ۚۜۥۖ۬ۘۘ۟ۤۗۨ۬ۥۘۢۡۘۧ۠۫ۘۛۡۛۡۚۦ"
            goto L_0x0004
        L_0x0016:
            java.lang.String r0 = "۬ۤۧۨۗ۟ۧۥۨۘۨۖۦ۬ۛۖۦۗۖۙۦ"
            goto L_0x0004
        L_0x0019:
            r3 = -1146582147(0xffffffffbba88b7d, float:-0.0051435814)
            java.lang.String r0 = "ۗ۠ۜۨۘۢۥۧۛۙۜ۟ۚۖۙۗۦۨۘ"
        L_0x001e:
            int r4 = r0.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case -1778436153: goto L_0x002d;
                case 417309931: goto L_0x0032;
                case 1288226571: goto L_0x0043;
                case 1663653080: goto L_0x0027;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x001e
        L_0x0027:
            java.lang.String r0 = "ۧۙۗۤۦۖۘۙۥۘۜۗ۫ۤۦۥ"
            goto L_0x0004
        L_0x002a:
            java.lang.String r0 = "ۤۙۖۘ۟۟ۘۘۚ۬ۚۧۜۜۘ۟ۚۜۙۖۦۘ۬ۧۘۤ۠ۤۥۢ"
            goto L_0x001e
        L_0x002d:
            if (r7 == 0) goto L_0x002a
            java.lang.String r0 = "ۜۙۚۢۦۢۧۦۤۛۖۡۧۖ۬ۛۧۗ۠ۙ۫ۦۖۦۘ۟۠ۛ"
            goto L_0x001e
        L_0x0032:
            java.lang.String r0 = "ۧۢ۫ۥۗۙۨۙۚ۫ۗۨۘۡۜۜۘ"
            goto L_0x001e
        L_0x0035:
            r3 = 1769064915(0x6971c9d3, float:1.8269013E25)
            java.lang.String r0 = "۫ۧۗۨۛۡۘۖۜۗۤ۫ۡۘۜۡۦۘۗۜۘۘۖۘ۠ۚۘۛ"
        L_0x003a:
            int r4 = r0.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case -832610972: goto L_0x0053;
                case -207314314: goto L_0x0049;
                case 710320777: goto L_0x0050;
                case 1220001647: goto L_0x0043;
                default: goto L_0x0042;
            }
        L_0x0042:
            goto L_0x003a
        L_0x0043:
            java.lang.String r0 = "ۗۦۘۖۜۜۘ۠۬ۨۘ۬ۤۜۘۦ۫ۛۢۤۦ۬ۗۡۘۗ۬ۥۚۖۢ"
            goto L_0x0004
        L_0x0046:
            java.lang.String r0 = "۠ۧ۠۟ۙۛۨۖۘۜۥۙ۠ۛ۫ۦۦۧۨ۫ۨۛۦۥۖۘ"
            goto L_0x003a
        L_0x0049:
            boolean r0 = r6.f1321x
            if (r0 != 0) goto L_0x0046
            java.lang.String r0 = "۟۟ۙۜۚۘۘۧ۟ۖۘ۫ۦۧۜۗۜ۟ۨۡۘۛۧ۬"
            goto L_0x003a
        L_0x0050:
            java.lang.String r0 = "ۡ۫ۦۢ۬ۦۨۜ۟ۜۨۚۗۜۨۖۛۖۛۤۜۡۖ"
            goto L_0x003a
        L_0x0053:
            java.lang.String r0 = "ۚۦۡۙۧۖۦ۬ۨۦۥۦۘ۠ۛ"
            goto L_0x0004
        L_0x0056:
            r3 = -1660680636(0xffffffff9d040644, float:-1.7473294E-21)
            java.lang.String r0 = "ۘۘۙۖۡۤۙۢۥۜۛۥۘۘۢ۠"
        L_0x005b:
            int r4 = r0.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case -1091012500: goto L_0x006a;
                case -250836984: goto L_0x0071;
                case 598853170: goto L_0x0064;
                case 741774158: goto L_0x0074;
                default: goto L_0x0063;
            }
        L_0x0063:
            goto L_0x005b
        L_0x0064:
            java.lang.String r0 = "۠ۡۘۤۜۤۤۦۥۘۘۧ۫۬ۤۡۦۤۧۖ۫۬ۨۚۦ"
            goto L_0x0004
        L_0x0067:
            java.lang.String r0 = "ۘۥ۟۠ۦۚۖۧۨۘۧۗۜۦ۠ۦۘۢۛۙۛۙۜۘۦۤۙ"
            goto L_0x005b
        L_0x006a:
            boolean r0 = r6.f1323z
            if (r0 == 0) goto L_0x0067
            java.lang.String r0 = "ۥ۠ۚۢ۠ۧۤۦۥ۫۟ۘۘۛۦۙۡ۫۠ۨۨۡ"
            goto L_0x005b
        L_0x0071:
            java.lang.String r0 = "ۗ۟ۘ۟ۖۡۖۘۗ۠ۦۘۧۗۙۡۧ۟ۦۖۦۘۜ۠ۜۚۢۡ"
            goto L_0x005b
        L_0x0074:
            java.lang.String r0 = "۟ۙۧۗۘۖۘ۟ۦۤۡۗۦۗۘۙ"
            goto L_0x0004
        L_0x0077:
            int r2 = r6.f1319v
            java.lang.String r0 = "ۖۦۢۚۤ۫۠ۘۥۘ۫ۛۘۘۗ۫ۦۘۛ۬ۥ"
            goto L_0x0004
        L_0x007c:
            r3 = 753222262(0x2ce54276, float:6.51595E-12)
            java.lang.String r0 = "ۦۖۙۢۘ۟ۗ۟ۨۤۗۖۘۧۘۧ۬۟۟ۜۚۙۖۙ۫ۢۖۘ"
        L_0x0081:
            int r4 = r0.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case 454861798: goto L_0x0096;
                case 566008440: goto L_0x00fc;
                case 972375980: goto L_0x008a;
                case 1256955290: goto L_0x0090;
                default: goto L_0x0089;
            }
        L_0x0089:
            goto L_0x0081
        L_0x008a:
            java.lang.String r0 = "ۡۥۘۢۡ۫۟۫ۘۘ۫ۨۗ۟۟۬ۖۛ۫"
            goto L_0x0081
        L_0x008d:
            java.lang.String r0 = "ۛۜۡۘۖۙۦۙ۠ۡۘۚۘۖۘ۠ۙۦۘۡ۬ۗۖۘۨ"
            goto L_0x0081
        L_0x0090:
            r0 = 2
            if (r2 != r0) goto L_0x008d
            java.lang.String r0 = "۟ۛۦۘۡۢۥۛۗۘ۟ۙۡ۫ۢۧۘۜۜۛۥ۬ۗۗۡۗۗۦۘ"
            goto L_0x0081
        L_0x0096:
            java.lang.String r0 = "ۛۚۧ۫۬ۜۙۙ۟۠ۖۤۨۜۘۗۤۘۘ"
            goto L_0x0004
        L_0x009a:
            int r0 = r6.f1305h
        L_0x009c:
            return r0
        L_0x009d:
            r3 = -414667430(0xffffffffe748ad5a, float:-9.476711E23)
            java.lang.String r0 = "ۨۖۡۘۗۨۘۘۖۘۖۦ۠ۚ۬۬ۥۛۜۙۡۤۚ"
        L_0x00a2:
            int r4 = r0.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case -492805384: goto L_0x00b2;
                case 138945486: goto L_0x0104;
                case 1472443381: goto L_0x00ab;
                case 1615731965: goto L_0x00b7;
                default: goto L_0x00aa;
            }
        L_0x00aa:
            goto L_0x00a2
        L_0x00ab:
            java.lang.String r0 = "ۛۡۢۡۧۖۘۦ۠۫۠ۖۘۢۧۨۘۖۜۛۘ۠ۛ"
            goto L_0x0004
        L_0x00af:
            java.lang.String r0 = "۫ۖۥ۬۬ۙۙۦۥۢۙۥ۬ۥۖۙۜۧ۫ۤۜۘۤۦۥۘۥۢۗ"
            goto L_0x00a2
        L_0x00b2:
            if (r2 == 0) goto L_0x00af
            java.lang.String r0 = "ۡ۫ۗۦ۬ۥۘۗۥۧۙ۬ۘ۬ۚ۟ۦۥۜۙۦۡ۟ۘۚۘۥ۟"
            goto L_0x00a2
        L_0x00b7:
            java.lang.String r0 = "ۗۙ۠ۢۙۘۗ۬ۚۙ۠ۖۙ۬ۦۘۢۤۡ۬ۦۖ"
            goto L_0x00a2
        L_0x00ba:
            r3 = 667691098(0x27cc285a, float:5.6665124E-15)
            java.lang.String r0 = "ۜۦۗۚۤۦۘۛۥ۫ۖۨ۟ۖۦۡۘۥۡۨۢۖۡۘ"
        L_0x00bf:
            int r4 = r0.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case -1179839987: goto L_0x00d5;
                case -1138407391: goto L_0x00cf;
                case -457419391: goto L_0x00c8;
                case 475351878: goto L_0x0100;
                default: goto L_0x00c7;
            }
        L_0x00c7:
            goto L_0x00bf
        L_0x00c8:
            java.lang.String r0 = "ۜۧۢۤۦۡۘۛۧۜۘۚۦۤۨۜۖۦۢۖۘ"
            goto L_0x0004
        L_0x00cc:
            java.lang.String r0 = "۠ۧۙۥ۬ۘۘۨۛۜۘۙۛۦۘۡۖۨۥۖ۠۬ۗۢۥۧۡۙۨ۫"
            goto L_0x00bf
        L_0x00cf:
            r0 = 1
            if (r2 != r0) goto L_0x00cc
            java.lang.String r0 = "ۧ۬ۧۢۘۧۡۧۚۤ۟ۛۦۗۥۘۜ۟۬ۢۢۥۦۛۧ"
            goto L_0x00bf
        L_0x00d5:
            java.lang.String r0 = "ۜۢۨۘۦۙۨۖۙۙۚۙۜ۬ۨ۠۠۠ۨۘ۟ۤۥۤۖۡۦۚ۬"
            goto L_0x00bf
        L_0x00d8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Unknown view mode "
            r1.<init>(r0)
            java.lang.String r0 = "ۦ۟۠ۜۜۜۘۨۗۦۘ۠ۧۘ۬ۥۨ۠ۘ"
            goto L_0x0004
        L_0x00e3:
            int r0 = r6.f1319v
            r1.append(r0)
            java.lang.String r0 = "ۧ۠۠ۤۛۦۘ۟ۜۢۥۖۨۥۧۦ"
            goto L_0x0004
        L_0x00ec:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00f6:
            int r0 = r6.f1306i
            goto L_0x009c
        L_0x00f9:
            int r0 = r6.f1304g
            goto L_0x009c
        L_0x00fc:
            java.lang.String r0 = "ۗۛۤۤۡۗۦۡۤۡۤۡۧۙۡۜۜ۬ۛۧۙۗۛۘ"
            goto L_0x0004
        L_0x0100:
            java.lang.String r0 = "ۤ۟۠۠ۘۦۦۡۖۘۖۜ۠۟ۡۦۖ۫ۥۘۗ۟ۘۘ"
            goto L_0x0004
        L_0x0104:
            java.lang.String r0 = "۟۬۟ۧۢۚۥۢۨۜۜۨۜۤۥۘ"
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView.f(boolean):int");
    }

    public final void g() {
        String str = "ۨۛۦۦ۟ۙۖۥۜۘۘۨۨۘ۠۟ۜۘۡۖۚۨ۠ۖ";
        Paint paint = null;
        Paint paint2 = null;
        while (true) {
            switch ((str.hashCode() ^ 291) ^ -1555209741) {
                case -2057281577:
                    this.f1312o.setDither(true);
                    str = "۫۫ۡۘۤۙۘ۬ۥ۬ۜ۫۫ۤۢۡۘ۟ۙۘۤۧ۟";
                    break;
                case -2051884776:
                    String str2 = "ۖۚۘۘۙۥۘۗ۟ۥۢۡۜۛ۬ۖۘ۫۬ۨۘۜۖۙۜ۟ۛۢۧۚ";
                    while (true) {
                        switch (str2.hashCode() ^ 523770072) {
                            case -1423424810:
                                str = "ۘ۫ۡۙۙۥۨۧۥۤ۠ۖۘۜۜۦۡ۠";
                                continue;
                            case 522252872:
                                if (isInEditMode()) {
                                    str2 = "۟ۜۙۚ۟ۖۘۤۚۨۘ۠ۜۨۨۥۥۙۢۜ";
                                    break;
                                } else {
                                    str2 = "ۢۛۥۜۛۡۡ۬ۦۤۚۖۘۨۡ";
                                    break;
                                }
                            case 1203927517:
                                str = "ۘۢۚۘ۟ۡ۬۠ۙ۫۬ۤۘۧ۠ۥۜ۫ۗ۟ۨۛ۠ۢۛۜ";
                                continue;
                            case 1461970830:
                                str2 = "۫ۚ۬۠ۚۚۨۚۘۘۜ۬ۜۘۖۚۨۖۖۖۘ";
                                break;
                        }
                    }
                    break;
                case -1556574660:
                    str = "ۚۥۧۘۖۛۜۘۢۙ۫ۢۤۜۖۤۖۘ";
                    break;
                case -1360577144:
                    this.f1312o = paint;
                    str = "ۗ۟ۡۛۗۖۘۚۛۖۥۢۜۢۜۚۢۗۙۨۛۥۚ۫ۢ";
                    break;
                case -1298357921:
                    this.f1313p.setStyle(Paint.Style.STROKE);
                    str = "ۗۗۤۚ۟۫ۤۚۚۘۦۥ۠ۙۡۢۤۛۥۦۗ";
                    break;
                case -1239814151:
                    this.f1313p.setDither(true);
                    str = "۠۫ۚۢۛۡۦ۠۬ۚۨۘ۬ۛ۫ۙ۫ۥ۬ۧۨ۠ۚۤۦۧۚ";
                    break;
                case -934819211:
                    paint = new Paint();
                    str = "ۢۦۧۗۜۧۘۖۢۛۧۗۚۖ۠ۛۦۦۨۘۜ۫ۘۖۨۦ";
                    break;
                case -385909981:
                    setClickable(true);
                    str = "ۙۛۘ۟۟ۧۡۨ۟ۖۧۡۥۤۦ۫ۖۡ";
                    break;
                case 334239154:
                    this.f1313p.setStrokeCap(Paint.Cap.ROUND);
                    str = "ۤۚ۟ۨ۬ۗۦۚۤ۫ۢۖۗ۠۟۬ۜۘۖۨ";
                    break;
                case 454672436:
                    this.f1313p = paint2;
                    str = "ۚۖ۬ۨۨۢۖۗۖۚۧۤۛۨ۠ۗ۫ۢۢۗۚۧۡۡۘ";
                    break;
                case 709959245:
                    this.f1313p.setStrokeWidth((float) this.f1307j);
                    str = "۫ۧۥۘ۟ۛ۬ۡ۬۟۠ۡۘۦۘۙۥۗۚ";
                    break;
                case 971005744:
                    this.G = AnimationUtils.loadInterpolator(getContext(), 17563662);
                    str = "ۘ۫ۡۙۙۥۨۧۥۤ۠ۖۘۜۜۦۡ۠";
                    break;
                case 1510275336:
                    return;
                case 1727055368:
                    str = "ۢ۬ۛۚ۠ۡۘۧۗۗۥۦۧۘۨۡۨۨۥۗۚۛۥۘ۟ۦۥۘ";
                    paint2 = new Paint();
                    break;
                case 1790180276:
                    paint.setAntiAlias(true);
                    str = "ۧۤۥۘۧۗۖۥۢۥۘۖۥۧۨۧۘ";
                    break;
                case 1792262457:
                    this.F = AnimationUtils.loadInterpolator(getContext(), 17563661);
                    str = "ۘۙ۫ۧۖۛۡ۬ۥۧۢۨۥۚۡۘۡۘۘ";
                    break;
                case 1869559972:
                    this.f1313p.setColor(this.f1304g);
                    str = "ۥۦۗۨ۠ۛ۬۠ۨۜ۠ۖۘۦۤۤ۠ۖۖۖۚۦۘۢۚۤ";
                    break;
                case 1937730176:
                    this.f1313p.setStrokeJoin(Paint.Join.ROUND);
                    str = "ۘۜۖۤۤۜۢۧۘۘۘۥۥ۠ۧۨۘ۫ۤۖۘۥۦۘۘ۟ۜۛ";
                    break;
                case 1984538647:
                    paint2.setAntiAlias(true);
                    str = "ۛۦۨ۟۟ۨۘۚۡۧۘۦۦۢۥۧۘۘۖۖۗۨۚۥۘۢۨ۬";
                    break;
            }
        }
    }

    public int getAspectRatio() {
        String str = "ۡۨۤ۟ۜ۫ۖۨۘۚۨۥۦۡۢ۬۫ۡۘۢۨۖ";
        while (true) {
            switch ((str.hashCode() ^ 883) ^ 1955761041) {
                case -1885705435:
                    return this.f1303f;
                case -718521673:
                    str = "ۧۗۘۧۘۚ۫ۗۘۢۘۡۛۥۘ۟ۢۗ۬ۤۧۥۧۧ۠ۖۙ";
                    break;
            }
        }
    }

    public int getCorrectStateColor() {
        String str = "ۧۤۢۤۚ۫ۦ۟ۖۘ۟ۖۜۘۡۖۗ";
        while (true) {
            switch ((str.hashCode() ^ 781) ^ 759187627) {
                case -947224204:
                    return this.f1306i;
                case -710034878:
                    str = "۠ۤ۠ۘ۫۫۫ۧۘۧ۠ۨۦۧۖۘ";
                    break;
            }
        }
    }

    public int getDotAnimationDuration() {
        String str = "ۖۚۡۛۗۥۘۥۦۘۘۥ۟۟۬ۧۛۡۛۙ";
        while (true) {
            switch ((str.hashCode() ^ 695) ^ 1471133640) {
                case -1287187384:
                    str = "ۖۙۜ۟ۚۡۦۥۜۙۙۡۢۥۢ۫ۧۦۘ";
                    break;
                case 2065427011:
                    return this.f1310m;
            }
        }
    }

    public int getDotCount() {
        String str = "ۚۡۧۜ۫ۥۘۤۥۛۨۨۡۘۢ۬ۛۙۚۜ";
        while (true) {
            switch ((str.hashCode() ^ 153) ^ -1980787263) {
                case 1290935233:
                    str = "ۥۦۡۘۤۢۨۖۙۦ۟ۤۗۤۜۜۚۘۘۗۢۖ";
                    break;
                case 1700630668:
                    return H;
            }
        }
    }

    public int getDotNormalSize() {
        String str = "ۢۤ۬ۚۨۡۘۡ۠۬ۜ۠ۨۘۧۤۨ";
        while (true) {
            switch ((str.hashCode() ^ 267) ^ 1658073920) {
                case -1848736974:
                    str = "ۘۘۚۨۖۗۤۨۦۗ۟ۧ۬ۦۥۘۤۢۥۘۤۡۧ";
                    break;
                case -1255012277:
                    return this.f1308k;
            }
        }
    }

    public int getDotSelectedSize() {
        String str = "۫ۖۡۘۛ۠ۘۘ۟ۦۛۧ۬ۖۘۦ۬ۚ۟ۡ۠";
        while (true) {
            switch ((str.hashCode() ^ 364) ^ -680967613) {
                case -128906069:
                    return this.f1309l;
                case 1432041297:
                    str = "۟ۤۨۘۨ۟۠ۥۢۗۢۥۥۨۥ۬ۨ۫ۢۢۚ";
                    break;
            }
        }
    }

    public int getNormalStateColor() {
        String str = "ۘ۬ۙۢۦۘۖۨۜۘۚ۠ۜۘۘۤۢۨۖۡۘۙ۟ۜ۬ۤۡۘۘۨۧ";
        while (true) {
            switch ((str.hashCode() ^ 944) ^ 830139220) {
                case 734285322:
                    str = "ۦ۫۫ۦ۠ۘۘۛۢۨۘۥۤۨۨۖۘ۫ۜۘ";
                    break;
                case 1963492747:
                    return this.f1304g;
            }
        }
    }

    public int getPathEndAnimationDuration() {
        String str = "ۛۥۘۘۗۨۘۘۛۖۘۦۛۡۘۘ۟۫ۤۦۡۛۡۨۘ۫ۨۘۘۧۥ۟";
        while (true) {
            switch ((str.hashCode() ^ 390) ^ 1155292764) {
                case 1485955080:
                    return this.f1311n;
                case 1800890207:
                    str = "ۨۨۢۧۥۡۨۤۦۦ۠ۘۘۦۚ۟ۚۗۜ۟ۙۜۚ۟ۢ";
                    break;
            }
        }
    }

    public int getPathWidth() {
        String str = "ۚۢۢ۠ۗۦۘۗ۟ۘۘۙۜۦۙۦۙۨ۬ۚ۟۠ۛۧۙ";
        while (true) {
            switch ((str.hashCode() ^ 812) ^ 1622636263) {
                case -596146253:
                    return this.f1307j;
                case 1603542529:
                    str = "ۗۦۘ۬ۦۙۦۜۦۘۘۙۨۤ۟ۘۘۘۖۖ۬۬ۖۘ۟ۗۘۤۡ۟";
                    break;
            }
        }
    }

    public List<Dot> getPattern() {
        String str = "ۡۛۦ۠ۧۦ۬ۗۘۘۧ۬۬ۙۧۚۧ۟ۤۥۧ۟";
        while (true) {
            switch ((str.hashCode() ^ 388) ^ 117098615) {
                case 1959164167:
                    str = "ۥۨۦۧ۬ۚۛۖۨۘۜۥۡۙۦۘ۬ۛ۟";
                    break;
                case 2058060371:
                    return (List) this.f1315r.clone();
            }
        }
    }

    public int getPatternSize() {
        String str = "ۤۙۖۘ۬ۤۖ۬ۤ۠ۥۨۢۗۚۢ";
        while (true) {
            switch ((str.hashCode() ^ 435) ^ -458173881) {
                case -483069099:
                    str = "۟ۛۡۘۡ۫ۚۙۦۘ۟۠ۦۘۛۖۡ";
                    break;
                case 1492476945:
                    return this.f1299b;
            }
        }
    }

    public int getPatternViewMode() {
        String str = "ۡ۬ۡۢۚۛۛۥۧۥۙۥۘۡۖۦۘ";
        while (true) {
            switch ((str.hashCode() ^ 918) ^ -503731405) {
                case -18560512:
                    return this.f1319v;
                case 911703899:
                    str = "ۜۜۡ۫ۢ۟۬ۜۨۘۚۜۥۛۨۨۘۙ۟ۤۖ۬ۚ۬ۜ۠ۛۘۡۘ";
                    break;
            }
        }
    }

    public int getWrongStateColor() {
        String str = "ۜۧۧۤۗۘ۬ۚۙۖۚۦۧۘۨۘ۫ۡ";
        while (true) {
            switch ((str.hashCode() ^ 287) ^ 1552514432) {
                case 1391308872:
                    return this.f1305h;
                case 1515364200:
                    str = "ۗۚۖ۬ۤۤۘۨۖۜۜۨۖۙۦۘۤۛۥۘۧۖۤۦۨ۬ۜۘۢ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r7 = this;
            r3 = 0
            r5 = 0
            java.lang.String r0 = "ۥۦ۫ۚۙۥۤۥۨۘۚۗۜۛۤۥۘۙۢۜ۬۟ۨۚ۬ۛۢۚۙ"
            r1 = r0
            r2 = r3
            r4 = r3
        L_0x0007:
            int r0 = r1.hashCode()
            r3 = 928(0x3a0, float:1.3E-42)
            r6 = 1185727531(0x46acc42b, float:22114.084)
            r0 = r0 ^ r3
            r0 = r0 ^ r6
            switch(r0) {
                case -1114700271: goto L_0x009c;
                case -960906533: goto L_0x0092;
                case -833359837: goto L_0x0016;
                case -739702262: goto L_0x006c;
                case -403243788: goto L_0x001a;
                case 188244069: goto L_0x008a;
                case 245962398: goto L_0x0062;
                case 721718716: goto L_0x0027;
                case 1538521100: goto L_0x0036;
                case 1678081405: goto L_0x0041;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x0007
        L_0x0016:
            java.lang.String r0 = "ۖۦۥۥ۠ۗ۬ۤ۠ۡۢۙۥ۟ۨۘ۠ۛۛ"
            r1 = r0
            goto L_0x0007
        L_0x001a:
            java.lang.String r0 = "yoShareSbj"
            java.lang.String r1 = "string"
            int r3 = com.obwhatsapp.yo.yo.getID(r0, r1)
            java.lang.String r0 = "ۤۧۚۗۙۘۘۤۜ۠۫ۗۜۛۢۜۘ۫ۡۖۘۛۖۘ۬ۜۨ"
            r1 = r0
            r5 = r3
            goto L_0x0007
        L_0x0027:
            android.content.Context r0 = r7.getContext()
            java.lang.String r0 = r0.getString(r5)
            r7.announceForAccessibility(r0)
            java.lang.String r0 = "ۜۙۦ۟ۜۙۛۨۙ۟ۚۦ۟ۚۢ۟ۙۖ"
            r1 = r0
            goto L_0x0007
        L_0x0036:
            java.util.ArrayList r0 = r7.f1314q
            java.util.Iterator r3 = r0.iterator()
            java.lang.String r0 = "ۘۖۥ۫ۨۙۖۥۨ۬ۨۡۘۘۘۚۘۜ۬ۚۡۢ"
            r1 = r0
            r4 = r3
            goto L_0x0007
        L_0x0041:
            r1 = -797396259(0xffffffffd078b2dd, float:-1.66898862E10)
            java.lang.String r0 = "ۛۛۢۨۦۨۚۤۢۥۜۨۥۖۖۘ"
        L_0x0046:
            int r3 = r0.hashCode()
            r3 = r3 ^ r1
            switch(r3) {
                case -190069651: goto L_0x0097;
                case 419788297: goto L_0x0055;
                case 1238581003: goto L_0x005e;
                case 1410535920: goto L_0x004f;
                default: goto L_0x004e;
            }
        L_0x004e:
            goto L_0x0046
        L_0x004f:
            java.lang.String r0 = "ۡۘۨۘۤۚۢۡۧ۫ۚۚۗۡ۟۠ۨ۟ۘۥۤۨۘۚۗۘ"
            goto L_0x0046
        L_0x0052:
            java.lang.String r0 = "ۨ۠ۖۗۨۖۘۛۗۜۘۦۤۤۗۢۤۦۛۘۛ۫۬۬۫ۤ"
            goto L_0x0046
        L_0x0055:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = "ۨۨۙۜۦ۬ۡ۟ۨۛۚۨۚۘۚ۠ۥ۫ۥۨۜۘۢۗۜۘۤۜۧ"
            goto L_0x0046
        L_0x005e:
            java.lang.String r0 = "ۛ۟ۘۘۗۦۗۡۗۦۘ۠ۚۦۘۛۡۤۡۙۡۘ"
            r1 = r0
            goto L_0x0007
        L_0x0062:
            java.lang.Object r0 = r4.next()
            com.obwhatsapp.youbasha.ui.lockV2.patternlockview.listener.PatternLockViewListener r0 = (com.obwhatsapp.youbasha.ui.lockV2.patternlockview.listener.PatternLockViewListener) r0
            java.lang.String r1 = "۠۬ۢۥۗۡۡۘۜۨۘۘۙۨۦ۠ۖ۟ۦۙۘۘ"
            r2 = r0
            goto L_0x0007
        L_0x006c:
            r1 = -1015322307(0xffffffffc37b693d, float:-251.41109)
            java.lang.String r0 = "۠ۧۗۨۦ۫ۨۤۡۘ۫ۢۘۘۧۥ۟ۡۜ۟ۢۡۘۤۗۧ"
        L_0x0071:
            int r3 = r0.hashCode()
            r3 = r3 ^ r1
            switch(r3) {
                case -2138656586: goto L_0x0092;
                case -936260837: goto L_0x0085;
                case -299076331: goto L_0x007a;
                case 2110598360: goto L_0x0080;
                default: goto L_0x0079;
            }
        L_0x0079:
            goto L_0x0071
        L_0x007a:
            java.lang.String r0 = "ۜ۠ۘۘۢۚۡۘۦۡ۟ۚۡۤۛۜۡۘۥۗۡۤۙۤۖۘ"
            goto L_0x0071
        L_0x007d:
            java.lang.String r0 = "۠ۨۥۤۨۘۘۥۤ۟ۚۤۧۛ۫ۢۥۥۡۘ"
            goto L_0x0071
        L_0x0080:
            if (r2 == 0) goto L_0x007d
            java.lang.String r0 = "ۡۡۧ۬ۙۡۜۨۥۜ۠ۗۚۙۖ۠ۛۧۦۡۧۘۖ۟۟۠ۚ"
            goto L_0x0071
        L_0x0085:
            java.lang.String r0 = "ۜ۬ۘۡ۠ۥۘۛۗۖۨۘۘۚۥۜۦۘ۬۟۠ۜۘ"
            r1 = r0
            goto L_0x0007
        L_0x008a:
            r2.onCleared()
            java.lang.String r0 = "۠۬ۧۥۜۖۘۤۙ۫ۗ۠ۦۘۡۥ۫ۛۙۘ"
            r1 = r0
            goto L_0x0007
        L_0x0092:
            java.lang.String r0 = "ۘۖۥ۫ۨۙۖۥۨ۬ۨۡۘۘۘۚۘۜ۬ۚۡۢ"
            r1 = r0
            goto L_0x0007
        L_0x0097:
            java.lang.String r0 = "ۢۨۨۘ۫ۙۢۡۧۦۘۢۙۨۤۤ۫ۨۜۘۦۜۨۘ"
            r1 = r0
            goto L_0x0007
        L_0x009c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView.h():void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i() {
        /*
            r7 = this;
            r3 = 0
            r5 = 0
            java.lang.String r0 = "ۤۘۥۘ۠ۖۖۘۗ۫ۡۘۛ۠ۧ۠۫ۤ"
            r1 = r0
            r2 = r3
            r4 = r3
        L_0x0007:
            int r0 = r1.hashCode()
            r3 = 21
            r6 = -87547413(0xfffffffffac821eb, float:-5.1957365E35)
            r0 = r0 ^ r3
            r0 = r0 ^ r6
            switch(r0) {
                case -2146898715: goto L_0x001a;
                case -1178728096: goto L_0x0062;
                case -708704891: goto L_0x0041;
                case -182309027: goto L_0x0092;
                case 149373008: goto L_0x0036;
                case 156585251: goto L_0x009c;
                case 222610145: goto L_0x0027;
                case 580664415: goto L_0x0016;
                case 752195385: goto L_0x008a;
                case 1962403808: goto L_0x006c;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x0007
        L_0x0016:
            java.lang.String r0 = "ۛۤۦۘ۬۬ۚۨۚۗۤۥۘ۬ۘۦۤ۬۫ۙۘۖۘ"
            r1 = r0
            goto L_0x0007
        L_0x001a:
            java.lang.String r0 = "yoShareSbj"
            java.lang.String r1 = "string"
            int r3 = com.obwhatsapp.yo.yo.getID(r0, r1)
            java.lang.String r0 = "ۨ۬۬ۚ۠ۨۢۧۦۢ۫۠ۧۖ"
            r1 = r0
            r5 = r3
            goto L_0x0007
        L_0x0027:
            android.content.Context r0 = r7.getContext()
            java.lang.String r0 = r0.getString(r5)
            r7.announceForAccessibility(r0)
            java.lang.String r0 = "۫ۦ۫ۗۘۤۦ۫ۥۧۖۤ۠ۥۡۘ۬ۙۡۘ۠ۘۥۤۜ۫"
            r1 = r0
            goto L_0x0007
        L_0x0036:
            java.util.ArrayList r0 = r7.f1314q
            java.util.Iterator r3 = r0.iterator()
            java.lang.String r0 = "ۡۜۚۗۖۢۙۧۢۖۥۦۘۡۗۖۘۡۖۥۘۘۘۧۘۙۜ۠"
            r1 = r0
            r4 = r3
            goto L_0x0007
        L_0x0041:
            r1 = 1580333175(0x5e31f877, float:3.2060327E18)
            java.lang.String r0 = "ۢۡۥۘۚۙ۫ۘۤۦۘۦ۫ۥ۟۟ۖ"
        L_0x0046:
            int r3 = r0.hashCode()
            r3 = r3 ^ r1
            switch(r3) {
                case -181922650: goto L_0x0097;
                case 96780121: goto L_0x0055;
                case 368604777: goto L_0x005e;
                case 1604524047: goto L_0x004f;
                default: goto L_0x004e;
            }
        L_0x004e:
            goto L_0x0046
        L_0x004f:
            java.lang.String r0 = "ۘۢۨۘۧۨ۠ۦۙۚۢ۠ۥۘۜۛۖۥ۠ۤ۬ۚۢۨۙۘۦ۬ۜ"
            goto L_0x0046
        L_0x0052:
            java.lang.String r0 = "ۜ۟ۜۘۜۙۚۧۜۜۧ۫ۛۧۖۧۘۘۧ۟ۗۖۨۘ"
            goto L_0x0046
        L_0x0055:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = "ۗۛۥۘ۬ۦۚ۟ۡۘۘۖۜۦ۫ۤۙۧۚۗۖ۠ۜ۟۟ۦ۫۬ۦ"
            goto L_0x0046
        L_0x005e:
            java.lang.String r0 = "۠ۚۖۘۘ۟ۡۦ۬ۥۘۜۜۦ۠۟ۦۦۜۙۘ۫ۜ"
            r1 = r0
            goto L_0x0007
        L_0x0062:
            java.lang.Object r0 = r4.next()
            com.obwhatsapp.youbasha.ui.lockV2.patternlockview.listener.PatternLockViewListener r0 = (com.obwhatsapp.youbasha.ui.lockV2.patternlockview.listener.PatternLockViewListener) r0
            java.lang.String r1 = "ۗۖۗۚۨۡۘۘۘۧۤۨۖۘۗۥۥۘۡ۬ۚ"
            r2 = r0
            goto L_0x0007
        L_0x006c:
            r1 = -810521833(0xffffffffcfb06b17, float:-5.9196165E9)
            java.lang.String r0 = "ۗ۫ۙۖۘ۬ۢۨۤۤۨۥۢۘۧ۫ۥۥۘ"
        L_0x0071:
            int r3 = r0.hashCode()
            r3 = r3 ^ r1
            switch(r3) {
                case -884502244: goto L_0x0092;
                case -288229218: goto L_0x0082;
                case 1215588449: goto L_0x0085;
                case 1710779233: goto L_0x007a;
                default: goto L_0x0079;
            }
        L_0x0079:
            goto L_0x0071
        L_0x007a:
            if (r2 == 0) goto L_0x007f
            java.lang.String r0 = "ۘۘۡۗ۟ۨۛ۫۠ۖۤۧۧۨ"
            goto L_0x0071
        L_0x007f:
            java.lang.String r0 = "۠ۗۘۘۚ۠ۖۘۚۚ۠ۦۛۦۨۧۥ۟ۜۢ۬ۧ۬ۙۢۘۘ"
            goto L_0x0071
        L_0x0082:
            java.lang.String r0 = "ۜ۟ۗ۫ۦۙۤۥۦۘۡ۫۫ۖۗۛ"
            goto L_0x0071
        L_0x0085:
            java.lang.String r0 = "ۡۡۦۘۙۖۨۘ۟ۦۜۧۗۦۡۖۙۙ۫ۚۜۡۗۘۨۘۤۢ۟"
            r1 = r0
            goto L_0x0007
        L_0x008a:
            r2.onStarted()
            java.lang.String r0 = "ۦۛۖۦ۫ۘۘۤۗ۠ۗۚۖۡۧۧۧۗۨ"
            r1 = r0
            goto L_0x0007
        L_0x0092:
            java.lang.String r0 = "ۡۜۚۗۖۢۙۧۢۖۥۦۘۡۗۖۘۡۖۥۘۘۘۧۘۙۜ۠"
            r1 = r0
            goto L_0x0007
        L_0x0097:
            java.lang.String r0 = "۠ۨ۫ۚۗ۬۟ۦۜۛۤۚۙۙۖۘ۟۫ۨۨۛۢ"
            r1 = r0
            goto L_0x0007
        L_0x009c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView.i():void");
    }

    public boolean isAspectRatioEnabled() {
        String str = "ۧۤۛۜۗۘ۫ۗۨۘ۠ۨۧۡۖۘۖ۬ۦۘ";
        while (true) {
            switch ((str.hashCode() ^ 738) ^ 1832204160) {
                case 223154750:
                    return this.f1302e;
                case 1888644837:
                    str = "ۤ۫۟ۧۚ۫ۧۜۧ۬ۛۜۘۛۘۖ";
                    break;
            }
        }
    }

    public boolean isInStealthMode() {
        String str = "ۢۗۡۙۥۨۘۢۘ۠ۨۡۧ۟ۜۡ";
        while (true) {
            switch ((str.hashCode() ^ 301) ^ 269153318) {
                case -2054638509:
                    str = "۬ۙ۠ۧۦۥۘۦۢۨۘ۠ۢۗۘۘۘۤۗۥ۠۟ۨ";
                    break;
                case 1237419008:
                    return this.f1321x;
            }
        }
    }

    public boolean isInputEnabled() {
        String str = "ۖۤۘۥۛۥۘ۬ۖۖۛۦۘۤۖۡۛۘۛ۬ۜۜۘۡۚۖۘ۟ۡۧۘ";
        while (true) {
            switch ((str.hashCode() ^ 417) ^ 1137089609) {
                case -1273251964:
                    return this.f1320w;
                case 527140981:
                    str = "ۤۙ۠ۤۜ۠ۘ۫ۥۘۨۢۚۦۛ۟ۚ۫ۨۛۛۛۖۢۤۖۜۙ";
                    break;
            }
        }
    }

    public boolean isTactileFeedbackEnabled() {
        String str = "۬ۖۖۘ۠ۡۦۘۧ۟ۦۙ۠ۡۘۜ۫ۤۥۥۜۘ";
        while (true) {
            switch ((str.hashCode() ^ 632) ^ -706710980) {
                case -1293879328:
                    str = "ۜۦۦۘ۠ۥۧۙۡۗۘۢۦۢۖۤۤۡۦۘۢۧۚ";
                    break;
                case -1194628723:
                    return this.f1322y;
            }
        }
    }

    public final void j(float f2, float f3, long j2, Interpolator interpolator, DotState dotState, p pVar) {
        ValueAnimator valueAnimator = null;
        String str = "۠ۦۜۙ۬ۖ۫۫ۥۘۨۡ۠ۧۡۤۗۨۡۘ";
        while (true) {
            switch ((str.hashCode() ^ 96) ^ 1076149337) {
                case -2140775557:
                    str = "ۥۙۗۤۙۨۜۢ۠ۚ۫ۛۨ۟ۤ۟۫ۢۗۨۘ۬ۜۘ";
                    break;
                case -2033556661:
                    str = "ۘۡۨۘۛ۬ۨۘۜ۟ۨۘ۬ۡۗ۟ۥۤ۠ۚۥۨۨ";
                    break;
                case -1876309170:
                    return;
                case -1870127139:
                    valueAnimator.setInterpolator(interpolator);
                    str = "ۘۦۡۘۖۤۡۘۘ۟۫ۗۛۧۜۥۜۗ۫۫ۡ۬۠";
                    break;
                case -1173481434:
                    valueAnimator = ValueAnimator.ofFloat(new float[]{f2, f3});
                    str = "ۧۙ۟ۖۜ۬ۧ۟ۙۚ۫ۖۡ۫۫ۡۦۙۤۛۦۘۘ۫ۖۘ";
                    break;
                case -595112334:
                    str = "ۚۧۥۘۨۙۖۘۚۙۚ۫ۛۡ۠ۨۜۘۧۙۥۘ";
                    break;
                case -523188557:
                    str = "ۛۛۢ۫ۤۜۘ۫۠ۛ۫ۙ۠ۥ۟ۡۘ";
                    break;
                case 19960945:
                    valueAnimator.setDuration(j2);
                    str = "ۧۗ۠ۗۢۛۤۜۘۧۜۧۦ۠ۖۘۦۨۨۗۨ";
                    break;
                case 217152919:
                    valueAnimator.addUpdateListener(new e(this, dotState, 1));
                    str = "۫ۦۜۘۨۥۘۚۚۦ۫ۚ۟ۜ۫ۦۛ۫۬ۙۢۨ";
                    break;
                case 314436619:
                    str = "ۦ۟ۧ۠ۢۙۦۖ۟ۚۤۜۘۧۧۖۧۗۗۢ۫ۢۚۘۘۤ۬ۘۘ";
                    break;
                case 433110576:
                    valueAnimator.start();
                    str = "۬ۡۜ۬ۚۧۢۥۨۘۗۨ۠۬ۥ۬ۘۜۙۨۡۦۘ";
                    break;
                case 931190453:
                    String str2 = "ۜۤۤ۠ۢۥۜۙۖۘۗۢۨۧۧۖۨۙۛ";
                    while (true) {
                        switch (str2.hashCode() ^ 1686003803) {
                            case -1549277078:
                                str = "ۚۡۦۚۦۤ۫۬ۦۘۤۡۤ۫ۘۢۥۡۜۘۤ۟ۜۘ۬ۧ";
                                continue;
                            case -1032780216:
                                str2 = "۬ۦۖۗ۠ۛۜۘۢ۠ۢۘۘۛ۫ۦۘۤۡۨۘۙۥۧۘۤۡۤ";
                                break;
                            case -351718480:
                                if (pVar == null) {
                                    str2 = "ۜۘۚۢ۫ۨۗۨۘۧۗۖۘ۟ۘۜۨۢۗۧ۠ۙۚ۬ۨۘ۬۫ۖۘ";
                                    break;
                                } else {
                                    str2 = "ۦۤۨۘۘ۟ۡ۟ۡۤۤۢۢۤۚۗۛۡۙۤ۠ۦ۫ۦۘ";
                                    break;
                                }
                            case 178535058:
                                str = "ۗۨۙۚۡۗ۟ۙۖۙۗۖۘۘۨ۬ۡۘ۟ۤۦۘۨۜۜۘ۫۠۠";
                                continue;
                        }
                    }
                    break;
                case 1596422605:
                    str = "ۜۚۥۖۖ۬ۢۢۡۘ۬ۚ۫ۜۛۦۘ";
                    break;
                case 1645452511:
                    str = "ۢ۬ۘۢ۠ۧ۠ۡۥۘۗۙۡۘ۬ۨۖۘۥۙۙ";
                    break;
                case 1835005660:
                    valueAnimator.addListener(new b(this, pVar, 1));
                    str = "ۚۡۦۚۦۤ۫۬ۦۘۤۡۤ۫ۘۢۥۡۜۘۤ۟ۜۘ۬ۧ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x052e, code lost:
        r5 = "۠۫۬۬ۖۡۘۢۘۚ۬ۨۗۚۛۘۤۢ۠ۛ۬ۗۙۚ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0601, code lost:
        r5 = "ۗۖ۟ۘۜۡۘ۠ۖ۠ۧۨۜۢۚۦۘۥ۬ۘۘۧۛۧۨۡۨۘۗۧۚ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0166, code lost:
        r5 = "ۧ۠ۜۘ۠۟ۜۘۤۧۜۛ۬ۡۘۤۤۜۤۙۨۘۙۖ۠ۥۛۦ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r69) {
        /*
            r68 = this;
            r65 = 0
            r64 = 0
            r63 = 0
            r62 = 0
            r61 = 0
            r60 = 0
            r58 = 0
            r57 = 0
            r59 = 0
            r56 = 0
            r54 = 0
            r55 = 0
            r53 = 0
            r52 = 0
            r51 = 0
            r50 = 0
            r49 = 0
            r48 = 0
            r47 = 0
            r46 = 0
            r45 = 0
            r43 = 0
            r42 = 0
            r40 = 0
            r39 = 0
            r38 = 0
            r37 = 0
            r36 = 0
            r35 = 0
            r34 = 0
            r33 = 0
            r41 = 0
            r32 = 0
            r44 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r23 = 0
            r22 = 0
            r21 = 0
            r15 = 0
            r20 = 0
            r13 = 0
            r19 = 0
            r18 = 0
            r17 = 0
            r16 = 0
            r14 = 0
            r12 = 0
            r11 = 0
            r24 = 0
            r26 = 0
            r28 = 0
            r30 = 0
            r10 = 0
            r9 = 0
            r8 = 0
            r7 = 0
            r6 = 0
            java.lang.String r4 = "ۗۨ۬ۖ۫ۘۨۘۥ۬ۜۘ۟۬ۧۤۙ۬ۢۖۚۘۧۤ"
            r5 = r4
        L_0x0071:
            int r4 = r5.hashCode()
            r66 = 136(0x88, float:1.9E-43)
            r67 = 1060988720(0x3f3d6730, float:0.73985577)
            r4 = r4 ^ r66
            r4 = r4 ^ r67
            switch(r4) {
                case -2140205522: goto L_0x0587;
                case -2104714452: goto L_0x0514;
                case -2044138084: goto L_0x055e;
                case -1998152635: goto L_0x040a;
                case -1986374840: goto L_0x0403;
                case -1949868789: goto L_0x019e;
                case -1885294177: goto L_0x03d9;
                case -1816315177: goto L_0x0667;
                case -1734642541: goto L_0x06f1;
                case -1733320224: goto L_0x0150;
                case -1694160474: goto L_0x02fd;
                case -1693949628: goto L_0x03e7;
                case -1686715758: goto L_0x03e0;
                case -1681725368: goto L_0x0420;
                case -1625626981: goto L_0x0480;
                case -1618350415: goto L_0x00f5;
                case -1589976722: goto L_0x0257;
                case -1548951169: goto L_0x0082;
                case -1478594069: goto L_0x04d1;
                case -1464004509: goto L_0x0239;
                case -1405725342: goto L_0x05cb;
                case -1402441824: goto L_0x04a5;
                case -1334877970: goto L_0x02c6;
                case -1327270235: goto L_0x03c6;
                case -1284899094: goto L_0x048d;
                case -1249574787: goto L_0x0094;
                case -1242288936: goto L_0x04d9;
                case -1232358027: goto L_0x02cd;
                case -1191882759: goto L_0x062c;
                case -1129706607: goto L_0x0288;
                case -1089858075: goto L_0x01b3;
                case -1085051297: goto L_0x02b2;
                case -1072727878: goto L_0x0385;
                case -1062785163: goto L_0x045f;
                case -1020252256: goto L_0x0393;
                case -994910186: goto L_0x06c9;
                case -990842706: goto L_0x058e;
                case -978129530: goto L_0x0126;
                case -943260778: goto L_0x056e;
                case -931387227: goto L_0x00ed;
                case -854848707: goto L_0x021a;
                case -851098060: goto L_0x0136;
                case -836064448: goto L_0x06dd;
                case -770150159: goto L_0x05f2;
                case -749762443: goto L_0x06a5;
                case -733094976: goto L_0x01ec;
                case -663755070: goto L_0x0449;
                case -656872143: goto L_0x0086;
                case -597728727: goto L_0x0616;
                case -587851247: goto L_0x01ba;
                case -538082243: goto L_0x0647;
                case -513310264: goto L_0x01de;
                case -468645386: goto L_0x032b;
                case -442160573: goto L_0x020b;
                case -435661066: goto L_0x0660;
                case -422527020: goto L_0x063e;
                case -409746341: goto L_0x01a5;
                case -299754682: goto L_0x02bf;
                case -294924954: goto L_0x01fc;
                case -292421722: goto L_0x00e3;
                case -288416209: goto L_0x030a;
                case -156489127: goto L_0x04c4;
                case -121549807: goto L_0x051f;
                case -90480555: goto L_0x03fc;
                case -75797704: goto L_0x0454;
                case -74947753: goto L_0x0279;
                case -38939989: goto L_0x0248;
                case -10735005: goto L_0x0103;
                case 117890123: goto L_0x0498;
                case 235563110: goto L_0x0546;
                case 353994941: goto L_0x008a;
                case 355774392: goto L_0x038c;
                case 364161783: goto L_0x0281;
                case 475863216: goto L_0x02f0;
                case 542766323: goto L_0x06e7;
                case 548391848: goto L_0x0320;
                case 637606304: goto L_0x0439;
                case 661373546: goto L_0x009c;
                case 702956563: goto L_0x059c;
                case 718302988: goto L_0x03a1;
                case 723821899: goto L_0x04e7;
                case 796200517: goto L_0x01ac;
                case 799947208: goto L_0x03ee;
                case 834430308: goto L_0x026e;
                case 875167899: goto L_0x0554;
                case 911403999: goto L_0x033f;
                case 1067987483: goto L_0x0575;
                case 1098141732: goto L_0x0157;
                case 1188777624: goto L_0x03f5;
                case 1189804644: goto L_0x05a3;
                case 1197270639: goto L_0x00fc;
                case 1220436539: goto L_0x06b5;
                case 1246794238: goto L_0x039a;
                case 1264070700: goto L_0x00a6;
                case 1325333722: goto L_0x0595;
                case 1379603204: goto L_0x061e;
                case 1547454934: goto L_0x06ce;
                case 1644762804: goto L_0x017b;
                case 1644998773: goto L_0x06bf;
                case 1684616960: goto L_0x0411;
                case 1760740821: goto L_0x0650;
                case 1770801623: goto L_0x057b;
                case 1804725211: goto L_0x0368;
                case 1816529017: goto L_0x028f;
                case 1850805115: goto L_0x022a;
                case 1906325387: goto L_0x00cc;
                case 1919974100: goto L_0x0266;
                case 1939738078: goto L_0x0315;
                case 1974542730: goto L_0x04f2;
                case 1994304386: goto L_0x0336;
                case 2021548379: goto L_0x0581;
                case 2060000708: goto L_0x0659;
                case 2066341192: goto L_0x0149;
                case 2134815034: goto L_0x0353;
                default: goto L_0x0081;
            }
        L_0x0081:
            goto L_0x0071
        L_0x0082:
            java.lang.String r4 = "۬ۧۨۦ۬ۗۘ۫۫ۛۨ۬ۦۙۤۦۧۘۨۖۨ"
            r5 = r4
            goto L_0x0071
        L_0x0086:
            java.lang.String r4 = "۫۠۟ۤۜۥۜ۠ۡۘۛۘۘۙۧۨۘۦۛۚۤۧۗ۫ۨ۬"
            r5 = r4
            goto L_0x0071
        L_0x008a:
            r0 = r68
            java.util.ArrayList r0 = r0.f1315r
            r65 = r0
            java.lang.String r4 = "ۡۘۥۘۚۨ۠ۧ۫ۘۤۨۧۤۘۨۘۚۥۤۜۡ۬ۖۧۛ۟ۥ۬"
            r5 = r4
            goto L_0x0071
        L_0x0094:
            int r64 = r65.size()
            java.lang.String r4 = "ۙۡۡۘ۟ۛۛۨۙۜۚ۠ۦۥۖۜۘۥ۫ۨۙۤۘۘۖ۠ۧۗۗۘۘ"
            r5 = r4
            goto L_0x0071
        L_0x009c:
            r0 = r68
            boolean[][] r0 = r0.f1316s
            r63 = r0
            java.lang.String r4 = "ۧ۟ۨۖۛۤۚۥۜۘ۠ۙ۟ۦۘۖۤۢۘۨ۟ۡۘ"
            r5 = r4
            goto L_0x0071
        L_0x00a6:
            r5 = -1885547081(0xffffffff8f9cd5b7, float:-1.5465108E-29)
            java.lang.String r4 = "۠ۤۥۦۖۙ۠۟ۦۘ۫ۗۥۜۡۘۢۧۚۤ۟ۡۘ۫ۖۨۘ"
        L_0x00ab:
            int r66 = r4.hashCode()
            r66 = r66 ^ r5
            switch(r66) {
                case -811817578: goto L_0x00c8;
                case -163482952: goto L_0x00bb;
                case 36456520: goto L_0x06c4;
                case 286388447: goto L_0x00b5;
                default: goto L_0x00b4;
            }
        L_0x00b4:
            goto L_0x00ab
        L_0x00b5:
            java.lang.String r4 = "ۤ۫ۦ۫ۤۖۚۖۘۛۨۨۘۗۥۨۘۜ۬ۘ۫ۡۜۘ"
            goto L_0x00ab
        L_0x00b8:
            java.lang.String r4 = "ۗۚۖۧۗۥ۟ۖۡۘۘۨۧۘۘ۟ۖۘۧۜ۬ۖۦ۬"
            goto L_0x00ab
        L_0x00bb:
            r0 = r68
            int r4 = r0.f1319v
            r66 = 1
            r0 = r66
            if (r4 != r0) goto L_0x00b8
            java.lang.String r4 = "۟ۢۤ۬ۨۛۥۘۨۘۜۦۨۚ۫۟ۦۖ۫۠ۢۜۘ"
            goto L_0x00ab
        L_0x00c8:
            java.lang.String r4 = "ۤ۬ۚۧۙۛ۫ۧۦۖۨۥۦۚۜ۠ۜۗ"
            r5 = r4
            goto L_0x0071
        L_0x00cc:
            long r4 = android.os.SystemClock.elapsedRealtime()
            r0 = r68
            long r0 = r0.f1300c
            r66 = r0
            long r4 = r4 - r66
            int r4 = (int) r4
            int r5 = r64 + 1
            int r5 = r5 * 700
            int r62 = r4 % r5
            java.lang.String r4 = "ۗ۫۠ۗۖۗۢۥۚۦۘۚۧۥۛۥۥۚۗۡۘ۬۬ۗۤ۬ۥۘ"
            r5 = r4
            goto L_0x0071
        L_0x00e3:
            r0 = r62
            int r0 = r0 / 700
            r61 = r0
            java.lang.String r4 = "ۨۢۜۦۜۡۡۤۛۤۦۡ۫ۧۡۘۜ۟ۘۘۢ۟ۤۙۗ۠ۚۖۘۘ"
            r5 = r4
            goto L_0x0071
        L_0x00ed:
            r68.b()
            java.lang.String r4 = "ۤ۠۫ۨۜۖۘۜۡۖۡ۠۬۠ۢ۬"
            r5 = r4
            goto L_0x0071
        L_0x00f5:
            r60 = 0
            java.lang.String r4 = "ۙ۠ۖۘۙۥۥۖۛۖۙۖۖۘۛۡۨۘۤۗ۠"
            r5 = r4
            goto L_0x0071
        L_0x00fc:
            java.lang.String r4 = "ۗۨۡۘ۫ۥۜ۠ۡۜۚۙۤ۬ۥۘ"
            r5 = r4
            r59 = r60
            goto L_0x0071
        L_0x0103:
            r5 = -867127860(0xffffffffcc50adcc, float:-5.470392E7)
            java.lang.String r4 = "ۙۘۛۤۧ۠ۜۙۢ۠ۖۘۤۜۘۘ"
        L_0x0108:
            int r66 = r4.hashCode()
            r66 = r66 ^ r5
            switch(r66) {
                case -954999333: goto L_0x0123;
                case -422437201: goto L_0x0112;
                case 611052058: goto L_0x011a;
                case 649418731: goto L_0x06ba;
                default: goto L_0x0111;
            }
        L_0x0111:
            goto L_0x0108
        L_0x0112:
            java.lang.String r4 = "ۤۥۨ۠ۚ۟ۧۘۘۥۗۥۖۤۨۘۢۡۗۢ۫ۗ"
            r5 = r4
            goto L_0x0071
        L_0x0117:
            java.lang.String r4 = "ۙۗۦۘۡۘۜۗۢۢۡۡۚۙۖۦۘ"
            goto L_0x0108
        L_0x011a:
            r0 = r59
            r1 = r61
            if (r0 >= r1) goto L_0x0117
            java.lang.String r4 = "ۗۧۢۘ۬ۥۘ۬ۡۥۤۗۜۘۛ۬ۛۚ۫ۡۘ۠ۙۖۛۜۖۦۗۖۘ"
            goto L_0x0108
        L_0x0123:
            java.lang.String r4 = "ۡ۫ۤۧ۫ۘۜۜۙۚۦۛ۬ۙ۬ۜ۟ۚ۫ۦ"
            goto L_0x0108
        L_0x0126:
            r0 = r65
            r1 = r59
            java.lang.Object r4 = r0.get(r1)
            com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView$Dot r4 = (com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView.Dot) r4
            java.lang.String r5 = "ۘۛ۠ۦۜ۬۟ۖ۠ۚ۠ۖۘۜۢۗۙۛۡۘۢۜۙۥۥۙ"
            r58 = r4
            goto L_0x0071
        L_0x0136:
            r0 = r58
            int r4 = r0.f1325a
            r4 = r63[r4]
            r0 = r58
            int r5 = r0.f1326b
            r66 = 1
            r4[r5] = r66
            java.lang.String r4 = "ۗ۟ۨۘۦۧۤۛۨۖۘۢۥۙ۠ۚۦۘۧۢۘۛۘۜۙۚۛ"
            r5 = r4
            goto L_0x0071
        L_0x0149:
            int r57 = r59 + 1
            java.lang.String r4 = "ۘ۟ۜۛۥۧۘۦۛۡ۬ۡۜۤۦۥۘ۫۟۠ۜ۬ۜۘ"
            r5 = r4
            goto L_0x0071
        L_0x0150:
            java.lang.String r4 = "ۙ۫ۙۦۤۦۧۘۘۢۜۚۥۡۦۘ۟ۙ۫۠ۥۦۘۦۧۤ"
            r5 = r4
            r59 = r57
            goto L_0x0071
        L_0x0157:
            r5 = 729513200(0x2b7b7cf0, float:8.93465E-13)
            java.lang.String r4 = "ۤ۫ۖۨۤ۠ۦۤۖۘ۫۟ۨۘۤۥۘۗۘۖۛ۟۠۠ۤۤۡۦۜۘ"
        L_0x015c:
            int r66 = r4.hashCode()
            r66 = r66 ^ r5
            switch(r66) {
                case -1984671252: goto L_0x016e;
                case -1556210988: goto L_0x0173;
                case -872857946: goto L_0x0176;
                case 277675299: goto L_0x0166;
                default: goto L_0x0165;
            }
        L_0x0165:
            goto L_0x015c
        L_0x0166:
            java.lang.String r4 = "ۧ۠ۜۘ۠۟ۜۘۤۧۜۛ۬ۡۘۤۤۜۤۙۨۘۙۖ۠ۥۛۦ"
            r5 = r4
            goto L_0x0071
        L_0x016b:
            java.lang.String r4 = "ۛۛۜۥ۟ۜ۠ۚۜۘۘ۫ۖۘۦۗۚۨۧۜۘ"
            goto L_0x015c
        L_0x016e:
            if (r61 <= 0) goto L_0x016b
            java.lang.String r4 = "ۡۚۡ۠ۧۖۘۤۥۧۤۖۗۖۗۘۘ۟ۦۜ"
            goto L_0x015c
        L_0x0173:
            java.lang.String r4 = "ۤۢۨۘۙۢۡۧۖۚ۟ۘۡۨۛۘۘۜ۬ۜۘۖۙۡۘ۬ۦۜۘ"
            goto L_0x015c
        L_0x0176:
            java.lang.String r4 = "ۧ۬ۧ۫ۡۢۦۥۙ۬ۘۧۧۖۘۨۧۚۘۘۥۘ۠۟ۛ"
            r5 = r4
            goto L_0x0071
        L_0x017b:
            r5 = 120656893(0x73113fd, float:1.3321874E-34)
            java.lang.String r4 = "ۗ۠۟ۚۦ۟ۧۜۜۛۛ۟ۗۚۦ"
        L_0x0180:
            int r66 = r4.hashCode()
            r66 = r66 ^ r5
            switch(r66) {
                case -2143300685: goto L_0x0192;
                case -2036703582: goto L_0x018a;
                case -998350541: goto L_0x0166;
                case 1970424775: goto L_0x019b;
                default: goto L_0x0189;
            }
        L_0x0189:
            goto L_0x0180
        L_0x018a:
            java.lang.String r4 = "۟۟۟۫ۖۥۘۖۦۢ۫ۦۧ۠ۚۘۘۢۤۥۘۜ۟ۜ"
            r5 = r4
            goto L_0x0071
        L_0x018f:
            java.lang.String r4 = "ۚ۟ۜۘۧۨۖۘۡۢۖۘ۠ۨۥۢۢۖۘۥ۠ۗۨۦۖۖ۟۫"
            goto L_0x0180
        L_0x0192:
            r0 = r61
            r1 = r64
            if (r0 >= r1) goto L_0x018f
            java.lang.String r4 = "ۜۧۡۘۜۘۘۧۛۡۘۚ۟ۡۧ۫ۙۖۗۧ۟ۚۙۧۛۨۘۙۡۜ"
            goto L_0x0180
        L_0x019b:
            java.lang.String r4 = "ۥۙۢۚ۫۠ۧۜۦۘۨۗۛۦۛۧۙۨۜ"
            goto L_0x0180
        L_0x019e:
            r56 = 1
            java.lang.String r4 = "۟ۘۖۤۖۥۘۗۢۗۧۚۖۛ۟۬ۨ۠ۢۡۥۖۤ۟ۖۘۛۚۖ"
            r5 = r4
            goto L_0x0071
        L_0x01a5:
            java.lang.String r4 = "ۚۨۖۘۨۙۥۘۤۥ۠ۡۢۖۗۙۗ۠ۤ۟ۜۙ"
            r5 = r4
            r55 = r56
            goto L_0x0071
        L_0x01ac:
            r54 = 0
            java.lang.String r4 = "ۤ۬ۡۚۤۛ۠۫ۘ۫ۖۘۛۚۙۖۘۢۧۦۘۘ"
            r5 = r4
            goto L_0x0071
        L_0x01b3:
            java.lang.String r4 = "ۦۦۖ۫ۢۗۤۥ۬ۡۜۘۘ۠۟ۤ"
            r5 = r4
            r55 = r54
            goto L_0x0071
        L_0x01ba:
            r5 = 65133956(0x3e1dd84, float:1.3275169E-36)
            java.lang.String r4 = "۫ۘۦۘ۠ۧۧۚۗۡۘ۟ۨۛۖۧۛۙۡۜۘ"
        L_0x01bf:
            int r66 = r4.hashCode()
            r66 = r66 ^ r5
            switch(r66) {
                case -1434266520: goto L_0x01c9;
                case -927690801: goto L_0x01d6;
                case -847895196: goto L_0x01d9;
                case 1854958325: goto L_0x01d1;
                default: goto L_0x01c8;
            }
        L_0x01c8:
            goto L_0x01bf
        L_0x01c9:
            java.lang.String r4 = "ۜۖۙۙۡۙۢ۠ۦۚۥ۟۬۬ۙۤ۠ۧ۫ۨۦۗ۠ۡۘ۬۟ۘۘ"
            r5 = r4
            goto L_0x0071
        L_0x01ce:
            java.lang.String r4 = "۫ۖۡۘ۬ۥۥۢ۬ۛۛ۟ۢۧ۬ۦۘۥ۫ۦۧ۟ۧۨۦۧۘ"
            goto L_0x01bf
        L_0x01d1:
            if (r55 == 0) goto L_0x01ce
            java.lang.String r4 = "۟ۜۧۚۦ۫ۗۤ۟ۜۢۡۚۡۡۗ۠ۡۗۧۨۘۧۥۚۙۤۖ"
            goto L_0x01bf
        L_0x01d6:
            java.lang.String r4 = "ۥۥۖۦۙۨۘۧۖ۬ۡۥۖۥ۠ۗۜۙۢۜ۠ۖ۠ۥ"
            goto L_0x01bf
        L_0x01d9:
            java.lang.String r4 = "ۖۚۙۦۙۧۜۚۡ۫۠ۦ۟ۛۜۘۛ۟ۜۛۘۘۚۢۖۘۥۙۖ"
            r5 = r4
            goto L_0x0071
        L_0x01de:
            r0 = r62
            int r4 = r0 % 700
            float r4 = (float) r4
            r5 = 1143930880(0x442f0000, float:700.0)
            float r53 = r4 / r5
            java.lang.String r4 = "ۙ۫۬۟ۙۨۘۢۦۨۖ۠ۡۘۧۖ۬۬۠ۗۥۡۘۙۗۥۘۦۨۨۘ"
            r5 = r4
            goto L_0x0071
        L_0x01ec:
            int r4 = r61 + -1
            r0 = r65
            java.lang.Object r4 = r0.get(r4)
            com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView$Dot r4 = (com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView.Dot) r4
            java.lang.String r5 = "ۡۧۦۘۨۢۡۘۥ۬ۨۡۦۢۘۚۜۙۥ۟"
            r52 = r4
            goto L_0x0071
        L_0x01fc:
            r0 = r52
            int r4 = r0.f1326b
            r0 = r68
            float r51 = r0.d(r4)
            java.lang.String r4 = "ۢۚۧ۠ۚۘۘ۬ۛ۟ۨۛۗ۫ۘۨۘۛۜۖ"
            r5 = r4
            goto L_0x0071
        L_0x020b:
            r0 = r52
            int r4 = r0.f1325a
            r0 = r68
            float r50 = r0.e(r4)
            java.lang.String r4 = "۫ۛ۟ۢۨۚۥۜۜۘ۬ۡۜۘۙۢۦۖ۠ۢ۠ۡ"
            r5 = r4
            goto L_0x0071
        L_0x021a:
            r0 = r65
            r1 = r61
            java.lang.Object r4 = r0.get(r1)
            com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView$Dot r4 = (com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView.Dot) r4
            java.lang.String r5 = "ۜۢۥۘۘ۬۬ۨۢۨۜۛۖۘۧۦۥۖۘۡ۠ۘۦۢۦۡ۠۠ۛ"
            r49 = r4
            goto L_0x0071
        L_0x022a:
            r0 = r49
            int r4 = r0.f1326b
            r0 = r68
            float r48 = r0.d(r4)
            java.lang.String r4 = "ۡۚۘۘ۫ۛ۫ۙۤۙۚۢۥۧۚ۠ۧۜ۬"
            r5 = r4
            goto L_0x0071
        L_0x0239:
            r0 = r49
            int r4 = r0.f1325a
            r0 = r68
            float r47 = r0.e(r4)
            java.lang.String r4 = "۟ۗۧۢۤ۫۫ۤۙ۟۟ۖۘۗۤۨ"
            r5 = r4
            goto L_0x0071
        L_0x0248:
            float r4 = r48 - r51
            float r4 = r4 * r53
            float r4 = r4 + r51
            r0 = r68
            r0.f1317t = r4
            java.lang.String r4 = "ۗۨ۬ۘۤۘۘۘ۬ۘۚۥۨۘۤۥۘۛۨ۠ۛ۠۫ۡۨۘۡۦۚ"
            r5 = r4
            goto L_0x0071
        L_0x0257:
            float r4 = r47 - r50
            float r4 = r4 * r53
            float r4 = r4 + r50
            r0 = r68
            r0.f1318u = r4
            java.lang.String r4 = "ۜۖۙۙۡۙۢ۠ۦۚۥ۟۬۬ۙۤ۠ۧ۫ۨۦۗ۠ۡۘ۬۟ۘۘ"
            r5 = r4
            goto L_0x0071
        L_0x0266:
            r68.invalidate()
            java.lang.String r4 = "ۘۖ۫ۖۥ۠ۛۥ۠ۡۚۡۛۡۘ"
            r5 = r4
            goto L_0x0071
        L_0x026e:
            r0 = r68
            android.graphics.Path r0 = r0.C
            r46 = r0
            java.lang.String r4 = "ۢ۟ۜۘۦۥ۟ۧ۬ۘۘۡۦۡ۠ۖۡۘۥۗۘۘ"
            r5 = r4
            goto L_0x0071
        L_0x0279:
            r46.rewind()
            java.lang.String r4 = "ۙ۠ۢۚۙ۫ۦۢۖۚۦۨۘۛ۫ۦۘۘۙۗۚۗ۠ۡۖۘ"
            r5 = r4
            goto L_0x0071
        L_0x0281:
            r45 = 0
            java.lang.String r4 = "ۢ۟ۙ۠ۜۨ۬ۦۙۥۧۡۘۚۙۘۢۦۨ۠ۨۚۘۗۧ"
            r5 = r4
            goto L_0x0071
        L_0x0288:
            java.lang.String r4 = "۬ۖۦۘۤۢ۟ۢۜ۠۫ۜۥۗۧۤ"
            r5 = r4
            r44 = r45
            goto L_0x0071
        L_0x028f:
            r5 = 245297110(0xe9eefd6, float:3.918096E-30)
            java.lang.String r4 = "۠ۜۥۘۛۗۖۥۜۧۨ۟۠ۛ۬ۜۘۖۜۘۘ۫ۥۧۘ۟ۗ۠"
        L_0x0294:
            int r66 = r4.hashCode()
            r66 = r66 ^ r5
            switch(r66) {
                case -377646458: goto L_0x02af;
                case -154614348: goto L_0x06d8;
                case 20600862: goto L_0x029e;
                case 373750288: goto L_0x02a6;
                default: goto L_0x029d;
            }
        L_0x029d:
            goto L_0x0294
        L_0x029e:
            java.lang.String r4 = "ۥ۬ۘۘۡ۫ۡۚ۬۫ۘ۫ۢ۬ۤ۟۠ۘ۫ۛۗۡۘۨ۠ۥۘۚۚۡۘ"
            r5 = r4
            goto L_0x0071
        L_0x02a3:
            java.lang.String r4 = "ۘۤ۬ۛۖۥۜۖۧۘۘ۠ۜۘۙۦۨ"
            goto L_0x0294
        L_0x02a6:
            int r4 = H
            r0 = r44
            if (r0 >= r4) goto L_0x02a3
            java.lang.String r4 = "ۧۘۤۥۘ۠ۙۗۖۥۗ۟ۛ۫۬ۨۢ۟ۧ۬ۥۘ"
            goto L_0x0294
        L_0x02af:
            java.lang.String r4 = "ۘۧۥۛ۠ۜۨۤۦۘۡ۫ۖۥ۠۠"
            goto L_0x0294
        L_0x02b2:
            r0 = r68
            r1 = r44
            float r43 = r0.e(r1)
            java.lang.String r4 = "ۛ۫ۘۚۤ۬۟ۤۖۨۜۢۧ۬ۚ"
            r5 = r4
            goto L_0x0071
        L_0x02bf:
            r42 = 0
            java.lang.String r4 = "ۚۨۛۧۤۜۘۢۛۦۡۜۦۘ۟ۙۙۥۖۙۗۧۧ۫ۚۛۨ"
            r5 = r4
            goto L_0x0071
        L_0x02c6:
            java.lang.String r4 = "ۥۛۜۘۛ۠ۡۚۗۜۘ۫ۤ۬ۢ۬ۧ"
            r5 = r4
            r41 = r42
            goto L_0x0071
        L_0x02cd:
            r5 = 863439281(0x337709b1, float:5.7517983E-8)
            java.lang.String r4 = "ۖ۠ۢۧۤۦۘۤ۠ۛۨ۠ۘۘۤ۟ۖۘ"
        L_0x02d2:
            int r66 = r4.hashCode()
            r66 = r66 ^ r5
            switch(r66) {
                case -2144404424: goto L_0x06d3;
                case -1293945092: goto L_0x02dc;
                case -187883918: goto L_0x02eb;
                case 634727039: goto L_0x02e8;
                default: goto L_0x02db;
            }
        L_0x02db:
            goto L_0x02d2
        L_0x02dc:
            int r4 = H
            r0 = r41
            if (r0 >= r4) goto L_0x02e5
            java.lang.String r4 = "ۖۖ۟ۚۘۗۡۛۜۧ۠ۢۛۦۘۦۤۨۘ۫ۗۖۘۛۙۛ۬ۥۘۘ"
            goto L_0x02d2
        L_0x02e5:
            java.lang.String r4 = "ۡۢ۟۫ۙۚۥۨۘۨۘۖۘۦۥۜۧۜۨۘ"
            goto L_0x02d2
        L_0x02e8:
            java.lang.String r4 = "ۖ۫ۘۙۖۡۘۚۦۡۢۙۚۦۥۧ"
            goto L_0x02d2
        L_0x02eb:
            java.lang.String r4 = "ۗۜۜۘ۫ۚۛۦۗۨۦۢۧ۠ۘۨۘ۫ۛۧۖ۠ۛۚۙۨ"
            r5 = r4
            goto L_0x0071
        L_0x02f0:
            r0 = r68
            com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView$DotState[][] r4 = r0.f1298a
            r4 = r4[r44]
            r40 = r4[r41]
            java.lang.String r4 = "۟ۜۘۨۘۗ۬۟ۡۡۘۘۘۖۙۖۘۢۧۡ۠ۜۜۦۥ۟"
            r5 = r4
            goto L_0x0071
        L_0x02fd:
            r0 = r68
            r1 = r41
            float r39 = r0.d(r1)
            java.lang.String r4 = "۬۫ۨۚۤۡۘۤۦ۠ۢۡۛ۬ۢۡۘۦ۬ۜۘ"
            r5 = r4
            goto L_0x0071
        L_0x030a:
            r0 = r40
            float r0 = r0.f1329c
            r38 = r0
            java.lang.String r4 = "ۦۢ۟ۦۦۚۚۢۨۘۜۡۖۘۢۜۜۛۡۘ۟ۚۖۘۘۚۜۗۥ۫"
            r5 = r4
            goto L_0x0071
        L_0x0315:
            r0 = r40
            float r0 = r0.f1327a
            r37 = r0
            java.lang.String r4 = "۬ۤ۠ۗۖۥۘۦۙۜۢۧۗۧۡۙۚۨۚ"
            r5 = r4
            goto L_0x0071
        L_0x0320:
            r0 = r39
            int r4 = (int) r0
            float r0 = (float) r4
            r36 = r0
            java.lang.String r4 = "ۧ۬ۤ۫ۦۢۥۖۦ۠۫ۗۗۘۖۦ۟۬۬ۧۦ"
            r5 = r4
            goto L_0x0071
        L_0x032b:
            r0 = r43
            int r4 = (int) r0
            float r0 = (float) r4
            r35 = r0
            java.lang.String r4 = "۠ۛۖۘ۟ۨۤ۫ۤۧۙۥۙۛۜۘ"
            r5 = r4
            goto L_0x0071
        L_0x0336:
            r4 = r63[r44]
            boolean r34 = r4[r41]
            java.lang.String r4 = "ۦ۟ۘۧۧۡ۫ۙۡ۠ۖۡۘ۠ۧۖ۟ۡۚ"
            r5 = r4
            goto L_0x0071
        L_0x033f:
            r0 = r68
            android.graphics.Paint r4 = r0.f1312o
            r0 = r68
            r1 = r34
            int r5 = r0.f(r1)
            r4.setColor(r5)
            java.lang.String r4 = "ۚ۬۠ۦۦۨۘۡۚۛ۫۬۟ۡۖۨۛۖۡۖۖۥۘۢ"
            r5 = r4
            goto L_0x0071
        L_0x0353:
            r0 = r68
            android.graphics.Paint r4 = r0.f1312o
            r0 = r40
            float r5 = r0.f1328b
            r66 = 1132396544(0x437f0000, float:255.0)
            float r5 = r5 * r66
            int r5 = (int) r5
            r4.setAlpha(r5)
            java.lang.String r4 = "ۛۥۦۡۦۛۖۜۦۘ۫۬ۜ۫ۙۚ"
            r5 = r4
            goto L_0x0071
        L_0x0368:
            r4 = 0
            float r4 = r4 + r35
            float r5 = r38 * r37
            r66 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r66
            r0 = r68
            android.graphics.Paint r0 = r0.f1312o
            r66 = r0
            r0 = r69
            r1 = r36
            r2 = r66
            r0.drawCircle(r1, r4, r5, r2)
            java.lang.String r4 = "ۦۘۖ۫ۢۡ۟ۤ۫ۦۤۘ۫ۘۚ۫ۙۡۘۨۗ۠ۡ۠ۚ"
            r5 = r4
            goto L_0x0071
        L_0x0385:
            int r33 = r41 + 1
            java.lang.String r4 = "ۖۤۘۘۙ۫ۢ۬۬ۦۘ۟ۚۛۗ۫ۜۘۢ۬ۜۘۢۦۙۨۛ۠ۚ"
            r5 = r4
            goto L_0x0071
        L_0x038c:
            java.lang.String r4 = "ۦۨۡۧۥ۬ۡۙۘۗ۬ۤۘۗ۫"
            r5 = r4
            r41 = r33
            goto L_0x0071
        L_0x0393:
            int r32 = r44 + 1
            java.lang.String r4 = "ۛ۫ۜۥۨۖ۫ۦۨۚۤۨۘۘ۬ۖۡۘۧۨ۠"
            r5 = r4
            goto L_0x0071
        L_0x039a:
            java.lang.String r4 = "ۦۢ۫ۖۖۧۜۜۦۘۥۚۚۜۢۨۛ۠ۜ۠ۧ۠ۢۖ۫"
            r5 = r4
            r44 = r32
            goto L_0x0071
        L_0x03a1:
            r5 = 1593413527(0x5ef98f97, float:8.9913789E18)
            java.lang.String r4 = "ۤ۠ۦۢ۬ۛۧۡۙۨۥۨۘۧۧ"
        L_0x03a6:
            int r66 = r4.hashCode()
            r66 = r66 ^ r5
            switch(r66) {
                case 543372524: goto L_0x03c1;
                case 1508890170: goto L_0x03be;
                case 1527164690: goto L_0x03b0;
                case 1916312032: goto L_0x0601;
                default: goto L_0x03af;
            }
        L_0x03af:
            goto L_0x03a6
        L_0x03b0:
            r0 = r68
            boolean r4 = r0.f1321x
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x03bb
            java.lang.String r4 = "ۧ۫ۦ۠ۖ۠۫ۗۥۨ۟۠۬ۡۘۨۘۡۦۡۥۨۘۡ"
            goto L_0x03a6
        L_0x03bb:
            java.lang.String r4 = "ۦۜۗۖۜۡۤۛۦ۬ۘۦۘۜۘۦۦۙۗۛۦۦۘۜۡۦ"
            goto L_0x03a6
        L_0x03be:
            java.lang.String r4 = "ۥ۠ۗۛ۬ۡ۠ۥۡۥۢۦۜۘۗۦۘۛ۟۫"
            goto L_0x03a6
        L_0x03c1:
            java.lang.String r4 = "ۘۜۜۘۘ۬ۛۖ۠ۢۙۡۧۛۙۧۗ۠۬ۦۛۧۡ۟۫ۦ۠"
            r5 = r4
            goto L_0x0071
        L_0x03c6:
            r0 = r68
            android.graphics.Paint r4 = r0.f1313p
            r5 = 1
            r0 = r68
            int r5 = r0.f(r5)
            r4.setColor(r5)
            java.lang.String r4 = "ۡۢۢۙۡۨۗۦۜۗۢۜۨۖۨۤۦ۫۬۫ۘ"
            r5 = r4
            goto L_0x0071
        L_0x03d9:
            r25 = 0
            java.lang.String r4 = "ۡۙۨۜۧۥۘۗۛۡ۟ۡۘۘۙۧۨۨۚۥ"
            r5 = r4
            goto L_0x0071
        L_0x03e0:
            r27 = 0
            java.lang.String r4 = "ۦۘۡۙۜۗ۟ۗۚۗۥ۟ۛۜۤۛۤ۫۟ۘۘۢۢۨ"
            r5 = r4
            goto L_0x0071
        L_0x03e7:
            r29 = 0
            java.lang.String r4 = "ۘ۠ۨۙۖ۬ۗۚۡۙ۟ۚۥۧ۠ۙۥۘ۟۠ۜۘ"
            r5 = r4
            goto L_0x0071
        L_0x03ee:
            r31 = 0
            java.lang.String r4 = "۬۟ۨۘۡۗ۟ۜۡۧۧۙۤۨ۬ۨۚۥۙ"
            r5 = r4
            goto L_0x0071
        L_0x03f5:
            java.lang.String r4 = "۟ۛۤۡۨۚ۬ۥۦۘۤ۬ۡۘ۟ۘۛ"
            r5 = r4
            r30 = r31
            goto L_0x0071
        L_0x03fc:
            java.lang.String r4 = "ۜۖۘۘ۫۬ۥۙۧۧۦۢۧ۫ۙۜۘۖۤۨۨۜ۟۫ۦۢ"
            r5 = r4
            r28 = r29
            goto L_0x0071
        L_0x0403:
            java.lang.String r4 = "۠ۗۛ۬ۡۨۘ۟۬ۗۡ۬ۥۘۤۡۜ۫ۧۛۜۗۧۧۤۧ"
            r5 = r4
            r26 = r27
            goto L_0x0071
        L_0x040a:
            java.lang.String r4 = "۠ۛۧ۟۫ۖۘۥۚۨۘۙ۬ۨ۬ۘۚ"
            r5 = r4
            r24 = r25
            goto L_0x0071
        L_0x0411:
            r5 = 918869225(0x36c4d4e9, float:5.866041E-6)
            java.lang.String r4 = "ۖۨۘۘۧۗۨۘۢۜۛۛۢۘۚۨۢۛۡۘ۬ۧۖۘۙۥۢ"
        L_0x0416:
            int r66 = r4.hashCode()
            r66 = r66 ^ r5
            switch(r66) {
                case -1227096395: goto L_0x0420;
                case -1176441791: goto L_0x0434;
                case -732843344: goto L_0x0428;
                case -681004686: goto L_0x0431;
                default: goto L_0x041f;
            }
        L_0x041f:
            goto L_0x0416
        L_0x0420:
            java.lang.String r4 = "ۚۛۚ۬ۢۜۤۙۨۤۜۧ۠ۥۘۙۧۘۤۤۜۘ"
            r5 = r4
            goto L_0x0071
        L_0x0425:
            java.lang.String r4 = "ۜۖۜۘۙۨ۫ۦ۫ۗۢۤۤۡۚ۫"
            goto L_0x0416
        L_0x0428:
            r0 = r24
            r1 = r64
            if (r0 >= r1) goto L_0x0425
            java.lang.String r4 = "ۦۤۥۥۡۘ۫ۚۤۥۤ۟ۜۘۗ"
            goto L_0x0416
        L_0x0431:
            java.lang.String r4 = "۬ۛۨۘ۫ۡۜ۟۫ۖ۠ۦ۫ۗۢۜۘۚ۬ۦۘۥۖۦ"
            goto L_0x0416
        L_0x0434:
            java.lang.String r4 = "ۙ۫ۦۘۢۗۥۘۢۗ۟ۨۜۢۨۛ۟ۨۘۚۜۗۖۖۢ۠۬ۨۛ"
            r5 = r4
            goto L_0x0071
        L_0x0439:
            r0 = r65
            r1 = r24
            java.lang.Object r4 = r0.get(r1)
            com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView$Dot r4 = (com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView.Dot) r4
            java.lang.String r5 = "۠ۢۖۘۢۙۘۘۦۨ۠ۜۨۗۜۧۘ۫ۙۙۧۙ۟ۧۚۘۘ"
            r23 = r4
            goto L_0x0071
        L_0x0449:
            r0 = r23
            int r4 = r0.f1325a
            r22 = r63[r4]
            java.lang.String r4 = "ۥۖ۟ۛۛ۬ۨۤۦۖۖۢۚۢۡۘۚۘ۠۫ۧۡۘ"
            r5 = r4
            goto L_0x0071
        L_0x0454:
            r0 = r23
            int r0 = r0.f1326b
            r21 = r0
            java.lang.String r4 = "ۛۖۡۘ۟۠ۥۘ۫ۧۦۨۚۡۦ۠۬ۜۢۘۘ"
            r5 = r4
            goto L_0x0071
        L_0x045f:
            r5 = -951117459(0xffffffffc74f196d, float:-53017.426)
            java.lang.String r4 = "ۤ۠۟ۨۖۢۗۚۧۡۗۗۨ۬ۤ۬ۜۡۘ"
        L_0x0464:
            int r66 = r4.hashCode()
            r66 = r66 ^ r5
            switch(r66) {
                case -1970898712: goto L_0x06e2;
                case -1212278860: goto L_0x047b;
                case -745702461: goto L_0x0478;
                case 902777396: goto L_0x046e;
                default: goto L_0x046d;
            }
        L_0x046d:
            goto L_0x0464
        L_0x046e:
            boolean r4 = r22[r21]
            if (r4 != 0) goto L_0x0475
            java.lang.String r4 = "ۙۛ۬۬ۧۧۧ۟ۨۘۜۗۨۘۚۨۡۨۘ"
            goto L_0x0464
        L_0x0475:
            java.lang.String r4 = "ۗ۬ۨۘ۟ۤ۠ۨۦۤ۬ۥۚۛۨۖۚۡۤ"
            goto L_0x0464
        L_0x0478:
            java.lang.String r4 = "ۘۚۖۘۢۘۙۘۚۘۘۙۡۥۘۧۧ۫۟ۖۥۘ"
            goto L_0x0464
        L_0x047b:
            java.lang.String r4 = "۬ۡۘۘ۟ۤۘۘۧۡۘۘۦۤۜ۫ۢ۫ۙۙۜ۠ۢۜۘ"
            r5 = r4
            goto L_0x0071
        L_0x0480:
            r0 = r68
            r1 = r21
            float r15 = r0.d(r1)
            java.lang.String r4 = "ۛۗۧۘۢ۠ۛۘۘۧۧ۬ۖ۬ۘۘ"
            r5 = r4
            goto L_0x0071
        L_0x048d:
            r0 = r23
            int r0 = r0.f1325a
            r20 = r0
            java.lang.String r4 = "ۢ۫ۜۚۢۦ۟ۨۡۦۥۜۘۥ۠۬ۙۡۚۗۛ۫ۢۧۧۧۖ"
            r5 = r4
            goto L_0x0071
        L_0x0498:
            r0 = r68
            r1 = r20
            float r13 = r0.e(r1)
            java.lang.String r4 = "ۙ۫ۦۘۖۥۨۘۢۦۖۘۘۥ۟ۡۦۘۖۖۢ"
            r5 = r4
            goto L_0x0071
        L_0x04a5:
            r5 = -640619164(0xffffffffd9d0ed64, float:-7.3509761E15)
            java.lang.String r4 = "ۨۡۡۘۥ۫ۗ۫ۧ۬ۢۘ۟ۨۨۘۘۙۥۢ"
        L_0x04aa:
            int r66 = r4.hashCode()
            r66 = r66 ^ r5
            switch(r66) {
                case -1790758783: goto L_0x04bf;
                case 377857568: goto L_0x06ec;
                case 1518136664: goto L_0x04ba;
                case 1595202828: goto L_0x04b4;
                default: goto L_0x04b3;
            }
        L_0x04b3:
            goto L_0x04aa
        L_0x04b4:
            java.lang.String r4 = "ۙۧ۠ۘۜۥۖۦ۠ۦ۟ۙ۟ۖۛ"
            goto L_0x04aa
        L_0x04b7:
            java.lang.String r4 = "ۧۙۜۘۨۖۚۢۦۜۡۙ۬ۥۛۜۘۛ۬ۧۤۗۡ۬۫ۖۘۛۨۦۘ"
            goto L_0x04aa
        L_0x04ba:
            if (r24 == 0) goto L_0x04b7
            java.lang.String r4 = "ۢ۟ۖۡ۬ۨۗ۟ۦۧۘۚۙۥۘۘۚۢ۫"
            goto L_0x04aa
        L_0x04bf:
            java.lang.String r4 = "ۢۡۗۜۛۨۨ۫۟ۚ۟ۤۢۜۥۘ"
            r5 = r4
            goto L_0x0071
        L_0x04c4:
            r0 = r68
            com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView$DotState[][] r4 = r0.f1298a
            r4 = r4[r20]
            r19 = r4[r21]
            java.lang.String r4 = "ۚۨۦۥۦۗۘ۫ۦۘۧۚۜ۬ۨ۟ۡۛۙ۠ۤۤۗ۬"
            r5 = r4
            goto L_0x0071
        L_0x04d1:
            r46.rewind()
            java.lang.String r4 = "ۚ۠ۡۘۜۨۘۚ۟ۖۛۙ۟۟ۥۧۘ۬ۢۤ۬ۥۜۢۦۧۘ"
            r5 = r4
            goto L_0x0071
        L_0x04d9:
            r0 = r46
            r1 = r26
            r2 = r28
            r0.moveTo(r1, r2)
            java.lang.String r4 = "ۖ۠ۖۡ۠ۘۘۛۜۧۘۚۛۛ۟۫ۗ۫ۛۘۘۧۖۘۦ۬ۤ"
            r5 = r4
            goto L_0x0071
        L_0x04e7:
            r0 = r19
            float r0 = r0.f1330d
            r18 = r0
            java.lang.String r4 = "ۥۖۨۨۨۘۛ۫ۢۜۚ۫ۖۡۙ"
            r5 = r4
            goto L_0x0071
        L_0x04f2:
            r5 = 932475111(0x379470e7, float:1.769555E-5)
            java.lang.String r4 = "ۢۘۥۖۢۡۘۥۧۨۘۧۨۛۡۤ۠"
        L_0x04f7:
            int r66 = r4.hashCode()
            r66 = r66 ^ r5
            switch(r66) {
                case -156913919: goto L_0x050c;
                case 1728979294: goto L_0x052e;
                case 1747483810: goto L_0x050f;
                case 1929446720: goto L_0x0501;
                default: goto L_0x0500;
            }
        L_0x0500:
            goto L_0x04f7
        L_0x0501:
            r4 = 1
            int r4 = (r18 > r4 ? 1 : (r18 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0509
            java.lang.String r4 = "۫ۨۜۘۦۧۤ۠ۜۧۘۗۡۜۤۥۖۢۗ۫ۘۗۢۧ۠۠ۦ"
            goto L_0x04f7
        L_0x0509:
            java.lang.String r4 = "۫ۙۛۥۧۧۛۦۦۘۘ۟۬ۥۨۦۧۥۗۧ۠ۜۦۚ۟۬ۛۜۘ"
            goto L_0x04f7
        L_0x050c:
            java.lang.String r4 = "ۜۚۖۘۗۗۗۢۖ۬۫۠ۧۙۗۨۖۜۤ"
            goto L_0x04f7
        L_0x050f:
            java.lang.String r4 = "ۙۛۥۘ۬ۡۧۦۥۨۥۚ۬ۖۚۡۢۖۥۘۛۨ۬۟ۜۗ"
            r5 = r4
            goto L_0x0071
        L_0x0514:
            r0 = r19
            float r0 = r0.f1331e
            r17 = r0
            java.lang.String r4 = "ۤ۟۬ۢۘۤۗ۬ۚۘۦۡۗۚۚۦ۬ۙۤۖ۬ۤۗ۫ۢ۠۬"
            r5 = r4
            goto L_0x0071
        L_0x051f:
            r5 = 864198031(0x33829d8f, float:6.0822565E-8)
            java.lang.String r4 = "ۚ۟ۖۘۚۚۜۘۙۨۢ۟ۢۘۖۥۘ۟ۚ۬۟ۙۜۘۖ۠ۦۘ"
        L_0x0524:
            int r66 = r4.hashCode()
            r66 = r66 ^ r5
            switch(r66) {
                case -1079311088: goto L_0x0536;
                case -672883665: goto L_0x053e;
                case 851468049: goto L_0x052e;
                case 1584668144: goto L_0x0541;
                default: goto L_0x052d;
            }
        L_0x052d:
            goto L_0x0524
        L_0x052e:
            java.lang.String r4 = "۠۫۬۬ۖۡۘۢۘۚ۬ۨۗۚۛۘۤۢ۠ۛ۬ۗۙۚ"
            r5 = r4
            goto L_0x0071
        L_0x0533:
            java.lang.String r4 = "ۧۘۨۘۦ۬ۜۨۘ۬۬ۜۜۘۤۦۛ۟ۦۦۘۗ۟ۙ۫ۢۖۜۚۥۘ"
            goto L_0x0524
        L_0x0536:
            r4 = 1
            int r4 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0533
            java.lang.String r4 = "ۦۗۢۛۛۛ۬ۘۢۙۗۚۧۨۘۨۛۚ"
            goto L_0x0524
        L_0x053e:
            java.lang.String r4 = "ۜ۫ۦۘۧ۟ۜ۟ۧۛۚ۬۠ۢۘۦۜۦۛۗۖۡۘۚۦۨ۫ۦۡ"
            goto L_0x0524
        L_0x0541:
            java.lang.String r4 = "ۛ۬ۚۨۛۧۤۡۚۢ۫ۦۘ۠ۡۗۛۘۨۨۚۘۘۡۥۖ"
            r5 = r4
            goto L_0x0071
        L_0x0546:
            r0 = r46
            r1 = r18
            r2 = r17
            r0.lineTo(r1, r2)
            java.lang.String r4 = "ۡۨۦۙۤۥۙۢ۠ۜۨۥۘۦۚۨ۬ۛۙۦ۠"
            r5 = r4
            goto L_0x0071
        L_0x0554:
            r0 = r46
            r0.lineTo(r15, r13)
            java.lang.String r4 = "ۜۗۙ۬۠ۜۘۨۢۛ۟ۙۛۖۚۦۘ"
            r5 = r4
            goto L_0x0071
        L_0x055e:
            r0 = r68
            android.graphics.Paint r4 = r0.f1313p
            r0 = r69
            r1 = r46
            r0.drawPath(r1, r4)
            java.lang.String r4 = "ۗۖۨۘۢۖۘۘۙۙۡ۫ۙۖۖۢۦۘۜۖۥۦۛۦ"
            r5 = r4
            goto L_0x0071
        L_0x056e:
            int r16 = r24 + 1
            java.lang.String r4 = "۠۟ۥۘۧۦ۠ۛۜۦ۠ۜۙۥۜۨۛۜۨۤ۫ۨۘۧۗۧ"
            r5 = r4
            goto L_0x0071
        L_0x0575:
            java.lang.String r4 = "ۧۛۜۘۦۗۘۘ۟۬ۢۖ۫ۨۙۦۘۗ۫ۧۗۖۛۙۙ۫ۥ"
            r5 = r4
            r14 = r15
            goto L_0x0071
        L_0x057b:
            java.lang.String r4 = "۫ۥ۠۬ۢۦۘۡ۟ۘۘ۫ۢۚ۫ۙۗۨۥۖۘۛۢۥۘ۠ۙۧ"
            r5 = r4
            r12 = r13
            goto L_0x0071
        L_0x0581:
            r11 = 1
            java.lang.String r4 = "۫ۙۙۧۘ۫۫ۜۦۛۤۤ۫۟۬ۡۖۧۘۙۙۡ۬ۡۧۘ۫ۖ۟"
            r5 = r4
            goto L_0x0071
        L_0x0587:
            java.lang.String r4 = "۫ۖ۫۠ۛۡۘۡ۬ۖۢۦۖۘۢۢۡۧ۠ۥۘۖۢ۟ۙۘۚ"
            r5 = r4
            r24 = r16
            goto L_0x0071
        L_0x058e:
            java.lang.String r4 = "ۙۛۥۘۡۡ۬ۜ۬ۥۘ۠۬ۡ۟ۦۡۘۖ۬ۢ۟ۜۜۘ۬ۘۚ"
            r5 = r4
            r26 = r14
            goto L_0x0071
        L_0x0595:
            java.lang.String r4 = "۬ۙۦۘ۟ۨۨۘ۫ۢۜ۬ۙۥۘۛۢۥ۬۟۠ۗۡ۠ۙۨۧۤ۟ۦۘ"
            r5 = r4
            r28 = r12
            goto L_0x0071
        L_0x059c:
            java.lang.String r4 = "ۖۤۡۘۨۦ۟ۢ۬ۙ۟۫ۖۛۙۦۘۡۘۥ۟۫ۡۚۤۤۘۤ"
            r5 = r4
            r30 = r11
            goto L_0x0071
        L_0x05a3:
            r5 = -27399513(0xfffffffffe5deaa7, float:-7.3744443E37)
            java.lang.String r4 = "ۗ۠ۥۘۚۙۖۥۤ۬ۖ۫ۢۢ۫ۘ۫ۖۙۢ۟ۤۘۘ۬"
        L_0x05a8:
            int r66 = r4.hashCode()
            r66 = r66 ^ r5
            switch(r66) {
                case -554541672: goto L_0x05ba;
                case 402975038: goto L_0x05c3;
                case 443513776: goto L_0x05c6;
                case 1093492717: goto L_0x05b2;
                default: goto L_0x05b1;
            }
        L_0x05b1:
            goto L_0x05a8
        L_0x05b2:
            java.lang.String r4 = "۬۬ۡ۠ۖۥۥ۠ۨ۠ۗۙۘۤۘ"
            r5 = r4
            goto L_0x0071
        L_0x05b7:
            java.lang.String r4 = "ۡۛۖ۠ۖۥۤۙۥۘۜۗ۠ۘ۠ۡۨ۫ۢۜۚۘۘۤۧۛ"
            goto L_0x05a8
        L_0x05ba:
            r0 = r68
            boolean r4 = r0.f1323z
            if (r4 != 0) goto L_0x05b7
            java.lang.String r4 = "ۧۚۗۥ۫ۥۛۗۦۖۨۥۖۡۘۘۛۥ"
            goto L_0x05a8
        L_0x05c3:
            java.lang.String r4 = "ۢۧۘۥۡۥۗۢۖۙۥۡۘ۟ۖۤۥۦۙۧۛۙۧۜ"
            goto L_0x05a8
        L_0x05c6:
            java.lang.String r4 = "ۚۧۚۛۛ۟۫ۡ۠۬۠۠ۥۡ۟ۤۜۡ"
            r5 = r4
            goto L_0x0071
        L_0x05cb:
            r5 = -1738626261(0xffffffff985eab2b, float:-2.8779245E-24)
            java.lang.String r4 = "۠ۙۜۛۚۘۡۧۤۜۙۜۘۤ۟۫ۜۨ۬ۛۚ۠ۧۤ۠ۤۗۜ"
        L_0x05d0:
            int r66 = r4.hashCode()
            r66 = r66 ^ r5
            switch(r66) {
                case -1707437466: goto L_0x05ea;
                case -188014063: goto L_0x05ed;
                case 1397313437: goto L_0x05da;
                case 1561840215: goto L_0x0601;
                default: goto L_0x05d9;
            }
        L_0x05d9:
            goto L_0x05d0
        L_0x05da:
            r0 = r68
            int r4 = r0.f1319v
            r66 = 1
            r0 = r66
            if (r4 != r0) goto L_0x05e7
            java.lang.String r4 = "ۤۤۖۘۥ۟ۖۘ۫ۗۡۘۡۗۡۡۗۗۤۥۤۤۖۘ۠ۙۡۘۦۧۘ"
            goto L_0x05d0
        L_0x05e7:
            java.lang.String r4 = "ۗۙۦۘۜۦ۫۟۫ۙۢۡۘۢ۠ۖۘۤۛۖۘۛۧۚ"
            goto L_0x05d0
        L_0x05ea:
            java.lang.String r4 = "ۖ۟ۡ۠ۛۘۘۢ۟ۗ۠ۖۜۘ۟ۘ۬"
            goto L_0x05d0
        L_0x05ed:
            java.lang.String r4 = "۬۬ۡ۠ۖۥۥ۠ۨ۠ۗۙۘۤۘ"
            r5 = r4
            goto L_0x0071
        L_0x05f2:
            r5 = -2114963113(0xffffffff81f03957, float:-8.8244355E-38)
            java.lang.String r4 = "۠ۛۗۙۜۜۘۛۦۧۘ۬ۚۥۦۙۢ۬ۙۤ۫۬ۖۘۜۡ۫"
        L_0x05f7:
            int r66 = r4.hashCode()
            r66 = r66 ^ r5
            switch(r66) {
                case -1929899581: goto L_0x0601;
                case -1107668212: goto L_0x0609;
                case -443913423: goto L_0x060e;
                case -155524952: goto L_0x0611;
                default: goto L_0x0600;
            }
        L_0x0600:
            goto L_0x05f7
        L_0x0601:
            java.lang.String r4 = "ۗۖ۟ۘۜۡۘ۠ۖ۠ۧۨۜۢۚۦۘۥ۬ۘۘۧۛۧۨۡۨۘۗۧۚ"
            r5 = r4
            goto L_0x0071
        L_0x0606:
            java.lang.String r4 = "ۧۙۗۖۦۗۗ۟ۥۘۚۖۥ۟ۗۘ"
            goto L_0x05f7
        L_0x0609:
            if (r30 == 0) goto L_0x0606
            java.lang.String r4 = "ۧۡۜۘۨۨ۠ۥ۬ۗۙ۬ۛۗۥۢۥۙۡۘۡۗۦۘۘۗۙۛ۟۟"
            goto L_0x05f7
        L_0x060e:
            java.lang.String r4 = "۟ۤۨۤۧ۬ۜۘۥۢۖۘۤ۟ۖ۠ۡۘۘۦۗۥۘ"
            goto L_0x05f7
        L_0x0611:
            java.lang.String r4 = "ۦ۫ۥۦۜۖۘۥۧ۠ۡۖ۠۬ۛ۬ۥۧۚۚۘۘۗۜۦۘ"
            r5 = r4
            goto L_0x0071
        L_0x0616:
            r46.rewind()
            java.lang.String r4 = "۟ۨۗ۠ۨۦۘۨۡۖۨۢۥۘۙۡۦ"
            r5 = r4
            goto L_0x0071
        L_0x061e:
            r0 = r46
            r1 = r26
            r2 = r28
            r0.moveTo(r1, r2)
            java.lang.String r4 = "ۥۤۨۘۤۙ۬ۧۖۘۘۥۡۨۘۚۗۚۗۤۦۤ۟۫ۘۜۖ"
            r5 = r4
            goto L_0x0071
        L_0x062c:
            r0 = r68
            float r4 = r0.f1317t
            r0 = r68
            float r5 = r0.f1318u
            r0 = r46
            r0.lineTo(r4, r5)
            java.lang.String r4 = "ۦ۠ۡۘۥۗۘۘۛۙ۬ۧۖ۫ۨۧۙۜۦ۟"
            r5 = r4
            goto L_0x0071
        L_0x063e:
            r0 = r68
            android.graphics.Paint r10 = r0.f1313p
            java.lang.String r4 = "ۨۥۖۘۚۛۦۙ۠ۤۧۜۘۗۛۢۜۥ۠"
            r5 = r4
            goto L_0x0071
        L_0x0647:
            r0 = r68
            float r9 = r0.f1317t
            java.lang.String r4 = "ۡۛ۠ۖۗۢۦۖۗۖۗۡۤۛۖۘ"
            r5 = r4
            goto L_0x0071
        L_0x0650:
            r0 = r68
            float r8 = r0.f1318u
            java.lang.String r4 = "ۧۙ۫ۡۗۥۘۦۦۥۖ۟ۗ۬ۚۨۗۦۚ"
            r5 = r4
            goto L_0x0071
        L_0x0659:
            float r7 = r9 - r26
            java.lang.String r4 = "ۘۧۙ۫ۖۨۛ۫۠ۖۙۗۨۥ۬ۢۧ۬ۙۘ"
            r5 = r4
            goto L_0x0071
        L_0x0660:
            float r6 = r8 - r28
            java.lang.String r4 = "ۚۖۘۨۧۨۢۨۨۢۡۡۘۤۨ۟۫ۜۧ۫ۗۡ"
            r5 = r4
            goto L_0x0071
        L_0x0667:
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            float r66 = r6 * r6
            float r67 = r7 * r7
            float r66 = r66 + r67
            r0 = r66
            double r0 = (double) r0
            r66 = r0
            double r66 = java.lang.Math.sqrt(r66)
            r0 = r66
            float r0 = (float) r0
            r66 = r0
            r0 = r68
            float r0 = r0.A
            r67 = r0
            float r66 = r66 / r67
            r67 = 1050253722(0x3e99999a, float:0.3)
            float r66 = r66 - r67
            r67 = 1082130432(0x40800000, float:4.0)
            float r66 = r66 * r67
            r0 = r66
            float r5 = java.lang.Math.max(r5, r0)
            float r4 = java.lang.Math.min(r4, r5)
            r5 = 1132396544(0x437f0000, float:255.0)
            float r4 = r4 * r5
            int r4 = (int) r4
            r10.setAlpha(r4)
            java.lang.String r4 = "ۥۙۡۘ۟ۦۘ۟ۗۨۘۙ۬ۡۘۜۘۜۘۧۢۘ"
            r5 = r4
            goto L_0x0071
        L_0x06a5:
            r0 = r68
            android.graphics.Paint r4 = r0.f1313p
            r0 = r69
            r1 = r46
            r0.drawPath(r1, r4)
            java.lang.String r4 = "ۗۖ۟ۘۜۡۘ۠ۖ۠ۧۨۜۢۚۦۘۥ۬ۘۘۧۛۧۨۡۨۘۗۧۚ"
            r5 = r4
            goto L_0x0071
        L_0x06b5:
            java.lang.String r4 = "ۗۨۡۘ۫ۥۜ۠ۡۜۚۙۤ۬ۥۘ"
            r5 = r4
            goto L_0x0071
        L_0x06ba:
            java.lang.String r4 = "ۘۨۡۖۘ۟ۧ۠۫ۤ۠۠ۜۥۙۥۨ۫ۧۜۥۘۤۦۜ"
            r5 = r4
            goto L_0x0071
        L_0x06bf:
            java.lang.String r4 = "ۦۦۖ۫ۢۗۤۥ۬ۡۜۘۘ۠۟ۤ"
            r5 = r4
            goto L_0x0071
        L_0x06c4:
            java.lang.String r4 = "ۘۖ۫ۖۥ۠ۛۥ۠ۡۚۡۛۡۘ"
            r5 = r4
            goto L_0x0071
        L_0x06c9:
            java.lang.String r4 = "۬ۖۦۘۤۢ۟ۢۜ۠۫ۜۥۗۧۤ"
            r5 = r4
            goto L_0x0071
        L_0x06ce:
            java.lang.String r4 = "ۥۛۜۘۛ۠ۡۚۗۜۘ۫ۤ۬ۢ۬ۧ"
            r5 = r4
            goto L_0x0071
        L_0x06d3:
            java.lang.String r4 = "ۘۨۥۘۚۧ۬ۨۧۖۙۘۘۚۧۡ۟ۛۥۖۘۘۨۨۜۘۜۙۜۘ"
            r5 = r4
            goto L_0x0071
        L_0x06d8:
            java.lang.String r4 = "ۖۡۖ۫ۗۖۘۤۡۦۗۗۘۡۙۥ۬ۥۘۤۡۧۘۢ۬ۦ"
            r5 = r4
            goto L_0x0071
        L_0x06dd:
            java.lang.String r4 = "۠ۛۧ۟۫ۖۘۥۚۨۘۙ۬ۨ۬ۘۚ"
            r5 = r4
            goto L_0x0071
        L_0x06e2:
            java.lang.String r4 = "ۗۜۧۚۜۡۛۜۗۘۨۡۘۥۢۚۜ۠ۤۖۧۢۤۘۛۜ"
            r5 = r4
            goto L_0x0071
        L_0x06e7:
            java.lang.String r4 = "ۜۗۙ۬۠ۜۘۨۢۛ۟ۙۛۖۚۦۘ"
            r5 = r4
            goto L_0x0071
        L_0x06ec:
            java.lang.String r4 = "ۗۖۨۘۢۖۘۘۙۙۡ۫ۙۖۖۢۦۘۜۖۥۦۛۦ"
            r5 = r4
            goto L_0x0071
        L_0x06f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView.onDraw(android.graphics.Canvas):void");
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        String str = "ۙۥۜۘۥۨۢۛۙۛۖۥ۫۫ۗ۠ۖۢۤۡ۫ۧۦۘ۫ۤۖۦۘ";
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            switch ((str.hashCode() ^ 121) ^ -1955696703) {
                case -1727924320:
                    str = "۠ۦۗۗ۬ۗۗۨ۬ۢۙۥۡۜ۫ۚۡۚۙۖۘ";
                    i3 = i4;
                    break;
                case -1723881796:
                    str = "ۧ۬ۚۨۚۗۨۤۦۘۛۢۖۘۥۨۚۙۦ۠ۚۡۜۘ";
                    break;
                case -1275228232:
                    String str2 = "ۤۗۡۘۦۘۜۨۤۜۘۗ۫ۢ۟ۧۚۦۡ۬۬ۘ۟";
                    while (true) {
                        switch (str2.hashCode() ^ -1739849684) {
                            case 351781139:
                                str = "ۨۜۥ۫۬ۛۧۛۡۤۗۡۘۧۗۗۦۖۤۤۛۤ";
                                continue;
                            case 853271849:
                                str2 = "ۡۡ۬۠ۖۖۗۢۜۘۙۛۨۧۢۘۘۘۜۧۨۜۧۘ";
                                break;
                            case 879980558:
                                str = "ۦۙۧۖۚۢۡۛۘۘۢۛ۫ۛۖۦۖۘۚۤۜۡۘ";
                                continue;
                            case 1015225714:
                                if (i5 == 10) {
                                    str2 = "ۤ۠ۧۗۦۦۘ۟ۡۢۧۚۘۘۡ۟ۡۘۜۥۤ";
                                    break;
                                } else {
                                    str2 = "ۚ۬ۚ۠۬ۛۗۗۦۘۘۦۚۗ۫ۖۢۢۖۘۜۜۨۘ۫ۙۡۗ";
                                    break;
                                }
                        }
                    }
                    break;
                case -1235338486:
                    i5 = motionEvent.getAction();
                    str = "۫ۜۛۘۖۧۘ۬ۨۙۢۥۘۘ۠۬ۨۢۖۘ۠۟ۦۘ۬ۘۡ";
                    break;
                case -954542354:
                    i2 = 2;
                    str = "ۦ۬ۜۧۖۘۘ۟ۙۢ۠ۨۘۨۥۘۘ";
                    break;
                case -895275334:
                    motionEvent.setAction(i3);
                    str = "ۥ۟ۤ۫۬۟۫ۜۦۘۜۤۛ۬ۤۗۢۨۗۖۦ۠ۖ۠ۜۘۧۦۦ";
                    break;
                case -320800249:
                    onTouchEvent(motionEvent);
                    str = "ۘۙۡۘۘۥۡۖۨۨ۫ۜ۫ۘۨۗۚ۬ۘۘۥۘ";
                    break;
                case -297073678:
                    str = "ۥ۟ۤ۫۬۟۫ۜۦۘۜۤۛ۬ۤۗۢۨۗۖۦ۠ۖ۠ۜۘۧۦۦ";
                    break;
                case 1656546:
                    str = "ۧ۟ۥۘۙۖۥۘۥۡۧ۟ۥۧۥۡۨۘۘۜۥ";
                    break;
                case 339202890:
                    i4 = 1;
                    str = "۟۬ۘۘۤ۠۬ۤ۫ۥۘۨۛۢ۠ۦۧۘۗۡ۫";
                    break;
                case 585756972:
                case 990970313:
                    str = "ۥۙۡۜۛۜۘۙۦۧۘۡۚۙۢ۠۫ۨۗۘۘ";
                    break;
                case 1197348244:
                    motionEvent.setAction(i5);
                    str = "ۛۦۧۘۜۜۢۡۧۨۘ۟ۜۥۙۡۨ۟ۤۛۧۥۡۧۥ۠ۜۡۛ";
                    break;
                case 1375565982:
                    String str3 = "ۦ۟ۨۘۖۙۜۖ۬ۗۘۚۡۨۥۧۘ۟ۛۛۡۦۚۖ۫ۨ";
                    while (true) {
                        switch (str3.hashCode() ^ -85435877) {
                            case -211915339:
                                str = "ۛۦۧۘۜۜۢۡۧۨۘ۟ۜۥۙۡۨ۟ۤۛۧۥۡۧۥ۠ۜۡۛ";
                                continue;
                            case 718016090:
                                if (!((AccessibilityManager) getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                                    str3 = "۠ۨۘۢ۟ۘۡۦۘ۬ۚ۟ۚ۟ۘۘ";
                                    break;
                                } else {
                                    str3 = "ۗ۬ۖۘۢۘۛۘۙۛ۬ۛۜ۬ۢۘۘۛۜۚ";
                                    break;
                                }
                            case 1605155392:
                                str = "ۚۨۡ۠ۢۤۛۤۥۘۜۗۦۘۤۛۧۜۖ";
                                continue;
                            case 1860095929:
                                str3 = "۠۫ۜۘۛۨۚۤ۠ۖۜۥۢۤۚۜۘۨۚۦۘ";
                                break;
                        }
                    }
                    break;
                case 1558788109:
                    String str4 = "۬ۡۛۥۢ۫ۖۜۜۨۨۨۘۘۦۨ۬ۧۦۦ۠ۖۦۘ";
                    while (true) {
                        switch (str4.hashCode() ^ -1684579926) {
                            case -1705239819:
                                if (i5 == 7) {
                                    str4 = "ۢۚۧۤۜ۫ۜۨۡۘۢۘ۠ۡۙۜۘ۠۠ۛۖۛۢۚۨۥۘۤۙ۠";
                                    break;
                                } else {
                                    str4 = "ۤۗۡۛۛۨۘۖ۬۫۠ۗۨۘۜ۠ۢۜۦۙۢۙۡ۟۟";
                                    break;
                                }
                            case 848216721:
                                str4 = "۠ۗۗ۬۫ۨۘۘ۬ۥۘۚ۠ۦۘۢۥ۬ۢۢ";
                                break;
                            case 1196821265:
                                str = "ۢۡۖۘۢۧ۫ۖۘ۠ۢۧۛۘ۠ۢ";
                                continue;
                            case 1248243131:
                                str = "ۧۥۚۗۥ۬ۗ۫۫ۤۚ۠ۖۜۡۘ۠ۥۨۦۥۦ";
                                continue;
                        }
                    }
                    break;
                case 1712217925:
                    String str5 = "ۦۘۦۘ۬۬ۖۘۚۤۥ۠۬ۙۗۚۢۢۚۗۧۚۧۗ۫ۨۘۨ۠ۚ";
                    while (true) {
                        switch (str5.hashCode() ^ -262248512) {
                            case -1857331185:
                                str = "ۥ۟ۛۤۡۗۧ۠ۡۗۜۦۘۨۢ";
                                continue;
                            case -1843623051:
                                str = "ۚۧۨۘ۟ۨۨۧۗ۠ۨۦۥۘ۟۟ۛۚۡ۟ۧ۟";
                                continue;
                            case 963235151:
                                str5 = "ۧۛۖۘۙۘۚۛۘۘۨۗۥۚۗۧۜۨۜۡۨۖۘ";
                                break;
                            case 1889564258:
                                if (i5 == 9) {
                                    str5 = "۟ۘۨۘۘۛۤ۠ۛۨۗۥۘۛۖۤۘۛۦۡۧ";
                                    break;
                                } else {
                                    str5 = "ۚ۬ۖۛۥۡۘۗ۬۠ۚ۟ۛۧۢۥۥۨۢۛ۫۠ۡ۫ۘۡۚ۫";
                                    break;
                                }
                        }
                    }
                    break;
                case 1727945042:
                    str = "ۥۙۡۜۛۜۘۙۦۧۘۡۚۙۢ۠۫ۨۗۘۘ";
                    i3 = i2;
                    break;
                case 1804597164:
                    str = "۬ۙۖ۠ۤۥۘۙۤۜۘۢ۠ۧۧۦۘۜ۠ۥ";
                    break;
                case 1805815053:
                    return super.onHoverEvent(motionEvent);
                case 2134562642:
                    str = "ۚ۟ۜۘ۟۟ۜۘۗۗۧۦۨۤۨۧۘۚۚۜۙۥۘ";
                    i3 = 0;
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r25, int r26) {
        /*
            r24 = this;
            r19 = 0
            r18 = 0
            r20 = 0
            r17 = 0
            r16 = 0
            r9 = 0
            r14 = 0
            r13 = 0
            r15 = 0
            r12 = 0
            r11 = 0
            r6 = 0
            r10 = 0
            r8 = 0
            r4 = 0
            r3 = 0
            r2 = 0
            r5 = 0
            r7 = 0
            java.lang.String r1 = "ۖ۫ۡۖۙۖۤۥۜۖۡۤۨۘۢۦۚۦۖۡۘ۬ۤۚ"
        L_0x001a:
            int r21 = r1.hashCode()
            r22 = 625(0x271, float:8.76E-43)
            r23 = 354824628(0x152631b4, float:3.3562642E-26)
            r21 = r21 ^ r22
            r21 = r21 ^ r23
            switch(r21) {
                case -2046068338: goto L_0x0073;
                case -1940541434: goto L_0x0207;
                case -1935860397: goto L_0x00cf;
                case -1821067271: goto L_0x01b3;
                case -1767496027: goto L_0x0142;
                case -1692944277: goto L_0x00dd;
                case -1525336910: goto L_0x020f;
                case -1486790412: goto L_0x01f6;
                case -1479793779: goto L_0x013a;
                case -1454515201: goto L_0x010d;
                case -1428407299: goto L_0x00bb;
                case -1367829382: goto L_0x00e5;
                case -1164837520: goto L_0x0130;
                case -1085864306: goto L_0x006c;
                case -952867624: goto L_0x0065;
                case -843976872: goto L_0x01bb;
                case -814790499: goto L_0x0147;
                case -716735179: goto L_0x01e7;
                case -475261614: goto L_0x00ed;
                case -205894081: goto L_0x002b;
                case -191563797: goto L_0x002e;
                case -157490268: goto L_0x01ec;
                case 210245905: goto L_0x01c0;
                case 340690576: goto L_0x00c1;
                case 376635927: goto L_0x020f;
                case 378900027: goto L_0x01da;
                case 450137271: goto L_0x00d5;
                case 494937458: goto L_0x0213;
                case 540259139: goto L_0x0097;
                case 552526366: goto L_0x0031;
                case 810953073: goto L_0x009d;
                case 818419884: goto L_0x0171;
                case 831390704: goto L_0x0112;
                case 874355735: goto L_0x005e;
                case 901553421: goto L_0x01f1;
                case 1067350772: goto L_0x0194;
                case 1084848973: goto L_0x01d5;
                case 1173182749: goto L_0x01cd;
                case 1175251420: goto L_0x014f;
                case 1394921299: goto L_0x01ff;
                case 1484436922: goto L_0x0135;
                case 1509675829: goto L_0x0213;
                case 1572363424: goto L_0x01c5;
                case 1757561488: goto L_0x00c7;
                case 1768741703: goto L_0x0034;
                case 1875183215: goto L_0x01df;
                case 2124442186: goto L_0x003a;
                default: goto L_0x002a;
            }
        L_0x002a:
            goto L_0x001a
        L_0x002b:
            java.lang.String r1 = "۫ۙۡۥۧۚۙۦۤۚ۬۫ۜۗۢ۟ۢۘۨۚۦۢۢ۬ۛۘۘ"
            goto L_0x001a
        L_0x002e:
            java.lang.String r1 = "ۧۥۜۘۧۖ۫ۧۢۨۚۘ۬۟ۛۜۛۢ۟"
            goto L_0x001a
        L_0x0031:
            java.lang.String r1 = "ۖۙۘۙۢۡۨۛۘ۫ۡۤ۟ۧۖ"
            goto L_0x001a
        L_0x0034:
            super.onMeasure(r25, r26)
            java.lang.String r1 = "۟ۤۖۥ۟ۥ۫ۧۜۚۢ۠ۧۢۤۗۘۖۘۨۤۥ"
            goto L_0x001a
        L_0x003a:
            r21 = -1031715537(0xffffffffc281452f, float:-64.635124)
            java.lang.String r1 = "ۖۨۨۘۛ۟ۨۘ۫۬ۦۖۧۛ۟ۚ۠ۙۥۘ"
        L_0x003f:
            int r22 = r1.hashCode()
            r22 = r22 ^ r21
            switch(r22) {
                case -1191877779: goto L_0x0049;
                case 100096717: goto L_0x004f;
                case 879717117: goto L_0x0058;
                case 916302940: goto L_0x005b;
                default: goto L_0x0048;
            }
        L_0x0048:
            goto L_0x003f
        L_0x0049:
            java.lang.String r1 = "ۖۖ۟ۧۗ۟ۥۦ۫ۛۦۨۥۙۛۤۥ۫ۘۥۥ"
            goto L_0x001a
        L_0x004c:
            java.lang.String r1 = "ۙ۬۫ۗۤ۫۫ۙۚۗۧۜۚۤۛ۟ۗۥ"
            goto L_0x003f
        L_0x004f:
            r0 = r24
            boolean r1 = r0.f1302e
            if (r1 != 0) goto L_0x004c
            java.lang.String r1 = "۫ۗۦۥۙۜۘۚ۫ۜۛۧۦ۟ۛۥۜۧۚۗۗۥۘ"
            goto L_0x003f
        L_0x0058:
            java.lang.String r1 = "ۥۢۥۘۖۙۥۘ۠ۢۛۧۗۙۙۥۧۘ۠ۨۡۘۙۗۗۛۥۖۘ"
            goto L_0x003f
        L_0x005b:
            java.lang.String r1 = "ۜ۬ۥۘۛۜۥۘ۟۟۠ۗۥۘ۫ۘ۟ۢۛۤۤ۫ۨۘ۠ۤ۬"
            goto L_0x001a
        L_0x005e:
            int r19 = r24.getSuggestedMinimumWidth()
            java.lang.String r1 = "ۛ۫۠ۜ۠ۘۘۚۘۙۤۡۤۜ۫ۤ۟ۥۘ"
            goto L_0x001a
        L_0x0065:
            int r18 = android.view.View.MeasureSpec.getSize(r25)
            java.lang.String r1 = "۬ۤۡۘ۫ۨۙ۬ۜۦۜۙۥۗۜۦۘۘۚۖۘ۫ۤۡۘۤۙۜۜۖۢ"
            goto L_0x001a
        L_0x006c:
            int r20 = android.view.View.MeasureSpec.getMode(r25)
            java.lang.String r1 = "ۙ۫ۧۢۚۧۚۜۥۘۢۢۥۖۦۖۘ۫ۡۖ۬۬ۨۘۜۧ۬ۚۜۦ"
            goto L_0x001a
        L_0x0073:
            r21 = 455863193(0x1b2beb99, float:1.4220914E-22)
            java.lang.String r1 = "ۖ۫ۜۘۢ۟ۖۘ۫۬ۧۚ۟ۖۛۛۢۢۡۨۡۥۜۘۚۥۘ"
        L_0x0078:
            int r22 = r1.hashCode()
            r22 = r22 ^ r21
            switch(r22) {
                case -1818702122: goto L_0x0082;
                case -1777682092: goto L_0x0094;
                case -989224718: goto L_0x0088;
                case -423495690: goto L_0x0091;
                default: goto L_0x0081;
            }
        L_0x0081:
            goto L_0x0078
        L_0x0082:
            java.lang.String r1 = "ۙ۫ۨۘۚۗۗۦۜۘۛۙۖۤۦۥۘۦۡۡ۠ۛۨۘۗۚۦ"
            goto L_0x001a
        L_0x0085:
            java.lang.String r1 = "ۦ۫ۚۢ۫۟ۚۛۜۘۧ۫ۨۗ۠ۘۘۦۢۘۘ۠ۤۘۘ"
            goto L_0x0078
        L_0x0088:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r20
            if (r0 == r1) goto L_0x0085
            java.lang.String r1 = "ۛ۟ۛۥ۫ۥۘۦۦ۫ۛۜۛۥ۟ۙۜۦۗۚۤۜۙۤۧۤۜۘۘ"
            goto L_0x0078
        L_0x0091:
            java.lang.String r1 = "ۤۥۙ۫ۨۙ۠ۖ۫ۧۛۘ۬ۘ۬"
            goto L_0x0078
        L_0x0094:
            java.lang.String r1 = "ۥۨۦ۫۫۬ۤۗۖۘۖۜۥۜ۬ۚۧۜۤ"
            goto L_0x001a
        L_0x0097:
            java.lang.String r1 = "ۦۘ۬۫۫ۥۚۨ۟ۜۙ۬ۙ۫ۢ۬ۖۥ"
            r9 = r19
            goto L_0x001a
        L_0x009d:
            r21 = 555532090(0x211cbf3a, float:5.310794E-19)
            java.lang.String r1 = "ۜۖۙۖۚۙۢۛۖۖۤ۬ۧۨۦۘۗۛۨ"
        L_0x00a2:
            int r22 = r1.hashCode()
            r22 = r22 ^ r21
            switch(r22) {
                case -1411888023: goto L_0x00b8;
                case -263341721: goto L_0x01ff;
                case 1698341216: goto L_0x00b3;
                case 1791433620: goto L_0x00ac;
                default: goto L_0x00ab;
            }
        L_0x00ab:
            goto L_0x00a2
        L_0x00ac:
            java.lang.String r1 = "ۘۥۥۗ۫۬ۥ۬ۘ۬ۙۛ۫۬ۦۘ۠ۥۛ۟ۥۤ"
            goto L_0x001a
        L_0x00b0:
            java.lang.String r1 = "ۘۢۡ۫۬ۥۘۧۘۥۥ۬ۤۘۡۦۦۛ۬۬ۢۢۛ"
            goto L_0x00a2
        L_0x00b3:
            if (r20 == 0) goto L_0x00b0
            java.lang.String r1 = "۠ۢۚ۟۫۫ۖۜۚۡۗۛۜۥۦۘ"
            goto L_0x00a2
        L_0x00b8:
            java.lang.String r1 = "ۚۚۨۛ۟ۦۖۚۡۘ۟ۦۧۘۢ۟ۨۘۙۥۥۘۥۜ۫ۤۨۤۚۦ۟"
            goto L_0x00a2
        L_0x00bb:
            java.lang.String r1 = "ۡۘۦۘۤۨۢۨۦۙۡۦۛۢۧۘۘ"
            r17 = r18
            goto L_0x001a
        L_0x00c1:
            java.lang.String r1 = "ۜۚ۫۠ۗۖۘ۫ۚۢۢۡۖۘۖۖۤ"
            r9 = r17
            goto L_0x001a
        L_0x00c7:
            int r16 = java.lang.Math.max(r18, r19)
            java.lang.String r1 = "ۥ۫ۨۘۘۦۙۖ۟ۤۨۢۨۜۧۗۚۛۙۡۖ۬ۘۘۛۘۖ"
            goto L_0x001a
        L_0x00cf:
            java.lang.String r1 = "۫ۡۥ۟ۦۘۛۖۡۘ۠۫ۜۚۗۦۦۦۘۥۛ۫ۥ۬ۖۘ"
            r9 = r16
            goto L_0x001a
        L_0x00d5:
            int r14 = r24.getSuggestedMinimumHeight()
            java.lang.String r1 = "ۚۘۦۘۜۢۥ۫ۚ۠ۘۖ۟۫ۘۜۘۙۖۙ۫ۥ"
            goto L_0x001a
        L_0x00dd:
            int r13 = android.view.View.MeasureSpec.getSize(r26)
            java.lang.String r1 = "ۡۗ۬ۦ۬ۜ۠ۤۦۘۥۨۨۡۧۡۘۙۧۚۥۧۥ۫۠ۗ"
            goto L_0x001a
        L_0x00e5:
            int r15 = android.view.View.MeasureSpec.getMode(r26)
            java.lang.String r1 = "ۚۚۚۚۨۘۚۥ۟ۛۚۜۜۚ"
            goto L_0x001a
        L_0x00ed:
            r21 = 1358146702(0x50f3ac8e, float:3.27053763E10)
            java.lang.String r1 = "۟ۢۥۢ۬ۧ۫ۛۤ۫ۡۜۘۘۗۙۖۛۨ۬ۘۖۜۡۖۘ"
        L_0x00f2:
            int r22 = r1.hashCode()
            r22 = r22 ^ r21
            switch(r22) {
                case -1451691501: goto L_0x00fc;
                case -482212816: goto L_0x0109;
                case 366937558: goto L_0x0106;
                case 995750046: goto L_0x0203;
                default: goto L_0x00fb;
            }
        L_0x00fb:
            goto L_0x00f2
        L_0x00fc:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r15 == r1) goto L_0x0103
            java.lang.String r1 = "ۥۘۨۖۡۡۢۨۥ۫ۢۖۘ۬ۨۛۧۢۛ"
            goto L_0x00f2
        L_0x0103:
            java.lang.String r1 = "ۚۨۥۘ۫ۚ۟ۗ۬ۨۡۘۗ۬"
            goto L_0x00f2
        L_0x0106:
            java.lang.String r1 = "۠ۜۤۤۚۡۘۘۨ۫۟ۦۢ۫ۚۚ۟ۖ۫"
            goto L_0x00f2
        L_0x0109:
            java.lang.String r1 = "ۢۧۡۖۨۘۚۥۦۦۥۘ۠ۘۧۘۧۘۥۢۧۢۨۨ"
            goto L_0x001a
        L_0x010d:
            java.lang.String r1 = "ۢ۬ۢۜ۠ۜۘۢ۟ۦۘۨۨ۬ۘۗۦ۫۟۫"
            r6 = r14
            goto L_0x001a
        L_0x0112:
            r21 = -832041475(0xffffffffce680dfd, float:-9.7330771E8)
            java.lang.String r1 = "ۗۥۤ۫ۙۖۘ۠ۥۤۥۙۧۙۚۤۡ"
        L_0x0117:
            int r22 = r1.hashCode()
            r22 = r22 ^ r21
            switch(r22) {
                case -1964249973: goto L_0x012c;
                case -1803737991: goto L_0x0207;
                case 131626445: goto L_0x0121;
                case 207835109: goto L_0x0127;
                default: goto L_0x0120;
            }
        L_0x0120:
            goto L_0x0117
        L_0x0121:
            java.lang.String r1 = "ۘۤۛۢۖۥۘۘ۟۟ۡۚۖۘۤ۬ۙ۫ۗۦۘۜۘۤ"
            goto L_0x0117
        L_0x0124:
            java.lang.String r1 = "ۢۚۛۜۚۥۙۦۛۤۤۥۢ۫ۘۘ"
            goto L_0x0117
        L_0x0127:
            if (r15 == 0) goto L_0x0124
            java.lang.String r1 = "ۗۧۦۤ۬۟۠ۙ۫ۗۙۦۙۤۜۧۤۤ۟ۦ"
            goto L_0x0117
        L_0x012c:
            java.lang.String r1 = "ۦۖۛ۫ۜۜۘۧۗۨۘۧ۬ۧۖۢ۫"
            goto L_0x001a
        L_0x0130:
            java.lang.String r1 = "ۤۚۖۤۨۨۙۡۘ۟ۙۘۨ۟ۥۖۧ۬۠ۜۚ"
            r12 = r13
            goto L_0x001a
        L_0x0135:
            java.lang.String r1 = "۬ۘۥۘۥۦۗ۟۠ۜۘۡ۬ۡۘۘۜۤۥۢۥۥۙۚۥۙۚۢۨۧ"
            r6 = r12
            goto L_0x001a
        L_0x013a:
            int r11 = java.lang.Math.max(r13, r14)
            java.lang.String r1 = "۫۫ۨۖۡۦۧ۟ۖۘۜۚۘۘ۬ۧۦ"
            goto L_0x001a
        L_0x0142:
            java.lang.String r1 = "ۢ۫ۘۘۧۤۖۡۡۦۘ۠ۗۗۦۥۦۜۚۧۦۥ۫ۚۦ"
            r6 = r11
            goto L_0x001a
        L_0x0147:
            r0 = r24
            int r10 = r0.f1303f
            java.lang.String r1 = "ۤۛۦۘۗۡۤ۟ۗۡۦ۠ۗۗۙۛۢۙۤ"
            goto L_0x001a
        L_0x014f:
            r21 = 597212366(0x2398bcce, float:1.6559835E-17)
            java.lang.String r1 = "۠۬۟ۖۚ۟ۢۢۨۘۥۨۘۘۖۙ۫"
        L_0x0154:
            int r22 = r1.hashCode()
            r22 = r22 ^ r21
            switch(r22) {
                case -1953253501: goto L_0x015e;
                case 616854079: goto L_0x016a;
                case 1893667109: goto L_0x016d;
                case 2102823907: goto L_0x0165;
                default: goto L_0x015d;
            }
        L_0x015d:
            goto L_0x0154
        L_0x015e:
            java.lang.String r1 = "۟۬ۧ۬ۧۚۘۥۘ۟ۖۡۘ۠ۥۜۨۧۤۖۡۗ"
            goto L_0x001a
        L_0x0162:
            java.lang.String r1 = "ۨۙۢۜۛ۫ۧۡۘۘۗۛۗۛ۫ۗ۠ۖ۬"
            goto L_0x0154
        L_0x0165:
            if (r10 == 0) goto L_0x0162
            java.lang.String r1 = "ۤۨۗۡ۠ۦۘۤۜۤ۫ۤۘۤ۫ۥۘ"
            goto L_0x0154
        L_0x016a:
            java.lang.String r1 = "۠ۖۡۚۜۧۘۖۨۛۨۖۛۖۚۘۘۧۢ۬"
            goto L_0x0154
        L_0x016d:
            java.lang.String r1 = "۫۫ۡ۬ۘۜۘۖۤۡۘ۬ۘ۫ۤۥۘۛ۟ۘۙۙۖۙۨ۠"
            goto L_0x001a
        L_0x0171:
            r21 = -252703667(0xfffffffff0f00c4d, float:-5.943302E29)
            java.lang.String r1 = "۟ۛۨۗۨۜۘۙۥۤۚۨ۠ۜۚۛۢۧۙۦۧۦۦ۫۠ۨۘۡۘ"
        L_0x0176:
            int r22 = r1.hashCode()
            r22 = r22 ^ r21
            switch(r22) {
                case -959350837: goto L_0x018d;
                case 329944554: goto L_0x0187;
                case 1654517417: goto L_0x0180;
                case 1825463401: goto L_0x0190;
                default: goto L_0x017f;
            }
        L_0x017f:
            goto L_0x0176
        L_0x0180:
            java.lang.String r1 = "۠ۚۥۨۙۖۘۤ۠ۛۤۧ۬ۤۢۚۤۡۡۘ۫۬ۙۙۘۨۘۜۙۜۘ"
            goto L_0x001a
        L_0x0184:
            java.lang.String r1 = "ۛۗ۫۠ۧۜۖۤۖۘ۠ۛۖ۟ۘۢ"
            goto L_0x0176
        L_0x0187:
            r1 = 1
            if (r10 == r1) goto L_0x0184
            java.lang.String r1 = "ۡۦ۟ۙۜۘۘۧ۠ۥۘۖۗۘ۠ۡ۠۫ۦۧۘۙۜۖۘۢۧ۬ۛۜ"
            goto L_0x0176
        L_0x018d:
            java.lang.String r1 = "ۢ۠ۥ۬ۤۖۘۢۧۡۘۛۨۘۘۛ۠ۡۘ۠۬ۨۘۦۧۧۚۙۦۦ۫ۜۘ"
            goto L_0x0176
        L_0x0190:
            java.lang.String r1 = "ۜۤ۟ۗ۠ۢۧۤۛ۠ۘۘۢۦۙ"
            goto L_0x001a
        L_0x0194:
            r21 = 1095000325(0x41446105, float:12.273686)
            java.lang.String r1 = "۟ۚۖ۟ۚۨۦۥۧۘۤۡۧۘۢۛۖۘ"
        L_0x0199:
            int r22 = r1.hashCode()
            r22 = r22 ^ r21
            switch(r22) {
                case -1907506733: goto L_0x01a3;
                case -1861837362: goto L_0x01a9;
                case 626421164: goto L_0x020b;
                case 1701440761: goto L_0x01af;
                default: goto L_0x01a2;
            }
        L_0x01a2:
            goto L_0x0199
        L_0x01a3:
            java.lang.String r1 = "۠ۦۛۧۧۥۘۚۘۙۨۦۗ۫۠۬ۡۜۜ۬ۢۥۘۨۙۦ"
            goto L_0x0199
        L_0x01a6:
            java.lang.String r1 = "ۡۚۖۘۡ۫ۜۘۘ۬ۙۚ۫ۥۦ۬ۥۘ"
            goto L_0x0199
        L_0x01a9:
            r1 = 2
            if (r10 != r1) goto L_0x01a6
            java.lang.String r1 = "ۤۧۧۡۘ۠ۛۛۢۗۖۦۘۖۚۡۘ۠ۘۨۦ۟ۖۘۗۧۨ"
            goto L_0x0199
        L_0x01af:
            java.lang.String r1 = "۠ۜۜۙۚ۫ۧۘۥۘۦۜۘۢ۬ۖۘۢۜۘ۠۫۟ۗ۫ۦۘ"
            goto L_0x001a
        L_0x01b3:
            int r8 = java.lang.Math.min(r9, r6)
            java.lang.String r1 = "ۜۖۚۢۤ۠۟ۗۡۡۙ۠ۤۛۗۜۛ۠۬۬ۚۖۙۚۧۧۘ"
            goto L_0x001a
        L_0x01bb:
            java.lang.String r1 = "۠ۛ۟ۛۨۘۧۜۥ۟ۜۤۚ۬۫ۖ۬ۥ"
            r7 = r8
            goto L_0x001a
        L_0x01c0:
            java.lang.String r1 = "ۘ۬ۦۘۛ۠ۜ۟۬ۢ۬ۜۦۘۨۙۧ۬ۦۘۖۘۖۘ"
            r5 = r6
            goto L_0x001a
        L_0x01c5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unknown aspect ratio"
            r1.<init>(r2)
            throw r1
        L_0x01cd:
            int r4 = java.lang.Math.min(r9, r6)
            java.lang.String r1 = "ۙۙۜ۫ۙۜۘۖۗۡۗۚۛۙۥۦۗۙ۫ۙۡۘۗۗ۫"
            goto L_0x001a
        L_0x01d5:
            java.lang.String r1 = "۫۟ۘۘۧۜۦۘۨۤۥۖۚ۟ۨۗ۠ۗ۟۠ۦۖۢ"
            r7 = r9
            goto L_0x001a
        L_0x01da:
            java.lang.String r1 = "ۡۨۦۤۤۨۚ۟۫ۚۨۥۦۘۛۡۙۖۦۥۥ"
            r5 = r4
            goto L_0x001a
        L_0x01df:
            int r3 = java.lang.Math.min(r9, r6)
            java.lang.String r1 = "ۘۚۥۘۚۘۡ۫ۨۥۡ۬ۛۖۥۦ۠ۢۜۘۚۘۧۘۡۘۖۘۚۢ۟"
            goto L_0x001a
        L_0x01e7:
            java.lang.String r1 = "ۨ۬ۛۢۧۥۘۢۗۘ۟ۡۥۘۥۘۤۘۦۘۤۥۤ"
            r2 = r3
            goto L_0x001a
        L_0x01ec:
            java.lang.String r1 = "ۥۘۧۘۧۦۜۘۘۗۥۚۧۨۘ۫ۖۗ"
            r5 = r2
            goto L_0x001a
        L_0x01f1:
            java.lang.String r1 = "ۗۛۥۛۧۥۘۧۖ۬۫ۦ۫ۙۗ"
            r7 = r3
            goto L_0x001a
        L_0x01f6:
            r0 = r24
            r0.setMeasuredDimension(r7, r5)
            java.lang.String r1 = "ۗۘۚۧۛ۬ۤۦۖۘۨۛۢۖۜۡۢۨۡۘۛۦۧ"
            goto L_0x001a
        L_0x01ff:
            java.lang.String r1 = "۫ۡۥ۟ۦۘۛۖۡۘ۠۫ۜۚۗۦۦۦۘۥۛ۫ۥ۬ۖۘ"
            goto L_0x001a
        L_0x0203:
            java.lang.String r1 = "۟ۦۦۡۥۡ۠۬ۘۘ۬ۙۚۨ۫ۖۘ"
            goto L_0x001a
        L_0x0207:
            java.lang.String r1 = "ۢ۫ۘۘۧۤۖۡۡۦۘ۠ۗۗۦۥۦۜۚۧۦۥ۫ۚۦ"
            goto L_0x001a
        L_0x020b:
            java.lang.String r1 = "۫ۙۛۘ۫ۤۙۖ۫ۗۚۜۢۘ"
            goto L_0x001a
        L_0x020f:
            java.lang.String r1 = "ۗۛۥۛۧۥۘۧۖ۬۫ۦ۫ۙۗ"
            goto L_0x001a
        L_0x0213:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView.onMeasure(int, int):void");
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        c cVar = null;
        String str = "ۦۤۚ۬ۘ۟۟ۤۗۙۖۧ۟ۢۥۘۧۘۧۥۧۘۥۨۘ";
        while (true) {
            switch ((str.hashCode() ^ 6) ^ 490270735) {
                case -1909282671:
                    super.onRestoreInstanceState(cVar.getSuperState());
                    str = "۫ۘۢ۬ۘۤۦ۫ۥۘۥۛۥۘۙۧۚ";
                    break;
                case -1651350175:
                    this.f1319v = cVar.f2375b;
                    str = "ۢۦ۠ۥۜۗۡ۬ۤ۬۫ۛ۠ۡۧۘۛۘۖۨۨۧۥۧ۬ۘۛۤ";
                    break;
                case -1479152969:
                    this.f1320w = cVar.f2376c;
                    str = "ۗۜ۬ۤ۠ۙۖ۠ۥۘۘۚۚۨ۠ۨۘۦۗۖۘۗۧۦۘۗۧ";
                    break;
                case -1277614951:
                    str = "ۨۢۢۥ۫ۡۘ۬ۦۥ۫ۖۥۘۥۜۦ";
                    break;
                case -687436357:
                    this.f1321x = cVar.f2377d;
                    str = "۟۬ۘۘ۠ۘۧۘۚۘۘۛۗۦۤۗۚ۫ۢۦۘۧۚۗۥۨۖۘ";
                    break;
                case 328405633:
                    setPattern(0, PatternLockUtils.stringToPattern(this, cVar.f2374a));
                    str = "ۙۜۥۥ۬ۜۘۘۨۘۘۤۥۚۥۖۙ۟۬ۙ";
                    break;
                case 645218402:
                    str = "ۢ۠ۚۖۚۜۘ۬۫ۜۧۦۨۘۜۢۥۘ";
                    break;
                case 651064896:
                    str = "ۜۧۛۨۥۤۚۡ۬ۧۗۛۛۦۜۙۡۘۢۚ۠ۗۛۦۖۨۨۘ";
                    cVar = (c) parcelable;
                    break;
                case 883588054:
                    this.f1322y = cVar.f2378e;
                    str = "ۜۖۦ۬ۘ۟ۚۦۙۜۜ۟ۚ۬ۥۘ";
                    break;
                case 900972951:
                    return;
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        String str = "ۢۧۦۘۗۙۛۗۖۘۥ۟ۡۘۛۖۨۧۖ۬ۛۖۖۖۤۧ";
        while (true) {
            switch ((str.hashCode() ^ 798) ^ 109446998) {
                case 212821232:
                    return new c(super.onSaveInstanceState(), PatternLockUtils.patternToString(this, this.f1315r), this.f1319v, this.f1320w, this.f1321x, this.f1322y);
                case 961403262:
                    str = "ۢۡۦۧۘۢۥۨ۟۫۟ۜۜۛۗۦۛۙۘۥۙۢ";
                    break;
            }
        }
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        String str = "ۧ۠ۡۥۡۢ۟ۘۡۨ۬ۜۖۗۛ";
        while (true) {
            switch ((str.hashCode() ^ 904) ^ 2099023689) {
                case -1714135294:
                    str = "ۥۚۙۨۜۚۤۖۖۘ۠ۗ۟ۚۜۨ";
                    break;
                case -1206597882:
                    return;
                case -1094345835:
                    str = "ۚۛۢۙۘۖۗۤۥ۟۟ۡۘۖۘۨۘ";
                    break;
                case -640249256:
                    this.A = ((float) ((i2 - getPaddingLeft()) - getPaddingRight())) / ((float) H);
                    str = "ۘۥۨۨۧۨ۬ۙ۫ۖۗۖۚۙۥۨۤۡۘ";
                    break;
                case 433552266:
                    str = "ۡ۠۠ۧۨۡۡۨۗۨۥ۠ۤۦۢۧۗ۬ۛۖۙۦۙۜۘۙۗۜۘ";
                    break;
                case 909199589:
                    str = "ۚۖۨۘۗ۬ۜۘۙۡۧۘ۫۬۠ۗۚۡۘ";
                    break;
                case 1403517557:
                    this.B = ((float) ((i3 - getPaddingTop()) - getPaddingBottom())) / ((float) H);
                    str = "ۦۛۖۘۢۗۘۖۗۘۖۖۡۘۨۤۥ";
                    break;
                case 1440350701:
                    str = "ۡۢۨۘۤ۬ۘۘۡ۬ۥ۫ۛۖ۟ۚۧۙۨۚ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0877, code lost:
        r4 = "ۦۨ۟ۚۛۨۘۧۗۘۜۖۜۥ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x088b, code lost:
        r4 = "ۛ۠ۥۥ۬ۡۢۡۡ۠۫ۚ۬ۚۦ۫ۙۢۦۡۨ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r69) {
        /*
            r68 = this;
            r65 = 0
            r59 = 0
            r64 = 0
            r63 = 0
            r62 = 0
            r61 = 0
            r60 = 0
            r57 = 0
            r55 = 0
            r56 = 0
            r54 = 0
            r52 = 0
            r53 = 0
            r51 = 0
            r50 = 0
            r49 = 0
            r48 = 0
            r45 = 0
            r46 = 0
            r44 = 0
            r43 = 0
            r42 = 0
            r35 = 0
            r41 = 0
            r37 = 0
            r39 = 0
            r33 = 0
            r32 = 0
            r31 = 0
            r30 = 0
            r29 = 0
            r28 = 0
            r27 = 0
            r26 = 0
            r34 = 0
            r36 = 0
            r38 = 0
            r40 = 0
            r25 = 0
            r58 = 0
            r47 = 0
            r24 = 0
            r23 = 0
            r21 = 0
            r19 = 0
            r18 = 0
            r17 = 0
            r20 = 0
            r16 = 0
            r22 = 0
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
            java.lang.String r3 = "۠ۨۗۘۢۗ۟۟ۛ۬ۘۧ۫ۗۧۡۨۖۘ۟ۦۙۡۛ"
            r4 = r3
        L_0x0072:
            int r3 = r4.hashCode()
            r66 = 441(0x1b9, float:6.18E-43)
            r67 = 1801844918(0x6b65f8b6, float:2.7801852E26)
            r3 = r3 ^ r66
            r3 = r3 ^ r67
            switch(r3) {
                case -2133182662: goto L_0x089f;
                case -2093654300: goto L_0x0872;
                case -2087602828: goto L_0x037d;
                case -2049913049: goto L_0x02d2;
                case -2034112530: goto L_0x07e1;
                case -1998465701: goto L_0x0683;
                case -1965201140: goto L_0x022c;
                case -1934785670: goto L_0x08ae;
                case -1888928615: goto L_0x01a7;
                case -1821996713: goto L_0x0209;
                case -1772540650: goto L_0x01df;
                case -1717037131: goto L_0x0447;
                case -1645084147: goto L_0x049e;
                case -1628484960: goto L_0x0315;
                case -1596121444: goto L_0x067c;
                case -1589205654: goto L_0x0660;
                case -1557509999: goto L_0x0849;
                case -1557273115: goto L_0x050c;
                case -1527080164: goto L_0x01d8;
                case -1525716448: goto L_0x0376;
                case -1475916899: goto L_0x0240;
                case -1424897101: goto L_0x06f5;
                case -1400153094: goto L_0x055a;
                case -1399045097: goto L_0x0565;
                case -1397293863: goto L_0x042b;
                case -1331755064: goto L_0x036f;
                case -1301087853: goto L_0x0095;
                case -1296963562: goto L_0x00b9;
                case -1271083301: goto L_0x0840;
                case -1217603969: goto L_0x05b8;
                case -1193244016: goto L_0x03fe;
                case -1156309796: goto L_0x07a8;
                case -1154446007: goto L_0x0185;
                case -1034420448: goto L_0x03d1;
                case -1016298454: goto L_0x0521;
                case -971041429: goto L_0x0629;
                case -871097681: goto L_0x04e0;
                case -837772774: goto L_0x016d;
                case -820489068: goto L_0x085e;
                case -811242304: goto L_0x068a;
                case -713465604: goto L_0x008b;
                case -712302200: goto L_0x03bf;
                case -701498132: goto L_0x089a;
                case -677080814: goto L_0x07fb;
                case -667038149: goto L_0x0700;
                case -661706729: goto L_0x01e6;
                case -626384052: goto L_0x076a;
                case -608755287: goto L_0x0794;
                case -600967778: goto L_0x0571;
                case -563339807: goto L_0x08c7;
                case -530134001: goto L_0x0601;
                case -459944477: goto L_0x0641;
                case -443566897: goto L_0x03ef;
                case -434983337: goto L_0x057d;
                case -432283305: goto L_0x07b0;
                case -414284232: goto L_0x0758;
                case -401071443: goto L_0x0280;
                case -378784064: goto L_0x034d;
                case -356871883: goto L_0x0179;
                case -330013808: goto L_0x0102;
                case -320360450: goto L_0x040d;
                case -304919539: goto L_0x041c;
                case -268453447: goto L_0x0775;
                case -267653152: goto L_0x0513;
                case -262877041: goto L_0x0129;
                case -244081220: goto L_0x03e0;
                case -193149184: goto L_0x0746;
                case -165758163: goto L_0x0290;
                case -55927245: goto L_0x0808;
                case -9920468: goto L_0x01be;
                case 47179842: goto L_0x01d1;
                case 52088973: goto L_0x084c;
                case 80072169: goto L_0x05c2;
                case 82201518: goto L_0x01c9;
                case 114765275: goto L_0x072f;
                case 166311243: goto L_0x0440;
                case 195804844: goto L_0x04ee;
                case 205778345: goto L_0x0083;
                case 224067725: goto L_0x04d9;
                case 267855562: goto L_0x00e3;
                case 282381154: goto L_0x0837;
                case 288728451: goto L_0x052e;
                case 359459581: goto L_0x04c5;
                case 365073361: goto L_0x0691;
                case 374148576: goto L_0x05c9;
                case 477119893: goto L_0x0761;
                case 515636012: goto L_0x04d2;
                case 549542288: goto L_0x0473;
                case 568531969: goto L_0x00db;
                case 598256362: goto L_0x0589;
                case 630217150: goto L_0x04ab;
                case 654368343: goto L_0x0672;
                case 688644340: goto L_0x0668;
                case 705907980: goto L_0x014b;
                case 713041573: goto L_0x0466;
                case 723167562: goto L_0x06c0;
                case 800348400: goto L_0x019f;
                case 808557043: goto L_0x01a9;
                case 870117708: goto L_0x06b7;
                case 896123744: goto L_0x0250;
                case 897945423: goto L_0x0815;
                case 957600391: goto L_0x0480;
                case 1012094516: goto L_0x0698;
                case 1023189619: goto L_0x0249;
                case 1063695542: goto L_0x06a5;
                case 1099219945: goto L_0x0636;
                case 1127310819: goto L_0x02fe;
                case 1149075230: goto L_0x016f;
                case 1162181671: goto L_0x07c2;
                case 1190289190: goto L_0x01b5;
                case 1271425478: goto L_0x058c;
                case 1279114738: goto L_0x0306;
                case 1354598661: goto L_0x07ee;
                case 1366764485: goto L_0x02f4;
                case 1391752784: goto L_0x071f;
                case 1426629970: goto L_0x048f;
                case 1467140859: goto L_0x08bd;
                case 1471938814: goto L_0x02a6;
                case 1485420564: goto L_0x0297;
                case 1501847938: goto L_0x051a;
                case 1505023877: goto L_0x0324;
                case 1561371068: goto L_0x0732;
                case 1612035839: goto L_0x06cd;
                case 1631395991: goto L_0x04b8;
                case 1640109220: goto L_0x0287;
                case 1654058409: goto L_0x0239;
                case 1679427907: goto L_0x053b;
                case 1681571339: goto L_0x05d0;
                case 1694170636: goto L_0x073e;
                case 1707025409: goto L_0x05fa;
                case 1733648329: goto L_0x0439;
                case 1754371013: goto L_0x04e7;
                case 1789590253: goto L_0x03a0;
                case 1832920773: goto L_0x018d;
                case 1860141369: goto L_0x009b;
                case 1893673599: goto L_0x079e;
                case 1895335956: goto L_0x0432;
                case 1900267242: goto L_0x0868;
                case 1906661173: goto L_0x07ba;
                case 1969971233: goto L_0x0750;
                case 1971494294: goto L_0x0197;
                case 1986017608: goto L_0x02b3;
                case 2043081852: goto L_0x0346;
                case 2043610358: goto L_0x05f3;
                case 2088871195: goto L_0x0273;
                case 2132260475: goto L_0x0087;
                case 2138676837: goto L_0x0727;
                default: goto L_0x0082;
            }
        L_0x0082:
            goto L_0x0072
        L_0x0083:
            java.lang.String r3 = "ۧ۫ۜۘ۫ۦۖۘۜۡ۬ۧ۬۬۬ۧ۬"
            r4 = r3
            goto L_0x0072
        L_0x0087:
            java.lang.String r3 = "ۦۖۥۘۚۥ۟ۜۘۛ۟ۤۖۘۤۖۡۘۥۨۦۘ"
            r4 = r3
            goto L_0x0072
        L_0x008b:
            r0 = r68
            boolean r0 = r0.f1320w
            r65 = r0
            java.lang.String r3 = "۠ۚۦ۬ۥۡ۟ۦۘۘۥۖۧۚۡۖ۟ۚۧۚۙ۫"
            r4 = r3
            goto L_0x0072
        L_0x0095:
            r59 = 0
            java.lang.String r3 = "ۛۧۡۢۚۥۢ۠ۡ۟ۙۥۤۘۜ۠ۛۖۘۡۜۜۘۨۖۘۘۙۥۘۘ"
            r4 = r3
            goto L_0x0072
        L_0x009b:
            r4 = 792054754(0x2f35cbe2, float:1.6534288E-10)
            java.lang.String r3 = "ۚ۬ۜۘ۟۫ۖ۬ۗۜۘۚۚ۬ۢۜۡۨۨ"
        L_0x00a0:
            int r66 = r3.hashCode()
            r66 = r66 ^ r4
            switch(r66) {
                case -1513030709: goto L_0x00b5;
                case -1313747300: goto L_0x00b0;
                case 705775234: goto L_0x08c7;
                case 1255551968: goto L_0x00aa;
                default: goto L_0x00a9;
            }
        L_0x00a9:
            goto L_0x00a0
        L_0x00aa:
            java.lang.String r3 = "ۙۥۥۗۥۧۘۚ۬ۨۘۦۤۙ۫ۥ۟۠ۨ۟ۧۗ۬"
            goto L_0x00a0
        L_0x00ad:
            java.lang.String r3 = "ۛۥۖۘۗ۬۟۠ۖ۬ۚ۠ۥۘ۟ۦۡۘۤۜۧ"
            goto L_0x00a0
        L_0x00b0:
            if (r65 == 0) goto L_0x00ad
            java.lang.String r3 = "ۜۤۨۢۘۨۜۡۥۖ۬۠ۥ۠ۢۦۛۙۗۢ۟ۦۡۘ"
            goto L_0x00a0
        L_0x00b5:
            java.lang.String r3 = "ۛ۫ۘۡۥۚۛۖۛۥۖۧۘۚۦۙ"
            r4 = r3
            goto L_0x0072
        L_0x00b9:
            r4 = 879923095(0x34728f97, float:2.2590244E-7)
            java.lang.String r3 = "ۨۜۚۡۦۜۢۢۖۘۤۜۘۥۖۦۚۚۧۙۗۨ"
        L_0x00be:
            int r66 = r3.hashCode()
            r66 = r66 ^ r4
            switch(r66) {
                case -1197056771: goto L_0x084f;
                case 1185230492: goto L_0x00c8;
                case 1207291120: goto L_0x00d7;
                case 2139649762: goto L_0x00d4;
                default: goto L_0x00c7;
            }
        L_0x00c7:
            goto L_0x00be
        L_0x00c8:
            boolean r3 = r68.isEnabled()
            if (r3 != 0) goto L_0x00d1
            java.lang.String r3 = "ۚۛۗۧۤۘۘ۟ۖۨۗۤۜۘۖۡۛۜۨ"
            goto L_0x00be
        L_0x00d1:
            java.lang.String r3 = "ۜ۠ۜ۫۫ۙۢۡۦۘۗۗۥۘۨۥۧۖۙۤۙۖۧۘ"
            goto L_0x00be
        L_0x00d4:
            java.lang.String r3 = "ۛۡ۬۠ۙۛ۫ۜۖۘ۬۫ۥۚۜ۠"
            goto L_0x00be
        L_0x00d7:
            java.lang.String r3 = "ۖۡۗۜ۠ۢۘۡۡ۫ۛ۟۟۫ۧۜۜۤۘۢۜۘۘ۬ۚ"
            r4 = r3
            goto L_0x0072
        L_0x00db:
            int r64 = r69.getAction()
            java.lang.String r3 = "۠ۗۖۘۡ۠ۘۖۛۦۦۛۗۨۥ۫ۛۧۙۜۙۢ"
            r4 = r3
            goto L_0x0072
        L_0x00e3:
            r4 = 1224048053(0x48f57db5, float:502765.66)
            java.lang.String r3 = "ۗۥۘۘۨۢ۠ۢۦۡۘ۬ۤۨۘۧۙۖۤۛۢۘۖۖ"
        L_0x00e8:
            int r66 = r3.hashCode()
            r66 = r66 ^ r4
            switch(r66) {
                case -2099078526: goto L_0x00ff;
                case -1558198102: goto L_0x00f2;
                case 926814819: goto L_0x00fa;
                case 1481890866: goto L_0x08b3;
                default: goto L_0x00f1;
            }
        L_0x00f1:
            goto L_0x00e8
        L_0x00f2:
            java.lang.String r3 = "۟ۙۨۘۗۦۜ۠ۘ۫ۥ۟ۖۘۨۚۧۨۘۘۘ۠ۥ۠۬ۙۜۘۥۗۜ"
            r4 = r3
            goto L_0x0072
        L_0x00f7:
            java.lang.String r3 = "ۛۙۥ۟ۚۦۘۦ۟۫ۘۘۛۧ۫ۨ"
            goto L_0x00e8
        L_0x00fa:
            if (r64 == 0) goto L_0x00f7
            java.lang.String r3 = "ۤۢ۟ۤ۫۬ۗۘۥ۠ۛۜ۫ۡ"
            goto L_0x00e8
        L_0x00ff:
            java.lang.String r3 = "ۨۧۨۘۚۜۖۘۧ۠ۡۨۧۥۘ۠ۚۜ۠۬ۙ۠۬ۢۡۜ"
            goto L_0x00e8
        L_0x0102:
            r4 = 2040055073(0x7998c521, float:9.915342E34)
            java.lang.String r3 = "۟ۧ۫ۜۙ۟ۖۘ۫ۖۖۘۛۢۖۘۨ۫ۨۙۦۥۗ۬ۗۜ۬ۨۘ"
        L_0x0107:
            int r66 = r3.hashCode()
            r66 = r66 ^ r4
            switch(r66) {
                case -1260306578: goto L_0x0124;
                case -1071540071: goto L_0x0119;
                case 516094010: goto L_0x0111;
                case 2108763540: goto L_0x0121;
                default: goto L_0x0110;
            }
        L_0x0110:
            goto L_0x0107
        L_0x0111:
            java.lang.String r3 = "ۚۥۥۘۦۘۦۛۚۧ۫ۛۡۗۢۘ۬ۚۥ"
            r4 = r3
            goto L_0x0072
        L_0x0116:
            java.lang.String r3 = "ۥ۬ۙۜۤۚۘۛۤۛۜۘۖۧۥۧۧۢۦۦ۟"
            goto L_0x0107
        L_0x0119:
            r3 = 1
            r0 = r64
            if (r0 == r3) goto L_0x0116
            java.lang.String r3 = "ۙ۠ۤۗ۠ۙۥۡۚۜۥۖۘۙۛۛۜۘۡۖۡۤۚ۟۟ۘ"
            goto L_0x0107
        L_0x0121:
            java.lang.String r3 = "ۚۢۖ۟ۘ۫۬۫۫ۜۖۘۨۤۧ۫ۨۡۘۨۘۛۨۢ۫"
            goto L_0x0107
        L_0x0124:
            java.lang.String r3 = "ۘ۬ۖۘۨۢۢۜۦۘ۟ۜۦۘۥۦۜۘۗۗۥۘۘ۬ۧۗ۠ۡ"
            r4 = r3
            goto L_0x0072
        L_0x0129:
            r4 = -1280389358(0xffffffffb3aecf12, float:-8.140172E-8)
            java.lang.String r3 = "ۦۘ۫۟ۨۢۗۡۘۘۜۨ۠ۨۢۖۘۥۤۘ۟۠ۜ"
        L_0x012e:
            int r66 = r3.hashCode()
            r66 = r66 ^ r4
            switch(r66) {
                case -1733425886: goto L_0x0859;
                case -1188440881: goto L_0x0146;
                case -976759762: goto L_0x0143;
                case -270315174: goto L_0x0138;
                default: goto L_0x0137;
            }
        L_0x0137:
            goto L_0x012e
        L_0x0138:
            r3 = 2
            r0 = r64
            if (r0 == r3) goto L_0x0140
            java.lang.String r3 = "ۧۧۡۘۤۛۨۘۙۜۥۘ۠ۡۜۘ۟ۗۢۧۖۤ"
            goto L_0x012e
        L_0x0140:
            java.lang.String r3 = "ۗ۬۟ۖۡۚۙۙۛ۟ۤۥۘ۠ۦۜۘ"
            goto L_0x012e
        L_0x0143:
            java.lang.String r3 = "۫ۢۦۤۜۧۘ۬ۥۥۘۜۦۘۤ۬ۥۘۗۚ۬ۜۙ۬ۦۦۨ"
            goto L_0x012e
        L_0x0146:
            java.lang.String r3 = "ۛۙۥۘۦۚۨ۠ۤۦۘۦۡۨۗۖۧۗ"
            r4 = r3
            goto L_0x0072
        L_0x014b:
            r4 = -806086194(0xffffffffcff419ce, float:-8.1906637E9)
            java.lang.String r3 = "ۦۖۤۙ۟ۡۘ۟ۦۧۘ۟۫ۜۡۡۧ۠ۡۧۘ"
        L_0x0150:
            int r66 = r3.hashCode()
            r66 = r66 ^ r4
            switch(r66) {
                case -1256262517: goto L_0x0854;
                case -1037850818: goto L_0x015a;
                case -1032104995: goto L_0x016a;
                case 1398315356: goto L_0x0162;
                default: goto L_0x0159;
            }
        L_0x0159:
            goto L_0x0150
        L_0x015a:
            java.lang.String r3 = "ۧۜۖۘ۠۠ۚۚۜۢۘۙۜ۬ۡۡۘۦۧۧ۫ۖۙ۠ۦۢۗۢ"
            r4 = r3
            goto L_0x0072
        L_0x015f:
            java.lang.String r3 = "ۥۛۨۧۥۘۘۜ۠ۤۥ۠ۡۘ۫ۦ۫ۨ۬ۗ"
            goto L_0x0150
        L_0x0162:
            r3 = 3
            r0 = r64
            if (r0 == r3) goto L_0x015f
            java.lang.String r3 = "ۚۧۖۥۦۖۛ۬ۨۚۢۜۘۗۡ۬"
            goto L_0x0150
        L_0x016a:
            java.lang.String r3 = "ۥۡۧۜۙ۟ۨ۫ۘۘۧ۬۠ۖۤ۟"
            goto L_0x0150
        L_0x016d:
            r3 = 0
        L_0x016e:
            return r3
        L_0x016f:
            r3 = 0
            r0 = r68
            r0.f1323z = r3
            java.lang.String r3 = "ۜۛۜۘۖۖۜۧۨۗۨۡۢۡۗۡۘۤۡۘ"
            r4 = r3
            goto L_0x0072
        L_0x0179:
            r0 = r68
            java.util.ArrayList r3 = r0.f1315r
            r3.clear()
            java.lang.String r3 = "ۗۖۡۘۖۙۨۜۛ۫۫ۨۨۘ۫ۧۘۘ"
            r4 = r3
            goto L_0x0072
        L_0x0185:
            r68.b()
            java.lang.String r3 = "ۜۚۚۦۚۢۘ۟ۦۘۦۡۗۥ۫ۥۘ"
            r4 = r3
            goto L_0x0072
        L_0x018d:
            r3 = 0
            r0 = r68
            r0.f1319v = r3
            java.lang.String r3 = "ۗۡ۠۠ۡۦ۫۟۬ۚۙۜۖۖۦ۬ۧۜۖۦۘ"
            r4 = r3
            goto L_0x0072
        L_0x0197:
            r68.invalidate()
            java.lang.String r3 = "ۤ۠ۧۥۙ۠ۗۛ۠ۧۤۙ۠ۖ۫ۖۡ"
            r4 = r3
            goto L_0x0072
        L_0x019f:
            r68.h()
            java.lang.String r3 = "ۢ۟ۨۘۤ۫ۢ۫ۢۧۘۤۡۘۙۢۥ۠ۖ۬ۖۗۖ"
            r4 = r3
            goto L_0x0072
        L_0x01a7:
            r3 = 1
            goto L_0x016e
        L_0x01a9:
            r0 = r68
            int r3 = r0.f1307j
            float r0 = (float) r3
            r63 = r0
            java.lang.String r3 = "۬ۖۘۘ۟۟ۢۤۘۢۛۦۥۥۚۨۨۙۛۗۥۨۘۚۗۥۘ"
            r4 = r3
            goto L_0x0072
        L_0x01b5:
            int r62 = r69.getHistorySize()
            java.lang.String r3 = "ۨۗۥۘۙ۫۠ۗۦۡۘۤۦۤ۠ۧ۬ۚۙۡۘۦۚۢ"
            r4 = r3
            goto L_0x0072
        L_0x01be:
            r0 = r68
            android.graphics.Rect r0 = r0.E
            r61 = r0
            java.lang.String r3 = "ۚۥۨۘۤۖۘۤۥۥ۠۠ۥۘۚ۠۟۟۠۬ۡ۫ۡۘ۠۠ۖۘ"
            r4 = r3
            goto L_0x0072
        L_0x01c9:
            r61.setEmpty()
            java.lang.String r3 = "ۜۖۚ۠ۖۢۘۧۡۘۛۙۨۘۡۡۦۛۥۘۡۧۗۙۛۘ"
            r4 = r3
            goto L_0x0072
        L_0x01d1:
            r60 = 0
            java.lang.String r3 = "ۨ۫ۢۦۡ۠ۚ۟ۦۖۦۡۗ۠ۜۘۙۥۧۤۗۡ۠ۤۥۘۙۛۚ"
            r4 = r3
            goto L_0x0072
        L_0x01d8:
            java.lang.String r3 = "ۧۥۛۨۨۦ۬ۚۚ۬ۖۛۘۧۥ۟ۙۡۘ"
            r4 = r3
            r47 = r60
            goto L_0x0072
        L_0x01df:
            java.lang.String r3 = "ۧ۫ۙۤ۬ۥۗ۬ۛۘۖۙۚۜۨۘۛۖۦۧۢۡۗۗۢ"
            r4 = r3
            r58 = r59
            goto L_0x0072
        L_0x01e6:
            r4 = 1056463242(0x3ef8598a, float:0.48505813)
            java.lang.String r3 = "ۘۘۖۨۤۗۨ۫ۡۗۜۜۘ۫۠ۦۘۢ۬ۨۢۜۘۘۘۘ۠ۜۨۘ"
        L_0x01eb:
            int r66 = r3.hashCode()
            r66 = r66 ^ r4
            switch(r66) {
                case -1571879515: goto L_0x0890;
                case -564295249: goto L_0x0204;
                case 1257041298: goto L_0x01f5;
                case 1332053737: goto L_0x01fb;
                default: goto L_0x01f4;
            }
        L_0x01f4:
            goto L_0x01eb
        L_0x01f5:
            java.lang.String r3 = "ۤۡۦۘۜ۟ۜۘۗ۫ۙ۟۟ۤۛ۟ۦۘۦ۟ۜۚ۠ۛۗۡۖۘۙۘۥ"
            goto L_0x01eb
        L_0x01f8:
            java.lang.String r3 = "ۚۤۥۢۖ۠ۖ۟ۖ۫ۗۨۘۥ۟ۡ"
            goto L_0x01eb
        L_0x01fb:
            int r3 = r62 + 1
            r0 = r58
            if (r0 >= r3) goto L_0x01f8
            java.lang.String r3 = "ۖۙۖۘۘۦۢۨۧۧۤۧۧۡۛۥۘ"
            goto L_0x01eb
        L_0x0204:
            java.lang.String r3 = "ۜۗۡۢۛۥۢۨۗۘۦۜۘۨۤۢۘ۬ۖۘ۫ۜۘۘ"
            r4 = r3
            goto L_0x0072
        L_0x0209:
            r4 = -442744327(0xffffffffe59c41f9, float:-9.223827E22)
            java.lang.String r3 = "ۢۡۧۙۜۨۘۖۗۧۥۙۨۘۗۗ۬"
        L_0x020e:
            int r66 = r3.hashCode()
            r66 = r66 ^ r4
            switch(r66) {
                case -678306455: goto L_0x0229;
                case -351017877: goto L_0x0218;
                case 10425925: goto L_0x0863;
                case 599391204: goto L_0x0220;
                default: goto L_0x0217;
            }
        L_0x0217:
            goto L_0x020e
        L_0x0218:
            java.lang.String r3 = "ۗۛۨۘ۠ۚ۬۬ۚۦۗ۠ۤۛۢۙۢۦۘ"
            r4 = r3
            goto L_0x0072
        L_0x021d:
            java.lang.String r3 = "ۘۗۙۛ۠ۛۥۥۘۦۙۜۘۡۘۘۘۖ۫۫۫ۗۗۨ۟ۡۘۜۦ۫"
            goto L_0x020e
        L_0x0220:
            r0 = r58
            r1 = r62
            if (r0 >= r1) goto L_0x021d
            java.lang.String r3 = "ۢ۫ۗ۟ۙۙ۟۟ۦۡ۠ۙۡۨۜ"
            goto L_0x020e
        L_0x0229:
            java.lang.String r3 = "ۖۙۥۘۢۤۙۘۢۧۙۘۘ۟۟ۨۘۛۧۚۛ۬"
            goto L_0x020e
        L_0x022c:
            r0 = r69
            r1 = r58
            float r57 = r0.getHistoricalX(r1)
            java.lang.String r3 = "ۜۨ۠ۧۜۛ۬ۢۢۥۛۚۢۚۡۘۨۨۡۘۙۙۖ"
            r4 = r3
            goto L_0x0072
        L_0x0239:
            java.lang.String r3 = "۟۠ۥۘ۫ۡۨۘ۬ۤۖۖ۠۟ۤۘ"
            r4 = r3
            r56 = r57
            goto L_0x0072
        L_0x0240:
            float r55 = r69.getX()
            java.lang.String r3 = "ۥ۫۟ۢ۟ۡۘۖۤۙۘ۠۟ۗۚۥۘۘۡۚ۠ۡۜۘۘۨۨۘۙۦۨۘ"
            r4 = r3
            goto L_0x0072
        L_0x0249:
            java.lang.String r3 = "ۨۤۘۘۙۖۢۗۜۨۘ۠ۧۡۧۗۜۥ۫ۥ"
            r4 = r3
            r56 = r55
            goto L_0x0072
        L_0x0250:
            r4 = 1535241852(0x5b81ee7c, float:7.3144977E16)
            java.lang.String r3 = "۫۫ۥۚ۠ۖۘۧۖۖۘۜۖۙۨۘ۠۠ۧ۫ۗۤۜۘ"
        L_0x0255:
            int r66 = r3.hashCode()
            r66 = r66 ^ r4
            switch(r66) {
                case -1289392958: goto L_0x025f;
                case 391173166: goto L_0x086d;
                case 414769855: goto L_0x026b;
                case 1169998908: goto L_0x026e;
                default: goto L_0x025e;
            }
        L_0x025e:
            goto L_0x0255
        L_0x025f:
            r0 = r58
            r1 = r62
            if (r0 >= r1) goto L_0x0268
            java.lang.String r3 = "ۖۦۨۙۖ۠ۜۨۖۘ۫ۘۘۘۥۙۦۥۧۨ۠ۧۨ۬ۙۗ"
            goto L_0x0255
        L_0x0268:
            java.lang.String r3 = "ۙۤۨۘۗۡۥۚ۟ۨۘۚۘۘۨۦۖۨۜۙ"
            goto L_0x0255
        L_0x026b:
            java.lang.String r3 = "۟ۥۧۘ۠ۡ۬۬ۙۜۜ۫ۡۡۧۘۚۙ۬ۨ۬ۖ"
            goto L_0x0255
        L_0x026e:
            java.lang.String r3 = "ۨۙۡۘ۠ۤۛۜۘۧۘ۠ۖۨۘۘۧۖۘ۟ۦۧۘۨۙ۫ۧۦ۬ۡۧۘ"
            r4 = r3
            goto L_0x0072
        L_0x0273:
            r0 = r69
            r1 = r58
            float r54 = r0.getHistoricalY(r1)
            java.lang.String r3 = "۫۟ۥۘۡۢۧ۠ۤۙۛۜۜۘ۟ۙۛۗۘۥۘ"
            r4 = r3
            goto L_0x0072
        L_0x0280:
            java.lang.String r3 = "۟ۗۖۘۜۙۗ۠ۚۛۗۦۛۛۡۤۨۖۘۦۙۥۦۘۘ"
            r4 = r3
            r53 = r54
            goto L_0x0072
        L_0x0287:
            float r52 = r69.getY()
            java.lang.String r3 = "ۜ۠ۦۢۜ۫ۨۖۤۚۤۨۘۦۨۗۜۥۡۖۥۗۛۘۚۛ۟۟"
            r4 = r3
            goto L_0x0072
        L_0x0290:
            java.lang.String r3 = "ۘۜۨۧ۫ۛۗ۟ۖۢۤۜۤۥۧۜۢۨ"
            r4 = r3
            r53 = r52
            goto L_0x0072
        L_0x0297:
            r0 = r68
            r1 = r56
            r2 = r53
            com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView$Dot r51 = r0.c(r1, r2)
            java.lang.String r3 = "ۢۤۘۘۦۦ۟ۥۡۥۘۨۙۤۧۤۛۥۛۜۖۗۚۚۗۢ۫ۡ"
            r4 = r3
            goto L_0x0072
        L_0x02a6:
            r0 = r68
            java.util.ArrayList r3 = r0.f1315r
            int r50 = r3.size()
            java.lang.String r3 = "ۢ۫ۜۘ۟ۖۛۦۨۧۘ۫ۖۦۘۢۢۢۡۦ۟"
            r4 = r3
            goto L_0x0072
        L_0x02b3:
            r4 = 20646472(0x13b0a48, float:3.4353852E-38)
            java.lang.String r3 = "ۛ۫ۚ۟ۚۤۖۧۜۙۖۘۘۤۙۡۘۧۤۙ"
        L_0x02b8:
            int r66 = r3.hashCode()
            r66 = r66 ^ r4
            switch(r66) {
                case -1462357851: goto L_0x0877;
                case -1083509564: goto L_0x02cd;
                case 149181411: goto L_0x02c2;
                case 1133841039: goto L_0x02c8;
                default: goto L_0x02c1;
            }
        L_0x02c1:
            goto L_0x02b8
        L_0x02c2:
            java.lang.String r3 = "ۤ۬ۖۘۢ۫ۢۙ۫ۨۗ۟۫ۨۥۥۘ"
            goto L_0x02b8
        L_0x02c5:
            java.lang.String r3 = "ۗۡۖۚۘۢۨۦۘۛ۠ۨۛ۟ۤۚۨ"
            goto L_0x02b8
        L_0x02c8:
            if (r51 == 0) goto L_0x02c5
            java.lang.String r3 = "ۛ۠ۙۖ۟ۤۗۘۥۘ۟ۘ۠ۜ۠۠۠ۖۥۗۢۤۡۡۧۘ"
            goto L_0x02b8
        L_0x02cd:
            java.lang.String r3 = "ۥ۟ۖۗۘۢۖۨۨۘۡۜۡۜ۟ۥۘۛۛۛۚۙۛۛۛ۫ۗ۟ۥ"
            r4 = r3
            goto L_0x0072
        L_0x02d2:
            r4 = 2033997054(0x793c54fe, float:6.111723E34)
            java.lang.String r3 = "ۜۧۡۘۡۦۥ۫ۧۨۘۧ۫ۜۘۛ۬ۦۘ"
        L_0x02d7:
            int r66 = r3.hashCode()
            r66 = r66 ^ r4
            switch(r66) {
                case -1858863298: goto L_0x02ef;
                case -613085133: goto L_0x02e1;
                case -492836501: goto L_0x02ec;
                case 1626521571: goto L_0x0877;
                default: goto L_0x02e0;
            }
        L_0x02e0:
            goto L_0x02d7
        L_0x02e1:
            r3 = 1
            r0 = r50
            if (r0 != r3) goto L_0x02e9
            java.lang.String r3 = "ۜۨۨ۠ۜۜۘۘۡ۬ۙ۬ۤۘ۬۫ۢۚۘۛۥ"
            goto L_0x02d7
        L_0x02e9:
            java.lang.String r3 = "ۤۤۗۚۖۗۦ۟ۨ۫ۦۨۘۥۗۚۘۗ۟۬ۜۗۢ۫ۥۘۙۢۛ"
            goto L_0x02d7
        L_0x02ec:
            java.lang.String r3 = "ۡ۬ۧ۬ۛۦۘۨۦۦۚۘۦۘۜۡ"
            goto L_0x02d7
        L_0x02ef:
            java.lang.String r3 = "۬۫ۡۘ۬ۗۖۡۡۘۚ۬ۖۨۘۛ"
            r4 = r3
            goto L_0x0072
        L_0x02f4:
            r3 = 1
            r0 = r68
            r0.f1323z = r3
            java.lang.String r3 = "ۘۡۗۗۢۦۢۜۥ۬ۧۜۤۚۥۘ"
            r4 = r3
            goto L_0x0072
        L_0x02fe:
            r68.i()
            java.lang.String r3 = "ۦۨ۟ۚۛۨۘۧۗۘۜۖۜۥ"
            r4 = r3
            goto L_0x0072
        L_0x0306:
            r0 = r68
            float r3 = r0.f1317t
            float r3 = r56 - r3
            float r49 = java.lang.Math.abs(r3)
            java.lang.String r3 = "ۧ۫ۨۗۥۦۘ۠ۧۖ۟ۘۙۦۡ۟"
            r4 = r3
            goto L_0x0072
        L_0x0315:
            r0 = r68
            float r3 = r0.f1318u
            float r3 = r53 - r3
            float r48 = java.lang.Math.abs(r3)
            java.lang.String r3 = "۬۟ۘۘۨۧۨۘ۟ۧۦۘۡۛۗۡۖۦۜۢۧۦۗۧ۟ۨۜۘ"
            r4 = r3
            goto L_0x0072
        L_0x0324:
            r4 = 1762115989(0x6907c195, float:1.0257447E25)
            java.lang.String r3 = "ۢۘۨۘ۠ۚۘ۬ۨۘۡۖۡۘ۟ۡۥ۬ۧۧ"
        L_0x0329:
            int r66 = r3.hashCode()
            r66 = r66 ^ r4
            switch(r66) {
                case -1327107189: goto L_0x087c;
                case 240668972: goto L_0x0339;
                case 962255467: goto L_0x0341;
                case 1783188666: goto L_0x0333;
                default: goto L_0x0332;
            }
        L_0x0332:
            goto L_0x0329
        L_0x0333:
            java.lang.String r3 = "ۖۡۡۘ۠ۛۘۡۚۥ۟ۚۖۘ۬۬ۨۘ"
            goto L_0x0329
        L_0x0336:
            java.lang.String r3 = "ۛ۠۠ۧ۟۫ۡۜۚ۫ۗۜۥۖۘ"
            goto L_0x0329
        L_0x0339:
            r3 = 0
            int r3 = (r49 > r3 ? 1 : (r49 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x0336
            java.lang.String r3 = "ۜۘۜۗۡۘۤۗۡۘۦۡۘۤۧۗ"
            goto L_0x0329
        L_0x0341:
            java.lang.String r3 = "ۘۚ۟ۨ۫ۙ۟ۧۨۘۙ۫۟ۗۡ۠ۧۚۥ۠ۚۡۘۚۖۘ"
            r4 = r3
            goto L_0x0072
        L_0x0346:
            java.lang.String r3 = "ۦۡۡۤ۫ۤ۬۟ۖۘۧ۫ۧۘۤۥۘۖۘۖۘۨۘۢ۟ۖۥۘۨۢ۫"
            r4 = r3
            r46 = r47
            goto L_0x0072
        L_0x034d:
            r4 = -1333478574(0xffffffffb084bb52, float:-9.657504E-10)
            java.lang.String r3 = "ۛۗۖۚ۟ۨۧ۫ۧۘۗۡۘ۫ۚۧۙۗۛۚۤۡۘ"
        L_0x0352:
            int r66 = r3.hashCode()
            r66 = r66 ^ r4
            switch(r66) {
                case -2039882565: goto L_0x036a;
                case -1561236064: goto L_0x0367;
                case -38831164: goto L_0x035c;
                case 609243566: goto L_0x0881;
                default: goto L_0x035b;
            }
        L_0x035b:
            goto L_0x0352
        L_0x035c:
            r3 = 0
            int r3 = (r48 > r3 ? 1 : (r48 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0364
            java.lang.String r3 = "ۙۖۦۦۚۦۘۥۜ۬ۖۘۥۤۜ۬۬۟ۘۚۡۖۦۗ"
            goto L_0x0352
        L_0x0364:
            java.lang.String r3 = "ۚۙ۟ۙۢۡۨۡۜۘۨۙۨۦۢۚۦۛۚۦۤۧۚۛۥۘۡۛۢ"
            goto L_0x0352
        L_0x0367:
            java.lang.String r3 = "۠۫ۖۘ۟ۛۧ۟ۜۥۘۘ۫ۚ۬ۤۚ"
            goto L_0x0352
        L_0x036a:
            java.lang.String r3 = "ۙۡۥۘ۬ۦۜۘۙۡۖ۫ۤۡۘۛۧۥۘۚۦۡۘۗۦۘۥۢۨۘ"
            r4 = r3
            goto L_0x0072
        L_0x036f:
            r45 = 1
            java.lang.String r3 = "ۙۚۘ۬ۧ۬ۛۦۥۘۦۚۘۘۤۦ۠۫ۖ۬"
            r4 = r3
            goto L_0x0072
        L_0x0376:
            java.lang.String r3 = "ۚۛۦۘ۟ۤۘۗۛۦۖۗۘۤۚۚۥۧۗۨ۟ۘ"
            r4 = r3
            r46 = r45
            goto L_0x0072
        L_0x037d:
            r4 = -1712346916(0xffffffff99efa8dc, float:-2.4780223E-23)
            java.lang.String r3 = "ۜ۟ۗۢۥۙۖ۠ۙۧ۫ۛۘۛۦۘۘ"
        L_0x0382:
            int r66 = r3.hashCode()
            r66 = r66 ^ r4
            switch(r66) {
                case -1288407963: goto L_0x0394;
                case -1136987277: goto L_0x038c;
                case -60486561: goto L_0x088b;
                case 569214495: goto L_0x039d;
                default: goto L_0x038b;
            }
        L_0x038b:
            goto L_0x0382
        L_0x038c:
            java.lang.String r3 = "ۘۛۡ۠ۘۖۢ۬ۗ۫ۨۛۙۢۨ۟ۜۦۘۡ۫ۨۘۨۙۗۦۦۥۘ"
            r4 = r3
            goto L_0x0072
        L_0x0391:
            java.lang.String r3 = "ۨۛۛۛ۟ۦ۟ۡۜۗۖۜۢۚۘۘۚۖۚۡۛ"
            goto L_0x0382
        L_0x0394:
            r0 = r68
            boolean r3 = r0.f1323z
            if (r3 == 0) goto L_0x0391
            java.lang.String r3 = "ۧ۬ۜۡۢ۫ۙۖۨۡۢۘۘۘۨ۬"
            goto L_0x0382
        L_0x039d:
            java.lang.String r3 = "ۛۙۥۘۤۥ۟ۤۛۡ۠ۚۙ۠ۚ۫"
            goto L_0x0382
        L_0x03a0:
            r4 = -2140333804(0xffffffff806d1914, float:-1.0019065E-38)
            java.lang.String r3 = "ۡۧۥۘۜۥۗۦ۫۬۬ۧۥۘۗۗۜۘۡۚۧ"
        L_0x03a5:
            int r66 = r3.hashCode()
            r66 = r66 ^ r4
            switch(r66) {
                case -2029543770: goto L_0x03b7;
                case -1672132796: goto L_0x03af;
                case -596202297: goto L_0x088b;
                case 1903426370: goto L_0x03bc;
                default: goto L_0x03ae;
            }
        L_0x03ae:
            goto L_0x03a5
        L_0x03af:
            java.lang.String r3 = "ۘۦ۟ۥۥ۟ۧۖ۬ۗۚۥۘۡ۬ۗ"
            r4 = r3
            goto L_0x0072
        L_0x03b4:
            java.lang.String r3 = "۫ۢۘۘۡۨۘۨ۬۟ۡ۠ۡۘۧ۟ۨۘۥ۫ۦۘ۠ۥۛۜۚۖۡۛۘۘ"
            goto L_0x03a5
        L_0x03b7:
            if (r50 <= 0) goto L_0x03b4
            java.lang.String r3 = "۬ۧ۬ۙۧ۫ۤ۫ۛۘۛۡ۟ۡۘۦ۠ۚۢۘۘۢۡۗ"
            goto L_0x03a5
        L_0x03bc:
            java.lang.String r3 = "ۧۧۚ۟۫ۡۤۢ۫۫ۥۖۘ۫ۧۘۘ۬ۜۨۢۛۤۛ۬ۖۘ"
            goto L_0x03a5
        L_0x03bf:
            r0 = r68
            java.util.ArrayList r3 = r0.f1315r
            int r4 = r50 + -1
            java.lang.Object r3 = r3.get(r4)
            com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView$Dot r3 = (com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView.Dot) r3
            java.lang.String r4 = "ۖۚۙۛۜۙۦۧۨۜۜۧۘۘۜۖۘۘۘ۟ۖۢۧۚ۬ۢۦۚۖۘ"
            r44 = r3
            goto L_0x0072
        L_0x03d1:
            r0 = r44
            int r3 = r0.f1326b
            r0 = r68
            float r43 = r0.d(r3)
            java.lang.String r3 = "ۖۖۙ۬ۖۨۘۖۧ۠ۖۛۙۖۚۥۨۦۚ"
            r4 = r3
            goto L_0x0072
        L_0x03e0:
            r0 = r44
            int r3 = r0.f1325a
            r0 = r68
            float r42 = r0.e(r3)
            java.lang.String r3 = "ۚۦۦۘۙۜۚ۫ۥۜۘۢۥ۬۠ۜۧۦ۟ۨۘۢۢۚ"
            r4 = r3
            goto L_0x0072
        L_0x03ef:
            r0 = r43
            r1 = r56
            float r3 = java.lang.Math.min(r0, r1)
            float r35 = r3 - r63
            java.lang.String r3 = "ۨۨۡۙۦۜۘۥۨۙ۟ۨۦۘۘۚۦۘۛۢۗۙۛۢۤۥ۫"
            r4 = r3
            goto L_0x0072
        L_0x03fe:
            r0 = r43
            r1 = r56
            float r3 = java.lang.Math.max(r0, r1)
            float r41 = r3 + r63
            java.lang.String r3 = "ۘۨۤ۠ۨ۠ۚۘۛ۟ۧۦۘۥۤۢۨۛۧۦۦ۠ۧۜ"
            r4 = r3
            goto L_0x0072
        L_0x040d:
            r0 = r42
            r1 = r53
            float r3 = java.lang.Math.min(r0, r1)
            float r37 = r3 - r63
            java.lang.String r3 = "۟ۘۧۘۗۜۖۘۦۤۘۦۧۨۡۨۤۚۨۖۘ۫ۥۨۘۚۨۦۧ۠ۚ"
            r4 = r3
            goto L_0x0072
        L_0x041c:
            r0 = r42
            r1 = r53
            float r3 = java.lang.Math.max(r0, r1)
            float r39 = r3 + r63
            java.lang.String r3 = "ۗۧۤۧ۫ۜ۟ۧۖۘۙۤۛۙ۠ۡۘۗۧۦ"
            r4 = r3
            goto L_0x0072
        L_0x042b:
            java.lang.String r3 = "ۢۖۜ۬ۦۦۘ۠۫ۦۦۘ۫ۨۨۘۘ۫ۨۘۦۗ۬ۧ۬ۙۤۦ۟"
            r4 = r3
            r40 = r41
            goto L_0x0072
        L_0x0432:
            java.lang.String r3 = "ۙۢۡۘۗۨۥۘۢۤۡۚۖ۬ۘۛۛۥۨ"
            r4 = r3
            r38 = r39
            goto L_0x0072
        L_0x0439:
            java.lang.String r3 = "ۘ۟ۙ۬ۗۙۦۘۜۡۦۘۗ۟ۥ۫۫ۧۢۚۦۥۥۖۘ۬ۨۡ"
            r4 = r3
            r36 = r37
            goto L_0x0072
        L_0x0440:
            java.lang.String r3 = "ۥۨۦۘۦۥۥۙ۬ۜۙۧ۬ۚۨۥ۠ۖۥۘ"
            r4 = r3
            r34 = r35
            goto L_0x0072
        L_0x0447:
            r4 = -1473240522(0xffffffffa8302236, float:-9.777381E-15)
            java.lang.String r3 = "ۙۜۘۧۧ۬ۚۧۙۢۥ۫ۗۗۡۚۘۘ"
        L_0x044c:
            int r66 = r3.hashCode()
            r66 = r66 ^ r4
            switch(r66) {
                case -1674894758: goto L_0x0456;
                case -1067322716: goto L_0x0886;
                case 994131513: goto L_0x0461;
                case 1385209547: goto L_0x045e;
                default: goto L_0x0455;
            }
        L_0x0455:
            goto L_0x044c
        L_0x0456:
            if (r51 == 0) goto L_0x045b
            java.lang.String r3 = "ۥۧۜۘۙۖۜۘۚۖۙۡۧۜۢ۬ۙۛۥۥۚۤ۫ۡۦۡۦ۫ۙ"
            goto L_0x044c
        L_0x045b:
            java.lang.String r3 = "ۙۛۛ۟ۢۥۘ۟ۢۙۜۤ۠ۜۢۤ۟۫ۨۘۤ۠ۗ"
            goto L_0x044c
        L_0x045e:
            java.lang.String r3 = "ۥۙ۟ۦ۫ۜۚ۠ۙ۠۟۬ۛۢۖۘ"
            goto L_0x044c
        L_0x0461:
            java.lang.String r3 = "ۡۢۤۜۜ۫ۙۡۨۘ۠ۘۦۘۗ۫ۡۥ۬"
            r4 = r3
            goto L_0x0072
        L_0x0466:
            r0 = r68
            float r3 = r0.A
            r4 = 1056964608(0x3f000000, float:0.5)
            float r33 = r3 * r4
            java.lang.String r3 = "ۚۙۦۘۨۢۖۘۙۜ۠ۘۗۛۧۘۡۙۧۥۘۡۨۥۛۛۘ"
            r4 = r3
            goto L_0x0072
        L_0x0473:
            r0 = r68
            float r3 = r0.B
            r4 = 1056964608(0x3f000000, float:0.5)
            float r32 = r3 * r4
            java.lang.String r3 = "ۧۖ۫ۛۚ۫ۢۡۡۢۢۡۘۢ۬ۖۘۖۤۤۖۛۖۘ"
            r4 = r3
            goto L_0x0072
        L_0x0480:
            r0 = r51
            int r3 = r0.f1326b
            r0 = r68
            float r31 = r0.d(r3)
            java.lang.String r3 = "۠۠ۛۘۤۗۛۘ۬ۨ۟ۧ۟۠ۢۦۜ۠۠ۨ۟"
            r4 = r3
            goto L_0x0072
        L_0x048f:
            r0 = r51
            int r3 = r0.f1325a
            r0 = r68
            float r30 = r0.e(r3)
            java.lang.String r3 = "ۧۘۗۦ۟ۚ۫ۗ۬ۖ۟ۦۘ۠ۖۗۡۚۘۘۤ۬۬ۚۦۥۘ۬ۛۚ"
            r4 = r3
            goto L_0x0072
        L_0x049e:
            float r3 = r31 - r33
            r0 = r35
            float r29 = java.lang.Math.min(r3, r0)
            java.lang.String r3 = "ۤ۬ۦۨۛۚۘۛۧ۫ۜ۬ۧۨۡۘۨۙۦۘۛۗۨ"
            r4 = r3
            goto L_0x0072
        L_0x04ab:
            float r3 = r31 + r33
            r0 = r41
            float r28 = java.lang.Math.max(r3, r0)
            java.lang.String r3 = "ۥ۠ۛ۟ۤۤۘۥۘۖ۠ۚۛۡۖۢۧۚۚۗۖۘۖۤۗۡۘ"
            r4 = r3
            goto L_0x0072
        L_0x04b8:
            float r3 = r30 - r32
            r0 = r37
            float r27 = java.lang.Math.min(r3, r0)
            java.lang.String r3 = "ۜ۫ۚ۫ۨۘ۫ۚۜۘ۟۬۬ۡۘۜۘۜۥۦۘ"
            r4 = r3
            goto L_0x0072
        L_0x04c5:
            float r3 = r30 + r32
            r0 = r39
            float r26 = java.lang.Math.max(r3, r0)
            java.lang.String r3 = "ۡۛۗۥۤ۠۬۠ۢ۟ۙۨۘۨ۬ۛ"
            r4 = r3
            goto L_0x0072
        L_0x04d2:
            java.lang.String r3 = "ۙ۬ۚۖۘۤۙۘۜ۠ۥۘۚۥۧۖ۠ۗ"
            r4 = r3
            r34 = r29
            goto L_0x0072
        L_0x04d9:
            java.lang.String r3 = "ۚۦۘۘۦ۠ۡۘۙۛۡۘۚۜۡۘ۠ۖۥ"
            r4 = r3
            r36 = r27
            goto L_0x0072
        L_0x04e0:
            java.lang.String r3 = "ۡ۠ۜۘ۬ۨۘۚۨۜۢۛۛۙۨۥۘۛ۬۟ۡۡ۬ۜۜۤۚۢۥۘ"
            r4 = r3
            r38 = r26
            goto L_0x0072
        L_0x04e7:
            java.lang.String r3 = "ۛۡ۫ۙۧۦ۠ۧۖۜۛۨۡۤۨۜۗۨۘ"
            r4 = r3
            r40 = r28
            goto L_0x0072
        L_0x04ee:
            int r3 = java.lang.Math.round(r34)
            int r4 = java.lang.Math.round(r36)
            int r66 = java.lang.Math.round(r40)
            int r67 = java.lang.Math.round(r38)
            r0 = r61
            r1 = r66
            r2 = r67
            r0.union(r3, r4, r1, r2)
            java.lang.String r3 = "ۛ۠ۥۥ۬ۡۢۡۡ۠۫ۚ۬ۚۦ۫ۙۢۦۡۨ"
            r4 = r3
            goto L_0x0072
        L_0x050c:
            int r25 = r58 + 1
            java.lang.String r3 = "ۤ۫ۛۤۡۡۘۙۖ۠ۧ۠ۡۚۨۡۘۘ۬ۨۘ۬۬ۡۛۦۗۜۧۛ"
            r4 = r3
            goto L_0x0072
        L_0x0513:
            java.lang.String r3 = "ۧۗ۟ۜۨۦۙۗۢۚۙۥۘۚۤۤۨ۠ۡۘۤۙ۠"
            r4 = r3
            r58 = r25
            goto L_0x0072
        L_0x051a:
            java.lang.String r3 = "۠ۥۙۙۘۡۘ۫ۘۘۘۨۧۥۤۖ۬ۖۙ۟ۘۢ۠ۨۨۡۥۤ"
            r4 = r3
            r47 = r46
            goto L_0x0072
        L_0x0521:
            float r3 = r69.getX()
            r0 = r68
            r0.f1317t = r3
            java.lang.String r3 = "ۨ۬۫ۢۡۧۨۘ۬ۦۙۘۘۤۤۚ"
            r4 = r3
            goto L_0x0072
        L_0x052e:
            float r3 = r69.getY()
            r0 = r68
            r0.f1318u = r3
            java.lang.String r3 = "ۘ۫ۡۘۚۖۦۨ۠ۚ۠ۛۜۦۚ۬ۥۘۘ"
            r4 = r3
            goto L_0x0072
        L_0x053b:
            r4 = 1276598910(0x4c175a7e, float:3.9676408E7)
            java.lang.String r3 = "۫ۨۜۘۢۨۡۜۚۜۘۤۛۛ۟ۘۘ۟۟۠۠ۢ"
        L_0x0540:
            int r66 = r3.hashCode()
            r66 = r66 ^ r4
            switch(r66) {
                case -1656045475: goto L_0x0552;
                case -1199280621: goto L_0x0555;
                case 20410641: goto L_0x0895;
                case 76800021: goto L_0x054a;
                default: goto L_0x0549;
            }
        L_0x0549:
            goto L_0x0540
        L_0x054a:
            if (r47 == 0) goto L_0x054f
            java.lang.String r3 = "ۗۜۜۘۛۘۘ۫ۙۖۘۡۡۖۙۦۦۘۘۚۖۘۖۚۨۘ"
            goto L_0x0540
        L_0x054f:
            java.lang.String r3 = "۠ۙۨۖۜۡۘ۟ۚۡۤۢۧۢ۬ۨۛۤۚۛۘ۬ۛۜۨۧۖۘ"
            goto L_0x0540
        L_0x0552:
            java.lang.String r3 = "ۙۡۦۘۨۤۙۡۖۜۥۚ۫ۖ۬ۡۡۨۘۘۢ۫ۜ۫ۚۖ۫ۤ"
            goto L_0x0540
        L_0x0555:
            java.lang.String r3 = "۫ۨۨۘۛۘۥۜۧۚۗۘ۟ۨۡۘ"
            r4 = r3
            goto L_0x0072
        L_0x055a:
            r0 = r68
            android.graphics.Rect r0 = r0.D
            r24 = r0
            java.lang.String r3 = "۬۟ۘۘ۬ۨۥۘۚۗۦۤ۫ۥۢۤۡ۬ۗۙ۟ۗۛۨ۟ۥۘۛۙۥۘ"
            r4 = r3
            goto L_0x0072
        L_0x0565:
            r0 = r24
            r1 = r61
            r0.union(r1)
            java.lang.String r3 = "۠ۙۤۦۨۡ۟ۢۡ۠ۧۨۘ۫ۖۜۢۤۜۘۜۦۜۢۥۘ"
            r4 = r3
            goto L_0x0072
        L_0x0571:
            r0 = r68
            r1 = r24
            r0.invalidate(r1)
            java.lang.String r3 = "ۡۛۗۘۜۖۘ۠ۖۘۘۗ۠ۨۘۢۜۤ"
            r4 = r3
            goto L_0x0072
        L_0x057d:
            r0 = r24
            r1 = r61
            r0.set(r1)
            java.lang.String r3 = "ۘۧ۟ۚۦۘۘۡ۬ۨۗۤۖۘۙۜۢۚۤۦۜۤۨۘ"
            r4 = r3
            goto L_0x0072
        L_0x0589:
            r3 = 1
            goto L_0x016e
        L_0x058c:
            r4 = 1131119551(0x436b83bf, float:235.51463)
            java.lang.String r3 = "ۘۚۦۘۚۙۨۘ۬ۚۨۜۦۗ۬ۜۙ۫ۜۥۘۦ۬ۧ۬ۗۧ"
        L_0x0591:
            int r66 = r3.hashCode()
            r66 = r66 ^ r4
            switch(r66) {
                case -382060731: goto L_0x05b3;
                case 263244736: goto L_0x05b0;
                case 783396813: goto L_0x05a3;
                case 1131402796: goto L_0x059b;
                default: goto L_0x059a;
            }
        L_0x059a:
            goto L_0x0591
        L_0x059b:
            java.lang.String r3 = "ۡۡۗۜۜۦۧۗۖۘ۠ۗۡۘۧۚۡۛ۠ۘ"
            r4 = r3
            goto L_0x0072
        L_0x05a0:
            java.lang.String r3 = "ۗۚۖۘۜۜۘۘۘۥۦ۬ۘۢۤۖۤۥ۠ۥۡۛۧ"
            goto L_0x0591
        L_0x05a3:
            r0 = r68
            java.util.ArrayList r3 = r0.f1315r
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x05a0
            java.lang.String r3 = "۠ۦۧۦۙۨۘۘۚۘۥۘۘۡۗۤۗۡۤ"
            goto L_0x0591
        L_0x05b0:
            java.lang.String r3 = "ۢۤۥۘۤۜۧۜۙۦۘۦ۫ۜۖۦ۠ۘۤ۫ۧۨۘ"
            goto L_0x0591
        L_0x05b3:
            java.lang.String r3 = "ۘۗۥۘۢۨ۫ۤۦ۠۟ۛۦۡۖۦۥۧۤ"
            r4 = r3
            goto L_0x0072
        L_0x05b8:
            r3 = 0
            r0 = r68
            r0.f1323z = r3
            java.lang.String r3 = "ۨ۫ۙ۟۠ۡۧۗۚۚ۟۠ۚۨۘ۫ۨۢ۫ۜۜۘۖۨۛ"
            r4 = r3
            goto L_0x0072
        L_0x05c2:
            r23 = 0
            java.lang.String r3 = "ۨۙۡۜۢۙۜ۠ۙۢ۠ۤۤۢۡۘۨۧۥۗۧۜ"
            r4 = r3
            goto L_0x0072
        L_0x05c9:
            java.lang.String r3 = "ۛۜۡۖۡۡۘۘۨۧۡۦۡۘ۬۟ۢۡ۠ۡ"
            r4 = r3
            r22 = r23
            goto L_0x0072
        L_0x05d0:
            r4 = -54649132(0xfffffffffcbe1ed4, float:-7.8972934E36)
            java.lang.String r3 = "ۘۨ۫ۙۥۦۤۙۤۜۧۘ۟ۜ۬ۤۚۧ"
        L_0x05d5:
            int r66 = r3.hashCode()
            r66 = r66 ^ r4
            switch(r66) {
                case -1517183504: goto L_0x05f0;
                case -416594154: goto L_0x08a9;
                case 240643767: goto L_0x05df;
                case 866232075: goto L_0x05e7;
                default: goto L_0x05de;
            }
        L_0x05de:
            goto L_0x05d5
        L_0x05df:
            java.lang.String r3 = "ۨۥۨۨۗۜ۫ۨۘۥۚۘۘۧۙۢ۠ۢ۠ۢ۟ۘۘ۟ۘ۫"
            r4 = r3
            goto L_0x0072
        L_0x05e4:
            java.lang.String r3 = "ۖۘۚۗ۟ۛ۟ۘۘۙ۟۫ۜۥۗ۬۬ۨۛۖۨۡۡۚ۠ۚۘۘ"
            goto L_0x05d5
        L_0x05e7:
            int r3 = H
            r0 = r22
            if (r0 >= r3) goto L_0x05e4
            java.lang.String r3 = "ۙۜۧۜۘ۠ۖۚۖ۫ۤۨۘۗۚۢ"
            goto L_0x05d5
        L_0x05f0:
            java.lang.String r3 = "ۛۥۡۘۘۡۦۥۖۨۧۙۥۤ۫ۘ۟ۨۦۛ۟ۦۢۙۘ"
            goto L_0x05d5
        L_0x05f3:
            r21 = 0
            java.lang.String r3 = "ۛۜ۟۟ۢۨۥۡۡۧۡۥۘۜۜۧۙۢ۟ۗۘۚ۠ۚۧ"
            r4 = r3
            goto L_0x0072
        L_0x05fa:
            java.lang.String r3 = "ۘۚۚۦۡۗۗۖۚۘ۟ۡۦۧۘۨۘۦۘۤ۠۫ۥ۟۠ۧۢۨ"
            r4 = r3
            r20 = r21
            goto L_0x0072
        L_0x0601:
            r4 = 1888966185(0x70975629, float:3.746912E29)
            java.lang.String r3 = "۠۠ۦۧۨۖۡۚ۠ۗۚ۟ۤۘۖۘۖ۬۟ۧۚۛ"
        L_0x0606:
            int r66 = r3.hashCode()
            r66 = r66 ^ r4
            switch(r66) {
                case -590493383: goto L_0x0610;
                case -533465390: goto L_0x0624;
                case 442388176: goto L_0x0618;
                case 1254781585: goto L_0x0621;
                default: goto L_0x060f;
            }
        L_0x060f:
            goto L_0x0606
        L_0x0610:
            java.lang.String r3 = "ۜ۬۠ۖۚ۬۟ۤ۫ۦۗۧۛۛۦۘۘۙۥۘۥۦ"
            r4 = r3
            goto L_0x0072
        L_0x0615:
            java.lang.String r3 = "۬ۨۧۘۨۚۖۘۨۥۚ۟۠ۡۥۘۡۘۤۤۤ۫ۥ۠"
            goto L_0x0606
        L_0x0618:
            int r3 = H
            r0 = r20
            if (r0 >= r3) goto L_0x0615
            java.lang.String r3 = "ۛۚۢۦۗۙ۬۫ۤۘۤ۬ۗۧۨۡ۫ۙۘۤۨۘ۠ۖۡۘ۟ۦۧۘ"
            goto L_0x0606
        L_0x0621:
            java.lang.String r3 = "ۥۛۨۘۡۜۤۖۤۡۘۧۧۥۚۘ۟ۥۖۦۚۦۘ"
            goto L_0x0606
        L_0x0624:
            java.lang.String r3 = "۠ۨۨۘۦ۠۠۠ۙۢ۬۬۫ۚۤۦۘۢۚۘۘ"
            r4 = r3
            goto L_0x0072
        L_0x0629:
            r0 = r68
            com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView$DotState[][] r3 = r0.f1298a
            r3 = r3[r22]
            r19 = r3[r20]
            java.lang.String r3 = "ۡۧۚۖۥۦۖۚ۬ۙۖۤۙۘۧ"
            r4 = r3
            goto L_0x0072
        L_0x0636:
            r0 = r19
            android.animation.ValueAnimator r0 = r0.f1332f
            r18 = r0
            java.lang.String r3 = "۠ۡۤۦ۫ۢ۠ۗۜۨۧۢ۫ۥۥ۟۫۬ۙۘ"
            r4 = r3
            goto L_0x0072
        L_0x0641:
            r4 = 1698398188(0x653b7fec, float:5.534014E22)
            java.lang.String r3 = "ۡۦۖۨۥۜۤۖۧۦۚۖۗۢۖۖۜۜ۠۬ۙ۫ۜۨۘ۟ۡ۟"
        L_0x0646:
            int r66 = r3.hashCode()
            r66 = r66 ^ r4
            switch(r66) {
                case -1392755303: goto L_0x0650;
                case -695291230: goto L_0x065b;
                case -549259183: goto L_0x08a4;
                case 746889315: goto L_0x0658;
                default: goto L_0x064f;
            }
        L_0x064f:
            goto L_0x0646
        L_0x0650:
            if (r18 == 0) goto L_0x0655
            java.lang.String r3 = "ۤۧۥۖۡۚۢ۬ۢ۠ۦۥۗ۫ۡۧۤۥ"
            goto L_0x0646
        L_0x0655:
            java.lang.String r3 = "ۚۥۦۨۡۥۜۖۖ۫ۖۥۘۧۚۛۛۖۛۘۥۘۚۚۤ۬ۖۡ"
            goto L_0x0646
        L_0x0658:
            java.lang.String r3 = "ۜۧۛ۬۬ۗۘۗ۠ۡۤ۫ۡۡۘۘ"
            goto L_0x0646
        L_0x065b:
            java.lang.String r3 = "ۖ۟ۥۗۡۜ۟ۦ۟ۢ۠ۖ۬۟ۢۛۚۚۥۙۨ۬۟"
            r4 = r3
            goto L_0x0072
        L_0x0660:
            r18.cancel()
            java.lang.String r3 = "ۚۖ۠ۗ۟۠ۚۗۨۘ۬ۢۙۙ۟ۡۘ۟ۧۥۖۦۡۘۗۜۥ"
            r4 = r3
            goto L_0x0072
        L_0x0668:
            r3 = 1
            r0 = r19
            r0.f1330d = r3
            java.lang.String r3 = "ۥۤۤۘۗۦۚ۫ۡۡۤۖ۠ۦ۠ۘۘ۬ۙ۠ۧۜ۠ۖ۠ۖۗ"
            r4 = r3
            goto L_0x0072
        L_0x0672:
            r3 = 1
            r0 = r19
            r0.f1331e = r3
            java.lang.String r3 = "ۛۙ۠۫ۢۦۘۙ۟ۖۘۜۡ۠ۨۜۗ۠ۥۥۘ"
            r4 = r3
            goto L_0x0072
        L_0x067c:
            int r17 = r20 + 1
            java.lang.String r3 = "ۚۜ۟ۧ۟ۛۘۢۨ۫ۢۖۢ۫ۤ"
            r4 = r3
            goto L_0x0072
        L_0x0683:
            java.lang.String r3 = "ۘۦۧۥۘۥ۟ۨۘۚۖۨۘۢۧۘ۬ۗۖۚۜۧۘۗۜ۬۫ۗۛ"
            r4 = r3
            r20 = r17
            goto L_0x0072
        L_0x068a:
            int r16 = r22 + 1
            java.lang.String r3 = "۟۫۠۠۬ۗ۬۟ۘۘ۠ۢۧ۟۫ۡۘ"
            r4 = r3
            goto L_0x0072
        L_0x0691:
            java.lang.String r3 = "ۤۨۧۘ۟ۗۨۙۚۛۘۚۗۥ۬ۜ۬ۙۖۛۡ۠ۥۘ"
            r4 = r3
            r22 = r16
            goto L_0x0072
        L_0x0698:
            java.lang.String r3 = "yoShareSbj"
            java.lang.String r4 = "string"
            int r15 = com.obwhatsapp.yo.yo.getID(r3, r4)
            java.lang.String r3 = "ۜۨ۬ۖۖۗۢۜۚۨۢۡۘۢۗۨ"
            r4 = r3
            goto L_0x0072
        L_0x06a5:
            android.content.Context r3 = r68.getContext()
            java.lang.String r3 = r3.getString(r15)
            r0 = r68
            r0.announceForAccessibility(r3)
            java.lang.String r3 = "ۜۚۨۘۦۚۛۗۨۗ۬ۚۚ۫ۢۜۜ۬ۨ۬ۜۘۘۙۦۘ۟ۙۦ"
            r4 = r3
            goto L_0x0072
        L_0x06b7:
            r0 = r68
            java.util.ArrayList r14 = r0.f1315r
            java.lang.String r3 = "ۧۗۘۘ۬۟ۚۖۧۗۤۡۢۡۢۜ"
            r4 = r3
            goto L_0x0072
        L_0x06c0:
            r0 = r68
            java.util.ArrayList r3 = r0.f1314q
            java.util.Iterator r13 = r3.iterator()
            java.lang.String r3 = "ۚۤۙۡۘۨۥۛۖۚۚ۬۬ۙۚۛۧۛ"
            r4 = r3
            goto L_0x0072
        L_0x06cd:
            r4 = 594835272(0x23747748, float:1.3252525E-17)
            java.lang.String r3 = "ۜۨۢۢۨۚۨۤ۫ۧۡۜ۟ۙ"
        L_0x06d2:
            int r66 = r3.hashCode()
            r66 = r66 ^ r4
            switch(r66) {
                case 533109075: goto L_0x06f0;
                case 806165605: goto L_0x06dc;
                case 1112025603: goto L_0x06e4;
                case 1733883967: goto L_0x06ed;
                default: goto L_0x06db;
            }
        L_0x06db:
            goto L_0x06d2
        L_0x06dc:
            java.lang.String r3 = "ۥۚ۟ۤۡۘ۟ۤۜۘۡ۟ۤۗۛۦۘ"
            r4 = r3
            goto L_0x0072
        L_0x06e1:
            java.lang.String r3 = "۫ۜۚۧۦ۠ۨ۠ۚۤۙ۫ۡۖۨۘۥۚۨۗۤۜ۬ۙۖۚۗۦ"
            goto L_0x06d2
        L_0x06e4:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L_0x06e1
            java.lang.String r3 = "ۡۤۧۢۛ۬ۡۤۡۘۢ۫ۨۘۗۖۜۘۜۦۦۘۚۤۢۢ۬ۤ۠ۙ۫"
            goto L_0x06d2
        L_0x06ed:
            java.lang.String r3 = "ۥۧۖۤۤ۟ۢۖ۫ۡ۠ۜۡۥ۬ۗۙۖۘ"
            goto L_0x06d2
        L_0x06f0:
            java.lang.String r3 = "ۘۚۘ۫ۛۙۖ۠ۖ۠ۨ۟ۘۡۤۙ"
            r4 = r3
            goto L_0x0072
        L_0x06f5:
            java.lang.Object r3 = r13.next()
            com.obwhatsapp.youbasha.ui.lockV2.patternlockview.listener.PatternLockViewListener r3 = (com.obwhatsapp.youbasha.ui.lockV2.patternlockview.listener.PatternLockViewListener) r3
            java.lang.String r4 = "ۢۧۖۖۢۦۤۜۚ۠ۢۙ۟ۦۧۦۥۥۘ"
            r12 = r3
            goto L_0x0072
        L_0x0700:
            r4 = 1923592716(0x72a7b20c, float:6.643103E30)
            java.lang.String r3 = "ۤۤ۟ۥ۠ۡۡ۠ۚۨۘۥ۫۬"
        L_0x0705:
            int r66 = r3.hashCode()
            r66 = r66 ^ r4
            switch(r66) {
                case -1011449525: goto L_0x070f;
                case 1116971141: goto L_0x08ae;
                case 1128522476: goto L_0x071a;
                case 1932943438: goto L_0x0715;
                default: goto L_0x070e;
            }
        L_0x070e:
            goto L_0x0705
        L_0x070f:
            java.lang.String r3 = "ۘۢۧ۬۬ۥ۠ۧۧۖۥۙ۫ۧۡ۟ۘ۬"
            goto L_0x0705
        L_0x0712:
            java.lang.String r3 = "۠ۜۦ۬ۙۧۤۖ۫ۖ۠ۘ۬ۙۛ"
            goto L_0x0705
        L_0x0715:
            if (r12 == 0) goto L_0x0712
            java.lang.String r3 = "ۜۦۛۖۢ۫ۘ۟ۦۘۙۢۖۘ۬۟ۜۨۧۘۧۢۚۖ۠"
            goto L_0x0705
        L_0x071a:
            java.lang.String r3 = "ۚۛ۫ۚۡ۠ۨۨۛۖۚۤ۠ۖ۟ۡ۬ۜۘۖۢۡۘ"
            r4 = r3
            goto L_0x0072
        L_0x071f:
            r12.onComplete(r14)
            java.lang.String r3 = "ۚۧۢۛ۫ۙۖۘۥۘۖۘۖۘۢۡۨۚۤ۟ۖۛۡۘ"
            r4 = r3
            goto L_0x0072
        L_0x0727:
            r68.invalidate()
            java.lang.String r3 = "ۡۡۗۜۜۦۧۗۖۘ۠ۗۡۘۧۚۡۛ۠ۘ"
            r4 = r3
            goto L_0x0072
        L_0x072f:
            r3 = 1
            goto L_0x016e
        L_0x0732:
            r0 = r68
            java.util.ArrayList r3 = r0.f1315r
            r3.clear()
            java.lang.String r3 = "ۘۦۜۘۗۡۗۙۜ۫ۛۘۥۢۖۗۡۥۧۧۤۨ۠۫ۖ"
            r4 = r3
            goto L_0x0072
        L_0x073e:
            r68.b()
            java.lang.String r3 = "۫ۜۚۛۤۦ۠۠ۧ۫ۗۙۗۤۤ۠ۜۨ"
            r4 = r3
            goto L_0x0072
        L_0x0746:
            r3 = 0
            r0 = r68
            r0.f1319v = r3
            java.lang.String r3 = "ۥۗۗ۠ۜۚ۫۫ۢ۬۬ۥۘۧۗۖۘۢ۟ۙ"
            r4 = r3
            goto L_0x0072
        L_0x0750:
            r68.invalidate()
            java.lang.String r3 = "ۧۛ۟ۧ۠۫ۡۛۚۡ۬ۖۘۦۧۡۖۛۜۘۖۦۢ"
            r4 = r3
            goto L_0x0072
        L_0x0758:
            float r11 = r69.getX()
            java.lang.String r3 = "ۗۛۙ۠ۜۖۘ۫ۖۧۡۨۢۚۤۥۘۙ۫ۛ"
            r4 = r3
            goto L_0x0072
        L_0x0761:
            float r10 = r69.getY()
            java.lang.String r3 = "ۚۧۡۤۘۨۡ۟۟ۖۙۙۡ۫ۢ"
            r4 = r3
            goto L_0x0072
        L_0x076a:
            r0 = r68
            com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView$Dot r9 = r0.c(r11, r10)
            java.lang.String r3 = "ۥ۠ۡۖ۟ۢۖۡۛۨۗۧ۬۬ۥۙ۟ۦۜ۫ۛ"
            r4 = r3
            goto L_0x0072
        L_0x0775:
            r4 = -1475201978(0xffffffffa8123446, float:-8.115963E-15)
            java.lang.String r3 = "ۨۗۘ۠ۥۥۖۗ۟ۧۗۗۖۖۧۥۙۨۘ۬۟ۖۘۛۘۖۘۡۥۘ"
        L_0x077a:
            int r66 = r3.hashCode()
            r66 = r66 ^ r4
            switch(r66) {
                case -856265707: goto L_0x078f;
                case -778749453: goto L_0x078a;
                case 218169700: goto L_0x08b8;
                case 773401199: goto L_0x0784;
                default: goto L_0x0783;
            }
        L_0x0783:
            goto L_0x077a
        L_0x0784:
            java.lang.String r3 = "ۘ۫ۢۨۘۥۧۙۨۗۘۜۘۥ۟ۦۗ۫"
            goto L_0x077a
        L_0x0787:
            java.lang.String r3 = "ۨ۫ۙۤ۠ۥۥ۟ۥۘۖ۫ۖۘۘۢۦۚۙۦ"
            goto L_0x077a
        L_0x078a:
            if (r9 == 0) goto L_0x0787
            java.lang.String r3 = "۬ۦۧۗۢۤۡۦ۫ۘۗۧۗۛۡۘ"
            goto L_0x077a
        L_0x078f:
            java.lang.String r3 = "ۢۥۙ۟ۤۨۘۧۖۨۤۜۛۧۘۚۜ۠ۥۙۥ۟"
            r4 = r3
            goto L_0x0072
        L_0x0794:
            r3 = 1
            r0 = r68
            r0.f1323z = r3
            java.lang.String r3 = "ۢۡۧۧ۠ۥۘۨ۫ۥۘۡۥۨۘۖۚۧ۠ۡۘۖ۫ۨ۬۠ۘۗۥۡ"
            r4 = r3
            goto L_0x0072
        L_0x079e:
            r3 = 0
            r0 = r68
            r0.f1319v = r3
            java.lang.String r3 = "ۤۤ۬۬ۢۡۨ۫ۥۘۜ۬ۖۘ۬ۥۧۘ۟ۡۚۙۙۦۘ۟ۙۘۘ"
            r4 = r3
            goto L_0x0072
        L_0x07a8:
            r68.i()
            java.lang.String r3 = "ۙۚۨۘۘۖۧۡۦۡۘۙۥۘۘۗۖۙۨۖۜ"
            r4 = r3
            goto L_0x0072
        L_0x07b0:
            r3 = 0
            r0 = r68
            r0.f1323z = r3
            java.lang.String r3 = "ۨۥۡۘۤۗۥۘۜۘ۫ۨۢ۬ۖۛۘۖ۠ۧۦۦۡ"
            r4 = r3
            goto L_0x0072
        L_0x07ba:
            r68.h()
            java.lang.String r3 = "۫ۘۡۨۛۧۤۤۖ۟ۡۗۡۖۨۘۥۤۖۘۖۙ"
            r4 = r3
            goto L_0x0072
        L_0x07c2:
            r4 = 2049625715(0x7a2ace73, float:2.2171944E35)
            java.lang.String r3 = "ۥ۫ۚ۫ۛۥۘۛۘۚۗ۫۟ۧۘۗ۠۟ۡۧۘۨۘ"
        L_0x07c7:
            int r66 = r3.hashCode()
            r66 = r66 ^ r4
            switch(r66) {
                case -1544057967: goto L_0x07d7;
                case 323774548: goto L_0x07d1;
                case 816426299: goto L_0x08c2;
                case 1987166702: goto L_0x07dc;
                default: goto L_0x07d0;
            }
        L_0x07d0:
            goto L_0x07c7
        L_0x07d1:
            java.lang.String r3 = "ۦۖ۟ۦۢۨ۬ۜۘۦۖۜۘۤۜ۠ۖۧۨۘۢۘۤۧۧۡ۬۫ۡ"
            goto L_0x07c7
        L_0x07d4:
            java.lang.String r3 = "۠ۧۥۘۙۤۘۜۨۡۘ۟ۗۖۗۜ۫ۢۢۨۘۢۥۡۘ"
            goto L_0x07c7
        L_0x07d7:
            if (r9 == 0) goto L_0x07d4
            java.lang.String r3 = "ۥۡ۫۠۬ۨۙۗۥۖۡۧۘ۫ۛ۟ۜۢ۠ۥۗ۠ۦۦ۫ۤۧۨ"
            goto L_0x07c7
        L_0x07dc:
            java.lang.String r3 = "ۖۦۧۘۡ۫ۧۙۘۘۧ۫ۢۘۜۥ۫ۨۦۘۗۥ۫۬ۘۖۙۡۥ"
            r4 = r3
            goto L_0x0072
        L_0x07e1:
            int r3 = r9.f1326b
            r0 = r68
            float r8 = r0.d(r3)
            java.lang.String r3 = "ۥۙ۟ۙۨۗۖۗۦۘۥۦۜۥۜۧۖۛ"
            r4 = r3
            goto L_0x0072
        L_0x07ee:
            int r3 = r9.f1325a
            r0 = r68
            float r7 = r0.e(r3)
            java.lang.String r3 = "ۜۦۥۢۡۢۜ۟ۜۡۘۚۤۛۘۨۢۦ"
            r4 = r3
            goto L_0x0072
        L_0x07fb:
            r0 = r68
            float r3 = r0.A
            r4 = 1073741824(0x40000000, float:2.0)
            float r6 = r3 / r4
            java.lang.String r3 = "ۜ۟ۨۡۙۙۜۜۚ۠ۨۘۘۖ۟۫ۜۚ۬ۧ۠ۘۧۖ"
            r4 = r3
            goto L_0x0072
        L_0x0808:
            r0 = r68
            float r3 = r0.B
            r4 = 1073741824(0x40000000, float:2.0)
            float r5 = r3 / r4
            java.lang.String r3 = "ۢۥ۟۟۠۫ۨۢ۬ۥ۫۫ۢۦۘۘۤۡۥ۬ۖۖۘۚۢۦۘۛۡۧۘ"
            r4 = r3
            goto L_0x0072
        L_0x0815:
            float r3 = r8 - r6
            int r3 = (int) r3
            float r4 = r7 - r5
            int r4 = (int) r4
            float r66 = r8 + r6
            r0 = r66
            int r0 = (int) r0
            r66 = r0
            float r67 = r7 + r5
            r0 = r67
            int r0 = (int) r0
            r67 = r0
            r0 = r68
            r1 = r66
            r2 = r67
            r0.invalidate(r3, r4, r1, r2)
            java.lang.String r3 = "ۜۘۜۘ۬ۥۨۜۖۧۘۙۤۢۚ۠ۚۚ۬ۤۘۦۦۗۢۚۗ"
            r4 = r3
            goto L_0x0072
        L_0x0837:
            r0 = r68
            r0.f1317t = r11
            java.lang.String r3 = "۟ۛۡۘۡ۟ۥۡۛ۟ۥۖۗ۠ۘۡ"
            r4 = r3
            goto L_0x0072
        L_0x0840:
            r0 = r68
            r0.f1318u = r10
            java.lang.String r3 = "۫۟ۤ۟ۗۤۨۧۤۨ۟ۧۛۡۘۘۛۨۘۘۨۚۡۘۙۢۦۘ"
            r4 = r3
            goto L_0x0072
        L_0x0849:
            r3 = 1
            goto L_0x016e
        L_0x084c:
            r3 = 0
            goto L_0x016e
        L_0x084f:
            java.lang.String r3 = "۠۬۫۟ۙ۬ۦ۫ۘۘۢۢۨۚۛۢۥ۬ۗۙۡۘۛۡۡۘ"
            r4 = r3
            goto L_0x0072
        L_0x0854:
            java.lang.String r3 = "۟ۙۥ۠ۨ۠ۙۛۖۘ۫ۙۡۘۧ۫ۚ۫ۜ"
            r4 = r3
            goto L_0x0072
        L_0x0859:
            java.lang.String r3 = "۫ۤۤۖۤۖۘ۫۠ۡۡۦۧۘ۠ۛۚۧۙۙۦ۟ۚۚۤ"
            r4 = r3
            goto L_0x0072
        L_0x085e:
            java.lang.String r3 = "ۧ۫ۙۤ۬ۥۗ۬ۛۘۖۙۚۜۨۘۛۖۦۧۢۡۗۗۢ"
            r4 = r3
            goto L_0x0072
        L_0x0863:
            java.lang.String r3 = "ۦۡۘۘۖ۬۟۬ۖۜۘۛۚۨۢ۟ۤ"
            r4 = r3
            goto L_0x0072
        L_0x0868:
            java.lang.String r3 = "ۨۤۘۘۙۖۢۗۜۨۘ۠ۧۡۧۗۜۥ۫ۥ"
            r4 = r3
            goto L_0x0072
        L_0x086d:
            java.lang.String r3 = "۫۫ۚۜۤۙۦۥۜۜۨۗۡ۟۠ۘ۫ۛ"
            r4 = r3
            goto L_0x0072
        L_0x0872:
            java.lang.String r3 = "ۘۜۨۧ۫ۛۗ۟ۖۢۤۜۤۥۧۜۢۨ"
            r4 = r3
            goto L_0x0072
        L_0x0877:
            java.lang.String r3 = "ۦۨ۟ۚۛۨۘۧۗۘۜۖۜۥ"
            r4 = r3
            goto L_0x0072
        L_0x087c:
            java.lang.String r3 = "ۙۡۥۘ۬ۦۜۘۙۡۖ۫ۤۡۘۛۧۥۘۚۦۡۘۗۦۘۥۢۨۘ"
            r4 = r3
            goto L_0x0072
        L_0x0881:
            java.lang.String r3 = "ۚۛۦۘ۟ۤۘۗۛۦۖۗۘۤۚۚۥۧۗۨ۟ۘ"
            r4 = r3
            goto L_0x0072
        L_0x0886:
            java.lang.String r3 = "ۛۡ۫ۙۧۦ۠ۧۖۜۛۨۡۤۨۜۗۨۘ"
            r4 = r3
            goto L_0x0072
        L_0x088b:
            java.lang.String r3 = "ۛ۠ۥۥ۬ۡۢۡۡ۠۫ۚ۬ۚۦ۫ۙۢۦۡۨ"
            r4 = r3
            goto L_0x0072
        L_0x0890:
            java.lang.String r3 = "ۖ۟ۜۥۗۡۛۡۘ۠۟ۘۘۗۜۧۘۧۚۨۘ۠۠ۘۘۨۗۢ"
            r4 = r3
            goto L_0x0072
        L_0x0895:
            java.lang.String r3 = "ۘۧ۟ۚۦۘۘۡ۬ۨۗۤۖۘۙۜۢۚۤۦۜۤۨۘ"
            r4 = r3
            goto L_0x0072
        L_0x089a:
            java.lang.String r3 = "ۛۜۡۖۡۡۘۘۨۧۡۦۡۘ۬۟ۢۡ۠ۡ"
            r4 = r3
            goto L_0x0072
        L_0x089f:
            java.lang.String r3 = "ۘۚۚۦۡۗۗۖۚۘ۟ۡۦۧۘۨۘۦۘۤ۠۫ۥ۟۠ۧۢۨ"
            r4 = r3
            goto L_0x0072
        L_0x08a4:
            java.lang.String r3 = "ۛۙ۠۫ۢۦۘۙ۟ۖۘۜۡ۠ۨۜۗ۠ۥۥۘ"
            r4 = r3
            goto L_0x0072
        L_0x08a9:
            java.lang.String r3 = "ۘ۠ۤۖۘۧۡۖۜۢۚۨ۠۟۫ۨۨۛ۠ۦۙ۫ۙۘۗۜۘ"
            r4 = r3
            goto L_0x0072
        L_0x08ae:
            java.lang.String r3 = "ۚۤۙۡۘۨۥۛۖۚۚ۬۬ۙۚۛۧۛ"
            r4 = r3
            goto L_0x0072
        L_0x08b3:
            java.lang.String r3 = "ۡ۬ۜۚۨۘ۬ۡۥ۬ۡ۫ۨۘۢ"
            r4 = r3
            goto L_0x0072
        L_0x08b8:
            java.lang.String r3 = "ۢۖۥۘۧۧۛۚۡ۬ۖ۫ۨ۫۫ۚ"
            r4 = r3
            goto L_0x0072
        L_0x08bd:
            java.lang.String r3 = "۫ۘۡۨۛۧۤۤۖ۟ۡۗۡۖۨۘۥۤۖۘۖۙ"
            r4 = r3
            goto L_0x0072
        L_0x08c2:
            java.lang.String r3 = "ۜۘۜۘ۬ۥۨۜۖۧۘۙۤۢۚ۠ۚۚ۬ۤۘۦۦۗۢۚۗ"
            r4 = r3
            goto L_0x0072
        L_0x08c7:
            java.lang.String r3 = "۬۫۬۠ۗۛۡۧۘۗۦۨۘۜۘۘۖۖ"
            r4 = r3
            goto L_0x0072
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void removePatternLockListener(PatternLockViewListener patternLockViewListener) {
        String str = "ۧۚۘۘ۫۫ۘۘۨۛۨۘۧۥۧۘۜ۟۬ۧۚۥۤۨۡۘۖۨۘۖۜ۠";
        while (true) {
            switch ((str.hashCode() ^ 490) ^ 1677329808) {
                case -1883871289:
                    str = "۟۠ۦۘۜۘ۟۬۬ۨۛ۠ۖۢۧۖۘ";
                    break;
                case -1271505702:
                    str = "۬ۛ۫ۧۥۖۘۙۨۖۦ۟ۜۘۨۥۜۘ۬ۢۡ۟ۨۘۘۗۚ";
                    break;
                case -349829915:
                    return;
                case 2140307812:
                    this.f1314q.remove(patternLockViewListener);
                    str = "ۚۤۦۧۨۧۘۥۛ۬۠ۦۤۢۚۜ۫ۨ۠ۖۤۢ";
                    break;
            }
        }
    }

    public void setAspectRatio(int i2) {
        String str = "ۖۛۘۥۛۡۗۚۨۘۦۛۥ۠۟ۛۚۗۖۚۙۗۦۨۦۘ";
        while (true) {
            switch ((str.hashCode() ^ 123) ^ 1529025545) {
                case 318582910:
                    return;
                case 562626608:
                    this.f1303f = i2;
                    str = "ۨۡۦۘۘ۟ۢۗ۠ۦۖۛۜۘۘۥ۟ۡۥۜۘ";
                    break;
                case 1516379172:
                    str = "ۡۛ۟۟۫ۢ۟۟ۢ۫ۢۗۜۤۙ";
                    break;
                case 1721918294:
                    requestLayout();
                    str = "۬ۧۦۦۦۦۙۘۦۜۢۜۤۡۦۡۜۦۘ";
                    break;
                case 1805840632:
                    str = "ۡۨ۫ۘۢۦۖۙۥۘ۫ۧۡۘۨۤۡۧۜۘۤۨۙۢۚۙ۫ۚۜۘ";
                    break;
            }
        }
    }

    public void setAspectRatioEnabled(boolean z2) {
        String str = "ۗۦ۫ۥۙۛۜۖۨۨۖۥۥۤۚۥۡ۫۬ۘۛ";
        while (true) {
            switch ((str.hashCode() ^ 704) ^ -1787192009) {
                case -1985946112:
                    requestLayout();
                    str = "ۧۖۤۥ۠ۦۥۜۘۙۘۤۘۥۜۜ۟ۥۘۧۘ۬ۥۡۦۡۨۘ";
                    break;
                case -760902576:
                    str = "ۤۢۖۘۘۙۢۧ۬ۚۘۙۜۘۛۘۥ۠ۨۖۘۗۦۙۘۧۘ";
                    break;
                case 7613751:
                    str = "ۖ۫۬ۜۧۢۡۤۖۘۡۡۨۘ۟ۧۛۗۖۘ۟ۤۚ";
                    break;
                case 312074784:
                    return;
                case 1279548653:
                    this.f1302e = z2;
                    str = "ۛۙۢۡۙ۠۟ۤۦۘۗۨۜۡۥۥۘ۠ۢۡۘۚۢۖۘۦۤۘۧ";
                    break;
            }
        }
    }

    public void setCorrectStateColor(@ColorInt int i2) {
        String str = "ۡۜۡۧۧۢۙۜۘۘۦ۬ۥ۟۟۠ۥۢ";
        while (true) {
            switch ((str.hashCode() ^ 118) ^ 937346850) {
                case 628864010:
                    str = "ۤۚ۠ۦۨۘۨۗۜۘ۫ۦۛۛۚ۬";
                    break;
                case 745926087:
                    return;
                case 1234332105:
                    str = "۫ۥۖۛ۫ۦۘۛۖۘۜۖۨ۬ۦۧۜ";
                    break;
                case 2063264688:
                    this.f1306i = i2;
                    str = "ۜ۟ۦۘ۟۬ۙۨۚۛۚۙۧۡۢۜۘۤۤ";
                    break;
            }
        }
    }

    public void setDotAnimationDuration(int i2) {
        String str = "ۗۚۘۚ۬ۤۨۧۜۘ۠ۤۨۘۗۤۥۦۙۙۗۦۘ۠ۡۚۚ۟ۡ";
        while (true) {
            switch ((str.hashCode() ^ 611) ^ 1499454795) {
                case -2064120145:
                    this.f1310m = i2;
                    str = "۠ۚۗۘۢۦۧۧۚۥۥۡۙۗۤ۠ۜۡۡۦ۬";
                    break;
                case -1947857060:
                    str = "ۛۜ۟ۧۧ۟ۗۖۤۧۤۧۡۢۨۗ۟۬ۢۤۡۖۤ۫ۨ۫۫";
                    break;
                case -1853591766:
                    invalidate();
                    str = "۫ۦۥۢ۟ۘۚۙۡۘۜۛۦۙ۠ۖۘ۟ۘ۫ۙ۟ۤ۬۠ۛۘۥۚ";
                    break;
                case 73081779:
                    return;
                case 610324314:
                    str = "ۡ۫۠ۗ۠ۖۘۢۧ۟ۗۥۚۡۤ۠ۢۙۥۘ";
                    break;
            }
        }
    }

    public void setDotCount(int i2) {
        String str = "ۡۡۡۘۢ۬ۛۢ۠ۨۡۘۙ۟ۛ۬ۢۤۖۡۡۘۙۚۥ";
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            switch ((str.hashCode() ^ 354) ^ 1131452382) {
                case -2015373717:
                    i7 = H;
                    str = "ۨۧۧۥۚۢ۬ۙۥۘۥۗۡۡۗ۠";
                    break;
                case -1771346621:
                    H = i2;
                    str = "ۤۚ۬ۦۘۗۤۛ۬۟ۗۙۦۡ";
                    break;
                case -1741625006:
                    str = "ۙۜۥۜۚۘۘۖۨۦۘۗۗۜۘۨۛۖۘۜۨۚۤ۟ۦۘ";
                    i6 = i3;
                    break;
                case -1662504802:
                    str = "ۦۛۧۚۘۢۡۦۥۘۦۖۙۖۧۚۧۜۢۖۢۖ۠۬۟";
                    break;
                case -1558126942:
                    this.f1315r = new ArrayList(this.f1299b);
                    str = "ۦ۬ۦۤۗۥۢۡ۟ۤۢۖۜۢۚۢ۬ۡۛۛۘۚ۫ۤۤ";
                    break;
                case -1491036938:
                    i3 = i6 + 1;
                    str = "ۧۛ۟۬ۗۜۚ۬ۤۙ۟ۙۢۤ۬ۨۘۖۘۜۥ۬";
                    break;
                case -894339062:
                    this.f1299b = i2 * i2;
                    str = "ۥۥ۠۠ۙۖۤۤۦۘۛ۬ۜۥۦۤ۠ۖۛ";
                    break;
                case -544104452:
                    this.f1298a = (DotState[][]) Array.newInstance(DotState.class, new int[]{i7, i7});
                    str = "۫ۡۜۤۘۦۡۛۛۚۨۦۘ۬ۚۦۘۥۢۥۢۗۨۘ";
                    break;
                case -534350912:
                    String str2 = "۫ۢۡۘۡ۫۟۬۠ۦۖۛۤۦ۫ۜۘۛ۬ۖ";
                    while (true) {
                        switch (str2.hashCode() ^ 605213019) {
                            case -2132110677:
                                str = "ۚۨ۬ۚۤۖۘۦۢۘۘۘ۫ۙۜۦۘۤۥۥ۫ۜۖۤۛۡۥۧ";
                                continue;
                            case -1854907334:
                                str2 = "۠ۢۦۙۧۦۘۨ۠۟ۤۜۚۖۤۛۡۥۤۢ۠ۥۘۦۤۤۢۗ۬";
                                break;
                            case -1670859317:
                                if (i6 >= H) {
                                    str2 = "۬ۦۖۘۘۗۖۚۢۛۚۦۛۤۘۘ۬ۨ۫ۡۧۚۖ۟۫";
                                    break;
                                } else {
                                    str2 = "ۛۙۦۘۗ۠ۧۙۧ۠ۢۧۜۘۚۚ۬ۤۥۜۨۗۛ۠ۡۨۛۥۚ";
                                    break;
                                }
                            case -619823825:
                                str = "۠۟ۤ۬۫ۡۘۚ۫ۢۤۢۢۙۛۖۘۘۜۧۛۢۧۨۘۡۗۥ";
                                continue;
                        }
                    }
                    break;
                case -384106866:
                    this.f1316s = (boolean[][]) Array.newInstance(Boolean.TYPE, new int[]{i8, i8});
                    str = "ۚ۫ۖ۟ۘۧۘۛۗۨۧۚۚ۫ۖ۫ۥۨۜۛۡ۠۬۬";
                    break;
                case -251625137:
                    str = "ۜۗۧۢۘۖۗۧ۠۠ۖ۫۟ۗۘۡۦۘۧۧۘۘۤۖۛۡ۠ۙ";
                    break;
                case -59816528:
                    str = "۬ۚۜۘۥ۟ۧۤ۠ۖۘ۬ۗ۠ۥۙ۟ۧ۠ۘ۠ۦۘۘۛۧۦۘۧ۠ۤ";
                    break;
                case -33285023:
                    requestLayout();
                    str = "ۥۨۘۨۙۜۘۘۢۥۘۡۨۘۚۜۦۘ۬ۖۖۥۛۖۘۙۗۚ";
                    break;
                case 49521302:
                    str = "۬ۘۛۖۦۡۘۙۘۢۖۡۡ۬۬ۜ";
                    i5 = i4;
                    break;
                case 178687009:
                    String str3 = "ۧ۬۠ۨۢ۫ۡۚۘۘۤۛۢۗۗۦۘ";
                    while (true) {
                        switch (str3.hashCode() ^ 1805436504) {
                            case -2117411249:
                                str3 = "ۘۛۡۘۚۥۖۛ۬ۜۥ۬ۥۘۥۛۜۥۗۦۘ۫ۜۜۘ";
                                break;
                            case -1639032070:
                                str = "ۢۦۤ۬ۚۚۜۡۦۘۙۨۙۢۗۦ";
                                continue;
                            case -1295110218:
                                if (i5 >= H) {
                                    str3 = "ۦۜ۫ۢ۟ۗ۬ۙۛۚۥۘۗ۫ۖۘۤۦ۫۫۠ۦ";
                                    break;
                                } else {
                                    str3 = "ۨۦۧۘۛۘۘۧۦۙۧۗۜۘ۟ۥۛۗۦۙۧۖۡۚۤۤ";
                                    break;
                                }
                            case 1532117403:
                                str = "ۥ۫۟ۤۧ۟ۗۛ۫ۤ۟ۚۘ۫۬۠ۨۖ";
                                continue;
                        }
                    }
                    break;
                case 184685722:
                    str = "۬ۙۦۨۧۖۦۤۦۘۘ۠ۚۦۚۨۘۥۢۙ۬۫ۖۖۘۖ۠ۛۨۘ";
                    break;
                case 245096426:
                    return;
                case 482476228:
                    str = "ۥۧۗ۫۟ۚۤۜۡۗ۫ۡۘ۠۠۠۬ۡۖ۬ۘۦۙ۟ۥ";
                    break;
                case 502767596:
                    str = "ۖۖۢۘ۟ۨۡۧۡۗۚ۬ۦۡۖۖۛۨ";
                    break;
                case 616722405:
                    i4 = i5 + 1;
                    str = "ۢۖۥۢۢۦۘۖۙۘۘۗۤۥۗۗۡۦۤۨۘۧۢۤۖۡۥۘ";
                    break;
                case 622342786:
                    invalidate();
                    str = "ۥۥ۫۬ۗ۬ۢۖۡۘۖۜۡۘ۬ۛۥۧۡ۟ۤۨۚۡۧۥۗۦۛ";
                    break;
                case 983692236:
                    this.f1298a[i6][i5] = new DotState();
                    str = "ۖۛۨۘ۠۟ۨۨۢۨۡۖۡۛۧۙۖۗۦ۫ۦۢ";
                    break;
                case 1113113985:
                    this.f1298a[i6][i5].f1329c = (float) this.f1308k;
                    str = "ۡۦۛۛ۫۬ۗۥ۬ۥ۠ۜۘۚۗۡۘ۠ۙۚۡۙۦۘۙۖۘۙۥۘ";
                    break;
                case 1421252640:
                    i8 = H;
                    str = "ۢۙۨۚۧ۫ۧۜۘۜۧ۠ۙ۬۬ۤ۠ۜۘ";
                    break;
                case 1437057641:
                    str = "ۜۗۧۢۘۖۗۧ۠۠ۖ۫۟ۗۘۡۦۘۧۧۘۘۤۖۛۡ۠ۙ";
                    i5 = 0;
                    break;
                case 1490649397:
                    str = "۬ۙۦۨۧۖۦۤۦۘۘ۠ۚۦۚۨۘۥۢۙ۬۫ۖۖۘۖ۠ۛۨۘ";
                    i6 = 0;
                    break;
            }
        }
    }

    public void setDotNormalSize(@Dimension int i2) {
        String str = "ۧۢۨۚۛ۫ۚ۟ۖۘ۟۟ۛۙ۠ۢۜۜۖ";
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            switch ((str.hashCode() ^ 604) ^ 859398726) {
                case -1971611853:
                    return;
                case -1730776884:
                    str = "ۖۨۧۧۧ۟ۥۡۖۖۢۤ۟ۧۢۤۚۧۨۧۜۡۥۢۚۛ";
                    break;
                case -1568393880:
                    i4 = i5 + 1;
                    str = "ۘۛۢ۬ۡۧ۫ۧۖۘۘۖۘ۫۟ۜۤۦۚ";
                    break;
                case -1521693929:
                    String str2 = "ۗۢ۠ۗۦۡۘۗۛۖۘ۠ۥۖۘۥۙۡۘۢۥ۟ۥۚ۬";
                    while (true) {
                        switch (str2.hashCode() ^ 1240707386) {
                            case -119282869:
                                str = "۬ۤ۬ۙۚۛۨ۠۬ۖۨۜۚ۠ۨۦۜۜۗۛ";
                                continue;
                            case 320438709:
                                str2 = "ۛۗ۟ۖۦۨۜۤۖۜۘۙ۠ۙۚ";
                                break;
                            case 1347051015:
                                str = "ۡۥۚۡۚۚۡ۫ۖۙۡۘۥۛۡۘ۫ۖ۬ۗۨۘۦۦۘ";
                                continue;
                            case 2101648660:
                                if (i6 >= H) {
                                    str2 = "۟ۖۥ۫ۤۥۘ۟ۗۜۘ۟ۘۜۥۗۤۙۗ۬";
                                    break;
                                } else {
                                    str2 = "۬ۤ۫ۦۙۜۘۡۚۤۧۧۖۘۙۡ۟ۥۗ۫ۗۡ۠ۧ۫ۖۘ";
                                    break;
                                }
                        }
                    }
                    break;
                case -1392572792:
                    str = "ۙۗۨۘۦۛۙ۠ۘۨۤۨۢۥۦۚ۬ۢۢ۠ۘۦۘ";
                    break;
                case -1391104605:
                    str = "ۨۥۥۙۛۘ۫ۡۥۘ۠ۤۚۨۘۗۘۢۡۧ۫";
                    i5 = i4;
                    break;
                case -423777274:
                    str = "ۢۦۗۚۜۘۘۘۢ۬ۖۨۜۥۖ۟ۧۚۡۦ۫ۡۘۢۨۦ";
                    i6 = i3;
                    break;
                case -340865321:
                    i3 = i6 + 1;
                    str = "ۛۧۘۘۤۧۡ۠ۙۦۘ۟ۘۘۘۖۙۜۘۢۘۨ۟۬۫ۘ۟ۛۙ۬ۢ";
                    break;
                case -236877029:
                    str = "۠ۤ۠ۤۦۡۘۖۛۥ۠۠ۛۢۘۥۘ۬ۧۜۘۦۚۙۢۤۤ";
                    i5 = 0;
                    break;
                case 64764968:
                    str = "ۜۢ۠۠ۡۖۘۥۧۘۘۗۧۥۦۧۡۘۛۙۥۢ۠ۥ۫۫ۘۘۚۘۙ";
                    i6 = 0;
                    break;
                case 67941987:
                    str = "ۧ۫ۖۙ۫۠۟۠ۤۤۚۙۧۜۥۤۜۥ۫ۘۘۜ۠ۨ";
                    break;
                case 149537568:
                    this.f1298a[i6][i5].f1329c = (float) this.f1308k;
                    str = "ۙۨۥۢ۠۫ۤ۟ۥ۫۠ۤ۟ۛۜۦ۫۠۟ۗۡ";
                    break;
                case 175530350:
                    this.f1298a[i6][i5] = new DotState();
                    str = "۬ۦۡۘۚۢۦۡ۟ۤۦۗۨۘۥۦۘۘ۫ۧۜۘۗۤۡۘۙۗۗۨ۠";
                    break;
                case 918393685:
                    this.f1308k = i2;
                    str = "۫ۜ۬ۛۛۛۦۤۚۦۧۦۘ۟ۘۡۘۗۥۥۘ۟ۘۘۘ";
                    break;
                case 1087874295:
                    String str3 = "۠ۥۧۘۧ۟ۘۧ۫ۙ۟ۤ۟ۢۡۦ۠ۗۘ۬ۡ۠۫ۛۥۘۜۖۥ";
                    while (true) {
                        switch (str3.hashCode() ^ -38152630) {
                            case -1207777204:
                                if (i5 >= H) {
                                    str3 = "ۗ۟۠ۥۢ۟ۥۨۡۧ۠۠ۚۨ۬ۚۚۜۘۖۢۢ۬ۧ۟";
                                    break;
                                } else {
                                    str3 = "ۜۜۢ۠ۘۚۦۙۨ۠ۘۛۜ۬۫ۙۘۜۘۧ۫ۘ";
                                    break;
                                }
                            case 426218859:
                                str = "ۤۖ۫۫۟ۜۘۡۤۙۡۘۘۖۦۘ";
                                continue;
                            case 1354739199:
                                str = "ۢ۠ۨۘۢۥ۫ۛ۠ۦۘۜۥۜۥۜۥۘۙۖۘۡ۠ۥۡۛ۟ۥ۫ۡ";
                                continue;
                            case 1536411814:
                                str3 = "۬۟ۢۙۙۘۘۘۦۘۘۤۘۢۥ۬ۘۢ۟ۖۜۨۦ";
                                break;
                        }
                    }
                    break;
                case 1144049278:
                    invalidate();
                    str = "ۗۙۛۢۘۨۘۢۚۗۜۛۨۡ۟ۡۦۥۙۦۨ۫";
                    break;
                case 1170750153:
                    str = "۠ۤ۠ۤۦۡۘۖۛۥ۠۠ۛۢۘۥۘ۬ۧۜۘۦۚۙۢۤۤ";
                    break;
                case 1971350363:
                    str = "ۜۖۦۚۚۤۘۥۗ۬ۜۤۖۛۖۢۜۘ";
                    break;
                case 2104511165:
                    str = "ۜۢ۠۠ۡۖۘۥۧۘۘۗۧۥۦۧۡۘۛۙۥۢ۠ۥ۫۫ۘۘۚۘۙ";
                    break;
            }
        }
    }

    public void setDotSelectedSize(@Dimension int i2) {
        String str = "ۗ۫ۤۨۡۗ۬ۙۙ۠ۜۨۘۦۡۤۜۘ";
        while (true) {
            switch ((str.hashCode() ^ 76) ^ -1911909325) {
                case -1147279584:
                    str = "۟ۡۖۢۙۜۘۨۖۡۚۚۗۧۦۘۖۘۧۧۗ";
                    break;
                case -33393116:
                    str = "ۘۘۙۘۗۘ۬ۚۦۘ۬ۢۘۘۥۖۦۘۛۖۢۙۨۜ";
                    break;
                case 548875224:
                    this.f1309l = i2;
                    str = "ۙۙ۫ۤ۠ۜۤۛۜۘ۬۠ۜ۫ۧۖۘۦۙ۟ۢۥۦۘ";
                    break;
                case 616735388:
                    return;
            }
        }
    }

    public void setEnableHapticFeedback(boolean z2) {
        String str = "ۥ۠ۢ۬ۜۜۘۢۧۨۘۤۙۦۙۤۤۨ۬ۦ";
        while (true) {
            switch ((str.hashCode() ^ 857) ^ 593935824) {
                case -2053795082:
                    str = "ۛۧۨۘۖۘۙۥۥۘۘۗۢۤۨۖ۫ۚۘۦۥ";
                    break;
                case -1570320133:
                    str = "ۗۤۘۖ۬ۘۘۥۨۜۤ۠۟۬ۖۦۘۘ۠ۜۤۨۘۦۖۡۡۚۜۘ";
                    break;
                case 141414037:
                    this.f1322y = z2;
                    str = "ۘ۟ۖۗۡۜۘ۠۠ۗۗۖۢۥۡۨ";
                    break;
                case 620864930:
                    return;
            }
        }
    }

    public void setInStealthMode(boolean z2) {
        String str = "ۚۦۦۘ۟ۢۡ۬ۥۧۘ۫ۜۘ۟ۚۡۘۖۖۥ";
        while (true) {
            switch ((str.hashCode() ^ 967) ^ 1942811216) {
                case -336494399:
                    str = "ۖۤۚۛۜ۟ۥۙ۠ۨۜۚۨۢۖۢۦۘ۬۟ۙۨۗۨۜ۬ۡ";
                    break;
                case -136612603:
                    this.f1321x = z2;
                    str = "۠ۢۜۘ۬ۤۧ۠ۡۜۛۥ۠۬ۧۧۘۛۦۨۦۘ۬ۦۘۚۚۜ";
                    break;
                case 141410658:
                    return;
                case 484627373:
                    str = "۠۬ۜۘۘۗۥۘۙۙۤ۟ۦۤۖۚۜۘ۫ۘۙ۠ۗۖۘ";
                    break;
            }
        }
    }

    public void setInputEnabled(boolean z2) {
        String str = "ۨۚۘۘۤۛۜۚۜۘۚۖ۬ۛۢ۫";
        while (true) {
            switch ((str.hashCode() ^ 552) ^ 529124985) {
                case -1691118842:
                    str = "ۛ۬ۥۘ۬ۜۘ۫ۛۢۚۖۗۗۖۢۚۨ۫ۗۦۨ۫ۤۖۘ";
                    break;
                case 430406748:
                    str = "ۧۡۦۘۖۡۦۙ۫ۡۜۦۗ۟ۛۙۤۢۢۛۜۨۦۨۘ";
                    break;
                case 1021294657:
                    return;
                case 1645142866:
                    this.f1320w = z2;
                    str = "ۡۥۤۤۨۘۥۜۧۘۤۙۡۘ۠ۛۥۖۦۢ";
                    break;
            }
        }
    }

    public void setNormalStateColor(@ColorInt int i2) {
        String str = "۬۠۟ۨۘۛۙۦ۬ۘۤۘۘۦۢۗۧۤۢ";
        while (true) {
            switch ((str.hashCode() ^ 478) ^ 1390687494) {
                case -1586536540:
                    return;
                case -551520367:
                    this.f1304g = i2;
                    str = "۬ۨۧۘۖۥۚۚۙۨۧۥۡۘۢ۟ۚ۫ۦۢۨۗۘۧ۫ۨۨۡۚ";
                    break;
                case -83793999:
                    str = "۟۠ۘۘۧ۬ۥ۟ۗۚۜۗۚ۟ۢۨ";
                    break;
                case 1521372781:
                    str = "۬۠ۗ۬ۘ۟ۦۥۘۨۢۗۚۥۥۧۙۗ۫ۗۨۧۨۤۨۙۦۘ";
                    break;
            }
        }
    }

    public void setPathEndAnimationDuration(int i2) {
        String str = "۫ۥۚۙۢۛۛ۟ۧۡۧۙۘۥۤۜۛۖۡۧۜۘ۟ۨۜ";
        while (true) {
            switch ((str.hashCode() ^ 105) ^ -1882345756) {
                case -751986338:
                    this.f1311n = i2;
                    str = "ۢۡۢ۟ۗۜۘۧۘۢۛۖۘۨۗۡ";
                    break;
                case -315919294:
                    return;
                case 359270114:
                    str = "ۨۚۢۤۨ۬ۡۦۥۘۛۜۜ۫ۙۦۤۧ۠ۤۡۥۛ";
                    break;
                case 1832575470:
                    str = "ۨ۫ۖۘ۬ۨۚۜ۬ۥۘ۬ۨ۟۟۠ۧۛۗۜ۠۬ۡۧ۬ۧۨ۠ۙ";
                    break;
            }
        }
    }

    public void setPathWidth(@Dimension int i2) {
        String str = "۠ۥ۟ۜۢۜۘۤۥۗ۟ۨۧ۟ۚۗۚۡۜۧۦۢ";
        while (true) {
            switch ((str.hashCode() ^ 597) ^ -1274156089) {
                case -1663040397:
                    return;
                case 453660703:
                    invalidate();
                    str = "ۤ۟ۢۚۧۦۘ۟۬ۤۚۚ۫۟ۚۛ۟ۦۧۘۤۥۖۘ";
                    break;
                case 914197460:
                    str = "ۛ۬ۢ۫۠ۙۤۦۧۘ۬۫۬ۖ۠ۧۘۧۘ";
                    break;
                case 1163811713:
                    g();
                    str = "ۙۜۦۙۘۖۘۧۧۧۛۚۦۘۥۢۘۘۘۙۢ۟۠ۜۘ";
                    break;
                case 1353823995:
                    this.f1307j = i2;
                    str = "ۖ۬ۘۘ۫۟ۘۘۗۖۗۡۛۖۘ۫ۡۨ۬ۡ۠۬ۢ۬";
                    break;
                case 1514994849:
                    str = "۬ۜۜۘۘۙۦۘۦۜ۠۠ۛۘۘۙۨۙۘ۬ۗۜۧۧۙۛۨ";
                    break;
            }
        }
    }

    public void setPattern(int i2, List<Dot> list) {
        String str = "ۖۨۚ۬ۢۚۚۘۡۨ۫ۘۘۘۤۜ۬ۨۘۚۨۡۘ";
        Dot dot = null;
        Iterator<Dot> it = null;
        while (true) {
            switch ((str.hashCode() ^ 422) ^ -792705374) {
                case -1945569456:
                    setViewMode(i2);
                    str = "ۜۤۢۤۖ۬ۧۖۘۛۢۘ۫ۖۘۜۖۧۘ";
                    break;
                case -1844406566:
                    str = "ۖۡۧۤ۟ۖۛ۟ۙ۫ۖ۠۬ۛۢ";
                    it = list.iterator();
                    break;
                case -1684580943:
                    this.f1316s[dot.f1325a][dot.f1326b] = true;
                    str = "۫ۢۛۧۖ۫ۤۢۘۘۛۖ۫ۡۢۗ۫ۜۘۘ";
                    break;
                case -1412514935:
                    str = "ۖۡۧۤ۟ۖۛ۟ۙ۫ۖ۠۬ۛۢ";
                    break;
                case -1185571584:
                    str = "۠ۡ۬ۘۘۘۘۧۡۧۘۙۨ۬۫ۨۨۘۥۤۡۤۨۧ";
                    dot = it.next();
                    break;
                case -1146530732:
                    return;
                case -469883976:
                    this.f1315r.addAll(list);
                    str = "ۢۚۨۥۡۦۙۡۥ۬ۙۥ۟ۤۖۘ۠ۛ۟ۜۤۥ";
                    break;
                case -265984431:
                    b();
                    str = "ۡۜۥۜۙۚۡۙۗ۫ۦ۟ۚۖۚ۠۠۫ۘ۫ۖ";
                    break;
                case -108039560:
                    this.f1315r.clear();
                    str = "۟ۢۙ۬ۦۢۛۛۨۘۛۖۚۚۥۚۛۖۗۜۜۜۚۢۖ";
                    break;
                case 952574864:
                    String str2 = "ۗۢۖۖۙۦۘۛۘۨۘ۟ۦۙۖۢۜۘ۠۫ۖۗ۫ۛۢ۠";
                    while (true) {
                        switch (str2.hashCode() ^ -97534170) {
                            case -1852876589:
                                str = "۠۫ۥۘۥۦ۟۠ۖۡۘۜۘۨۘۧۦۜ";
                                continue;
                            case -1776158815:
                                if (!it.hasNext()) {
                                    str2 = "ۡۨۗ۟ۤۨۘۛۥۚۡۦۢۧۖۥۤۖۛۨۘۘۖ۬";
                                    break;
                                } else {
                                    str2 = "۠ۛ۠ۘ۠ۛۧۜۗۘۖۘۜ۬ۨۨ۫۠۫ۘۙۦۦۥۛ۠ۨۘ";
                                    break;
                                }
                            case 12884095:
                                str2 = "ۛۦۜۘۙۗۥۘ۟ۥۢۥ۠ۢ۫ۜۨۚۧۥۘۚۖۧۚۘ";
                                break;
                            case 1644970879:
                                str = "۟ۧ۠ۗۧۡۦۛۜۘۜۤۡۘ۫ۢۤۖۨۘۖۢۢ";
                                continue;
                        }
                    }
                    break;
                case 1217615635:
                    str = "۟ۡۨۘ۫ۚۦۙ۟ۥۤ۟ۨۘۘۧۜۡۚ۫ۚۜۨۥۥۧ۠ۙ۠";
                    break;
                case 1221807877:
                    str = "ۤۥۡۢۜۧۙۛۙ۠ۖۦۚ۬ۡۘ۫ۡۥۘ۟ۧۗ";
                    break;
                case 1666923711:
                    str = "۟۬ۦۤۦ۬ۡۘۛۤ۠۬ۨۢۖۨۜۤۚۙۘۙۛۡۘ";
                    break;
            }
        }
    }

    public void setTactileFeedbackEnabled(boolean z2) {
        String str = "۠ۢ۬ۧ۬ۙۛ۫ۤۧۦۧۘۛ۠ۥ";
        while (true) {
            switch ((str.hashCode() ^ 235) ^ -1124542701) {
                case -1862591974:
                    return;
                case -150093538:
                    str = "ۛ۫ۗۙۨۢۘۚۘۧۖۖۢۤۡۘۚۜۘۙۦ۠ۘ۫ۙ۟۟ۦ";
                    break;
                case 28068177:
                    this.f1322y = z2;
                    str = "ۘۛ۠ۧ۠ۖۘ۟۬ۢۛۨۥۘۚۛ۠";
                    break;
                case 1051665067:
                    str = "ۧۥۖۘۤۨ۫ۥۨۥۢۧۡۖۤۦۦۥۘۚۧۘ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setViewMode(int r6) {
        /*
            r5 = this;
            r2 = 0
            java.lang.String r0 = "ۧۡۘۧۨۥۘۛۨۜۦۧۡۘ۫ۥۙۨۚۙ"
            r1 = r0
        L_0x0004:
            int r0 = r1.hashCode()
            r3 = 568(0x238, float:7.96E-43)
            r4 = 1423062837(0x54d23735, float:7.2229548E12)
            r0 = r0 ^ r3
            r0 = r0 ^ r4
            switch(r0) {
                case -960510531: goto L_0x0081;
                case -650072368: goto L_0x0043;
                case -582298621: goto L_0x0021;
                case -560353550: goto L_0x008e;
                case -553166344: goto L_0x009b;
                case -452086608: goto L_0x0013;
                case -81337160: goto L_0x0074;
                case 224324253: goto L_0x002f;
                case 663433710: goto L_0x00b3;
                case 763995595: goto L_0x00a3;
                case 1714887802: goto L_0x006a;
                case 1840610788: goto L_0x0017;
                case 2107022100: goto L_0x001b;
                case 2122594982: goto L_0x00ab;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0004
        L_0x0013:
            java.lang.String r0 = "ۖۧ۠ۘۢۜۘۚۥۘۘۨۖ۫ۛ۟ۨۘۚۡۜ۬۠ۗۖۚ۬"
            r1 = r0
            goto L_0x0004
        L_0x0017:
            java.lang.String r0 = "۬ۢۦ۠۬۠۟ۜۤۛ۠۠ۘۧۜۘ۠ۚۙۢۥۘۦۜۨ"
            r1 = r0
            goto L_0x0004
        L_0x001b:
            r5.f1319v = r6
            java.lang.String r0 = "ۥ۟ۗۦۡ۟ۦۗۢ۫ۢۚۦۡۥۘۙۡۜۘ۟ۗۖۜۧ۬"
            r1 = r0
            goto L_0x0004
        L_0x0021:
            r1 = -674021401(0xffffffffd7d33fe7, float:-4.64542824E14)
            java.lang.String r0 = "ۤۤۜۘۘۙ۬ۚ۟ۦۡۗۘۦۤۥۘۛ۠ۜۘۤۜۖۘ"
        L_0x0026:
            int r3 = r0.hashCode()
            r3 = r3 ^ r1
            switch(r3) {
                case -2112584098: goto L_0x003c;
                case -1785106460: goto L_0x002f;
                case -536991339: goto L_0x003f;
                case -272272389: goto L_0x0036;
                default: goto L_0x002e;
            }
        L_0x002e:
            goto L_0x0026
        L_0x002f:
            java.lang.String r0 = "ۜۧۚۨۘۥۧ۫ۥۘۜۥۥ۟ۛۙۦۘ۠۫۫ۥ۠ۖ"
            r1 = r0
            goto L_0x0004
        L_0x0033:
            java.lang.String r0 = "ۛۘۡ۬ۙۦۘۤۡۧۘ۠ۧۨۦۙۦۘ۟ۙۢۧۗ"
            goto L_0x0026
        L_0x0036:
            r0 = 1
            if (r6 != r0) goto L_0x0033
            java.lang.String r0 = "۟۫۫ۘۖۨۘۢ۬ۤۤ۫۫ۖۘۡۘ۠۠۫ۘ۠ۜ"
            goto L_0x0026
        L_0x003c:
            java.lang.String r0 = "۫ۛۛۗۧۥۘۦۜۘۖ۬ۤ۫ۥۡۘ۠ۤۖۢۙۘۘ۬ۨ۬"
            goto L_0x0026
        L_0x003f:
            java.lang.String r0 = "۬ۨۜۘۤۜۘۘۗۤۢ۟ۥۢۙۡۜ"
            r1 = r0
            goto L_0x0004
        L_0x0043:
            r1 = -668277648(0xffffffffd82ae470, float:-7.5159243E14)
            java.lang.String r0 = "۟۠ۢۜۢۨۘۡۚۥۥۙۦ۫ۛۗۤۛۜۘ"
        L_0x0048:
            int r3 = r0.hashCode()
            r3 = r3 ^ r1
            switch(r3) {
                case -1091353211: goto L_0x0051;
                case 156566445: goto L_0x0058;
                case 530786616: goto L_0x0066;
                case 1842249250: goto L_0x0063;
                default: goto L_0x0050;
            }
        L_0x0050:
            goto L_0x0048
        L_0x0051:
            java.lang.String r0 = "ۙۖۦ۫ۨۨۗۚۡۘۘۦۘۗۥ۬۫ۧ۫ۦ۬۫"
            r1 = r0
            goto L_0x0004
        L_0x0055:
            java.lang.String r0 = "ۗۧۥۘ۫۬۬ۙ۬ۦۘۤۤۨۡ۠ۧۧ۫ۦۙۢۡۘ"
            goto L_0x0048
        L_0x0058:
            java.util.ArrayList r0 = r5.f1315r
            int r0 = r0.size()
            if (r0 == 0) goto L_0x0055
            java.lang.String r0 = "ۜۡۜ۬۠۬۫۫ۨۘ۬۠۬ۤ۫۫ۧۧۥۗۡۦ۬ۢۜ"
            goto L_0x0048
        L_0x0063:
            java.lang.String r0 = "۠ۗۧۚۥۤۜۨۘۡۚۖۜ۠ۜۛۜۧ"
            goto L_0x0048
        L_0x0066:
            java.lang.String r0 = "ۗۥۢ۬ۜۥۘۚۤۡۘۧۢۚۛ۟ۧۖۛ۬ۦ۫۫۠ۜۘۘ"
            r1 = r0
            goto L_0x0004
        L_0x006a:
            long r0 = android.os.SystemClock.elapsedRealtime()
            r5.f1300c = r0
            java.lang.String r0 = "ۚۛۘۘۤۡۗۖۗۦۘۤۘۛۢۚۧۧۙۖۧۧ۫ۢۗۥ"
            r1 = r0
            goto L_0x0004
        L_0x0074:
            java.util.ArrayList r0 = r5.f1315r
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView$Dot r0 = (com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView.Dot) r0
            java.lang.String r1 = "ۙۧۢۖ۟ۥۛ۬ۢۥ۬ۚۡۛۛۙۗۡۘۥۖ۫ۧۛۧۧۚۨ"
            r2 = r0
            goto L_0x0004
        L_0x0081:
            int r0 = r2.f1326b
            float r0 = r5.d(r0)
            r5.f1317t = r0
            java.lang.String r0 = "۟ۗۘ۬ۗۘۘۖۗۖۧۨۦ۟ۢ۫ۛۚ۫"
            r1 = r0
            goto L_0x0004
        L_0x008e:
            int r0 = r2.f1325a
            float r0 = r5.e(r0)
            r5.f1318u = r0
            java.lang.String r0 = "۬ۜۡۘۚۗۦۙۧۤۦۜ۫ۘ۫ۜۥۢۚ"
            r1 = r0
            goto L_0x0004
        L_0x009b:
            r5.b()
            java.lang.String r0 = "ۜ۬ۨ۠ۙ۬ۙ۟ۙۧ۠۫۬۠ۖۘ"
            r1 = r0
            goto L_0x0004
        L_0x00a3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "you must have a pattern to animate if you want to set the display mode to animate"
            r0.<init>(r1)
            throw r0
        L_0x00ab:
            r5.invalidate()
            java.lang.String r0 = "۠ۤۚۤۡۨۘۡۗۚۜۢۜۘۤۧۦ۬۫۬ۜ۬ۤۦۤۨ"
            r1 = r0
            goto L_0x0004
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView.setViewMode(int):void");
    }

    public void setWrongStateColor(@ColorInt int i2) {
        String str = "ۡۥۡۦۚ۟ۧۡۚۥۢۖۘۥۡۜۘۨ۬ۥ۠ۦۡ";
        while (true) {
            switch ((str.hashCode() ^ 766) ^ -1127713790) {
                case -1427158649:
                    str = "ۧۥۧۘ۠ۨۚۗۚۨۨۘ۠ۦۦ۠ۢۡۘۚ۫ۜۘۦۘۘۘۨ۫ۚ";
                    break;
                case -342137587:
                    this.f1305h = i2;
                    str = "۟ۘۛۚ۫ۛ۬۠ۧۤۦ۠ۧۙۙ۬۫ۧ";
                    break;
                case 344372799:
                    str = "۬ۛۖۨۖۙۗۛۨ۟ۤ۟ۤۧۖۘۨ۫ۤ۟ۛۙ";
                    break;
                case 816381832:
                    return;
            }
        }
    }
}
