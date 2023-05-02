package rc.whatsapp.rounded;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.Px;
import com.obwhatsapp.youbasha.task.utils;
import com.obwhatsapp.youbasha.ui.YoSettings.HideMedia;
import okhttp3.internal.http.StatusLine;

public class RoundedLayoutLinear extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public final Path f2591a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final Paint f2592b = new Paint();

    /* renamed from: c  reason: collision with root package name */
    public final RectF f2593c = new RectF();

    /* renamed from: d  reason: collision with root package name */
    public final float[] f2594d = new float[8];

    /* renamed from: e  reason: collision with root package name */
    public boolean f2595e = false;

    /* renamed from: f  reason: collision with root package name */
    public int f2596f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2597g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2598h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2599i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2600j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2601k;

    /* renamed from: l  reason: collision with root package name */
    public int f2602l;

    /* renamed from: m  reason: collision with root package name */
    public int f2603m;

    /* renamed from: n  reason: collision with root package name */
    public float f2604n;

    /* renamed from: o  reason: collision with root package name */
    public final GradientDrawable f2605o = new GradientDrawable();

    public RoundedLayoutLinear(Context context) {
        super(context);
        c();
    }

    public RoundedLayoutLinear(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public RoundedLayoutLinear(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        c();
    }

    @TargetApi(21)
    public RoundedLayoutLinear(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        c();
    }

    public final void a() {
        boolean z2 = false;
        String str = "ۛ۟ۦۘ۬۠ۥۧ۟ۢۥ۬ۛۧۜۗۡۜۦ";
        Path path = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        RectF rectF = null;
        float f4 = 0.0f;
        while (true) {
            switch ((str.hashCode() ^ 448) ^ -1125770774) {
                case -1999033578:
                    f4 = (float) this.f2596f;
                    str = "ۢۤۡۧۢۧ۫۫ۧۨۢۡۗۥۧۘ";
                    break;
                case -1262553577:
                    this.f2605o.setCornerRadii(b(f3));
                    str = "ۙۤۜۥۘۗۥۖۡۘۘۜۤۨ";
                    break;
                case -1213834959:
                    path = this.f2591a;
                    str = "۬ۤۗۘۛ۟ۛ۬۬۠ۨ۟ۤۡۥ";
                    break;
                case -1058500829:
                    String str2 = "ۦۦۧۜۡ۫ۦ۬۬۠ۥۖۘۙۦۚۦۡۥ";
                    while (true) {
                        switch (str2.hashCode() ^ 558920129) {
                            case -2026072214:
                                if (!z2) {
                                    str2 = "ۥۛۦۡ۟ۥۘۛۨۘۗ۬ۦۘۘۖۤۤ۬ۖ۟ۡۜۛۨۛۧۚ۫";
                                    break;
                                } else {
                                    str2 = "۬ۥۧۙۦۨۘۘۦۡۘۚۢۖ۬۟ۙ۟ۜۜ۟ۢۨۡۨ";
                                    break;
                                }
                            case -1965398262:
                                str = "ۧ۬ۙ۫ۘ۬ۚۤۖۘۜۘۛۦۡۢۙۡۢ";
                                continue;
                            case 50917844:
                                str2 = "ۧۘۖ۫ۤۖۘۚۙۧۨۘۖۘۜ۟ۘ۟۫ۛۘۖۥۘۚ۫ۘۘ";
                                break;
                            case 1184321463:
                                str = "ۘۢ۫ۜۚۜۘۦۘۥۤۘۦۢۗۘۘۙۥۨۘۨ۠ۜ";
                                continue;
                        }
                    }
                    break;
                case -1053356092:
                    str = "ۧ۬ۙ۫ۘ۬ۚۤۖۘۜۘۛۦۡۢۙۡۢ";
                    f3 = f2;
                    break;
                case -978676030:
                    path.close();
                    str = "ۙۗ۫۟ۢۦۚۥۥۘۡۗۜ۠ۖۥ";
                    break;
                case -632208027:
                    path.reset();
                    str = "ۡۘ۟ۘۘۦۘۘۥۧۘۛۚۖۧۥ۠ۦۖۜ";
                    break;
                case -562948663:
                case -366479002:
                    return;
                case -92972369:
                    String str3 = "ۡۢۗ۟۬ۨۡۛۦۗ۬۟۫۬ۜۘۡ۠ۦۘۤۖۛۜۚۤ";
                    while (true) {
                        switch (str3.hashCode() ^ -1989378554) {
                            case -723801944:
                                str3 = "ۥ۟ۨۢۖۚۦۦۙۘۥۘۤۗۢ";
                                break;
                            case 413060831:
                                str = "ۡ۟ۛۤۙۢۛۨۧۘ۟ۡ۫۟۠";
                                continue;
                            case 1499569800:
                                if (this.f2595e) {
                                    str3 = "۫۠ۥۘۦۥۖ۠ۦۖۤۦۛۚۦۥۘۦۢ۟ۡۨ۬";
                                    break;
                                } else {
                                    str3 = "ۙۨۗۜۤۜۗۚۜۘۥۧۨۘۖۨۧۖۚۦۘ";
                                    break;
                                }
                            case 2075308803:
                                str = "ۛۜۛ۫ۡۛۨۢۧۥۛۜۥۜ۟۠۫ۡۘۧۧۦۘ۫ۥۜۘۨۙ۫";
                                continue;
                        }
                    }
                    break;
                case 344503556:
                    str = "ۚۢۧ۟ۙۥۦۛۖۧۥۙۛ۬ۨۘۘۘۚۧۦۜۘۚ۟ۦۘ";
                    break;
                case 633093843:
                    str = "۫ۨۨۘۥۘۛۦۖۜۗۥ۠ۛ۟ۘۥ۠";
                    f2 = Math.max(rectF.width(), rectF.height()) / 2.0f;
                    break;
                case 788660998:
                    str = "۬ۚۨۜۜۨۧۘۦۘۗۘۚ۫ۦۜۘ۫۬ۗ";
                    rectF = this.f2593c;
                    break;
                case 859307078:
                    str = "ۧ۠ۜۘۤۚۖۧۢۗۥۨۢۡ۟ۡۜۖۥۢۗۖۘۘ۫۬";
                    z2 = this.f2597g;
                    break;
                case 1139124477:
                    str = "۫۠ۥۧۗۘۛۥۖۘۙۥ۟ۦ۟ۥۘۡۘۛ";
                    f3 = f4;
                    break;
                case 1626539875:
                    path.addRoundRect(rectF, b(f3), Path.Direction.CW);
                    str = "۠ۙ۟ۚۗۙ۠ۙۤۚ۟۟ۡۜۜ۟۠ۥ";
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
        String str = "ۚۖۘۘۤ۟۟۬ۖ۬ۨ۟ۨ۬ۗۢۢ۠ۜۤ۟ۦ۟ۦ";
        while (true) {
            switch ((str.hashCode() ^ 936) ^ 989298382) {
                case -2038983393:
                    String str2 = "ۡۖۢۡۗۥ۫ۦۘۨ۫ۨۢۧۧۜۦۚ";
                    while (true) {
                        switch (str2.hashCode() ^ -1089529080) {
                            case -206638114:
                                str2 = "۟ۡ۫۟ۧۤۙۤۦۘۥ۬ۜۘۚۗۡۘۥۚۜۘۧۡۥۘ";
                                break;
                            case -17700766:
                                str = "ۛۛ۫ۥۗۥۜۤۖۘۜۢۚۢۢۙۧۘۘۨۙ۫";
                                continue;
                            case 398976493:
                                str = "۟ۛۗۜۛۘۘۥۖۖۧۢ۬۠ۚ۟ۧۚۜۢ۟ۜۘۘ۬ۥۘ";
                                continue;
                            case 1649312080:
                                if (!z7) {
                                    str2 = "ۘۧۧۢ۟ۤۙۨۧۘۡۘ۫ۧۘۦۘۧۤ۫ۦۤ۟ۡۤۥۙۜ";
                                    break;
                                } else {
                                    str2 = "ۚۙۥۡۧۤۗۥۘۢۙۛۥۙۨۘ۟ۦۗۥۛۙ۟ۤۥۜ۫ۜ";
                                    break;
                                }
                        }
                    }
                    break;
                case -2035917958:
                    str = "ۛ۠ۨۡۡۡۘۡۡۘۢ۠ۘۧۖۖۢ۬ۚۙ۠ۤ۠۫۠ۡۗۨ";
                    f20 = z8;
                    break;
                case -1998809664:
                    str = "ۨۛ۟ۧۚۥۘ۠ۛۛۚ۟ۛۢۙ۠ۡۧۥۘۘ۠ۛ۫ۛۜۘ";
                    i3 = i2;
                    break;
                case -1881500411:
                    str = "۬ۛۥ۬ۢ۟۬ۗ۫ۜۘۢۡۗۗۦۘۘۥۖ۠";
                    f13 = f12;
                    break;
                case -1779848805:
                    fArr[3] = f13;
                    str = "۬۠ۢۚۥۧ۟ۘۥۗۨۗۚۧ۠ۜۥ۫";
                    break;
                case -1740578902:
                    str = "ۗۛۧ۠ۛۜۘ۠ۨۧۙۡ۫ۙۨۜۘۛۗۖۛۚۦۘۤۤۙ";
                    break;
                case -1731623689:
                    String str3 = "ۡۢ۫۟ۘۘ۠ۤۜۘ۫ۡۛۧۤ۟ۗۧۨۚۢۖ۠ۜۖۡۨ۟";
                    while (true) {
                        switch (str3.hashCode() ^ 708486292) {
                            case -1919231767:
                                str3 = "ۥۦۦۘۤۥۦۘ۠ۥۖۘۘۥۨۨۘ۠۟ۡۡ۬ۚۧۚۦۘ۫ۙۙ";
                                break;
                            case 36091154:
                                if (!z3) {
                                    str3 = "ۢۧ۬ۖۦۖۖۖۨ۬۬ۨۘۛۢۘۡۜ۟۠ۢ۬۬ۚ۫";
                                    break;
                                } else {
                                    str3 = "ۨۨۡۖۦۢۢ۠۬ۚ۬ۡۘۚۘۤۜۧۧۨ۬ۖۘۤ۟";
                                    break;
                                }
                            case 1354469387:
                                str = "۫ۙۥۘۢۦۦۘۘۘۡ۬۟ۘۥۦۧۘ";
                                continue;
                            case 1799868719:
                                str = "ۧۦۥۛۦۙۘۗۜۘۚۥۧۡۚ۬ۡ۠۠ۛۖ۟ۢۙۜۘ۠ۧۘ";
                                continue;
                        }
                    }
                    break;
                case -1674740377:
                    str = "ۗۨۥۘۤۗ۟۬۬۫۬ۖۧۘ۫ۘۦۘ۫ۦۛ";
                    f12 = f2;
                    break;
                case -1579502068:
                    str = "۟۬ۜۘۚ۠۬ۦۨۜۚۛۙۖۨۖۦۙ۬ۥۖ۬";
                    f20 = f2;
                    break;
                case -1572843147:
                    str = "ۙ۬۫ۥۦۚۦۙۡۘۘۧۨۘۥۨۙ";
                    f11 = f9;
                    break;
                case -1544974293:
                    str = "ۚۧۢۡۢۥۘۙ۫ۜۖ۬ۥۘ۟ۢ۠ۛۚۖۘۨۤ۠ۛۤ";
                    f16 = f14;
                    break;
                case -1526730492:
                    str = "ۥۛۤۤۛۡۥۨۜۘۜۙ۠ۢۚۖۦۜۦۘۦ۬ۡۘ";
                    i3 = z6;
                    break;
                case -1451172554:
                    str = "ۦۥۨۥۖۖۦ۬ۚۙۜۥۤۡۦۘۙۚۜۙۢۤۦۢ۬ۤۨۖ";
                    f19 = f18;
                    break;
                case -1394314708:
                    z8 = false;
                    str = "ۢۢۚ۠ۤۗۥ۟ۢ۠ۗۘۢۚۤ۬ۢۗ۠ۙۜۘ";
                    break;
                case -1017907071:
                    str = "ۙۗۥۢۥۡۘۤۗۦۨۘۢۢۚۘۘ";
                    f8 = f7;
                    break;
                case -862565697:
                    str = "ۢ۠۠۫ۢۢ۬ۨۥۢۦۡۘۨۛۥۘۨۘۖۘۖۖۥۘ۠ۥۥۘۗ۟ۧ";
                    break;
                case -629567985:
                    f7 = 0.0f;
                    str = "۫۠۠۬ۢۤۙۥۜۖۚۛۙۧ۟";
                    break;
                case -593072229:
                    str = "ۦ۟ۧۦۤۚۧ۫ۨۦۘۥۘۢۖ";
                    f3 = f2;
                    break;
                case -459221775:
                    fArr[2] = f11;
                    str = "ۨۚۚۨۘۦۘۥۧۖ۫ۙۥۘ۠ۦۘۘۙۦۡۘۗۥۦۤۖۦ";
                    break;
                case -414049469:
                    fArr[0] = f5;
                    str = "ۡۨۥۘ۫ۙۨۘۜ۫ۤۥۛۜۘ۬۠ۡ۬۟ۗۥۗۖۛۛ۫۬ۙۖ";
                    break;
                case -406379774:
                    str = "ۚۛ۬۟ۢۧۡۢ۟ۥۜۨۘۗ۠۟۬ۨۦۙ۫ۜۘ";
                    break;
                case -355302819:
                    fArr[6] = f19;
                    str = "ۨۚۥۖۨۧۛۚۨۘ۟ۥۗۘۢۥۘۡ۫۠";
                    break;
                case -294746115:
                    String str4 = "ۨ۟۠ۨ۫۠ۛۤ۬ۜۧۗ۬۬ۜۜۗۨۘ۠ۦۧ۠۠۬۬۠ۥۘ";
                    while (true) {
                        switch (str4.hashCode() ^ -837461303) {
                            case 1251644291:
                                str = "۫ۢ۠ۤ۟ۚۦۘ۠ۜ۫ۘ۟ۥۙۨۢۛ";
                                continue;
                            case 1268503765:
                                if (!z5) {
                                    str4 = "ۛۜۦۡۚۙۖ۬ۗۤۙۥۡۨ۫ۥۖۢ۠۟ۧۚۥۦ";
                                    break;
                                } else {
                                    str4 = "ۙۡۢۧۚۖۘ۫ۡ۟ۢ۟ۛۥۗۦۘۙ۠ۡۘ";
                                    break;
                                }
                            case 1630593069:
                                str = "ۧۜۧۘۚۖۜۘۡۨۨ۫۠ۦۡۡۗۥۗۛۤۜۨۦۘۜۤۤ";
                                continue;
                            case 1768833583:
                                str4 = "ۗۦۦۘ۬ۥۘۘۥۤۖۘۙۚۡۘۢ۬ۙۥۜۧۘ";
                                break;
                        }
                    }
                    break;
                case -245212693:
                    z4 = false;
                    str = "۟۫ۦۢۚۚۧ۬ۨۘۧۤۨۘ۫ۤۛۚۗۜۘ";
                    break;
                case -242756553:
                    String str5 = "ۧۨۖۘ۬ۜۨۘۦ۬ۨۚۨۜۘۛۖۧۤۛۖۥ";
                    while (true) {
                        switch (str5.hashCode() ^ -1822378649) {
                            case -1938999093:
                                str = "ۚۨۗۨۙۜۤۖ۫ۛۗۡۗۘ";
                                continue;
                            case -1669778304:
                                str5 = "ۛۧۜۚۗۨۧۛۖ۟ۘۜۘۚ۬۟ۖ۫ۗۙ۟ۨۙۨ۬";
                                break;
                            case -1071512658:
                                if (!z7) {
                                    str5 = "۫۬ۚ۟۠ۜ۬ۛۨۘۨ۫ۚ۠ۡۖۘ۠ۖۘۖ۟ۦۘۥۜۜۘ";
                                    break;
                                } else {
                                    str5 = "ۛۦ۬ۙۛۚۡ۫ۧۚۦۡۘۛۙۡۗۦ۟ۚۗۡۜ۟ۙۗ۟ۡۘ";
                                    break;
                                }
                            case 61423376:
                                str = "ۡ۟ۥۘۗۡۦۘۘۜۧۥ۠ۗۢ۟ۨۥۚۚۧۢۨ";
                                continue;
                        }
                    }
                    break;
                case -234841623:
                    f4 = 0.0f;
                    str = "ۛۛۖۜ۠ۘۘۙۥۡۢۦۧۧۖۤۜۜۖۗۛ۟ۛۚ۟";
                    break;
                case -234668442:
                    str = "ۗۛۧ۠ۛۜۘ۠ۨۧۙۡ۫ۙۨۜۘۛۗۖۛۚۦۘۤۤۙ";
                    f11 = f10;
                    break;
                case -168099509:
                    str = "ۢ۠۠۫ۢۢ۬ۨۥۢۦۡۘۨۛۥۘۨۘۖۘۖۖۥۘ۠ۥۥۘۗ۟ۧ";
                    f16 = f15;
                    break;
                case -98161237:
                    f18 = 0.0f;
                    str = "ۘۙۧۛۦۘ۟ۡۖ۟ۧۥۘ۬ۖۧۘۡۤۦ۫ۡۜۘ۟ۜ۟";
                    break;
                case 19643114:
                    str = "ۛ۠ۚۡ۠ۥۧۘۙۖۖ۠ۜ۬ۙۨۤ۟";
                    f8 = f6;
                    break;
                case 373916684:
                    z7 = this.f2600j;
                    str = "ۚۦ۫ۢۙۜۘۢۧۨۘۛۛۜۘۙۦۙ۠ۦۖۘ";
                    break;
                case 567763774:
                    fArr[1] = f8;
                    str = "ۖۦۖۜۖۦۘۜ۫ۨۘ۬ۧۘۘۖۜۢ";
                    break;
                case 593226441:
                    str = "ۜ۟۠ۙۘۦۦۧۚۛۥۖۘ۟ۙۚۜۧۡ۫۬ۧۛ۫ۜۥ۠ۘۘ";
                    f17 = f2;
                    break;
                case 652109748:
                    return fArr;
                case 686902998:
                    z3 = this.f2599i;
                    str = "ۗۢۖۛۛۥۨۘ۟ۘ۟ۧۘۗۘۘ";
                    break;
                case 812490142:
                    str = "ۦۥۨۥۖۖۦ۬ۚۙۜۥۤۡۦۘۙۚۜۙۢۤۦۢ۬ۤۨۖ";
                    break;
                case 911125943:
                    f15 = 0.0f;
                    str = "۫ۤۘۘ۠ۡۡۘۙ۬ۥۘۘۖۧۘۗ۬ۦۘ";
                    break;
                case 1033026728:
                    String str6 = "ۜ۬۫ۢۦۡۘۢۘۨۘۛۗۚۘۤ";
                    while (true) {
                        switch (str6.hashCode() ^ -1330381335) {
                            case -1769373130:
                                str = "ۡۦ۫ۚۢۦ۬ۡۤۡۨۜۘ۫ۗۗ";
                                continue;
                            case -773393977:
                                if (!z5) {
                                    str6 = "ۛ۬ۙۨۛۚۜۥۜۚۖۧۘۜۥ۠۫ۗۡ";
                                    break;
                                } else {
                                    str6 = "ۗۤ۬ۡۗۜۘۖۢۦ۟۟ۥ۬ۧۛ";
                                    break;
                                }
                            case 816185677:
                                str6 = "ۨۤۘۘۚۥۦۘۙۧ۟ۥۚۥۙۙۧۧ۠";
                                break;
                            case 1775127393:
                                str = "ۧۖۢۖ۠۫ۜ۬ۙۚ۟ۦۤۚۦۘۛۙۢۡۡۡۥۗۙ";
                                continue;
                        }
                    }
                    break;
                case 1118390124:
                    String str7 = "ۗۨۧۘۧۧۚ۫ۨۧۘۦۡۨۧۜۧ۬ۖۥۘ۫۟ۦۥۡۛ";
                    while (true) {
                        switch (str7.hashCode() ^ -2045956880) {
                            case -1594795254:
                                str = "ۜ۟ۥ۬۠ۡۘۛۖۗ۟ۤۖۦۢۤ";
                                continue;
                            case -1077912859:
                                if (!z3) {
                                    str7 = "۫ۦۘۘ۟ۘۥۘ۫ۛۥۘۥۧۢۖ۬";
                                    break;
                                } else {
                                    str7 = "۠ۘۢۧۖۖۘۥۡۙۗۜۦۛۨۢ۟ۨۛۖۥۨۘۦ۠ۜۡۢۧ";
                                    break;
                                }
                            case -814046929:
                                str7 = "ۥۤۗۘۥۦۘ۟ۙۘۘۧۘۜ۬ۧۤ۫ۤۜۖۥۡۘ";
                                break;
                            case -574433764:
                                str = "ۧۨۜۘۡ۬ۨۗۙۤۡۨۘۤۢۨ۠۟ۨۘۘۙۘۘۢۨ۠";
                                continue;
                        }
                    }
                    break;
                case 1120600591:
                    str = "۫ۦۜۦۧۜۘۙۙۛ۠ۢۛۙ۬ۨۘ۟ۚۦۤ۫ۘۙ۬ۘۖۨۙ";
                    break;
                case 1123520852:
                    str = "۬ۤۖۦ۫ۢۨۡۦ۠۫ۤۖۢۥۘۢۘۗ۫۠ۤ";
                    f19 = f17;
                    break;
                case 1146165587:
                    fArr[7] = f20;
                    str = "۠ۛۡۛ۫۟ۨۖۜۘۖۦ۫ۙۛۡۢۜ۟ۗ۫ۨۘ";
                    break;
                case 1155917297:
                    z5 = this.f2601k;
                    str = "ۧ۟ۦۘۙ۬ۖۘۦۤۖۗۦۦۧۢۜۢۚ";
                    break;
                case 1200064914:
                    str = "۬ۥ۠ۧۜۛ۠ۗۗۛ۟۠۫ۚ۫۠۠ۗۤۥ۠";
                    break;
                case 1206479001:
                    z6 = false;
                    str = "ۖ۬ۗۙۢۧ۫ۦۛۦ۟ۘۘ۫ۚۥۛۡۖۘ";
                    break;
                case 1343725709:
                    str = "ۛ۠ۨۡۡۡۘۡۡۘۢ۠ۘۧۖۖۢ۬ۚۙ۠ۤ۠۫۠ۡۗۨ";
                    break;
                case 1372196681:
                    f10 = 0.0f;
                    str = "ۢۧۜۘۖ۬ۜۘۚۨۡۘۖۨۙۦۘۧۤۘۘۛۖۙ";
                    break;
                case 1382772023:
                    str = "ۧۦ۫ۤۗۥۜۧۦۘۧ۠۟ۦ۬ۖۗۖۧۘ";
                    f13 = z4;
                    break;
                case 1420707233:
                    z2 = this.f2598h;
                    str = "ۤۛۙ۠ۧۡ۫ۚۗۤۢۡۥۦۨ";
                    break;
                case 1452023226:
                    String str8 = "۫ۜۤۨۢ۟۫۫۫۠ۧۜۘۙۧۢ۟ۡۦۘ";
                    while (true) {
                        switch (str8.hashCode() ^ 2132155106) {
                            case -1919194168:
                                str = "ۜۜۨۘ۟۟ۡۘۙۡۤۨۡۗۜۖۘ۬۬ۜۘۙۘۙ";
                                continue;
                            case -1335044466:
                                str = "۠ۚۜۘۜۦۢ۟۬ۤۖۛۗۡ۠ۜۦۗ۟۬ۢۧ۟۟۫ۢۘۥۘ";
                                continue;
                            case -991135967:
                                str8 = "ۦۨۖۘ۬ۢۤۤۚۗۤ۬ۡۢۡۛۦۘۡۨ۟";
                                break;
                            case -558037522:
                                if (!z2) {
                                    str8 = "۟۬ۧ۫ۛۖ۫۫ۜۘ۬ۨۗ۠ۜۙ";
                                    break;
                                } else {
                                    str8 = "ۛۖۡۘۧۤۦۘۜۧۡۘ۟ۗ۫ۚۡۥۘۦۗ۬ۙۜۤۤۗ";
                                    break;
                                }
                        }
                    }
                    break;
                case 1462682697:
                    str = "ۤۙۡ۬ۦۧۘۜۥۤۢۥۖۘ۠ۦۙۡۡۜۘۜۦۤ۫ۙۖۘ";
                    f5 = f3;
                    break;
                case 1622633477:
                    str = "ۙۗۥۢۥۡۘۤۗۦۨۘۢۢۚۘۘ";
                    break;
                case 1755080615:
                    fArr[5] = f16;
                    str = "ۖ۬ۙ۠۠ۘۤ۬ۧۢۘۖۘ۟۟ۜۢۦۢۘۛۚۦۦۡۘ";
                    break;
                case 1834065018:
                    str = "ۤۢۨۘۛۜ۠۬ۢۨۙۧۧۨۘۜۘۚ۫ۛۛۛۙۡۦۥ";
                    f14 = f2;
                    break;
                case 1851525800:
                    str = "ۚۛ۬۟ۢۧۡۢ۟ۥۜۨۘۗ۠۟۬ۨۦۙ۫ۜۘ";
                    f5 = f4;
                    break;
                case 1853884608:
                    str = "ۙۥۗۜۥۢۖۤۥۖ۫۬ۦۨ۠ۢۧۨ";
                    f9 = f2;
                    break;
                case 1879729138:
                    String str9 = "۫ۦۗ۠ۚۚ۫ۖ۫۟ۙۦۘۦۡ۬ۡۖۚ۟ۜۙ۠ۚۥۤۡ";
                    while (true) {
                        switch (str9.hashCode() ^ 558639448) {
                            case -1443971656:
                                str = "ۢۚۥۢۙۧۥۤۨۘۢۥۦۘۘۛۗۨ۫ۗۛۚۛۖۜ۠۫ۥۨۘ";
                                continue;
                            case 277810832:
                                if (!z2) {
                                    str9 = "۠۠ۢۗۧۘۘۨۛۘۘۘۖۘ۫ۨۧۧۙۨۥ۬ۨ";
                                    break;
                                } else {
                                    str9 = "۬ۚۛۜۛۨۘۦۙ۠ۤۗۜۘۙۤۚۢۗۤ۠ۖۧۘۥ۟ۛ";
                                    break;
                                }
                            case 734272450:
                                str9 = "ۗۜۚۛ۫۬ۦ۠ۦۧ۟ۘ۬ۜۛۡۦۘۘۡۦۙۥۧۘۘ";
                                break;
                            case 1757166169:
                                str = "۠۫ۨ۟۬ۜۘۚۖۨۘ۟ۤۥۘۙۚ۟ۛۨۜۘ";
                                continue;
                        }
                    }
                    break;
                case 1926275735:
                    str = "ۜۢۡۨۜۢۢۡۧ۠ۖۧۘۚۚۥۘۙۙۛ";
                    f6 = f2;
                    break;
                case 1948834588:
                    str = "ۤۛۘۘ۠ۖۘۡۗۜۘۚ۠۫ۗ۟ۧۢۜۗ";
                    i2 = f2;
                    break;
                case 2006248759:
                    str = "ۧۦ۫ۤۗۥۜۧۦۘۧ۠۟ۦ۬ۖۗۖۧۘ";
                    break;
                case 2014849635:
                    str = "ۥۛۤۤۛۡۥۨۜۘۜۙ۠ۢۚۖۦۜۦۘۦ۬ۡۘ";
                    break;
                case 2029880936:
                    fArr = this.f2594d;
                    str = "ۘۜ۫ۢۛ۟ۛ۫ۦۡۛۜۨ۬ۧۡۜۘ";
                    break;
                case 2102685437:
                    fArr[4] = i3;
                    str = "ۛ۫ۢۧ۟ۦۘۤۛۛۛۨۘۘۨ۬ۤ۬ۡۘۚۛۤۘۦۧ";
                    break;
            }
        }
    }

    public final void c() {
        String str = "۫ۨ۠۠ۛ۬ۢۙۦۘۜۦۨۘۗۗۦۘۖۨۗ";
        GradientDrawable gradientDrawable = null;
        int i2 = 0;
        Paint paint = null;
        while (true) {
            switch ((str.hashCode() ^ 616) ^ 1021962418) {
                case -2137205002:
                case -1127672208:
                    return;
                case -2082765587:
                    super.setBackgroundDrawable(gradientDrawable);
                    str = "ۛۢۜۨ۫۫ۨۛۡۗۜۜۘ۟ۦۡۘۗ۫ۜ۫۬ۤۢۥۜۖ۠ۚ";
                    break;
                case -2042801929:
                    str = "ۜۜۨۤ۫ۡۗۨۜۘ۫ۛ۬ۦۖ۬۬ۙۚ۟ۚۨۧ۬ۛ";
                    i2 = this.f2603m;
                    break;
                case -1876972236:
                    setRoundingElevation(this.f2604n);
                    str = "۠ۢ۠ۖ۟ۦۘۡۡۘۦ۬ۡۜۧۨۥۙ۫";
                    break;
                case -1492103623:
                    this.f2601k = false;
                    str = "ۧۗۜۘۚ۟ۖۘۛۘۨۘ۟ۥۜۦۛۙ";
                    break;
                case -1154661491:
                    gradientDrawable = this.f2605o;
                    str = "ۜ۟ۦۛ۠ۥۘۨۛۨۘ۟ۖۦۘ۟ۥۦ۬ۜۦۘۦۙۢۘۚۖۡۚۨۘ";
                    break;
                case -900201262:
                    gradientDrawable.setCornerRadii(b((float) this.f2596f));
                    str = "ۜۛۧۡ۬ۥۘۙۡ۬ۢۧ۫ۥ۟ۦۜۥۤ";
                    break;
                case -650599127:
                    String str2 = "۠ۛ۬۫ۢۡ۫۫ۜۘۧۗۡۘۤۥۥۘۗۥۢ";
                    while (true) {
                        switch (str2.hashCode() ^ -1154238998) {
                            case 102191519:
                                str = "۫ۢۖۜۤۡۡۧۥ۬ۥۘ۠ۤۜۥۘۡۤۛۖۜۜۧۙۢ";
                                continue;
                            case 1668960334:
                                if (!isInEditMode()) {
                                    str2 = "ۡ۟ۖ۬۫ۥۘۙۧۦ۟ۦ۠ۛۡۡۦۦۢۤۧ";
                                    break;
                                } else {
                                    str2 = "ۧۦ۠ۖۛۢۡۘۚۘ۫ۡۘۤ۫ۢ۠ۖۧۘۗۗۧۨۜ۠ۘۙۜۘ";
                                    break;
                                }
                            case 1873521785:
                                str2 = "ۖ۟۫ۗۘۥۘ۬ۢۨۘۜۧۚۚۛۘۛۥ۟ۤۘۡۖۘ";
                                break;
                            case 2127674420:
                                str = "ۖۘۘۘ۠ۥۘۘۘۘۨۥۤۗۦۚۚۧۗۜۦۘۡۢۚ";
                                continue;
                        }
                    }
                    break;
                case -528169924:
                    paint.setAntiAlias(true);
                    str = "ۡۙۘۘۥۦ۠ۘ۠ۚۨۗۧۧۦۡۧۦۘ";
                    break;
                case -371896546:
                    paint.setColor(this.f2603m);
                    str = "ۧۘ۫۬۟ۥۢۤۨۦۚۜۘۢۨ۫";
                    break;
                case -108224756:
                    this.f2600j = false;
                    str = "ۗۤۥۘۙۖۗ۫ۙۘۜۜۘۡۙۖۘۚۨۦۡ۟ۗ";
                    break;
                case 161783075:
                    this.f2598h = true;
                    str = "ۙ۟۠ۘۦۦۗۜۘۡۗ۫ۦۘۜۦۡۜۘ۟۟ۛ";
                    break;
                case 301671827:
                    gradientDrawable.setColor(i2 | 0);
                    str = "۠ۦۦۘۥۙ۠ۨ۫ۨۘۙۙۛۢۢۦ۫۠ۦۘۨ۠۠ۚۨۥ";
                    break;
                case 518086508:
                    str = "ۦ۫ۨۥۧۦ۠ۘۦۘ۠ۧ۠ۧۜۜۢۢ۟";
                    paint = this.f2592b;
                    break;
                case 864895008:
                    this.f2599i = true;
                    str = "ۚۙۛۙۢ۫ۙۧ۬ۦۙۧۘۚۘۡۥۘ۬ۢۦ";
                    break;
                case 887557869:
                    paint.setStrokeWidth((float) (this.f2602l * 2));
                    str = "ۜۦۜۚ۬ۥۛۖۥۘ۬۫۫ۧۖۨۚۙۛ۟ۘۦۘۙۨۥۘ";
                    break;
                case 956162488:
                    str = "ۜۙۧۨۧۗۥۦۛۡۦۗۙۦۖ۫ۙۖۘ";
                    break;
                case 1240110171:
                    this.f2596f = utils.dpToPx(22.0f);
                    str = "ۤۡۛۥۗ۠ۦۥۥۢۧۗۥۚ۬ۡ۫ۙۛۡۖ";
                    break;
                case 2073633085:
                    paint.setStyle(Paint.Style.STROKE);
                    str = "۬ۦ۫ۗۦۜۛۖۧۘۙۦۘۥ۟ۢۤۙۛ۫ۜۥۦۗۥۥۙ۬";
                    break;
                case 2090853638:
                    this.f2597g = false;
                    str = "ۘۦۘۥۙۦۘۢۗۜۢۙۨۘ۟ۧۗۥۗۨۘ۠ۘۜۘۤۖ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006d, code lost:
        r0 = "۫۬۫ۦۗۥۡۤۢۧۘۨۧۗ۬ۖ۟ۡ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r6) {
        /*
            r5 = this;
            r1 = 0
            java.lang.String r0 = "۠ۥۦۘۙۛۗۘ۬ۘۘ۬ۗۧ۬ۡۜۘۢۥۗۖۗۤۧۜۤ"
        L_0x0003:
            int r2 = r0.hashCode()
            r3 = 318(0x13e, float:4.46E-43)
            r4 = -1892898500(0xffffffff8f2ca93c, float:-8.512848E-30)
            r2 = r2 ^ r3
            r2 = r2 ^ r4
            switch(r2) {
                case -339766024: goto L_0x0018;
                case -299000321: goto L_0x0029;
                case -266941363: goto L_0x001d;
                case 194280135: goto L_0x0012;
                case 287645052: goto L_0x0015;
                case 439336997: goto L_0x0065;
                case 642617397: goto L_0x0047;
                case 1781351404: goto L_0x0023;
                case 1978042812: goto L_0x0070;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x0003
        L_0x0012:
            java.lang.String r0 = "ۜ۬ۙ۟ۛ۟ۖۡۜ۟ۡۛۧۢ۬ۛۦۘ"
            goto L_0x0003
        L_0x0015:
            java.lang.String r0 = "ۖ۫ۙۛۙۢۥۥۡۘۖۧۡ۟ۗ۟ۜۥۜۜۥۛۚۢۘۗۡۧ"
            goto L_0x0003
        L_0x0018:
            android.graphics.Path r1 = r5.f2591a
            java.lang.String r0 = "ۛۜۥۘ۬۠ۘۗۡۦۢ۬ۘۧۖۙۚۜۚۘۡۘ۫ۤۧ"
            goto L_0x0003
        L_0x001d:
            r6.clipPath(r1)
            java.lang.String r0 = "ۡۚۧۡۨ۬۫ۨ۠ۜۤۡۢۦۥۘۥۜۘ۠۬ۗ"
            goto L_0x0003
        L_0x0023:
            super.draw(r6)
            java.lang.String r0 = "ۙۖۖۗۜۘۘۦۤۥۘ۠ۧۗۛۤۧ"
            goto L_0x0003
        L_0x0029:
            r2 = -3230563(0xffffffffffceb49d, float:NaN)
            java.lang.String r0 = "ۤۚۖۖۚۦۘۦۨ۬ۚۢۜۘ۟۟ۜۘۜۦۡۘۘ۟ۚۚ۬ۙۢ۠ۦۘ"
        L_0x002e:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1994979527: goto L_0x0041;
                case -744110005: goto L_0x006d;
                case -183789276: goto L_0x0037;
                case 1406530409: goto L_0x0044;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x002e
        L_0x0037:
            int r0 = r5.f2602l
            if (r0 <= 0) goto L_0x003e
            java.lang.String r0 = "ۢۤۧۤۖۜۘۡۗ۟ۙۦۥۘۥ۟ۧۛۗۖۘۖۧۛۙۡۡۗۦۧۘ"
            goto L_0x002e
        L_0x003e:
            java.lang.String r0 = "ۤۛۘۘۤۧۖ۫ۖۥۖ۟۟ۘۢۨۘۤۙۛۜۛۜۢۥ۟ۢۥ"
            goto L_0x002e
        L_0x0041:
            java.lang.String r0 = "۟ۦ۠۫ۡۛۡۥ۫ۢۥ۠ۖۨۨ"
            goto L_0x002e
        L_0x0044:
            java.lang.String r0 = "ۦ۬ۤۥۢ۠ۗۚۥ۫ۖ۠۟ۧۥۛۖۙۙۤۚۧۨ"
            goto L_0x0003
        L_0x0047:
            r2 = -253293445(0xfffffffff0e70c7b, float:-5.72049E29)
            java.lang.String r0 = "۟ۘ۟ۙ۠۟۫ۚ۬ۛۧۥۘ۟ۘۘۘۜ۬ۚۧۘۧۡۘۘۖۦۡۘ"
        L_0x004c:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1478827510: goto L_0x0055;
                case 948151394: goto L_0x005b;
                case 1412996749: goto L_0x006d;
                case 1802827915: goto L_0x0062;
                default: goto L_0x0054;
            }
        L_0x0054:
            goto L_0x004c
        L_0x0055:
            java.lang.String r0 = "ۚ۟ۥۘۘ۬ۜۨۜۘۘ۫ۤۨۘ۬ۚۘۚ۬ۦۗۖۢۢۦۨ۬ۤ"
            goto L_0x004c
        L_0x0058:
            java.lang.String r0 = "۟۫ۜۘۜ۬ۥۘۛۡۖۘۨۢۘۚ۠ۧۗۖۘۖ۫۟ۥۙۢۙۜ۠"
            goto L_0x004c
        L_0x005b:
            int r0 = r5.f2603m
            if (r0 == 0) goto L_0x0058
            java.lang.String r0 = "ۡۛۨۨۤۜۛۡۚ۟ۗۙۧۥۛۘۦۘۜۗۗۖ۬ۦۘ۠ۗۖۘ"
            goto L_0x004c
        L_0x0062:
            java.lang.String r0 = "۠ۘۡۘۤۘۖۚۨۧۘۡۛۜۘۤ۟ۖۘۖۘۡۘۥۢۡۘ۫۬ۘۦۖۜ"
            goto L_0x0003
        L_0x0065:
            android.graphics.Paint r0 = r5.f2592b
            r6.drawPath(r1, r0)
            java.lang.String r0 = "۫۬۫ۦۗۥۡۤۢۧۘۨۧۗ۬ۖ۟ۡ"
            goto L_0x0003
        L_0x006d:
            java.lang.String r0 = "۫۬۫ۦۗۥۡۤۢۧۘۨۧۗ۬ۖ۟ۡ"
            goto L_0x0003
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.whatsapp.rounded.RoundedLayoutLinear.draw(android.graphics.Canvas):void");
    }

    public int getRoundedCornerRadius() {
        String str = "ۘۥۜ۠۫ۖۘ۠ۥۘۘ۫ۚۙۨ۠ۜۜۥۧۘۜۨۚۡۜ";
        while (true) {
            switch ((str.hashCode() ^ 893) ^ 1529852124) {
                case -1448941547:
                    str = "ۢ۠ۖۘۜۨۡۘۦۜۢۡ۟ۜۤۨ۫ۨۙۤۢۙ۫";
                    break;
                case 925769298:
                    return this.f2596f;
            }
        }
    }

    public int getRoundingBorderColor() {
        String str = "ۛۖۜ۟ۜ۠ۦۤۨۘۢۨۦۘۘۡۘۘ";
        while (true) {
            switch ((str.hashCode() ^ StatusLine.HTTP_TEMP_REDIRECT) ^ -126077627) {
                case -320114457:
                    str = "ۧ۠ۤۛۛۡ۫۠ۧۗ۫ۙۦۦۛ۠ۜۨ۫ۡ۬ۙ";
                    break;
                case 52629163:
                    return this.f2603m;
            }
        }
    }

    public int getRoundingBorderWidth() {
        String str = "ۧۘۧۘۚ۫ۢ۟ۦۦۖۢۤۘۡۢ۬ۙۧ۠۬ۜ";
        while (true) {
            switch ((str.hashCode() ^ 465) ^ -62667522) {
                case -1660536400:
                    return this.f2602l;
                case 1549235752:
                    str = "ۚۖۢ۫ۥۦۘۢۗۦۖۙۜۘۗ۟ۛ۫ۡۦۘۦۨۘۘ";
                    break;
            }
        }
    }

    public float getRoundingElevation() {
        String str = "ۤۨۥۘ۟ۨۖۡۚۜ۫ۗۗۙۜۙ۬۬۫";
        while (true) {
            switch ((str.hashCode() ^ 453) ^ -639205657) {
                case -819536773:
                    return this.f2604n;
                case -525495727:
                    str = "ۥۜۙۡۤۨ۠۬۬ۜ۬ۡۢۗۨۘ";
                    break;
            }
        }
    }

    public boolean isRoundAsCircle() {
        String str = "ۢۨۖۘۦۥۜۘۨۛۜۘۥۛ۬ۦ۬ۗۜۛ۫";
        while (true) {
            switch ((str.hashCode() ^ 761) ^ -420092040) {
                case -619215834:
                    return this.f2597g;
                case -562848002:
                    str = "ۧۙۜۘۛۙۗۚۦ۬۬۠ۡۥۘۛۖ۠ۜۘ۟ۡۦۘۧۤ";
                    break;
            }
        }
    }

    public boolean isRoundBottomLeft() {
        String str = "۠۬ۖۘۛۢۘۘۚۜۖۜۥۘۘۧۡۤۡۧۜ";
        while (true) {
            switch ((str.hashCode() ^ 772) ^ 695187456) {
                case -102940792:
                    return this.f2600j;
                case 458431984:
                    str = "ۧۢۘۛ۟ۤۦۘ۠ۦۡۘ۫ۙ۬";
                    break;
            }
        }
    }

    public boolean isRoundBottomRight() {
        String str = "ۖ۬ۗۥۢۛۙۧۜۨۢۛۤ۠ۜۙۤ";
        while (true) {
            switch ((str.hashCode() ^ 189) ^ 183164567) {
                case -1689866502:
                    return this.f2601k;
                case 1346670193:
                    str = "ۢۛ۬ۚۤۗ۟ۚۘۘۡ۟ۥۘۧۜۜۦۧۚۧۛۥۘ۫ۨ۬";
                    break;
            }
        }
    }

    public boolean isRoundTopLeft() {
        String str = "۫ۘۡۘۘۙۨۘ۫ۗۦۖ۬ۥۤ۬ۖۘ";
        while (true) {
            switch ((str.hashCode() ^ 456) ^ -2003670817) {
                case -1124787005:
                    str = "۠ۨۗۦۥ۬ۗۗ۠ۧ۫ۖۤ۫ۦۘ";
                    break;
                case 1116705374:
                    return this.f2598h;
            }
        }
    }

    public boolean isRoundTopRight() {
        String str = "ۤۜۧۛۗۛۚ۫ۜۦ۟ۢ۫۫ۖۘ";
        while (true) {
            switch ((str.hashCode() ^ 298) ^ 265291031) {
                case -703118291:
                    return this.f2599i;
                case 1019024429:
                    str = "ۘۗۡۘۧۨۛ۫ۤۨ۠ۧۦۘۢۧۙ";
                    break;
            }
        }
    }

    public void onAttachedToWindow() {
        String str = "۟ۜۡۘۜۡۜۗۦۖۤۥۡۘۖۨۛۨۘ۠ۧۗ۠";
        while (true) {
            switch ((str.hashCode() ^ 722) ^ 1015406749) {
                case -225938029:
                    super.onAttachedToWindow();
                    str = "۟ۚۘۘ۬ۦۡۘۘۗۜۛ۫ۦۘۧۜۛ";
                    break;
                case -191763230:
                    str = "ۨۖ۟۫ۛۦۘۖۛۢۥۨۧۚ۟ۦۦۚۙۖۢۦ";
                    break;
                case 804452316:
                    this.f2595e = false;
                    str = "ۖ۬ۚۛۛۢۡۚۛۤۨۘۚ۬ۥۘ";
                    break;
                case 2063073946:
                    return;
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        String str = "ۜ۠ۦۘۙۥۛۥۗۜۢۨ۠ۢۖۨ۫۫۟۫ۜۘۤ۟۟ۚۦۖۘ";
        while (true) {
            switch ((str.hashCode() ^ 607) ^ -1604448685) {
                case -1478686893:
                    str = "ۤ۟ۤ۠ۨۦۘ۬ۡۧۘۥۜۡۘۛۡۥ";
                    break;
                case -170753986:
                    return;
                case 71347376:
                    requestLayout();
                    str = "ۙۢۡۚۜۧۚۧۘۘۤۨۜۘۙۤۗ";
                    break;
                case 1185926884:
                    str = "ۘۗ۟ۤۢۦۘۚ۠ۢۨۖ۟ۛۘۧۥۢۘۢ۠۠۠ۛۦۘ";
                    break;
                case 1630040739:
                    String str2 = "ۚۥۛۨۚۛۘۘۦۜۥۘ۠ۧۧۖۦ";
                    while (true) {
                        switch (str2.hashCode() ^ -1120226470) {
                            case -1418640587:
                                str2 = "۬۬ۗۡۥۧۘۤۘۘۢۥۨۚۘ۬ۨۙۤ";
                                break;
                            case -774008888:
                                str = "ۜ۠ۡ۬ۨ۟۫ۡۡۛۙۗۖ۬ۗ۟ۜ۠";
                                continue;
                            case 380117460:
                                if (getVisibility() != 0) {
                                    str2 = "۫ۗۥۘ۫ۤۚۚ۠ۤۖ۫ۜۘۚۘۜۙۨ۫";
                                    break;
                                } else {
                                    str2 = "ۚۗ۬ۡۤۥ۬ۙۤ۠ۗۤۡۦۦ۬۟ۡۘۦۚۥ";
                                    break;
                                }
                            case 1191294417:
                                str = "ۙۢۡۚۜۧۚۧۘۘۤۨۜۘۙۤۗ";
                                continue;
                        }
                    }
                    break;
                case 1749638293:
                    super.onConfigurationChanged(configuration);
                    str = "ۚ۫ۙۘۦۥۘ۬۬ۢ۠۬۟۟۠۫ۡۢ۠";
                    break;
                case 1904645050:
                    this.f2595e = false;
                    str = "ۙۙۖۗۜ۠ۨ۬ۙۡۘۧۚۧۗۦۨۨۘ";
                    break;
            }
        }
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        String str = "ۜۜۚۨۗۗۜۗۥۨۖۜۘۘۤۖۘۤۤۨۖۨۦۘۦۨ۟ۥ۟ۦ";
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (true) {
            switch ((str.hashCode() ^ 86) ^ 1904880334) {
                case -2030624946:
                    f2 = (float) (i5 - i3);
                    str = "ۦ۫ۦۘۡۜۘۘۖۖۤ۠ۘۗۙ۬ۤۦۖ۬ۢ۬ۖ۬۬ۥ";
                    break;
                case -1982520198:
                    String str2 = "ۘ۫ۙۚ۬ۙ۟۟۫ۢ۫ۚۡۢۥ۬۬۫ۘ۠ۡۘ";
                    while (true) {
                        switch (str2.hashCode() ^ -129478581) {
                            case -1863961978:
                                if (this.f2595e) {
                                    str2 = "ۥۛ۟ۛۛۡۘۧ۬ۖۘۥۗ۟ۡ۠ۢ۫۠ۥۘ";
                                    break;
                                } else {
                                    str2 = "ۢ۟ۤۡۙۗۚۘۘۘۗۖۥۘ۟ۨۧۘۥۡۖۚ۠ۦ";
                                    break;
                                }
                            case -1724834141:
                                str2 = "۫ۦۗۤۥۖۛۖۥۢۖۘۚۜۧ۫۠ۘۘۖۚۜۧۜ۬ۢۦۘ";
                                break;
                            case -508682267:
                                str = "ۛ۬ۘۧ۟۬ۦۡۤۜۤۘۡۥ";
                                continue;
                            case 770610702:
                                str = "ۙۨۛۥۦۜۘۤ۫ۢۘۜۤ۫ۦۘۡ۟ۚۥۙۛۘۦۗۧۙۙ";
                                continue;
                        }
                    }
                    break;
                case -1337955182:
                    str = "۠ۧۘ۬ۗۧ۬۬ۥۘۖۧۡۘۛۥۘۚ۟ۖۘۘۦۗۢ۬۠";
                    break;
                case -1039063872:
                    return;
                case -933088572:
                    super.onLayout(z2, i2, i3, i4, i5);
                    str = "ۢۧۡۧۧۘۧۤۘۘۛ۠۫ۘۤ۠";
                    break;
                case -881947105:
                    f3 = (float) (i4 - i2);
                    str = "ۘۗۦۘۨۤۧۚۜۦۘۗۘ۟ۛۖۡ";
                    break;
                case -484436929:
                    str = "۫ۥ۟ۦۨۘۜۦۛۛۖۘۧۧۢۨۛۖۤ۟ۨۧۦۘۗۚۤ";
                    break;
                case -391911537:
                    str = "ۡۦ۠ۨۖۘۙۨ۟ۗۛۥۨۛۘۘۚۙۘۘۚۧۧ۠۟۠ۦ۫ۨ";
                    break;
                case 203306239:
                    str = "ۘۗ۠۠ۡۜۚۙ۠ۖۘ۠۬ۤ۬ۘۙۗ";
                    break;
                case 526830977:
                    str = "ۘۨۘۘۧۙۥۘۙۜۢۜۜۨۚ۠ۖۘ۟ۖۦۘۧۡۥ";
                    break;
                case 1089345321:
                    this.f2593c.set(0.0f, 0.0f, f3, f2);
                    str = "ۥۦۜۘۜۚۧ۟ۛۙۥۦ۠ۨۜۘۘۘۨۨۘ";
                    break;
                case 1101133600:
                    this.f2595e = true;
                    str = "۟ۛ۟ۡۗ۬ۛۢۚۡۘۚۡ۫ۗ۫ۡ۟۠ۙۥۥ۫ۨۘ";
                    break;
                case 1959418340:
                    str = "ۚۘ۫ۤۙۦ۬ۘ۬۟ۦۤ۬ۘۘۚۤ۫ۗۛۡ";
                    break;
                case 1996406651:
                    a();
                    str = "ۙۨۛۥۦۜۘۤ۫ۢۘۜۤ۫ۦۘۡ۟ۚۥۙۛۘۦۗۧۙۙ";
                    break;
            }
        }
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        String str = "ۤۖۢۧ۫۬ۢۥۜۦۛۘۜۤۦۘۛ۟۬";
        while (true) {
            switch ((str.hashCode() ^ 655) ^ -1961296262) {
                case -1509248741:
                    str = "ۖ۫ۘۚۛۥۘۧۨۘۨ۬ۜ۠ۘ۫";
                    break;
                case -746957448:
                    return;
                case 497412726:
                    str = "ۦۡۖۧ۟۠۟ۥۡۘۡۘ۫ۢ۬ۗۗۢ";
                    break;
                case 542036153:
                    str = "ۦۡۡ۠ۤۦۘۨۥۖۘۦۢۦۨۨۖۥۚۖۜۡۡۘۜ۬ۘ۟ۡۚ";
                    break;
                case 1034769006:
                    str = "ۘۦۙۥۦۘۖۢۡۘۨ۟ۗۚۧۧ";
                    break;
                case 1148348435:
                    str = "ۤۧۢ۫ۗ۬ۖۨ۬۬ۗۦ۟ۚۜۘۘ۟ۥۘۥۧۦۘۦۢۦ";
                    break;
                case 1338242520:
                    a();
                    str = "ۤۙ۠ۡۜۗ۟۫ۥۘۛۡۨۚۤۧ۟ۦۡۘۥ۠۟ۨ";
                    break;
                case 1917935868:
                    super.onSizeChanged(i2, i3, i4, i5);
                    str = "ۥۗۖۘ۬ۦۨۘۢۨ۫ۜۚۥ۠ۥۙۚۚۡۧۧ";
                    break;
            }
        }
    }

    public void setBackground(Drawable drawable) {
        String str = "ۖۖۧۘۘ۠ۦۘۤۛۥۘ۟ۦۥۘۤ۠ۗ۠ۥۖۥ۟";
        while (true) {
            switch ((str.hashCode() ^ 58) ^ -510674167) {
                case -2101532777:
                    str = "ۥۧۧۗۜۖۜۨۢۢۚ۫ۢ۟ۘۘۚۚ۟";
                    break;
                case -595014228:
                    str = "۫۬ۨۜۖۡۖۙۖۚۖۢۜۨۛۚۢۨ";
                    break;
                case 875809130:
                    return;
            }
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        String str = "ۡۧ۬ۗۘۖۘۘۚۦۘۘۨۢ۟۟ۘۚۥۧ۟۠";
        while (true) {
            switch ((str.hashCode() ^ 26) ^ 400020226) {
                case -736725282:
                    str = "ۤۙۥۖۙۛۥۜۘۨ۬ۖۘۢۢۡۨ۟ۨۘۤۧۚ";
                    break;
                case 573435874:
                    str = "ۦۛۢۘۖۤ۠ۚۥۘۙۖۤۜۘۧۥۗۢۤۘ۠";
                    break;
                case 1602827958:
                    return;
            }
        }
    }

    public void setCardBackgroundColor(@ColorInt int i2) {
        String str = "۠ۛ۠ۧۢۦ۟۬ۛ۠۠ۦ۠ۛۡۘ";
        while (true) {
            switch ((str.hashCode() ^ 958) ^ -1322535705) {
                case -1199513631:
                    this.f2605o.setColor(i2);
                    str = "ۖۤۜ۫۠ۡ۬ۘۦۛۗۡۚ۬ۘۘۥ۟ۘۘۤۚۜۘ";
                    break;
                case -1180136290:
                    invalidate();
                    str = "ۧۜۤۧۗ۫ۘۜۗۖۧۙۡۚۙۡۧ۠ۨۘۢ۫ۥۧۗۖۘ";
                    break;
                case 254562021:
                    str = "ۖۙۦۡۡۦۦۥۧۘ۫ۜۢۨۖۧۘۜۘۘۜۦۨۘۥۨۜۘ";
                    break;
                case 1632955834:
                    return;
                case 1946379561:
                    str = "ۘۜۘۘۖ۠ۘۘۙۨۛ۠ۢۖۧۚۧۦۧۗۗ۫ۧۨۖۨۛ";
                    break;
            }
        }
    }

    @TargetApi(21)
    public void setElevation(@Px float f2) {
        String str = "ۜۦ۬ۦۨۥۘۢ۟ۦۘۖۥۥۖۘۜۡۘ۬۫ۗۤۜ۟";
        while (true) {
            switch ((str.hashCode() ^ 171) ^ -1634782197) {
                case -1134502594:
                    super.setElevation(f2);
                    str = "ۥۘ۠ۤ۟۬ۗۡۦۚۜۦۗۢۦۘۖ۬ۘۘۙۗ۫۫۠۟";
                    break;
                case -410281360:
                    str = "ۘۙۨۤۢۢۡۚۡۘۛ۬ۧۨۙۘۘۥۥۗۦۛۨۘ۠ۥۦۘ";
                    break;
                case -372666948:
                    this.f2604n = f2;
                    str = "ۗۦۜۥ۠۠ۡ۫ۦۨ۠ۗ۫ۥۜۘۘۖۡۘۘۥ۠ۢۙۦ";
                    break;
                case -34359687:
                    str = "ۗۨۥۘۡ۫۫۬ۘۦۘۢۤ۬ۙۨ";
                    break;
                case 140316770:
                    return;
            }
        }
    }

    public void setGradientBackground(@ColorInt int i2, @ColorInt int i3) {
        String str = "۫ۡۖۦ۠ۚۥۦۦۗۛۘۘۛۛۗ";
        while (true) {
            switch ((str.hashCode() ^ 406) ^ -1060974831) {
                case -2069994840:
                    this.f2605o.setColors(new int[]{i2, i3});
                    str = "ۨ۟ۗۜۡۡۘۨۧۨۘۤۦۨۗۜۖۘۡ۠ۘ";
                    break;
                case -989073796:
                    str = "ۗۖۥۘۗ۠ۖۘۗ۟ۨۦۦۛ۫ۥۧۘۢۛ۠ۤۡۧۢۙۦۧ۫ۖۘ";
                    break;
                case -263425592:
                    str = "ۙۘۜۘۥۥۖۘۜۥ۟۬ۥ۬ۜۦۚۦۡۗ۬ۨۧ۫ۘۚۧ۬ۨ";
                    break;
                case -220197530:
                    return;
                case 601704048:
                    invalidate();
                    str = "ۖۜۘۘۦۢۧۘۚۨۘۛۨۤۤۥۥۧۜۨۥۜۘۘۨۨۡ۬ۖۦ";
                    break;
                case 1466551721:
                    str = "ۖۥۡۢ۟ۚۗ۠ۘۘۧ۠۫۟۠۬ۧۖۜۘۛ۟ۢۙۢۢۗۜۡۘ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setGradientOrientation(int r14) {
        /*
            r13 = this;
            r2 = 0
            java.lang.String r0 = "ۢۦۖ۬ۜۛۤۖۚۢۚۚ۠۠ۚۗۙۨۘ"
            r1 = r2
            r3 = r2
            r4 = r2
            r5 = r2
            r6 = r2
            r7 = r2
            r8 = r2
            r9 = r2
            r10 = r2
        L_0x000c:
            int r2 = r0.hashCode()
            r11 = 322(0x142, float:4.51E-43)
            r12 = -632604121(0xffffffffda4b3a27, float:-1.43008399E16)
            r2 = r2 ^ r11
            r2 = r2 ^ r12
            switch(r2) {
                case -1938816553: goto L_0x00a0;
                case -1936314529: goto L_0x0075;
                case -1909754541: goto L_0x00a0;
                case -1758329440: goto L_0x00a0;
                case -1753648847: goto L_0x00a0;
                case -1543667424: goto L_0x00a0;
                case -1488791421: goto L_0x007d;
                case -1461803839: goto L_0x00a0;
                case -1242686159: goto L_0x0030;
                case -1241192855: goto L_0x00a4;
                case -1002701758: goto L_0x003a;
                case -895074998: goto L_0x005e;
                case -817375580: goto L_0x009c;
                case -494834924: goto L_0x0044;
                case -465820457: goto L_0x0068;
                case -393563759: goto L_0x0036;
                case -234891748: goto L_0x001b;
                case -183997763: goto L_0x00a0;
                case -62163388: goto L_0x0071;
                case 549681295: goto L_0x0054;
                case 552398464: goto L_0x0021;
                case 673237906: goto L_0x006c;
                case 742930719: goto L_0x0027;
                case 1132387356: goto L_0x004e;
                case 1705712113: goto L_0x001e;
                case 1878339457: goto L_0x002c;
                case 1879790202: goto L_0x004a;
                case 1966893198: goto L_0x0040;
                case 1993934745: goto L_0x0062;
                case 2008379840: goto L_0x0058;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x000c
        L_0x001b:
            java.lang.String r0 = "ۦۛۡۨۛۜ۠ۘۡۧۦۨۘ۫ۗۘۘ۟۬ۨ"
            goto L_0x000c
        L_0x001e:
            java.lang.String r0 = "ۥۘۜۡۧۥۘۢۙ۬ۜۛ۠ۖ۟ۛ۟۠"
            goto L_0x000c
        L_0x0021:
            switch(r14) {
                case 0: goto L_0x009c;
                case 1: goto L_0x0098;
                case 2: goto L_0x0094;
                case 3: goto L_0x0090;
                case 4: goto L_0x008c;
                case 5: goto L_0x0089;
                case 6: goto L_0x0086;
                case 7: goto L_0x0083;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.String r0 = "ۦۨۖۘ۟ۘۧ۬ۙۤۛۥۗ۟ۚ۟ۚ۫ۘۘ۬ۗۤۖۘۡۘۢۤ۠"
            goto L_0x000c
        L_0x0027:
            android.graphics.drawable.GradientDrawable$Orientation r10 = android.graphics.drawable.GradientDrawable.Orientation.TL_BR
            java.lang.String r0 = "ۘ۬۠ۜۙۨۤ۠ۦۖۢۖۘۦۗۗۗۢۥ۫۫ۤۡۧۘۡۚۨۘ"
            goto L_0x000c
        L_0x002c:
            java.lang.String r0 = "۬ۛۘۥۧۢ۟ۡ۠ۘ۟ۚۚۙۧۨۢۜۡۢۢۗ۠ۧۖ۫"
            r9 = r10
            goto L_0x000c
        L_0x0030:
            android.graphics.drawable.GradientDrawable$Orientation r2 = android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT
            java.lang.String r0 = "ۡۛۚ۬ۡ۟۬۠ۖۘۗ۟ۖۢۥۦۘۙۜ۟ۨ۠ۥ"
            r8 = r2
            goto L_0x000c
        L_0x0036:
            java.lang.String r0 = "ۧ۫ۥۘ۟ۤۡۥۡۘۘۚۧ۬ۘ۬ۦۘۨ۟۠"
            r9 = r8
            goto L_0x000c
        L_0x003a:
            android.graphics.drawable.GradientDrawable$Orientation r2 = android.graphics.drawable.GradientDrawable.Orientation.BL_TR
            java.lang.String r0 = "۬ۛۜۘۙ۟۠ۥۤۨۗۧۚۦۥۨۘۡ۟ۛۙۤۜۛۡۤ"
            r7 = r2
            goto L_0x000c
        L_0x0040:
            java.lang.String r0 = "۫۫ۙۗۦۧۘۙۥۧ۟ۡۘ۠۫ۗۖ۠ۦۘ"
            r9 = r7
            goto L_0x000c
        L_0x0044:
            android.graphics.drawable.GradientDrawable$Orientation r2 = android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP
            java.lang.String r0 = "ۖۛۜۗ۬۫۫۠ۙۢۛۘ۫ۢۨۘۥۜۥۘۘ۫ۨۘۥۤۦۘ"
            r6 = r2
            goto L_0x000c
        L_0x004a:
            java.lang.String r0 = "ۙۜۨۘۚۨ۬ۛۙۘۦۤۡۘۖۡۖۥۧۥۘ۬ۤۙۚۗۥۘ۟ۤ۬"
            r9 = r6
            goto L_0x000c
        L_0x004e:
            android.graphics.drawable.GradientDrawable$Orientation r2 = android.graphics.drawable.GradientDrawable.Orientation.BR_TL
            java.lang.String r0 = "ۤۛ۟ۜ۬ۖۘۗۡ۫ۙ۬ۦۛۥ۠"
            r5 = r2
            goto L_0x000c
        L_0x0054:
            java.lang.String r0 = "ۨۖ۟۠ۥۥۥۥۧۘۡۦۨۘۡۙۡۘ"
            r9 = r5
            goto L_0x000c
        L_0x0058:
            android.graphics.drawable.GradientDrawable$Orientation r2 = android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT
            java.lang.String r0 = "ۖۜۦۗۧۥ۬ۘۤۡۢۨۘۙۧۙۡۖۛ"
            r4 = r2
            goto L_0x000c
        L_0x005e:
            java.lang.String r0 = "۬ۗۙۡۥۤۚ۠ۙۨ۠ۖ۬ۚۡ"
            r9 = r4
            goto L_0x000c
        L_0x0062:
            android.graphics.drawable.GradientDrawable$Orientation r2 = android.graphics.drawable.GradientDrawable.Orientation.TR_BL
            java.lang.String r0 = "ۖ۠ۜۢۜۛۢۦۨۘۖۚۦۘ۬۬ۙۤۘۨ۟ۨۘۡۚۦ"
            r3 = r2
            goto L_0x000c
        L_0x0068:
            java.lang.String r0 = "ۢۥۘۘۗۛۡۘۤۥۨۘ۠۬۬ۖ۫ۧۜ۟ۥۘ۫ۥۖ"
            r9 = r3
            goto L_0x000c
        L_0x006c:
            android.graphics.drawable.GradientDrawable$Orientation r1 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            java.lang.String r0 = "ۖۡۗۨۚۦۗ۠ۛۖۦۥۘۖ۠۫ۛ۬ۡۘ۫۬ۘۧۢۨۘۧۘۘ"
            goto L_0x000c
        L_0x0071:
            java.lang.String r0 = "ۨۤ۟ۢۙۜۘۢ۫ۘۘۚۖۢۡۨۜۖۢۥ۠ۦ۫"
            r9 = r1
            goto L_0x000c
        L_0x0075:
            android.graphics.drawable.GradientDrawable r0 = r13.f2605o
            r0.setOrientation(r9)
            java.lang.String r0 = "ۗ۫ۚۙۗۚۖۦۧۘ۠ۘ۫ۦۢۧ۟ۦۜ"
            goto L_0x000c
        L_0x007d:
            r13.invalidate()
            java.lang.String r0 = "۟ۢۗۘۢۤۚۗۦۘ۠ۢۘۘۙۖ۠"
            goto L_0x000c
        L_0x0083:
            java.lang.String r0 = "ۦۨۢۢۤۙۢۜۨۘۡ۬ۘۘۙۧۧ۫ۛۡۘۙۡ۫ۤۜۥۘ"
            goto L_0x000c
        L_0x0086:
            java.lang.String r0 = "ۜۙۥۗۙۚ۫۟ۚۡ۠۠۟ۡۡ"
            goto L_0x000c
        L_0x0089:
            java.lang.String r0 = "۠۬۬ۤۢ۬ۛۤۦۘ۬ۛۢۜ۬۬ۖۢۥۘۥۡۦۦۛۨۘۨۚۡۘ"
            goto L_0x000c
        L_0x008c:
            java.lang.String r0 = "ۦۛۦۖ۫ۜۘ۫ۖۦۢۚۢۚ۬ۜۚ۬۠ۧۢ۠۬ۖۗۛۥۘ"
            goto L_0x000c
        L_0x0090:
            java.lang.String r0 = "ۛۗۘۘ۬ۜۗۤۦۛۤۚ۫۫ۗ۬"
            goto L_0x000c
        L_0x0094:
            java.lang.String r0 = "۠ۡۥۙۨۧۧۡۖۘۥۥۨۘۛۗۛۖۢۘۘۚۘۜۘۛۖ۠۟ۨۜۘ"
            goto L_0x000c
        L_0x0098:
            java.lang.String r0 = "ۛۧۖۤۤۤۢۢۢۥۛ۫ۦۖۘۘۙۦۚۘۢۖ"
            goto L_0x000c
        L_0x009c:
            java.lang.String r0 = "ۖۙۗۛۦۡۘۜۡۖۨۦۨۡ۠ۘۜۖۛ"
            goto L_0x000c
        L_0x00a0:
            java.lang.String r0 = "ۨۤ۟ۢۙۜۘۢ۫ۘۘۚۖۢۡۨۜۖۢۥ۠ۦ۫"
            goto L_0x000c
        L_0x00a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.whatsapp.rounded.RoundedLayoutLinear.setGradientOrientation(int):void");
    }

    public void setRoundAsCircle(boolean z2) {
        String str = "۟ۡۦۘ۫ۗۛۚ۠ۡۡۧۘۘۘۜۡۤۤۗۙ۠۠";
        while (true) {
            switch ((str.hashCode() ^ 739) ^ -1259383323) {
                case -1547551256:
                    str = "ۤ۫ۢۤۦ۠ۘ۬ۖ۫ۥۡ۫۫ۜۘۡ۫ۧ۟ۡۘ۬ۡۗ";
                    break;
                case -913729121:
                    str = "ۘۤۚۧۦۨۖۨۡۘۖۨۦۗۙۜۘ";
                    break;
                case -162424835:
                    postInvalidate();
                    str = "۟ۙۡۤۨۖۦۢۜۘۨۗۦ۬ۜۘ";
                    break;
                case 85676899:
                    String str2 = "۟ۤ۟ۛۨ۟ۨ۟ۤ۠ۦۨۦۗۡۘۦۦۗ";
                    while (true) {
                        switch (str2.hashCode() ^ 2142034571) {
                            case -174577271:
                                if (z2 == this.f2597g) {
                                    str2 = "ۙۤۜۜۧۧ۬ۛۘۤ۬ۚۗ۫ۗۙۙۖۗۙۦۘۛ۠ۡۜۜ۠";
                                    break;
                                } else {
                                    str2 = "۬ۘۗۧۦۛۥۢۜۚۧ۟ۜۢ۫ۙۙ۬۫ۡۛۜۧ";
                                    break;
                                }
                            case 152681338:
                                str = "ۦۛۨۜۙۚۜۡۘۘۧۡ۫ۦۛۙۧۢۗۡۨ۠";
                                continue;
                            case 235640622:
                                str2 = "ۗۚۚۡۡۡۖۥۨۗۤۘ۬۟ۖۘ";
                                break;
                            case 1387851572:
                                str = "۟ۙۡۤۨۖۦۢۜۘۨۗۦ۬ۜۘ";
                                continue;
                        }
                    }
                    break;
                case 259749794:
                    a();
                    str = "ۡۡ۫ۤۨۡۗۤۗۦۘۚ۫ۥۧۥۧۘۡۜۤۚۜۨۢۧ";
                    break;
                case 334244953:
                    this.f2597g = z2;
                    str = "۠ۛۡۚۙ۬ۗۘۦۘۖۢۦۘۗۗۧۡۘۡۚ۫ۦۘ۟ۚۦۙ۬ۤ";
                    break;
                case 1644276690:
                    return;
            }
        }
    }

    public void setRoundedCornerRadius(int i2) {
        String str = "ۥۨۗ۬۬ۨۘۨۡۧۛۖۥۘۧ۠ۘۗۜۥۘۡۜۖۘۥۨۖۘ";
        while (true) {
            switch ((str.hashCode() ^ 335) ^ -2068647565) {
                case -308883564:
                    str = "ۚۚۖۘۙۚۙ۠۫ۖۧ۬ۤۤۡۧۘ۟ۖۘۘۡۖۜۘۜ۠۟";
                    break;
                case 861410153:
                    return;
                case 1282354781:
                    str = "۬ۚ۬ۢۥۤ۟ۤۙۥۜۨۘ۠ۦۦ";
                    break;
                case 1956128263:
                    setRoundedCornerRadius(i2, true, true, true, true);
                    str = "ۤۖۡۥۙۚۗۨۡۧۢۗ۬ۜۥۘۨۘۜۨۗ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        r0 = "۠۟ۖۘۡۜۖۘۚ۠۫ۡۦۘۘۥ۫ۛ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setRoundedCornerRadius(int r5, boolean r6, boolean r7, boolean r8, boolean r9) {
        /*
            r4 = this;
            java.lang.String r0 = "ۢۘ۟ۛۢۚۖۥۨۡۙۤۚۘۦۘۨۗۦ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 74
            r3 = 1647639162(0x6234fa7a, float:8.346157E20)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -2041120277: goto L_0x0020;
                case -1987625442: goto L_0x00d0;
                case -1810655187: goto L_0x0023;
                case -1752943560: goto L_0x00dc;
                case -1741573956: goto L_0x00d6;
                case -1345723222: goto L_0x0014;
                case -1228021043: goto L_0x0017;
                case -1065487161: goto L_0x00ee;
                case -986428099: goto L_0x00e3;
                case -721016263: goto L_0x00be;
                case -667860444: goto L_0x001a;
                case -250858264: goto L_0x009f;
                case -182112523: goto L_0x00ca;
                case 248182769: goto L_0x00c4;
                case 593605676: goto L_0x001d;
                case 718345466: goto L_0x0011;
                case 1297992704: goto L_0x0044;
                case 1466587460: goto L_0x0062;
                case 1943848863: goto L_0x0080;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "۫ۡۦۥۡۘۥۖۥۘۡۧۛۤۦۘۥۡۚ۫۫ۧۖۤۦۘ"
            goto L_0x0002
        L_0x0014:
            java.lang.String r0 = "۠ۡۖۤۡ۫ۛۙ۟ۡۡۧۘۧۡۙۜۗۖۘۧۛۢۙ۬ۛ"
            goto L_0x0002
        L_0x0017:
            java.lang.String r0 = "۬ۥۨۜۨۖۘ۫۬ۘۘۛ۬ۜ۫۫ۖ۫ۛۧۜۥۨۘۜۢۡ"
            goto L_0x0002
        L_0x001a:
            java.lang.String r0 = "۠ۘۥ۫ۖ۫ۛۘۡۘۖۧۨۘ۫ۚۨۘۦۨۧۘ۟ۡ"
            goto L_0x0002
        L_0x001d:
            java.lang.String r0 = "۠۠ۚۚۖۤۙۦۘ۬ۤۘۘۥ۬ۥۘ۬ۦۥۢۥ۟ۥۤۦۡۡۢ"
            goto L_0x0002
        L_0x0020:
            java.lang.String r0 = "۠ۗۛۥۢۛۤۧۖ۟ۧ۠ۛ۟ۤۛۖۙ"
            goto L_0x0002
        L_0x0023:
            r1 = -1547150170(0xffffffffa3c85ca6, float:-2.1723282E-17)
            java.lang.String r0 = "ۡۡۜۡۖۙۘۡۘ۫ۚ۫ۜۦۛۜۡۗ"
        L_0x0028:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -641510691: goto L_0x0041;
                case 1216161264: goto L_0x0037;
                case 1365362824: goto L_0x0031;
                case 1997789340: goto L_0x003e;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x0028
        L_0x0031:
            java.lang.String r0 = "۠۟ۖۘۡۜۖۘۚ۠۫ۡۦۘۘۥ۫ۛ"
            goto L_0x0002
        L_0x0034:
            java.lang.String r0 = "ۤ۟ۘۘۦ۟ۦۘۜ۬ۜۘ۬ۦۨۘ۠ۡ۫"
            goto L_0x0028
        L_0x0037:
            int r0 = r4.f2596f
            if (r0 != r5) goto L_0x0034
            java.lang.String r0 = "۠ۨۖۜۚۢ۟ۡۜۘۦ۬ۥۘ۫ۖۢۦ۬ۗ۫ۖۘۨۥ۟ۦۜ۬"
            goto L_0x0028
        L_0x003e:
            java.lang.String r0 = "ۧۢۦۘۖۥۢۧ۟ۙ۫ۦ۫ۚۚۦۘۛ۟ۡۛۧۨۘ۟ۥ۫۠ۚۨ"
            goto L_0x0028
        L_0x0041:
            java.lang.String r0 = "ۡۙۜ۟ۙۜۘۛۛ۟ۦۚۥۘۖۚ"
            goto L_0x0002
        L_0x0044:
            r1 = -452799671(0xffffffffe502d349, float:-3.8612823E22)
            java.lang.String r0 = "ۜۤۨۘۦ۟ۗۛۢۧۛۙۖۖ۬ۛۘۚۡ۟"
        L_0x0049:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1957372843: goto L_0x005f;
                case 606715092: goto L_0x0031;
                case 970803403: goto L_0x0052;
                case 1449303118: goto L_0x0058;
                default: goto L_0x0051;
            }
        L_0x0051:
            goto L_0x0049
        L_0x0052:
            java.lang.String r0 = "ۡۗۗۡ۫ۨۘۜۛۙۡۥۥۘ۬ۗۖۢۙۘۙۡۦ۟۬ۨۚۥ"
            goto L_0x0002
        L_0x0055:
            java.lang.String r0 = "۬ۨۡۘ۬۠ۥۘ۠ۗۘۘۘۨۥۗۥۘ۠ۙ۠ۙۨۜۥۛۨ۬ۡۘ"
            goto L_0x0049
        L_0x0058:
            boolean r0 = r4.f2598h
            if (r0 != r6) goto L_0x0055
            java.lang.String r0 = "ۙۦ۠۟۫ۛۘۘۘ۠ۤۨۘۜۨۢۙۨۤ۬ۨۛۤۧ۟ۨۘۘ"
            goto L_0x0049
        L_0x005f:
            java.lang.String r0 = "ۙ۠ۡۦۢۡۘۖ۠ۡۘۦۨۖۚ۠ۜۡۘۖ۟ۖۦ۠ۗۜۘۜۘۥۘ"
            goto L_0x0049
        L_0x0062:
            r1 = -1559892436(0xffffffffa305ee2c, float:-7.260379E-18)
            java.lang.String r0 = "ۘۤۥۘۜۖۤۡۡۜۘۜ۬ۗ۫ۘۜۘۛۖۜۘۜۛۥ"
        L_0x0067:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1848987642: goto L_0x0070;
                case -1590540246: goto L_0x0076;
                case -1522754537: goto L_0x007d;
                case 828527902: goto L_0x0031;
                default: goto L_0x006f;
            }
        L_0x006f:
            goto L_0x0067
        L_0x0070:
            java.lang.String r0 = "ۧۥۖۘۗ۠۫۟ۘۘ۠۠ۛ۟۫ۧ۬ۖۧۘۡۗۜ۠ۖۘۘۖۡ"
            goto L_0x0002
        L_0x0073:
            java.lang.String r0 = "۠ۢۨۘۡۖۢۛۚ۟ۧۘۚۧۛۥۘۥۜۨۘ۫ۖۖۚۨۥ۠ۘۨ"
            goto L_0x0067
        L_0x0076:
            boolean r0 = r4.f2599i
            if (r0 != r7) goto L_0x0073
            java.lang.String r0 = "ۢ۟ۚۛۡۘ۬ۖۜۤۨۖۘۛ۬ۨۘۖۚۥۘ۫۬۬ۚ۠ۙۜۢۤ"
            goto L_0x0067
        L_0x007d:
            java.lang.String r0 = "ۜۜۥ۬ۡ۠ۛۡۡۘۡۨ۟ۛۨ۬ۜۘۚۘ۬ۡۛ۬"
            goto L_0x0067
        L_0x0080:
            r1 = 508088300(0x1e48cfec, float:1.0630909E-20)
            java.lang.String r0 = "۬ۚۨۘ۫ۙۖۘۦ۬ۦۘۚ۠ۛۘۧۡۘۦۖ۫"
        L_0x0085:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -2110815000: goto L_0x0098;
                case 96919215: goto L_0x0031;
                case 992143376: goto L_0x009b;
                case 1975838954: goto L_0x008e;
                default: goto L_0x008d;
            }
        L_0x008d:
            goto L_0x0085
        L_0x008e:
            boolean r0 = r4.f2600j
            if (r0 != r9) goto L_0x0095
            java.lang.String r0 = "ۛۗۦۘ۠ۘۦۘۤۧۦۘ۟ۧۛ۫۫ۦۜ۠ۛۢۘۡۘ"
            goto L_0x0085
        L_0x0095:
            java.lang.String r0 = "ۡۨۤ۫ۢۘۘۘۙۜۢۡۤۡ"
            goto L_0x0085
        L_0x0098:
            java.lang.String r0 = "ۧۥ۠ۘۛۦ۠ۢۘۘۡۜۨۘۗۜۡۘۨۗۘۘۧ۬ۚ"
            goto L_0x0085
        L_0x009b:
            java.lang.String r0 = "ۜۛۨۘۜۡۢۜ۠۬ۜۛۥ۬ۖ۬۫ۚۘۡۘۚۚۢ"
            goto L_0x0002
        L_0x009f:
            r1 = 1658856012(0x62e0224c, float:2.067271E21)
            java.lang.String r0 = "ۤۧۛۡ۠ۜۙۥۜۘۨ۬ۧۙۛۜۘۤۧۨۘۛۙۖ"
        L_0x00a4:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1990425443: goto L_0x00ad;
                case -1758851577: goto L_0x00ea;
                case -1480761065: goto L_0x00b7;
                case 1426767860: goto L_0x00ba;
                default: goto L_0x00ac;
            }
        L_0x00ac:
            goto L_0x00a4
        L_0x00ad:
            boolean r0 = r4.f2601k
            if (r0 == r8) goto L_0x00b4
            java.lang.String r0 = "ۚ۬ۡۦۜۜۘۧۗۖۙۘۖOۤۘ۬"
            goto L_0x00a4
        L_0x00b4:
            java.lang.String r0 = "ۚ۟۫ۜۗ۬ۦۜۘۘۜۥۖۘۖۗۙۤ۬ۡۘ"
            goto L_0x00a4
        L_0x00b7:
            java.lang.String r0 = "ۢۛۡ۠ۡۨ۫ۢۘۢۤۙ۬ۧۘۛۚ۬ۦۡۘ"
            goto L_0x00a4
        L_0x00ba:
            java.lang.String r0 = "۠۟ۖۘۡۜۖۘۚ۠۫ۡۦۘۘۥ۫ۛ"
            goto L_0x0002
        L_0x00be:
            r4.f2596f = r5
            java.lang.String r0 = "ۧۘ۟۫ۢ۬ۚۗۙۦۖۖۘۧ۬ۢۘۙ۠ۧۜۘ۟ۛۖۦۧۢ"
            goto L_0x0002
        L_0x00c4:
            r4.f2598h = r6
            java.lang.String r0 = "۠ۗ۬ۦۦۥۘ۟ۡۦ۟ۖۡ۫ۖۘ۟۬ۧۢۙۗ"
            goto L_0x0002
        L_0x00ca:
            r4.f2599i = r7
            java.lang.String r0 = "ۧۚۖۘۘۡ۫۟ۜ۠ۖ۠ۗۗۚۡۥۢۗۜۤۥۘ"
            goto L_0x0002
        L_0x00d0:
            r4.f2600j = r9
            java.lang.String r0 = "ۚۖۘۨۨۙۚۘۖۘۤۛۖۚۚۛۡ۠ۤ"
            goto L_0x0002
        L_0x00d6:
            r4.f2601k = r8
            java.lang.String r0 = "ۨ۟۠ۙۙۥۨۦۤۨۧۖ۬ۤۦ۬ۡۦۘ"
            goto L_0x0002
        L_0x00dc:
            r4.a()
            java.lang.String r0 = "ۧۚۦۗۡۚۙۚ۫ۛۛۦۘۖۡۤۧ۬ۖۘۥۘۡ"
            goto L_0x0002
        L_0x00e3:
            r4.postInvalidate()
            java.lang.String r0 = "ۚ۫۫ۧ۟ۜ۬ۘۡۘۤۜۜۘۦۡۚۙۨۥۚۦۜۘۨۖۥ"
            goto L_0x0002
        L_0x00ea:
            java.lang.String r0 = "ۚ۫۫ۧ۟ۜ۬ۘۡۘۤۜۜۘۦۡۚۙۨۥۚۦۜۘۨۖۥ"
            goto L_0x0002
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.whatsapp.rounded.RoundedLayoutLinear.setRoundedCornerRadius(int, boolean, boolean, boolean, boolean):void");
    }

    public void setRoundingBorderColor(int i2) {
        int i3 = 0;
        String str = "ۜ۠۟ۥۙۜۤۨۧ۟۟ۙۧۛۢۦۘۥ";
        while (true) {
            switch ((str.hashCode() ^ 200) ^ -578600398) {
                case -1351787186:
                    i3 = this.f2603m;
                    str = "ۥۧۘۘۦۦ۬ۛ۟ۦۨ۠۫ۧۘۥ۟ۦۘۦۘۚۨ۫ۡ";
                    break;
                case -1291121774:
                    str = "۬۠ۜۘ۟ۨۢۚ۬ۡۘۛۨۘ۟ۢۗ۟ۤۜ۟ۦۖۘۦ۠ۤۢۘۘ";
                    break;
                case -702997510:
                    postInvalidate();
                    str = "ۦۙۛ۠ۨۖۤۙۙۚ۟ۢۗ";
                    break;
                case 152192340:
                    this.f2605o.setColor(-16777216 | i3);
                    str = "ۘ۠ۚۢۘۨۢ۬ۖۘۗۚ۟ۢۦۛۢۡۦ";
                    break;
                case 226688215:
                    this.f2592b.setColor(i2);
                    str = "ۥۥۚ۟ۨۨۦۖ۬ۢۡۘۥۛۦۘۛۘۦۘ۫ۗۨۘۦۚۙۨۚۦۘ";
                    break;
                case 844135911:
                    str = "ۗۨۜۘۛۦۘ۟ۛۥۤۙ۫ۨۜۥۘۙۡۦۘ";
                    break;
                case 906107586:
                    return;
                case 937970100:
                    String str2 = "۬ۤۡۘ۠ۛۨۚۥۘۧ۬ۙۘۜ۫۫ۡ";
                    while (true) {
                        switch (str2.hashCode() ^ -1403437309) {
                            case -393053267:
                                str = "ۦۙۛ۠ۨۖۤۙۙۚ۟ۢۗ";
                                continue;
                            case 803577275:
                                if (i2 == this.f2603m) {
                                    str2 = "ۨۨ۟ۖۦ۟ۦۧۨۘ۟ۜۙۧۚۥ۟ۤۦۘ";
                                    break;
                                } else {
                                    str2 = "ۤۖۜۘۚۚۙۨۗۨۙۤۥۧۢۧ";
                                    break;
                                }
                            case 1704447230:
                                str = "ۙۖ۠ۘ۬ۚۖۘۜۡۡ۬ۙۤۙ";
                                continue;
                            case 1842151715:
                                str2 = "ۢۥ۠ۛۚۦۧۥۜۢۜ۟۠ۙۥۘۢۙۘۦۤ۟";
                                break;
                        }
                    }
                    break;
                case 1277995011:
                    this.f2603m = i2;
                    str = "ۥۡۤ۠ۤۜۘ۫۟۫۠ۛۡۥۢۖۘۚۤۜۨۙۜۘۖۘۘ";
                    break;
            }
        }
    }

    public void setRoundingBorderWidth(int i2) {
        float f2 = 0.0f;
        String str = "ۨۤۛۙ۠ۘۘۨ۬۫ۥ۟ۙۖۥۦۡۥۜۘ۟ۤ";
        while (true) {
            switch ((str.hashCode() ^ HideMedia.IMAGES) ^ -1674606182) {
                case -1859863547:
                    this.f2602l = i2;
                    str = "ۧۧۖۘۘۗۡۜۡۧۘۧۡۢۨۜۘۚ";
                    break;
                case -1789287366:
                    str = "ۗۥ۬ۘۜۗۤ۠ۖ۬ۤۜۘۧۢ۟ۧ۟ۥۘۛۖۧۘ۫ۘۘۥۦۘۘ";
                    break;
                case -934764317:
                    postInvalidate();
                    str = "ۨۘۥۘۗۡ۫۟ۥۚۦ۟ۛ۬۬ۖۘ۬ۗۡۨ۬ۗۡۘ";
                    break;
                case -342886158:
                    this.f2592b.setStrokeWidth(f2);
                    str = "ۥۧ۫ۥۗۙۥۛۙۦۙ۫۠ۢۛۖۡۙ۟ۚۗۘ۟ۨۘۖۦۢ";
                    break;
                case 175205710:
                    str = "ۢۙ۬۬ۧ۟ۥۡۥۗۢۧۥۘ";
                    break;
                case 1333244166:
                    return;
                case 2061178572:
                    f2 = (float) (i2 * 2);
                    str = "ۗۤۙ۬ۗۦۖۤۜۘ۬۠ۘۤۡ۫ۖۢ۬ۜۚ۫۫ۧۢ";
                    break;
                case 2081829777:
                    String str2 = "ۨۗۡۘۨ۬ۖ۠ۘۘ۫ۜۚۡۙۦ۠ۜۚۧۤۜۘۧۢۤ";
                    while (true) {
                        switch (str2.hashCode() ^ 448886340) {
                            case -1760459345:
                                if (i2 == this.f2602l) {
                                    str2 = "۟ۢۗۜۤۖۤ۠ۨۘ۬ۦ۬ۛۗۨۘ";
                                    break;
                                } else {
                                    str2 = "ۗۚۘۘۧۢ۟ۦۧ۠ۛۙۛۜۦۧۘ";
                                    break;
                                }
                            case -618872354:
                                str2 = "۫۬ۘ۬ۨۨ۠ۛۧۢۚۨۛۗ۟۟ۛۦ";
                                break;
                            case 1614762052:
                                str = "ۤۙۨۘ۟۟ۦۘۢۡ۬ۜۛۢۖۦ۬ۚۜ۠ۦۚۤ";
                                continue;
                            case 1830635036:
                                str = "ۨۘۥۘۗۡ۫۟ۥۚۦ۟ۛ۬۬ۖۘ۬ۗۡۨ۬ۗۡۘ";
                                continue;
                        }
                    }
                    break;
            }
        }
    }

    public void setRoundingElevation(float f2) {
        String str = "۫ۡۖۙ۬ۥۛۛۘ۬۠ۖۘۙ۟۠ۤۧۨۘۤۢۥۘ";
        while (true) {
            switch ((str.hashCode() ^ 302) ^ -486113700) {
                case -1444274237:
                    return;
                case 163556104:
                    setElevation(f2);
                    str = "۠۬ۦۘ۠ۙۤ۫ۤۥۘۗۛۗۤۤۡۘ";
                    break;
                case 458994731:
                    this.f2604n = f2;
                    str = "ۢۙۤ۬۠ۨۘۙ۟ۘۤۚۛۥۛۛۘۤۘۘ۠۟ۙۧۡۡ";
                    break;
                case 1088732752:
                    str = "ۨ۠ۗۚ۫ۧۘۙۗ۬۬۫ۥۛۜۘۦۦ۬";
                    break;
                case 1542399132:
                    str = "ۢۨۙ۬ۖۖۘۙۥۚۨۘ۫ۛۘۨۘ";
                    break;
            }
        }
    }
}
