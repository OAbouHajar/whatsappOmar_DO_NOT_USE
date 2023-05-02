package com.obwhatsapp.youbasha.ui.views;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.animation.OvershootInterpolator;
import com.obwhatsapp.youbasha.ui.views.FloatingActionsMenu;

public final class g extends AddFloatingActionButton {

    /* renamed from: o  reason: collision with root package name */
    public final FloatingActionsMenu f1451o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(FloatingActionsMenu floatingActionsMenu, Context context) {
        super(context);
        this.f1451o = floatingActionsMenu;
    }

    public final void d() {
        FloatingActionsMenu floatingActionsMenu = null;
        String str = "ۛ۠ۨۘۧۛۥۨۨۢۢ۠ۦۡۚ۬۟۟ۛ";
        while (true) {
            switch ((str.hashCode() ^ 276) ^ -719198966) {
                case -1747966800:
                    super.d();
                    str = "ۚ۠۠ۧۖۧۦۡۙۜۗۘۘ۫ۖۧۘۥۘۖۛۦ۬ۤ۠";
                    break;
                case -1707386349:
                    this.f1361m = floatingActionsMenu.f1366b;
                    str = "ۖۧۨۘ۟ۙ۬ۢۥۢۖۦۨۘۨ۫۟ۖ۟۫ۢۜۘۘ";
                    break;
                case -1667472089:
                    floatingActionsMenu = this.f1451o;
                    str = "ۘۙ۬ۦۧۘ۠ۘۧۢۥۨۘ۟ۜۖۥۗۢۤ۠۬ۧۜۜۘ۟ۢۥ";
                    break;
                case -381774769:
                    return;
                case 311064660:
                    str = "ۘۧ۠ۢۧۜ۟ۛۡۘۜۚۗ۫ۛۡۘۡۜ۬ۗۦ";
                    break;
                case 933159024:
                    this.f1343n = floatingActionsMenu.f1365a;
                    str = "ۜۤۡۘۖۜۢۖۧۛۚۙۚۚ۟۠ۥۗ۠ۡ۫ۖۘ";
                    break;
            }
        }
    }

    public final Drawable getIconDrawable() {
        String str = "ۚ۠ۖۛۢۘۘ۫ۖۨۘۛۢۨۘۚۨۖ۠ۘۜۘۡ۟ۖۖۚۖۨ۟ۚ";
        ObjectAnimator objectAnimator = null;
        ObjectAnimator objectAnimator2 = null;
        OvershootInterpolator overshootInterpolator = null;
        FloatingActionsMenu floatingActionsMenu = null;
        FloatingActionsMenu.RotatingDrawable rotatingDrawable = null;
        while (true) {
            switch ((str.hashCode() ^ 555) ^ -1240361969) {
                case -1794626413:
                    objectAnimator = ObjectAnimator.ofFloat(rotatingDrawable, "rotation", new float[]{0.0f, 135.0f});
                    str = "ۧۦۜۘۛۦۦۘۨ۟ۨۘۥۗۦۡۜۢ۬ۡۥۘ";
                    break;
                case -1681948604:
                    return rotatingDrawable;
                case -1614007122:
                    str = "ۛ۟ۜۘۜۗۖۘۡ۬۬ۙۜۚۤۗۢۤۘ۠ۗۙ";
                    floatingActionsMenu = this.f1451o;
                    break;
                case -1051515204:
                    floatingActionsMenu.f1372h.play(objectAnimator2);
                    str = "۠ۘۥۘۥۧۢۨۧۥۡۖ۠ۦۘۨۘ۠ۤۘۘ";
                    break;
                case -108426534:
                    str = "ۘۛۧۘۜۙۤۚۖ۬ۘ۟ۢۦۖۘۤ۬ۦۘۥۘۘۚۘۨ۠ۘۘ";
                    objectAnimator2 = ObjectAnimator.ofFloat(rotatingDrawable, "rotation", new float[]{135.0f, 0.0f});
                    break;
                case 409132062:
                    objectAnimator2.setInterpolator(overshootInterpolator);
                    str = "ۘ۬ۡۘۙۙۘۥۗۖۧۡۘۖۜۜ۬ۥ۠۫۬ۖۘۥۚۚۨ۠۟";
                    break;
                case 852466850:
                    floatingActionsMenu.f1371g.play(objectAnimator);
                    str = "ۤۜۧۛۙۙ۫ۜۨۖۦۡۘۖۨۢ۫ۥۗۗۖۘۨۙۖۘۧۛۙ";
                    break;
                case 1276498578:
                    str = "ۧۤۢۨۜۘۘ۠۫۟ۢۖۦۨۢۜۘۖۡۙۗۦۙۛۙ۟ۜۢۘ";
                    break;
                case 1519921270:
                    floatingActionsMenu.f1374j = rotatingDrawable;
                    str = "۬۬ۥۤۛۧۖۗۨۘۨۨۘ۫ۛۦۨ۠۟ۧ۠۫";
                    break;
                case 1804609217:
                    str = "ۚۜۚ۠۫ۥۧۦۦۘۚ۬ۙۚۤ";
                    overshootInterpolator = new OvershootInterpolator();
                    break;
                case 1828135033:
                    objectAnimator.setInterpolator(overshootInterpolator);
                    str = "۠۬۟ۗۢۡۘۨۡۦۙۨۚ۫ۤۤ۬ۚ";
                    break;
                case 1843903166:
                    str = "ۡۤۦۘ۠ۧ۫ۧ۟ۨۘۦۘ۟۫ۦ۬ۘۦۗۚۗ۫ۖۜ۫ۘ۟ۖ";
                    rotatingDrawable = new FloatingActionsMenu.RotatingDrawable(super.getIconDrawable());
                    break;
            }
        }
    }
}
