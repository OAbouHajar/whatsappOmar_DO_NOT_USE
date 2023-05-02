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

public class SquareStories extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public final Path f2636a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final Paint f2637b = new Paint();

    /* renamed from: c  reason: collision with root package name */
    public final RectF f2638c = new RectF();

    /* renamed from: d  reason: collision with root package name */
    public final float[] f2639d = new float[12];

    /* renamed from: e  reason: collision with root package name */
    public boolean f2640e = false;

    /* renamed from: f  reason: collision with root package name */
    public int f2641f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2642g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2643h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2644i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2645j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2646k;

    /* renamed from: l  reason: collision with root package name */
    public int f2647l;

    /* renamed from: m  reason: collision with root package name */
    public int f2648m;

    /* renamed from: n  reason: collision with root package name */
    public float f2649n;

    /* renamed from: o  reason: collision with root package name */
    public GradientDrawable f2650o;

    public SquareStories(Context context) {
        super(context);
        c();
    }

    public SquareStories(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public SquareStories(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        c();
    }

    @TargetApi(21)
    public SquareStories(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        c();
    }

    public final void a() {
        boolean z2 = false;
        String str = "ۤۘۚۤۧ۠ۧۧۗۤ۟ۘۧۗۘۘۥۧۥۘ۟ۡ۟۫ۚۖ";
        Path path = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        RectF rectF = null;
        float f4 = 0.0f;
        while (true) {
            switch ((str.hashCode() ^ 26) ^ 2114655202) {
                case -2141696213:
                    String str2 = "ۙۧۘۘۦ۟ۤۘۨۜۜۗۦۤۧۨۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 2138743919) {
                            case -1707467052:
                                str = "ۖۖۛۚ۫ۡۧۨ۟۫ۗۦۙۜۘۡۡۙ";
                                continue;
                            case -1398971686:
                                str2 = "ۧ۫ۖۖ۫ۨۘ۠ۗۜۘ۬ۘۛۡۦۙۧۨۖۧ۬ۦۖۜۡ۟ۦۢ";
                                break;
                            case -1044091613:
                                str = "ۥۤۚ۟۟ۗ۠ۡۥۘ۠ۚۖۦۚۡ۠۟ۢۛۤۦۥ۠ۥۘۜۧ۬";
                                continue;
                            case -97166816:
                                if (!z2) {
                                    str2 = "ۤۡ۠ۡ۟۠ۙۙۨۘ۫ۖۥۘۚۘۢۥۘۥ۬ۗۗۜۥۢۥ۬ۛ";
                                    break;
                                } else {
                                    str2 = "ۚۤۨ۫۫ۙۦ۫ۚۚ۠ۗۘ۬ۚۤۘۥۚۥۖ۠۬";
                                    break;
                                }
                        }
                    }
                    break;
                case -2131086541:
                    str = "ۡۛ۠۠ۜۥۘ۬ۤ۬ۥۜۖۘ۫ۗۘۘۡۛۦۚۧۖۦۖۤ";
                    f3 = f4;
                    break;
                case -2051133088:
                    path = this.f2636a;
                    str = "ۦ۬ۥۘۚۘۚۦ۫ۤ۠ۤۨۘۘۥۧ";
                    break;
                case -1752607352:
                    f4 = (float) this.f2641f;
                    str = "ۘۜۨۚ۬ۡۘۚ۠ۨۜۢۙۙۛ۫ۜۥ۟ۧۧۛ";
                    break;
                case -1237320876:
                    path.addRoundRect(rectF, b(f3), Path.Direction.CW);
                    str = "ۥ۬ۙۖۧۖۧ۫۬ۙۖۘۧۚۥۘۜۦۡ";
                    break;
                case -1223249933:
                    path.close();
                    str = "ۤ۬ۥۘۧۙۛۥۡۜۘ۬ۖۦۚۜۡۘۡۧۦۘۥۖ۫ۦۤۤۥۡ";
                    break;
                case -881551576:
                    str = "۟ۖۤۘۜۙۗ۟ۘۘ۫ۤ۫ۘ۫ۢۚۗ۠";
                    z2 = this.f2642g;
                    break;
                case -592211598:
                    path.reset();
                    str = "۠ۡۡۘ۬۠ۥۙۘۨۛۘۘۘۧۦۘۘ";
                    break;
                case -357335539:
                    str = "ۡۤۢ۬ۘۡۘۨۤ۫ۚۛۥۘۛ۠ۖۛۛۢۖۜۛۚۜ۟";
                    f2 = Math.max(rectF.width(), rectF.height()) / 2.0f;
                    break;
                case -125814025:
                    this.f2650o.setCornerRadii(b(f3));
                    str = "ۢۖۡۧۛۦۘۖۥ۬ۙۤۦۗۗۨۘ";
                    break;
                case 268848180:
                case 1861374393:
                    return;
                case 1243579490:
                    str = "ۥۤۚ۟۟ۗ۠ۡۥۘ۠ۚۖۦۚۡ۠۟ۢۛۤۦۥ۠ۥۘۜۧ۬";
                    f3 = f2;
                    break;
                case 1761492451:
                    String str3 = "ۤۡ۬ۦۥۖۤۗۚۦ۫۬ۤۨۤۙ۠ۖۘۚ۬ۢ";
                    while (true) {
                        switch (str3.hashCode() ^ 529594145) {
                            case -1761278813:
                                str3 = "ۜۡۥ۟ۧۚ۬ۚۦۘ۬ۨۤۤۤۘۘ";
                                break;
                            case -108646985:
                                str = "ۚۖۡۢۗۗۖۖۥۘۖۖ۠۬۠ۡۘۛۢۡ۬ۧۦ";
                                continue;
                            case 743424801:
                                str = "ۘۘۡۘ۟ۜۖۘۘۛۡۤ۟۫ۤۘۢۧ۬ۨۨۗۜ";
                                continue;
                            case 1823427438:
                                if (this.f2640e) {
                                    str3 = "ۡۚۖۘۨ۟ۖۦ۟ۡۡۚ۫۠ۗ۬۫ۨۘۡ۬۟";
                                    break;
                                } else {
                                    str3 = "ۘۦۡۡۜۙۙۦۦۘۢۛۧۚۡۥۡۚۚ۠ۨۤۨۧۖ";
                                    break;
                                }
                        }
                    }
                    break;
                case 1781602126:
                    str = "ۧ۬ۢۨۦ۬ۚ۬ۗۜۧۖۥۖۦۨۧ۠ۙ۟ۖۘ";
                    rectF = this.f2638c;
                    break;
                case 2146879412:
                    str = "ۗ۠ۖۤۨۦۘ۬ۦۧ۠ۦۥۛۛ۟۟ۜۧۢ۫ۦۘ";
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
        String str = "ۜۜۧۛۦۡۦۧۖۘ۫ۜۨ۬ۡۗۚ۬ۙۗۖۥۘۧۚ۫";
        while (true) {
            switch ((str.hashCode() ^ 136) ^ -1843676782) {
                case -2076798641:
                    str = "ۡۡۚۘۢۘۗۧۧۙۢۨۥۖۜۘ۠ۧۙ";
                    i2 = f2;
                    break;
                case -1891295470:
                    str = "۠ۢۘۘ۬ۜۛۨ۠ۦۘۨۖۥۘۜۧۨۦۗۦۘ۟ۜۨۛ۬ۜۘ";
                    f6 = f2;
                    break;
                case -1843177942:
                    z6 = false;
                    str = "۬۟ۢۚۜۥۘۡۚۛۛۥ۫ۜۜۚۤۤۤۘ۟ۖۘۦ۫ۨۘۥۡۨۘ";
                    break;
                case -1771729402:
                    fArr[0] = f5;
                    str = "ۖۥۡۘۜۢۨۦۛۖۨ۬ۦۖۢۦ۟ۙۢۥۘۛۤۜۘ";
                    break;
                case -1641668005:
                    f18 = 0.0f;
                    str = "ۡۡۥۘۥۦ۫ۘۛۜۘۖۚۧۘ۫ۖۘۙۤ۟";
                    break;
                case -1586007145:
                    str = "ۚۜۥۘۖۗ۟ۛ۟ۨۘ۫ۡۙ۠ۢۛ";
                    f14 = f2;
                    break;
                case -1564295918:
                    f10 = 0.0f;
                    str = "ۖۢۚۖۜۡۘ۠۬ۨۘۛۘۤۛۖۤۡۨۨۗۜۧ";
                    break;
                case -1546414246:
                    f7 = 0.0f;
                    str = "ۛۖۨۥ۠ۜۛۙۦۘۥۤۢۘۨۨ";
                    break;
                case -1539322314:
                    str = "ۖۙۘۘۙۜۨۦۢۦۜۛۨۚۜۗۢ۟ۚۗۖۡ";
                    f19 = f17;
                    break;
                case -1471119720:
                    str = "ۦۤۖۦۨۗۥۜۚۛ۫۬ۡۗۨۥۥۖۘۗۨۘ";
                    f5 = f3;
                    break;
                case -1421468647:
                    z3 = this.f2644i;
                    str = "ۤۘۚۛۖۘۗۦ۠ۤۤۢۖ۟ۗۥۤۜۘۗۖۨ";
                    break;
                case -1158099877:
                    String str2 = "۠ۧۛ۫ۦۥۘۢ۫۬۠ۤۚ۬ۜ۟";
                    while (true) {
                        switch (str2.hashCode() ^ -435153412) {
                            case -1341439290:
                                if (!z5) {
                                    str2 = "ۖۥۜۘۧ۫ۘۘۜ۬ۨۥۖۧۘۤۥ۟";
                                    break;
                                } else {
                                    str2 = "ۦۧۜۘۧۨۥۘ۬۟۟۫ۛۥۘۧۥۛ";
                                    break;
                                }
                            case 243073807:
                                str = "۠ۢۛۡۤۗۦۖۥۨۖۦۘ۠ۛۢ۟ۨۙۖۤۡۧۧۧۤۜۘ";
                                continue;
                            case 558860515:
                                str2 = "ۨۡۨۖ۬۬ۛۦ۫ۗۥۚۛۛۙ";
                                break;
                            case 1579521626:
                                str = "۟ۢۖۘۢۛۘۨۦۘۜۙۚۧۖۡۘۦۙۡۘ";
                                continue;
                        }
                    }
                    break;
                case -1087540653:
                    str = "ۗۜۤۢ۬ۗۘۨۤ۠ۡۤۚ۬ۦ۠ۗۜۘ";
                    break;
                case -863678243:
                    str = "۠ۗۦ۬۫۟ۛۡۧۜ۠ۤۧۛۘۘۛ۟ۜۡۜۧۘ۫ۦۘۢۖۜۘ";
                    f20 = f2;
                    break;
                case -854854843:
                    str = "ۗۜۤۢ۬ۗۘۨۤ۠ۡۤۚ۬ۦ۠ۗۜۘ";
                    f5 = f4;
                    break;
                case -820773779:
                    str = "ۨۤۘۙۗۡ۠ۙۜۛۛۙۗ۫ۖۖ۟";
                    f11 = f9;
                    break;
                case -718194253:
                    str = "ۤۤۚۨۨۘۘ۠ۜۗۚۦۘۦۧۡۘۙۧ۬ۛۧۨۘ";
                    i3 = i2;
                    break;
                case -651886524:
                    str = "ۨۢۦ۠ۜ۠ۜ۟ۜۘۙ۬ۜۘۗۙۨۘۨۛ۟";
                    f12 = f2;
                    break;
                case -477178451:
                    str = "ۖۚۢۜۨ۠ۜۥۨۘۧۘۨۥ۠ۦ";
                    break;
                case -476239290:
                    String str3 = "ۘۡۚۗ۫ۤۢۖۗۜۤ۬ۜۜۥۖۘۘۘ۫ۧۥۡۦۜۛۛۖۘ";
                    while (true) {
                        switch (str3.hashCode() ^ 644218692) {
                            case -1505449203:
                                str = "ۧۥ۠ۘۚۚۙۧۧۧ۠۟ۜۧۨۜۨۛ";
                                continue;
                            case -24047046:
                                str = "ۡۗۙۤۜۗۚۥۨۡ۠ۡۢۨۗ";
                                continue;
                            case 116374220:
                                str3 = "ۘۚۨۘۥۢۜۘۙ۟۬ۢۗ۠ۗۦۚ۬۬۟ۦۚۤۚ۠ۡۘ";
                                break;
                            case 1913268851:
                                if (!z5) {
                                    str3 = "ۡۧۦۙۗۥۘۡ۟۠۫ۨۘۛ۟۬";
                                    break;
                                } else {
                                    str3 = "۫ۡۦۦۨۘۘۥۙۙۛۙۧۥۗ";
                                    break;
                                }
                        }
                    }
                    break;
                case -403589767:
                    String str4 = "ۜۖۤۧۘۨۘۛۚۚۜۛ۫ۥۧۤۢۦۗ۫ۜۙ";
                    while (true) {
                        switch (str4.hashCode() ^ -1793140327) {
                            case -1913652815:
                                str4 = "ۛ۬ۨۘۧۢۖۘۛۡۘۥ۟ۚۥۡۥۘۦۙۘۘۧۗۗ";
                                break;
                            case 29186048:
                                str = "ۙۜۚۥ۫ۘۘۤۙ۟ۤۡۚۘۧۙۥۦۜۘۤۚۦۗ۟ۚۗۦ";
                                continue;
                            case 764970658:
                                if (!z2) {
                                    str4 = "ۘۖۧ۬۠ۥ۠ۦۧۘۤۙ۠ۢ۬ۦۨۙۢۛۙ";
                                    break;
                                } else {
                                    str4 = "ۤۨۜ۠ۘۘۛۧ۠ۦۧۙۜۘ۬ۦۥۚ۠ۜۛ";
                                    break;
                                }
                            case 1291448294:
                                str = "ۤۜۛۢۡۨۘۘ۫ۢۤۛۡۘۛۛۜۥۖۘۘ۬ۡۗ";
                                continue;
                        }
                    }
                    break;
                case -336059191:
                    str = "ۛ۫ۨۛۦۘ۬ۦۖۘ۠ۖ۬۫ۧ۠ۖ۫ۛO";
                    f16 = f14;
                    break;
                case -303577872:
                    String str5 = "ۨۙۚۢۙۘۚۙ۬ۨۚۡۨۨۜۙ۬ۜ";
                    while (true) {
                        switch (str5.hashCode() ^ 808566977) {
                            case -824500370:
                                str5 = "ۚۡۘۤۚۛۖۚۨۘ۟ۖۜۘۖۡۨۘۜۗۖۥۡ۟ۤۡۘ";
                                break;
                            case -389633210:
                                if (!z3) {
                                    str5 = "ۦۜۨ۟ۥۘۘۗ۟ۘۘۜۢۜۚۙۧ۟ۡ۠۫ۡۧۗۦۛ";
                                    break;
                                } else {
                                    str5 = "ۥ۫ۖۘ۠۟۬ۘۢ۟ۛۜۨۗ۫ۨۘۧۘۧۖۥۙ";
                                    break;
                                }
                            case 286113660:
                                str = "ۥۥۧۢۥۜۘۨ۟ۢۘۥۡۘۡۢۡۡۜۦۘ۟ۗۚ";
                                continue;
                            case 1542583078:
                                str = "۠ۛۤۖۘۨۘۗۢۗۛ۠ۖۘۛۖ۬ۧۡۗۧۥۘۘۘ۫۬";
                                continue;
                        }
                    }
                    break;
                case -115368631:
                    String str6 = "۬ۙۥ۠ۡۨ۬ۚۖ۬ۖ۠ۚۥۦۘۥۜۗۜۙۘ۫۫۠";
                    while (true) {
                        switch (str6.hashCode() ^ 338794663) {
                            case -1945686546:
                                str6 = "ۙ۬ۥۘۖۚۢ۠ۡۚۘۙ۟ۥۜۜۘۨۡۜۘ";
                                break;
                            case -1610738516:
                                if (!z7) {
                                    str6 = "ۦۢۜۘۗۦۖۖ۬ۥۘۚۢ۫ۗ۫ۛۨۦ۠ۤۡۨۘۖۘۨۧۛ۫";
                                    break;
                                } else {
                                    str6 = "ۘۤۛۛ۠ۜۛۘۨۥۦۡۘۡۛ۫ۚۧۛۤۥۤ۬ۨۖۘ";
                                    break;
                                }
                            case 1019580130:
                                str = "ۤۧ۬ۙۙۨۘۜ۫ۢۖۨۘ۟ۙۖۘۥۤۘۘ";
                                continue;
                            case 2074080771:
                                str = "ۛ۠ۘۙۙۤۖ۟ۘۘۚۨ۟ۜۙ۫۫ۛۜ";
                                continue;
                        }
                    }
                    break;
                case 36605081:
                    fArr[4] = i3;
                    str = "ۡۦۡۦۘۦۘۡۤۦۘ۫ۗۙۙ";
                    break;
                case 45303024:
                    fArr = this.f2639d;
                    str = "ۨ۠۟ۡۚ۟۟ۖۙۘۚۨۘۤ۫";
                    break;
                case 73930010:
                    String str7 = "ۤۚۜ۠ۢۢۚۢۙۢۡۢ۟۬ۡ۠ۙۖۙۙۙۨ۫ۛ";
                    while (true) {
                        switch (str7.hashCode() ^ 917665462) {
                            case -1883180126:
                                if (!z7) {
                                    str7 = "ۗۜۜ۟ۙۘۥۙۥۘ۠ۢۤ۬ۡۨۗ۬ۦۚۜۜۛۖۘۛ۬ۘۘ";
                                    break;
                                } else {
                                    str7 = "۟ۧ۟ۢۚۜۛۨۤ۠ۖۨۘۚ۫ۦۘ";
                                    break;
                                }
                            case -1825318481:
                                str = "ۜۘ۠ۙ۫ۗۙ۫ۘ۫۫ۨۖۦۡ۫ۥۢۡ۫";
                                continue;
                            case -1757625499:
                                str7 = "۠ۨۚ۠ۖۗ۬ۦۥۘ۟ۗۥۖۥ۬۠ۛ۟ۚۡۘ";
                                break;
                            case -69384784:
                                str = "۫ۛۜ۬ۜۚ۫ۤۜۘۧ۠۠ۛ۠ۚ";
                                continue;
                        }
                    }
                    break;
                case 93638462:
                    return fArr;
                case 156350595:
                    str = "ۤ۫ۥۡ۬ۥۢۨ۟ۡ۟۠ۗۚۦۚ۬۠ۜۧۘ۟ۦۤ";
                    break;
                case 156730544:
                    str = "ۤۡۦۘۜۗۖۘ۬ۡۚۗ۫۠ۨۨۗۚ۠ۖۘۛۗۗ۫ۥۘۘۡۛۘ";
                    break;
                case 168146029:
                    fArr[5] = f16;
                    str = "ۤۨ۫ۖۡۡ۠ۗۖۘ۠ۚۧۥۧۨۥۘۢۢۙۚۘۜۘۜ۠ۨۘ";
                    break;
                case 177491337:
                    z7 = this.f2645j;
                    str = "ۢۦۗۛۘۜۘۙۖۧۚ۬ۛۢۤۥۘۡ۬ۙۥۗۘ۫ۜۡۘ";
                    break;
                case 258298778:
                    fArr[6] = f19;
                    str = "ۢۚۛۘۘۙۧ۠ۙۥۨۢۢ۫ۛۦۚۤ";
                    break;
                case 411277464:
                    str = "ۨ۫ۖۚۙۥ۠ۥۥۘۤۚۦۦۧۨ";
                    break;
                case 516712655:
                    fArr[3] = f13;
                    str = "۫ۦۧ۠ۙۢۚ۠ۖ۟ۚۥۤ۠ۡۘۤ۠۟ۙۤۡۘ";
                    break;
                case 535308810:
                    String str8 = "ۗۖۦۘۧۗۥۘۧۗۤۢ۬ۙۘۢۖۘ۠ۜۧۘۚۦۛ۬";
                    while (true) {
                        switch (str8.hashCode() ^ -618025673) {
                            case -1934419571:
                                str = "۫ۡۘۧۢۥۘۚۢۘۘۤۚ۟ۙۖۘۧۖ۬";
                                continue;
                            case -1116006670:
                                str8 = "ۛ۬ۚۦۤۘۘۜۚۘۦۘۤۜۙۥۘۘۦۜۘ۬ۛۢ";
                                break;
                            case 801570290:
                                if (!z2) {
                                    str8 = "۬۫ۜۘ۬ۙۡۘۢۚ۟۬ۛۦۧۥۗۚ۬ۙۧۖۡۥۢۛ۟ۗ";
                                    break;
                                } else {
                                    str8 = "ۜۛ۬ۚۗۦۘۧۚۧۨۗۧۤۜۜۘۨۢۚ۠ۦۘۥۥ۫";
                                    break;
                                }
                            case 1140806902:
                                str = "ۧۜۤ۟ۙ۬ۡۧۖۨۨۛۚۥۦۘۨۡۧۜۗۨۢ۟ۥۘۙ۟ۘ";
                                continue;
                        }
                    }
                    break;
                case 607513101:
                    z4 = false;
                    str = "ۤ۟۫ۥ۫ۦ۫ۜۘۦۙۚۜۨۧۗ۬ۖۚۚۦۨۦۚ";
                    break;
                case 707781741:
                    fArr[7] = f20;
                    str = "ۧۖۗ۫ۧ۟۬ۦۥۘۡۡۡۘ۫ۙ۬ۡۤۦ";
                    break;
                case 707914558:
                    str = "ۗ۫ۖۘ۫ۗۡ۬ۚۖۘۛۜۛ۫ۨۥۘ۠ۛ۫ۗۧۖۘۗۤ۠";
                    f17 = f2;
                    break;
                case 749080525:
                    str = "ۖۚۢۜۨ۠ۜۥۨۘۧۘۨۥ۠ۦ";
                    i3 = z6;
                    break;
                case 890887110:
                    str = "ۦ۫ۦ۠۬ۖۘۚۦۘۜۙۖۧۙۨۘۜ۟ۡۧ۟ۨۚۗۥۢۢ۬";
                    break;
                case 891126306:
                    f4 = 0.0f;
                    str = "ۗۧۤ۫ۙۨۘ۠۬ۦ۟ۧ۟ۦۦۚۖۜ۟ۛۧۙ";
                    break;
                case 928129846:
                    str = "ۤۡۦۘۜۗۖۘ۬ۡۚۗ۫۠ۨۨۗۚ۠ۖۘۛۗۗ۫ۥۘۘۡۛۘ";
                    f13 = z4;
                    break;
                case 930011604:
                    str = "۫ۡ۠۟۬ۦۘ۬۬ۙۛۚۧ۠ۨۡۘۘۘۦۘۛۘۢ";
                    break;
                case 936982771:
                    f15 = 0.0f;
                    str = "۟ۡۛۥۛۥۘ۫ۤۨۖۨۡۘۥ۠ۦۘۨۨۤ۬ۘۜۦۗۛۨۜۥۘ";
                    break;
                case 983780247:
                    str = "ۧۢۛ۬ۨۦۜ۟ۙۗۜ۬ۤ۬ۨۘۦۡۥ";
                    break;
                case 1027765423:
                    z8 = false;
                    str = "ۨۦۥۨۗۦۘۗ۫ۨ۟ۤۗ۟ۡۜۗۡۘۨۤۨۘۙ۬ۥۧۛۘۘ";
                    break;
                case 1155963374:
                    str = "ۙۦۥ۬ۙۡ۫ۧۚۘۨۨۘۛۗۦ";
                    break;
                case 1198326500:
                    str = "ۘ۫ۛۥۘۦۢۤۤۨ۬ۥۙۦۘۙ۠۟";
                    f9 = f2;
                    break;
                case 1275207762:
                    str = "ۨ۟ۦۘۛۤۖۘۜۥۥۘۡ۬ۦۘ۠ۛۗ۠ۧ۠ۨۘ۠۠ۜۧۨۚۘۘ";
                    break;
                case 1287914930:
                    String str9 = "ۤۦۨۡ۫ۚۛۗۛۧۘۚۛ۠ۤۤۜۘۚ۬ۚۦۥ۟۫۟ۤ";
                    while (true) {
                        switch (str9.hashCode() ^ -747586639) {
                            case -1484744190:
                                str = "۬ۙۨۖۜۦۘۗۜ۠ۛۛۜۘۦۦۗۜ۫ۦۗۗۦۛۧ۬";
                                continue;
                            case -1316388770:
                                str9 = "ۜۨۨۘۘۖۜۘۜۘۦۡۗۨۖۨۘۜۜ۟ۗۧۗۘۡ۬";
                                break;
                            case -898984590:
                                if (!z3) {
                                    str9 = "۟ۡۛۨۗۙ۟۫۠۠۫ۧۜ۬ۡۘۢۖۖ۟ۢۥۘ";
                                    break;
                                } else {
                                    str9 = "ۢۡۡۘۤۗۛۛۘۜۘۙۜۥۤۧۢۚۜۥۘۡ۠ۥۘ";
                                    break;
                                }
                            case 2124518281:
                                str = "ۡۛۨۡ۠ۙ۫ۡۧۚۦۖۘۤ۫ۢۛۤۘۘ۬ۛۘۡ۟ۦۘ";
                                continue;
                        }
                    }
                    break;
                case 1360995128:
                    str = "ۨ۟ۦۘۛۤۖۘۜۥۥۘۡ۬ۦۘ۠ۛۗ۠ۧ۠ۨۘ۠۠ۜۧۨۚۘۘ";
                    f16 = f15;
                    break;
                case 1432352385:
                    z5 = this.f2646k;
                    str = "ۢۜۡ۟۫۠۬ۜۡۘۡ۬ۨۘ۬۠ۘ۫ۢۨ";
                    break;
                case 1577856104:
                    str = "ۤ۫ۥۡ۬ۥۢۨ۟ۡ۟۠ۗۚۦۚ۬۠ۜۧۘ۟ۦۤ";
                    f19 = f18;
                    break;
                case 1596580986:
                    str = "ۧۢۛ۬ۨۦۜ۟ۙۗۜ۬ۤ۬ۨۘۦۡۥ";
                    f20 = z8;
                    break;
                case 1632757475:
                    str = "ۨ۫ۖۚۙۥ۠ۥۥۘۤۚۦۦۧۨ";
                    f8 = f7;
                    break;
                case 1748013112:
                    fArr[1] = f8;
                    str = "ۘ۟ۗ۫ۥۖۘۢ۟ۚۘۗۜۤۡۨ۟ۙۜ";
                    break;
                case 1795312944:
                    str = "۫ۡ۠۟۬ۦۘ۬۬ۙۛۚۧ۠ۨۡۘۘۘۦۘۛۘۢ";
                    f11 = f10;
                    break;
                case 1805218025:
                    str = "ۢۤۚۗ۠۠۟۟ۙۤۖۖۘۙ۠ۨۘۧۥۙۡ۟ۖ";
                    f3 = f2;
                    break;
                case 1972713746:
                    z2 = this.f2643h;
                    str = "ۚۖۨۙۦۦۘۡۙۦ۬ۡ۬ۙۨۘ۠ۘۖۘۘۤۙۡ۫ۨۘۗۘۡۘ";
                    break;
                case 2021713806:
                    str = "۠ۥۨۘۙۥ۫ۧۜۥۘۢۨۥۘ۠ۗۢۗ۟۬ۥ۫";
                    f13 = f12;
                    break;
                case 2091959238:
                    fArr[2] = f11;
                    str = "ۦۖۡۤ۟ۗ۫ۢۖۥۘۙ۫ۘۡۜۘۦۗۖۘ۟ۖۖۘ";
                    break;
                case 2121572310:
                    str = "۟۠ۨۘۧۧۖ۫ۧۘۥۧۢۧۨ۬";
                    f8 = f6;
                    break;
            }
        }
    }

    public final void c() {
        Paint paint = null;
        String str = "ۘۨۨۘ۠ۢۛۜۥ۠ۛۥۘۧۧۘۖۜۡ۬۬ۘ";
        while (true) {
            switch ((str.hashCode() ^ 317) ^ 834133958) {
                case -2012720904:
                    this.f2648m = 0;
                    str = "ۙۦۗۧۘۖۘۛ۫ۨۜۛۘۘ۟ۙۛۨۘۦۘۛۦۢ";
                    break;
                case -1815081852:
                    this.f2650o.setCornerRadii(b((float) this.f2641f));
                    str = "ۦۧۨۥۙۖۘۦۧۜۥ۫ۙۡۙۛۖۘ";
                    break;
                case -1568508709:
                    paint.setColor(this.f2648m);
                    str = "ۘۧۛۤ۟ۤ۠ۡۖۙ۫ۙ۫ۜۗ۠۠ۖۘۖ۫ۗۧۘۚۨۡۜ";
                    break;
                case -1365378792:
                    this.f2643h = true;
                    str = "ۦۢۨ۟ۢۗۚ۠۟ۧۙۡۘۖۥۜ۟ۜۡ۠۬۫";
                    break;
                case -1233187650:
                case 1163907147:
                    return;
                case -768001594:
                    paint.setStrokeWidth((float) (this.f2647l * 2));
                    str = "ۥ۟ۢۥۜۡۨ۫ۜۜۨۦۗۜ۟ۗۛۜۥۙۧۤۛ۠ۦۘ";
                    break;
                case -567181643:
                    this.f2641f = utils.dpToPx(13.0f);
                    str = "ۜۡۚۗۢۡۘۢۛۢۢ۟ۨۘۖ۬۟ۚۦۡۥۡۨۧۖ";
                    break;
                case -311365454:
                    setBackground();
                    str = "ۨ۟۬ۙۤۨۘ۬ۢ۬ۜۘ۬۬ۦۜۡۛۡۨۘ";
                    break;
                case -273198690:
                    str = "ۤۗۖۘۢۤۨۖۥۜۡۡۛۦۥۨۘ۫ۥۧۘ۟ۜۦ";
                    break;
                case -250787752:
                    paint.setStyle(Paint.Style.STROKE);
                    str = "ۜۘۘ۫ۥۖۤ۠ۨۙۡۡۢۧۦۨ۬ۦۘۤۤۥۘ";
                    break;
                case -91417021:
                    setRoundingElevation(0.0f);
                    str = "ۡۥۧۘ۬۟ۡۘ۫ۛ۟۬ۧۢ۠ۢۙۙۤۙۘۡۥۘ";
                    break;
                case -78601064:
                    this.f2647l = 0;
                    str = "ۗۜۤۗۙۙۛ۬ۡۙۡۛ۟ۧۨۗۘۚ۬۠ۡۨۤۜۤۤۜۘ";
                    break;
                case 87139097:
                    this.f2646k = true;
                    str = "ۙۖۦۘۡۚۨۘۚۨۘۖ۟۠ۥۗ۟ۖۙ۠۠ۗۡۘ";
                    break;
                case 111044981:
                    this.f2644i = true;
                    str = "ۧۛۦۘۛۚۦۜۢۖۢۜۧۘۨۧ";
                    break;
                case 1301950321:
                    paint = this.f2637b;
                    str = "ۛۦ۠ۚۦۦۘۚۜۡۘۥۤۧۡۙۘۘۨۧ۬ۡۘۘ";
                    break;
                case 1507076235:
                    this.f2642g = false;
                    str = "ۨ۟ۨۘۢۙۢۖ۟ۜۧۦۢۜۚۢ۫۬ۜۛ۬۟";
                    break;
                case 1539604213:
                    this.f2649n = 0.0f;
                    str = "ۦۛ۠۟۟ۘ۠ۤۥۘۡ۠ۤۦۤۘۘۨۙ۫ۛۗۜۘۛۤۜۘ";
                    break;
                case 1857450035:
                    paint.setAntiAlias(true);
                    str = "ۤۥۗ۟ۜۥ۟۫۠۠ۛۘۗۡ۫۫۠۫ۚۧۖۘۙ۠ۦ";
                    break;
                case 1919651362:
                    this.f2645j = true;
                    str = "۟ۗۥۘۧ۠ۥۜ۬ۖۘ۠ۡۜۘۦۖۖۘ";
                    break;
                case 2002098507:
                    String str2 = "ۡۦ۟ۙۢ۬ۗۤ۬۫ۦۧ۫ۚۜۘۤۖۢ";
                    while (true) {
                        switch (str2.hashCode() ^ 329406293) {
                            case -1372295698:
                                str = "ۦۤۤ۠ۡۖۘۜۧۡۘۡۢۜۗ۫ۥۘۗۡۧۘ۫ۜۨۥ۟ۜۙۡ";
                                continue;
                            case -65638669:
                                str2 = "ۘۘۢ۠ۡ۠ۗۧۦۘۡ۬ۥۘۖۘۜ۠ۘۘۘۡ۬ۧۧۦۡ";
                                break;
                            case 1286953506:
                                str = "ۖ۠ۦۘۡ۬ۡۜۧۙۗ۟ۛ۟ۤۛۡۡۡۘ";
                                continue;
                            case 2006095066:
                                if (!isInEditMode()) {
                                    str2 = "۠ۢۡۖۖ۟ۤۨۖۜۖۧۘۗۤۡ";
                                    break;
                                } else {
                                    str2 = "ۖۤۡۘۛۜۡۖۤۨۘۨۜۢ۠۟ۚ";
                                    break;
                                }
                        }
                    }
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0055, code lost:
        r0 = "۠ۛ۬۬ۢۘۘ۟ۤۘ۬۬ۘۘ۟۠ۥۢۤۛ۠ۢۛۨ۟ۖۘ۫ۥۦۘ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r6) {
        /*
            r5 = this;
            r1 = 0
            java.lang.String r0 = "ۜۨ۫ۢۛۛۜۡ۫ۜۖۨۢ۟ۨۘۚ۬۠ۛۧۡۘۜ۠ۥ"
        L_0x0003:
            int r2 = r0.hashCode()
            r3 = 599(0x257, float:8.4E-43)
            r4 = 382855469(0x16d1e92d, float:3.3912926E-25)
            r2 = r2 ^ r3
            r2 = r2 ^ r4
            switch(r2) {
                case -2143763648: goto L_0x0023;
                case -1644565235: goto L_0x0047;
                case -1240875225: goto L_0x0070;
                case 934420466: goto L_0x0012;
                case 982327649: goto L_0x001d;
                case 1048168597: goto L_0x0015;
                case 1199050608: goto L_0x0029;
                case 1304308080: goto L_0x0018;
                case 1961697260: goto L_0x0068;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x0003
        L_0x0012:
            java.lang.String r0 = "ۗۗۢۖۥۦۙۡۧۘۨۜ۟۟۫ۖۘۦۧۙۛۦۡۘ"
            goto L_0x0003
        L_0x0015:
            java.lang.String r0 = "ۚۗۥۖ۬ۘۘۗۛۛ۬ۘۘ۟ۤۦۘ"
            goto L_0x0003
        L_0x0018:
            android.graphics.Path r1 = r5.f2636a
            java.lang.String r0 = "۬۠ۖۚۚۦۘۤ۠ۨۧ۬ۗ۠۬ۗۥۙ۠"
            goto L_0x0003
        L_0x001d:
            r6.clipPath(r1)
            java.lang.String r0 = "۬ۤۜۤ۠ۥۙۤۢۚۨۙۗ۠ۗۢۙ۠ۡۨۛۨۚ۬"
            goto L_0x0003
        L_0x0023:
            super.draw(r6)
            java.lang.String r0 = "ۗۧۙۘۜ۠ۛ۬ۖۗۥۘ۟ۘ۫۟ۡۘۖۜ۬"
            goto L_0x0003
        L_0x0029:
            r2 = -1770886964(0xffffffff967268cc, float:-1.9581672E-25)
            java.lang.String r0 = "ۥۡۗ۠ۙۙۦۨۚۥۡۗۘ۠ۘۗ۟ۤ"
        L_0x002e:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -358193160: goto L_0x003d;
                case 616990706: goto L_0x0055;
                case 1067200494: goto L_0x0044;
                case 1241580462: goto L_0x0037;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x002e
        L_0x0037:
            java.lang.String r0 = "ۡۧۦۜۚۜۘۢۨۨۧۖ۠ۦۦۛۜۜۛۤۚۡۙۢۡۘ"
            goto L_0x002e
        L_0x003a:
            java.lang.String r0 = "ۜ۟ۡۘۢۥۨۘۚۘۨۘۢۘ۬ۚۗۘۘۤۨۚ"
            goto L_0x002e
        L_0x003d:
            int r0 = r5.f2647l
            if (r0 <= 0) goto L_0x003a
            java.lang.String r0 = "۟ۤۖۧۦۧۚۗۖۡۛۖۙۖۦۖۜۤۗۜۘۙۗ"
            goto L_0x002e
        L_0x0044:
            java.lang.String r0 = "ۗ۫ۘ۠ۡۘۡۛۤۘۗۦۘۤۛۤۡۙۨۚۜۖۨۗۥۘۗۜۧ"
            goto L_0x0003
        L_0x0047:
            r2 = 267924329(0xff83369, float:2.447449E-29)
            java.lang.String r0 = "ۧۚۛ۠۬ۖۤۦۘۘ۠ۖۨۘۡۙۧۙۗۜ"
        L_0x004c:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1904335658: goto L_0x0055;
                case -1480181392: goto L_0x005b;
                case 577116407: goto L_0x0065;
                case 1021394542: goto L_0x0062;
                default: goto L_0x0054;
            }
        L_0x0054:
            goto L_0x004c
        L_0x0055:
            java.lang.String r0 = "۠ۛ۬۬ۢۘۘ۟ۤۘ۬۬ۘۘ۟۠ۥۢۤۛ۠ۢۛۨ۟ۖۘ۫ۥۦۘ"
            goto L_0x0003
        L_0x0058:
            java.lang.String r0 = "ۗۨۖۡۥ۬ۧۨۥ۫ۦۤۢۜۗۧۧۛۗۘۘۦۡ۫"
            goto L_0x004c
        L_0x005b:
            int r0 = r5.f2648m
            if (r0 == 0) goto L_0x0058
            java.lang.String r0 = "ۥۘۚۙۨۡۚۧۘۘۜۤۖۘۤ۟ۥ۬ۜ۟ۖۘۧۖ۟"
            goto L_0x004c
        L_0x0062:
            java.lang.String r0 = "ۦۖ۬ۤۧ۟ۦ۬۬ۢۢۧ۫ۨۘۘ"
            goto L_0x004c
        L_0x0065:
            java.lang.String r0 = "ۦۧۡۘۙۙۛۗۨۢۗۙۜ۫ۧۜۥۥۘ۬۟ۘۢۤۙ"
            goto L_0x0003
        L_0x0068:
            android.graphics.Paint r0 = r5.f2637b
            r6.drawPath(r1, r0)
            java.lang.String r0 = "۠ۛ۬۬ۢۘۘ۟ۤۘ۬۬ۘۘ۟۠ۥۢۤۛ۠ۢۛۨ۟ۖۘ۫ۥۦۘ"
            goto L_0x0003
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.whatsapp.rounded.SquareStories.draw(android.graphics.Canvas):void");
    }

    public int getRoundedCornerRadius() {
        String str = "ۢۢۡۤۙۖۘۨۥۗۨۨۘۧۥۧۘۧۜ۠ۙۥ۬ۧۜۖ۟۫ۖ";
        while (true) {
            switch ((str.hashCode() ^ 987) ^ -1875388984) {
                case -1476322544:
                    str = "ۜۛۧۙ۠ۡۙۙۛۙۡۥۘ۬۟ۗۦ۟۠۫ۘۦۘ";
                    break;
                case 1828698293:
                    return this.f2641f;
            }
        }
    }

    public int getRoundingBorderColor() {
        String str = "ۢۚ۫ۧۜ۟۟ۢۙۜ۫ۢ۫ۛ۬ۚۤۡۤۖۨۘ";
        while (true) {
            switch ((str.hashCode() ^ 607) ^ 407976560) {
                case -349555394:
                    str = "ۡۥۨۙ۫ۜ۠ۥۛۧۡۧۘۖۗۛ۟ۡۦ";
                    break;
                case 1152567658:
                    return this.f2648m;
            }
        }
    }

    public int getRoundingBorderWidth() {
        String str = "ۦۘۗۘۙۖۘۜۢۚ۟ۡۧۘۨۖۗۥۢۦۘ";
        while (true) {
            switch ((str.hashCode() ^ 883) ^ -722822554) {
                case -1856263316:
                    str = "۟ۧ۟۟ۗۨۘۘۦۗۙۙۢ۠ۢۧۡ۟ۗۛ۬ۨۜ۬ۡۘ";
                    break;
                case 1238395495:
                    return this.f2647l;
            }
        }
    }

    public float getRoundingElevation() {
        String str = "ۡۖۨۘ۬ۥۘۧ۫۠۠ۛۗۙ۠ۘۘۙ۬ۧۦ۬ۤۧۡۨۘۥ۬ۧ";
        while (true) {
            switch ((str.hashCode() ^ 587) ^ 1637771045) {
                case 1341717893:
                    str = "ۧۨۢۗۡۜۘۥ۠ۦۙ۫ۨۡۛۨۘ۟ۧۗۧۙۥۘۧۖ۟";
                    break;
                case 1399799862:
                    return this.f2649n;
            }
        }
    }

    public boolean isRoundAsCircle() {
        String str = "ۡۢۜۥۥۘۚۙۨ۫۟ۗ۟۫ۚۤۘۦۘ۬ۗۛۛۤۡ۬ۗۤ";
        while (true) {
            switch ((str.hashCode() ^ 567) ^ 1714926356) {
                case -1942691401:
                    str = "ۨۜۥۘۡ۠ۡۘۜۦۖۘۘۥ۫۟۟ۥۘۛۢ";
                    break;
                case 213692492:
                    return this.f2642g;
            }
        }
    }

    public boolean isRoundBottomLeft() {
        String str = "ۛۗۥ۠ۧۨۘۤۦۘۛۨۜ۟ۗ۬۬ۚۖ۠ۚۥ۠۬";
        while (true) {
            switch ((str.hashCode() ^ 956) ^ 368469550) {
                case -1203852072:
                    str = "ۜۚۤۡۚۜۘۘۢۦۥۙۥۘ۠ۘۘۘۦۨۘ۫ۗۡ";
                    break;
                case -244945203:
                    return this.f2645j;
            }
        }
    }

    public boolean isRoundBottomRight() {
        String str = "ۘ۫ۜۘ۠ۚۦۘ۬ۗۘۦ۟ۨۘۤۖ۫ۚۖۚ۠ۧۤ۠ۢۘ۬ۢۖۘ";
        while (true) {
            switch ((str.hashCode() ^ 564) ^ 1477035079) {
                case -1425558985:
                    return this.f2646k;
                case -689197918:
                    str = "ۜۚۛۘۖۘۘۗۗۦۘۙۛۨۘۤ۫ۚۖ۠ۢ";
                    break;
            }
        }
    }

    public boolean isRoundTopLeft() {
        String str = "ۥۚۢ۟۠ۚۛۧۦۘۘۤۢۚۡۧۘۘ۠ۚ۫ۗۨ";
        while (true) {
            switch ((str.hashCode() ^ 817) ^ -782653248) {
                case 325801663:
                    str = "ۘۥۜ۟ۚۨۚۥۧۘۤۦۘۗۜۨۘۥ۟ۛ";
                    break;
                case 860171265:
                    return this.f2643h;
            }
        }
    }

    public boolean isRoundTopRight() {
        String str = "ۚۘۦۘۙۚ۠ۚۦۗۙۘۡۙۚۨۢۜ۠ۨۥۤۗۜۡۚۜۘ";
        while (true) {
            switch ((str.hashCode() ^ 27) ^ -217642838) {
                case 1325704749:
                    str = "۟ۖۦۘۤۤ۠ۚۦۦۡۦۘۧ۬ۤ";
                    break;
                case 1705868894:
                    return this.f2644i;
            }
        }
    }

    public void onAttachedToWindow() {
        String str = "ۢۥۗۢۥۡۘۡۙۥۘۜ۬۠ۚۘۚۡۛۘۘۢۙۘۘۡۧ";
        while (true) {
            switch ((str.hashCode() ^ 491) ^ 1537032496) {
                case -615946081:
                    return;
                case 109979996:
                    super.onAttachedToWindow();
                    str = "۫ۢۡۘۗۧۦ۟ۖۘۛۘ۬۫ۤۥۧۤۚۢ۠ۡۘ";
                    break;
                case 691121575:
                    this.f2640e = false;
                    str = "ۤۦۦۘۨۗۙۨۤۥۘۤۗۡۘۚۢ۠۟ۚۧۥۤۦ";
                    break;
                case 1358285031:
                    str = "۫ۙۙۖ۠ۜۚۗۥۘۗۤۗۤ۠ۡۘۙۢۚۡۖۧ";
                    break;
            }
        }
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        String str = "ۛ۟ۛۚۨۦۘۢۢۥۘۤۘۧ۟ۖۦۘ";
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (true) {
            switch ((str.hashCode() ^ 257) ^ -27033787) {
                case -1677585655:
                    str = "ۢۦۜۘۥۡۧۤ۟ۙۦۥۥۙۘ۫ۙۧۨ";
                    break;
                case -1204785732:
                    this.f2638c.set(0.0f, 0.0f, f3, f2);
                    str = "ۧ۫ۜۨۧۛ۫ۥۛۧۦۗۙۤۘۘۨۤ۫ۖ۠ۚۧۧۨ";
                    break;
                case -1201346235:
                    String str2 = "ۧۥۚۨۥ۠ۢۖۜۘۚۨ۬ۗ۠ۘۘۜۢۥۦۦۛ";
                    while (true) {
                        switch (str2.hashCode() ^ 955540146) {
                            case -1186311938:
                                if (this.f2640e) {
                                    str2 = "۬ۥۜۘۨ۠ۖۘۗ۫ۡۘۨۛۖۙۡۦۘۚۗۘ";
                                    break;
                                } else {
                                    str2 = "۟ۡ۫ۙۙ۟ۨۥۥۡۖۥۚۢۘ۠ۜۗ۟ۛۡۘ";
                                    break;
                                }
                            case 1369398606:
                                str2 = "ۙۗۥ۠ۙۖۤۧ۠۫ۢۦۘۦۡۙۛۨۚۘۖۦۡۤۜۘ";
                                break;
                            case 1916925898:
                                str = "۫ۢۗۘۧۘۢۤۥ۬۠ۙۦ۫ۦۛۖ";
                                continue;
                            case 1953547930:
                                str = "۬۟ۢۙۚۗۤۤۤۢۡۖ۟ۦۧۥۦۘۡۦۧ";
                                continue;
                        }
                    }
                    break;
                case -1025013162:
                    f3 = (float) (i4 - i2);
                    str = "ۙۘۗۙۘۜۘۖ۟ۜۘۚۧۥۚۤۧۤۦۖۡۚۧۨۚۜۘ۠ۗۧ";
                    break;
                case -806260428:
                    str = "ۢۡ۟ۡۙۥۛۘۨۤۛۨۘۘۗۛ۟ۘۥۘۗ۬ۦۙۥ";
                    break;
                case -196808107:
                    return;
                case -134372145:
                    f2 = (float) (i5 - i3);
                    str = "ۘۧۜۜۛۡۘۢ۟ۗۘۢۘ۫ۤۨ";
                    break;
                case 638526387:
                    str = "ۘۦۚۘۦ۠ۦۘۧۡۥۘۡۢۙ۬۫۬۟ۦۥ۠ۗ";
                    break;
                case 715847230:
                    str = "ۜۘۡۘۜۨۤۥۢۧ۫ۗۡۘۘۢۤۜۚ۟ۘ۠ۡۘ۬ۚ۠ۗۜۖ";
                    break;
                case 768627749:
                    super.onLayout(z2, i2, i3, i4, i5);
                    str = "ۖۥۥۙۧۘۘۨۖۖۖ۠۬ۚ۠ۚۨۦۡۨۘ۬ۡۘۘ";
                    break;
                case 903349375:
                    str = "ۦۧۙۨۖۖۗۙۜۗۛۜۡۛۛۨ۠ۥۜۘۦ";
                    break;
                case 1088471935:
                    a();
                    str = "۫ۢۗۘۧۘۢۤۥ۬۠ۙۦ۫ۦۛۖ";
                    break;
                case 1301829366:
                    str = "ۥ۬۬ۚۛۜۘۢۛۘۘۧ۫ۥۖ۟ۦ";
                    break;
                case 1368387221:
                    this.f2640e = true;
                    str = "ۨۦۙ۬ۢۗۘ۬ۥۗۚۖۘۘۧۡۘۖۦۖۘ۬ۙۘۖۜۦۘ";
                    break;
            }
        }
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        String str = "ۚ۟ۜۘ۫۠ۘۘۖۦۢۙۗۚۡۤۘۥۨۘۘ";
        while (true) {
            switch ((str.hashCode() ^ 201) ^ -540201098) {
                case -1477818361:
                    str = "ۜ۬ۤۙۥ۫ۦۢۦۘۤ۫ۨۘۜۥ۬ۤۘۖ۫ۦۖۘۢۗۡۡۖۗ";
                    break;
                case -1098475799:
                    return;
                case -641948285:
                    a();
                    str = "ۨۤۘۘ۬ۢ۟۬۫ۖۢۧۡۘۧۖۥۢ۟ۘۦۡ۠ۗ۠ۥۘ";
                    break;
                case 774560040:
                    str = "۠ۡۧۡۢۜۘۦۡۦۘۤۜۨۘۛۧۛۡۥۥ";
                    break;
                case 925641013:
                    super.onSizeChanged(i2, i3, i4, i5);
                    str = "ۖۨ۬ۨۜۦۘۖ۟ۧۛ۫ۦۘۡۥۨ۬ۖۖۘۨۖۘۘ۬ۥۖۙۖۘ";
                    break;
                case 956146261:
                    str = "ۢۥۥۛ۠ۨ۫ۢۨ۬ۘۡۘۘۡۖۙۘۨۘ";
                    break;
                case 1081291350:
                    str = "۫ۖۚۧۚۜۘ۠۫ۨۘۛ۟ۨۢۢۙۛۗۡ۫ۦۧۘ۟ۛۖۦۜۗ";
                    break;
                case 1768787261:
                    str = "ۧۨ۬ۧ۠ۛۙۨۧۘ۠ۥۦۘۨۢ۟";
                    break;
            }
        }
    }

    public void setBackground() {
        GradientDrawable gradientDrawable = null;
        String str = "ۨ۠ۡۥۨۛۗۥۘۦۦۦۤ۟۫ۥۘۨ۟ۛۤۧۥۧۘ";
        while (true) {
            switch ((str.hashCode() ^ 676) ^ 659358739) {
                case -1852659728:
                    setBackground(this.f2650o);
                    str = "۬۠ۨۘۙۨۦۘۨۥ۠۟ۤ۫ۥۡۡۙ";
                    break;
                case -1760442704:
                    str = "ۡۙۖۘۧۦۛۘۚۘۘۘۡۦۘۚۧۜۘۢۜۦۡ۟ۗۖۥ";
                    break;
                case -1378539561:
                    return;
                case 478373414:
                    gradientDrawable.setColor(0);
                    str = "ۡۢۜۜۢۙۢۡۛۧۡۥۘ۬۠۬";
                    break;
                case 881005067:
                    setClipToOutline(true);
                    str = "ۦۧۨۘ۟ۧۗۢ۬ۤۡۙۡۘۛۜ۬";
                    break;
                case 1587953107:
                    gradientDrawable = new GradientDrawable();
                    str = "ۚ۠ۥۗۗۖۜ۠ۨۘۗۙۥ۟۫ۨۘۛۦۘۘ";
                    break;
                case 2037942792:
                    this.f2650o = gradientDrawable;
                    str = "۠۬ۙۨۡۘۘ۟ۦۨۡۡۦ۬ۖۦ";
                    break;
            }
        }
    }

    public void setRoundAsCircle(boolean z2) {
        String str = "ۚ۬ۥۤۙۜۘۡۗۙۢۙۙ۫ۤۗۜ۬ۘۘۘ۬ۚۚۨۘۘ";
        while (true) {
            switch ((str.hashCode() ^ 15) ^ 1469349684) {
                case -830233772:
                    return;
                case -802374887:
                    this.f2642g = z2;
                    str = "ۦۧۖۘۜۤۥ۫ۤۚۨۚۥۤۨ۫ۡۜۘ۫ۨۢۜۚۛ";
                    break;
                case -671956881:
                    String str2 = "ۚۜۘ۬ۛ۬ۛۛ۟ۤۚ۠ۖۗۢ";
                    while (true) {
                        switch (str2.hashCode() ^ 524488276) {
                            case -1455261885:
                                str = "ۛۗۘۙۢۡۢ۬۬۠ۢۨۖۤۨۥۙ۫ۥ۠ۧ";
                                continue;
                            case -239093605:
                                str = "ۚۘۚ۠ۖۧۘۥۧۡۛ۫ۛۛۛۜۡۗۧۥۚۦۡ۠ۗ۬ۛۜ";
                                continue;
                            case 1637583472:
                                str2 = "ۘۚ۟ۦۦۛۨ۫ۨۡۢۥۘۛ۠ۛۨۜ";
                                break;
                            case 2040573307:
                                if (z2 == this.f2642g) {
                                    str2 = "ۥۤۧ۟۫ۙۜۥ۫ۦ۬ۧۜۥ۫ۖۧۘۘۧۘۡۘ";
                                    break;
                                } else {
                                    str2 = "ۙۢۦۡ۫ۜۘۗۗ۠ۤۖۜۘۛۧۤۖۥۘۡۘۥۘۛۗۦ";
                                    break;
                                }
                        }
                    }
                    break;
                case 91354849:
                    a();
                    str = "ۙۨۘۗۨۦۘ۟۠۬ۨۨۖۥۦۥۘۨۤۗ";
                    break;
                case 263919719:
                    str = "ۤۦۜۘۧۨۜۘۧۘۦۘۖۜۘۘۜۡ۟ۗۜۜ۬ۛ۫۫ۤۘۘ";
                    break;
                case 850262322:
                    str = "ۜۤۨۘۦۛۥ۬ۦۖۥۡۘۙۦۤۛ۟ۦ۟ۨۨۘ";
                    break;
                case 966569707:
                    postInvalidate();
                    str = "ۛۗۘۙۢۡۢ۬۬۠ۢۨۖۤۨۥۙ۫ۥ۠ۧ";
                    break;
            }
        }
    }

    public void setRoundedCornerRadius(int i2) {
        String str = "ۦۚۡۘۚۤۤۨۧۦۘۘۥۖۘۡۡ۠ۜۙۙۙۨۖۜ۫ۢۜۙ";
        while (true) {
            switch ((str.hashCode() ^ 546) ^ -1392208269) {
                case -953633682:
                    return;
                case -515107184:
                    str = "ۖۗۦۢۗۧۡۥۨۢۦ۬۟ۖۘ۟ۨۖۘۜ۬ۥۥ۟";
                    break;
                case 745762469:
                    str = "ۛۘۥۧۡۤۥۡ۟ۨ۬ۘۚۥ۟";
                    break;
                case 1925136165:
                    setRoundedCornerRadius(i2, true, true, true, true);
                    str = "ۛۚۜۥۛۘۗ۬ۦ۟ۛۢۨۦۗ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006d, code lost:
        r0 = "ۘۦ۟۟ۜۜۨ۟۟ۜۧۘۘۤۜۜۘ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setRoundedCornerRadius(int r5, boolean r6, boolean r7, boolean r8, boolean r9) {
        /*
            r4 = this;
            java.lang.String r0 = "ۧ۟ۡۚۧۢ۠۫ۗۦۙۗۧۜۢۤ۠ۤ۬ۖ۠ۤۥۦ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 54
            r3 = -823192942(0xffffffffceef1292, float:-2.00548582E9)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -1412915276: goto L_0x00d0;
                case -1132500862: goto L_0x0014;
                case -1115021230: goto L_0x0023;
                case -646781775: goto L_0x0041;
                case -552958675: goto L_0x009f;
                case -370225832: goto L_0x00ee;
                case -237313893: goto L_0x001d;
                case 26442462: goto L_0x005f;
                case 101073927: goto L_0x00e3;
                case 104562374: goto L_0x0080;
                case 175468220: goto L_0x00d6;
                case 498095594: goto L_0x0011;
                case 654618761: goto L_0x00ca;
                case 1110506385: goto L_0x0020;
                case 1344109181: goto L_0x00be;
                case 1890198598: goto L_0x00c4;
                case 1933269259: goto L_0x0017;
                case 1975946654: goto L_0x001a;
                case 2125509892: goto L_0x00dc;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "ۦۨ۬ۗۗ۫۠ۦۜ۠۫ۨۘۗ۫۟۬۟۫۬ۥۨۘ۬"
            goto L_0x0002
        L_0x0014:
            java.lang.String r0 = "ۡۦۥۘۛۛۦۘۛ۫ۥ۟۠ۤۡۘ"
            goto L_0x0002
        L_0x0017:
            java.lang.String r0 = "ۦۢ۠ۜۢ۠۫۠ۦۨ۬۠ۢۧ۟ۛ۬ۨۘ"
            goto L_0x0002
        L_0x001a:
            java.lang.String r0 = "۟ۦۜۧۨۘۧۛۧ۬ۖۜ۫ۤۜۖۚۥ"
            goto L_0x0002
        L_0x001d:
            java.lang.String r0 = "۬ۥ۫ۜ۬۟ۤ۟ۚۢۨۘۥ۟ۖۘۤۛۖۘۙۖۥۘ"
            goto L_0x0002
        L_0x0020:
            java.lang.String r0 = "ۖۘۦ۠ۥۧۘ۫ۨۧۜۖۢ۟۫ۦۦ۬ۡۘۧۜۖۘ"
            goto L_0x0002
        L_0x0023:
            r1 = 195235785(0xba30fc9, float:6.2809067E-32)
            java.lang.String r0 = "ۢ۟ۦۘۦۛۡۡ۠ۡۘۛۧۗۨۧ۬ۢۧۥۛۛۚۗۛۨۘ۠ۙۨۘ"
        L_0x0028:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1030014999: goto L_0x006d;
                case -661999195: goto L_0x0031;
                case -436735810: goto L_0x003b;
                case 944056381: goto L_0x003e;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x0028
        L_0x0031:
            int r0 = r4.f2641f
            if (r0 != r5) goto L_0x0038
            java.lang.String r0 = "۟ۥۢۘ۠۫ۨۜۚۥۜۦۧ"
            goto L_0x0028
        L_0x0038:
            java.lang.String r0 = "ۧۤ۬ۘۘ۫ۜۦۜ۬ۦۦۢۦ۫ۨ۠ۙ۠ۧۗ"
            goto L_0x0028
        L_0x003b:
            java.lang.String r0 = "ۜۥ۠ۛۤۜ۟ۜ۟۟ۧۧۘۦۘۧۨۖۘ"
            goto L_0x0028
        L_0x003e:
            java.lang.String r0 = "ۦۜۗۨۜ۬۬ۘۡۨ۟۠۠ۘۥۖۤۡۖۘۥۘۗۜۙۘۜۧ"
            goto L_0x0002
        L_0x0041:
            r1 = -401112481(0xffffffffe817825f, float:-2.861929E24)
            java.lang.String r0 = "۬ۡۘۘۖۚۘۘۜۦۚۗ۫ۦۘۗۚۥۦۡ۠"
        L_0x0046:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case 243614869: goto L_0x006d;
                case 428504788: goto L_0x005c;
                case 1819320091: goto L_0x004f;
                case 2099932575: goto L_0x0055;
                default: goto L_0x004e;
            }
        L_0x004e:
            goto L_0x0046
        L_0x004f:
            java.lang.String r0 = "۠ۘۗۖۗۥۚ۟ۜۥۚ۫۟ۜۛ"
            goto L_0x0002
        L_0x0052:
            java.lang.String r0 = "ۤۙۤۦۘ۫ۜۢۚ۫ۧۜۧۡۖۜۢۖ"
            goto L_0x0046
        L_0x0055:
            boolean r0 = r4.f2643h
            if (r0 != r6) goto L_0x0052
            java.lang.String r0 = "۫۬ۦۘۥ۠۫ۡ۠ۦۘۡۢۡۘۙۢۚ"
            goto L_0x0046
        L_0x005c:
            java.lang.String r0 = "ۦۥۛۚۛۡۘ۟۟ۨۘۤۚۗۘۥۨۨۦ۠"
            goto L_0x0046
        L_0x005f:
            r1 = 2072164694(0x7b82b956, float:1.3575153E36)
            java.lang.String r0 = "ۤۛۘۗۚۖۘۛۡۦۤۗۜۘۜۢۜ۠ۦ"
        L_0x0064:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1880273589: goto L_0x007d;
                case -1640492955: goto L_0x0073;
                case 1148225342: goto L_0x007a;
                case 1801513304: goto L_0x006d;
                default: goto L_0x006c;
            }
        L_0x006c:
            goto L_0x0064
        L_0x006d:
            java.lang.String r0 = "ۘۦ۟۟ۜۜۨ۟۟ۜۧۘۘۤۜۜۘ"
            goto L_0x0002
        L_0x0070:
            java.lang.String r0 = "ۙۧۤ۟ۚ۠ۗۘۜۘ۟۠۠ۛۨۤۥۧۦۢ۠ۢۧۡۨۘ"
            goto L_0x0064
        L_0x0073:
            boolean r0 = r4.f2644i
            if (r0 != r7) goto L_0x0070
            java.lang.String r0 = "ۢ۟ۨۖ۫ۜ۠۟ۜۘۛۛۥۘۨۨۛ۠ۡۤۛ۠۠۬ۜۡ"
            goto L_0x0064
        L_0x007a:
            java.lang.String r0 = "ۤۘ۫ۢ۠ۜۘۖۘۤۧ۫۬ۘ۫ۜۦۛۖ۫ۚ۠ۡۜ"
            goto L_0x0064
        L_0x007d:
            java.lang.String r0 = "ۙۖۛ۟ۜۥۢۥۘ۬ۤ۬۬۬۫"
            goto L_0x0002
        L_0x0080:
            r1 = 659765025(0x27533721, float:2.9312018E-15)
            java.lang.String r0 = "ۦۢۙۚۖ۬۫ۦۜۦۙ۟ۚۜ۠"
        L_0x0085:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1620578526: goto L_0x006d;
                case -1529178175: goto L_0x0094;
                case 1419720925: goto L_0x009b;
                case 1876245726: goto L_0x008e;
                default: goto L_0x008d;
            }
        L_0x008d:
            goto L_0x0085
        L_0x008e:
            java.lang.String r0 = "ۙ۫۬ۚۙ۫ۖۦۨۘۚۨۥۘۢۙۡۘۡۡۨۘۧۘۢ۠ۥۡ"
            goto L_0x0085
        L_0x0091:
            java.lang.String r0 = "ۨۖۧۘ۠۬ۛ۟۟ۛۡ۬ۤۚۤ۟ۙ۟ۘ۠ۗۨۘ۟ۙۡۘ"
            goto L_0x0085
        L_0x0094:
            boolean r0 = r4.f2645j
            if (r0 != r9) goto L_0x0091
            java.lang.String r0 = "ۤۛ۠ۙۜۨۖ۬ۛۗ۬ۨۘۢۗۖ۟۟ۘۨۘۘۗۜۡۘ۫ۛۨۘ"
            goto L_0x0085
        L_0x009b:
            java.lang.String r0 = "۠ۘۛ۫ۦ۬ۦ۬ۡۘۛۤۥۖ۠ۤ"
            goto L_0x0002
        L_0x009f:
            r1 = -1286226428(0xffffffffb355be04, float:-4.9765745E-8)
            java.lang.String r0 = "۬ۗۘۘۘۦۜ۟ۛۢۗۜۘ۠ۙۨۢۚۡۘ"
        L_0x00a4:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1193800857: goto L_0x00b7;
                case -700156479: goto L_0x00ba;
                case -254674230: goto L_0x00ad;
                case 1266427578: goto L_0x00ea;
                default: goto L_0x00ac;
            }
        L_0x00ac:
            goto L_0x00a4
        L_0x00ad:
            boolean r0 = r4.f2646k
            if (r0 == r8) goto L_0x00b4
            java.lang.String r0 = "۠۟ۦۘۤۡۖ۫ۢۖۘۥۧۗۦ۟ۧ۠ۘۗۛۚۧ"
            goto L_0x00a4
        L_0x00b4:
            java.lang.String r0 = "ۥۚ۫ۛۜۡۘ۠ۢۛۚۖۘۖۤ۠ۧۤ"
            goto L_0x00a4
        L_0x00b7:
            java.lang.String r0 = "ۢۧۜۘۧ۟ۖۘۘۢۨۡۚۨۘۤۤۥۘ۬ۚ۠ۚۧۙۘۖۥۘۨۡۨ"
            goto L_0x00a4
        L_0x00ba:
            java.lang.String r0 = "ۘۦ۟۟ۜۜۨ۟۟ۜۧۘۘۤۜۜۘ"
            goto L_0x0002
        L_0x00be:
            r4.f2641f = r5
            java.lang.String r0 = "ۜۚۘۘۧۘۦۥۘۡۘۦ۫ۚ۫ۛ۠ۜۥ۟ۚۢ"
            goto L_0x0002
        L_0x00c4:
            r4.f2643h = r6
            java.lang.String r0 = "ۢۖۤ۫ۚۛۧۖۗۖۛۡۘۢۡۦۘۘۗۥ"
            goto L_0x0002
        L_0x00ca:
            r4.f2644i = r7
            java.lang.String r0 = "ۨ۟ۤۧ۫ۥۘۗۨ۠ۦ۬ۘۦۡ۫ۦۖ۬۬ۥۥۢ۬ۨۘۨ۫ۦ"
            goto L_0x0002
        L_0x00d0:
            r4.f2645j = r9
            java.lang.String r0 = "ۛۨۦۘۥۘۦۛۢۡۘۤ۠ۜۘ۬۠ۦۘ۬ۧۘۘۘۡ۬"
            goto L_0x0002
        L_0x00d6:
            r4.f2646k = r8
            java.lang.String r0 = "ۥۘۘۘۚۤ۠۠۫ۜۦۢ۟ۜۧۜۘۙۥۥۘۛۨۘۘ۟ۤۖۘۨۛۢ"
            goto L_0x0002
        L_0x00dc:
            r4.a()
            java.lang.String r0 = "ۢۚۚۙۤۙۦۦۘۥۖۡۘۦ۫ۚۚۜۘۘ"
            goto L_0x0002
        L_0x00e3:
            r4.postInvalidate()
            java.lang.String r0 = "ۡۦۡۖۦۜۘۡۧۙ۬۠ۜۤۛۡ۠ۤۨۙۨۥۚۧۨ"
            goto L_0x0002
        L_0x00ea:
            java.lang.String r0 = "ۡۦۡۖۦۜۘۡۧۙ۬۠ۜۤۛۡ۠ۤۨۙۨۥۚۧۨ"
            goto L_0x0002
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.whatsapp.rounded.SquareStories.setRoundedCornerRadius(int, boolean, boolean, boolean, boolean):void");
    }

    public void setRoundingBorderColor(int i2) {
        String str = "ۤۦۨۘۛۧۘۧۘۦۘۗۘۤۘ۬ۤۥۡۧۛۘ۠ۢ۫ۦۘ";
        while (true) {
            switch ((str.hashCode() ^ 204) ^ -678504575) {
                case -1305413296:
                    String str2 = "ۤۦۘۘ۬ۥۜۧۗۘۧۤۥۘ۬۬ۛۨۚۡۘۜۗۡۘۥ۠ۦۘۡۗ۬";
                    while (true) {
                        switch (str2.hashCode() ^ -217691041) {
                            case -1150625939:
                                str = "۠ۗۖۘۡۢۗۥۤۚۦ۟ۢۗۚۢۗۘۙۦۧۨۘۢ۠ۙ";
                                continue;
                            case -859421927:
                                str2 = "ۚۘۨۦۧۘ۬ۡۜۦ۫ۙۘ۟ۨۘۤۖۡۘ۬ۡۥۘ";
                                break;
                            case -584816299:
                                if (i2 == this.f2648m) {
                                    str2 = "ۜ۠ۗۡۦ۠ۤۚۗۙۡۘۘۜۥۘ۬ۗ۬ۨۙۖۘۜۦۖۘ";
                                    break;
                                } else {
                                    str2 = "۟ۜۡۛۡۦۡۙۥۗۤ۠۫۟ۢۤۗۥ";
                                    break;
                                }
                            case -538969347:
                                str = "ۜۙۨۘۦۗ۟ۛۜۨ۫۫ۜ۬ۡ۠ۚۜۨۘ";
                                continue;
                        }
                    }
                    break;
                case -899951990:
                    this.f2648m = i2;
                    str = "ۜۜۦۢۨۖۘ۬ۨۜۧۨ۠۟ۚ۬ۙۨۘ۫ۥۜۘ";
                    break;
                case -314143606:
                    postInvalidate();
                    str = "۠ۗۖۘۡۢۗۥۤۚۦ۟ۢۗۚۢۗۘۙۦۧۨۘۢ۠ۙ";
                    break;
                case -238606474:
                    this.f2637b.setColor(i2);
                    str = "۟ۘۖۘۖۡ۬ۤۨۘ۫ۜۖۡۖۜۘۧۦۘۜۤ۠";
                    break;
                case 200936363:
                    return;
                case 1869515248:
                    str = "ۧۘۜۘۨۙۤۡۛۘ۫ۗۜ۟ۤۥۢۗ";
                    break;
                case 2074302320:
                    str = "ۘۢۧۨۦۘۚ۠ۡۛۛۛۛ۠ۚۡۨۘۤۨ";
                    break;
            }
        }
    }

    public void setRoundingBorderWidth(int i2) {
        float f2 = 0.0f;
        String str = "۬ۘۘۘۚۘۦۘۨ۬ۢۡۥۖۘۛۥۡۘۤۦۨۢ۠ۙ";
        while (true) {
            switch ((str.hashCode() ^ 477) ^ 807856973) {
                case -852556658:
                    str = "۫ۜۘۘۡۦۜۘۜۖۜۘۤۜۘۦۛۜۧۤۡۘ";
                    break;
                case -607031191:
                    String str2 = "ۦۦۨۙ۠ۨۤ۫۟ۧۙ۟ۗۡ";
                    while (true) {
                        switch (str2.hashCode() ^ 1731609233) {
                            case -955826658:
                                str = "۠ۥۧۘۖۗۡۦۗۛۛ۠ۡۡ۫ۢۢۢ";
                                continue;
                            case -410173783:
                                if (i2 == this.f2647l) {
                                    str2 = "ۨ۫ۥۙۙ۬۬ۢ۟۟۫ۘ۟ۦۡۖۢۖۤ۟ۧ";
                                    break;
                                } else {
                                    str2 = "۠ۘ۬۟ۗۢۛۡۗۥۧ۫۫ۤ۟ۥۘ۟ۚۖۡۘ";
                                    break;
                                }
                            case -396291527:
                                str = "ۚۡ۫ۜۙۜۘۜۖۦ۬۬ۤۧۡۥۘ";
                                continue;
                            case 952444790:
                                str2 = "ۤۦۥ۠ۢۦۘۨ۟۠ۘ۠۫ۙۨۘۧۦۦۘۥۡۘۢ۠ۦۘۤۤ۫";
                                break;
                        }
                    }
                    break;
                case -191865398:
                    f2 = (float) (i2 * 2);
                    str = "ۜ۬ۨۘ۬۟ۦۘۦۗۡۘۡۚۡۘۤۡۥۖۘۦۘۖۨۥۘۥۛۦ";
                    break;
                case 77108268:
                    return;
                case 274797244:
                    this.f2637b.setStrokeWidth(f2);
                    str = "ۥۡۛۡۥ۬ۥۚۜ۬ۗۜۥۜ";
                    break;
                case 529203290:
                    postInvalidate();
                    str = "۠ۥۧۘۖۗۡۦۗۛۛ۠ۡۡ۫ۢۢۢ";
                    break;
                case 1178386098:
                    this.f2647l = i2;
                    str = "ۙ۬۫۫۟ۙۖۥۦۘۙۧۡ۬ۧۙ۫ۘ۠ۨ۠ۖ۟ۧۦ";
                    break;
                case 1539026835:
                    str = "ۖۛۢۜۧۥۘۧۧۘۘ۠ۜۦۘۧ۠ۨۘۡۖۦۘۦۦۘۘ";
                    break;
            }
        }
    }

    public void setRoundingElevation(float f2) {
        String str = "ۙۡۦۘۜۡۡۘ۟ۡ۬ۗ۟ۡۖۘۖۘۢۜ۠ۘۙ۬";
        while (true) {
            switch ((str.hashCode() ^ 857) ^ -1776965382) {
                case -1004307556:
                    return;
                case -714565057:
                    this.f2649n = f2;
                    str = "ۥۤۖۚ۫ۚۨۤۜۘۦۤۖۛۡ۟ۗ۟ۥ۬ۚۖۡۖۧ";
                    break;
                case -460219525:
                    str = "ۡۦۡۜۡۜۘ۟ۨۤ۫ۛۥۜۡۘ";
                    break;
                case 1187248127:
                    setElevation(f2);
                    str = "ۡۜۢۗۤۡ۫ۨۘۢۙ۫ۥ۠۠ۢۦۜۘ";
                    break;
                case 1879675885:
                    str = "ۘۗۜۘ۠ۙۙۚ۠ۚۚ۟ۨۘ۟ۤۡ";
                    break;
            }
        }
    }
}
