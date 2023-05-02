package rc.whatsapp.rounded;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.obwhatsapp.youbasha.task.utils;

public class RoundedStories extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public final Path f2621a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final Paint f2622b = new Paint();

    /* renamed from: c  reason: collision with root package name */
    public final RectF f2623c = new RectF();

    /* renamed from: d  reason: collision with root package name */
    public final float[] f2624d = new float[12];

    /* renamed from: e  reason: collision with root package name */
    public boolean f2625e = false;

    /* renamed from: f  reason: collision with root package name */
    public int f2626f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2627g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2628h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2629i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2630j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2631k;

    /* renamed from: l  reason: collision with root package name */
    public int f2632l;

    /* renamed from: m  reason: collision with root package name */
    public int f2633m;

    /* renamed from: n  reason: collision with root package name */
    public float f2634n;

    /* renamed from: o  reason: collision with root package name */
    public GradientDrawable f2635o;

    public RoundedStories(Context context) {
        super(context);
        c();
    }

    public RoundedStories(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public RoundedStories(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        c();
    }

    @TargetApi(21)
    public RoundedStories(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        c();
    }

    public final void a() {
        boolean z2 = false;
        String str = "ۤۗۜۘۡۢۡۘ۟ۛۥ۬۟۬ۢ۫ۧۤۖۡۘۛۤ۬ۜۨۢ";
        Path path = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        RectF rectF = null;
        float f4 = 0.0f;
        while (true) {
            switch ((str.hashCode() ^ 118) ^ 211918388) {
                case -1986901035:
                    path.close();
                    str = "ۛ۠ۘۘۗۢۘۘ۫ۗۖۘۤۢۖۘۧ۠ۙ";
                    break;
                case -1743639203:
                    path.addRoundRect(rectF, b(f3), Path.Direction.CW);
                    str = "۠ۢۚ۠ۡۤۧۙ۫۟ۗۨۘۢۤۢۥ۫۟ۥۘۧۡ۬ۨۛۘ۬";
                    break;
                case -910997308:
                case -849561441:
                    return;
                case -904743889:
                    String str2 = "ۜۡۖۡ۫ۥۘ۠ۘ۫ۧۘۧۘۢۡۘۛۢۛ۠ۢ۠";
                    while (true) {
                        switch (str2.hashCode() ^ -948102108) {
                            case -1400726097:
                                str = "ۨۧۚۜ۟۫ۧۜۖۜۙۜۘ۫ۤ۬";
                                continue;
                            case -1301278654:
                                str = "ۙۛۖۘ۟ۧۘۘۨۗۛۥ۫ۡۘ۬ۦ۠ۡ۬ۡۡۧۘ";
                                continue;
                            case 465892871:
                                str2 = "ۤ۠ۦۘۗۚۘ۠ۧ۬ۛۜۨۘۦۧۙۦۜۖۘۢ۬ۘۘ";
                                break;
                            case 532739416:
                                if (this.f2625e) {
                                    str2 = "۟ۘۢۥۚ۟ۨ۠ۦۘۨۨ۫ۡ۠ۙۚۘۘۙۦ۫۬ۖۢۥۧۢ";
                                    break;
                                } else {
                                    str2 = "۬ۙۥۢۗۤ۟ۤۗۡۢۜۘۜۡ۠";
                                    break;
                                }
                        }
                    }
                    break;
                case -806556723:
                    path = this.f2621a;
                    str = "ۖۤ۟۟۫ۤ۬ۥۜۘ۠ۛۧۨۨ";
                    break;
                case -626523289:
                    f4 = (float) this.f2626f;
                    str = "ۚۨۦۛ۬ۘۡۗۖۘۛۗۘۤۗ";
                    break;
                case 102725382:
                    str = "ۢۚ۬ۙۨ۫۟ۗ۟ۙۦۥۥۥۦۗ۟ۤ";
                    f3 = f2;
                    break;
                case 483467218:
                    path.reset();
                    str = "ۖۥ۟ۙۚۦۡۦۖۘۙۤۚۛۧ";
                    break;
                case 805941130:
                    str = "ۨ۟ۤۙۖۨۗۦۘۘۖۜۦۤۦۘۦ۫ۤۤۙۢۨۜۜ";
                    z2 = this.f2627g;
                    break;
                case 1047444758:
                    str = "۬ۡۤ۫ۤۜۡۤۡۘۙۡ۬۬ۛۘۨۢۦۡ۟۟ۧۨ۟ۚ";
                    f2 = Math.max(rectF.width(), rectF.height()) / 2.0f;
                    break;
                case 1131253435:
                    String str3 = "۫ۡۖۘۤۜۘۧۜۦۢۙۚۚۨۘۘۦۡۘۦۧ۟ۡۙۗۦۤ";
                    while (true) {
                        switch (str3.hashCode() ^ 1101018995) {
                            case -1350774521:
                                str3 = "ۜۛۥۡۚ۫۟ۖۘ۬ۖ۫ۖ۬ۖۘ";
                                break;
                            case -631887737:
                                if (!z2) {
                                    str3 = "ۥۚۨۘۤۙۧۖۢۡۗۚۜۢ۫ۤۤۖۨۦۡۘۖۦ";
                                    break;
                                } else {
                                    str3 = "۬ۛۗۨۚۢۖ۫ۜۘۜۧۘۚۧۡ۠ۧۘۧۤۦۘۚ۠ۚ";
                                    break;
                                }
                            case 1898309687:
                                str = "۟۫ۦۘۛۗۦۙۙۧ۠ۤۙ۬ۛۧ۫۠ۨۘ۠ۥۜ";
                                continue;
                            case 2025390546:
                                str = "ۢۚ۬ۙۨ۫۟ۗ۟ۙۦۥۥۥۦۗ۟ۤ";
                                continue;
                        }
                    }
                    break;
                case 1306909237:
                    str = "ۙۖۘۘۜۘۤۡۘۙۧۜ۟ۚۢۛ۫۬ۘۘ";
                    rectF = this.f2623c;
                    break;
                case 1429537408:
                    this.f2635o.setCornerRadii(b(f3));
                    str = "ۢۤۡۜۙۙۗۦۛۨۚۧۢۗۨۘۨۘۙۧۦۗۙۛۙ";
                    break;
                case 1550465377:
                    str = "ۘۗۜۚۙ۫ۨ۟ۦۘۜۛۦۘۧ۬ۛ";
                    break;
                case 1784147747:
                    str = "۟ۧۡۜ۟۬ۜۖۡۚۛۡۘۤ۟ۡۜ۫۟۬ۨۜۨۛۗۖۗۗ";
                    f3 = f4;
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
        String str = "ۛۦۥۨ۠ۧۚۦۘۥۨۦۥ۟ۨ";
        while (true) {
            switch ((str.hashCode() ^ 635) ^ 1035089413) {
                case -2113087788:
                    str = "ۜۨۙۚ۫ۘۘۦ۟ۦۘ۟ۡۦۘۥۖۘۘۚۦۡۧۢ۫ۤۜۦۨۘۦ";
                    break;
                case -2077465518:
                    f18 = 0.0f;
                    str = "ۛۤۘۘۥ۟ۖۘۙۦۘ۟ۖۧ۫ۜۙۤۖۧۘۥۛۢ";
                    break;
                case -2021690509:
                    String str2 = "۫ۖۜ۬ۚۛۥۛۙۛۗۛۛۗ۟۟ۥۘ۠ۦۦۘ";
                    while (true) {
                        switch (str2.hashCode() ^ -510095870) {
                            case -159916622:
                                str = "ۡۧۛۚۜ۟۠ۗۨۘ۟ۧۖۘ۬ۚۥۘ";
                                continue;
                            case 970763335:
                                str = "۠ۗۖ۠ۤۜ۟ۖۘۡۖۜۘۛ۟ۖۚۛۜۘۗۨۗۖۖۨۘ";
                                continue;
                            case 1452751260:
                                str2 = "ۦ۬ۚۛۗۛۨ۠ۨۘۗۤۦ۬ۦۜۧۤ۠ۗۙۜۘ";
                                break;
                            case 1755402813:
                                if (!z5) {
                                    str2 = "ۛ۫ۦۘ۬ۜ۟ۥۗ۟۟ۢۥ۬ۜۧۢ۠ۢۛۜ";
                                    break;
                                } else {
                                    str2 = "ۚۤۢۧۜۧۘۙۚۡۘۢۨۗۤۤۛۖۥۘۨۦۘۘۤۗۘ";
                                    break;
                                }
                        }
                    }
                    break;
                case -2014454205:
                    f10 = 0.0f;
                    str = "ۧ۫ۥۘۜۙۡۥۨۧۘۦۥۤۙۗ۫ۥ۫ۦۘ";
                    break;
                case -2006178494:
                    str = "ۖ۬۫ۥ۠۟ۖۚۨ۟۟۟۟ۗ۠ۨۡۨۛۛۥۗۢۘۘ";
                    f11 = f9;
                    break;
                case -1900429321:
                    z5 = this.f2631k;
                    str = "۟ۙۢۧۜۨۤ۬ۖۘ۠ۧۦۘۡۛۨۘ۠ۤۖ";
                    break;
                case -1705712685:
                    str = "ۘ۬ۦۘۨۨۗ۠ۘۜۘۦۨۖۦۡۨۘ";
                    f16 = f14;
                    break;
                case -1691492512:
                    z4 = false;
                    str = "ۡۖۙ۟ۥۜۤ۫ۘۘۥۦۡ۟ۨۧۗۖۥۘۜ۬";
                    break;
                case -1642591874:
                    str = "۫ۚۘۘۥۗۤۛ۫ۘۘۘ۟ۗۛۥۚۚۛۢۘۥۘ";
                    f8 = f6;
                    break;
                case -1599957061:
                    str = "۟ۗۢۚۘۦۘۤۡۦۜۨۘۘ۬۫ۘ";
                    i3 = i2;
                    break;
                case -1483017976:
                    String str3 = "ۨۚۧۡۖۦ۠ۨ۬۠ۥۛ۟ۖ۬ۢۖۜۛ۬";
                    while (true) {
                        switch (str3.hashCode() ^ -1013697179) {
                            case -1145928530:
                                str = "ۢ۠ۗۤۢۢۖۖۜ۬ۖ۫ۢۢ۬ۚۧۜۘۗۖ۫";
                                continue;
                            case 931401920:
                                str = "ۢۘۛۛۙۗۥۨ۠ۛۘۜۘۡ۫ۥۙۜۙ";
                                continue;
                            case 1442458007:
                                if (!z3) {
                                    str3 = "ۥ۟۠۟ۜۗ۟ۗۥ۬ۡۜۘۨۦۛۤۥۙ";
                                    break;
                                } else {
                                    str3 = "ۖۙۗۦ۬ۖۘۧۗ۬ۡۡۦۘ۬ۙ";
                                    break;
                                }
                            case 1776309946:
                                str3 = "ۥۧۥۚۦ۬ۚۛۥۘۗۧۥۘۜۗۜۚۦۦۘۥۧۘۗۧۧۗۥۥ";
                                break;
                        }
                    }
                    break;
                case -1358562717:
                    str = "۠ۤۘ۟ۗۡۙۦ۬۬ۤۙۡۨۗۗۧ";
                    break;
                case -1324485024:
                    str = "ۢۢۙۢۨۘۜۦۙۙۙۛۖۙۥۘۗۨۦۘۙۙۡ";
                    f20 = f2;
                    break;
                case -1272029538:
                    str = "ۧۡۡۘۤۢ۠ۘ۟ۘ۠۫ۗ۠ۨۦۖۨۢۤۢۢ۫ۖۜ";
                    f16 = f15;
                    break;
                case -1252283435:
                    fArr[5] = f16;
                    str = "ۚ۟ۖۧ۬۫۠ۙۘۘۖۜۘۢۜۧۧ۠ۧۡۧ۫ۦۦۦۢ";
                    break;
                case -1112342582:
                    str = "ۛۡۥۘۧ۬ۨۙۤۗ۬۟۟۬ۜۡۘۙ۫۠ۚۢۘۘۚ۬ۜۘۡۢ۟";
                    f20 = z8;
                    break;
                case -1105179274:
                    f4 = 0.0f;
                    str = "ۛۙۨۘۗۨۡۚۛۖۘ۠ۨۚۥۤ۟ۗۤ۠";
                    break;
                case -1010539330:
                    f7 = 0.0f;
                    str = "۬ۚۚۦۚۦۡۧۖۘۙۛۨۙۥۖۘۙۜۛ۟۟۟ۤۘۘ";
                    break;
                case -989759394:
                    str = "۟۠۟ۜ۟ۘۘۧ۟ۦۘۦۗۗ۟ۥۗۛ۫";
                    f5 = f4;
                    break;
                case -973268286:
                    z7 = this.f2630j;
                    str = "ۜۡۜۘۖۖۚۥ۫ۙۡۙۡۘ۠ۡۢۙۜۥۡۢۦۘۦۜۨۘۜۛۢ";
                    break;
                case -848536139:
                    str = "ۙۡۛۦۙ۠ۘ۠۬ۚۢۡۘۛۦۘۘۦ۬ۡۘۧۗ۟ۤۥۦۙۤ۠";
                    f19 = f18;
                    break;
                case -843071232:
                    fArr[0] = f5;
                    str = "ۥۛۨۙۡۧۖۗۜۗۨۘ۫ۦۗ";
                    break;
                case -728527921:
                    fArr[3] = f13;
                    str = "ۨۛۙ۟ۨۨۘۡ۟ۦۘۥۤۙ۫ۗۦۘ";
                    break;
                case -682114780:
                    str = "ۧۡۡۘۤۢ۠ۘ۟ۘ۠۫ۗ۠ۨۦۖۨۢۤۢۢ۫ۖۜ";
                    break;
                case -576682748:
                    str = "ۛ۬ۦۘۨۗۦ۫ۗۚۤۚ۟ۗۘ۬";
                    f5 = f3;
                    break;
                case -561708106:
                    z6 = false;
                    str = "ۧۡۡۡۖۜۘۚۜۛۡ۫۟ۤۤۜۘ";
                    break;
                case -476254051:
                    str = "ۛۡۥۘۧ۬ۨۙۤۗ۬۟۟۬ۜۡۘۙ۫۠ۚۢۘۘۚ۬ۜۘۡۢ۟";
                    break;
                case -412527708:
                    str = "ۡۦۦۢۖۖ۟ۨۤ۠ۤۨۘۗ۟ۛۚۦۨۢۡۘۗۘۘۢۘۥ";
                    f3 = f2;
                    break;
                case -386067586:
                    str = "ۢۥۧۤۚۥ۬ۦ۟ۢۜۖۘۛ۟۫ۡۢۛۢۛۢۜۧۡۡۖۖۘ";
                    f14 = f2;
                    break;
                case -211272427:
                    z3 = this.f2629i;
                    str = "ۚۧۖۘۜۜۢۘۤۨۘۢۗۦۜ۟ۛۗۢۗۥۥ";
                    break;
                case -205908397:
                    String str4 = "ۧۨۧۙۢۥۘۖۗۗۘ۟۬۟ۡ۬";
                    while (true) {
                        switch (str4.hashCode() ^ -380253073) {
                            case -941567294:
                                str = "ۙۥ۠ۢ۟ۦۘۜۥۖ۫ۤۤۦ۬۟";
                                continue;
                            case -595692041:
                                str = "ۡۗۥۘۘۙۧۜۧۥۘۥ۫ۢۛ۫ۡۧۖۘ۫ۗۥۖۖۘۨۗۥ";
                                continue;
                            case -23944746:
                                if (!z3) {
                                    str4 = "ۘۗۡۨۥۖۘۘ۫ۘۙۢۖۖۡۧۘۛۗۗۙۦ۫ۦۥۡ۠۬ۦۘ";
                                    break;
                                } else {
                                    str4 = "ۧۢۦۘۨۛۥۧۘۜۘ۠ۖۧۨۢۢۛ۟ۛ۫ۢۘۡۙۘ";
                                    break;
                                }
                            case 1671752226:
                                str4 = "ۢۖۦۘۖۢۘۘ۫ۦۖ۫۟۠ۥۛۦ";
                                break;
                        }
                    }
                    break;
                case -143130151:
                    str = "ۘۙۧۧۙ۬۟ۢۦ۫ۚۜۘۗ۬ۗۚۖۜۘۨۘۡۖۧۘۢ۫ۛ";
                    f9 = f2;
                    break;
                case -100424777:
                    fArr[1] = f8;
                    str = "ۚۤۨ۠ۚۘۘ۠ۚۜۥۙۛ۫ۛ۠ۚۘ۬ۛۤۢ۠ۡۘۚۘۢ";
                    break;
                case -37562593:
                    str = "۠ۛۖۚ۫ۚۧۥۨۢۗۡۖۡۙ۠ۚۡ";
                    f11 = f10;
                    break;
                case 139020766:
                    String str5 = "ۚ۫ۛۖۦ۬ۜۡۖۘۖ۠ۨۘ۟ۢۥ";
                    while (true) {
                        switch (str5.hashCode() ^ 712108524) {
                            case -1791691677:
                                if (!z7) {
                                    str5 = "ۖۢۘ۟ۢۥۘۨ۬۫ۥ۠ۜ۫ۖ۬";
                                    break;
                                } else {
                                    str5 = "ۤۡ۠ۙۢۜۧۘۢۛ۟ۥۛ۟ۦۘۗۙ";
                                    break;
                                }
                            case -1376760823:
                                str = "۠ۥۧ۬ۨۖۥۦۤۚ۫ۦۘۡ۟ۘ";
                                continue;
                            case -1294436492:
                                str5 = "ۤۚۜ۠ۗۢ۟ۡ۬ۖۗۢۘۙ۠ۢۡۥۜۛۦۢۜۘۦۚ";
                                break;
                            case 1270981570:
                                str = "ۥ۟ۡۦ۫ۚۛۥۖۘۤ۟۫ۡ۟ۜۘۡۥ۬۟۟ۘ۠ۢۨۜ۟ۦۘ";
                                continue;
                        }
                    }
                    break;
                case 166011620:
                    f15 = 0.0f;
                    str = "۟ۘ۫۠۠ۘۘۛۡۚۚۥۡۘۧ۬ۘۘ۠ۘۤۛ۟ۧ";
                    break;
                case 198498781:
                    String str6 = "ۢۖۛۡ۠ۦۢۢۘ۬ۜۡۘ۬ۢۧ۟ۤۤۗۘ۬۫ۧۤ";
                    while (true) {
                        switch (str6.hashCode() ^ 95030720) {
                            case -1781181271:
                                str = "ۡ۬ۛۖۛۥۘ۫ۗۢۤ۟ۜۘۤۖۘۘ۟ۦۛۢۚۨ۬ۖۥ۬ۢ";
                                continue;
                            case -1431629814:
                                if (!z2) {
                                    str6 = "ۛ۫ۛۨۦۖۘۥۤۥۘۛۘۨ۫۬۫ۚۢۗۖۜۤۜ۠۠ۢ۟ۘ";
                                    break;
                                } else {
                                    str6 = "۟۟ۜۥۧۖۧۙۥۡۘۛۦۚ";
                                    break;
                                }
                            case -1381821622:
                                str = "ۚۘۘۨۡۘۖۧ۟ۨۜۦۗۧۖۤۘۥۘۤۨۨ";
                                continue;
                            case 849484573:
                                str6 = "۟۬ۥۘۛۖۗۚۜۘۨۜۘۙۖۤ۬ۤۘۖۤۚ";
                                break;
                        }
                    }
                    break;
                case 305056207:
                    str = "ۡۜۛۗۛۗۨ۬ۨۘۗۧۦۘۜۧۖۘۥۨۧۘ";
                    f13 = f12;
                    break;
                case 418620472:
                    fArr = this.f2624d;
                    str = "ۛ۬ۜۘۧۗۜۘۖۖۜۘ۬ۡۚۤۜۨۘ۬ۙۥۗۛۢ";
                    break;
                case 458874268:
                    str = "۫۫ۨۘۦۤ۫ۚ۟ۦ۬ۡۖۘۙۦۙۙ۫";
                    break;
                case 482680043:
                    fArr[4] = i3;
                    str = "۟۬ۧۜۜۢۜۚ۟ۨ۫ۧۚۤ۠ۜۜۢ۟۫۫۟۬ۢ";
                    break;
                case 548870079:
                    String str7 = "ۢۥۦۜۜۥۧۡۨۘۖ۬ۤۦۜۛۙۖ۠ۚۘۢ۫ۖۘۧۗۘۘ";
                    while (true) {
                        switch (str7.hashCode() ^ -1777067651) {
                            case -1329425881:
                                str7 = "ۖۨ۫ۙۙۥۘ۫ۦۡۗۛۚ۫ۧۙۤۚۛۥۢۡۛۖۘۘ";
                                break;
                            case -1189159962:
                                str = "ۦۚ۟۠ۥۘۨۡۚۦۖۧۘۧۤۛ۫۫ۡۙۢۛۛۡۘۡۤۚ";
                                continue;
                            case -478648871:
                                str = "ۢۢۖۘ۠ۜۘۘۡ۫ۨۛۨ۬۫ۧۜ۫ۛۨ۫ۜۢۢ";
                                continue;
                            case 1492799428:
                                if (!z2) {
                                    str7 = "۫ۚۜۚۤۡۘۤۘ۫ۧۧ۠ۨۗ۬ۨۥ۠ۘۙۨۘ۠ۢۥۘۖۦۗ";
                                    break;
                                } else {
                                    str7 = "ۧۦۢۥۘۨۧۚۙۤ۠ۨۖۙۚۤۨۡۘ";
                                    break;
                                }
                        }
                    }
                    break;
                case 621978544:
                    fArr[6] = f19;
                    str = "ۧۛۗ۠ۧۘۘ۠۟ۖۤۜۧ۫ۧۥۘ";
                    break;
                case 644921593:
                    str = "ۙۡۛۦۙ۠ۘ۠۬ۚۢۡۘۛۦۘۘۦ۬ۡۘۧۗ۟ۤۥۦۙۤ۠";
                    break;
                case 668111253:
                    fArr[7] = f20;
                    str = "ۗۡ۠ۖۜۡۗۡۡۜۦۜۢۘۘۚۖ۬ۙۜۙۤۗۥۘ";
                    break;
                case 762823632:
                    str = "ۘۨۘۘ۠ۡۖۘۧۘۥۧ۠ۙۡۗۘۥۥۥۘۜ۠۬ۜ۟ۦۘ";
                    f19 = f17;
                    break;
                case 793826264:
                    z8 = false;
                    str = "ۥۧۤۙۘۨۘۜۗۙۛۖۦۘ۫ۗۡۘۚ۠ۗ";
                    break;
                case 912792138:
                    str = "ۢ۬ۨۚۙۚۡ۟ۢۡ۟ۜۘۗ۬ۛ";
                    i2 = f2;
                    break;
                case 1103392823:
                    fArr[2] = f11;
                    str = "ۧ۠ۤۛ۫ۘۘ۫ۗۥۖ۟ۨۧۡ۬۫۫ۖۘ۬۠ۨۘۗۚۥ۫ۘۥ";
                    break;
                case 1105189358:
                    str = "ۦۦۧۘۤ۬ۖ۬ۜ۬ۨۡۚ۫ۖۘۥۖۚۧۘۗۡۖۘ۬ۖۚ";
                    i3 = z6;
                    break;
                case 1155126240:
                    z2 = this.f2628h;
                    str = "ۨۡ۫ۤۨۨۘۛۤۥۘ۠ۤ۫۬ۤۗۘۧ۬ۗۗۙ۠۬ۗۛۧ";
                    break;
                case 1184864879:
                    String str8 = "ۖ۠ۥ۟ۗۥۤ۠ۘۘۖ۫ۤۤۖۡۚۢۘۘۢۡۢ۠ۢۖۤۨۜ";
                    while (true) {
                        switch (str8.hashCode() ^ -688518542) {
                            case -221697055:
                                str8 = "ۛۨۢۨۙ۟ۖۚ۟ۥۜۤۙۤۢۛۧۨۡۢۘ۠ۖۖۘ";
                                break;
                            case -108014109:
                                if (!z7) {
                                    str8 = "ۙۥۡۘ۠ۘۧۛۙۥۘۘۛ۠ۡۡۘۤۛۧ";
                                    break;
                                } else {
                                    str8 = "ۧۦۦۖ۠ۨ۫ۥۗۧۦۘۘۗۖۡۜۢۖ";
                                    break;
                                }
                            case 965874442:
                                str = "۟ۘۗۖۨۖۘۢۥ۬ۙۙۙۙ۬ۦۘۢ۠ۡۘۖۤۢۜۧۘۘۨ۫ۘۘ";
                                continue;
                            case 2111046925:
                                str = "۬ۧۙۙۗۤۤۜۢۗۨۖ۠ۥ۟ۘۦ۟ۖۨۘۘۖۢۚ۬ۘۨۘ";
                                continue;
                        }
                    }
                    break;
                case 1190883078:
                    str = "ۨۗۡۘۧۡۢۜ۟ۡۘۖ۬ۤ۬ۡۛۜۦۘ۠ۜۧ";
                    f12 = f2;
                    break;
                case 1197421280:
                    str = "ۘۜۜۙ۠ۡۘۤۧۥۜ۟۬۬۫ۧ۠ۦۖ۟ۚ۬ۙ۬ۡۘۢۥۙ";
                    f6 = f2;
                    break;
                case 1542270820:
                    String str9 = "ۨۥۦۘۧۖۗ۬ۚۥۙۦۘۥۘۡۘ۠ۡۡۙ۟ۢۚ۫ۡۘۛۜۜ";
                    while (true) {
                        switch (str9.hashCode() ^ 714934121) {
                            case -58630423:
                                str = "ۥۢ۟ۦۦۚ۬ۥۚۨۨ۠ۘۡۘۦ۫ۢ۟ۡۛ";
                                continue;
                            case 297895945:
                                if (!z5) {
                                    str9 = "ۖۤۤۧۧۗ۠ۖۚۤۖۘ۟ۗۤۖۤۧۦ۫ۜۘۦۛۖ";
                                    break;
                                } else {
                                    str9 = "ۢۢۖۘۖۜۖۘۢۥۥۘۚۧۗۙۤۘۘۦۡۘۘۧۧۙ";
                                    break;
                                }
                            case 512703584:
                                str9 = "ۦ۠ۘۘۙ۠ۦۙۖۨۘۦۦ۠ۙۚۘۨۧۨ";
                                break;
                            case 680319641:
                                str = "ۧۜۗۤۡۥۥ۬ۧۛۢۛۨ۠ۚ";
                                continue;
                        }
                    }
                    break;
                case 1670747170:
                    str = "۟۠۟ۜ۟ۘۘۧ۟ۦۘۦۗۗ۟ۥۗۛ۫";
                    break;
                case 1724654313:
                    str = "۠ۤۘ۟ۗۡۙۦ۬۬ۤۙۡۨۗۗۧ";
                    f8 = f7;
                    break;
                case 1763168615:
                    str = "ۜۨۙۚ۫ۘۘۦ۟ۦۘ۟ۡۦۘۥۖۘۘۚۦۡۧۢ۫ۤۜۦۨۘۦ";
                    f13 = z4;
                    break;
                case 1790681216:
                    str = "ۦۦۧۘۤ۬ۖ۬ۜ۬ۨۡۚ۫ۖۘۥۖۚۧۘۗۡۖۘ۬ۖۚ";
                    break;
                case 1826177221:
                    str = "ۢۥۜۚۧۧ۟ۘۨۚ۟ۤۙ۟ۚۚۧ۬ۥۗ";
                    f17 = f2;
                    break;
                case 1903419024:
                    return fArr;
                case 2075074881:
                    str = "۠ۛۖۚ۫ۚۧۥۨۢۗۡۖۡۙ۠ۚۡ";
                    break;
                case 2097729437:
                    str = "۠۫ۦۨ۟۠۟ۡۡۘۢۙۚۛۘ۬ۡ۬ۦۜۚۤ";
                    break;
            }
        }
    }

    public final void c() {
        Paint paint = null;
        String str = "ۦۦۛۖۧۙۗۡۘۧۘۢۘۛۡۚۤۖ";
        while (true) {
            switch ((str.hashCode() ^ 38) ^ -234604601) {
                case -1751791831:
                case -1554347074:
                    return;
                case -1590930572:
                    String str2 = "ۖۦ۫ۗۜۜۘۛۥۨۡۙ۫ۨۨ";
                    while (true) {
                        switch (str2.hashCode() ^ 481315911) {
                            case -1594889834:
                                if (!isInEditMode()) {
                                    str2 = "۟ۡۖۘۜۧۨۘۛۖۖۘۧۢۧۨۧۧ";
                                    break;
                                } else {
                                    str2 = "ۜۚ۟ۚۗۡۘۜۢۤۚۡۤۚۜۧۜۜ۬ۤۤ";
                                    break;
                                }
                            case -1549543969:
                                str = "ۥۛۙ۫ۘۛۦۘۤۘۨۜۘ۫۟ۗ۬۟ۨ۫۠ۧۢۥ۟۠۠ۨ";
                                continue;
                            case -1409595652:
                                str2 = "ۖۙ۠ۙۨۗ۫ۤ۬ۧۛ۠ۚۢ۫ۙۖ۫ۥۚ۟";
                                break;
                            case 1306513084:
                                str = "ۚۘۘۘۜ۫ۦۢۥۧۘۖ۫ۛۛۘۘۘ۫ۚۦۘۜۡۤ";
                                continue;
                        }
                    }
                    break;
                case -1514154309:
                    this.f2629i = true;
                    str = "۠ۖ۟ۧۦۢۙۨۘ۠۟ۥۘۙۜۖۧۜۘ";
                    break;
                case -1266988016:
                    this.f2630j = true;
                    str = "ۗۛۘۘۜۚ۬ۡۛۘۢۢۥۘۢۚۘۘ۬ۡۡۚ۬ۚ";
                    break;
                case -928404794:
                    paint.setColor(this.f2633m);
                    str = "ۙ۠ۡۘۤ۠۠ۛۥ۟ۚۤ۬ۦۨۘۦۢۖ۫ۖۚۡۖۜۛۢۗ";
                    break;
                case -746881197:
                    paint.setAntiAlias(true);
                    str = "ۙۡۜۘۙۤ۟ۡۘۙ۬۬ۡۨۥۖۘ۟ۢۘ";
                    break;
                case -707847202:
                    this.f2635o.setCornerRadii(b((float) this.f2626f));
                    str = "ۘۦۥۘۘۙ۫ۨ۬ۙ۠ۧۘۗۖۖۘۚۛۖۘ۟ۘۥۘۧۙ۬۠ۚ";
                    break;
                case -537413900:
                    this.f2632l = 0;
                    str = "ۘۢۥۧ۬ۖۘۧۙۜۘۛۢۘۡ۠ۢۗۚ۫ۛ۠ۖۤ۟ۗۦۦۦ";
                    break;
                case 206337716:
                    this.f2633m = 0;
                    str = "ۜۙۜۘۛ۟۬۟ۧ۟ۜۜ۠ۙ۬ۨۤۥۜۘۚۛۨۘۙۚۘ";
                    break;
                case 307139345:
                    paint.setStrokeWidth((float) (this.f2632l * 2));
                    str = "ۜۘۖۜۘۜۘ۬ۡۖۗۚۦۘۢۖۦ";
                    break;
                case 448147046:
                    paint = this.f2622b;
                    str = "ۨ۫ۖۧۘۘۖ۬ۜ۟ۛ۟ۧۨ";
                    break;
                case 510660813:
                    this.f2634n = 0.0f;
                    str = "ۖۘ۠ۜۧ۫۫ۦۙۚۧ۟۟ۛۥۘ";
                    break;
                case 1434099008:
                    paint.setStyle(Paint.Style.STROKE);
                    str = "ۡۗ۫۟ۦۤ۠ۨۜۖۙۘۘۡۖ۫ۖ۟ۖۚۛۜۦۙۧۖۧۘۘ";
                    break;
                case 1466660952:
                    this.f2626f = utils.dpToPx(38.0f);
                    str = "ۖۢۧۗۨ۟ۜۦۗ۟۠ۛ۬ۗۨۘ";
                    break;
                case 1499780762:
                    this.f2631k = true;
                    str = "۬ۦ۟ۤۨۦۘۥۤۥۘۙۖۖۘۖۛۚۖۢۘۘ";
                    break;
                case 1567888324:
                    setRoundingElevation(0.0f);
                    str = "۫ۜۨۘۗۜۚۥۡ۫ۡۗۡۗۘۖۛۦۦۘۖۨۥۘ";
                    break;
                case 1841535162:
                    this.f2627g = true;
                    str = "ۜۡۦۘۖ۬ۧ۫۟ۙۖۛۦۡۨۨۘ۬۫۫ۗ۬ۚۚۙۦ";
                    break;
                case 1842976256:
                    this.f2628h = true;
                    str = "ۥۛۢۖۦۢۜۙۜۛۤۡۘۤۚۜۡ۟ۥ";
                    break;
                case 2039847839:
                    str = "ۜۜۖۤۨۥۤ۠ۘۨۚۖۘ۬ۜۙ۫ۚۨ";
                    break;
                case 2042552719:
                    setBackground();
                    str = "ۤۖۥۛۜ۫ۧۜ۟ۨۢۦۢۘۨۘ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006d, code lost:
        r0 = "ۙۛ۫ۙۢۦۘۥۥۜۘۜۙۥۘۜۧۢۛ۠ۨ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r6) {
        /*
            r5 = this;
            r1 = 0
            java.lang.String r0 = "۫ۡۗۦۗۦۘ۟۠ۤ۠ۢۦۘۡۤۘۘ۫ۜۘ"
        L_0x0003:
            int r2 = r0.hashCode()
            r3 = 754(0x2f2, float:1.057E-42)
            r4 = 1619623668(0x60897ef4, float:7.9261E19)
            r2 = r2 ^ r3
            r2 = r2 ^ r4
            switch(r2) {
                case -1716249574: goto L_0x0070;
                case -937914215: goto L_0x001d;
                case -635317501: goto L_0x0018;
                case -457958555: goto L_0x0047;
                case -239569257: goto L_0x0012;
                case 465466180: goto L_0x0029;
                case 677404606: goto L_0x0023;
                case 794571411: goto L_0x0065;
                case 821301280: goto L_0x0015;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x0003
        L_0x0012:
            java.lang.String r0 = "۫۠ۥۜ۠ۗۘۙۡۨۜۛۛۚۢۙۚۙۨۘۖۘۙۚۘ"
            goto L_0x0003
        L_0x0015:
            java.lang.String r0 = "۠ۥۛ۫ۚۧۥۡۡ۟ۙۜۢۜۦۡۛۘۘۤۢۘۘ"
            goto L_0x0003
        L_0x0018:
            android.graphics.Path r1 = r5.f2621a
            java.lang.String r0 = "۬ۦۦۘۚۢ۬ۘ۫ۗ۠ۜۨ۠ۖۘۢۥۗۖ۟ۚ"
            goto L_0x0003
        L_0x001d:
            r6.clipPath(r1)
            java.lang.String r0 = "۬ۚۦۘۗۚۢۤۙۖۘۖۘۛۛۛ۬ۡ"
            goto L_0x0003
        L_0x0023:
            super.draw(r6)
            java.lang.String r0 = "۠۫ۜۘۛۜۧۘ۫۟ۥۘۦۖ۟ۙۖۙۛ۠ۛۢۙۖۘ"
            goto L_0x0003
        L_0x0029:
            r2 = -359366268(0xffffffffea948184, float:-8.976632E25)
            java.lang.String r0 = "ۦۘۜۥۨۖۛ۫ۦۘۢۡۘۙۛۘۘۜ۟ۥۚ۟"
        L_0x002e:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -136402628: goto L_0x006d;
                case 367364435: goto L_0x0037;
                case 473920731: goto L_0x0044;
                case 618230558: goto L_0x0041;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x002e
        L_0x0037:
            int r0 = r5.f2632l
            if (r0 <= 0) goto L_0x003e
            java.lang.String r0 = "۬ۜ۟ۤ۫ۖۛۨ۫ۗۛۢۥ۫ۛ۬۠ۖۘ۟ۜۨۧۥۘ"
            goto L_0x002e
        L_0x003e:
            java.lang.String r0 = "ۢۥۤۜۙۘۘۚ۬ۢ۫ۦۦۘۖۚ۬ۜۖۥۚۘۘ"
            goto L_0x002e
        L_0x0041:
            java.lang.String r0 = "ۧۡۡۘۘ۫۫ۥۤۥ۠ۖۖۨ۠ۥۘۚۛۦۨۘۡۘ۬ۥۘ"
            goto L_0x002e
        L_0x0044:
            java.lang.String r0 = "۫ۚۗ۠ۡۤ۟ۚۥۘ۬۫ۙ۬ۗ۟"
            goto L_0x0003
        L_0x0047:
            r2 = -446817317(0xffffffffe55e1bdb, float:-6.555495E22)
            java.lang.String r0 = "ۙۙۨۘۧۖۗۛۗۘ۟ۨۖ۠۫ۧۗۦۜۨۢۨ۫ۘ"
        L_0x004c:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1440541350: goto L_0x005b;
                case -1339815620: goto L_0x006d;
                case 462389216: goto L_0x0055;
                case 1462138762: goto L_0x0062;
                default: goto L_0x0054;
            }
        L_0x0054:
            goto L_0x004c
        L_0x0055:
            java.lang.String r0 = "۟۫ۡۘۛ۠ۚۚۙۧۢۢۥۘۘ۟ۗۧ۟ۙۜۖۦۘۢۖۗۛۥۘ"
            goto L_0x004c
        L_0x0058:
            java.lang.String r0 = "ۗۢ۠ۙۚۘ۬ۙۧۤۢۦۘۘۚۥۤ۫ۨۜۡۧۘۗ۠ۖۘ"
            goto L_0x004c
        L_0x005b:
            int r0 = r5.f2633m
            if (r0 == 0) goto L_0x0058
            java.lang.String r0 = "ۢۨۡۡۦ۟ۡۧۙ۫ۘۤۙۢۧ"
            goto L_0x004c
        L_0x0062:
            java.lang.String r0 = "۟ۨۙۤۡۧ۫ۖۦۦ۬۫ۙۙۨۧۘ"
            goto L_0x0003
        L_0x0065:
            android.graphics.Paint r0 = r5.f2622b
            r6.drawPath(r1, r0)
            java.lang.String r0 = "ۙۛ۫ۙۢۦۘۥۥۜۘۜۙۥۘۜۧۢۛ۠ۨ"
            goto L_0x0003
        L_0x006d:
            java.lang.String r0 = "ۙۛ۫ۙۢۦۘۥۥۜۘۜۙۥۘۜۧۢۛ۠ۨ"
            goto L_0x0003
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.whatsapp.rounded.RoundedStories.draw(android.graphics.Canvas):void");
    }

    public int getRoundedCornerRadius() {
        String str = "ۢۥۧۘۙۚ۠ۤۨۦۘۖ۠ۖۘۢۛۡۜ۬ۖۘ";
        while (true) {
            switch ((str.hashCode() ^ 453) ^ 248365256) {
                case -1837971936:
                    str = "۫ۗۛ۟ۤۢۤۡۘۧۙۥۘۨۖۜۘۖۙۦۘ۠۫ۛ";
                    break;
                case 1029430130:
                    return this.f2626f;
            }
        }
    }

    public int getRoundingBorderColor() {
        String str = "۠۟ۜۛۤۥۜۖ۫ۢۙۜۘۘۧۧۚ۫ۜۚۧۢ۬ۗۨۡۡۥۘ";
        while (true) {
            switch ((str.hashCode() ^ 216) ^ 1852013457) {
                case -494580550:
                    str = "۫ۡۙۡ۬ۨۚۤۨۖۨۤ۬۫۟ۨۤۢۧۧ۬ۨۚۥۨۚۤ";
                    break;
                case 1651657118:
                    return this.f2633m;
            }
        }
    }

    public int getRoundingBorderWidth() {
        String str = "ۚ۟ۖۧۚۥۚۖۜۘ۟ۜۧۘۗۚۦۘۛۤ۠ۨۧۡ";
        while (true) {
            switch ((str.hashCode() ^ 932) ^ -188691906) {
                case -1884858932:
                    return this.f2632l;
                case 149954429:
                    str = "ۥ۟۟۬ۡۥۘ۬ۚ۬ۗۡۗۘۗۥ۫ۢۡۥۡۙۚۡ۠ۚۢۚ";
                    break;
            }
        }
    }

    public float getRoundingElevation() {
        String str = "ۧۚۜۗۖۛۥۖۙۨۗۥۗۢۦۘۜۤۗ۟۬ۘ";
        while (true) {
            switch ((str.hashCode() ^ 416) ^ -1571681778) {
                case -1290520634:
                    return this.f2634n;
                case 1657885972:
                    str = "ۨۥۘۡ۬۬ۖ۬ۥۢۦۤۘۘۖۜۙۤ";
                    break;
            }
        }
    }

    public boolean isRoundAsCircle() {
        String str = "۫ۤ۠ۢۘۧۖۨۖۘۗۡۡۘۖۨ";
        while (true) {
            switch ((str.hashCode() ^ 93) ^ 2105437483) {
                case -438864537:
                    str = "ۤ۟ۡ۠۠ۧۧۜۧۜۢۡ۬۟ۖ۫";
                    break;
                case 2108954148:
                    return this.f2627g;
            }
        }
    }

    public boolean isRoundBottomLeft() {
        String str = "ۧۖۥۗۧۘۘ۠ۤۖۘۘۦۢۡۗۥۘ۫۫ۡۘ";
        while (true) {
            switch ((str.hashCode() ^ 562) ^ -60025518) {
                case -1700567064:
                    str = "ۜۤۦ۠۫۠ۛ۫ۖۘۦۨۧۘۡ۟۫ۘۥۥ۟ۚۘ";
                    break;
                case 1212391606:
                    return this.f2630j;
            }
        }
    }

    public boolean isRoundBottomRight() {
        String str = "ۡۛۖۘ۟ۖۖۘ۫ۖۛۙۖۛۢۤ۠ۥۡ۬ۘۡۘۖ۫ۜۘ";
        while (true) {
            switch ((str.hashCode() ^ 931) ^ -1510701653) {
                case -2030814070:
                    return this.f2631k;
                case -729366269:
                    str = "۫ۨۨۘۡۤۜ۠ۚۨۜۢۙۙ۬ۖۥ۟ۙۙۥۤۖۦ۬ۘۗۦۘ";
                    break;
            }
        }
    }

    public boolean isRoundTopLeft() {
        String str = "ۖۨۛۚۦ۟ۦ۫ۥۘۚۢ۠ۘۥۥۘۨ۬ۦۘ";
        while (true) {
            switch ((str.hashCode() ^ 814) ^ 2120750652) {
                case 535844256:
                    return this.f2628h;
                case 1773313598:
                    str = "۠۬ۖۘۚۛۖۚۘۦ۫ۜ۠ۜۖۚ";
                    break;
            }
        }
    }

    public boolean isRoundTopRight() {
        String str = "۠ۖۜۘۚ۟ۡۘۜۦۚۥۛۜۗۦۧۥۥۧۘ۟ۡۥۘۦۗۗۗۘ۠";
        while (true) {
            switch ((str.hashCode() ^ 713) ^ 1057828182) {
                case -601632821:
                    return this.f2629i;
                case 1731764300:
                    str = "ۤ۟ۥۧۤۚۤۢۡۖۜۨۢۗۡ۠ۚ";
                    break;
            }
        }
    }

    public void onAttachedToWindow() {
        String str = "ۜۚۖۘۛۙۡ۫۠ۦۢۜۙۦۧۘۘۗۦۡۙ۟ۥ";
        while (true) {
            switch ((str.hashCode() ^ 70) ^ 844273087) {
                case -2110014379:
                    this.f2625e = false;
                    str = "ۤۘۡۦۨ۬ۗ۟۠ۜ۟۠ۢ۟ۖ۫۠ۢۥۧۜ";
                    break;
                case -885530243:
                    return;
                case -177484602:
                    str = "ۨۗ۬ۖۨۛۢۦۘ۫ۛۥۤۦۡۘۢۜ۬ۗۜۘۚۢۨۙ۟ۥۘ";
                    break;
                case 673290187:
                    super.onAttachedToWindow();
                    str = "ۗۤۗۦۡۖۘۤۦۨۘۛۛۥۘۚۘۖ";
                    break;
            }
        }
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        String str = "ۨۜۖۨۧۦۦۙۘۛۢۜۘۡۡۨۘۘۛۜۜۜۦۘ";
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (true) {
            switch ((str.hashCode() ^ 945) ^ 1966093267) {
                case -1979495405:
                    super.onLayout(z2, i2, i3, i4, i5);
                    str = "ۗ۫ۥۘۧ۬ۡۢۙ۬ۗۘۗ۫۫ۜۢۜۧۘۧۜۘۧۙۨۘۤۡۨۘ";
                    break;
                case -1968203277:
                    String str2 = "۠ۨۜۘۚۤۨۘۗۗ۠ۖۚۨۘۦ۟ۤ";
                    while (true) {
                        switch (str2.hashCode() ^ -1537916691) {
                            case -804186861:
                                str2 = "۟ۨۥۘۨۥۦۜۤۜۦۤۤۧۚۡۜۙۛۜۘۢۛۨۗ";
                                break;
                            case -340060745:
                                str = "ۡۢۘۜۘۘۘ۬۠ۖۘۛۘۘۘۗۦۧۛ۬ۖ";
                                continue;
                            case 817530430:
                                str = "ۢۧ۬ۡۖۚۘۡۧۗ۬۟ۙۥۘ۫ۘ۬ۧۧۨۖۧ۠ۡ۟ۗ";
                                continue;
                            case 1626898744:
                                if (this.f2625e) {
                                    str2 = "ۖۘۗ۫ۚ۟ۡۖۙ۬ۦۘۜۥۡۚ۫ۛ۬ۦۛ";
                                    break;
                                } else {
                                    str2 = "۟ۧۜۘۚ۠ۡۡ۠ۦۚۧ۬ۜۨ۟ۨۢ";
                                    break;
                                }
                        }
                    }
                    break;
                case -1903974611:
                    this.f2623c.set(0.0f, 0.0f, f3, f2);
                    str = "ۖۦۜۛۥۥۘۛۖ۟ۥۧۡۗۡ۫ۛ۬۟";
                    break;
                case -1753924535:
                    str = "ۢۡۡۗ۬ۦۖ۠ۜۘ۟۫ۖۘ۫ۛۡۘۤ۟ۦۘ";
                    break;
                case -1533146586:
                    str = "۟ۢۚۤۧ۫ۛۥۖۘۧۤ۫ۨۚۖۘۛۢۚۧۖۘۜۦۥۘۘ۫";
                    break;
                case -1176358595:
                    str = "ۗۚۘۜۥۦۥۥۥۧۤ۬ۢۙۜۚۧۘۘۙۡ۬";
                    break;
                case -895746255:
                    return;
                case -582244117:
                    a();
                    str = "ۡۢۘۜۘۘۘ۬۠ۖۘۛۘۘۘۗۦۧۛ۬ۖ";
                    break;
                case -330275846:
                    str = "۟ۜۖۘۙۨۖ۟ۡۙۜ۬ۚۨۥۨۘۗۨۘ";
                    break;
                case -46698525:
                    f3 = (float) (i4 - i2);
                    str = "ۗۧۘۡۖ۬۠ۧ۬ۙۨۘۘۚۥۖۖ۬ۥۘۨۛۡۨ۠";
                    break;
                case 391037975:
                    this.f2625e = true;
                    str = "ۙۛۡۢ۫ۛ۬۬۫ۜۥ۠ۛۗۗ۫ۢۜ";
                    break;
                case 1205493231:
                    str = "ۢ۟ۦۢۚۥ۠ۜ۟ۚۤۦۚۧۦۡۙۘۘ۫ۥ۟";
                    break;
                case 1865305045:
                    f2 = (float) (i5 - i3);
                    str = "ۡۦۗۤۧۨ۟ۦۡۢۨۢ۠۫۬ۜۙ۠ۤۜ";
                    break;
                case 2034553845:
                    str = "ۛۥ۠ۚ۫۟۠ۜۧۘۖۥ۬ۡۛۥۘۡ۟ۥ۬۫ۜۘۧۙۜ";
                    break;
            }
        }
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        String str = "۟۬ۥۘۦۛۡۦ۫ۢۜۘ۠ۖۦ۬۬ۧۧۜ";
        while (true) {
            switch ((str.hashCode() ^ 93) ^ -778402611) {
                case -1767693923:
                    super.onSizeChanged(i2, i3, i4, i5);
                    str = "ۙۧۥۦۙۥ۠ۤۖۙۘۛ۫ۨۤۦۡۘ";
                    break;
                case -1683129236:
                    str = "ۧ۫۬ۚۧۗۘۤۡۥ۟۠ۥۜۡۘۛۙۖۘ۬ۤۦ";
                    break;
                case -1294552378:
                    str = "ۙ۫ۖۘۤ۬ۢ۫ۙۨۘۖ۟۠ۖ۬ۧۦ۬ۘۘۦ۫ۧۧ۬ۦۘ";
                    break;
                case -318244753:
                    str = "۠ۢ۫ۛۧۗۚۛۛۥۗۗۦ۠ۗۦۘۘ";
                    break;
                case 19811627:
                    a();
                    str = "ۘۙۥۘۚۜۨۛۙۗۖۧۚۡۘۛۚۘۖۘ";
                    break;
                case 128608658:
                    return;
                case 646845993:
                    str = "ۤۢۙۦۡ۫ۡۚۨۧۤۗۨ۬ۨۘۢۚ۬ۦۖۘ۠ۗ";
                    break;
                case 2083498341:
                    str = "ۡ۫۫ۘ۬ۡۡۥۧۖ۠۟ۙۜۗۥۦۛۨۢ۠۬ۙۛۨۧۧ";
                    break;
            }
        }
    }

    public void setBackground() {
        GradientDrawable gradientDrawable = null;
        String str = "۫ۜۧۥ۬ۡۘۢۖۧۘ۟ۡۦۘ۬ۜۘ";
        while (true) {
            switch ((str.hashCode() ^ 303) ^ 2124378486) {
                case -1333619810:
                    setBackground(this.f2635o);
                    str = "۬ۖۢۘۚۥ۫ۢۜۦۧۚۦۡۙ";
                    break;
                case -492596998:
                    gradientDrawable = new GradientDrawable();
                    str = "ۘۡۖۘۜ۟ۜۦۦۘۘۚۜۧۨۘۤ۫ۢ۠ۨۛۜۚۛ۫";
                    break;
                case 483441510:
                    setClipToOutline(true);
                    str = "ۤۧۨۘ۠ۖۙۖ۫ۘۘۚۜۥۘۗۢۦۘۘۥ۫";
                    break;
                case 503322868:
                    this.f2635o = gradientDrawable;
                    str = "ۛۦۖۘ۟۫۠۫ۡۥۘ۠۬ۖۘۤ۫ۚۨۡۢ";
                    break;
                case 951593118:
                    return;
                case 960977229:
                    gradientDrawable.setColor(0);
                    str = "ۙۙۧۚ۫ۡ۬۬ۙ۟ۗۦۜۛۤۡۡۖۘ۟ۦۡۘ";
                    break;
                case 1807077026:
                    str = "ۙۖ۫۬ۜ۬ۚۚۧۤۨ۬ۙۢۡۘۥۧ۬ۥۢۜۘۗۢ۫ۡۘ";
                    break;
            }
        }
    }

    public void setRoundAsCircle(boolean z2) {
        String str = "ۛۢۜۘ۬ۚۚۡۢ۫ۙۜۤۘ۫ۙۜۨۙۖۖۨۥۘ۬۠ۢۗ";
        while (true) {
            switch ((str.hashCode() ^ 791) ^ 1652039352) {
                case -2024036035:
                    return;
                case -1350827244:
                    str = "۫ۨۙۨ۫ۡۘۤۗۛۦۡۘۧۜۛۤۘۘۖ۬۠۟ۦۚ";
                    break;
                case -420927401:
                    this.f2627g = z2;
                    str = "۫ۘۗۘۥۛۗۛۖۥۚۨۡۦۨۘۨۜۘ۟۟ۚ";
                    break;
                case 732915410:
                    str = "ۜۤۖۘ۟ۛۘۘۜۖۧ۠۫ۡۘۘۥۦۘۡ۠۟ۘ۟ۜۘ";
                    break;
                case 875664221:
                    String str2 = "ۙۖۘۨۦۘۘۧۥۧۘۢۢۧ۟ۛۜۜۨۛۜۘۘۘ";
                    while (true) {
                        switch (str2.hashCode() ^ -1636579957) {
                            case -303324861:
                                str = "ۥ۟ۢۨۛۨۘ۠ۛۦۘ۟ۛ۬ۖ۟ۜۘۗۦ۫۟ۢۥۘۥۛۛۨۜۜ";
                                continue;
                            case 470933991:
                                str2 = "ۚۦۛۤۜۘۙۧ۬۟ۧۨۘۘ۟ۚۧۦۖۘۘ۟ۥ۠ۦۥۘ";
                                break;
                            case 937489346:
                                str = "ۤۚۡۦۚۥۘۗۦۦۘۙۡۜۘ۫ۘۥۘۨۤۤۜۚۡ";
                                continue;
                            case 1684819105:
                                if (z2 == this.f2627g) {
                                    str2 = "ۜۧۦۢۘۜۘۡۢۥۗ۟۫ۡۤۢۙۤ۟۠ۘۨۘ";
                                    break;
                                } else {
                                    str2 = "ۤ۟۬۠ۡۥۘۜۥۖۘۘۜ۫ۜ۫ۛۤۦۥۛۘ۠ۗۥۘۡ";
                                    break;
                                }
                        }
                    }
                    break;
                case 1390882763:
                    postInvalidate();
                    str = "ۤۚۡۦۚۥۘۗۦۦۘۙۡۜۘ۫ۘۥۘۨۤۤۜۚۡ";
                    break;
                case 2136581535:
                    a();
                    str = "۠۟ۥۘۢۡۢۚۥۘۦۡۖ۬ۨۛۚۙ۠ۥۤۤ";
                    break;
            }
        }
    }

    public void setRoundedCornerRadius(int i2) {
        String str = "ۡۧۖۖۖۥۘۤ۫ۧۖ۟ۛۖۢۦۘۗ۠ۨۘۢۢۦۘ";
        while (true) {
            switch ((str.hashCode() ^ 236) ^ -1891509803) {
                case -1744522572:
                    str = "ۢۗۛ۫ۢۖۖ۫ۧۥ۬۠ۘۚۦۘ";
                    break;
                case -1470348661:
                    return;
                case 793321031:
                    str = "ۥۙۜۘۡ۫۫ۖۚۗۜۖۥۤۖۦۘ";
                    break;
                case 2095147469:
                    setRoundedCornerRadius(i2, true, true, true, true);
                    str = "ۙۙ۬ۖۧۛ۫ۢۘۗۛۖۙۚۘۛۧۛۧۥۚ۬ۦۘ۟ۥۡ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e7, code lost:
        r0 = "ۨۗۖۨۘۦۘۧ۟ۚۥ۠ۙۙۡۘۛۧۥ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setRoundedCornerRadius(int r5, boolean r6, boolean r7, boolean r8, boolean r9) {
        /*
            r4 = this;
            java.lang.String r0 = "ۨۖۡ۟ۙۙۘۥۗ۟۟ۨۘ۬ۖۖۗۧ۬ۢۤۙۛۥۦۘۨۨۧۘ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 700(0x2bc, float:9.81E-43)
            r3 = -801284153(0xffffffffd03d5fc7, float:-1.27086828E10)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -1671502433: goto L_0x0014;
                case -1407901010: goto L_0x0017;
                case -1298787980: goto L_0x00c1;
                case -1194983985: goto L_0x0020;
                case -904804278: goto L_0x00d9;
                case -768250136: goto L_0x00e0;
                case -247752078: goto L_0x007d;
                case -82323851: goto L_0x00bb;
                case 458150305: goto L_0x005f;
                case 461856349: goto L_0x0011;
                case 540804737: goto L_0x00c7;
                case 1009422653: goto L_0x00d3;
                case 1141790089: goto L_0x00cd;
                case 1142686088: goto L_0x0041;
                case 1235602590: goto L_0x009c;
                case 1299384202: goto L_0x00ef;
                case 1834949698: goto L_0x001d;
                case 1942147543: goto L_0x0023;
                case 1972378118: goto L_0x001a;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "۟۫ۡۘۜۘۙۧۤ۠ۙۦۛۤۛ۟ۖۗ"
            goto L_0x0002
        L_0x0014:
            java.lang.String r0 = "۠۠ۤۢۚۥۗۧۙۧۨۘ۠ۛۥۘۤ۫ۜۘۧۖ۬"
            goto L_0x0002
        L_0x0017:
            java.lang.String r0 = "ۦۙ۠ۦۛۥۘۢۤۢۨۘۢ۬ۖۧۖۗۥ۬ۙۢۨۗۛۡۙ"
            goto L_0x0002
        L_0x001a:
            java.lang.String r0 = "۫ۘ۬ۗۖۧۘۚۖۥۡۘۦ۠۠ۙۗۜۦۘ۬۟ۧ"
            goto L_0x0002
        L_0x001d:
            java.lang.String r0 = "ۦ۫ۨۘ۟۫ۖۘۡۧۗۡۦۘۤۘۘۛۨۘ۠ۖۦۘ"
            goto L_0x0002
        L_0x0020:
            java.lang.String r0 = "ۦ۠ۢ۠۟ۛۥۖۨۘۗۛۜۖ۠ۙۙۜۧ۫ۙۨۘۜۚۡۘ۟ۢۚ"
            goto L_0x0002
        L_0x0023:
            r1 = -1474602103(0xffffffffa81b5b89, float:-8.624077E-15)
            java.lang.String r0 = "ۙ۟۬۬ۗ۠ۙۧۜۨۙۖۘۧۗۦۘ"
        L_0x0028:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1561031734: goto L_0x00e7;
                case -838869635: goto L_0x0037;
                case 1426655542: goto L_0x003e;
                case 1657739322: goto L_0x0031;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x0028
        L_0x0031:
            java.lang.String r0 = "ۗۦۚ۠۠۬ۖۘ۠ۚۚۡ۟ۨۡۢۙۦۘۢۥۥ۟۟ۤ"
            goto L_0x0028
        L_0x0034:
            java.lang.String r0 = "ۡۢۛۚۛۘۘۚۢ۫ۤۦۧۘۥۙۜۚۙۡۘ"
            goto L_0x0028
        L_0x0037:
            int r0 = r4.f2626f
            if (r0 != r5) goto L_0x0034
            java.lang.String r0 = "۬ۦۨۘۦۤۗۡۜۚۢۨۦۤۛۨۘۙ۠ۚۤۥۥۘۚۧۙۡۦۦۘ"
            goto L_0x0028
        L_0x003e:
            java.lang.String r0 = "ۧۘۖۨۧۧۙۗۢۘۙۡۘۗۢۗۥۖۚۜۚۛۛۖۧۘ"
            goto L_0x0002
        L_0x0041:
            r1 = -325870292(0xffffffffec939d2c, float:-1.4276345E27)
            java.lang.String r0 = "ۗۘ۫ۥ۬ۘۘ۟ۛۥۖۖۢۚ۫ۧ۬ۖۥۘ"
        L_0x0046:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1710220702: goto L_0x00e7;
                case -1011149691: goto L_0x004f;
                case 1838084656: goto L_0x005c;
                case 2067624416: goto L_0x0059;
                default: goto L_0x004e;
            }
        L_0x004e:
            goto L_0x0046
        L_0x004f:
            boolean r0 = r4.f2628h
            if (r0 != r6) goto L_0x0056
            java.lang.String r0 = "۫ۜۘۘ۫ۖۜۘۧۜۖۘ۟ۙۧۛ۬ۥۜۢۨۘ"
            goto L_0x0046
        L_0x0056:
            java.lang.String r0 = "ۜۘۡۘ۬ۨۗۨۚۥۘۘۚۖۘۤ۠ۥۘۘۦۘۘ"
            goto L_0x0046
        L_0x0059:
            java.lang.String r0 = "ۡۥۦۘ۫ۗ۬ۤۘۦۘۤۢ۟ۚۨ۫ۜۧۡۘۜۚۨۘ"
            goto L_0x0046
        L_0x005c:
            java.lang.String r0 = "ۧۙۦۦۚۜۘۛۜۛۢۚۛۚۤۦۘۗۛۛۧۙۘۗ۠۠ۗۡۧۘ"
            goto L_0x0002
        L_0x005f:
            r1 = 716484978(0x2ab4b172, float:3.209755E-13)
            java.lang.String r0 = "ۧۘۘۘۜۤۘۘۨۧۥۘۨۘۤۦۥۘ۫ۥۡۦۡۥۘ"
        L_0x0064:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -2034383721: goto L_0x00e7;
                case 654908969: goto L_0x0077;
                case 1052225654: goto L_0x007a;
                case 1146450647: goto L_0x006d;
                default: goto L_0x006c;
            }
        L_0x006c:
            goto L_0x0064
        L_0x006d:
            boolean r0 = r4.f2629i
            if (r0 != r7) goto L_0x0074
            java.lang.String r0 = "ۘۙۛۤ۠ۗ۠ۢۦ۠۬ۖۘ۠ۢۖ۠ۜۥۘۗۖ۬"
            goto L_0x0064
        L_0x0074:
            java.lang.String r0 = "ۛۘۙۗۛۧۡۡۦۘ۫ۡۘۘۗ۠ۖۘ۫ۡۧۙۡۘ۟۬ۜ۬ۨۗ"
            goto L_0x0064
        L_0x0077:
            java.lang.String r0 = "ۖ۟ۦۘۨۥۚۢۦۜۘۖۘۖۘۗۖ۟ۙۗۛۗۜۧۨ۬ۜۘ۬۠ۗ"
            goto L_0x0064
        L_0x007a:
            java.lang.String r0 = "۬ۥۜ۫ۘۨۘۢۚ۠۬۟ۜۘۘۧۨۘۤۙۘۘۤۤۙ۫۫ۨۡۖۘ"
            goto L_0x0002
        L_0x007d:
            r1 = 164302711(0x9cb0f77, float:4.8885015E-33)
            java.lang.String r0 = "ۚۘۜۡۤۤۤۢۥۘۨۧۖۘۘ۠ۥۢۤۢ"
        L_0x0082:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -806915462: goto L_0x0098;
                case -416346792: goto L_0x0095;
                case 227827023: goto L_0x008b;
                case 1199418807: goto L_0x00e7;
                default: goto L_0x008a;
            }
        L_0x008a:
            goto L_0x0082
        L_0x008b:
            boolean r0 = r4.f2630j
            if (r0 != r9) goto L_0x0092
            java.lang.String r0 = "ۦ۬ۨۙۢۗۜۖ۠ۢۡۨۘۘ۫ۜۘ۬۫ۜۘۢۚۖ۫۫ۧ۫ۜۖۘ"
            goto L_0x0082
        L_0x0092:
            java.lang.String r0 = "ۚۤۗۥۙ۫ۗۘۨۡۤۛ۟ۖ۠ۛۖۧۘ۠ۛۢۨ۟ۗۛۨۘۘ"
            goto L_0x0082
        L_0x0095:
            java.lang.String r0 = "ۜ۟ۡۧۚ۠۟ۚۥۧۘ۫۟ۙۡۘۥۥۧۘۥۗۧۨ۠ۙ"
            goto L_0x0082
        L_0x0098:
            java.lang.String r0 = "ۦ۠ۗۤ۬ۡۘۙۤۡۛ۬ۤۗ۫ۨۡ۟۬ۜۨۤ"
            goto L_0x0002
        L_0x009c:
            r1 = -1523929816(0xffffffffa52aad28, float:-1.4803817E-16)
            java.lang.String r0 = "ۦۤۛۜۛۛ۬۟ۨۘۜۢۨۘ۟۬۠۟۟ۨۦۙۘۘۢۜۘۘ"
        L_0x00a1:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1525751302: goto L_0x00eb;
                case -1058335694: goto L_0x00b1;
                case -954883710: goto L_0x00aa;
                case 484468909: goto L_0x00b8;
                default: goto L_0x00a9;
            }
        L_0x00a9:
            goto L_0x00a1
        L_0x00aa:
            java.lang.String r0 = "ۨۗۖۨۘۦۘۧ۟ۚۥ۠ۙۙۡۘۛۧۥ"
            goto L_0x0002
        L_0x00ae:
            java.lang.String r0 = "ۚۦۨۘۗۚۦۘ۬ۗۡۢۜۡۜۧ۟"
            goto L_0x00a1
        L_0x00b1:
            boolean r0 = r4.f2631k
            if (r0 == r8) goto L_0x00ae
            java.lang.String r0 = "ۚۚۛۨۖ۠ۢۨ۬۟۬ۘ۫ۦۨۚۤۢۢۨ۬ۦۖۧۘۧۢ۠"
            goto L_0x00a1
        L_0x00b8:
            java.lang.String r0 = "۠ۙۡۘۖۤۛۡ۠ۤ۟ۘۜۘۗ۫ۛ"
            goto L_0x00a1
        L_0x00bb:
            r4.f2626f = r5
            java.lang.String r0 = "ۘۡۚۛۘ۠ۜۖۧۘۡۖۥۧۢۜۘۜۘۡۘۥۧۘۘۤ۬ۤۥۚۡ"
            goto L_0x0002
        L_0x00c1:
            r4.f2628h = r6
            java.lang.String r0 = "۫ۚۜۛۥۘۘۨۢۦۘۦۥۥۨۢۘۘۛۚۥۘۗۢۘۘ"
            goto L_0x0002
        L_0x00c7:
            r4.f2629i = r7
            java.lang.String r0 = "ۢۨۙۡ۫ۚۢۗۖۘۢۛ۠ۜۜ۫ۤۜۘۖۘ۟۫ۨۡۤۗۨۘ"
            goto L_0x0002
        L_0x00cd:
            r4.f2630j = r9
            java.lang.String r0 = "ۚ۠ۧ۬ۚۗۦ۠ۡۨۜۨۨۨۡۥۢ۠ۚۖۙ"
            goto L_0x0002
        L_0x00d3:
            r4.f2631k = r8
            java.lang.String r0 = "ۤۧۘۦ۠ۤ۬ۙۙۤۤۥ۟ۢ۫ۘۥۘ"
            goto L_0x0002
        L_0x00d9:
            r4.a()
            java.lang.String r0 = "ۦۧۦۖۤۡۨۨۦۘۥ۬ۖۘۧۖۡۨۚۖۘۤۜۗۡۘۡۜۙۘ"
            goto L_0x0002
        L_0x00e0:
            r4.postInvalidate()
            java.lang.String r0 = "۫ۡ۟۠ۤ۫ۗۡۗۙ۟ۙۗۤۢ"
            goto L_0x0002
        L_0x00e7:
            java.lang.String r0 = "ۨۗۖۨۘۦۘۧ۟ۚۥ۠ۙۙۡۘۛۧۥ"
            goto L_0x0002
        L_0x00eb:
            java.lang.String r0 = "۫ۡ۟۠ۤ۫ۗۡۗۙ۟ۙۗۤۢ"
            goto L_0x0002
        L_0x00ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.whatsapp.rounded.RoundedStories.setRoundedCornerRadius(int, boolean, boolean, boolean, boolean):void");
    }

    public void setRoundingBorderColor(int i2) {
        String str = "۬۠ۨۘ۟ۥۘۢۦۧۗ۟ۧۤۤۘۢۖۘۘۧۥ۫۟ۡ۠";
        while (true) {
            switch ((str.hashCode() ^ 102) ^ 1761284023) {
                case -1665861095:
                    String str2 = "ۤۘۡۘۘۧۥۘ۫ۡ۟ۧ۬۠ۚ۟ۙۢۢ";
                    while (true) {
                        switch (str2.hashCode() ^ -373011512) {
                            case -1624494522:
                                str2 = "ۤۛۘۘۨۡ۫ۚ۟ۤۢ۠ۨۨ۫۫ۦۗ۫ۨۤۥۘۧ۬ۦۘ";
                                break;
                            case -456887626:
                                str = "۫ۢ۟ۤۜ۠ۧۤۨۘ۫ۡۜۘۧۘۢ۠ۦ۫";
                                continue;
                            case 1217046333:
                                if (i2 == this.f2633m) {
                                    str2 = "۟ۥ۬ۗۤۖ۟۟۫۠ۛۖۘۤۦۘۜ۠۫ۗۘۛ";
                                    break;
                                } else {
                                    str2 = "ۡۚ۠۟۟۟ۡ۬ۥۘۗۚۥۘ۫ۚۥۘ";
                                    break;
                                }
                            case 1706639788:
                                str = "ۥۚۢۛۖ۫ۚ۬۫۠ۗۚ۬۬ۧ۠ۥۨۘۘۤ۬ۤۥۙ";
                                continue;
                        }
                    }
                    break;
                case -931304934:
                    str = "ۨۖۗۜۖۥۘ۫ۘۛۢۢۗ۠۠ۧۗۘ۫ۜ۠ۙۦ۟ۗۚۗ";
                    break;
                case -686049758:
                    this.f2633m = i2;
                    str = "ۨۗۜۧۚۜۘۦۗۦۘۖۜۜ۠ۚۜ۫ۙۡۘۡۧ۬۫ۘۦۖۢ";
                    break;
                case -315242114:
                    this.f2622b.setColor(i2);
                    str = "ۘۘ۬ۛۥۥۘۥۧۦۘۧ۬ۚۤۗۧۢۥ۬";
                    break;
                case 230360764:
                    postInvalidate();
                    str = "ۥۚۢۛۖ۫ۚ۬۫۠ۗۚ۬۬ۧ۠ۥۨۘۘۤ۬ۤۥۙ";
                    break;
                case 634075958:
                    return;
                case 921387522:
                    str = "۟۠ۡۘۦۛۘۘۨۤۨۛۙۖۘۨۤۦ";
                    break;
            }
        }
    }

    public void setRoundingBorderWidth(int i2) {
        float f2 = 0.0f;
        String str = "ۥۨ۠ۧۦۙۡۚۗۤ۫ۨۘۙۧۖۘۗ۟ۧۙۢۦۘۨۦۘۘ";
        while (true) {
            switch ((str.hashCode() ^ 280) ^ -111893211) {
                case -2042783143:
                    this.f2632l = i2;
                    str = "ۥ۫ۖۦۛۨۘۜۗۧۜۛ۟ۥۦۜۘۡۛۖ۫ۘۨۨۥۗۘۢۖۘ";
                    break;
                case -1684996454:
                    return;
                case -692896772:
                    postInvalidate();
                    str = "ۦۨ۬ۢۤۖ۬ۡۦۙۥۛ۫ۚۨۘ";
                    break;
                case -647286755:
                    this.f2622b.setStrokeWidth(f2);
                    str = "ۘۗۥۘۢ۬ۡ۬ۦۦ۫ۧۦۘۨۤۨۘ";
                    break;
                case 57398637:
                    str = "ۘۡ۠ۨۧ۫۠۟ۜۢۗ۫ۚۧۨۘۤۨۖۥۡۘۛۥۚ";
                    break;
                case 187451708:
                    f2 = (float) (i2 * 2);
                    str = "ۦ۠ۜۘ۫ۛۡۘۖۨۙۧ۠ۙ۬۫۠ۛۜۛۦ۬ۧۜ۠ۖ";
                    break;
                case 1271326159:
                    String str2 = "ۚ۟ۗۢۨۘۘ۫۟ۘۘۢۘۨۤۗۦۘۛۜۡۘۤۨ۫";
                    while (true) {
                        switch (str2.hashCode() ^ 653178481) {
                            case -1293172427:
                                if (i2 == this.f2632l) {
                                    str2 = "ۘۖۜۥ۠ۛۦۖۨ۬ۗۖۥ۟ۥۙۧ۬ۜ۬ۛۗۡۗ";
                                    break;
                                } else {
                                    str2 = "ۨ۠ۖۦۖۥۘ۟ۡۦۦ۬ۜۨۧۜۘۖۚۖۘۢۨۘ";
                                    break;
                                }
                            case -468617564:
                                str = "ۢۚۡۘۛ۟ۜ۟ۜ۠ۗۚ۠ۜ۫ۦۘ";
                                continue;
                            case 1167847663:
                                str2 = "ۡۢۚۜۡ۫ۖ۬ۜ۬ۤ۟۬ۨ۠ۧۦ";
                                break;
                            case 2082257883:
                                str = "ۦۨ۬ۢۤۖ۬ۡۦۙۥۛ۫ۚۨۘ";
                                continue;
                        }
                    }
                    break;
                case 1996451270:
                    str = "ۥۧۡۛۧ۟۟ۡۨۘۤۢۖۘۤۜۥۘ۬ۖۘۘۡۡۘۗ۟ۛۡۥ۬";
                    break;
            }
        }
    }

    public void setRoundingElevation(float f2) {
        String str = "ۢ۬ۜۘ۟ۖۥۖ۫ۜۘۘۙۛۗۥۦۘ";
        while (true) {
            switch ((str.hashCode() ^ 808) ^ -1375665003) {
                case -1516423154:
                    setElevation(f2);
                    str = "ۙۙۧۤۤۚ۟ۧ۬ۥۥۚ۬ۙ۬۬ۦۘۡ۬ۗۚ۠ۥۘۛۨۧۘ";
                    break;
                case -445750646:
                    str = "۠۠۠ۢ۠ۖۘۧۨۜۚۧۨۘ۬ۤ۬";
                    break;
                case -409199770:
                    return;
                case -178758271:
                    this.f2634n = f2;
                    str = "ۙ۠ۦۘۤۗۘ۬ۖۦۘ۠ۛۧۘۛ۟۫ۥۥ";
                    break;
                case 2133838524:
                    str = "ۧۛۜۘۖۦۛۥۙ۟ۖۙۘۨۢۧۗۜۢۢۥۛۤۢۘ";
                    break;
            }
        }
    }
}
