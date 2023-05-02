package com.obwhatsapp.yo;

import android.graphics.PointF;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.obwhatsapp.yo.TouchImageView;

public final class r0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final float f856a;

    /* renamed from: b  reason: collision with root package name */
    public final float f857b;

    /* renamed from: c  reason: collision with root package name */
    public final PointF f858c;

    /* renamed from: d  reason: collision with root package name */
    public final AccelerateDecelerateInterpolator f859d = new AccelerateDecelerateInterpolator();

    /* renamed from: e  reason: collision with root package name */
    public final long f860e;

    /* renamed from: f  reason: collision with root package name */
    public final PointF f861f;

    /* renamed from: g  reason: collision with root package name */
    public final float f862g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f863h;

    /* renamed from: i  reason: collision with root package name */
    public final float f864i;

    /* renamed from: j  reason: collision with root package name */
    public final TouchImageView f865j;

    public r0(TouchImageView touchImageView, float f2, float f3, float f4, boolean z2) {
        this.f865j = touchImageView;
        TouchImageView.a(touchImageView, TouchImageView.State.ANIMATE_ZOOM);
        this.f860e = System.currentTimeMillis();
        this.f862g = touchImageView.f591l;
        this.f864i = f2;
        this.f863h = z2;
        PointF j2 = touchImageView.j(f3, f4, false);
        float f5 = j2.x;
        this.f856a = f5;
        float f6 = j2.y;
        this.f857b = f6;
        this.f861f = TouchImageView.d(touchImageView, f5, f6);
        this.f858c = new PointF((float) (touchImageView.f602w / 2), (float) (touchImageView.f601v / 2));
    }

    public final void run() {
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        TouchImageView touchImageView = null;
        float f5 = 0.0f;
        boolean z2 = false;
        float f6 = 0.0f;
        float f7 = 0.0f;
        PointF pointF = null;
        float f8 = 0.0f;
        PointF pointF2 = null;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        PointF pointF3 = null;
        String str = "ۧۧۖۚ۬۟ۙۘ۠ۢۢ۟۟ۧۗۛۦۘ";
        while (true) {
            switch ((str.hashCode() ^ 787) ^ 1883212896) {
                case -1742702437:
                    f2 = this.f859d.getInterpolation(Math.min(1.0f, ((float) (System.currentTimeMillis() - this.f860e)) / 500.0f));
                    str = "۬۠ۜۘۡۦۨ۟ۘۧۨۧ۠ۖۘ۟ۦ۬ۖۘۦۘۚۗۗ";
                    break;
                case -1248058589:
                    touchImageView.f588i.postTranslate((((f9 - f8) * f2) + f8) - pointF3.x, (((f11 - f10) * f2) + f10) - pointF3.y);
                    str = "۫ۙۛۛۡ۫ۖۢۖۘ۫۠ۨۘ۬ۜۙۢۚۗۜۙۦ۠۫ۤ";
                    break;
                case -1217236729:
                    touchImageView.setImageMatrix(touchImageView.f588i);
                    str = "ۜۗۤۗۡۡۘۨۜ۟ۨۡۧۘ۫ۥۘۢۧۧۦۧۨۘۛۨۨۘ۠ۡ۠";
                    break;
                case -1006598608:
                    f7 = this.f857b;
                    str = "ۡۢ۫۠۠ۘۘ۬ۤ۬۫ۦۢۨۨۘۘ";
                    break;
                case -740408730:
                    f8 = pointF.x;
                    str = "ۘۜۘۘۡۨۙ۟ۢۧۖۡۡۢۙ۠ۡۗۨۙۙۚ۟۠ۡ";
                    break;
                case -710996713:
                    pointF3 = TouchImageView.d(touchImageView, f6, f7);
                    str = "ۧۨۖۥۘۢ۟۬ۢۖۚۛۤۘ";
                    break;
                case -598557146:
                    return;
                case -579951366:
                    f3 = this.f864i;
                    str = "ۚۖۛ۫ۧۘۘۦۘۘۤۡۘۧ۟ۖۚۦۗۗ۬ۥۘ";
                    break;
                case -570864768:
                    str = "ۚۧۙۖ۬ۤۛۤۥ۠ۚ۬ۤ۫ۘۘۥۙۧۧۢ۠ۧۚ۬";
                    break;
                case -548250212:
                    pointF2 = this.f858c;
                    str = "۠۬ۜۘ۠ۘۛۗۥۡ۟ۢۗۥۘۡۚ۬ۨۘۜ۟ۧ";
                    break;
                case -460287087:
                    String str2 = "ۧۥۥۗۙۜۦ۬۫ۗ۫ۨۘۦۘۧۘۦۥۤۗۚۢۚۤۛ";
                    while (true) {
                        switch (str2.hashCode() ^ 1267036833) {
                            case -63466689:
                                if (f2 >= 1.0f) {
                                    str2 = "ۙ۟ۜۚۡۛ۫ۘ۫ۖۜۦۚ۟ۧ۬ۗ۠";
                                    break;
                                } else {
                                    str2 = "ۖ۬ۚۡۦ۬۟ۖۛۤۚۡۙ۠ۤ۟۫ۨۘۢۗۙ۠ۨ۟ۚۛۦۘ";
                                    break;
                                }
                            case 408764242:
                                str = "ۚ۟ۖۘۧۡۨۙ۟۬ۗۜۡۦۖۧ۬ۜۗۤۢۡۨۥۘۜ۟ۚ";
                                continue;
                            case 1478537105:
                                str = "۬ۥۛۧۧۖ۠ۡۜ۠ۘۦۘۛۖ۠ۖۨۨۘۚۢۦ";
                                continue;
                            case 1982010676:
                                str2 = "ۢ۫ۙ۫ۘۨۘۦ۬۬ۦۜۜۖۧۡ۫۫ۨۘۖۛۨ";
                                break;
                        }
                    }
                    break;
                case -128349509:
                    touchImageView.postOnAnimation(this);
                    str = "ۖۤۘۘۤۥۡۘۖۦۢۜ۬ۨۘۦۖۘۧۨۗۖۤ۬ۦۤۙۘۢۙ";
                    break;
                case -23466978:
                    z2 = this.f863h;
                    str = "ۛۘۧۧۘۤ۟ۥۛۗ۠۟۠ۥ۠ۚ۬ۙ۟ۘۧۘ۠ۢۦ";
                    break;
                case -21157565:
                    f9 = pointF2.x;
                    str = "ۤ۟ۖۨۤۚۘۘۘۘۖۢۚۢۦ";
                    break;
                case 81416406:
                    f4 = this.f862g;
                    str = "۬ۨۧۘ۬ۙ۠ۦۢۘ۟ۢۥۥۨۨۘۥ۬ۥ";
                    break;
                case 104610828:
                    touchImageView = this.f865j;
                    str = "۬ۧ۫۫ۖۘۙ۬ۢۥۨۧۘۦ۫۬ۖ۟ۥ۠ۖۚۥۥۧ";
                    break;
                case 166273250:
                    touchImageView.g();
                    str = "۠ۥۘۘۤۧۨۧۘۗ۟ۧۦۘۚ۬ۖۘ";
                    break;
                case 1080564705:
                    TouchImageView.a(touchImageView, TouchImageView.State.NONE);
                    str = "۫ۢۜۚۨۥۘ۟۫ۦۘۘ۠ۨۚ۠ۗ";
                    break;
                case 1360344029:
                    pointF = this.f861f;
                    str = "ۖۚ۫۫ۛۨۦۦۘۘۜۧ۬۫۬ۨۚۨۥۡۧۨۘ۫ۧۧ";
                    break;
                case 1449464235:
                    str = "۫ۢۜۚۨۥۘ۟۫ۦۘۘ۠ۨۚ۠ۗ";
                    break;
                case 1451972252:
                    f10 = pointF.y;
                    str = "ۢۛۙۛۡۧۘۜۗۡ۬ۢۥۚۨۘ۫ۘۥ";
                    break;
                case 1479535863:
                    f6 = this.f856a;
                    str = "ۛۙۨ۠ۙۡ۫ۧۛ۟ۥۛۙۖۜۜۥۢۢۥۦۘ";
                    break;
                case 1774949773:
                    f5 = (((f3 - f4) * f2) + f4) / touchImageView.f591l;
                    str = "ۤ۟ۘ۫۫ۘۘ۟ۧۨۘۘۘۖۘۛۢ۟۠ۚۦۘ";
                    break;
                case 1885627389:
                    f11 = pointF2.y;
                    str = "ۥۧۖۘ۟ۖۛۙۜۘۚۧۤۙۙۖۘ";
                    break;
                case 2060176814:
                    TouchImageView.e(touchImageView, f5, f6, f7, z2);
                    str = "ۧ۠ۖۘ۫ۡ۠ۧۖۤۚۨۡۘۙۢۤۡۨۖۗۖۡۜۜۢ۟ۨۖ";
                    break;
            }
        }
    }
}
