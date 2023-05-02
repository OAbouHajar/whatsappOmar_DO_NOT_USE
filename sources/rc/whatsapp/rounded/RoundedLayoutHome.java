package rc.whatsapp.rounded;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.obwhatsapp.yo.HomeUI;
import com.obwhatsapp.yo.shp;
import com.obwhatsapp.youbasha.task.utils;
import okhttp3.internal.http.StatusLine;

public class RoundedLayoutHome extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public final Path f2576a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final Paint f2577b = new Paint();

    /* renamed from: c  reason: collision with root package name */
    public final RectF f2578c = new RectF();

    /* renamed from: d  reason: collision with root package name */
    public final float[] f2579d = new float[12];

    /* renamed from: e  reason: collision with root package name */
    public boolean f2580e = false;

    /* renamed from: f  reason: collision with root package name */
    public int f2581f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2582g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2583h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2584i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2585j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2586k;

    /* renamed from: l  reason: collision with root package name */
    public int f2587l;

    /* renamed from: m  reason: collision with root package name */
    public int f2588m;

    /* renamed from: n  reason: collision with root package name */
    public float f2589n;

    /* renamed from: o  reason: collision with root package name */
    public GradientDrawable f2590o;

    public RoundedLayoutHome(Context context) {
        super(context);
        c();
    }

    public RoundedLayoutHome(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public RoundedLayoutHome(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        c();
    }

    @TargetApi(21)
    public RoundedLayoutHome(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        c();
    }

    public final void a() {
        boolean z2 = false;
        String str = "ۧۘ۟۟۫۟ۡ۠ۡ۬ۘۘۡ۫ۘۦۙۜۘ۟ۦۨۘ۬ۢۖۘ";
        Path path = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        RectF rectF = null;
        float f4 = 0.0f;
        while (true) {
            switch ((str.hashCode() ^ 694) ^ -682319605) {
                case -2097166130:
                    str = "ۥۚۨۘۧۨۡۘ۬ۜۥۧۖۖۘۥۥ۠ۨ۫۬ۡۡۜۘ";
                    f3 = f4;
                    break;
                case -1805171055:
                    str = "ۙ۫ۡۘۖۗۜۘۥ۠ۚۙۤۢۘۛۨۢ۟۫";
                    f2 = Math.max(rectF.width(), rectF.height()) / 2.0f;
                    break;
                case -1717843685:
                    path.addRoundRect(rectF, b(f3), Path.Direction.CW);
                    str = "ۥ۠ۧۥۤۚۡۤ۬ۨۚۨۚۗۢۖ۫ۢۦۥۦۦۢۤۦۤۘ";
                    break;
                case -1458221453:
                    String str2 = "ۧۘۨۘ۠ۙۨۘۡۢۜۘۨۙ۟ۧۚۨۘۗۤۢۧۚۦۘ";
                    while (true) {
                        switch (str2.hashCode() ^ -1468582930) {
                            case -1631390307:
                                str = "ۧۜ۠ۜۤ۟ۛۘۦۖ۠ۜۛۨۢۧ۠ۗ";
                                continue;
                            case 598066591:
                                str2 = "ۗۙۙۤۨۦۡۗۡۖ۠ۘ۫ۛۢۗۨۘ";
                                break;
                            case 876491341:
                                str = "ۖۛۥۥۦۖۘۧۛۜۘۚۘ۫ۦۧۘ";
                                continue;
                            case 1245504926:
                                if (this.f2580e) {
                                    str2 = "ۛۖۘۧۨ۟ۜۦ۬ۧۚۜۧۢۖ";
                                    break;
                                } else {
                                    str2 = "ۙۗۤۙۛۛۢۜۥۘ۠ۡۗۙ۟ۖۙۧۖۘۨۤۗ";
                                    break;
                                }
                        }
                    }
                    break;
                case -1324399192:
                    path.close();
                    str = "۬۫ۖۘ۬ۨ۫ۨۡۢۙ۬ۦۥ۟ۧ";
                    break;
                case -839696333:
                    String str3 = "ۗۢۥۘۦۜ۟ۡۥۧۘۘۨ۟۬ۤۖۤۜ";
                    while (true) {
                        switch (str3.hashCode() ^ -1610461092) {
                            case -1323156420:
                                str = "ۜ۟ۚۦۘۚۜۢۡۖۤۗۘۡۘۦۤۤۖۚۦ";
                                continue;
                            case -408507749:
                                if (!z2) {
                                    str3 = "ۖۦ۠۟ۤۧ۠ۨ۫ۤۛۡۛ۫ۦۡۨۘۘ";
                                    break;
                                } else {
                                    str3 = "ۗ۟ۧۦۖۧۦۛۜۡۘۨۘۥۗۤۛۤۜۛۚۗ";
                                    break;
                                }
                            case 298461560:
                                str = "۠ۖۜۘۛۘۧۘۘۘۛۤۥۧۘۤ۟ۛۖۥۨ۫ۧۜۘ";
                                continue;
                            case 1564780381:
                                str3 = "۟ۙۤۛۢۘ۬ۖ۟ۧۗۦۘ۬ۛۖۘ۬ۦۘۙ۫ۚۚ۬ۧۢۘۘۘ";
                                break;
                        }
                    }
                    break;
                case -588012605:
                    f4 = (float) this.f2581f;
                    str = "ۖۖۖۦۤۤۗۙۥۙۛۦۚۚۜۘۗۢۨ۫ۘۦۘ۫ۖۘ۟ۗ۫";
                    break;
                case -556668934:
                    str = "۠ۖۜۘۛۘۧۘۘۘۛۤۥۧۘۤ۟ۛۖۥۨ۫ۧۜۘ";
                    f3 = f2;
                    break;
                case -460144862:
                    str = "۟۬ۘۘۚۡۨ۬۬ۥۨ۟ۜۘۤۚۨ۠ۥۦ";
                    rectF = this.f2578c;
                    break;
                case -254380720:
                case 366430368:
                    return;
                case -205726365:
                    path = this.f2576a;
                    str = "ۙۜۤۛۥۖۘۤۖۥۘۡۖ۠ۜۤۗ۫ۗۛ۬ۚۡۘۜۡۘ۠ۚۢ";
                    break;
                case 44892480:
                    str = "۬۠۠ۜۧۛۖ۠ۜۤ۟ۡۖۨۘ";
                    break;
                case 1400692590:
                    path.reset();
                    str = "ۘۗۡۛ۟ۖۙۡۦۘۜۙۦۜۙۢ";
                    break;
                case 1487251560:
                    this.f2590o.setCornerRadii(b(f3));
                    str = "۫ۢۖۘۙۢۖۘۦۨۘۘۦۚۨۨۨۛ";
                    break;
                case 1491293992:
                    str = "۠ۙۨ۟ۥۖۘۥۘۥۘۡۗۜۘۖۡۗۘۛۚۜۨۢۘ۬ۘۜۡ۬";
                    z2 = this.f2582g;
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
        String str = "۫ۘۙۦۚۧۗۜۘۘۚ۫ۨۘۖۖ۟";
        while (true) {
            switch ((str.hashCode() ^ 415) ^ -452295797) {
                case -2065701967:
                    String str2 = "۠ۡۨۘۜۧۤ۠۟ۦۧ۠ۚۢ۟ۛ۠ۤۖ۫";
                    while (true) {
                        switch (str2.hashCode() ^ -70806620) {
                            case -1886549777:
                                str = "ۚۖۘۥۢۧ۠ۜۤۨۥۗۢۚۦ۫ۡۖۧۤۘۘ";
                                continue;
                            case -248838478:
                                str = "ۧۚۗۤ۠ۘۜۙۢ۟۫۠۫ۖۨۥۜۖ";
                                continue;
                            case 429518545:
                                if (!z2) {
                                    str2 = "ۙۖۡۥۚۦۘۘۤۤۙۘۦۘۤۡۖۘۙۛۧۗ۟ۘۘۛ۫۫";
                                    break;
                                } else {
                                    str2 = "ۛۨۘۘۨ۟ۧۦۡۥۘۙۤۛۨۤۛۘ۫ۗ۬ۙۧۖ۫ۜۘۗۜ";
                                    break;
                                }
                            case 1275837800:
                                str2 = "۟ۧۖ۟ۚ۬ۦ۬۫۬ۢۙۢۦۘۘۖۦۧۤ۠۠ۨ۬ۘۘ";
                                break;
                        }
                    }
                    break;
                case -1950843847:
                    str = "ۧۗۘۗۨۡۚۨۘۤۜ۫ۡۗۗۧ۫ۨۜۨۙۧ۠ۡۘ";
                    f16 = f14;
                    break;
                case -1949915781:
                    str = "ۖۚۙۘۖۖ۬ۢ۫۬ۙۛۛۢ۠";
                    f13 = f12;
                    break;
                case -1942725080:
                    str = "ۦ۟ۥۢۧۨۘ۠ۡۧۡ۫ۖۛۗۦۘۚۚۨۘ۟ۖ۠ۗ۬ۡ";
                    f5 = f4;
                    break;
                case -1830389697:
                    str = "ۖۧۨۜۢ۟ۤۥۧۘ۠۬ۡۜۧ۫";
                    break;
                case -1823462096:
                    String str3 = "ۡۢۥ۠ۤۚۨۡۖۘۤۜ۬ۚۡۖۦۥ۠۫۫ۥۨۦۨ";
                    while (true) {
                        switch (str3.hashCode() ^ -750050830) {
                            case -2020970535:
                                str3 = "ۨۢۜ۠ۢۡۛۧۗۖۙۜۦۨۦۘۗ۫ۖۚۧۦ۟ۡۖۘۙۧۧ";
                                break;
                            case -131417491:
                                str = "ۖۛۘۗۧۖۥ۟ۢۥ۟ۛۛۗۗۢۙۚۘۘۘ۟ۧۢۦۗ۬";
                                continue;
                            case 567577836:
                                if (!z3) {
                                    str3 = "ۢۨۗۜۧۛۧۥۚۤۚۦۥ۫ۗۧ۫ۗ۟ۖۘۗۖۖۘ";
                                    break;
                                } else {
                                    str3 = "ۦ۠ۥۘۙۛۘۘ۠ۚ۬۬۬۬ۤۛۛ۫۬ۘۘ۠ۛۢ";
                                    break;
                                }
                            case 591398527:
                                str = "ۨۥۜۥۦۥۚۜۖۘۖ۠ۚۥۥۨۗۦۘ";
                                continue;
                        }
                    }
                    break;
                case -1698836024:
                    str = "ۦۤۜۘۤۦۨۗۤ۟۠۟ۤۗ۫ۦۘۘۦ۟";
                    f20 = z8;
                    break;
                case -1685291342:
                    str = "ۖۧۗۗۢۜۘ۟ۙ۫ۘۧ۠ۨۧ۠ۦ۬۫۬ۙۖۜۥۘ۟ۗۘۘ";
                    break;
                case -1652021934:
                    f18 = 0.0f;
                    str = "ۦ۬ۖۤۜۥۘۥۥۖۨۢۙۗ۫۬۟ۥۖۘۡۗۨ";
                    break;
                case -1518623237:
                    fArr[2] = f11;
                    str = "ۜۚۧۖۗۘۦ۠ۘۘۥۨ۬۠۬ۦۘ";
                    break;
                case -1514797974:
                    String str4 = "ۚۘۖ۠ۡۛۨۘۥۜۨۛۡۜۚۛ۫۬ۙۗ۟ۗۖۖۘۙ";
                    while (true) {
                        switch (str4.hashCode() ^ -1487813044) {
                            case -1623091876:
                                if (!z2) {
                                    str4 = "ۥۘۧۜۜۗۦۦۘۥۨۛۢۜۡ۬ۢ۠۟۟ۢۛ";
                                    break;
                                } else {
                                    str4 = "۟ۘۜۘۘۖ۟ۡۤۨ۫ۖۘ۟ۤۜۙۖۚۦۤۨۖۤ۬ۥ۬ۗ";
                                    break;
                                }
                            case 214754798:
                                str4 = "ۨۙ۟ۨۜۧۗۤۗۛۖ۠ۘۥۘۘۙۢ۟۫۟ۧۚۡۙۖۨ۟";
                                break;
                            case 658904809:
                                str = "ۨۥ۠ۥ۠ۘۙۖۡۘۡۦۦۘۦ۫ۖۘۡۨۖ۟ۚۨ";
                                continue;
                            case 1047344979:
                                str = "ۗۗۢۤۗۦ۠ۢۤۗۥ۫ۥ۬ۦۘۥۤ۠ۙ۟ۡۦۡۨۤۘۥ";
                                continue;
                        }
                    }
                    break;
                case -1374723802:
                    str = "ۗۖ۟ۧۡۗ۫ۨۘۨۥۡ۬ۛ۠ۛۧۡۘ۬ۦۘۘۖۤۥ";
                    f12 = f2;
                    break;
                case -1352625835:
                    fArr[3] = f13;
                    str = "ۡۨ۠۟ۗۙۘ۟ۜۦ۠ۦۘۘ۠ۙۘۖۗۥۙۧ";
                    break;
                case -1278716675:
                    str = "ۤۨ۟ۖۚۚۛ۫۬ۥ۟ۡۦۘ";
                    break;
                case -1103028181:
                    z7 = this.f2585j;
                    str = "ۢۡۖۘۙۡۛۘۧۖۘ۫ۜۥۘۢۦ۬ۙۛۡۘ۫ۖۘۙ۫ۡۘ";
                    break;
                case -1070556231:
                    z4 = false;
                    str = "۬ۖۧۘۡ۟ۡۛ۠ۨۙ۬۟ۜۛۥۘۘۧۙۘ۬ۡۨۜ۬ۜۜ";
                    break;
                case -997280423:
                    str = "ۢۨۨۘۦ۠۫ۙۥۦۘۜۗۡۢۢۖ۬ۛۨۘۥ۫ۨۘ۠ۗ۠";
                    f19 = f17;
                    break;
                case -985684806:
                    str = "ۖۧۗۗۢۜۘ۟ۙ۫ۘۧ۠ۨۧ۠ۦ۬۫۬ۙۖۜۥۘ۟ۗۘۘ";
                    f11 = f10;
                    break;
                case -985619497:
                    f4 = 0.0f;
                    str = "ۚۚۘۥۦ۬ۧۨۛ۟ۡۢۖۙۡ۠ۧۨ";
                    break;
                case -892872884:
                    fArr[5] = f16;
                    str = "ۢۦۘۡۨۨۘۚۧۦۗۨۦۘۘۗۛۢۧ۟۟ۗ۟ۙ۠";
                    break;
                case -889568132:
                    f10 = 0.0f;
                    str = "۟ۤۦۘۚ۠ۦۘۡۤۢ۫ۚۢۗۦۖۘۤۦۤ";
                    break;
                case -801626581:
                    String str5 = "ۦۖۜۘۡۘۚۥۤۙۤ۫ۡۘۥۚۦۘ۬ۚۤ۫۫ۧ۠ۚۤ۫ۢۗ";
                    while (true) {
                        switch (str5.hashCode() ^ -336322768) {
                            case -60943388:
                                str = "ۤۡۛۥ۬ۢۤۧ۟ۚۡ۬۟ۡ۫ۘ۟ۜ";
                                continue;
                            case 453422049:
                                str5 = "۫ۖۥۘۦۤۜۜۙۨۗۖۥۘ۬ۚۥۘۥۗۚۧۖۢ۬ۜ۟ۖۧ۫";
                                break;
                            case 1265111647:
                                if (!z3) {
                                    str5 = "ۡۦۡۖۘ۟۠ۖۧۛۤۧۘۛ۬";
                                    break;
                                } else {
                                    str5 = "۫ۗۤۙۦۚۗۥۜۘ۟ۙ۟۫ۖۘۘ";
                                    break;
                                }
                            case 1546018379:
                                str = "۟ۖۙۧ۬ۖۘۛۡۚ۟ۧۜۘۧۘۥۖۖۡۥۘۜۘۗۜۨۘۜۥۖ";
                                continue;
                        }
                    }
                    break;
                case -615702720:
                    str = "۬ۢۨۘۧۗۘۧ۬ۢ۠ۦۘۗۧۧۚ۫۠۫ۢ۟ۜۚۖۘۡۦ۫";
                    f17 = f2;
                    break;
                case -525905166:
                    z6 = false;
                    str = "ۢۖ۠ۨۥۙۦۢۜۘۤ۟ۜ۟ۖۙۖۨۚۧ۬ۜۖ";
                    break;
                case -408985488:
                    return fArr;
                case -330088644:
                    fArr = this.f2579d;
                    str = "۬ۡۜۘۙ۟ۨۥۘۦۖ۫۬ۡۡۥۨ۬ۘۢۖ۫";
                    break;
                case -322935880:
                    fArr[7] = f20;
                    str = "ۖۜۥۘۖۖۜۘۘۢۨۘ۠ۖۘ۠ۨۖۘۧۚۙ۟ۙۧ";
                    break;
                case -297220578:
                    str = "ۜۜۡۘ۫ۢ۬ۙۤۖۘ۟ۘۜۘۥۖۚۧۛۡۘۨ۟ۙ۬ۢۥ";
                    f3 = f2;
                    break;
                case -61521217:
                    str = "ۡ۠ۡۘۤۜۖۖۙۤۗ۟ۙۖۖۘ۟ۧۥۘۢۖۖۘ";
                    f8 = f7;
                    break;
                case 35972453:
                    z2 = this.f2583h;
                    str = "۟ۡۙۘۖۢۗۤۗۖۨۜ۬ۢۖۦۙۤ";
                    break;
                case 63109864:
                    String str6 = "ۧۧۖۘ۠ۥۥۘۛۤۡۢۜۖۘ۟۫ۨ";
                    while (true) {
                        switch (str6.hashCode() ^ -72003716) {
                            case -2095790072:
                                str = "ۛۛۚۗۚۖۙۜۘۚ۬ۧ۟ۖۛۖۛ۫ۗۢ";
                                continue;
                            case -996321704:
                                str = "ۛ۟۬ۙۗ۠۟ۖۥۨ۬ۨ۟ۧ۬";
                                continue;
                            case -492419901:
                                str6 = "۬ۛۥۘۗۡۤ۫ۦ۫۟ۖۨۘ۟ۜۥۨۘۜ۟ۙۡ";
                                break;
                            case 291025694:
                                if (!z7) {
                                    str6 = "ۥۥۗۥۙۢ۬ۤ۠ۧۜۙ۬۠ۜۜۚۡۚۘ۠";
                                    break;
                                } else {
                                    str6 = "۬ۗۧۚۦۙۙۢۧۜۥۥۘۦۜ۬۬۫۫";
                                    break;
                                }
                        }
                    }
                    break;
                case 72032591:
                    String str7 = "ۡۖۙۧۨۥۘ۟ۧۙۙۖ۫ۢۡ";
                    while (true) {
                        switch (str7.hashCode() ^ 48498455) {
                            case -1342392061:
                                str = "ۛۛۜۘۙۡۛ۠ۗۢۧۛۜۤۧۡۛۘ۫ۚۜ";
                                continue;
                            case -1282658205:
                                if (!z5) {
                                    str7 = "ۖۨۥۘۧۦۨۘ۫ۤۨۥۜۥۚۨۡۗۘۥۘ";
                                    break;
                                } else {
                                    str7 = "۫ۨۚ۟ۥۘۘۛ۟۫ۥۚۤۘۦۤۛۤۗۜۧۛ";
                                    break;
                                }
                            case 970851994:
                                str7 = "۟ۘۧۘۗ۠ۘۘۨ۟ۡۘۧۧۨۘۖۙۦۡۧۦۤۧ۬ۚۨۨۘ";
                                break;
                            case 1583937710:
                                str = "ۛۤۘ۬۠ۚۢۛۥۘۗۦۦۜۜۙۡۛۦۖۨ";
                                continue;
                        }
                    }
                    break;
                case 77636969:
                    str = "ۛۙۥۘ۬ۧۢۛۘۥۖۗۥۖۗۧۙ۟ۛ";
                    break;
                case 131500549:
                    fArr[1] = f8;
                    str = "ۘ۠ۛ۟ۦۗ۟۬ۜۘۗۘۤۘۡۜ";
                    break;
                case 146706557:
                    String str8 = "۟ۜۧۗۙۛۧۖۦۘ۠ۗۡ۬۠ۦ۬۟ۖۘۖ۠ۖۥۖۧۘ";
                    while (true) {
                        switch (str8.hashCode() ^ -1624272069) {
                            case -306690598:
                                if (!z7) {
                                    str8 = "ۖۖۗۢۛۦۘۚۦ۫ۨ۬ۚۦ۬ۘۘۗۤۘۘۢۤ۠ۦۡ۠ۚ۟ۧ";
                                    break;
                                } else {
                                    str8 = "ۦۚۨۥۤۘۘۨۘۨ۬۫ۦۤۗۖۘ";
                                    break;
                                }
                            case -182872620:
                                str = "ۖۢۥۘۘۤۦۘۜۤۢ۬ۖۜۘۦ۫ۛۤ۬ۜۗۦۥۘۥ۫ۜۤ۬ۖ";
                                continue;
                            case 19337406:
                                str = "ۧ۟ۜۘۨۤ۟۬ۧۘۘ۫ۖ۟ۗۦۖ۠ۛ۠";
                                continue;
                            case 509943596:
                                str8 = "ۧۖۛۘۡۘۛۗۖۢ۫ۘۘۙ۠ۡۢ۟ۜ";
                                break;
                        }
                    }
                    break;
                case 212639591:
                    fArr[0] = f5;
                    str = "ۦۤ۬۫ۨۘۙ۫ۜۥۢۢۤۥۨۘۘۛ۬ۤۧۜۨ۠ۦ";
                    break;
                case 338950500:
                    str = "ۡ۠ۡۘۤۜۖۖۙۤۗ۟ۙۖۖۘ۟ۧۥۘۢۖۖۘ";
                    break;
                case 379264930:
                    str = "ۖۧۨۜۢ۟ۤۥۧۘ۠۬ۡۜۧ۫";
                    f19 = f18;
                    break;
                case 412318074:
                    fArr[4] = i3;
                    str = "۬۫ۧۤ۠ۡۜۜۥۥ۬ۤ۟ۜ۬ۘ۬ۖ";
                    break;
                case 608459190:
                    str = "۫ۘۚ۫ۦۚ۠۫ۧۛۖۖۘۙۛۜۛۨۨۘ";
                    f8 = f6;
                    break;
                case 618499647:
                    str = "ۗ۠ۙۢ۫۬ۤۛۢۧۚۨ۟ۜۙ";
                    i3 = i2;
                    break;
                case 738862650:
                    str = "ۤۨ۟ۖۚۚۛ۫۬ۥ۟ۡۦۘ";
                    f16 = f15;
                    break;
                case 782076373:
                    str = "ۚۘۡۥۛۘۨۧۡۘۦ۬ۙۖۚۨۦۗ";
                    f5 = f3;
                    break;
                case 910713286:
                    str = "ۖۦۧۖۦۖ۟ۙۖ۠ۤۘۘ۠ۢ۠۬ۗۥۢ۫ۘۦۨۘ";
                    break;
                case 1020508763:
                    f7 = 0.0f;
                    str = "ۧۗۦۨ۠ۛۡۧ۟ۡۜۜۤۢۗ۫ۡۖ۟۟ۡۘۜۖۘ";
                    break;
                case 1023817163:
                    fArr[6] = f19;
                    str = "۬ۙۦۢۦۛۦ۬۬ۡ۠ۧ۫ۙۗ";
                    break;
                case 1033866182:
                    str = "ۛۙۥۘ۬ۧۢۛۘۥۖۗۥۖۗۧۙ۟ۛ";
                    f13 = z4;
                    break;
                case 1098031476:
                    str = "ۦۢۡۨۦۥۘۛ۬ۥۘۜۛۦۗ۟ۡۘۖ۠ۨۥۥۘ";
                    f11 = f9;
                    break;
                case 1098441245:
                    str = "ۧۧۡۘۖۥۨۘۛۛۤۜۘۨۚۢ۟۟ۖۘۤ۠ۦ";
                    f6 = f2;
                    break;
                case 1340714411:
                    str = "ۢۤۘۥ۟ۜۘۧۘۦۘۚ۬ۗۜ۟ۦۘ۠ۧۜۘ";
                    break;
                case 1383429222:
                    z5 = this.f2586k;
                    str = "۬۟ۢۘۖۥ۫۟ۦۥۢ۠۬ۛۦۘۜۛۘۘۜۜۦۘ";
                    break;
                case 1466737442:
                    z3 = this.f2584i;
                    str = "ۨۙۨۘۚۥۡۜۦۛۨ۬ۜۢۗۖ۬ۨۥ";
                    break;
                case 1484352465:
                    str = "۟۠۫ۙۧۢۥۡۘۘۜۤ۟ۡ۫۟۟ۡۦ";
                    f9 = f2;
                    break;
                case 1542737906:
                    f15 = 0.0f;
                    str = "ۗۧۛ۠۟ۢۦ۠ۤ۫ۘۦۚۗ۟ۦۘۘۖ۠۬ۛۜۘۘۘ۫ۙ";
                    break;
                case 1762708380:
                    str = "۫ۘۥۘۡۙۡۥۗ۫ۥۢۧۡ۠ۙۜۚۖۘۥۜۡۘ۠ۙۘ۬ۘۘ";
                    f20 = f2;
                    break;
                case 1808616188:
                    String str9 = "ۛۦۨۘ۫ۦ۬ۡۘ۬ۙۛۥۡۚۚۖۥۨۘ";
                    while (true) {
                        switch (str9.hashCode() ^ -1117608896) {
                            case -945820164:
                                if (!z5) {
                                    str9 = "ۘۢۜۥ۫ۤ۟ۖۢۙۘۨۘۙۡ۠ۘۗۙۗۨ";
                                    break;
                                } else {
                                    str9 = "۠ۚۤۗۡۛۦۘۙۚۖۥۛۚۜۙۚ۬ۛۨۗ";
                                    break;
                                }
                            case -489618861:
                                str9 = "۠۟ۡۘ۟ۙۥۘۙ۬۟ۦۙۜۘۥۤۤ۠ۨۙ۠";
                                break;
                            case 179616577:
                                str = "ۘ۟ۖۜۙۡۛ۠ۗۨ۟ۘۙۛ۬";
                                continue;
                            case 382980796:
                                str = "ۡۙۡۘ۟ۦ۟ۛۙ۫ۢۢۦۖ۬ۗۦۖۗ";
                                continue;
                        }
                    }
                    break;
                case 1861944077:
                    str = "۠ۤۛۚۜۧۘۘ۠ۤۢ۠ۥۘۜۦۘ";
                    i2 = f2;
                    break;
                case 1874244380:
                    str = "ۛ۠ۥۖۖۘۤۖ۠۠۠۟ۛ۠ۦ۫ۥ۬ۧۘۘ";
                    f14 = f2;
                    break;
                case 1875196847:
                    z8 = false;
                    str = "ۦۚ۟ۛۥۦۘۤۡۨ۠ۜۨۘۥۤۜۘۗۚۥۜۖۡۧ۟ۥۘ۟ۨ۠";
                    break;
                case 1884540586:
                    str = "ۢۤۘۥ۟ۜۘۧۘۦۘۚ۬ۗۜ۟ۦۘ۠ۧۜۘ";
                    i3 = z6;
                    break;
                case 1991799535:
                    str = "ۦۤۜۘۤۦۨۗۤ۟۠۟ۤۗ۫ۦۘۘۦ۟";
                    break;
                case 2097157504:
                    str = "ۦۖۙۨۡۘۘۖ۟ۖۘۢۥۛۡۛۥۜۤۤۙۦۜۘۡ۫ۗۥۧۛ";
                    break;
                case 2118727395:
                    str = "ۦ۟ۥۢۧۨۘ۠ۡۧۡ۫ۖۛۗۦۘۚۚۨۘ۟ۖ۠ۗ۬ۡ";
                    break;
            }
        }
    }

    public final void c() {
        Paint paint = null;
        String str = "ۘۤۘۘۢۘۘ۫۠ۨۡۥۡۘ۫ۗۦۗۢۛ";
        while (true) {
            switch ((str.hashCode() ^ 524) ^ -816402266) {
                case -2132509915:
                    this.f2587l = 0;
                    str = "ۧ۠ۜۙ۬ۨۘۛۜۚۘۢۨۡۙۥۘۗۤۗۧ۠ۘ";
                    break;
                case -1720861370:
                    paint.setStrokeWidth((float) (this.f2587l * 2));
                    str = "ۤۡۛۛۦۘۦۖۦۘ۟۟ۜۘۢۛ۫ۖۡۨۛۡ۫ۛۢ۟ۡ۫ۜ";
                    break;
                case -1102974011:
                    paint.setColor(this.f2588m);
                    str = "۟ۜۚۛ۬ۨ۟ۦۡ۟ۗۙۙۨۖۘۜۖۢ";
                    break;
                case -920426873:
                    paint = this.f2577b;
                    str = "ۨۗۧۥۘۦۛۚۡ۠ۤۨۘ۫ۦۦ۟۠ۗۥۡۦۘۢۘ۠ۙۗۥ";
                    break;
                case -866573260:
                    this.f2583h = true;
                    str = "ۛۛۘۘۨۤۛۢۘۧۛۦۘۘۚۚۖۘۤۘۧۤۡ";
                    break;
                case -838148600:
                    this.f2581f = utils.dpToPx(26.0f);
                    str = "ۥۙۨۘۦ۫ۢۖۖۢۡۙۛۦ۬ۘ۬ۛۧ";
                    break;
                case -775896276:
                    this.f2586k = true;
                    str = "ۘۘۢۗۢۖۘ۬ۡۥۘ۬ۛۡۘ۬ۥۥۙ۟۟ۖۨۦۚۜۛ";
                    break;
                case -595561170:
                    String str2 = "ۦۥۦۨۧۜۘۜ۫۬ۚۧۥۦۢۥ۠ۧۖۛۨۗۤۖۘۘۜ۟۬";
                    while (true) {
                        switch (str2.hashCode() ^ 2143036105) {
                            case -2060114561:
                                str2 = "ۜۦۖۥۜۤ۫ۜۡ۟ۗۡۘۜ۠ۨ";
                                break;
                            case -1188720359:
                                if (!isInEditMode()) {
                                    str2 = "ۥۨۜۦۘۚۚۗۥۘۘۢۙۙۘ۟ۡۘۖۢۜۖۜۜۘ";
                                    break;
                                } else {
                                    str2 = "ۤۜۥۘۨ۫ۤ۫۬ۖۜۖۡۨۧۖۥ۫۫";
                                    break;
                                }
                            case 304944911:
                                str = "ۖۤۨۡۘۡۘۧۙۖۛ۫ۚ۠ۡ۟ۖۨۖۘ۟ۜۨۘ۬۬ۡۜۨۢ";
                                continue;
                            case 1813919202:
                                str = "ۜ۠ۘۘۗ۟ۨۘۤۧۥۦۨۨۘۡۜۜۡۖۨۘۥۖ۟ۙۤۦۘۗۜۘۘ";
                                continue;
                        }
                    }
                    break;
                case -208887333:
                    this.f2589n = 0.0f;
                    str = "ۙۤۦ۫ۢۧۗ۬ۖ۫۟۠ۘۢ۟ۘ";
                    break;
                case 617739948:
                case 1687343653:
                    return;
                case 921216825:
                    this.f2590o.setCornerRadii(b((float) this.f2581f));
                    str = "ۡ۠ۘ۠ۦۘۘۦۨۘۘۚۡۨۖۗۥ۟ۛۢۗ۠ۚ";
                    break;
                case 927090043:
                    this.f2584i = true;
                    str = "۬ۢۦۘۖۤۥۜۤۤۚۧۦۘ۠۬۠ۦ۫ۜ۠ۤۥۘۛۡۨ";
                    break;
                case 947554985:
                    setRoundingElevation(0.0f);
                    str = "ۛ۬ۚ۟۟ۥۘۡۨۧۘۤۛۨۥۡۥۛۚۡۗ۟ۚۚ۫";
                    break;
                case 1041208284:
                    paint.setStyle(Paint.Style.STROKE);
                    str = "ۚۥۢۢۨۘۘ۬۠ۤۤۡۢۖۥۚۡۡۘۘۘۛ۠ۙۢۛۨۦ";
                    break;
                case 1114496961:
                    this.f2588m = 1180787041;
                    str = "ۨ۫ۖ۟ۧۙۛۜۖ۟ۙۜۘ۟۟ۡۘۡۢۥۢۨۤ۟ۛۙۢۢۦۘ";
                    break;
                case 1668809229:
                    setBackground();
                    str = "۬ۙۜۘۧ۫۠ۖۧۥۘۢۗۜ۬ۖۡۘ۠ۛ۟";
                    break;
                case 1691736804:
                    str = "ۜۥۦۘۦۚ۠ۙ۟ۨۢۤۡۘۨۢۨ";
                    break;
                case 1886620630:
                    this.f2585j = true;
                    str = "ۥۗۙۧۛۡۘۨ۫۫ۜۢۥۙۖۘ۫ۖۦۘۥۜ";
                    break;
                case 1899060618:
                    this.f2582g = false;
                    str = "۬ۘۘۘ۠۠ۛۘ۫ۡ۬۟ۖ۬ۦۦۥۙۖۜۦۘۡۥۨۘۦ";
                    break;
                case 2059139835:
                    paint.setAntiAlias(true);
                    str = "۟ۡۜۖۘۨۘۨۖۖۜۙۧۙ۟ۢۧۦۡۘۦۖۙۛ۠ۙ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006d, code lost:
        r0 = "۟ۛۚۜ۬ۢۢۘۥۘۢۚ۟ۡۛۨۘ۠ۧۙ۫ۤۜۘۘۚۥۘ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r6) {
        /*
            r5 = this;
            r1 = 0
            java.lang.String r0 = "۬ۧۦۘۚۘ۫ۘۜۛ۫۠ۤ۫۟ۥۘ"
        L_0x0003:
            int r2 = r0.hashCode()
            r3 = 617(0x269, float:8.65E-43)
            r4 = 994257098(0x3b4328ca, float:0.002977895)
            r2 = r2 ^ r3
            r2 = r2 ^ r4
            switch(r2) {
                case -1287864926: goto L_0x0018;
                case -1100202382: goto L_0x0065;
                case -1071506346: goto L_0x0015;
                case -785664245: goto L_0x0070;
                case -594099044: goto L_0x0012;
                case -380448: goto L_0x001d;
                case 842343518: goto L_0x0047;
                case 1002358568: goto L_0x0029;
                case 1987519895: goto L_0x0023;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x0003
        L_0x0012:
            java.lang.String r0 = "ۢۖۡۘۢۛۡۛۘ۫ۥۜۘ۟ۙۨۘۜۦۙۘۥۗۗۗ"
            goto L_0x0003
        L_0x0015:
            java.lang.String r0 = "ۦۨۡ۬ۖۧۢۙۤۨ۠ۘۘ۟ۡۡۘ۟۠ۨ۬ۦۡۘ۫۫ۙ"
            goto L_0x0003
        L_0x0018:
            android.graphics.Path r1 = r5.f2576a
            java.lang.String r0 = "۟ۡۜ۫ۚۙ۟ۛۘۘۖ۠ۨۘۤۥۗۙ۟ۖۤۡ۠"
            goto L_0x0003
        L_0x001d:
            r6.clipPath(r1)
            java.lang.String r0 = "ۡۡۘۙۙۥۘۤۙۨۜۖۗ۟ۘۢ"
            goto L_0x0003
        L_0x0023:
            super.draw(r6)
            java.lang.String r0 = "۟ۙۥۘۘ۠ۖۘۛۙۖۘۘۥۖۛۚۙ۫ۛۦۘۖۙۦۘۨۤۨۘ"
            goto L_0x0003
        L_0x0029:
            r2 = -53498972(0xfffffffffccfaba4, float:-8.626294E36)
            java.lang.String r0 = "ۛۜۘۘ۫ۗۨۘ۬۟ۧۖۥۥۘۜۡۘ"
        L_0x002e:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1826182283: goto L_0x006d;
                case -463877890: goto L_0x003d;
                case 1169846079: goto L_0x0037;
                case 1212211662: goto L_0x0044;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x002e
        L_0x0037:
            java.lang.String r0 = "۟ۨۨۘۙ۠ۘۘۨۜۦۡ۫ۙ۬ۧۡۘۢۚۥۘۥۛۚ"
            goto L_0x002e
        L_0x003a:
            java.lang.String r0 = "۬۟۟ۖۥۦۘ۠ۨ۫ۦۙۨۘۚۘۧ۫۬ۧ۬ۨۥۘۘ۫ۨۘ۫ۤۨۘ"
            goto L_0x002e
        L_0x003d:
            int r0 = r5.f2587l
            if (r0 <= 0) goto L_0x003a
            java.lang.String r0 = "ۗۜۧ۫۬ۡۘ۬۟۠۟ۜۘۘۦ۟ۙ۠ۥۘۦ۟ۡۘۜۨۜۘ"
            goto L_0x002e
        L_0x0044:
            java.lang.String r0 = "ۨ۠ۨۗۚۥۖۡۘ۬۫۬۬ۥۙ۠ۜۨۘۥۚۙۖۤۤۜۘۥ"
            goto L_0x0003
        L_0x0047:
            r2 = 2082011736(0x7c18fa58, float:3.1772268E36)
            java.lang.String r0 = "۟ۡۦۗۤۗۖۖۥۘۜۦۧۘ۠ۗ۫ۘۡۨۘ۟ۤۤۦۤۗ"
        L_0x004c:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case 55578960: goto L_0x0062;
                case 406637291: goto L_0x005b;
                case 1119718211: goto L_0x0055;
                case 1167544133: goto L_0x006d;
                default: goto L_0x0054;
            }
        L_0x0054:
            goto L_0x004c
        L_0x0055:
            java.lang.String r0 = "۫۬۠ۛۗۦ۫۫ۡۜۢ۬ۥۙ۬"
            goto L_0x004c
        L_0x0058:
            java.lang.String r0 = "ۦۧۤۗۨ۟ۢۜ۟ۧۛۥۘۥۜ۬۬ۘۖۨۧۘۘۜۦ۬۠ۚۤ"
            goto L_0x004c
        L_0x005b:
            int r0 = r5.f2588m
            if (r0 == 0) goto L_0x0058
            java.lang.String r0 = "ۧۜۘۘۧۨۘ۠ۖۜۡۚۧۧۜۧۘۙۜۖۢ۟ۛ"
            goto L_0x004c
        L_0x0062:
            java.lang.String r0 = "ۦۗۜۘۦۚۛۢ۠ۧۢ۟ۤۥۘۘۖۗ۟"
            goto L_0x0003
        L_0x0065:
            android.graphics.Paint r0 = r5.f2577b
            r6.drawPath(r1, r0)
            java.lang.String r0 = "۟ۛۚۜ۬ۢۢۘۥۘۢۚ۟ۡۛۨۘ۠ۧۙ۫ۤۜۘۘۚۥۘ"
            goto L_0x0003
        L_0x006d:
            java.lang.String r0 = "۟ۛۚۜ۬ۢۢۘۥۘۢۚ۟ۡۛۨۘ۠ۧۙ۫ۤۜۘۘۚۥۘ"
            goto L_0x0003
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.whatsapp.rounded.RoundedLayoutHome.draw(android.graphics.Canvas):void");
    }

    public int getRoundedCornerRadius() {
        String str = "ۤۘۦۥۗۜۘۨۙۦۘۘ۬۠۫ۦۨ۠ۥ۠۠ۢ۟";
        while (true) {
            switch ((str.hashCode() ^ 782) ^ 1819075314) {
                case 1814196602:
                    str = "ۛۨۜۜۦۛۘ۠ۤۥۘۨۘ۟ۤۘۘ";
                    break;
                case 1913473694:
                    return this.f2581f;
            }
        }
    }

    public int getRoundingBorderColor() {
        String str = "ۘۧۥۡ۠ۚۧ۫ۤۜ۠ۘ۟ۡۧۖ۫ۧۧ۬ۤۚۙ۫ۖۙۤ";
        while (true) {
            switch ((str.hashCode() ^ 922) ^ 391973825) {
                case 135192085:
                    str = "ۨۛ۫ۥۨۘۢ۬۟ۤۙۗ۟ۖۥ۠ۗ۬ۖۖۜۘ";
                    break;
                case 1802686902:
                    return this.f2588m;
            }
        }
    }

    public int getRoundingBorderWidth() {
        String str = "۟ۖ۟ۧۧ۫ۤ۬۟ۡۡۗۢۧۨ۠ۥۧۘ";
        while (true) {
            switch ((str.hashCode() ^ 253) ^ 1554900133) {
                case -1868883122:
                    str = "ۜۧۡۘۡۖۗۛۢۖۘۚۥ۫ۤۤۘ۫ۤۛۦ۫ۚ";
                    break;
                case -120838644:
                    return this.f2587l;
            }
        }
    }

    public float getRoundingElevation() {
        String str = "ۤۙۚ۬۠ۥۘۚۡۙۗۦۚۢ۠ۤ";
        while (true) {
            switch ((str.hashCode() ^ 558) ^ -913794131) {
                case -2021939687:
                    return this.f2589n;
                case -367939550:
                    str = "ۖۢۛۤۜۡۘۨۜۨۘۛ۬ۨۘ۠ۥۦۘ";
                    break;
            }
        }
    }

    public boolean isRoundAsCircle() {
        String str = "۟ۨ۬۟ۢ۬ۢۖۘ۬۠ۘ۫ۜۥۚۦۛ۠۟ۜ۟ۚۖۘ";
        while (true) {
            switch ((str.hashCode() ^ 581) ^ 1051459773) {
                case -1929976191:
                    str = "ۖۗۢۘ۠ۡۘۘ۫ۢۜۗۖۦۦۥۚ۠ۜۘۗۦ۟ۗ۠";
                    break;
                case 639952838:
                    return this.f2582g;
            }
        }
    }

    public boolean isRoundBottomLeft() {
        String str = "ۥۗۦۙۙۚۢۦۦۘۨ۟ۥۘ۟ۢ";
        while (true) {
            switch ((str.hashCode() ^ 437) ^ 857130447) {
                case -1392998106:
                    return this.f2585j;
                case 918427571:
                    str = "ۛۗۖۘۚۥۚۖ۟ۚۢۙۚ۟ۙۜۡۙۖۨ۟ۙ۟ۡۡۘ";
                    break;
            }
        }
    }

    public boolean isRoundBottomRight() {
        String str = "ۜۛۦۘۦۖۘۖۥۙ۬ۜۖۨۖ۫";
        while (true) {
            switch ((str.hashCode() ^ 665) ^ -21272824) {
                case 224286720:
                    return this.f2586k;
                case 1541151067:
                    str = "ۗۥۗ۠ۛۨۥۗۡۘ۟ۥۥۘۜۙۖۘ۟ۖۥۛۧۙۢۙ۠ۦۖۜۘ";
                    break;
            }
        }
    }

    public boolean isRoundTopLeft() {
        String str = "ۚۘ۫ۛۗۢۖۙۨۛۘۦ۠ۙۚ";
        while (true) {
            switch ((str.hashCode() ^ 597) ^ 90005419) {
                case 1278097242:
                    str = "۬ۨۦ۠۠ۤۚ۟ۨۨ۟ۦ۫";
                    break;
                case 1732773435:
                    return this.f2583h;
            }
        }
    }

    public boolean isRoundTopRight() {
        String str = "ۛۤۨۤۖۙۥۡۘ۫ۛۜۢۥۖۘۖۢ۠ۢۖۧ";
        while (true) {
            switch ((str.hashCode() ^ 32) ^ 1399061124) {
                case -1411373256:
                    str = "ۖۥۘۘۖ۫ۥۥۘۧۘ۫ۨۛۢ۫ۡۘۘۨۖ۫ۡۦۘ";
                    break;
                case -552572847:
                    return this.f2584i;
            }
        }
    }

    public void onAttachedToWindow() {
        String str = "ۖۜۧۛۘ۬۬۠ۨۘ۫۠۫ۢۡۛ۫ۘۢ";
        while (true) {
            switch ((str.hashCode() ^ StatusLine.HTTP_PERM_REDIRECT) ^ 720347274) {
                case -1779169373:
                    str = "ۘۗ۟ۗۨۜۘۘۛۦۘۨۢۥۘۧۤۧۤۚۥۘ";
                    break;
                case -1642347553:
                    this.f2580e = false;
                    str = "ۡۘ۟ۤۡۛ۬ۥۘۨۙۖۘۙۡۥۘۤۤۡۘ";
                    break;
                case 520034650:
                    super.onAttachedToWindow();
                    str = "ۜ۬ۨۖۨ۫ۛۤۧۙۚۙۢ۬ۖۘۗۧۘۖ۬۬ۡۨۘۛ۠";
                    break;
                case 564886672:
                    return;
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        String str = "ۖۗ۬۫۠ۜۚۥۗۨۘۖ۬ۙۨۘۧ";
        while (true) {
            switch ((str.hashCode() ^ 450) ^ 1060771939) {
                case -1533302004:
                    return;
                case -1360716178:
                    super.onConfigurationChanged(configuration);
                    str = "ۖ۟ۥۤۡۛۙۜۥۘۦۙۡۥۨۥ";
                    break;
                case 362612460:
                    str = "ۛۘۘۘۙۜۧۘ۫ۢۛۛ۫ۤۧۢۥۘ";
                    break;
                case 1064386349:
                    String str2 = "ۚۡۢۧ۬ۜۡۚ۟ۢۦ۫ۜۗۤ۫ۨۘۥۧۙۖ۟ۗ۠";
                    while (true) {
                        switch (str2.hashCode() ^ 651079457) {
                            case -1197794309:
                                if (getVisibility() != 0) {
                                    str2 = "ۦۜۨۘۖۤۜOۜۦۧ۠ۧۥۙ۠ۦۘ۬ۦۧ";
                                    break;
                                } else {
                                    str2 = "ۛۖۜۥۘۡۘۖۗۚۖۦۥۢۤۙۥ۟ۚ";
                                    break;
                                }
                            case -867683215:
                                str2 = "ۜۗۛۚۖۢ۟۫ۙۚ۠ۡۥۙۡۗ۫ۦۘۜ";
                                break;
                            case 554910684:
                                str = "ۦۜۢۗۗۜۘۛ۬ۥۥۖۘۧۛۜۡۖۗۧۧۥۡۙۘۘ";
                                continue;
                            case 1378991085:
                                str = "ۙۜۥۨۘۡ۬ۛۜۜ۫ۥۨۖۗۥ۠ۛۚۘۘۘ";
                                continue;
                        }
                    }
                    break;
                case 1112179679:
                    requestLayout();
                    str = "ۙۜۥۨۘۡ۬ۛۜۜ۫ۥۨۖۗۥ۠ۛۚۘۘۘ";
                    break;
                case 1666048789:
                    str = "۟ۛۛۚ۟ۢۘۦۧ۫ۙۨۘۚۧ۫۬ۤۙۘۚۛۧۦ۫ۘۛ۟";
                    break;
                case 1920361577:
                    this.f2580e = false;
                    str = "ۗۙۖۘۘۤۖۜۖۡ۟ۜ۠ۚۖ";
                    break;
            }
        }
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        String str = "۬۬ۖۘۦۛ۠ۨۨۖۘۡ۫ۜۘۨۘۧۥۦۡۦۧ۠۫ۘۨۘۖۘۧۘ";
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (true) {
            switch ((str.hashCode() ^ 64) ^ 1347908243) {
                case -1543940410:
                    str = "۫ۦۥۘ۫ۤۖۘۜۥۖ۟ۖۨۚۢ۬ۦۙۜۘۜۜۙۗ۬ۘ";
                    break;
                case -1348146110:
                    this.f2578c.set(0.0f, 0.0f, f3, f2);
                    str = "ۛۧۥۘ۫ۜۗۖۥۜۘۚۚۧۥۨۜۖۧۥۡ۠ۘ۬ۛۗۡۛۥ";
                    break;
                case -1120859276:
                    return;
                case -851658719:
                    str = "ۡۚۛۧۤۡۦۦۦۙۜۢۨۗۛۖۖۧ";
                    break;
                case -762288412:
                    f3 = (float) (i4 - i2);
                    str = "ۗۜ۫ۧ۬۟۬ۡ۟۬۬ۙ۟ۢۗ";
                    break;
                case -399712030:
                    f2 = (float) (i5 - i3);
                    str = "ۛ۟ۚۙۖۥۘۨ۬۫ۗۦۘۘۗۙۚۘۗۨۢ۟ۥۘ";
                    break;
                case -208029870:
                    str = "ۡۢۨۥۢ۟ۧ۫ۚۡۘۚ۫ۖ";
                    break;
                case 269302019:
                    str = "ۛۖۥۖۧۜۘ۟ۡۜۘۡ۠ۡۘ۠۬ۜۛ۠۟";
                    break;
                case 719798475:
                    this.f2580e = true;
                    str = "ۛۢۨۘۖ۫ۙۜۙۙ۟ۘۨۘ۟ۜۦۨۡ۬ۢۧۗ";
                    break;
                case 807968671:
                    String str2 = "۠ۢۥۙۥۨۘ۫ۖۚۘۧۤۢ۟ۧۥۚۚۚ۟۠ۙۘۦۜۥۨۘ";
                    while (true) {
                        switch (str2.hashCode() ^ -1831565792) {
                            case -2020736411:
                                if (this.f2580e) {
                                    str2 = "ۜۖۚ۬ۤۨۘۗۘۤۤۗۡۗۤۘ";
                                    break;
                                } else {
                                    str2 = "ۛۜۧ۟ۦۥۜۧۡۛۥۖ۫ۚۜۘۚۗ۟۫۬ۜۢۡۚ";
                                    break;
                                }
                            case -1889822125:
                                str = "ۖۤ۬ۖ۫۠ۦۜۘۗۡۢۨ۫۬ۧ۠ۥۘۙۗۙۛۥ۫";
                                continue;
                            case -82016247:
                                str2 = "ۜۥۗ۠ۙ۫۫ۥۨ۫ۚۚۘۡ۫ۗ۬ۜۗۙۘ۬ۡۘ۠ۚ۠";
                                break;
                            case 1285783544:
                                str = "ۜۥ۟ۜۡۚۡ۫ۧۖ۠ۦ۠ۢۧ";
                                continue;
                        }
                    }
                    break;
                case 897964038:
                    str = "ۘۚۦۘۚۖۛ۫ۦۧۘۦۖۗۜۥۚ۠۫ۥۘ۬ۘۧۘۥ۬ۤ";
                    break;
                case 1506241797:
                    super.onLayout(z2, i2, i3, i4, i5);
                    str = "ۧۥۛ۫ۘۖۘۜۗۜۙۥۗ۬ۦۜۤۧۨ۫ۦۘۡۛۨۘۥ۟۟";
                    break;
                case 1767078592:
                    str = "ۨۦۦۘۖۗۘۤۛۖۘۢۢۜۘۧۛۘ۬ۧۢۘۨۡ";
                    break;
                case 2042993443:
                    a();
                    str = "ۜۥ۟ۜۡۚۡ۫ۧۖ۠ۦ۠ۢۧ";
                    break;
            }
        }
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        String str = "ۚ۠ۨۘۡۨ۫ۢ۬ۜۘۛۧۤۡۨۥۘۗۙۘۘۨۚۦ۟ۧ";
        while (true) {
            switch ((str.hashCode() ^ 76) ^ -92636526) {
                case -1753705909:
                    str = "ۤۖۙۦ۫ۡ۬ۥ۬ۢ۟ۘۨۘۘۨۡۛ۫ۨ۬ۛ۬ۧ";
                    break;
                case -1319735801:
                    super.onSizeChanged(i2, i3, i4, i5);
                    str = "ۧۤۚ۟ۢ۬ۜ۫ۦۧۚ۟ۤۘۦۨۦۦۘۤۜۡ";
                    break;
                case -755387582:
                    return;
                case -715337438:
                    str = "ۡ۠ۘۘۙۖۥۘۚۨۖۘ۟ۘۤۚۜۨۘۖ۟ۜۖۨۦۘ";
                    break;
                case -662664704:
                    str = "ۗۨۥۘۙۧۘۘ۬ۨ۟ۧۜۘ۬ۢۢۨۨۖ";
                    break;
                case 98282646:
                    a();
                    str = "۠ۨۗ۠ۙۢۡۗۤۘ۫ۗۛۧ";
                    break;
                case 184647134:
                    str = "ۘۦۡۤۦۡۘۤ۟ۙۢۧۤ۫ۛ۬ۢۘ۫ۜ۫";
                    break;
                case 1648138338:
                    str = "ۙۢۗۨۘۥۘۖۛ۠ۜۙۙۨۖ۠ۦۢۦۗۘۤۛۚۘ";
                    break;
            }
        }
    }

    public void setBackground() {
        GradientDrawable gradientDrawable = null;
        String str = "ۗۙۜ۠۬ۙۘ۠ۥ۟ۦۦۘ۫ۨۡۗۤۤۖۥۤ";
        while (true) {
            switch ((str.hashCode() ^ 980) ^ -146714601) {
                case -1818274861:
                    gradientDrawable = new GradientDrawable();
                    str = "ۦۙۡۘۥۥ۠ۗۨۗۖۨۨۤۜۚۤۜ۠ۨۧۨۨۡۨ";
                    break;
                case -1494979023:
                    this.f2590o = gradientDrawable;
                    str = "ۧۤۛۤۖۛۤۖۚۚۘۢۘۤۢۖ۠ۖۘ";
                    break;
                case -1197599064:
                    this.f2590o = shp.getGradientDrawable("list_bg_color");
                    str = "ۥۥ۬ۗۜۧ۫ۨۛ۟ۙ۟۟ۨۨۘۨۤۦۘ";
                    break;
                case -1008276153:
                    str = "ۤ۬ۦۥۘ۠۟ۚ۟۟ۡ۬ۢۜۨۘ";
                    break;
                case -714492629:
                    String str2 = "ۛۚۖۧۜۙ۠۟ۨۘ۬ۧۨۘۛۥۡۘۢۜۜۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 1104123114) {
                            case -1959432861:
                                str2 = "ۨۤۛ۫ۦۛۦ۟ۥۗۨۥۘۥ۟ۡۘ";
                                break;
                            case -1281517590:
                                str = "ۧۜۘۘ۬ۥۥۘ۫ۤۢۙ۬ۜۙۧۜۘۨۗۥ";
                                continue;
                            case 698020884:
                                if (!shp.getIsGradiet("list_bg_color")) {
                                    str2 = "ۥ۫ۥۜ۠ۦۘۗۘۦۘۡۤۜ۠ۨۜ۠ۗۦۧۖۖ۠";
                                    break;
                                } else {
                                    str2 = "۫ۡۤ۫ۤۖۘۜۚ۫ۢۖۖۘۢۦۧ";
                                    break;
                                }
                            case 1161965007:
                                str = "ۦۢۢ۫ۛۛۗۜۖ۫ۖۘۨۤۦۘۛۧۦۘۡ۬ۨ";
                                continue;
                        }
                    }
                    break;
                case -331295747:
                    return;
                case 294170744:
                    gradientDrawable.setColor(HomeUI.listbg_Color());
                    str = "ۤ۬ۦۥۘ۠۟ۚ۟۟ۡ۬ۢۜۨۘ";
                    break;
                case 301598748:
                    setBackground(this.f2590o);
                    str = "ۤۨۡ۟ۤ۬ۦۧۥۦۖ۬ۜۜ۠۠ۜ۬ۤۜۦ";
                    break;
                case 357425596:
                    str = "ۜۖۗۦۖۗۖۖۜۙۜۨۚۗۘ";
                    break;
                case 1779699007:
                    setClipToOutline(true);
                    str = "ۧۦۘۖ۟۠۬ۙ۠ۨۜۡۜۢ";
                    break;
            }
        }
    }

    public void setRoundAsCircle(boolean z2) {
        String str = "ۨ۠ۘۘ۫ۢۜۥۜ۫ۡۜۘۘۘۚ";
        while (true) {
            switch ((str.hashCode() ^ 936) ^ 1890341511) {
                case -1757539478:
                    a();
                    str = "ۧۨۡۡۥۘۘۗۘ۫۟ۖۜۘۛۥۖۘ";
                    break;
                case 421277681:
                    return;
                case 814978859:
                    str = "ۢۧۖ۬۬ۦۘۖۙۙۥۦۧۘ۬ۙۤ";
                    break;
                case 876070333:
                    str = "ۘۦۘ۠۠۠ۡۨۘۘ۠ۖۖۘۨۚۙ";
                    break;
                case 890297597:
                    String str2 = "ۢۨۦۘۢۨۧۘۨ۟ۤۨۥ۬ۜۤ";
                    while (true) {
                        switch (str2.hashCode() ^ 539627825) {
                            case -1971925621:
                                str = "۫ۘۘۘ۫ۧ۬۬۫۠ۧۖۖۨۖۜۘۤ۟۬";
                                continue;
                            case -1727553144:
                                if (z2 == this.f2582g) {
                                    str2 = "ۡۡۘ۫۟۠ۧ۫ۘۘۚ۫ۡۛ۬ۜۘۨۡۘ";
                                    break;
                                } else {
                                    str2 = "۬ۖ۠ۢۙۡ۫ۢۚۙۙۢۤۡۨۘ۬ۖۥۥ۟ۥۙۡۖۧۦۡ";
                                    break;
                                }
                            case -670124651:
                                str2 = "ۤۘ۟ۗ۠۫ۘۙۦۘ۠۬ۧۛۙ۠";
                                break;
                            case 1300927712:
                                str = "۠ۚۦۘۜۦۨۙۢۘۙۛۜ۟۟ۨۤۘۖۘ۟۠ۡ";
                                continue;
                        }
                    }
                    break;
                case 1061520906:
                    postInvalidate();
                    str = "۫ۘۘۘ۫ۧ۬۬۫۠ۧۖۖۨۖۜۘۤ۟۬";
                    break;
                case 1110410800:
                    this.f2582g = z2;
                    str = "ۦۛۢۥۜۦ۟ۚۙۡۛ۫ۚۜۖۦۖۖۜۖۖۘۖۜۜۦۦۘ";
                    break;
            }
        }
    }

    public void setRoundedCornerRadius(int i2) {
        String str = "ۤۚۘۥۛ۬ۖۚۡۘۖۡۙۛۛۧ۠۫ۘۘۘ۫ۦ۫ۜۘۢۘۖۘ";
        while (true) {
            switch ((str.hashCode() ^ 332) ^ 1918977284) {
                case -1314586249:
                    str = "ۙۙۥۧۢۧۛۨ۬ۙ۫ۖۘۦۦۜ";
                    break;
                case -542813051:
                    setRoundedCornerRadius(i2, true, true, true, true);
                    str = "ۖۥۜۘۡۙ۫ۜۥۗۖۜۧۤ۬ۖۦ۠۫ۛ۠ۧۙ۫ۚ۫ۘۘ";
                    break;
                case -383403473:
                    return;
                case 899583160:
                    str = "ۦ۠ۖۗۖۤ۬ۡۘ۟ۥۧۗۤۘۦۡۨۘۨۢۖ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00eb, code lost:
        r0 = "۠۟ۦۘۚۗۘۘۘۛۥۖۘۡ۫ۧۗۖ۫ۗۙۜ۬ۜۗ۠ۧۜۘ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setRoundedCornerRadius(int r5, boolean r6, boolean r7, boolean r8, boolean r9) {
        /*
            r4 = this;
            java.lang.String r0 = "ۘ۟ۧۥ۬ۧۦۥۧۘۡۡۤ۬ۘۖۘۛ۟۫ۥۗۢۗۦۘ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 616(0x268, float:8.63E-43)
            r3 = -247631732(0xfffffffff13d708c, float:-9.3805964E29)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -2129186150: goto L_0x0011;
                case -2112051564: goto L_0x00cb;
                case -1902033127: goto L_0x0020;
                case -1655166241: goto L_0x001d;
                case -1599742119: goto L_0x00c5;
                case -1013553423: goto L_0x00d1;
                case 101467370: goto L_0x007d;
                case 117930515: goto L_0x0017;
                case 192298211: goto L_0x00ef;
                case 197093957: goto L_0x00d7;
                case 223458544: goto L_0x00e4;
                case 422216841: goto L_0x009c;
                case 672021200: goto L_0x001a;
                case 1042351046: goto L_0x00dd;
                case 1293291249: goto L_0x00bf;
                case 1725940862: goto L_0x0014;
                case 1940309319: goto L_0x0041;
                case 2090542752: goto L_0x0023;
                case 2113356153: goto L_0x005f;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "ۦۤۥۘۢ۬ۚۖۙۖۘۡۤۘ۟۠۬"
            goto L_0x0002
        L_0x0014:
            java.lang.String r0 = "ۧۙۥۘۤۥۛۦۢۦۨ۠ۦۘۘ۫ۙ۟۫ۧۥ۬ۜۘ"
            goto L_0x0002
        L_0x0017:
            java.lang.String r0 = "ۖۢۘۘ۟۬ۦ۠۠ۨۦۛۦ۬ۧۘۘۡۛ۟"
            goto L_0x0002
        L_0x001a:
            java.lang.String r0 = "ۦۡۦ۟ۘ۫ۥۡۦۘۖۖۘۡۧ۬ۗ۬ۜ۫۠ۖۘ"
            goto L_0x0002
        L_0x001d:
            java.lang.String r0 = "ۜۤۘۘۙۢۜۖۙۖۗۡۘۙۗ۠ۛۙ۟ۙۡۦۚ۠ۜ"
            goto L_0x0002
        L_0x0020:
            java.lang.String r0 = "ۚۛۖۛۡۢۧۜۧۘ۬ۘۘۘۧۖۜۘ"
            goto L_0x0002
        L_0x0023:
            r1 = -289808628(0xffffffffeeb9df0c, float:-2.8762187E28)
            java.lang.String r0 = "۟ۚۗۢۛۥۘ۠ۡۦۘ۬۬۟ۖۦۜۘۖۡۥۘ"
        L_0x0028:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case 162196994: goto L_0x0037;
                case 601134359: goto L_0x003e;
                case 792874361: goto L_0x00eb;
                case 1582803930: goto L_0x0031;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x0028
        L_0x0031:
            java.lang.String r0 = "۟ۦۨۗۧۖۘ۬ۗۦۘۡۤۙ۫ۨۖۘ۟ۤۨۚ۠ۙۦۤۖ"
            goto L_0x0002
        L_0x0034:
            java.lang.String r0 = "ۦۜ۠ۤۘۥۗۙۨۘۤۧۦۡۨۘۘۥۛۜ"
            goto L_0x0028
        L_0x0037:
            int r0 = r4.f2581f
            if (r0 != r5) goto L_0x0034
            java.lang.String r0 = "ۗۛۥۘۙۙۘۘ۟ۛۖ۟ۡۙۘۡۘ"
            goto L_0x0028
        L_0x003e:
            java.lang.String r0 = "ۚۖ۬ۥۘۢۥۧ۟ۤ۠ۘۘ۫ۥۗۨۗۜ۟ۗۚۙ۠ۧۦۢۦۘ"
            goto L_0x0028
        L_0x0041:
            r1 = -558976009(0xffffffffdeaeb3f7, float:-6.2943385E18)
            java.lang.String r0 = "ۤۥۥۧۢۜۨ۫ۘۡ۬ۗ۟ۡۘۘ"
        L_0x0046:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1872162826: goto L_0x005c;
                case -1492336831: goto L_0x004f;
                case -493451142: goto L_0x0059;
                case 1745335041: goto L_0x00eb;
                default: goto L_0x004e;
            }
        L_0x004e:
            goto L_0x0046
        L_0x004f:
            boolean r0 = r4.f2583h
            if (r0 != r6) goto L_0x0056
            java.lang.String r0 = "ۥۛۤۚۗۚۨۡۢۤۦۘۘ۬ۨۗ۟ۗۤ"
            goto L_0x0046
        L_0x0056:
            java.lang.String r0 = "۟ۧۦ۟۬ۦۤ۟ۜۘ۬ۗۡۘۜۗۥ"
            goto L_0x0046
        L_0x0059:
            java.lang.String r0 = "ۨۙۦۚ۫ۘۥۥۘۘ۬ۦ۠ۚۜۗ"
            goto L_0x0046
        L_0x005c:
            java.lang.String r0 = "۠ۥۤۡ۫ۤ۟ۥۧۜۘۘۤۜۜۢ۬ۡۘ۬"
            goto L_0x0002
        L_0x005f:
            r1 = 1155270811(0x44dc089b, float:1760.2689)
            java.lang.String r0 = "ۧۙۡۘ۠ۘۤۙۘۧۘ۠۬ۚۤۙ"
        L_0x0064:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -2112230556: goto L_0x007a;
                case -1524916981: goto L_0x0073;
                case 859121129: goto L_0x006d;
                case 1049215639: goto L_0x00eb;
                default: goto L_0x006c;
            }
        L_0x006c:
            goto L_0x0064
        L_0x006d:
            java.lang.String r0 = "ۗ۠ۛۡۥ۟ۢۢۖۘۧۖۚۢۚۦۘۘۗۨ"
            goto L_0x0064
        L_0x0070:
            java.lang.String r0 = "ۛۨۚۡۛۚۖۚۘۘۛۨۘ۬ۦۚۗ۠ۡ"
            goto L_0x0064
        L_0x0073:
            boolean r0 = r4.f2584i
            if (r0 != r7) goto L_0x0070
            java.lang.String r0 = "ۨۧۧۧ۬۟ۤۤۦۘۧ۠۟ۧ۬ۗۦۨ"
            goto L_0x0064
        L_0x007a:
            java.lang.String r0 = "ۢۡۛ۟ۖۧۘۚۙۢۨ۠ۢ۠ۘ۟ۤۛۢۜ۟ۥۘۖۛۘ"
            goto L_0x0002
        L_0x007d:
            r1 = -1975712941(0xffffffff8a3d0353, float:-9.100644E-33)
            java.lang.String r0 = "ۨۘۖۘۨۤۧۖۥۡ۟ۖ۬ۦ۫ۚ۟۠ۡۦۨۙۧ۠ۢ"
        L_0x0082:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1719824975: goto L_0x0098;
                case -1074088547: goto L_0x00eb;
                case 1346591402: goto L_0x008b;
                case 1718265430: goto L_0x0095;
                default: goto L_0x008a;
            }
        L_0x008a:
            goto L_0x0082
        L_0x008b:
            boolean r0 = r4.f2585j
            if (r0 != r9) goto L_0x0092
            java.lang.String r0 = "ۤ۬۫ۢۛۨۖۚۡۘۗۗ۬ۦۤۘۥۨۙۦ"
            goto L_0x0082
        L_0x0092:
            java.lang.String r0 = "ۛۚۨۨۘۢ۠ۥۘ۠ۘۤۚۘۢۡۧۖ"
            goto L_0x0082
        L_0x0095:
            java.lang.String r0 = "ۦ۫ۦۘ۟ۢۥۘۚۜۘۘۜۡۛۧۘۤ۟ۜۨۘۨۢۙۥۨ۫"
            goto L_0x0082
        L_0x0098:
            java.lang.String r0 = "ۖۗۜ۟ۙۖ۫۟ۦۘ۠ۚۦۘۜۦۢۥۘۦۛ"
            goto L_0x0002
        L_0x009c:
            r1 = -1104911846(0xffffffffbe24621a, float:-0.16053048)
            java.lang.String r0 = "ۘۡۡ۟۠ۡ۫ۨۘۢۢۨۧ۠۬۬ۥ۬۫ۗۦۘۢۨۧۨۤۥ"
        L_0x00a1:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -440916447: goto L_0x00b1;
                case -314009137: goto L_0x00bb;
                case 358202605: goto L_0x00aa;
                case 1508273192: goto L_0x00b8;
                default: goto L_0x00a9;
            }
        L_0x00a9:
            goto L_0x00a1
        L_0x00aa:
            java.lang.String r0 = "۠ۗ۫ۛۨۥۧ۠ۧۦ۫ۘۘۘۦۦۘ۫ۖ۠ۥۤ۬"
            goto L_0x0002
        L_0x00ae:
            java.lang.String r0 = "۫ۥۥ۫ۡۤۖۖۥۘۙۘۥ۬ۘۜۨۙۤۦ۫ۡۨۖ"
            goto L_0x00a1
        L_0x00b1:
            boolean r0 = r4.f2586k
            if (r0 == r8) goto L_0x00ae
            java.lang.String r0 = "ۥ۟ۥۨۙۤۜۘۚۖ۫ۤۥۤ۠۫۬۟ۙۘۨۥ"
            goto L_0x00a1
        L_0x00b8:
            java.lang.String r0 = "ۥ۠ۖۗۘۖۘۛ۠ۘۛ۠ۨ۫ۡۗ۫۠ۡۜۜ۟۠ۘۡۘ"
            goto L_0x00a1
        L_0x00bb:
            java.lang.String r0 = "۠۟ۦۘۚۗۘۘۘۛۥۖۘۡ۫ۧۗۖ۫ۗۙۜ۬ۜۗ۠ۧۜۘ"
            goto L_0x0002
        L_0x00bf:
            r4.f2581f = r5
            java.lang.String r0 = "ۧۨۡ۠ۚۜۘۡۚ۟ۥۜۖۦ۠ۡۘۗۘۡ۫ۖۨ"
            goto L_0x0002
        L_0x00c5:
            r4.f2583h = r6
            java.lang.String r0 = "ۗۛۙۙۙۚۢۨۢۨ۫۬۬ۤۦۘۦ۬ۦۘۤۘ۟۠ۛۢ"
            goto L_0x0002
        L_0x00cb:
            r4.f2584i = r7
            java.lang.String r0 = "ۛ۠ۖۘۖۤ۫ۘۧۖۘۥۖۨۘۖۡۨ"
            goto L_0x0002
        L_0x00d1:
            r4.f2585j = r9
            java.lang.String r0 = "ۤۘۘۘۜۜۜۘۜۖۦۘ۠۟ۘۜۡۢۤۚۜۢۥۗۢۢۥۘ"
            goto L_0x0002
        L_0x00d7:
            r4.f2586k = r8
            java.lang.String r0 = "ۨۘۦۘۚۗۤۥ۫ۖۘ۫۠ۤۧۙۖۨ۬ۙۘۥۛ۟ۖۢۜۛۥۘ"
            goto L_0x0002
        L_0x00dd:
            r4.a()
            java.lang.String r0 = "ۗۙۦۘۜۧۙ۬ۨۤۦۙۨ۬۟ۙۜۨ۠ۧۡۦ۠۬ۗ"
            goto L_0x0002
        L_0x00e4:
            r4.postInvalidate()
            java.lang.String r0 = "۠ۗ۫ۛۨۥۧ۠ۧۦ۫ۘۘۘۦۦۘ۫ۖ۠ۥۤ۬"
            goto L_0x0002
        L_0x00eb:
            java.lang.String r0 = "۠۟ۦۘۚۗۘۘۘۛۥۖۘۡ۫ۧۗۖ۫ۗۙۜ۬ۜۗ۠ۧۜۘ"
            goto L_0x0002
        L_0x00ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.whatsapp.rounded.RoundedLayoutHome.setRoundedCornerRadius(int, boolean, boolean, boolean, boolean):void");
    }

    public void setRoundingBorderColor(int i2) {
        String str = "۫ۖۘۘۖۜۙۢۦۡۗۨۘۘۡۜۘ۬ۤۨۘ";
        while (true) {
            switch ((str.hashCode() ^ 359) ^ -2107049590) {
                case -1002274240:
                    postInvalidate();
                    str = "ۜۨۡ۬۫ۨۗۘۡ۬ۤۘۘ۟ۛۘۘۜۘۜۘ";
                    break;
                case -814798319:
                    this.f2588m = i2;
                    str = "ۢۨ۬۠ۘۗۡۦ۟ۗ۬ۖۙۢۥۜۢۗ";
                    break;
                case -600036430:
                    str = "ۤۘۧۖۚۢۤۜۚۚۚۗۥۥۘۤۥۦۘۜۙۙ";
                    break;
                case -93430372:
                    String str2 = "۬ۖۖۘۨۢۦۘۤۤۡۚۨۥۘۙۛۘۗ۬ۛ۫ۘ۠ۦۡۛۢۙۥ";
                    while (true) {
                        switch (str2.hashCode() ^ -687663962) {
                            case -1612065947:
                                str = "ۜۨۡ۬۫ۨۗۘۡ۬ۤۘۘ۟ۛۘۘۜۘۜۘ";
                                continue;
                            case -772530246:
                                str2 = "۬ۢۢ۫ۦۘۨۙۦۘۦ۬ۘۘۧۢۖ۟۬ۤ";
                                break;
                            case 1390036513:
                                if (i2 == this.f2588m) {
                                    str2 = "ۖۖۨۚۤۥۦ۠ۖۘۥۙۖۘۦۤۘۘ";
                                    break;
                                } else {
                                    str2 = "ۜ۬۫۟ۖۡۘۥۨۡۘ۟ۜۥۘۥۜۦ";
                                    break;
                                }
                            case 1863400592:
                                str = "۬ۧ۫ۡۨۘ۫۠۬۫ۘۨۦۛۖ";
                                continue;
                        }
                    }
                    break;
                case -84208228:
                    str = "ۙۜ۟ۖۚۥۨۜۨۧ۬۫ۡۙ۠";
                    break;
                case 937458037:
                    return;
                case 1082976376:
                    this.f2577b.setColor(i2);
                    str = "۬ۗۛۙۤۖۥۦۖۖۚۥۧۙۖۘ۫ۦۙۜۗۥۦ۫ۙ";
                    break;
            }
        }
    }

    public void setRoundingBorderWidth(int i2) {
        float f2 = 0.0f;
        String str = "ۤ۬ۛۙۖۚۖۜۜۢ۠ۜۘۗۧ۟";
        while (true) {
            switch ((str.hashCode() ^ 162) ^ -284007904) {
                case -2102760949:
                    str = "ۢۧ۠ۙۚۗۢ۟ۛۜۘ۠ۘۗ۟ۖۤ۟ۨۧۡۘۨۗۛۘۨ";
                    break;
                case -1398671786:
                    str = "ۙۗۡۘۢۛۗۧۖۡۘۚۤۙۗ۫۟۬ۢۤۨۖۛ";
                    break;
                case -360459170:
                    f2 = (float) (i2 * 2);
                    str = "ۨ۠ۧۛۢۘۘ۫ۙۚۥۖ۬۠ۗۘۗۤۤ۬ۤۤۨۙۥۘۨۘۛ";
                    break;
                case -75439736:
                    String str2 = "ۦۦۙۦۢۖۘۛۧۚ۠ۥ۫ۙۗۤۖۙۨ۬۬";
                    while (true) {
                        switch (str2.hashCode() ^ 707416209) {
                            case -1482588670:
                                str2 = "ۨ۠ۡ۟ۖۜۥۗۙۤۙۖ۬۟ۘۗ۟ۤ۫ۖۤ";
                                break;
                            case -1239263681:
                                if (i2 == this.f2587l) {
                                    str2 = "۬ۧۖ۟ۧۥۦۧۧۤۜۘۧۥۖۘ";
                                    break;
                                } else {
                                    str2 = "۠ۚۡۡۛۘۘۖۚۘۘۧۤۛۜ۬ۜۙۘۘ۠۬ۥ";
                                    break;
                                }
                            case -892424611:
                                str = "ۖۢۢۘۨۨۙ۠ۡۥۦ۟ۙۙۜۘۛۛ۫ۥۤۖۘ۟۫";
                                continue;
                            case 1719473101:
                                str = "ۛۡ۬ۢ۠ۢۧۘۙۘۥۘ۬۟۠ۨۗۡ";
                                continue;
                        }
                    }
                    break;
                case 667135668:
                    this.f2577b.setStrokeWidth(f2);
                    str = "ۥۜۜۘۤۘۦۢۡ۫ۢ۬ۡ۫ۜۘ";
                    break;
                case 682780868:
                    return;
                case 1674098079:
                    postInvalidate();
                    str = "ۛۡ۬ۢ۠ۢۧۘۙۘۥۘ۬۟۠ۨۗۡ";
                    break;
                case 2074234932:
                    this.f2587l = i2;
                    str = "ۗۢۜۢ۠ۜۢۜۡۘۦۙۛۥ۬ۚۢۗۚ";
                    break;
            }
        }
    }

    public void setRoundingElevation(float f2) {
        String str = "۟ۚۙۡۙۢ۬ۧ۬ۢ۟ۖۘۥۜۧۘ";
        while (true) {
            switch ((str.hashCode() ^ 729) ^ 1856493367) {
                case -981909765:
                    this.f2589n = f2;
                    str = "۬ۨۘۘۚۗۨۘۤۢ۟ۧ۫ۡۖ";
                    break;
                case -965403000:
                    str = "ۨۜۚۙ۟ۡۗۨ۟ۢ۠ۨۥۛۛۨۗۦۘ";
                    break;
                case -480563102:
                    str = "ۜۖۙۤۚۦۘۘۥۧۘۚۤۨۘۢۙۨۛۖ۫ۜ۟ۧ";
                    break;
                case -172626322:
                    return;
                case 92792063:
                    setElevation(f2);
                    str = "ۦۦۡۘ۟ۗۦۜۛۘۘۥۢۨۘۗۤۨۘ";
                    break;
            }
        }
    }
}
