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
import com.obwhatsapp.youbasha.task.utils;
import com.obwhatsapp.youbasha.ui.YoSettings.HideMedia;

public class RoundedLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public final Path f2561a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final Paint f2562b = new Paint();

    /* renamed from: c  reason: collision with root package name */
    public final RectF f2563c = new RectF();

    /* renamed from: d  reason: collision with root package name */
    public final float[] f2564d = new float[12];

    /* renamed from: e  reason: collision with root package name */
    public boolean f2565e = false;

    /* renamed from: f  reason: collision with root package name */
    public int f2566f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2567g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2568h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2569i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2570j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2571k;

    /* renamed from: l  reason: collision with root package name */
    public int f2572l;

    /* renamed from: m  reason: collision with root package name */
    public int f2573m;

    /* renamed from: n  reason: collision with root package name */
    public float f2574n;

    /* renamed from: o  reason: collision with root package name */
    public GradientDrawable f2575o;

    public RoundedLayout(Context context) {
        super(context);
        c();
    }

    public RoundedLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public RoundedLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        c();
    }

    @TargetApi(21)
    public RoundedLayout(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        c();
    }

    public final void a() {
        boolean z2 = false;
        String str = "ۛۢۦۤۨۛۙۦۧۛۢۤ۠ۜۧۘ۟ۨۘۘۖۡۜۘۦۛۧ۟ۛۜۘ";
        Path path = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        RectF rectF = null;
        float f4 = 0.0f;
        while (true) {
            switch ((str.hashCode() ^ 794) ^ -877691659) {
                case -1620206414:
                    this.f2575o.setCornerRadii(b(f3));
                    str = "ۛۢۦۘۤۖ۟۟ۜۜۘ۠ۧۛ۟ۥۢ";
                    break;
                case -1426862742:
                    str = "ۖۡ۠ۨۥۖۙ۬ۦۘۤۤۚۗ۬ۘۨۨ۠ۦۤ۟";
                    f3 = f2;
                    break;
                case -933352228:
                    str = "ۙۜۨۘۚۛۗۤۚۧۖ۫ۡۘۦۚۨۘۗ۟۠ۘۘ۟";
                    f2 = Math.max(rectF.width(), rectF.height()) / 2.0f;
                    break;
                case -746786306:
                    str = "ۙۡۖۦۡۦۘۤۨ۫ۙ۬ۚۜۜ۠۫ۥ۫";
                    z2 = this.f2567g;
                    break;
                case -544448559:
                case 1594372218:
                    return;
                case -543002723:
                    String str2 = "ۤ۫ۚۖۧۥ۟ۥ۟ۘ۬ۤۚۜ";
                    while (true) {
                        switch (str2.hashCode() ^ -1739045802) {
                            case -1812057507:
                                str = "ۢۢۡۚۛۜۘۧۧۡۘ۟۬ۖۚ۫ۢ۟ۥۥۘۢۘۦۘ";
                                continue;
                            case -322667:
                                str = "ۤۦۧۘۖۗۖۘۨۙۥۘۡ۫ۦۢۢۦۦ۬ۘۘ۬ۘۗۢۤۖۘ۟۠ۗ";
                                continue;
                            case 1543131429:
                                str2 = "ۗۘۛۧ۟ۦۛۛۤ۟۬۟ۜۤۡۘۖۜۡۥۜۖۘۢۥۤۗۗۙ";
                                break;
                            case 2123400908:
                                if (this.f2565e) {
                                    str2 = "ۧ۫۬ۖۜ۟ۗۦ۟ۘۢۛۡۗۦۘۥۨۨۘۤۖۨ۟ۗۤ";
                                    break;
                                } else {
                                    str2 = "ۢۧۡۘۤۗۜۘ۬ۘۛۥ۠ۦۡۨۦۘۡۡ۟ۚۢۚ";
                                    break;
                                }
                        }
                    }
                    break;
                case -459215095:
                    path.reset();
                    str = "ۜ۠ۜۘۧۗۡۘۢۜۖۢ۟ۥۧۜۥۥ۟۫ۜۧۘۦۛۦۘ";
                    break;
                case -456939185:
                    path.addRoundRect(rectF, b(f3), Path.Direction.CW);
                    str = "۫ۥۥۘۤۤۖۘ۠۠ۖۘۦۥۖ۬ۤ۠ۧ۠ۨ۠ۢۘۖۙۥ";
                    break;
                case -407881704:
                    str = "۟ۚۜۘ۬۬ۘۘ۟۟ۦ۬۫ۡ۟ۙۜۧۨۨ۟ۧۥۨۢۜۙۚۨ";
                    f3 = f4;
                    break;
                case 547113917:
                    str = "ۨۛۖۘ۠ۥ۫ۦۡۚۗ۠ۜۘۗ۠ۡۘ۫ۜۜۨۢۘۘ";
                    break;
                case 581597532:
                    path = this.f2561a;
                    str = "ۙۢۨۘۨۨۘۘۨۖۜۘۗۦۡۘۤ۟۬ۢۦۘ۟ۨۧۘ";
                    break;
                case 762750565:
                    String str3 = "۬ۥۥ۠ۘ۟ۜ۠ۦۘ۫ۤۖۘۗۧۡ۠";
                    while (true) {
                        switch (str3.hashCode() ^ -1700447873) {
                            case -1701596807:
                                str3 = "ۡۙۤۖۧ۬ۗۥۛ۠۟ۖ۬ۡۧۢۡۡ";
                                break;
                            case -686499857:
                                str = "ۖۡ۠ۨۥۖۙ۬ۦۘۤۤۚۗ۬ۘۨۨ۠ۦۤ۟";
                                continue;
                            case 1174218614:
                                str = "۫۬ۖۙۗۧ۫ۘۦۗۖۡۡۥۨۘ۟ۙ۬ۧۨۧۘ";
                                continue;
                            case 1200605316:
                                if (!z2) {
                                    str3 = "ۜۨۜۘۤۦۧۘۥۛۚۢۧ۠ۗۖۘۘۢ۟ۖ۬ۖۢ";
                                    break;
                                } else {
                                    str3 = "۫ۢۜۨۦۡۘۙۡۧۜ۫ۨۡۗۜۘۗۧۜ";
                                    break;
                                }
                        }
                    }
                    break;
                case 1617342206:
                    f4 = (float) this.f2566f;
                    str = "ۨۜۥۘۦۚۛۧۢۦۡۡۨۥۘۛ۫ۛۛۦۘ۟ۧۡۘ";
                    break;
                case 1833261046:
                    path.close();
                    str = "۬۠ۚ۟ۙ۟ۖۜۖۘ۬ۙۗ۟۫ۦۡۘۘۛۨۦ۫ۦۥۘ";
                    break;
                case 2144004323:
                    str = "ۨۚۚۜ۫ۥۢۦۡۘۨۛۡۘۤۡۗۚۨۖۘ";
                    rectF = this.f2563c;
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
        String str = "ۢۗۨ۟۠ۜ۠ۤۙۥ۟ۨۨ۬ۙ";
        while (true) {
            switch ((str.hashCode() ^ 970) ^ -613386043) {
                case -2080305241:
                    str = "ۛۢۖۘۘۤۥۘ۬ۜۜ۬ۖۜۨ۠ۧ";
                    f8 = f6;
                    break;
                case -2030243478:
                    str = "ۙۦۚۛۚۙ۫ۦ۫ۦۙۡۗۙۦۘۢۡۡۘ۬ۧۛ";
                    f20 = f2;
                    break;
                case -2006298039:
                    f10 = 0.0f;
                    str = "ۥۘۥۨۗۛۜۡۘ۫ۘۧۘۥۛ۠ۡۘۨۘۖۜۜ";
                    break;
                case -1954371082:
                    String str2 = "ۛۗۡۘۦۖۦۘۦۘۖ۠ۗۘۘ۟ۨۨۥۥۚ۠ۖۘ";
                    while (true) {
                        switch (str2.hashCode() ^ -335975540) {
                            case -1793724243:
                                if (!z3) {
                                    str2 = "ۨۙۧ۟ۜۦۘۚۗۡۘۜۘۜۘۚۙ۟۠ۘۥ";
                                    break;
                                } else {
                                    str2 = "ۖۡۥۘۥۛۙ۫ۢ۬ۨۡ۫ۙۜۘۤۙۖۘ";
                                    break;
                                }
                            case 119721830:
                                str2 = "ۧۨۥۚۖۧۘ۟۠ۖۘۦۘۡۘۡۚ۫";
                                break;
                            case 1147146489:
                                str = "ۧۜۨۡۤۥ۫ۢۜۥۦ۫ۢ۠ۛ";
                                continue;
                            case 1692728978:
                                str = "ۥۢ۬ۤۗۗۤ۬ۥۘۛۥۦۘۧۗۡۡۛۥۙۡ۠ۜ۠ۦ";
                                continue;
                        }
                    }
                    break;
                case -1909938592:
                    str = "۫۠ۡۘۗۗۨۘۜۤۥۤۜۡۖۡ۠۟ۛۢۧۗۥۘۧۧۙ";
                    f17 = f2;
                    break;
                case -1642037573:
                    str = "۟ۡۛۛۜۧۘ۠ۤۘۘۛۥۙۡۜۨۘۦۦۜ";
                    break;
                case -1540971516:
                    z3 = this.f2569i;
                    str = "ۚۛۨ۟ۚۥۛ۬۬۫ۤۥۤ۠ۚۙۦ۠";
                    break;
                case -1527351330:
                    f7 = 0.0f;
                    str = "ۨ۟ۘۜۧۢۤۙۤ۫ۥ۠ۡۙۖ";
                    break;
                case -1385356157:
                    str = "ۧۗۨۢۨۦۘ۫ۜۖۘ۫۫ۜ۫ۜۦۢۜۙۖۧۘۖ۬";
                    i3 = z6;
                    break;
                case -1256996673:
                    z2 = this.f2568h;
                    str = "۠ۦۖۘۨۢۜۘۦۚۙۧۖۙۘۗۤۢۜۢۘۜۘ";
                    break;
                case -1202531541:
                    fArr[6] = f19;
                    str = "ۖۤۨۤ۟ۧۧۚ۫ۢ۟ۡۘۤۡۘۗۥۨۘ۫ۧۖۘۘۦۧۡۛۨ";
                    break;
                case -1118366679:
                    str = "ۛ۠ۙ۫ۨۗۧ۠ۧۛ۟ۦۤۚۚۗۘۜ";
                    i3 = i2;
                    break;
                case -1113700738:
                    str = "۠ۘۥۘۤۥۧۚۨۦۘۜۘۖۧ۫ۨۘۘۖۥۘ۫۫ۧ";
                    f8 = f7;
                    break;
                case -1110644048:
                    str = "۫ۨۧ۟ۙۙۛۛۥۘ۟ۧۨۘۖۘۦۘۢۧۡ۬ۗۗ۫ۖۦۦۤۢ";
                    f14 = f2;
                    break;
                case -1051601799:
                    str = "ۢۜۡ۬ۥ۫ۛۤۡۚۙۚۤ۟ۜۖۛۚۗۙ";
                    f19 = f18;
                    break;
                case -1000985604:
                    return fArr;
                case -834135049:
                    fArr[2] = f11;
                    str = "ۜۜ۠ۦۢۤۚۛۜۜۜ۬ۙۖۖۧۤۖ";
                    break;
                case -748870766:
                    fArr = this.f2564d;
                    str = "۟ۢۗ۫۬ۥۘۥۡۧۘۛۥۧۚ۫ۡ";
                    break;
                case -703274527:
                    String str3 = "ۤۧۗۛۨۦۢۘۦۛ۫ۨۘۧۛۥ۟ۢۚ";
                    while (true) {
                        switch (str3.hashCode() ^ 1606147366) {
                            case -1483487892:
                                str = "ۗۘۥۘۜ۠ۖۙۜۗ۬ۧۗۖۨۥۙۙۡۘۦۙ۠۫ۜۢ";
                                continue;
                            case 1678446486:
                                str = "ۗۜۥۘۙۚۘ۟۫ۦۘۗۘۧۡۚ۬";
                                continue;
                            case 1754369047:
                                if (!z2) {
                                    str3 = "ۥۗۦۜۚۨۘۦۤۡۘۢۡ۠ۢ۬ۗۙۦ";
                                    break;
                                } else {
                                    str3 = "ۢۥۧۘۛۜۨۖ۟ۥۧ۟ۘ۬ۛۜۛۦۘ";
                                    break;
                                }
                            case 2032414417:
                                str3 = "ۖۛۗۨۙۦۥۘۖۡۜۗ۠۬ۖۘ";
                                break;
                        }
                    }
                    break;
                case -499759481:
                    fArr[0] = f5;
                    str = "۫ۥۖۘۢۙۥۘۢۧۨ۫ۙۜۢۙۜۤۧۥۘۧ۟ۡۧۙۖۘ۫ۖۥ";
                    break;
                case -440927350:
                    String str4 = "ۗۡۢۨ۬ۛۖ۬ۨۘ۬۬۬ۥۜۚ";
                    while (true) {
                        switch (str4.hashCode() ^ 606308324) {
                            case -1926815048:
                                if (!z7) {
                                    str4 = "ۜۚۦۘۡۘۖ۟۫ۦۘ۫ۨۧۘ۟ۜۢۨۢۛۨ۬ۜۘۖۧۘ";
                                    break;
                                } else {
                                    str4 = "۫ۦۙۙۥۥ۬ۛۥۘۧۛۘۘۥۢۜۘۤۧ۬";
                                    break;
                                }
                            case 99356315:
                                str4 = "ۤۚ۟ۢۜۛۡۤۖۚۘ۟۠ۧۗۤ۬ۥ";
                                break;
                            case 244490583:
                                str = "ۧۦۧۘۡۚۘۜۛۦۨۜ۠۠ۛ";
                                continue;
                            case 1344848596:
                                str = "ۦۨۦۥ۠ۜۘۗۢۨۤۧۤۘۛ۟۟ۦۨ";
                                continue;
                        }
                    }
                    break;
                case -414375340:
                    fArr[3] = f13;
                    str = "ۜۨۨۘۤۘ۬ۥ۠ۛ۟ۘۘۘۡۘۢۖ۬ۘۘ";
                    break;
                case -387306742:
                    str = "ۜۗۖۢۤۤۡ۬ۖۦۤۘۘۜۨۗ۬ۘۘ۫ۡۖ";
                    f16 = f15;
                    break;
                case -336494219:
                    fArr[7] = f20;
                    str = "ۗۛ۬ۡ۬ۖۘۗۛۙۦۢۛ۫ۘۙۢۘۘ۠ۡۘۢۙ۬";
                    break;
                case -255907649:
                    str = "ۨۜۛۙۖۦۘۢۗۥۘ۬۫ۤۤۗۦۡۙ۟";
                    break;
                case -248375291:
                    f4 = 0.0f;
                    str = "ۦۥۧۘ۬ۡۨۘۨۙۤ۫ۢ۠ۡۖۚۤۧۜۦۛۤۥۥۜۛۥۙ";
                    break;
                case -197594898:
                    str = "۠ۘۥۘۤۥۧۚۨۦۘۜۘۖۧ۫ۨۘۘۖۥۘ۫۫ۧ";
                    break;
                case -145741559:
                    str = "۠۠ۡۘ۬۫ۥۤۛۚ۬ۘۚ۠ۖۘ";
                    f9 = f2;
                    break;
                case -134967417:
                    str = "ۖۛۨۢۥۘۖۢ۟ۨۙۥ۬ۦۤۦۧۘۘۦۨۦۘ";
                    f3 = f2;
                    break;
                case -24518741:
                    f18 = 0.0f;
                    str = "۟ۘۡۢۨۜۤۚۧۘ۬ۢۨۗۡۙۘۜ";
                    break;
                case 51248670:
                    str = "ۧۗۨۢۨۦۘ۫ۜۖۘ۫۫ۜ۫ۜۦۢۜۙۖۧۘۖ۬";
                    break;
                case 77649359:
                    f15 = 0.0f;
                    str = "ۘ۟ۜۘۧۨۖۘ۟۬۬۬ۨۡۥ۬ۢۖ۠ۤۜ۬۠";
                    break;
                case 147800610:
                    str = "۟ۖۥۘۨۖۖۘۜ۫ۜۨ۠ۛۥۛۦ";
                    f16 = f14;
                    break;
                case 171145348:
                    z8 = false;
                    str = "ۗۛۨۘۢۛ۫ۚۡۜۘۘ۠ۦۘۘ۫ۛ۟ۧۦۘۚۦۛ۟ۙۚ۠ۢۚ";
                    break;
                case 172504652:
                    fArr[1] = f8;
                    str = "ۢۦۨۘ۠ۜۤۗۤۚۡۙۨۘ۫ۜۦۜۥۘۨۙۨۚۡۥۤۗ۠";
                    break;
                case 205212911:
                    str = "ۦۦۥۖۦۘۘۤ۟ۡۘ۟ۛۨۘۥۚ۫ۖۗۘۙ۟";
                    f20 = z8;
                    break;
                case 227809192:
                    String str5 = "ۚۢ۬ۦۛۙۦ۠ۨۛۦۜۘ۫ۘ۫";
                    while (true) {
                        switch (str5.hashCode() ^ 2093251079) {
                            case -1454021586:
                                if (!z2) {
                                    str5 = "ۚۨۙۖۖۘۘۨۗۢۤ۟ۥۙۙۨۡۤۢۥۥۖۘۛۙۥ۟ۦۖۘ";
                                    break;
                                } else {
                                    str5 = "ۜۘ۟ۥۗۙ۫ۖۖ۠ۜۛۥۥۙۛ۬ۖۖ۠ۜۜۗۗ";
                                    break;
                                }
                            case 700185765:
                                str = "ۛ۬ۦۘۤ۟ۡۢۦۘۡۖۡۢۢۥۢۘۘ";
                                continue;
                            case 1346673714:
                                str = "ۛۨ۫ۖۧۘ۟ۥۘۘۢۖۥۨۗۘۘ";
                                continue;
                            case 1350655273:
                                str5 = "ۡۚۡۘۡۗۗۢۦۜۙۘۧۘۥۙۗۚ۬۟ۗ۠ۜۘ۫۫ۨ";
                                break;
                        }
                    }
                    break;
                case 414257731:
                    str = "ۜۙۜ۠ۙۧۦۙۘۘۘ۠ۨۤ۟۬";
                    f5 = f3;
                    break;
                case 567467976:
                    str = "ۢۜۡ۬ۥ۫ۛۤۡۚۙۚۤ۟ۜۖۛۚۗۙ";
                    break;
                case 734172338:
                    str = "ۜۗۤۜۡ۟ۚۜۧۘۦۥۗۢۗۨۢ۟ۗ۬ۘۘۘ";
                    f19 = f17;
                    break;
                case 750370501:
                    z6 = false;
                    str = "۠ۜۗۙۤۖۚۖۙۨۚۤ۬۬ۧۦ۟ۧ";
                    break;
                case 953728654:
                    str = "ۨۜۛۙۖۦۘۢۗۥۘ۬۫ۤۤۗۦۡۙ۟";
                    f13 = z4;
                    break;
                case 1036161530:
                    String str6 = "ۜ۠ۧۨۢ۟ۘۤۜۨۨۦۘۧۛۖۘۖۘۘ";
                    while (true) {
                        switch (str6.hashCode() ^ -1199805672) {
                            case -1486523729:
                                str6 = "ۗۡۦۘۙۗۘۡۘۨۘۨۘۨۘ۟ۨ۠ۥۦۚ";
                                break;
                            case -1260745544:
                                if (!z5) {
                                    str6 = "ۥۧۡ۬ۚۙ۠ۧۥۘۦ۫ۦۘۢۡۦۘۛۚۚۖۤ۬ۢۙۡ";
                                    break;
                                } else {
                                    str6 = "ۘۛۘۘۗۦۖۚۦۘۜ۟ۖۘۙ۟ۘۘۛۦۦۘۢۘۘۙ۫ۛ";
                                    break;
                                }
                            case -203358017:
                                str = "ۘۡۤۧۚۘۘۥۙۘۢ۬ۥۧۗۥۨۨۨۘ۟۠ۘ";
                                continue;
                            case 900951969:
                                str = "ۧۛ۫ۡۢۛۛۢۛ۬ۡۛۤۡۚۜۨ۬ۢۜۡۘۨۢۡ۬ۜۘ";
                                continue;
                        }
                    }
                    break;
                case 1048961240:
                    str = "ۡۧۨۨۡۥۤۘۤۨۜۖۘۨۡۧۘۨۨ";
                    i2 = f2;
                    break;
                case 1071848414:
                    str = "ۛۚ۟ۡۗۨۘۘۜۛۘ۬ۧۡ۫ۜ";
                    break;
                case 1119859916:
                    str = "ۤۜۢۚۢۢ۟ۦۨۜ۬ۤ۠ۛۗۖۤۤ";
                    f5 = f4;
                    break;
                case 1149765088:
                    str = "ۤۨۧۘۦۤۘۘۧۥۘۢۙۘۛۢ۬ۧۤ۠";
                    break;
                case 1225392831:
                    z4 = false;
                    str = "۬ۧۜۗۘۚۡۚۚۖۙ۫ۗ۫ۤ۠ۤۨۦۡۥۘ";
                    break;
                case 1251752199:
                    str = "۫ۤۥۛۨۘۖۢ۠۟ۦ۟ۤۚۨ";
                    f11 = f9;
                    break;
                case 1262278187:
                    z5 = this.f2571k;
                    str = "ۡ۫ۦۘۧۨۘۘۥ۬ۜۛۤ۫۬۟۫۠ۘۘۖۛۦۚۛۡۘۢۙۡۘ";
                    break;
                case 1270404599:
                    str = "ۥۙۦۨۛۥۥ۠ۛ۠ۗۜۥۙ۬ۧۦۚ";
                    f6 = f2;
                    break;
                case 1288594598:
                    str = "ۡۚۗۦۨۥۙۢۖۧ۫۠ۖۨۧ";
                    f12 = f2;
                    break;
                case 1452636828:
                    str = "ۤۜۢۚۢۢ۟ۦۨۜ۬ۤ۠ۛۗۖۤۤ";
                    break;
                case 1567625970:
                    fArr[5] = f16;
                    str = "ۨۨۜۧۦۨۖۘ۬۬ۤۧۤۖۜۜۨۤۥۡۖۘۡۘۦۘ";
                    break;
                case 1636742739:
                    str = "ۤۨۧۘۦۤۘۘۧۥۘۢۙۘۛۢ۬ۧۤ۠";
                    f11 = f10;
                    break;
                case 1792741167:
                    str = "ۜۗۖۢۤۤۡ۬ۖۦۤۘۘۜۨۗ۬ۘۘ۫ۡۖ";
                    break;
                case 1854770044:
                    String str7 = "ۤۛۜۘ۫ۚۦۘۨۚۥۘ۠ۡ۫ۚۥۡۘۛۚۡۘۙۚۚ";
                    while (true) {
                        switch (str7.hashCode() ^ 1909008431) {
                            case -1116245409:
                                if (!z5) {
                                    str7 = "ۖۛۘۘۜۨۧۙۧۦۘۢ۬۬ۡۗۘۘ۠ۚۦۖۖۖۘ۬ۖۖۡۥۗ";
                                    break;
                                } else {
                                    str7 = "ۜۘۧۘۦ۟ۥۘۜۦۖۘۗۘۤۗ۠ۨۘۤۙۦۘ۠ۜۜۘۙۡۘ";
                                    break;
                                }
                            case -255410782:
                                str = "ۙۨۘۘۗۚۚۚۤۚ۠ۢ۟ۨۡۦۙۚۘ";
                                continue;
                            case 1366048693:
                                str7 = "ۜۨۖۜۚۡ۫ۙۛۨۢۦ۟ۥۛۚۨۘ";
                                break;
                            case 1773491068:
                                str = "ۛۘ۬ۨ۟ۥۚۙۦ۬ۚۧ۫ۤ۟ۖۖ۠ۙ۫ۛۤۦۘۘ";
                                continue;
                        }
                    }
                    break;
                case 1859851342:
                    str = "ۨ۟ۧ۬ۜۜۗۗ۫ۛۚۚ۫ۚۘۨ۬۫ۧۛۦۘۢۢۦ۫۠ۛ";
                    f13 = f12;
                    break;
                case 1881214357:
                    fArr[4] = i3;
                    str = "ۦۚۖۘ۟ۦۧۖۥۘۘۖ۠ۜۘۜۤۢ۠۬ۚ";
                    break;
                case 1971081320:
                    z7 = this.f2570j;
                    str = "ۗۛۚۗۧۤۙۡۘۨۙۢۢۖۘۨۦۙۤۖۢ۫ۢۖ";
                    break;
                case 1990581478:
                    String str8 = "۟ۜۡۛ۬۟ۛۚۡۘۧۘۧ۟ۘ";
                    while (true) {
                        switch (str8.hashCode() ^ -394399281) {
                            case -1712589152:
                                if (!z3) {
                                    str8 = "۫ۘۡۘ۠ۧۘۘ۫۟ۛ۠ۖ۠ۤۧۧۧۡۖ";
                                    break;
                                } else {
                                    str8 = "۠ۚۘۦۜ۫۬ۤۖۤۡۖۘ۟ۢۗۘۥۧ";
                                    break;
                                }
                            case -494955197:
                                str8 = "ۤۖۘۘۚ۠ۛۤۤۥۘ۬۟ۚ۬ۧۚ";
                                break;
                            case 1358056193:
                                str = "ۡۛۙۚ۟ۦۧۦۘۛۛۤۘ۟ۙۢۘۨۗ۟ۧۗۚۛۡۥۜۘ";
                                continue;
                            case 1708862249:
                                str = "ۧۚۡۘۛۘۢۨ۬ۛ۫ۛۡۡۥۦۛۤۖۧۥۦۛ۠ۙۛۥۜ";
                                continue;
                        }
                    }
                    break;
                case 1994940452:
                    str = "ۦۦۥۖۦۘۘۤ۟ۡۘ۟ۛۨۘۥۚ۫ۖۗۘۙ۟";
                    break;
                case 2087899837:
                    String str9 = "ۧۙۛ۟ۙۨۘۨۚ۫ۤۡ۟ۦۦۘۢۤۧ۟ۛۖۧۛۜۡۡۨۘ";
                    while (true) {
                        switch (str9.hashCode() ^ -1461015413) {
                            case -2022886727:
                                str9 = "ۦۡۧ۠ۨۘۙۡۘۘۘ۬ۨۘۖۜۢۜۧۗۛۡۧۘۨۨۧۘۤۥ۟";
                                break;
                            case -106045300:
                                str = "ۤۨۦۘۘ۬۫ۙۖۡۛۥۧۘۨۦۧ۬ۘ۫۟ۦۦ";
                                continue;
                            case 1197439724:
                                if (!z7) {
                                    str9 = "ۤۙۙ۟ۜۘۜ۟ۦۘۡۗ۫ۨۡۤۜۧ۬ۡۧۦۨ";
                                    break;
                                } else {
                                    str9 = "ۜۥ۟ۢۧۤۦ۠ۜۘۦۙ۠ۧۗۜۘ۬ۨۜۘ";
                                    break;
                                }
                            case 1724195005:
                                str = "ۛۘۧۨۜۖۗۜ۬۠۟ۜۘۖۡۨۘۗۦۧۘ";
                                continue;
                        }
                    }
                    break;
            }
        }
    }

    public final void c() {
        Paint paint = null;
        String str = "ۚۢۘۙۢۘۘۖۛۤۗ۠ۨۢۛۡۘۧۘۡۘۡۢ۠ۥۛۡۜۤۘ";
        while (true) {
            switch ((str.hashCode() ^ 501) ^ 951383165) {
                case -1757921582:
                    this.f2566f = utils.dpToPx(26.0f);
                    str = "۠ۖۡۚۚۨۘ۫ۚۚ۫ۘ۫۟ۧۡۘۚۧۜۜۢۜ۟۟ۧۢۛۚ";
                    break;
                case -1187487065:
                    this.f2573m = 0;
                    str = "ۖ۠ۤۗ۠ۗۙۡۥۦۡ۟ۘۖۘ۬ۥۜۢ۫ۘۘۙۥۨۘ";
                    break;
                case -1045885674:
                    paint = this.f2562b;
                    str = "۫ۖۗۥۡ۟۬ۧۥ۠ۖ۟ۙۥۙۢۨۘۘۗ۫ۢ";
                    break;
                case -535586845:
                    setRoundingElevation(0.0f);
                    str = "۟ۥۧۘۚۜۥۘۗۥۢۥۤۥۘۦۗۥۘ";
                    break;
                case -501617861:
                    str = "ۗ۬ۦۘۘۡ۬ۜۛ۬ۙۥۙۗۢ۬ۚۛۡۢۦۘۘۧۤ";
                    break;
                case -463719292:
                    this.f2568h = true;
                    str = "ۧ۫۟ۨۤۘۘۜۨۘۦۗۨۘ۫ۡۡ";
                    break;
                case -460270687:
                    this.f2574n = 0.0f;
                    str = "ۢ۫۟ۧۤۜۘۦۚۖ۟۫ۛۤۡۗۖۥۨۦ";
                    break;
                case 49166568:
                    this.f2570j = true;
                    str = "ۡۜۜۘۙۡ۬ۦۚۛۗۤۦۘۢۥۧ";
                    break;
                case 74360765:
                    this.f2569i = true;
                    str = "ۦ۫۬ۙۥۘۘۗۡۖۘۛ۬ۡۡ۠۫ۙۚۜۘۢۨۖۖ۠ۥۚۖ۟";
                    break;
                case 126330862:
                    this.f2572l = 0;
                    str = "ۘۛۜۥۙۖۘۚۖ۠ۘۦۡ۬ۤۨ۬ۗۖۗۦۧ۠ۚۨ";
                    break;
                case 468652212:
                    setBackground();
                    str = "ۡۖۥۜۨ۫ۖۧۨۘۧۛۨۛ۠۠۠ۢۖۥۖۥۘۨۗۡۘۛ۠ۦۘ";
                    break;
                case 585123978:
                    paint.setColor(this.f2573m);
                    str = "ۚۤۛۧۚۧۥۢۙ۫ۘۖۖۤۜۘ۠۟ۨۘ۫ۘۡۘۢ۬۫ۨۗۡ";
                    break;
                case 733630518:
                    this.f2575o.setCornerRadii(b((float) this.f2566f));
                    str = "ۥ۬ۙۥۦۡۙ۠ۧۥۚ۠ۢۙۥۗۖ۠ۙۜۧۖۡۢۢۥۘ";
                    break;
                case 811714636:
                case 1796745630:
                    return;
                case 927624928:
                    paint.setStrokeWidth((float) (this.f2572l * 2));
                    str = "ۛۢۡۘۨۚ۠ۘۦۘ۠ۥ۫ۚۥۚ۫۫ۖۘۗۛۘۙۖۧۗ۫۫";
                    break;
                case 1059933972:
                    String str2 = "ۖۡۢ۫ۘۥۘۗۘۡۨۛ۟۠۬ۘۘۖۗۘۘۥ۬ۖۘ۬ۘۡۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 59422776) {
                            case -1520277597:
                                str = "۫ۛۥ۫ۜۢۖۖ۟ۤۧۛۙۡۗ";
                                continue;
                            case -600575100:
                                if (!isInEditMode()) {
                                    str2 = "ۛۤ۟ۢۨۨۡۨۡۘۙۡۜۥۙۙ";
                                    break;
                                } else {
                                    str2 = "۫۠ۥۘۡ۟ۨۢ۫ۦۨۡۥۘۖ۠ۚ";
                                    break;
                                }
                            case 539048625:
                                str2 = "ۘ۠ۡۘۜۧ۠ۥۡۗ۫ۘۢۨ۠ۨۘ";
                                break;
                            case 992465408:
                                str = "ۢۙۖۗۦ۠۟ۢۦۥۤۨۦۡ۫ۡۚۜۧۘۙۚۨۦ۟ۨۘۘ";
                                continue;
                        }
                    }
                    break;
                case 1156198198:
                    paint.setStyle(Paint.Style.STROKE);
                    str = "ۘۜ۫ۨۖۦۧۜ۟ۚۘۖۜۥ";
                    break;
                case 1634534873:
                    paint.setAntiAlias(true);
                    str = "ۚۢۡۗۤۜۤۢۘۗۛۧۡۢۨۘ۟ۙ۬";
                    break;
                case 1868400038:
                    this.f2567g = false;
                    str = "ۤۘۧۢ۠ۚ۬ۙۙۡۛۘۘۨۤۥۘ";
                    break;
                case 2014062979:
                    this.f2571k = true;
                    str = "ۨۧۖۗۧ۫ۤۡۖۘ۟۫۟ۛۚۡۘ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006d, code lost:
        r0 = "ۛۖۙۡۡۙ۟ۜۗ۫۠۬ۖۖۘۘ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r6) {
        /*
            r5 = this;
            r1 = 0
            java.lang.String r0 = "ۤ۫ۥۥۘ۠ۛۖۘۛۘۨۜۦۖۘ۠ۤۘ"
        L_0x0003:
            int r2 = r0.hashCode()
            r3 = 610(0x262, float:8.55E-43)
            r4 = -719635528(0xffffffffd51b3bb8, float:-1.06675495E13)
            r2 = r2 ^ r3
            r2 = r2 ^ r4
            switch(r2) {
                case -1793888344: goto L_0x0065;
                case -1666530288: goto L_0x0047;
                case -1215470103: goto L_0x0029;
                case 1165911209: goto L_0x0015;
                case 1242365973: goto L_0x0023;
                case 1538477834: goto L_0x0018;
                case 1704309009: goto L_0x0012;
                case 1924420713: goto L_0x001d;
                case 2011619874: goto L_0x0070;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x0003
        L_0x0012:
            java.lang.String r0 = "۠۠ۦۘ۫۠ۥۘ۬ۥۘۘۢۛۤۙ۫ۢۛۘۨۦ۬۬"
            goto L_0x0003
        L_0x0015:
            java.lang.String r0 = "ۧۡۥۘۡۘ۠ۨۦۘۜ۠ۜۘۜۙ۫"
            goto L_0x0003
        L_0x0018:
            android.graphics.Path r1 = r5.f2561a
            java.lang.String r0 = "ۨۨ۟۫۟ۨۘۖۛۤۧ۬ۡۙۖۡۦۦۨۛۚۖ"
            goto L_0x0003
        L_0x001d:
            r6.clipPath(r1)
            java.lang.String r0 = "ۧۗۜ۫ۚۗۧۤۚ۟۬ۜۨ۫ۘۜۨۥۘۙۢ۟۟ۤۤ۠ۢ۠"
            goto L_0x0003
        L_0x0023:
            super.draw(r6)
            java.lang.String r0 = "ۗۥۧۘۙۦۖ۠ۚ۫ۖۙۘۘۧۘۜۘۛ۫ۚ"
            goto L_0x0003
        L_0x0029:
            r2 = -1013305758(0xffffffffc39a2e62, float:-308.36237)
            java.lang.String r0 = "۠ۙۢ۫ۧۜۖۨ۟ۜۚۥۘۡۘ۫"
        L_0x002e:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1949699130: goto L_0x006d;
                case -1853359919: goto L_0x0037;
                case 1101255562: goto L_0x0044;
                case 2099473487: goto L_0x003d;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x002e
        L_0x0037:
            java.lang.String r0 = "ۧۦۙ۬ۛۥ۟ۧۦۘۢ۫ۥۧۨۘۚۛۚ"
            goto L_0x002e
        L_0x003a:
            java.lang.String r0 = "ۢۖۚ۫ۚۛۘۥۥۘۦۤۜۜۘۘ"
            goto L_0x002e
        L_0x003d:
            int r0 = r5.f2572l
            if (r0 <= 0) goto L_0x003a
            java.lang.String r0 = "ۤۚۙۨۘۥۚۡۨۘۤۘ۠۟۫ۢ"
            goto L_0x002e
        L_0x0044:
            java.lang.String r0 = "ۡ۟ۢۘۢ۟ۙۗۨۘۙۧۚۨۘۥۜۜۧۘ۫۟ۢۙۜۦۘ"
            goto L_0x0003
        L_0x0047:
            r2 = -1538877133(0xffffffffa4469933, float:-4.306417E-17)
            java.lang.String r0 = "ۡ۟ۤۛۗ۠۫۫ۨۜۗۥۚۥۘ"
        L_0x004c:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1889896852: goto L_0x0055;
                case 110958671: goto L_0x0062;
                case 1379064158: goto L_0x005b;
                case 1623868248: goto L_0x006d;
                default: goto L_0x0054;
            }
        L_0x0054:
            goto L_0x004c
        L_0x0055:
            java.lang.String r0 = "ۤۥۜۘۖۨۖ۫ۘ۠ۢۢۦۘ۠ۨۥۛۛۧۦۤۢ"
            goto L_0x004c
        L_0x0058:
            java.lang.String r0 = "ۥ۬ۡۘۙۖ۫ۦۚۨ۫ۛۡۡۨ۟"
            goto L_0x004c
        L_0x005b:
            int r0 = r5.f2573m
            if (r0 == 0) goto L_0x0058
            java.lang.String r0 = "۫ۨۥ۠ۚ۠ۢۘۡۘ۫ۖۘ۬ۗۨۘۦۘۢۗۖ۠ۜۖۖۘۗۧۙ"
            goto L_0x004c
        L_0x0062:
            java.lang.String r0 = "ۘۘۧۘۨۡۚۘ۠ۗ۫ۖۘۛۨۦۘ۟ۨۛۖۘۙ"
            goto L_0x0003
        L_0x0065:
            android.graphics.Paint r0 = r5.f2562b
            r6.drawPath(r1, r0)
            java.lang.String r0 = "ۛۖۙۡۡۙ۟ۜۗ۫۠۬ۖۖۘۘ"
            goto L_0x0003
        L_0x006d:
            java.lang.String r0 = "ۛۖۙۡۡۙ۟ۜۗ۫۠۬ۖۖۘۘ"
            goto L_0x0003
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.whatsapp.rounded.RoundedLayout.draw(android.graphics.Canvas):void");
    }

    public int getRoundedCornerRadius() {
        String str = "۫ۜۦۤ۫ۥۘۜۖ۬۟۫ۖۛۚ۟۫ۖۧ";
        while (true) {
            switch ((str.hashCode() ^ 898) ^ 2123907371) {
                case -1921354925:
                    return this.f2566f;
                case -936114550:
                    str = "ۘۛۦۘ۫ۗۢۖۜۨۤ۫ۦۘۖۜۘۛۛ۠ۖ۠ۦۛۥۘ";
                    break;
            }
        }
    }

    public int getRoundingBorderColor() {
        String str = "ۤۥۜۘۗۡ۫۫ۡۛۦۡۥۘۙۘۤۚ۟ۖۘ";
        while (true) {
            switch ((str.hashCode() ^ 471) ^ 1785540968) {
                case -1817974939:
                    return this.f2573m;
                case -1297767646:
                    str = "ۚۗۘۘۤۜۥۘۜ۬ۨۥۖۘۡۘۦ۬۟ۛ۟ۖۡ";
                    break;
            }
        }
    }

    public int getRoundingBorderWidth() {
        String str = "ۢ۟ۘۘۚۥۖۘۦۚۘۘ۠۬ۘۘۗۙۛۗ۬ۖ";
        while (true) {
            switch ((str.hashCode() ^ 638) ^ -1682000133) {
                case -292487210:
                    return this.f2572l;
                case 1235676983:
                    str = "ۦۥۨۖۢۙۢۧ۬ۥۦۢۡ۟ۗۢۜۨۜۢ۬";
                    break;
            }
        }
    }

    public float getRoundingElevation() {
        String str = "۫ۧۥۘۨۛۨ۟ۚۧۥۛۜ۬۠ۥۥۗۖۜۡۨۥ۠ۦۘ";
        while (true) {
            switch ((str.hashCode() ^ 777) ^ 48885049) {
                case -1531792595:
                    str = "ۙ۟ۥۘۤۡۥۛ۟ۦ۟ۡۧۜۢۧۚۢ";
                    break;
                case 1938262599:
                    return this.f2574n;
            }
        }
    }

    public boolean isRoundAsCircle() {
        String str = "۬ۥ۟ۚۨۗۖ۬ۧۗۤۖۘۡۘۦ";
        while (true) {
            switch ((str.hashCode() ^ 959) ^ 298741037) {
                case -749633888:
                    str = "ۘۜۢۨۛ۟ۚ۠۬ۡۢۖۘۛۗۙ";
                    break;
                case -257978736:
                    return this.f2567g;
            }
        }
    }

    public boolean isRoundBottomLeft() {
        String str = "ۛ۬۬ۖ۬ۥۙۤۗۗۖۘ۬ۧۛۡۖۦۘ";
        while (true) {
            switch ((str.hashCode() ^ 572) ^ 274211388) {
                case -366911422:
                    return this.f2570j;
                case 1752906118:
                    str = "ۢۢۜۨ۫ۦۘ۟ۥۘۡۛۥۘۚۢۥۚۙ۬۬۟ۚۨۡ";
                    break;
            }
        }
    }

    public boolean isRoundBottomRight() {
        String str = "ۚۗۧۨۤ۠ۦۥۡ۬ۡۗۛ۬ۜۧۖۖ۫۠ۦ";
        while (true) {
            switch ((str.hashCode() ^ HideMedia.VIDEOS) ^ -24130065) {
                case -544589627:
                    return this.f2571k;
                case -313383687:
                    str = "۠ۨۙۜۢۛ۫ۢۡ۟ۡۖۘۜۗۚ۫ۖۛۤۨۖۘۢۦۧۧ۬";
                    break;
            }
        }
    }

    public boolean isRoundTopLeft() {
        String str = "ۛۥۧۧۜۢۧۘۖۥۙۖۖۖۧۘۖ۫ۜۘۙ۫";
        while (true) {
            switch ((str.hashCode() ^ 764) ^ -548252993) {
                case -1293328478:
                    str = "ۘۘۡ۫ۢۗۗۗۦۨۜۧۘۖ۬ۨ";
                    break;
                case 132801285:
                    return this.f2568h;
            }
        }
    }

    public boolean isRoundTopRight() {
        String str = "ۖۧۘۤۗۥۨ۠ۨۜۙۗۡۦۗۢ۟ۖۘۤ۟ۤۡۡ۟";
        while (true) {
            switch ((str.hashCode() ^ 359) ^ -1061113786) {
                case -896550255:
                    return this.f2569i;
                case 626121619:
                    str = "۫۫ۥۖۗۦۧۛۖۢۖۥۘۥۡۚۖ۟ۨۘ۠ۨۦ";
                    break;
            }
        }
    }

    public void onAttachedToWindow() {
        String str = "۫ۢۨۙ۠۬۟ۘۘ۠ۨۤۧۗ۟";
        while (true) {
            switch ((str.hashCode() ^ 875) ^ 1697807229) {
                case -1810612858:
                    this.f2565e = false;
                    str = "ۚۥۜۘۦۙ۠۫ۚ۠ۨۚۘۙۢۜۘ";
                    break;
                case -1156827491:
                    super.onAttachedToWindow();
                    str = "ۨۙ۠ۘۚۙ۫ۗۥۘ۟۬ۡۗۢ۠ۦ۠۟ۧۧۜۘۡۨۨۘ";
                    break;
                case -335158936:
                    str = "ۛ۟ۖۘۖۘۘۘۤۗۙ۠ۙۚ۟۬ۖۘۜۖۗ";
                    break;
                case 2043830454:
                    return;
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        String str = "ۧۘۖۘ۟ۖۚۘۖۨۢۧۚۧۗ۠۫ۥۧۘ";
        while (true) {
            switch ((str.hashCode() ^ 904) ^ 614970689) {
                case -2108543155:
                    String str2 = "ۙۢۖۘۡۤۥۘۛۜۖۘۖۦۦۘۘۡۡۘۘۤۦۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 2001915022) {
                            case -1461590715:
                                str = "ۜۖۨ۫ۙۛۨۢۙۚ۫ۗۗۜ۟ۙۨۚ۬ۧۚ";
                                continue;
                            case -273908694:
                                if (getVisibility() != 0) {
                                    str2 = "ۦۧ۠ۥۘۥۖۢ۟ۤۦۙۘۜۜۗۡۖۧۡۘ۠ۚ۟ۚ۠ۥۘ";
                                    break;
                                } else {
                                    str2 = "ۧۚۦۘۛۚ۫ۚۜ۬ۤۚ۟ۦۖۥۘۗ۬۠ۥۗۤۖۤۢ۬۬ۘۘ";
                                    break;
                                }
                            case 983814765:
                                str = "ۤۡۧۘۤ۠ۧ۫ۚۤۖۤ۟۟ۘۡۦ۫ۜۤ۬ۚ";
                                continue;
                            case 1728360682:
                                str2 = "۟۫ۖۘۙۚۖۘ۠ۥ۫ۡۙۡۘۗ۬۫ۚۥ۠";
                                break;
                        }
                    }
                    break;
                case -1649642327:
                    str = "ۜۙۘۗۢۧۖۗۗۖ۬ۜۘۥۜۘ";
                    break;
                case -394092653:
                    str = "ۤۢۦ۟۬ۧۘۖۘ۠ۧۨۦۗۤۜ۬۫";
                    break;
                case 690251144:
                    super.onConfigurationChanged(configuration);
                    str = "۫ۛ۟ۡۢ۫ۧ۫ۡۘ۫ۙۜۘۘ۟ۦۘۦۖۧۘۙ۟ۤ";
                    break;
                case 749904398:
                    requestLayout();
                    str = "ۜۖۨ۫ۙۛۨۢۙۚ۫ۗۗۜ۟ۙۨۚ۬ۧۚ";
                    break;
                case 1047471777:
                    return;
                case 1216544035:
                    this.f2565e = false;
                    str = "ۡۦ۠ۥ۟ۖۘۜ۫ۡۧۘۘ۠ۧ۟ۨۤۙ۫۬۫ۨ۬ۘۘۤ";
                    break;
            }
        }
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        String str = "ۨۜۘ۟ۚۖۧۖۡۖۦۘۡۛ۠ۜۖۘۜۗۖ";
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (true) {
            switch ((str.hashCode() ^ 463) ^ 1377800951) {
                case -1821688401:
                    super.onLayout(z2, i2, i3, i4, i5);
                    str = "۫ۦ۠ۘۨۡۘۘۥۘ۬ۗۥۧۡ۫ۤ۬۠ۡۗۤۥۚۢ";
                    break;
                case -1613906343:
                    f3 = (float) (i4 - i2);
                    str = "ۜۥۧۘۙۧۖۘ۬ۦۘۜۘۡۘۨۖۦۢۦۘۜۗۚۙۧ";
                    break;
                case -709145160:
                    return;
                case -188206414:
                    f2 = (float) (i5 - i3);
                    str = "ۢۜۙ۬۠ۥۦ۫ۥۘۙۘۥ۬ۢۗۘۡۦۗۦۥۘۘۤۛۧۛ۬";
                    break;
                case 383055282:
                    str = "ۚۘۡۘۦ۫ۡۘۥۥۥۢۤۧۜۙۚۤۖ";
                    break;
                case 639096334:
                    str = "ۜۚۧۖۙۘۘۦۦۚ۫۠ۖۘۚۙۛ";
                    break;
                case 687227686:
                    str = "ۜۥۜۘ۬۟ۧۚۛۜۘۖۧۘۤۛۢۘۧۦۘ";
                    break;
                case 1212260155:
                    this.f2563c.set(0.0f, 0.0f, f3, f2);
                    str = "ۢ۠ۘۘ۟ۚۧۗۨۙۖۙ۠ۛۨۧۘۨۛۡۜۖۛۜۜۘ";
                    break;
                case 1237007893:
                    this.f2565e = true;
                    str = "۠ۖۦۢۗۤۨۙۜۘۥۚۨۘۨ۠۬ۙۨۧۘۜۖۘۘ۬ۢۧ";
                    break;
                case 1277312393:
                    str = "ۗ۫ۖۘۧۢۡۡۧ۠ۦۤ۠ۗ۟ۨۘ۠ۚ۠";
                    break;
                case 1373197134:
                    str = "۠ۙ۫ۚ۟۫۠۠ۜۖ۫ۨ۠ۙۚۤۜۖۘۙ۠ۡ";
                    break;
                case 1490882716:
                    String str2 = "ۤۢۖ۠ۢۘ۟۟ۡۘۨۦۨۘۖۥۖۘۘۧۗۗۡۥۘ";
                    while (true) {
                        switch (str2.hashCode() ^ -416126938) {
                            case -176765737:
                                if (this.f2565e) {
                                    str2 = "۟ۖۘۖ۟ۜۘ۬ۚۖ۫ۛۢ۟ۧۘۘۙۖۡۜۤۙ";
                                    break;
                                } else {
                                    str2 = "ۤ۠ۨۢ۬ۜۖۘۨۜۙۦ۫ۘۥ۠۠ۢ";
                                    break;
                                }
                            case -19821241:
                                str = "ۜۨۚ۟ۖۢۧۖ۬۠ۛ۫ۗۥۢۢ۫";
                                continue;
                            case -14368381:
                                str = "ۙۧۜۡۛۖۘۡۥۜۘ۬۠۬ۧۛۢ";
                                continue;
                            case 479743125:
                                str2 = "۟ۜۘۘ۫ۥۡۘۘۤ۫ۤۚ۫ۥ۫ۥۘۗۜۘۘۜۡ۫۟ۥ۫";
                                break;
                        }
                    }
                    break;
                case 2031027244:
                    a();
                    str = "ۙۧۜۡۛۖۘۡۥۜۘ۬۠۬ۧۛۢ";
                    break;
                case 2048311177:
                    str = "ۛۢۖۘۢۤۙۧۚ۫ۢ۠۫۬۟ۧ";
                    break;
            }
        }
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        String str = "ۜ۫ۖۗۨۘ۬ۡ۠۬ۙۥۘۗ۫۫ۧۥۥۘۨۡۘۡۥۧۦ۬ۦۘ";
        while (true) {
            switch ((str.hashCode() ^ 267) ^ 2125343241) {
                case -2102136104:
                    return;
                case -2058180687:
                    str = "ۦۘۨۘۧۤ۟۫ۢۚ۬ۦۥۨۘۦۘ";
                    break;
                case -1443546473:
                    a();
                    str = "ۥۧۥۘۛ۫ۖۘۗۘ۫ۚ۠ۧ۠ۥۦۘۦۘۥۘ";
                    break;
                case -700882535:
                    str = "ۤۚۢۙۖۜۛ۫ۦۘۤ۠ۖۥۤۡۘۘۥۛ";
                    break;
                case -204315813:
                    str = "ۢۤۢۦۥۚۨۘ۠ۢۙۧۙ۟ۧ۟ۘۡۘۛۚ۟۟ۘ";
                    break;
                case 235614024:
                    super.onSizeChanged(i2, i3, i4, i5);
                    str = "ۨۦۧۘ۬ۥۨۘۖۚۖۨ۫ۨۙ۟ۧ۟۠ۗ۬ۡ";
                    break;
                case 1093879524:
                    str = "ۙ۬ۦۤۤۗ۫ۘۚۚۢۛۘ۬ۢ۫ۡۦۘ۫ۡۙۙۢۛ";
                    break;
                case 2065297697:
                    str = "ۨۢۨۘۙۨۥۡۛۖۘۡۨۜۘ۟ۧۦۘۘۢۡۘۛۨۙ";
                    break;
            }
        }
    }

    public void setBackground() {
        GradientDrawable gradientDrawable = null;
        String str = "ۤۧۨۘ۬۫ۖۙۜۦۤۘۖۘۙ۟ۖۘ۫ۦۖۘ۬ۙۗ۠ۨۢۤۧۨۘ";
        while (true) {
            switch ((str.hashCode() ^ 82) ^ 286198851) {
                case -944100621:
                    setClipToOutline(true);
                    str = "ۥۥۥۘۗۧۥۘ۟ۦۤۤۖ۫ۧۛۘۘۙۦ۟ۛ۠ۦۘ";
                    break;
                case -441929415:
                    setBackground(this.f2575o);
                    str = "ۥۖۚ۟۠ۖۢۖۖ۟ۗ۟ۛۜۧۘۡۛۙۚۨ۬";
                    break;
                case 80083545:
                    this.f2575o = gradientDrawable;
                    str = "ۥۜۚۙۙۨۘ۫۠ۖۘ۠ۥۜۖۡۨۥ۠ۦۡ۟ۦۘ";
                    break;
                case 600092204:
                    str = "ۗۚۨۚۘ۟ۥۙ۬۫ۦ۬ۨۗۡۢ۠ۙۖۖۢ";
                    break;
                case 622667826:
                    return;
                case 670554970:
                    gradientDrawable.setColor(0);
                    str = "ۨۡۤۛ۠ۦۜۜۜ۠ۛۨۘۗۧۘۘۘۨۙ";
                    break;
                case 1423810805:
                    gradientDrawable = new GradientDrawable();
                    str = "۟ۜۡۛۘۘۜۦ۫ۗۦۖۢۚۦۨ۫ۜ";
                    break;
            }
        }
    }

    public void setRoundAsCircle(boolean z2) {
        String str = "ۗ۫ۗۥۛۦۤۜ۬ۚۚۧ۠ۧۤۙ۠ۨۨۢۢ";
        while (true) {
            switch ((str.hashCode() ^ 126) ^ 1555240718) {
                case -1512584034:
                    this.f2567g = z2;
                    str = "ۧۤ۬۟ۛ۟ۤۜۘ۬ۢۛۖۤۘۨۜ۬ۦۥۨ";
                    break;
                case -564338080:
                    str = "۬ۦۤۙۧ۟۫ۥۘۙۨۤۢۨۖۘ۠۬۠ۦ۫ۥۘۥۡ";
                    break;
                case -246043302:
                    postInvalidate();
                    str = "۬۬ۜۖۗۡۘۥۧۖۘۢۜ۫ۙۛۜۢ۫ۘۘۧۙۛۨ۠۠";
                    break;
                case -150212718:
                    String str2 = "ۘۜ۠ۘۗۡۚۥۧ۟ۜۤۦۖۦ۬ۜ۟۬ۛۢۥۢۛۗۦۢ";
                    while (true) {
                        switch (str2.hashCode() ^ -1105100724) {
                            case -676055182:
                                if (z2 == this.f2567g) {
                                    str2 = "ۥۘۥۘۜۗۡۘۨۘ۠ۗۜۢۦۧۥۧۡۛۢۤۘۡ۫ۜۘ۟ۤ";
                                    break;
                                } else {
                                    str2 = "ۨۛۖۨۧۗۡۤۦۛۥۘۢۨۘ";
                                    break;
                                }
                            case 1053429811:
                                str = "۬۬ۜۖۗۡۘۥۧۖۘۢۜ۫ۙۛۜۢ۫ۘۘۧۙۛۨ۠۠";
                                continue;
                            case 1256776940:
                                str = "ۗۧۜۘۚۤ۠۠۠ۚۦۘۥۦۡ۬";
                                continue;
                            case 1507220894:
                                str2 = "ۚۚۖۘۥۜۨۡۚۢ۫ۦۛۦ";
                                break;
                        }
                    }
                    break;
                case 68683065:
                    return;
                case 456828338:
                    a();
                    str = "۟ۥۧۖۥۘۘۢۦ۟۬ۦۛۥۡۦۙۘۨۤۖۘۨ۟ۙۗۛ۟";
                    break;
                case 1579923540:
                    str = "ۡۖۥۤۥۦۘ۠ۖۜۤ۠ۥۦۨۧۢۖۨۜۢۡ۬ۖ";
                    break;
            }
        }
    }

    public void setRoundedCornerRadius(int i2) {
        String str = "ۗۘ۟ۤۤۗۖۗ۫ۢ۠ۡۘ۠ۗۗۛۤۦۘ";
        while (true) {
            switch ((str.hashCode() ^ 885) ^ -500765466) {
                case -293367453:
                    return;
                case -147355736:
                    str = "۬ۨۨۘۖۘۡۧۤۗۖۘۥۦۛۗۦۗۥ۬ۜۗ";
                    break;
                case 1494480838:
                    str = "ۧۢۜۘۗۖۦۖ۬ۖۘۛۧۘۨۦۚۛۙ۟ۦۙۦۧۘ";
                    break;
                case 1884560906:
                    setRoundedCornerRadius(i2, true, true, true, true);
                    str = "ۙۖ۠ۤۥ۟ۜ۠ۡۡۥۗۙۖۚ۬۠ۨۘ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
        r0 = "ۡۙۨۘۢ۠۫ۖ۠ۥۘۤ۟۫ۙۨۖۡ۠ۥۘۤۘۦۛۤ۟۠ۥۥ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setRoundedCornerRadius(int r5, boolean r6, boolean r7, boolean r8, boolean r9) {
        /*
            r4 = this;
            java.lang.String r0 = "ۨۥۦۘۢۛۛۛۢۤۥۖۥۘ۠ۖۧ۠ۛۡۤۦ۟ۡۢۦۚۤۡ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 707(0x2c3, float:9.91E-43)
            r3 = -1092160826(0xffffffffbee6f2c6, float:-0.45107096)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -1707526988: goto L_0x009f;
                case -1460248606: goto L_0x00ca;
                case -1447912576: goto L_0x0041;
                case -1384051957: goto L_0x0080;
                case -1169300576: goto L_0x0017;
                case -615245931: goto L_0x001d;
                case -465240947: goto L_0x0014;
                case -408394636: goto L_0x0020;
                case -406812375: goto L_0x0011;
                case -142340542: goto L_0x00e3;
                case 504478675: goto L_0x00c4;
                case 783756692: goto L_0x00be;
                case 947103916: goto L_0x00d6;
                case 1520630803: goto L_0x00d0;
                case 1649739956: goto L_0x0062;
                case 1662480741: goto L_0x0023;
                case 1829520045: goto L_0x00ee;
                case 1859465909: goto L_0x00dc;
                case 1877215939: goto L_0x001a;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "ۙۚۚۚۘۖۙۤۙۦۦۤۙۘۡۥۗۦۘ۠ۧۨۘ"
            goto L_0x0002
        L_0x0014:
            java.lang.String r0 = "ۧۖۦۤ۬ۘۘۥۘۘ۠۬ۚۙۙۡۘۢۘۨۘ"
            goto L_0x0002
        L_0x0017:
            java.lang.String r0 = "ۡۥۡۜۥۜۘۥ۫ۡۘۢۤ۬۠ۙۤ۫ۤ۠ۚۤۦۡۢۨۘۖۚۜۘ"
            goto L_0x0002
        L_0x001a:
            java.lang.String r0 = "ۙۙۛۚۚۦۧۧۘۘ۟ۜۜۢۨۦۖۘۖۘ"
            goto L_0x0002
        L_0x001d:
            java.lang.String r0 = "ۢۖۥ۟ۤۖۘۢۧۛ۬ۦۘۚ۫ۖۘۢۙۨۘۚ۫ۡۘ۬ۛۢ"
            goto L_0x0002
        L_0x0020:
            java.lang.String r0 = "ۦۜۢۜۗۦۖۦۥۛ۬ۡۜۨۘ۬ۚۜۘۢۨۢ"
            goto L_0x0002
        L_0x0023:
            r1 = 1745387055(0x68087e2f, float:2.578278E24)
            java.lang.String r0 = "۠ۢ۟ۗۢ۟ۤۗۨۘۦۚۜۘۥۤۥۘ"
        L_0x0028:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -2092568747: goto L_0x0031;
                case -1730423053: goto L_0x0037;
                case -771576257: goto L_0x004f;
                case 174987903: goto L_0x003e;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x0028
        L_0x0031:
            java.lang.String r0 = "۬۠ۛۚ۠ۡۘۛۘۦۨۢۖ۟ۚۗۙۤ"
            goto L_0x0028
        L_0x0034:
            java.lang.String r0 = "ۤۧۢۜۙۢۙۗۨۘۚۛۨۖۡۖۖۤۖ"
            goto L_0x0028
        L_0x0037:
            int r0 = r4.f2566f
            if (r0 != r5) goto L_0x0034
            java.lang.String r0 = "ۡۥۜۘ۟۟ۜۤۛۖۘۤۥۢۛۘۧۘ"
            goto L_0x0028
        L_0x003e:
            java.lang.String r0 = "ۧۦۜۘۨۖۡۘۚ۠ۢۜۧ۫ۛ۬ۚ"
            goto L_0x0002
        L_0x0041:
            r1 = 1929628841(0x7303cca9, float:1.0442229E31)
            java.lang.String r0 = "ۗ۬۠ۙ۠ۖۘۥ۫۠ۗۨ۬ۢۢۚۚۘۡ۟ۥۖ"
        L_0x0046:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -2015478163: goto L_0x005c;
                case 562602118: goto L_0x005f;
                case 671394235: goto L_0x0055;
                case 823472912: goto L_0x004f;
                default: goto L_0x004e;
            }
        L_0x004e:
            goto L_0x0046
        L_0x004f:
            java.lang.String r0 = "ۡۙۨۘۢ۠۫ۖ۠ۥۘۤ۟۫ۙۨۖۡ۠ۥۘۤۘۦۛۤ۟۠ۥۥ"
            goto L_0x0002
        L_0x0052:
            java.lang.String r0 = "ۦ۫ۗۧۖۥۗۨۗۥۡۧۘۦ۟ۥۡۥۛۜۚ۟۠ۘۘ"
            goto L_0x0046
        L_0x0055:
            boolean r0 = r4.f2568h
            if (r0 != r6) goto L_0x0052
            java.lang.String r0 = "ۥۥۜ۫ۨۢ۟ۙ۫۬ۘۦۚ۫ۧ"
            goto L_0x0046
        L_0x005c:
            java.lang.String r0 = "ۥۢۘۥۡۦۚ۠۬ۨ۬۬۠ۗۥۘۤۨۧۘۥۦ۠"
            goto L_0x0046
        L_0x005f:
            java.lang.String r0 = "ۜۨۥ۬ۢۨ۫ۘۜۘۢ۫ۗۦۡۗۛۡۘ۫ۥۤۡۘۚ۬ۢ"
            goto L_0x0002
        L_0x0062:
            r1 = 996492577(0x3b654521, float:0.003498383)
            java.lang.String r0 = "ۖۙۨۛۘ۫ۥۤ۠۬ۡۘۜ۫۫ۛۛۥۘ"
        L_0x0067:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -2111100831: goto L_0x004f;
                case -1322223626: goto L_0x007d;
                case -271937051: goto L_0x0070;
                case 1772916026: goto L_0x007a;
                default: goto L_0x006f;
            }
        L_0x006f:
            goto L_0x0067
        L_0x0070:
            boolean r0 = r4.f2569i
            if (r0 != r7) goto L_0x0077
            java.lang.String r0 = "ۡ۫ۨۘ۠ۢ۬ۖ۠ۜۧۘۦۖۢۘۘۧۥۘ"
            goto L_0x0067
        L_0x0077:
            java.lang.String r0 = "۫۠ۨۤۧ۠ۚۤۨۢۦۨۨۘ۫ۥۦۡۘۨۡۡۘۨۙۜۘ"
            goto L_0x0067
        L_0x007a:
            java.lang.String r0 = "ۧ۟ۨ۬۠ۘۗ۫ۨۢۘ۟ۚۡۘۥۘۜۘ"
            goto L_0x0067
        L_0x007d:
            java.lang.String r0 = "ۚ۫ۢۙ۟ۛ۫ۢ۫ۤۦۢ۫ۦۙ"
            goto L_0x0002
        L_0x0080:
            r1 = -648549106(0xffffffffd957ed0e, float:-3.79861027E15)
            java.lang.String r0 = "ۡۧۖۘ۬ۘۧ۬ۗۦۘۚۧۥۗۗۤ۠ۜۗ۠۠"
        L_0x0085:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -684572682: goto L_0x004f;
                case 155125713: goto L_0x0094;
                case 209634808: goto L_0x009b;
                case 554706007: goto L_0x008e;
                default: goto L_0x008d;
            }
        L_0x008d:
            goto L_0x0085
        L_0x008e:
            java.lang.String r0 = "ۖۘۧۘ۫ۘۧۢۖ۟ۤۘۖۘۨۛۧۜۦۚ"
            goto L_0x0085
        L_0x0091:
            java.lang.String r0 = "ۦ۠۬۠ۖۖ۠۬ۦۘ۬ۨۘۦۚۜ"
            goto L_0x0085
        L_0x0094:
            boolean r0 = r4.f2570j
            if (r0 != r9) goto L_0x0091
            java.lang.String r0 = "۬ۡۘۘۡۦۜۧۡۛۥۧۘۗۚۦۙۥۨۖۧۚ۬ۛۡ"
            goto L_0x0085
        L_0x009b:
            java.lang.String r0 = "ۘۘۥۘۘ۠ۨۘۗۛۚۜۚۥۘۨۧ۬"
            goto L_0x0002
        L_0x009f:
            r1 = 240209622(0xe514ed6, float:2.5799197E-30)
            java.lang.String r0 = "ۢۦ۟۟ۖۘۖۛۤۖ۠ۗ۫ۥۢ۟ۧۡ۬ۨۨۘۛۖۡۘ"
        L_0x00a4:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1720086189: goto L_0x00ba;
                case 166828597: goto L_0x00ad;
                case 395993596: goto L_0x00b7;
                case 529662842: goto L_0x00ea;
                default: goto L_0x00ac;
            }
        L_0x00ac:
            goto L_0x00a4
        L_0x00ad:
            boolean r0 = r4.f2571k
            if (r0 == r8) goto L_0x00b4
            java.lang.String r0 = "ۚ۟۠۫ۖۚۢۧۨۙۨۨۦۚۨ"
            goto L_0x00a4
        L_0x00b4:
            java.lang.String r0 = "ۤۗۖ۠ۗۥۘۥ۬ۥۤۖۨۧۗۘۘۘ۬ۚۛۗۙ"
            goto L_0x00a4
        L_0x00b7:
            java.lang.String r0 = "۫ۡۚۘۡ۫ۘۨۘۘ۟ۨۚۢۤ"
            goto L_0x00a4
        L_0x00ba:
            java.lang.String r0 = "ۡۙۨۘۢ۠۫ۖ۠ۥۘۤ۟۫ۙۨۖۡ۠ۥۘۤۘۦۛۤ۟۠ۥۥ"
            goto L_0x0002
        L_0x00be:
            r4.f2566f = r5
            java.lang.String r0 = "ۚۖۜۘۥۦۘۥۘۘۥۜۘۖۖۡ۟ۗ۫ۡۦۘۗ۟ۤ"
            goto L_0x0002
        L_0x00c4:
            r4.f2568h = r6
            java.lang.String r0 = "ۙۢۡۘۤۤۛۚۙۡۘۛۘۦۘۙ۫۟ۜۢۙۘۚۗۡۙ"
            goto L_0x0002
        L_0x00ca:
            r4.f2569i = r7
            java.lang.String r0 = "ۜۡۧۘۡۧۘۖۘۘۡ۠ۖۤۖۦۘ۠ۗ۟ۘۦۡۨۨۢ"
            goto L_0x0002
        L_0x00d0:
            r4.f2570j = r9
            java.lang.String r0 = "ۤۢۧ۬ۜ۟ۧۧۨۛۘ۬ۥ۬ۡۜۙ۟ۘۗۖۘۘۚۡ"
            goto L_0x0002
        L_0x00d6:
            r4.f2571k = r8
            java.lang.String r0 = "ۙۤۖۢۚۨۨۜۛ۟ۧ۟۬۠۟ۖۜ۫ۢۚۗ"
            goto L_0x0002
        L_0x00dc:
            r4.a()
            java.lang.String r0 = "ۥۛۛۡۦ۟۠۬ۖ۫ۗۡ۟۟ۜۘۦ۫۟۫ۥۖۘۚۤ۫ۗۗ"
            goto L_0x0002
        L_0x00e3:
            r4.postInvalidate()
            java.lang.String r0 = "ۥۢۧ۠۠ۨۘۛۜ۠ۨۢ۟ۧۤۜۘۖۦۥۖۢ"
            goto L_0x0002
        L_0x00ea:
            java.lang.String r0 = "ۥۢۧ۠۠ۨۘۛۜ۠ۨۢ۟ۧۤۜۘۖۦۥۖۢ"
            goto L_0x0002
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.whatsapp.rounded.RoundedLayout.setRoundedCornerRadius(int, boolean, boolean, boolean, boolean):void");
    }

    public void setRoundingBorderColor(int i2) {
        String str = "ۖۘۨۘۧ۟ۨۚ۟ۘ۬ۥۡۘۨۤۜ";
        while (true) {
            switch ((str.hashCode() ^ 865) ^ 400358011) {
                case -2119236112:
                    String str2 = "ۜۦۥۨۡۨۦۜۘۛۘۨۧۥۧ۫ۜۤۡۦ";
                    while (true) {
                        switch (str2.hashCode() ^ -1586441463) {
                            case -1715383022:
                                str = "ۜۦۛۘۚۛۚۖۘۥۥۛ۟ۤۛۙۖۘۦۖ۫ۢۚۤ۫۫۟";
                                continue;
                            case -617194619:
                                if (i2 == this.f2573m) {
                                    str2 = "ۥ۬۫ۢۗۘۨۚۛۛۧۨ۟۬ۜۖ۬۬ۨۜ۫ۢ۬ۦ۫ۨ";
                                    break;
                                } else {
                                    str2 = "۠۠ۛۘ۫ۙۖۘ۫۟۫ۗ۫۬";
                                    break;
                                }
                            case 1277972903:
                                str2 = "ۖۦۧۘۥۖۢۤۘۙ۟ۦ۬۫";
                                break;
                            case 1901414866:
                                str = "ۖۘۦۘۛۖ۫۬۠ۚۤۨۖ۟۬ۛ";
                                continue;
                        }
                    }
                    break;
                case -1761175318:
                    this.f2562b.setColor(i2);
                    str = "ۦۦۥۘ۟ۘۛۡۙ۠ۘ۠ۗۦۢۦۘ۟ۗۨ";
                    break;
                case -1545060735:
                    str = "ۧ۟ۨۘۨۘۚۚۧۨ۟ۧۜۖۥۘ";
                    break;
                case -1291857768:
                    return;
                case -544725868:
                    str = "ۙۨۧ۠۠ۦۛۗۡۥ۟ۢۨۗۘ۬ۦۙۜ۫ۦۘۡ۬ۥۘۖ۠ۚ";
                    break;
                case -297560324:
                    this.f2573m = i2;
                    str = "ۦۢۦۘۢۦۘۥۗۦۦۥۜ۟ۛ۠ۡ۟۫۬ۗۚۦۜۡۤۗۗ";
                    break;
                case 485251190:
                    postInvalidate();
                    str = "ۜۦۛۘۚۛۚۖۘۥۥۛ۟ۤۛۙۖۘۦۖ۫ۢۚۤ۫۫۟";
                    break;
            }
        }
    }

    public void setRoundingBorderWidth(int i2) {
        float f2 = 0.0f;
        String str = "ۖۧۨۖ۠ۗۤۘۧۘۛۘۚ۠ۜۖۜۡۥۘۢ۟ۥۨۨۦ";
        while (true) {
            switch ((str.hashCode() ^ 766) ^ 259426534) {
                case -1439368548:
                    return;
                case -1224252273:
                    postInvalidate();
                    str = "ۢۨۥۤ۠ۙۚ۫ۜۜۗ۬ۤۜ۫ۚۘۦۡۜۘ";
                    break;
                case -649247102:
                    str = "ۜ۫۫ۡۨۘۘۨ۫ۥۜۘ۫ۧۨۜۘ۬ۘ۠ۤۘۜۘۡۖۜۘ";
                    break;
                case -478287908:
                    this.f2562b.setStrokeWidth(f2);
                    str = "ۛۜۘۘۨۖۦۘ۬۟ۡۘ۫ۙۜۧۥۛۡۗۜۦۤۡ";
                    break;
                case -76254177:
                    f2 = (float) (i2 * 2);
                    str = "ۚۛۧۜۧ۫ۘۘۛ۫ۖۘۚ۫ۗۜ۠ۖۛۧ";
                    break;
                case 462982192:
                    String str2 = "ۨۥۧۘۧۙۤۙۦۜۘۙۨۨ۬ۚۜۛ۠۬۠۫ۡۘۡۜ";
                    while (true) {
                        switch (str2.hashCode() ^ 1265634698) {
                            case 292188059:
                                str2 = "ۦۗۚۢۚ۫۠ۗۥۛۧۗۖۥۜۘ";
                                break;
                            case 1218931730:
                                str = "ۢۨۥۤ۠ۙۚ۫ۜۜۗ۬ۤۜ۫ۚۘۦۡۜۘ";
                                continue;
                            case 1273542920:
                                if (i2 == this.f2572l) {
                                    str2 = "۬ۖۡۘ۠۫ۗ۬ۨۦۘۛۤۜۢۨۥۖۢۧۗ۫ۢ";
                                    break;
                                } else {
                                    str2 = "ۡ۬۟ۨۨ۫ۧ۫ۢۡ۠۬ۚۨۘۤ۟ۥۘ۬ۜۧۙۙۦۘ۫ۤۡ";
                                    break;
                                }
                            case 1896998200:
                                str = "ۤۦۖۦۤۡۘ۫۫ۨۦۦۜۨ۠ۗۚ۫ۢۛۨۛ";
                                continue;
                        }
                    }
                    break;
                case 1124508246:
                    str = "۫ۤ۬ۜۛۡۘ۫ۦۘۘۗۥۘۘۤۥۘ۫ۖۖۘۙۜۛۤ۟ۛ";
                    break;
                case 2095968039:
                    this.f2572l = i2;
                    str = "ۘۦۨۘۖۢۢۘۛ۬ۢ۬۟ۚۨۙۙ۬ۡۘۡ۟ۡۘۛۤۖ";
                    break;
            }
        }
    }

    public void setRoundingElevation(float f2) {
        String str = "ۙ۬۟ۘۡۘۘۘ۟ۡۤۦۦۨۗۙۘۗۘۘ";
        while (true) {
            switch ((str.hashCode() ^ 484) ^ 508916506) {
                case -2143908192:
                    this.f2574n = f2;
                    str = "ۨ۠ۘۙۜۦۘ۫۟۬ۧ۠ۥۖۗۧ";
                    break;
                case -1030772889:
                    return;
                case 808690595:
                    setElevation(f2);
                    str = "۬۠ۘۘۙ۟ۘ۫۟۠ۗۧۥۛۖۡۘ";
                    break;
                case 1212393108:
                    str = "ۘۥ۠ۧۧۗۗۜۜۘۛۤۥۙۖ۫";
                    break;
                case 1743588009:
                    str = "۟ۖۘۘۛۘۦۦۘۖۙۘۡۨۛۡ";
                    break;
            }
        }
    }
}
