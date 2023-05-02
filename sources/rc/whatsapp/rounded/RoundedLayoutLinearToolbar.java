package rc.whatsapp.rounded;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.obwhatsapp.yo.HomeUI;
import com.obwhatsapp.yo.shp;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.task.utils;

public class RoundedLayoutLinearToolbar extends CollapsingToolbarLayout {

    /* renamed from: a  reason: collision with root package name */
    public final Path f2606a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final Paint f2607b = new Paint();

    /* renamed from: c  reason: collision with root package name */
    public final RectF f2608c = new RectF();

    /* renamed from: d  reason: collision with root package name */
    public final float[] f2609d = new float[12];

    /* renamed from: e  reason: collision with root package name */
    public boolean f2610e = false;

    /* renamed from: f  reason: collision with root package name */
    public int f2611f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2612g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2613h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2614i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2615j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2616k;

    /* renamed from: l  reason: collision with root package name */
    public int f2617l;

    /* renamed from: m  reason: collision with root package name */
    public int f2618m;

    /* renamed from: n  reason: collision with root package name */
    public float f2619n;

    /* renamed from: o  reason: collision with root package name */
    public GradientDrawable f2620o;

    public RoundedLayoutLinearToolbar(Context context) {
        super(context);
        c();
    }

    public RoundedLayoutLinearToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public RoundedLayoutLinearToolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        c();
    }

    public final void a() {
        boolean z2 = false;
        String str = "۠ۖۦۛۖۙۗ۫ۡۛۚۜۘۦۗۚۥۤۢ";
        Path path = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        RectF rectF = null;
        float f4 = 0.0f;
        while (true) {
            switch ((str.hashCode() ^ 246) ^ -1316531375) {
                case -1902781830:
                    String str2 = "ۦۥۙۨ۟ۛۛۛۨۡۗۡ۫ۨۘۘۘۧۧۛۢ۟";
                    while (true) {
                        switch (str2.hashCode() ^ 1618881420) {
                            case -1383047354:
                                if (this.f2610e) {
                                    str2 = "ۥۘۘۘۨۤ۫ۛۗ۠ۧۙۜۗۨۨ";
                                    break;
                                } else {
                                    str2 = "ۘۥۥۘۥ۠ۦۘۜۙۘۘۨۤۥۨۜۘۘۨۥۚ";
                                    break;
                                }
                            case -659596220:
                                str = "۠۬ۛ۫ۖۦۘ۫ۢۡۢۜ۟۠۠ۛ";
                                continue;
                            case 343618598:
                                str2 = "ۙۙۜ۫ۥۜۘۤۖۦۘۗ۫ۡ۠۟ۢ۫۫ۜۘۚۨۦۘ";
                                break;
                            case 1102110937:
                                str = "ۢ۟ۙۖۤۖۧۨۦۙۜۨۘۦ۟ۤۧ۟ۢ۬ۚۘۘ";
                                continue;
                        }
                    }
                    break;
                case -1553026281:
                    str = "ۨۛ۠ۥ۬۠۬ۡۦۘۨ۠۟ۡ۬ۘۡ۟۫۬۟ۡۘ۟ۡۘۨۙۤ";
                    f3 = f4;
                    break;
                case -1462913892:
                    String str3 = "ۖۖ۫۟ۗۡ۟ۚۤۡۘۚۦۤۖۗۘۖۤ۬۫ۦۥۦۘ۬۬ۤ";
                    while (true) {
                        switch (str3.hashCode() ^ -1728688820) {
                            case -1003459297:
                                str = "ۛۖۤ۬ۖۗۦۘۛۢ۫ۚۧۖۨۘۖ۟ۚۡۧۚ۬ۡۤ";
                                continue;
                            case -301674639:
                                str3 = "۠ۗۜۘۤۚ۟ۚۗۛۥ۠ۖۘۛۛۧۘۘۗۥۜ۟";
                                break;
                            case 1675128617:
                                if (!z2) {
                                    str3 = "ۤۢۜۘ۬ۜ۟ۚۡۘۘۙۢ۫ۙۖۘ";
                                    break;
                                } else {
                                    str3 = "ۦۧۜۡ۫۫ۤ۬ۘ۟ۘۡ۬ۖۥۘۜۨۤ";
                                    break;
                                }
                            case 1719096761:
                                str = "۫ۨۜ۬ۘ۠ۥۜۘۗۛۚ۟ۛۘۙۛۜ";
                                continue;
                        }
                    }
                    break;
                case -1376003134:
                    str = "۫۠ۥۘ۟ۥ۬ۗۤۙۜۘۘۙۖۖ";
                    z2 = this.f2612g;
                    break;
                case -1227775493:
                    str = "۫ۨۜ۬ۘ۠ۥۜۘۗۛۚ۟ۛۘۙۛۜ";
                    f3 = f2;
                    break;
                case -891778494:
                case -867840365:
                    return;
                case -691160698:
                    str = "ۦ۬ۙۦۥۦۘۡۛۨ۬۟ۜۘۥ۫ۤۙۚۖۖۧۘۡ۠ۛۥۥۡۘ";
                    f2 = Math.max(rectF.width(), rectF.height()) / 2.0f;
                    break;
                case -687617908:
                    str = "ۛۦۦۘۜ۫ۛۦۧۛۗۥۘۗ۠ۨۖۜۖ";
                    rectF = this.f2608c;
                    break;
                case 224162475:
                    path.reset();
                    str = "ۥۗۡۚۘۦۦۘۨۛۦ۬ۦ۬ۨۘ";
                    break;
                case 630827635:
                    str = "ۦۧۛۙۤۜۘۤۢۦۢۗۨۘۤۧۨۘۥۚۧ۟ۥۛ۠ۨۧ";
                    break;
                case 781186877:
                    path.addRoundRect(rectF, b(f3), Path.Direction.CW);
                    str = "ۚۤۡۘ۬۠۠۠ۖۢۤ۬ۨۘۙۜ۠ۖ۬ۨۘ۫ۖۗۖ۠ۧ";
                    break;
                case 1560335378:
                    this.f2620o.setCornerRadii(b(f3));
                    str = "ۤۙۡۨۡۥۙۨۘۙۗۥۘ۠ۘۘۘۧۨۡۙۤۨۘۙۤۙ";
                    break;
                case 1721271420:
                    path.close();
                    str = "ۜۥۜۘۥ۠ۖ۫ۗۗۤۧۙۨۨۧۘۢ۬۬ۧۗۗۨۧ۫";
                    break;
                case 1865058846:
                    f4 = (float) this.f2611f;
                    str = "ۖۚۜۘ۟۬ۥ۬ۥۦۖ۟ۨۘۡۢۗۤۘۘۘ۬ۛۘۧۛ۫ۡۜۘۘ";
                    break;
                case 1922898511:
                    path = this.f2606a;
                    str = "ۚۥۦۦۗۨۘ۠ۤۖۛۜ۬ۦۚۜۘۥۦۡۜۧ۠ۥ۟۠";
                    break;
            }
        }
    }

    public final float[] b(float f2) {
        boolean z2 = false;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float[] fArr = null;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        boolean z3 = false;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        boolean z4 = false;
        float f13 = 0.0f;
        boolean z5 = false;
        int i2 = 0;
        boolean z6 = false;
        int i3 = 0;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        boolean z7 = false;
        float f17 = 0;
        float f18 = 0.0f;
        float f19 = 0.0f;
        boolean z8 = false;
        float f20 = 0.0f;
        String str = "۟۠ۥۨۙۘ۟۠ۢ۟ۧۘ۠ۗۙۚۗۥۘۗ۟ۡ";
        while (true) {
            switch ((str.hashCode() ^ 224) ^ 1723513160) {
                case -2141416598:
                    str = "ۡۘۨۦۡۥۘۧۜۘۢ۫ۤۡۚۘ";
                    f9 = f2;
                    break;
                case -2063512827:
                    z7 = this.f2615j;
                    str = "ۤۜ۫ۜ۫ۨۘۜۥ۬ۛۙۨۙ۬ۜۘۤ۫۬ۜ۟ۚۗ۬ۢ";
                    break;
                case -2031641704:
                    str = "۫ۚۦۡۡۨۢۙۜۘ۟ۤ۠۬ۙۘۧۤ۫";
                    break;
                case -1970725056:
                    String str2 = "۠ۡۧۘۛۚۖۡۧۥۧۚۡۘۦۢۥۥۦۖۨۡۜۘۜ۬";
                    while (true) {
                        switch (str2.hashCode() ^ 1300887385) {
                            case 249022412:
                                if (!z7) {
                                    str2 = "۟۫۫۠ۖۨۘۢ۟ۥۘ۠ۤۙۜۥۗۖۥۜۘ";
                                    break;
                                } else {
                                    str2 = "ۛۤ۫۫۟ۜ۬ۛۖۘۨۛۢۜۛ۠ۤ۟۟ۗۤۙۙۚ";
                                    break;
                                }
                            case 466452320:
                                str = "۫ۨۦۦ۟ۘۘ۫ۥۥۨ۬ۦ۟ۘۤ";
                                continue;
                            case 488089251:
                                str = "ۜۧ۠ۨۨۥۘ۫ۤۦۘ۠ۨۖۦۖۚ۟ۛۘۦۨۢ۟ۚ۠۠ۥۘ";
                                continue;
                            case 2100078859:
                                str2 = "۠ۙۡۛ۫۫ۨۛۧۗۧۖۜۙۧۗۖۥۘۡۜ۬";
                                break;
                        }
                    }
                    break;
                case -1763236111:
                    str = "۫ۚۦۡۡۨۢۙۜۘ۟ۤ۠۬ۙۘۧۤ۫";
                    i3 = z6;
                    break;
                case -1728798943:
                    str = "ۜۤۜۘ۫ۡۡۘ۬ۢ۟ۖ۫ۚۥۥۘۗۤۗ";
                    f14 = f2;
                    break;
                case -1588543075:
                    str = "ۡۡۖۤۘۦۤۘۖۢ۬ۤۤۜۙۖۙۢ";
                    f6 = f2;
                    break;
                case -1509757120:
                    str = "ۥ۟ۢۨۙ۬۠ۗۡۘ۟ۨۛۨۚۧ۬ۤۗ";
                    break;
                case -1498804517:
                    String str3 = "ۡۖ۬ۨۥۡۘۦۨۤۙۚۚۢۖۨۘۡۚۧ";
                    while (true) {
                        switch (str3.hashCode() ^ -1333189033) {
                            case -1411238625:
                                if (!z7) {
                                    str3 = "۬۬ۢۨ۟ۖۘۨ۫۠ۨۢۜۘۙۛۙۢۤۗۨۡۚۧۖۤۖۜۘ";
                                    break;
                                } else {
                                    str3 = "ۥ۟ۜۗ۟ۗۥ۠ۜۘۦۦۚۤۤۖ";
                                    break;
                                }
                            case 1429421143:
                                str3 = "ۤۦ۠۫۫ۜۘۥۤ۠ۘ۟ۖۘۖۛۖ۫ۨۡۜۘ۫۟ۨۘۨۥۢ";
                                break;
                            case 1806945055:
                                str = "ۖۖۦۘۖۤۚۜۤۜۧ۟ۤۨۦۧۜۙۡۘۖ۟ۘ";
                                continue;
                            case 2022653237:
                                str = "۟۟ۙ۫ۖۨۘ۬ۗۧۢۨۡۚۦ۟ۛۜۤ";
                                continue;
                        }
                    }
                    break;
                case -1485545010:
                    str = "ۥ۟ۢۨۙ۬۠ۗۡۘ۟ۨۛۨۚۧ۬ۤۗ";
                    f11 = f10;
                    break;
                case -1452748542:
                    str = "ۛ۬ۖۘۥۛۤۖۧۨۙۘۧۘۙۢ۬ۗۚۧۨۡ۫ۘۨۨۘ";
                    f13 = f12;
                    break;
                case -1420343093:
                    str = "ۜ۟ۜۡۧۥ۬۬ۥۘۛۘۡۘۧ۟ۨۘۘۚۥۘۤۢۖ";
                    f17 = f2;
                    break;
                case -1328448269:
                    fArr[2] = f11;
                    str = "ۥۗۛۥۡۥۘۗۗ۟ۗۧۦۘۡۢۛ۟ۧۗۧۦۦۘ";
                    break;
                case -1260834967:
                    str = "ۜۤۡۚ۠ۢۦۢۡۘۘ۟ۗۤۥۖۘ";
                    f20 = f2;
                    break;
                case -1247036112:
                    z6 = false;
                    str = "ۡۖۡۘۡ۟ۤۙۢ۫ۜۗۙۚۧۨۘۛ۫ۜ";
                    break;
                case -1024240494:
                    fArr[4] = i3;
                    str = "۠ۗۘۘۙۗ۬ۘۥۘ۟۟۠۬ۛۘۚۘۧۘۧۨ";
                    break;
                case -995097127:
                    f15 = 0.0f;
                    str = "ۛۦ۟ۚ۬ۥۘۘۖۤۨۘۨ۬۬ۤ۟ۨ";
                    break;
                case -842127298:
                    z2 = this.f2613h;
                    str = "۠ۘۢ۫ۚ۬۠ۖۡۘۜ۫ۥۘۛۙۤۚۙۗۧۨۜۘۗۨۙ";
                    break;
                case -839307525:
                    str = "ۖۚۘۢۚۥ۬ۙ۫ۦۡۧۘۡ۟ۡۡۗۙۖۘۤۤ۠ۥۤۤ";
                    f19 = f18;
                    break;
                case -838641821:
                    f10 = 0.0f;
                    str = "ۤۜۘ۠ۧۦۜ۫ۥۘ۫ۙۨۘ۟۠ۨۛۗۖۘ";
                    break;
                case -805227444:
                    f18 = 0.0f;
                    str = "ۡۥۧۘۚۜۖۘ۟ۙۥۧ۬ۖۚ۠ۘ";
                    break;
                case -797922611:
                    fArr = this.f2609d;
                    str = "۠ۛۨۚۛۥۙۨۡۦۜ۟ۨۛۚۘۡۦۘۖۥ۬";
                    break;
                case -748549774:
                    str = "۬ۙۜۘۗ۠۫ۤۥۜۥۘ۫۠ۡ";
                    break;
                case -571443632:
                    z3 = this.f2614i;
                    str = "۫ۜۢۜۨۛۙۦۦۥۤۡۦۗ۠۫ۗۛۡۥۘۗۤۖۘۘۤ۫";
                    break;
                case -505667745:
                    fArr[5] = f16;
                    str = "۠ۚۦۘۨۘۚۛۖۘۢ۫ۧۙۧۧۖۨۧۦۥ۬۬ۥۖۘ";
                    break;
                case -337952868:
                    z5 = this.f2616k;
                    str = "۠۟۫۠ۨۘ۠ۘۤۖۖۜۛۡۨ۬ۧۧۢۢۘۙۜۜۘۥ۫ۧ";
                    break;
                case -216285081:
                    String str4 = "ۗۦۤۙۤۡ۬ۥۘۥ۬۫ۡۡ۟";
                    while (true) {
                        switch (str4.hashCode() ^ 1915000995) {
                            case -1900970758:
                                if (!z3) {
                                    str4 = "ۤۦۨۡۦۜۘۚۢۛۤۖ۠ۨۨۢۚ۫۠۠";
                                    break;
                                } else {
                                    str4 = "ۚۘۙۜۡ۬ۧ۬ۘۘۛۖۨ۬ۦۤۡۡۦۘۡۧۡ۟۟ۘۘۖۧۛ";
                                    break;
                                }
                            case -1794891502:
                                str = "ۘ۟ۦۘۚۘۧۦۥۨۘۙ۬ۛۥ۫۬";
                                continue;
                            case -507650516:
                                str4 = "ۧۗۨۖۚۗۘۡۥۘۗۡ۫ۘ۠۫ۚ۟ۥ";
                                break;
                            case 2080639268:
                                str = "ۛ۬ۨۘۧۧۙۧۧۖۜۖۧ۠ۜۦۘ";
                                continue;
                        }
                    }
                    break;
                case -176542160:
                    fArr[6] = f19;
                    str = "ۤۜۤۙۜۙۘۛۨۥۜۛۦ۟ۦۦۦ۫ۘۗۚۗ۫";
                    break;
                case -170322421:
                    fArr[3] = f13;
                    str = "ۗۤ۬ۘۛۢۛۛۡۡۖۢۙۚۥۘۙۥ۬۬ۜۘ۬۬ۡۧ۟ۥ";
                    break;
                case -106389797:
                    str = "ۖ۠ۜۘۢۨۚۧ۫۬۟ۛۡۘۤۨۦۘ";
                    f13 = z4;
                    break;
                case -88018816:
                    String str5 = "ۦۚۡۧۜۦۘۖۢۧۢۨۦۙۦۖ";
                    while (true) {
                        switch (str5.hashCode() ^ 365931063) {
                            case -911396391:
                                str = "ۨ۟ۘۘۚ۟ۜۘ۠۟ۤۡ۫ۢۥۗۜۙۡۢۤۧۤۖۥۧۘ";
                                continue;
                            case 144457583:
                                str = "ۛۦ۬ۧۢۜۡۦۛ۫ۡۖۘ۠ۧۨۘۤ۟ۤۛۡ۬ۨۚ۬";
                                continue;
                            case 1504446697:
                                str5 = "ۥۗ۬۬ۦۛۡۖۥۘۘۗۛۙۧۥۘۜۨ۠ۘ۬ۨ";
                                break;
                            case 1548412263:
                                if (!z5) {
                                    str5 = "ۦۦۚۤۖ۫ۡۜۛۡ۬۬ۘۗۥۘۜۖۜۘۨ۠ۢ۟ۖۛۥۡۖ";
                                    break;
                                } else {
                                    str5 = "۠ۙۡۚۜۚۡۨ۫ۚۢۤۦۢ۠ۗۥۨ";
                                    break;
                                }
                        }
                    }
                    break;
                case -41008942:
                    f7 = 0.0f;
                    str = "ۡۨۤ۟ۛۘۘۦۡ۟ۥۗۥۘۙۧۦۘۚۘ۫ۘۥۨۘۜ۫ۘۘۖۥ۫";
                    break;
                case 50467639:
                    str = "ۗ۬ۡۘۨۚ۫ۦۖۘۛۥۡۚۡۥۘۤۦ۫۟ۚ۬ۘۢۢ";
                    f16 = f14;
                    break;
                case 109840412:
                    str = "۬ۛۤ۫ۛۦۘۗۤۧۦۛۨۘۦۤۗۡۜۘۙ۟۫ۚۚ۠۬ۖۖ";
                    break;
                case 114359755:
                    String str6 = "۫۫ۜۘۥۘۙ۬ۗۧۡۙۜۘۢۖۘۛۚۖۘۧۦۡۘ";
                    while (true) {
                        switch (str6.hashCode() ^ -1733391249) {
                            case -1442739906:
                                str6 = "ۘۛ۫ۜۡۚۖ۫ۙۤۤۚۖ۬ۙۚۗۧۚۧۘۘۗۛۦ";
                                break;
                            case -41640717:
                                str = "ۖۙۚۘۦۘ۫ۡۧۘۥ۠ۖۘۗۦۚۗۘۘۘۙ۟ۦ";
                                continue;
                            case 677423098:
                                if (!z3) {
                                    str6 = "۠ۗۘۛۥۨۘ۟ۙۤۦۧۘۘۡ۫ۨۤۛۘۗۢۦۘ۬ۨۨۘ";
                                    break;
                                } else {
                                    str6 = "ۗۖۚ۬ۖۗ۬ۤۧۦۙۡۖ۟ۡۘ";
                                    break;
                                }
                            case 1979983332:
                                str = "ۢ۬ۗۢۙۨۗۖۢۛۥۗۥۤۜۦۙ";
                                continue;
                        }
                    }
                    break;
                case 226603970:
                    fArr[1] = f8;
                    str = "ۙ۟ۡ۫ۚۖۘۡۚ۬ۙ۫ۛۢۙۜۘۖۥۗۚۖۥۘۘ۬ۛۢ۠ۛ";
                    break;
                case 422351868:
                    fArr[7] = f20;
                    str = "۬۟ۨۢۦۥۘۨۦۜۘۦۦۖۦ۬ۦۨۘۘ";
                    break;
                case 422650005:
                    str = "۬ۘۙۛۤ۫ۡۥ۠ۢۗۥۡۤۙۗۛۥ";
                    break;
                case 478856218:
                    str = "ۢۘۖۘۗۦ۫۠ۨۙۛ۬ۢۘۛۢۢۜۛۥۤۘۘ";
                    f8 = f6;
                    break;
                case 547742989:
                    str = "ۗۛۧۡۨۘۘۢۜۛۦۨۨۘۘۧۥۘۚۜۡ";
                    f5 = f3;
                    break;
                case 552496451:
                    f4 = 0.0f;
                    str = "ۗۘۥ۠ۛۥۘ۠ۦۦۥۤۚۡۥۢۥۦ۠";
                    break;
                case 661167248:
                    return fArr;
                case 681804938:
                    str = "۬ۙۜۘۗ۠۫ۤۥۜۥۘ۫۠ۡ";
                    f16 = f15;
                    break;
                case 683459680:
                    str = "ۢ۟ۢۨۥ۬۟ۧۛۘۧۢۢۧۙ۠ۦۘ";
                    f11 = f9;
                    break;
                case 685568724:
                    String str7 = "۟ۥۧۘۢۜ۫ۧۤۥۘۚ۬ۛۙ۟۟ۨ۟ۧ۟ۥۖۘۚ۠ۚۖۘۦۘ";
                    while (true) {
                        switch (str7.hashCode() ^ -1238262595) {
                            case -1402367467:
                                str = "۟۫ۘۘۨۢۨۘۙۨۨۖۛۚ۬ۙۨۡ۠ۢ";
                                continue;
                            case 318044503:
                                if (!z2) {
                                    str7 = "ۢۜۘۘۡۙۨۖۚۛۢ۫ۜۘ۟۟ۖۘ";
                                    break;
                                } else {
                                    str7 = "ۚۦۘ۠ۚۨۤۖۨ۬ۢۜۦۘۖ۟ۧۨ";
                                    break;
                                }
                            case 1894333150:
                                str = "۟۠ۜ۟۠ۥۦ۬ۙ۠ۦۜۘۙۘۘۘۘۨۡۢۙۘۘۤۜ";
                                continue;
                            case 1930045395:
                                str7 = "ۥۛۡۘ۟ۧ۠ۢۧۨۥۨۥۘۚۖۧۘۗۙۛ۠ۧۜۘۤۨۨ";
                                break;
                        }
                    }
                    break;
                case 802969133:
                    str = "ۖ۠ۜۘۢۨۚۧ۫۬۟ۛۡۘۤۨۦۘ";
                    break;
                case 873487398:
                    str = "۬ۛۤ۫ۛۦۘۗۤۧۦۛۨۘۦۤۗۡۜۘۙ۟۫ۚۚ۠۬ۖۖ";
                    f5 = f4;
                    break;
                case 914506625:
                    fArr[0] = f5;
                    str = "۫۫ۗۙۡۛۛۦۜۘۖ۟۠ۜۡ۫ۤۛۚۧۦ۬";
                    break;
                case 1012855269:
                    String str8 = "ۥۘۨۚ۬ۢۥۘۤۖۜۘۘۡۗۥۘۘ۬ۘۤۖۡۦ۫";
                    while (true) {
                        switch (str8.hashCode() ^ -1259179751) {
                            case -468590276:
                                str = "ۜۦۜۘ۫ۤ۟ۡ۫ۧۦۧۙۥ۟ۚۥۖ۟ۛۤۙ۟ۦۡۘ۫ۨ۫";
                                continue;
                            case 848485197:
                                str = "ۡۨۧۘۜۨۧۜۢۚۜۤۥۘ۟ۧۖ۠ۜۡۨ۬ۤۤ۟۟ۦۤۖ";
                                continue;
                            case 971051052:
                                if (!z5) {
                                    str8 = "ۢۦۧۘۖۚ۫ۡۘ۫ۢۚۜۧۧ۠ۗۤۤۘۥۙۛ۬ۘ";
                                    break;
                                } else {
                                    str8 = "ۛ۫۬ۘۡۧۘ۠ۛۖ۠ۜۘۧ۠ۖۚ۟۠";
                                    break;
                                }
                            case 1284173452:
                                str8 = "ۗۡۦۘۚۡۦۘۤۨۦۨۡۥۘۙۡۖ۠۫ۘ۟ۡۢۧۨۜۘ";
                                break;
                        }
                    }
                    break;
                case 1155984597:
                    str = "ۚۤۥۘۚ۟ۗۙۤۦ۠۠ۖ۟ۦۙ۬۟ۨۘ";
                    f3 = f2;
                    break;
                case 1319185215:
                    String str9 = "ۢۢۚۡۢۡۜۢۦۤۛ۬ۦۧۦ";
                    while (true) {
                        switch (str9.hashCode() ^ -1073501598) {
                            case -1170664504:
                                if (!z2) {
                                    str9 = "۠۫ۧۢۤۦۘۘۜۘ۬ۚۘۡۜ۟";
                                    break;
                                } else {
                                    str9 = "ۧ۬۠ۧۚ۟ۧۛۙۘۡۘ۬ۘۥۘ";
                                    break;
                                }
                            case -630175455:
                                str = "ۢۨۥۡ۬ۖۢۨۧۘۥۦۜ۬ۗۥۜۙۜ";
                                continue;
                            case 732526744:
                                str9 = "۫ۚ۬ۛۨ۠ۦۥ۠ۡۚۙ۫ۡۜۘۜۦۦۘ";
                                break;
                            case 1206229308:
                                str = "ۧۗۡۘۖۜۢۘۡ۬ۜۘۙۢ۫ۥۘ";
                                continue;
                        }
                    }
                    break;
                case 1462282588:
                    str = "۬ۘۙۛۤ۫ۡۥ۠ۢۗۥۡۤۙۗۛۥ";
                    f20 = z8;
                    break;
                case 1479989614:
                    str = "ۤۜ۟ۗ۬ۥۛۛۘۘ۟ۘ۫ۘۥۢۚۙۡ";
                    i2 = f2;
                    break;
                case 1524989630:
                    str = "ۡۜۤۖ۟ۨ۟ۜۧۗۥۜۘۤۦۥۘۛۙ۟۟ۨۧ۬ۤۦۘۤۥ۫";
                    i3 = i2;
                    break;
                case 1530078965:
                    str = "ۙۖۦۘۡۦۛۦۡۚۘۧۚۜۡۡۘ۟ۘۖۘ";
                    f12 = f2;
                    break;
                case 1622916241:
                    str = "ۦۦۘۘۗۘۖۜۙۡ۫ۦۨۦۢۥۘۤۤۘۥۙۧۚۗۜ";
                    break;
                case 1709244838:
                    str = "ۥۘۨۘۥۢ۬ۤۦۜۘۛۦۤۨۥۘۡ۟ۛ۬ۖۘۘۥۡۦۘ";
                    f19 = f17;
                    break;
                case 1813479578:
                    z8 = false;
                    str = "ۜۙۦۘۡ۠۠ۨۥۜ۫ۥۖۚۡۜۘۧۨۛ۫ۚ۠۠ۧ۟ۖ۫ۘ";
                    break;
                case 1868531963:
                    str = "ۙۚۦ۠ۛۙۙۗۗۦۡۜۜۘۧ";
                    f8 = f7;
                    break;
                case 1956724749:
                    str = "ۙۚۦ۠ۛۙۙۗۗۦۡۜۜۘۧ";
                    break;
                case 1962904735:
                    str = "ۧ۟ۜ۬ۜۦۧۖۘۧۛۖۘۘۛۛۦۙۧۚۚ۟";
                    break;
                case 2042360641:
                    str = "ۖۚۘۢۚۥ۬ۙ۫ۦۡۧۘۡ۟ۡۡۗۙۖۘۤۤ۠ۥۤۤ";
                    break;
                case 2081541333:
                    z4 = false;
                    str = "ۙ۬ۥ۬ۡۧ۟ۦۖۨ۠۬ۜۘۥۘ۠۫ۥۙۖۨۘ";
                    break;
            }
        }
    }

    public final void c() {
        Paint paint = null;
        String str = "ۦۤۦ۠ۛۜۦ۫ۡۚۦۙۚۜۘ";
        while (true) {
            switch ((str.hashCode() ^ 106) ^ -489827959) {
                case -1711116248:
                    this.f2619n = 0.0f;
                    str = "ۨۖۧۤۖۜۘۙۜۦۘۦۛۜۘۨۦۦۚۜۘۘۢۡۡ";
                    break;
                case -1622690602:
                    paint = this.f2607b;
                    str = "۟۠ۢۥۤۤۘۨۦۥۜۜۛ۟ۗ۟ۧۖۘ۫ۖۥۨ۟ۖۤ۟ۦ";
                    break;
                case -1555212157:
                    this.f2615j = true;
                    str = "ۤۦۨۘۧۢۜۘۚ۠ۦ۟ۦۥۚۥۤۥۛۤۖۛۦۘۙۡۘۘۜۡ۟";
                    break;
                case -1472789149:
                    this.f2611f = utils.dpToPx(22.0f);
                    str = "ۗۥۖۘۚۤۖۤۛۜۦ۟ۥۘۗۙۡۘۦ۟ۘۘ";
                    break;
                case -1374825521:
                    str = "ۛۜۘۦۗۖۘۨۦ۬۠۠ۗۤۘۧۘ۠ۤۛۨۡۖ";
                    break;
                case -1249384122:
                case 1495825711:
                    return;
                case -1191896867:
                    String str2 = "ۖ۬ۗۧۤ۬۬ۧۜ۟ۚۤۙۖۚۥۘۦۘۚ۟ۜۘۗۗۥۘۜۢۦۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 357277069) {
                            case -825532758:
                                str2 = "ۜۘ۟ۡۚۦۦۥۨۘ۟ۡۡۘۢۖۨۘۢۚۡۚ۬ۛۗۧۧ";
                                break;
                            case -140805748:
                                str = "۠ۥۨۘۚۡۢۚۦۗۜۗۖۢ۬ۢۛۛۖۘ۬ۖ۠ۖۦۥۖۨۡۘ";
                                continue;
                            case 832383572:
                                str = "ۜۢۖۘۦۨۗۘۨۘۘ۬ۢۜۤۨۡۨۛۧ";
                                continue;
                            case 865575285:
                                if (!isInEditMode()) {
                                    str2 = "ۧۡۡۧۧۦۚۙۧ۟ۨۧۘۛۛۤۤۤۚ";
                                    break;
                                } else {
                                    str2 = "ۡۜۡۘ۫ۗۧۤۥۙۨۚ۟۟ۛۦۧۜۤۖۛ۬ۦۧۘۘۚۚۖۘ";
                                    break;
                                }
                        }
                    }
                    break;
                case -1037156924:
                    this.f2612g = false;
                    str = "ۛۘۧۖ۠ۘۘۨۨۙۧۡۜۧ۬";
                    break;
                case -586394270:
                    this.f2617l = 0;
                    str = "ۢۦۘۢۧ۟ۙۤۤ۬ۙۛۤۗۗۧ۬ۧ۫ۨۥ";
                    break;
                case -446024194:
                    setBackground();
                    str = "۟ۗ۟ۘ۬ۧ۬۫ۘۛۛ۠ۡۢ";
                    break;
                case -354122207:
                    paint.setStyle(Paint.Style.STROKE);
                    str = "ۖۗۖ۠ۨۥۘۛۚۥ۟ۙ۫۫۟۫ۧۤ۟۟ۢۨ";
                    break;
                case 765678607:
                    paint.setColor(this.f2618m);
                    str = "ۘۖ۠۫۠ۦۜۚ۬ۗۗۡۘۚۖ۫ۥۖۖ۫ۤ۫ۨ";
                    break;
                case 1117220108:
                    this.f2618m = 1180787041;
                    str = "ۘۛۖ۟۠ۛ۫ۡۧۘ۬ۦ۫ۨۧۘ۬ۛۥۢۗ۠";
                    break;
                case 1389750529:
                    this.f2613h = true;
                    str = "ۡ۠ۢۛ۠ۖۙۤ۬۟ۘ۬ۙۡۧۘۤۡۚۖۨ۟ۢۖۧۘ";
                    break;
                case 1444143757:
                    this.f2614i = true;
                    str = "ۧۧۜۘۘۚۨۘۚ۫ۛ۫۫۫ۨۤۖۦۦۨۤۥۥۘۡۨۘ";
                    break;
                case 1514397311:
                    paint.setAntiAlias(true);
                    str = "ۨۗۤ۟۬ۘۥۙۡۘ۫ۧۗۢۢۛۨۤۖۥ۫ۢۗۡۡ۠";
                    break;
                case 1847193564:
                    paint.setStrokeWidth((float) (this.f2617l * 2));
                    str = "ۨۘۘۘۘ۟ۧۡۙۨۧۨۗۥۧۥۨ۠ۢ";
                    break;
                case 1941672215:
                    this.f2620o.setCornerRadii(b((float) this.f2611f));
                    str = "ۢۚ۬ۗ۬ۤۗ۫ۢ۠ۚۗۘۡۘۤۤۘۘ";
                    break;
                case 2059336028:
                    this.f2616k = true;
                    str = "ۨۗۥۤۜۚ۫ۙۘۥۡۜۤۜ۫ۖۦۘۘ";
                    break;
                case 2093789222:
                    setRoundingElevation(0.0f);
                    str = "ۤ۠۠ۦۥۦۛۦ۬ۘۥ۠ۜۨ۠ۢ۠۟ۧۨۘ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        r0 = "ۜۢ۟۫ۘۜۘۗۛۜۘۨۤۥ۠ۡۦۘ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r6) {
        /*
            r5 = this;
            r1 = 0
            java.lang.String r0 = "ۡۛ۬ۨۖۥۘۢۚ۠ۘۖۘۘۨ۫ۥۤۚۥ۠ۜۛۘۛۛۛۤ۠"
        L_0x0003:
            int r2 = r0.hashCode()
            r3 = 743(0x2e7, float:1.041E-42)
            r4 = -1628282914(0xffffffff9ef25fde, float:-2.5662396E-20)
            r2 = r2 ^ r3
            r2 = r2 ^ r4
            switch(r2) {
                case -1982760797: goto L_0x0070;
                case -1234529658: goto L_0x0023;
                case -672473698: goto L_0x0068;
                case 381393056: goto L_0x0018;
                case 596903015: goto L_0x0012;
                case 947393729: goto L_0x004a;
                case 952368150: goto L_0x0015;
                case 1011243548: goto L_0x0029;
                case 2012039257: goto L_0x001d;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x0003
        L_0x0012:
            java.lang.String r0 = "ۜۢۛۙۧۦۘۧ۟۫ۖۚ۠ۜۗۨ"
            goto L_0x0003
        L_0x0015:
            java.lang.String r0 = "۠ۧۥۘۖ۠ۛۘۥۧۗۨۘۘۢۤ۟۫ۡ۬ۙۛ۬ۦۖۦ"
            goto L_0x0003
        L_0x0018:
            android.graphics.Path r1 = r5.f2606a
            java.lang.String r0 = "ۛۢۢ۟ۖۘۡۛۖۦۦۘۘۗۚۨۘ۟ۥۖۡۨۤۛۥۚ۟ۧۢ"
            goto L_0x0003
        L_0x001d:
            r6.clipPath(r1)
            java.lang.String r0 = "۠ۘۧۘۢۚۘۗۛۨۘۧۘۖۘۖۙۖۛ۟ۢۗۘۘۚ۫"
            goto L_0x0003
        L_0x0023:
            super.draw(r6)
            java.lang.String r0 = "ۛۚۜ۫ۖۢۡۖۧۙۡۘ۠ۗۚۡۛ"
            goto L_0x0003
        L_0x0029:
            r2 = 1251351315(0x4a961b13, float:4918665.5)
            java.lang.String r0 = "ۤۙۚۧۚۨۘۧۛۦۘ۟ۥۗۥ۟ۦۧ۫ۦۦۢۨۘ"
        L_0x002e:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1348105898: goto L_0x003d;
                case -1073788806: goto L_0x0044;
                case 303784975: goto L_0x0037;
                case 1505819744: goto L_0x0047;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x002e
        L_0x0037:
            java.lang.String r0 = "ۜۢ۟۫ۘۜۘۗۛۜۘۨۤۥ۠ۡۦۘ"
            goto L_0x0003
        L_0x003a:
            java.lang.String r0 = "ۧۤۘۙ۠ۥۘۚ۠ۦۘۧۚۧۜۜۘۧۖ۠ۥ۬ۖۚۥۖ"
            goto L_0x002e
        L_0x003d:
            int r0 = r5.f2617l
            if (r0 <= 0) goto L_0x003a
            java.lang.String r0 = "۟ۖۥۗۘۦۗۡ۫ۡۚۥۘۘۢ۠ۖۦ۬ۛۧ۬ۤۧۖۘ"
            goto L_0x002e
        L_0x0044:
            java.lang.String r0 = "ۖ۠ۚۚۧۖۘۘۦۙۖ۟۬ۗ۫ۘۗۖۘۧۢۚ"
            goto L_0x002e
        L_0x0047:
            java.lang.String r0 = "ۨۧۖۤۗۨۢۨۡ۫ۨۜۘۧ۫۠ۗۦۢۢۤ۠ۤۗ۬۫ۤۡۘ"
            goto L_0x0003
        L_0x004a:
            r2 = -126936677(0xfffffffff86f199b, float:-1.9398098E34)
            java.lang.String r0 = "ۚۦۦۢۘۢ۟ۦۨۛۙۜۘۡۦۥۙۜۜۘۚ۟ۖۘۧۚۖۢۧۜ"
        L_0x004f:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -911360870: goto L_0x0058;
                case 774383908: goto L_0x0037;
                case 1932113194: goto L_0x005e;
                case 1949991020: goto L_0x0065;
                default: goto L_0x0057;
            }
        L_0x0057:
            goto L_0x004f
        L_0x0058:
            java.lang.String r0 = "ۙۛۡۤۨ۬۠۬ۚۗۘ۠ۥۛۧ"
            goto L_0x004f
        L_0x005b:
            java.lang.String r0 = "۠ۥۙۤۖۡۘ۬ۗ۠ۦ۫ۘۘۤۙۦۘ۟ۖۦۘۥۙ۠"
            goto L_0x004f
        L_0x005e:
            int r0 = r5.f2618m
            if (r0 == 0) goto L_0x005b
            java.lang.String r0 = "ۢۜۥۘ۫۟ۦۘۡۨۘۨۘۡۘ۬ۥۜۢۗۜ۫ۜۛ"
            goto L_0x004f
        L_0x0065:
            java.lang.String r0 = "ۘۥۢ۟ۛۘۗ۬ۡۘۛۖۥۘ۠ۨۦۘۖۖۜۘ۫ۛۧۦۛۧۨۛ۬"
            goto L_0x0003
        L_0x0068:
            android.graphics.Paint r0 = r5.f2607b
            r6.drawPath(r1, r0)
            java.lang.String r0 = "ۜۢ۟۫ۘۜۘۗۛۜۘۨۤۥ۠ۡۦۘ"
            goto L_0x0003
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.whatsapp.rounded.RoundedLayoutLinearToolbar.draw(android.graphics.Canvas):void");
    }

    public int getRoundedCornerRadius() {
        String str = "ۚۘۡۚۚۙۤۜ۟ۗۘ۠ۜۗۜۘ";
        while (true) {
            switch ((str.hashCode() ^ 175) ^ 2107098541) {
                case -514293145:
                    str = "ۚۨۛ۬ۖ۠ۙۜۚۛ۬۟ۙۙۚۙۢۢۤۧۛۡۖۘ۠ۚ۟";
                    break;
                case -504228359:
                    return this.f2611f;
            }
        }
    }

    public int getRoundingBorderColor() {
        String str = "ۤۦۘۚۘۘۗۡۙۤۖۧۥۦۙۨۡۚۤ۫ۚ";
        while (true) {
            switch ((str.hashCode() ^ 840) ^ 426341347) {
                case -1622924294:
                    return this.f2618m;
                case -1160896597:
                    str = "ۥ۫ۖۘۦۢۘۦۤ۫ۛۥۗۚۖۡ";
                    break;
            }
        }
    }

    public int getRoundingBorderWidth() {
        String str = "ۨۗ۫۟ۜۘۖ۠ۨ۟۫ۗۗۙۚۖ۬ۨۘۛۗ۫ۚۤۤ";
        while (true) {
            switch ((str.hashCode() ^ 763) ^ -51907551) {
                case 1433971062:
                    return this.f2617l;
                case 1436323911:
                    str = "ۙۥۢۛ۬ۥۘۛۢ۠ۙۡۦۛۨۖۖ۬ۡ۟ۚۨۘ";
                    break;
            }
        }
    }

    public float getRoundingElevation() {
        String str = "ۤۖۨۢۛۧۦۙ۟ۘۡۜۨۗۢ";
        while (true) {
            switch ((str.hashCode() ^ 52) ^ 1409008823) {
                case -1528519339:
                    return this.f2619n;
                case -1127029833:
                    str = "ۧۥ۫۟ۢۦۡ۬ۗۦۤۧۜ۫ۛ۬۬ۜۘۧۡۖۘۥ۠ۚۨ۠ۨۘ";
                    break;
            }
        }
    }

    public boolean isRoundAsCircle() {
        String str = "ۦۢ۠ۜۦۘۘۗۧۧۢۦ۟ۘۘۤۥۜ۫";
        while (true) {
            switch ((str.hashCode() ^ 564) ^ 2028410690) {
                case -539260620:
                    str = "ۤۦۘۘ۬ۥۧۗۗۧۧۚۥۘ۫ۨۖۧۡۨۘ۬ۛۢۘۚ۠";
                    break;
                case 1735985339:
                    return this.f2612g;
            }
        }
    }

    public boolean isRoundBottomLeft() {
        String str = "۠ۖۖۘۘ۬ۘۘۦۤۡ۬۬ۘۘۖۤۘۡ۬ۘۛ۬ۗۛ۟";
        while (true) {
            switch ((str.hashCode() ^ 787) ^ -884822454) {
                case 566782089:
                    str = "۠ۤۘۜۥۨ۟ۗۤ۠ۘۙۖۛ۬ۦۙۧۙۧۦۘۗۧۗ۠ۛۦۘ";
                    break;
                case 1548401662:
                    return this.f2615j;
            }
        }
    }

    public boolean isRoundBottomRight() {
        String str = "۬ۧۘۘ۠ۧ۬۠ۦۜ۫ۖۘۘۢ۠ۢۨۛ۬ۧۜۘۙ۠";
        while (true) {
            switch ((str.hashCode() ^ 866) ^ 1685455991) {
                case -81625461:
                    str = "۟ۚۡۥۖۖۘ۬۬۬ۚۛۨ۠ۗۨۘ۬ۥۗ";
                    break;
                case 1378630134:
                    return this.f2616k;
            }
        }
    }

    public boolean isRoundTopLeft() {
        String str = "ۛۚۖۛ۬ۦۡۙۥۢۢۚ۟ۜ۬ۖۡۦۨۜۘۙۡۖۖۖۧ";
        while (true) {
            switch ((str.hashCode() ^ 886) ^ -1944216423) {
                case -1380665815:
                    str = "ۛۛۖ۫ۙ۟۟ۗۙ۫ۗۖۘۚۗۜۖۥۗ۬ۨۘ";
                    break;
                case 1454835120:
                    return this.f2613h;
            }
        }
    }

    public boolean isRoundTopRight() {
        String str = "ۨۧۤۜۤۜۤۢۡۘۨ۬ۘۙۖۚ۠ۙۖ۫۬ۛ";
        while (true) {
            switch ((str.hashCode() ^ 287) ^ -14455118) {
                case 34274279:
                    str = "ۛۛۖۘۙۧۧ۬ۡۢۢۖۧۡۢۜۢۜۤۗ۬ۚ۠ۚ۠ۖۙۢ";
                    break;
                case 269073215:
                    return this.f2614i;
            }
        }
    }

    public void onAttachedToWindow() {
        String str = "۬ۡۦۘ۟ۘۚ۫ۜۧۘۖۛۜۘۨۜۜۘۨۦۦ";
        while (true) {
            switch ((str.hashCode() ^ 427) ^ 123927222) {
                case -1186478131:
                    return;
                case 870003398:
                    str = "ۡۜۢ۫ۥۥۘۥۗۖۘ۬ۖۘ۫۠ۗۧۧۚۘ۟ۤ";
                    break;
                case 999156456:
                    this.f2610e = false;
                    str = "ۜ۬۟ۚۘۘۘۦۢۦۨۜۢۦۘۙۧۡ";
                    break;
                case 1772852226:
                    super.onAttachedToWindow();
                    str = "ۚۚۜۜ۬ۨۖۛۗۖ۟۫ۤۨۘۨۧۡۘۥۙۧ";
                    break;
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        AppBarLayout appBarLayout = null;
        String str = "ۘۗۨۘ۠ۚۧۗۗۜۘۗ۠ۜ۠ۧ۟ۥۗۛۛۦ";
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            switch ((str.hashCode() ^ 106) ^ -1863991055) {
                case -2039350727:
                    String str2 = "۠۠ۦۘۙۜۘۥۜۧۘۥۗۜ۠۫ۨۘۗۙۜۘۨۢۡۘ۟ۡۙ";
                    while (true) {
                        switch (str2.hashCode() ^ -1333356788) {
                            case -1757663383:
                                str = "ۥ۠ۢۙۡۤۙ۠ۘۜۜۨۡۨۖۦ۠";
                                continue;
                            case -826077438:
                                if (appBarLayout == null) {
                                    str2 = "ۙۗۧ۫۠ۥۘۚۨۜۘۙۜۧۥۙۢ";
                                    break;
                                } else {
                                    str2 = "۟ۧۗۛۖۙۛ۬ۚۡۧۦۜۢۥۘ۟ۘ۬ۛ۠ۢۡ۟ۡۘ";
                                    break;
                                }
                            case -398377166:
                                str2 = "ۡۥۖۘۤ۠ۦۗۘۘ۫ۖۡۖۦۖۘۨۡۖۙ۫ۨۖۧۧ";
                                break;
                            case 1085589380:
                                str = "ۨۙۖۜۨۘۗۗۡ۟ۘۢۚۗۡۘ۫ۛۘۘۧ۬ۖۘۡ۬ۥۘۥۘۘۘ";
                                continue;
                        }
                    }
                    break;
                case -1988818874:
                    this.f2610e = false;
                    str = "ۦۨۘۘۥۙۥۘۖ۟ۧۦۧۤۡۗۨۘۚۖۥۤۛ۠ۥۥ";
                    break;
                case -1941651382:
                    str = "ۚۧ۟۠ۥۡۘۖۛۥۘۘۧۡۘۗۥ۬ۜۜۛ";
                    break;
                case -1868151754:
                    str = "ۚ۫ۢۢۖۘۛۢۤۚۦۦۨۙۛۤۜ۫";
                    break;
                case -1716310276:
                    String str3 = "ۘۧۖۘۥۗۧۢ۫۠ۢۘۥ۫ۚۜۘۦۘۚ۟ۘۛۙۢۦۤۖ";
                    while (true) {
                        switch (str3.hashCode() ^ 1595768507) {
                            case -2025550862:
                                str = "۟ۙۦۘ۫۠ۧۡۦۢۢۡۖۘۖ۫ۡۘۧۘ۟ۨۘۚۡۖ۬ۢۘۘ";
                                continue;
                            case 230842709:
                                if (getVisibility() != 0) {
                                    str3 = "۬ۥۜۥۤۨ۬ۢۛۡۡۥۚۡۘۡ۟";
                                    break;
                                } else {
                                    str3 = "ۚۦۡۢۥ۠ۤ۟ۗۙۜۘۖۡۚ۠ۜۧۘ";
                                    break;
                                }
                            case 1097148998:
                                str = "ۡۦ۟ۡۗۥۧۖۛۤۛۥۦۙۨۢۖۦۥۙۧ";
                                continue;
                            case 1855531328:
                                str3 = "ۡۢۡۨۘۧۘ۟ۤۡۨۦۚ۠۫ۖ۟ۚۦۘۘۡۦۘۤۚۥ";
                                break;
                        }
                    }
                    break;
                case -1706731141:
                    str = "ۤۗ۬ۘۥۗۜۖۨۘ۫۬ۢ۬ۤۤۘ۫ۘۚۡ";
                    break;
                case -1676901840:
                    z3 = true;
                    str = "۬۫ۜۢۖۥۘۖۙۚۖۦۜۘۜۤ۫ۚۙۢ";
                    break;
                case -1466772368:
                    str = "ۢۖ۬۟ۖۘ۬ۡۗۤۜۗۙ۫۫ۙۤۢۥۤۨۘ۟ۚۙۥ۠۫";
                    f3 = 0.0f;
                    break;
                case -1190207899:
                    str = "ۨۦۧۢۛۧۨۤۨۘۛۢۦ۟ۚۚ";
                    f2 = f5;
                    break;
                case -975251358:
                    str = "ۜۨۘۘ۟ۥ۫ۧۡۖۘۙۤ۫۟ۘۦ";
                    break;
                case -943853041:
                    requestLayout();
                    str = "۟ۙۦۘ۫۠ۧۡۦۢۢۡۖۘۖ۫ۡۘۧۘ۟ۨۘۚۡۖ۬ۢۘۘ";
                    break;
                case -921007876:
                    str = "ۦۛۜۘۤۢۜ۟۫ۡۘۙۙۧۘ۫ۖۖۜۘۧۧ۠۬۠ۤ";
                    f5 = 1.0f;
                    break;
                case -700864218:
                    String str4 = "۠ۤۛۗۦۥۘۜۡۘۘۚ۠ۖۘۘ۬ۙۢۨۖۥۡۤۜۨۧۘ";
                    while (true) {
                        switch (str4.hashCode() ^ -1128688506) {
                            case 696529069:
                                str = "ۗۙۡۦۥۛۘۢۦۘۡ۠ۘۘۦۗۨۖۥۘۥۧۨۙۚۙۧۢۤ";
                                continue;
                            case 804698598:
                                str = "ۚۙۡ۬ۦۖۙۨۘۜۤۡۨۗۗ";
                                continue;
                            case 891041074:
                                if (!z2) {
                                    str4 = "ۥۦۢۖۧۛ۫ۥ۫۫ۛۨۘ۬ۛۘۘۢۘ۠ۥۙۖۘۖۛۙ";
                                    break;
                                } else {
                                    str4 = "ۢ۠۟ۜ۫۫ۧۥۘۘ۟ۗ۟ۧۡۘۜۖ۬ۡۡۜۘ۠ۛۜ";
                                    break;
                                }
                            case 1890028517:
                                str4 = "ۡۡۜۡۘۦۘۘۦۙ۟ۘۥ۟ۨۧ۠۟ۖۘ۠ۧۘۘ";
                                break;
                        }
                    }
                    break;
                case -651006591:
                    str = "ۢ۬۟ۤۢۜۘ۬ۙۨۖۘۥۦ۠ۘۘۜۡ۟";
                    f4 = 1.0f;
                    break;
                case -579969696:
                    str = "ۙ۬ۛ۠ۘۚۢۤۨۘۨ۟ۥۘۤۨۛۜۚۙۡۥۖۜۧۨۘ";
                    break;
                case -307757720:
                    super.onConfigurationChanged(configuration);
                    str = "ۢۗۜ۫۬ۡۗ۟۬ۢۛۜۘ۬ۙۜۛۥۨۘۤۙۥ";
                    break;
                case -274392101:
                    str = "ۤۥۨۧۜۧۘۚۘۥۡ۫ۙۢۗۤ۫ۨۦۘۥۧۜۚ۠۫ۖۙۢ";
                    break;
                case -148672195:
                    str = "ۜۨۘۘ۟ۥ۫ۧۡۖۘۙۤ۫۟ۘۦ";
                    z2 = false;
                    break;
                case -120198000:
                    appBarLayout.setExpanded(!z2);
                    str = "ۜۧۜۘۥۢۦ۫ۚۨۘ۬ۘۥۥ۫ۜ۫۟ۦۘ۫ۦۛ۬ۗ";
                    break;
                case 120972482:
                    str = "ۚۧ۟۠ۥۡۘۖۛۥۘۘۧۡۘۗۥ۬ۜۜۛ";
                    f2 = 0.0f;
                    break;
                case 155038542:
                    str = "۬ۖۡۘ۟ۘۧۘۙۧۡۧۥ۠ۤۨۘۨۗۨ۟ۘۘ۫ۦ";
                    break;
                case 314801906:
                    HomeUI.handleToolbarTitleVisibility(f2);
                    str = "ۥ۠ۢۙۡۤۙ۠ۘۜۜۨۡۨۖۦ۠";
                    break;
                case 404437438:
                    HomeUI.handleAlphaOnTitle(f3);
                    str = "ۘۢ۫ۧ۬۬ۜۡۨۘۘۧۧ۫ۙۦۘ";
                    break;
                case 706683144:
                    String str5 = "۫ۥۘۖ۫ۘۥۜۛ۫ۘۧۡ۫ۙۦ۠ۨۗ۠۟ۥۤۧۜۢۢ";
                    while (true) {
                        switch (str5.hashCode() ^ -1363055557) {
                            case -298082622:
                                str = "۠ۥۤۘ۫۬ۤ۟۫ۘۙ۟ۨ۟ۨۜۢۚ";
                                continue;
                            case 67133572:
                                str = "ۡۦۜۘۖ۟ۘۥۥۥۖ۟۟ۘۙۗ۟ۢۚ";
                                continue;
                            case 484758219:
                                if (configuration.orientation != 2) {
                                    str5 = "۬۬ۖۧ۟۬۠ۨۘ۬ۧۦۘۖۥۧۘ۬ۦۨۘۡۦۛ۠۬ۘ";
                                    break;
                                } else {
                                    str5 = "ۤ۟ۦۘ۫ۙ۠ۜۚۧ۟ۘۘۛۙۜ۫ۢ";
                                    break;
                                }
                            case 1803202977:
                                str5 = "۫ۜ۠ۦۧۤۛۥۨۘ۫ۢۙۙۨۘۘۙۖۜۘۛۨۨۘ";
                                break;
                        }
                    }
                    break;
                case 858158500:
                    str = "ۛۤۨۗۧۚۚۙۦۘۨۘۥۜۛۚۦ۟ۦۘۗۖۚۥۗۙ";
                    z2 = z3;
                    break;
                case 892849453:
                    String str6 = "۬ۦ۟ۤۜۖۘۤۨۡۘۖۨ۟ۧۥۥۘۥۡۧ";
                    while (true) {
                        switch (str6.hashCode() ^ -1900010659) {
                            case -940846796:
                                str = "۠ۥۥ۠ۢ۟ۛۧۡۡۜۡۘۛۧ۬ۘۜۧۘۡۖۘۘ";
                                continue;
                            case -480669414:
                                if (!z2) {
                                    str6 = "ۖ۬ۤۡ۬ۧۖۡۧۦۛۗۛۥۧ";
                                    break;
                                } else {
                                    str6 = "ۜۚ۫ۤۤۡۙۜۤۤۗۖۘۘۛ۬ۦ۠ۖۗ۬۟۬ۡۘۖ۬ۡ";
                                    break;
                                }
                            case -292923584:
                                str6 = "ۥۦۢۗ۫ۖۘۦۙ۟ۨۢۦۦۨۘۢۜۘۧۤۚۛۧۚ";
                                break;
                            case 2004898989:
                                str = "ۤۙ۫ۢۦۨۜۧۨۛۙۖۥۡۨۧۖ۬";
                                continue;
                        }
                    }
                    break;
                case 993498736:
                    return;
                case 1191921202:
                    str = "ۡ۟ۖۡۦۛۜۚۜۚۗ۬ۗۖ۟ۘۘ۫ۦۤ۫";
                    f3 = f4;
                    break;
                case 1396683364:
                    str = "ۧۘۢۤۨۧۤ۬ۨۘۡۧۖۘۦۡۡۗ۫ۛ";
                    appBarLayout = (AppBarLayout) getRootView().findViewById(yo.getID("main_appbar", "id"));
                    break;
                case 1625888904:
                    str = "ۢۖ۬۟ۖۘ۬ۡۗۤۜۗۙ۫۫ۙۤۢۥۤۨۘ۟ۚۙۥ۠۫";
                    break;
            }
        }
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        String str = "۠ۦۖۖۜ۫ۘۙۗۡۨۤۜۡۨۘۥۧ۟ۤۤۖۘۦۚۡۥۦ۫";
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (true) {
            switch ((str.hashCode() ^ 815) ^ -888534351) {
                case -2125184273:
                    str = "ۥۙۙۤ۫۫ۚ۬ۢۚۗۖۘۙۢۖۖۥ۬ۜۨۘ";
                    break;
                case -2018069626:
                    str = "ۥۙۡۨۦۨ۫ۡۡۚۚۜ۠۬ۥۘۦۙ۟۬ۛۚۗ۫ۖۘۚۤۖ";
                    break;
                case -1905321201:
                    f3 = (float) (i4 - i2);
                    str = "۫ۢۦۘۨۗۛ۠ۧۦۘۡ۟ۡۘۚۦۧۘۘۨ۫ۨۚۘۘ۬ۥۖۘۨۨ";
                    break;
                case -1639095275:
                    str = "۫ۨۦۤۤۡۘۨۜۜۤۛۜۘۦۗۦۥۥۚۤ۫ۛ۫۬ۨۢۡ۫";
                    break;
                case -1585931534:
                    super.onLayout(z2, i2, i3, i4, i5);
                    str = "ۚۧۜۙ۠ۜۘۦۨ۫ۖۖۦ۟ۗۚۤۘۘ";
                    break;
                case -1496595679:
                    String str2 = "ۘۖۚۙ۟ۥۙۖ۟ۨ۟۬ۛ۟ۥ۠۠ۧۜۡۘۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 541588288) {
                            case -2109029679:
                                str = "۟۬ۜۘۧ۟ۥ۫ۚۦۘ۠ۨۥۗۤۨۘۙۙۘۘۙ۫ۡۘۢۙ۬ۚ۫ۥۘ";
                                continue;
                            case -1985165929:
                                str2 = "۬۬ۛۘۛۤۖۛۗۜ۬ۘۜۦۡۚۢۢۧۦ۬ۧۦۤۖۦۘ";
                                break;
                            case -894029279:
                                if (this.f2610e) {
                                    str2 = "ۤۦۢۘۧۙۦۛۛۧۡۥۘۜۙۨۙۛۥۚۧ۟ۥ۬۟";
                                    break;
                                } else {
                                    str2 = "ۙ۟ۥۥۜۛۛۛۥۘۗۨ۫۫ۧۦۥۙۡۗ۬ۜ۬ۙۦ";
                                    break;
                                }
                            case 2052868071:
                                str = "۫ۨۛ۬ۘ۠ۡۢۥۦۚۛۜۥۗ";
                                continue;
                        }
                    }
                    break;
                case -1302500652:
                    str = "ۢۨۨۥۘۘۜۤۜۘ۠ۚۨۚۨۨۘۖۗ۬۬ۗۖۨۢۧۖۘ";
                    break;
                case -1092083035:
                    this.f2610e = true;
                    str = "ۧۡۦۤۦۦۘۜۛۢۗۘۜۘۚۢۖۘ";
                    break;
                case -723614613:
                    return;
                case -695594508:
                    str = "ۚۡۘۧۥ۟۟ۘۜۜ۫ۡۘۤۧۜۘۦۡۡۘ۠۫ۜۘ";
                    break;
                case -59965836:
                    a();
                    str = "۫ۨۛ۬ۘ۠ۡۢۥۦۚۛۜۥۗ";
                    break;
                case 657476935:
                    str = "ۙۦ۫۫ۨۧۘۜۡۡۘ۬ۦۛۚ۬ۢۥ۫ۘۘۤۛۦۘ۟۬۫";
                    break;
                case 1370618052:
                    f2 = (float) (i5 - i3);
                    str = "۟ۤۜ۬ۧۙ۬ۡۖۘۗۦۨ۟ۜۡۘۤ۠ۖۘۥۡۖۘ";
                    break;
                case 1840656437:
                    this.f2608c.set(0.0f, 0.0f, f3, f2);
                    str = "ۢ۬ۧۛۦۘۡ۬ۨۘۙۢ۫ۥۡۗ۫ۗۢۧۡۦۙۛۛ";
                    break;
            }
        }
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        String str = "ۧۜۦ۬ۧ۠ۚۡۦۘۖۜ۟ۜ۠ۡۘۙ۬ۤۜۨ۟";
        while (true) {
            switch ((str.hashCode() ^ 85) ^ -940661464) {
                case -1780017120:
                    str = "ۥۘۡۘۜۨۨۘۤ۬ۨ۟ۖۧۢۖۜۚۦۧۘ";
                    break;
                case -813037836:
                    str = "ۥۦۥۘۗۦۘ۠ۖۚۦۡۘۘۦۧ۠ۢۜ۫ۡۦۦۛ۠ۘۘ";
                    break;
                case 308267042:
                    super.onSizeChanged(i2, i3, i4, i5);
                    str = "۫ۦ۠ۜۙۧۚۤۡۘۜۧۙۧۖۖۤۚۧۛ۟۬ۛ۬ۥۘۥۡ۬";
                    break;
                case 642945650:
                    str = "ۢ۫ۘۘۚۥۖۘ۟ۚۥۗۗۘۘ۬ۡۥۘ";
                    break;
                case 792855415:
                    str = "۫ۥۚۙۖۡۘۜۜۥ۬ۗۦۙۡ۟۠ۚۢ۫ۥۨۘ۠ۤۦ";
                    break;
                case 1068732171:
                    a();
                    str = "ۧۧۚۚ۠ۥ۠ۦ۫ۥ۬ۤۜۜۚ۠ۦۜۛ";
                    break;
                case 1824401409:
                    str = "ۜۢ۟ۗۚۨۜۛۙۧۡۥۘۨۜۨۘ";
                    break;
                case 1888006527:
                    return;
            }
        }
    }

    public void setBackground() {
        GradientDrawable gradientDrawable = null;
        String str = "ۘۨۥۤۘۘۦۥۜۘۜۥۢ۠ۘۥ۟ۖۜۙۜۨۨۚۦ";
        while (true) {
            switch ((str.hashCode() ^ 179) ^ 1404750636) {
                case -2001474039:
                    gradientDrawable = new GradientDrawable();
                    str = "ۤۧۘۚۦۘۘۨۚۤۖۜۨۘۢۙۖۘۡ۠ۧۧۧ۬۬ۗ۫ۢۡ";
                    break;
                case -1911812198:
                    return;
                case -1842287316:
                    gradientDrawable.setColor(HomeUI.toolbarBg());
                    str = "ۚۦۢۦۡۨۘۜۜۘ۫ۦۨۘۜۥۖۘ۫ۦۜۘۖ۟ۙۤۙ۠ۛۖۥۘ";
                    break;
                case -1587379079:
                    setClipToOutline(true);
                    str = "ۙۙۥ۫ۧۥۛۙۨۘۗۖ۬ۙ۟۟ۤۦۥ";
                    break;
                case -1423508077:
                    str = "ۚۦۢۦۡۨۘۜۜۘ۫ۦۨۘۜۥۖۘ۫ۦۜۘۖ۟ۙۤۙ۠ۛۖۥۘ";
                    break;
                case -1062925710:
                    setBackground(this.f2620o);
                    str = "ۧ۬ۜۘۗۨۡۚۘۖۘۛۤۥۘ۫ۢۡۘۘۙۧۢۜۚۥۘ";
                    break;
                case 17330468:
                    this.f2620o = gradientDrawable;
                    str = "ۤ۠ۢ۠ۚۨ۟ۥۢۦۙۗۢۖۧۘ۠ۥۨۘۡ۫ۧ";
                    break;
                case 171153219:
                    String str2 = "ۛۖۦۘۦۚۚۡۦۥۗۙۧۛ۫ۜۦ۫";
                    while (true) {
                        switch (str2.hashCode() ^ -1075668206) {
                            case -1779240905:
                                str = "۬۫ۙ۠ۖۡ۬ۨۥۘۡ۫ۡۘۚۦۗۙ۟ۦۢۢ۬";
                                continue;
                            case 526477441:
                                if (!shp.getIsGradiet("ModConPickColor")) {
                                    str2 = "ۖ۬ۤۤ۬۠ۥۧۖۦۧۘۖۨۘۘۙۚۥ";
                                    break;
                                } else {
                                    str2 = "۠۠۬ۚ۬ۘۘۢ۬ۛۘۧۢ۠ۨۢۜۜۦۘ";
                                    break;
                                }
                            case 990747038:
                                str2 = "ۧۦ۟ۗۖۨۦۙۥۘۘۜۧۘۙۘۚۦۙۧ";
                                break;
                            case 1540894319:
                                str = "۫ۤ۠ۚۤۘۘۛۡ۬ۥۡۧۖ۬ۤۜۨ۠ۘ۬ۦۘ";
                                continue;
                        }
                    }
                    break;
                case 850716701:
                    this.f2620o = shp.getGradientDrawable("ModConPickColor");
                    str = "ۤۦۘۘۚۦۘۘۢۡ۟۟۠ۥۘۛ۟ۨۘۤۨۚۢ۠ۨۥۖ۟ۤۜۤ";
                    break;
                case 1814176009:
                    str = "ۖۖ۫۫۬۠۬ۦۥۢ۟۫ۧۛۧ";
                    break;
            }
        }
    }

    public void setRoundAsCircle(boolean z2) {
        String str = "ۡۦۖۘۡ۟۠۠۬ۢۘۨ۫ۛ۠۠ۖۛۘۥۖ۬ۥۦۘ";
        while (true) {
            switch ((str.hashCode() ^ 526) ^ -124391456) {
                case -1860253926:
                    return;
                case -315872158:
                    a();
                    str = "ۖۙۤۜ۟ۜۘۦۢۖۘۘۖۘۢ۫ۦۧۖ۟";
                    break;
                case 467189167:
                    str = "۬ۨ۟ۢۖ۫ۡ۠ۤۙۜۦۢ۫ۖۘۛۦۨۘۜۚۖۘ";
                    break;
                case 477173398:
                    String str2 = "ۥۜ۬ۙۖۗۢۤۡۘۦۘۧۘۙۨۨۘۛۗۥۘ۬۠ۥ";
                    while (true) {
                        switch (str2.hashCode() ^ -1353107131) {
                            case -189455390:
                                str = "ۘۨۦۘۤۜۨۧ۬ۘۗۡ۬۟ۥۘۜۥ۫ۡۙۗ۟ۥۘۘ";
                                continue;
                            case 466865615:
                                str2 = "ۨ۬ۤۛۧ۫۠ۘۧ۠ۗۨۘ۫ۛۜۘۗۙۜۗ۬ۘۘۨ۫ۥۘۧۖۘ";
                                break;
                            case 493188647:
                                if (z2 == this.f2612g) {
                                    str2 = "ۗ۟ۧۜۙۖۙ۟ۢ۫ۦۥۘۢ۫۟ۢۡۡ۬ۡۧۘۘۗۛ۬ۨۤ";
                                    break;
                                } else {
                                    str2 = "ۥۘۡۨۜۗ۬ۧۢۨۥۦۘۗۜۘۘۘۗۤۜۧ";
                                    break;
                                }
                            case 1952288331:
                                str = "ۘۢۨۘۗۘۜۘۜۦۨۘۥۡۢۜۧۡۜ۟ۥ۬ۘ۬ۜۢۙ";
                                continue;
                        }
                    }
                    break;
                case 633613974:
                    this.f2612g = z2;
                    str = "۟ۥۜۙ۫ۢۜۡۤ۟۟ۡۘۖ۬۠ۧۧۘۘۧۥۘ";
                    break;
                case 1399222362:
                    str = "ۘۜۗۢ۟ۢ۫ۧۦ۬ۜۗۜۤۘ";
                    break;
                case 1970522049:
                    postInvalidate();
                    str = "ۘۢۨۘۗۘۜۘۜۦۨۘۥۡۢۜۧۡۜ۟ۥ۬ۘ۬ۜۢۙ";
                    break;
            }
        }
    }

    public void setRoundedCornerRadius(int i2) {
        String str = "ۘ۬ۧۢۧۦۥۛۘۦۗۗۨۨ۠ۧۗۦ";
        while (true) {
            switch ((str.hashCode() ^ 547) ^ -862156137) {
                case -1858934020:
                    str = "ۗۜۥ۠۟ۦۘۗ۫ۘۘۙۥۙۛۤۛۙۧۧۜۗۦۗۘۘۡۨۙ";
                    break;
                case -1185736663:
                    setRoundedCornerRadius(i2, true, true, true, true);
                    str = "ۦۜ۟ۜۗۡۘ۠ۚۜۧۗۢۚۜۢۚۗۦۘ۠ۨۚۘ۠ۚ";
                    break;
                case -532099997:
                    str = "ۖۧۨۚۚ۫ۜۨۥۖۨۘۖۧۙۗۜۨۘۢۘۨۜۚۤۚ۬۟";
                    break;
                case 1510766576:
                    return;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        r0 = "ۙۖۢۜۨۢۚۡۖۘۨۚۤۜۙۧۤ۠ۤۘۖۡۘ۠ۡ۫ۥۛ۫";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setRoundedCornerRadius(int r5, boolean r6, boolean r7, boolean r8, boolean r9) {
        /*
            r4 = this;
            java.lang.String r0 = "ۤۗۤ۠ۜۨۘۚۜۡۗۘۚۜۚۛۤ۬ۧ۫۟ۨ۫ۥۦ۟ۛۚ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 480(0x1e0, float:6.73E-43)
            r3 = -1704113788(0xffffffff9a6d4984, float:-4.9069837E-23)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -1544929032: goto L_0x0020;
                case -1213260339: goto L_0x001d;
                case -978946743: goto L_0x0011;
                case -900788867: goto L_0x0062;
                case -829395998: goto L_0x00e3;
                case 182660065: goto L_0x00ca;
                case 272016785: goto L_0x00ee;
                case 325174719: goto L_0x0014;
                case 375369860: goto L_0x00d6;
                case 377493948: goto L_0x0017;
                case 737775898: goto L_0x00dc;
                case 1132315122: goto L_0x00be;
                case 1204291327: goto L_0x0044;
                case 1269033048: goto L_0x001a;
                case 1393891903: goto L_0x0080;
                case 1525033562: goto L_0x009f;
                case 1647166058: goto L_0x00c4;
                case 1868983274: goto L_0x0023;
                case 1959003585: goto L_0x00d0;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "ۗۜۡ۟ۙۡۘۢۙۢۤۛۜ۬۠"
            goto L_0x0002
        L_0x0014:
            java.lang.String r0 = "ۗۛۘۘۢ۫ۡۦۧۨۘۗۚ۫ۨۗۚ۬ۜ"
            goto L_0x0002
        L_0x0017:
            java.lang.String r0 = "ۥ۬ۤۙ۟ۢ۫۠ۖۘۨۥۘۘۗۘ۠۫ۛۘۘ"
            goto L_0x0002
        L_0x001a:
            java.lang.String r0 = "ۜ۟۫ۚۖۦۡۚ۫ۜ۠ۥۘۖۢۡ۬۬ۤۗۥۘۢ۟ۚ"
            goto L_0x0002
        L_0x001d:
            java.lang.String r0 = "ۢۜۘۘۘ۬ۥۦ۫ۗۗۖۘۘۧۙۖۘۖۦۚ"
            goto L_0x0002
        L_0x0020:
            java.lang.String r0 = "ۜۢۖۘ۠ۘۢۜۧ۟۠ۗۘۘۢۧ"
            goto L_0x0002
        L_0x0023:
            r1 = -621810946(0xffffffffdaefeafe, float:-3.3765448E16)
            java.lang.String r0 = "ۖۖ۫ۚۙۢۘۛۧ۠ۖۤۧ۟۠ۧۛ۬"
        L_0x0028:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1857135217: goto L_0x003e;
                case -1684687988: goto L_0x0037;
                case -1008011032: goto L_0x0031;
                case -116504117: goto L_0x0041;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x0028
        L_0x0031:
            java.lang.String r0 = "ۙۖۢۜۨۢۚۡۖۘۨۚۤۜۙۧۤ۠ۤۘۖۡۘ۠ۡ۫ۥۛ۫"
            goto L_0x0002
        L_0x0034:
            java.lang.String r0 = "ۦ۠۬ۙۚۦۘۢ۬ۥۘۙۛۥۧ۬ۜ"
            goto L_0x0028
        L_0x0037:
            int r0 = r4.f2611f
            if (r0 != r5) goto L_0x0034
            java.lang.String r0 = "ۥۘۡ۬ۚۥۢۜۦۘۛۦۛۦۖۦۘ۫۟۠ۗ۬ۡۘ۟۟ۤۗ۟"
            goto L_0x0028
        L_0x003e:
            java.lang.String r0 = "ۜۧ۬ۢ۬۟ۛۖۖۘۜۢۘۛۤۧۤ۟ۜۘ۠ۗ۠"
            goto L_0x0028
        L_0x0041:
            java.lang.String r0 = "ۡۚۨ۠ۧۡۢۙ۬۫۫ۦ۠ۜۧۚۛۗۚۥۛۦۙ۠۬ۨۛ"
            goto L_0x0002
        L_0x0044:
            r1 = -1476497747(0xffffffffa7fe6ead, float:-7.0619157E-15)
            java.lang.String r0 = "ۧۜۘۤۢۡۘۨۛۤۜۥۧۙۗۤ۬ۤۗۚۛۡۚۨ۫"
        L_0x0049:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1347689067: goto L_0x005f;
                case -1247107938: goto L_0x0031;
                case -763706986: goto L_0x0058;
                case -335019252: goto L_0x0052;
                default: goto L_0x0051;
            }
        L_0x0051:
            goto L_0x0049
        L_0x0052:
            java.lang.String r0 = "ۙۨۛۡۛۘۚۚۢۧۦ۠ۘ۟ۗۥۨۡۘ"
            goto L_0x0002
        L_0x0055:
            java.lang.String r0 = "ۖۤۘۛۦ۬ۙۨۛۧۦۘۛۖۘۘۥۢ۬ۜۨۡۘ"
            goto L_0x0049
        L_0x0058:
            boolean r0 = r4.f2613h
            if (r0 != r6) goto L_0x0055
            java.lang.String r0 = "ۦ۬ۛۨ۟ۗۧۧۨۚۢۙۖۘۨۥ۫ۦۢۖۧۛۖۘ"
            goto L_0x0049
        L_0x005f:
            java.lang.String r0 = "ۢۜ۠ۢۖۥۘ۫ۘ۠ۤۙۥۘۨ۠ۜۙۤ"
            goto L_0x0049
        L_0x0062:
            r1 = 1593232617(0x5ef6cce9, float:8.8919226E18)
            java.lang.String r0 = "ۚۧۤۨۥۘۤ۫۠ۥۗۗ۫۬ۗۧۥۦ۫ۦۘۘۚۛۖۚ۫۬"
        L_0x0067:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1995983574: goto L_0x007a;
                case -1407106781: goto L_0x007d;
                case -1159300822: goto L_0x0070;
                case -194858630: goto L_0x0031;
                default: goto L_0x006f;
            }
        L_0x006f:
            goto L_0x0067
        L_0x0070:
            boolean r0 = r4.f2614i
            if (r0 != r7) goto L_0x0077
            java.lang.String r0 = "ۘ۫۫ۢ۠ۜۛ۬ۧۜ۠ۡۘ۠ۡۛۡۚ۫"
            goto L_0x0067
        L_0x0077:
            java.lang.String r0 = "ۥۘۨ۫ۦۥۘۢۗۤ۠ۖۧۘۡۖۖۙۨۚۙۘۡۘ"
            goto L_0x0067
        L_0x007a:
            java.lang.String r0 = "ۜۨۜۖۙۘۘۥۡۡۨۘۨۜۙ۫ۢۛۛۡۤۧ"
            goto L_0x0067
        L_0x007d:
            java.lang.String r0 = "ۖۚۘۘۡۧ۫ۡۦۤۢۦۘۦ۫ۘۘ"
            goto L_0x0002
        L_0x0080:
            r1 = 2085449446(0x7c4d6ee6, float:4.2666806E36)
            java.lang.String r0 = "ۥۨۚۚۘۤۚ۠ۧۛۧۛۖۢۦ۠ۡۨۘ"
        L_0x0085:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1322140312: goto L_0x008e;
                case -111259893: goto L_0x0031;
                case 501336717: goto L_0x0098;
                case 2011833905: goto L_0x009b;
                default: goto L_0x008d;
            }
        L_0x008d:
            goto L_0x0085
        L_0x008e:
            boolean r0 = r4.f2615j
            if (r0 != r9) goto L_0x0095
            java.lang.String r0 = "ۡۡۥۘۨ۟ۛ۠ۦۙۘۨۘۘ۬ۚ۬ۛۨ۫ۘۘۥۘۧۧۡۘۢ۠ۥ"
            goto L_0x0085
        L_0x0095:
            java.lang.String r0 = "ۡۢۜۘ۫ۢۙ۬ۗۘۜۧ۬ۡۧ۬"
            goto L_0x0085
        L_0x0098:
            java.lang.String r0 = "ۗۢۗ۠۫ۥۘۖ۫ۥۛ۫ۡۤۢۨۘۤ۠ۙۧۙۛۦۘ"
            goto L_0x0085
        L_0x009b:
            java.lang.String r0 = "۟ۥۥۘۗ۬ۨۥۢۜۘۗۡۦۘۘۢۗ"
            goto L_0x0002
        L_0x009f:
            r1 = -555847615(0xffffffffdede7041, float:-8.0141913E18)
            java.lang.String r0 = "ۦۙۛۛۤۚ۫ۛ۫ۤۚۧۚۦۧ۫۬۬ۧۛۢ"
        L_0x00a4:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -920001300: goto L_0x00ad;
                case -827211010: goto L_0x00b3;
                case -292350472: goto L_0x00ba;
                case 2088133516: goto L_0x00ea;
                default: goto L_0x00ac;
            }
        L_0x00ac:
            goto L_0x00a4
        L_0x00ad:
            java.lang.String r0 = "۟ۜۜۘۚۛۖۚ۫ۘۘۚ۠ۖۜۜۖۖ۟ۤۜ۫۟ۥۤۦۘ"
            goto L_0x00a4
        L_0x00b0:
            java.lang.String r0 = "ۡۦۦ۬ۘۗ۟ۦۜۘۚۘۧۘ۬۠ۤۙۜۤ"
            goto L_0x00a4
        L_0x00b3:
            boolean r0 = r4.f2616k
            if (r0 == r8) goto L_0x00b0
            java.lang.String r0 = "ۤۖۜۥ۫ۤۦۗۖۘ۠۫ۛۚۖۖۨۥ۬ۖ۫۠ۘۘ"
            goto L_0x00a4
        L_0x00ba:
            java.lang.String r0 = "ۙۖۢۜۨۢۚۡۖۘۨۚۤۜۙۧۤ۠ۤۘۖۡۘ۠ۡ۫ۥۛ۫"
            goto L_0x0002
        L_0x00be:
            r4.f2611f = r5
            java.lang.String r0 = "ۦۧۗۜۨ۫ۡۦۡۖ۠ۥۘ۬ۚ۬"
            goto L_0x0002
        L_0x00c4:
            r4.f2613h = r6
            java.lang.String r0 = "ۗۤۘۘ۫ۤۤ۠۟۬ۙۦۚۦۜ۟۠ۖۦ۬ۤۗۙۢۖۘ"
            goto L_0x0002
        L_0x00ca:
            r4.f2614i = r7
            java.lang.String r0 = "ۥۧۗۗۧۛۤۤۥۡ۟ۧ۫ۗۧۜۚۛۡ۫ۤۖۗۗۙۦ"
            goto L_0x0002
        L_0x00d0:
            r4.f2615j = r9
            java.lang.String r0 = "ۘۨۨۙۖۧۤۘۙۧۖۡۘۤۡۧ۠ۧۛ۠ۢۥ"
            goto L_0x0002
        L_0x00d6:
            r4.f2616k = r8
            java.lang.String r0 = "ۙۘۦۘۖۥ۟ۖ۫ۦۜۛۧ۠ۗۗۙۚ۠ۖۜۧۘۜ۬ۖۘ"
            goto L_0x0002
        L_0x00dc:
            r4.a()
            java.lang.String r0 = "ۘ۠ۥۦۛۧۦ۫ۛۖۖۘ۟ۤۢ"
            goto L_0x0002
        L_0x00e3:
            r4.postInvalidate()
            java.lang.String r0 = "ۙۨۥۘ۠ۜۜۘۖ۠۟۠ۙۜۘۢۗۖۦۨۡۘۖ۟ۛ۫ۗۨ۬ۜۙ"
            goto L_0x0002
        L_0x00ea:
            java.lang.String r0 = "ۙۨۥۘ۠ۜۜۘۖ۠۟۠ۙۜۘۢۗۖۦۨۡۘۖ۟ۛ۫ۗۨ۬ۜۙ"
            goto L_0x0002
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.whatsapp.rounded.RoundedLayoutLinearToolbar.setRoundedCornerRadius(int, boolean, boolean, boolean, boolean):void");
    }

    public void setRoundingBorderColor(int i2) {
        String str = "ۚۡۢ۫ۥۚۧ۠۠ۥۧۜ۟ۖۚۧۡۤۤۢۙۘۜۙ۠ۨۘ";
        while (true) {
            switch ((str.hashCode() ^ 915) ^ -923833194) {
                case -1562015284:
                    this.f2607b.setColor(i2);
                    str = "ۨۧۧۛۚۡ۬ۥ۫ۥۘۚۨۘۘ";
                    break;
                case 51864220:
                    postInvalidate();
                    str = "ۜۢۧۨۥۖۘۤۖۘۗۡۙۤۚۨۘ";
                    break;
                case 531816030:
                    str = "ۖۜۘ۬ۥ۫۠ۦۥۘۘۥۢ۫ۤۤۗۧ۠ۨۙۡۢۤ۠";
                    break;
                case 1349846698:
                    String str2 = "۠ۜۨۡ۟۫۬۫ۛۘۧۢۜۦۘۨۚۚ۫ۢۧ";
                    while (true) {
                        switch (str2.hashCode() ^ -1607529066) {
                            case -1107603386:
                                str = "ۜۢۧۨۥۖۘۤۖۘۗۡۙۤۚۨۘ";
                                continue;
                            case 154862189:
                                str2 = "ۡ۠ۤۡۛۧۛۥۙ۟۫ۡۨ۠ۤ۠۠ۜۘ";
                                break;
                            case 228519020:
                                str = "۫ۘۦۡ۠ۙۜۙۡۧۡۘۨۜۘۘۧۚۡۘ";
                                continue;
                            case 1448599784:
                                if (i2 == this.f2618m) {
                                    str2 = "ۦ۟ۡۘ۫ۦۧۤۨۜۤ۬ۘۚۜۤۡ۠ۛۛۘۛ۠";
                                    break;
                                } else {
                                    str2 = "ۗۦۡۘ۟۫ۜۘۙۧۥۤۚۘ۟ۖۛۤۖۘ";
                                    break;
                                }
                        }
                    }
                    break;
                case 1438854876:
                    this.f2618m = i2;
                    str = "ۤ۫ۗۤ۬ۦۘۤۜۛۥۘۢ۬۫ۦۢۚۨۥۖۜ۠ۦۡۘ";
                    break;
                case 1698594290:
                    str = "ۢ۠ۥۘۥۚۜۨۜۖ۟ۥۜۥ۫ۦۘۙۛۨ۬ۖۥۦۙۥ";
                    break;
                case 2034760010:
                    return;
            }
        }
    }

    public void setRoundingBorderWidth(int i2) {
        float f2 = 0.0f;
        String str = "۠ۨۚۘۜۦۘۗ۫ۙ۫ۘۖۥۦۗۡ۬";
        while (true) {
            switch ((str.hashCode() ^ 694) ^ -1588524521) {
                case -1194325503:
                    f2 = (float) (i2 * 2);
                    str = "ۨۙۜۘ۬ۖۙۙ۠۬ۘ۠ۦۦ۫ۗۢۧۦۚۡۛۖۥۨۘ";
                    break;
                case -1034618744:
                    this.f2607b.setStrokeWidth(f2);
                    str = "ۜۨۧۘۤۢۛۢۢۗۦۗ۟ۡ۟ۨۦۚۦۘ۠ۖ۬۬ۛۘ";
                    break;
                case -791063480:
                    return;
                case -631955656:
                    this.f2617l = i2;
                    str = "ۙۘۜۘۗۡ۠ۚۘۧۘۥۚۙۖۛۤۚۙۦ۫ۚۘۢۛ";
                    break;
                case -478007219:
                    str = "ۤۛۘۘۦۤۗۥۖۧۘ۫ۛۗۗۨ";
                    break;
                case 189086452:
                    str = "ۦۧۡۘۡۢۘ۟ۦۦۘۘۢۜۘۤۤۡۨ۠۫ۤۡۙ";
                    break;
                case 1148934901:
                    String str2 = "ۢۘۘۘۘ۟ۥۡ۫ۛۖۦۨۘۦۧۥۖۥۖۖۤ۫ۢۖۨۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 1149443043) {
                            case -2066617756:
                                str = "ۜ۫ۦۛ۬ۨۘۙ۫ۘۘۖۥۙۖۨۖۤۛۛۤۙ۬ۜۚۖۖۤۘ";
                                continue;
                            case 361015799:
                                str = "ۛۡۘۘۦ۟۬۫ۚۤۜۖۜۦۙۘۘۘۛۜ۟ۤۢ۠ۖۦۘ";
                                continue;
                            case 1262642006:
                                if (i2 == this.f2617l) {
                                    str2 = "۠ۛۦۤۘۚ۬ۗ۠ۚۡۘۙۡۜۛۥ";
                                    break;
                                } else {
                                    str2 = "ۚ۬ۦۙ۠ۨۘ۬ۘۘ۫ۛۧۡۦۛۜۖ۟۫ۘۘۤ۟ۖ";
                                    break;
                                }
                            case 1984771830:
                                str2 = "ۙۥۢۖۤ۠۫ۥۧۢۢۖۧۥۜۚ۬۟";
                                break;
                        }
                    }
                    break;
                case 1439455117:
                    postInvalidate();
                    str = "ۜ۫ۦۛ۬ۨۘۙ۫ۘۘۖۥۙۖۨۖۤۛۛۤۙ۬ۜۚۖۖۤۘ";
                    break;
            }
        }
    }

    public void setRoundingElevation(float f2) {
        String str = "ۙۙ۠۫ۧۦۘۜ۬ۡۘۡۨۧۦۤۘۘ۫۫ۜ";
        while (true) {
            switch ((str.hashCode() ^ 446) ^ -2076989176) {
                case -301983432:
                    this.f2619n = f2;
                    str = "۬ۙۛۤ۠ۥۘۜ۬ۦۘ۟ۖۗۤۧ۠";
                    break;
                case 791009957:
                    str = "ۙ۟ۘۘۚۨۘۨۘۡۙۨۘۚۚۡۦۤۛ";
                    break;
                case 1380033994:
                    setElevation(f2);
                    str = "۟۫ۦۘۧۙۥۦۖۧۘۨۚۨۘۡۜۜ";
                    break;
                case 1422702463:
                    return;
                case 2049885646:
                    str = "ۗۢۢ۬ۘۘۛۗۨۚۡۙۥۥۘۜۖۥ";
                    break;
            }
        }
    }
}
