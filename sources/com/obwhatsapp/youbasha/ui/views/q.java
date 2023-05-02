package com.obwhatsapp.youbasha.ui.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import com.google.gson.internal.i;

public final class q extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final i f1506a;

    public /* synthetic */ q(i iVar) {
        this.f1506a = iVar;
    }

    public final void onAnimationEnd(Animator animator) {
        String str = "ۚۗۜ۠ۡۖ۫ۤۧۢۙۡۘۙۦۨۘ";
        while (true) {
            switch ((str.hashCode() ^ 717) ^ -261687600) {
                case -405488098:
                    str = "ۥۜۘۘۥۦۙۥ۠ۜۚۘۦۚۘۖ۠ۢۛ۟۠۬ۧۚۥۛۖ";
                    break;
                case -396934328:
                    super.onAnimationEnd(animator);
                    str = "۟ۙۛۤۚۘۘۨۜ۬ۤۛۨۘۚۥۡۧۙۛ۠۬ۡ";
                    break;
                case -279346346:
                    str = "۫ۢۖۘۙۖۦۢۡۤۡۨۖۘۢۜۨۘۤۨۙۨۧۥۘۦۦ۫ۙۚۢ";
                    break;
                case 158021703:
                    ((ImageView) this.f1506a.f408b).setVisibility(8);
                    str = "ۖۨۛۜۛۤۛۨۛۙۥۘۘۦۗۦۘۥۖۚ۬ۙۨۘ";
                    break;
                case 505139320:
                    return;
            }
        }
    }
}
