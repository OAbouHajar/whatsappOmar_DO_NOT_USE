package com.obwhatsapp.youbasha.ui.views;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import p.b;

public final class h extends ViewGroup.LayoutParams {

    /* renamed from: a  reason: collision with root package name */
    public final ObjectAnimator f1452a;

    /* renamed from: b  reason: collision with root package name */
    public final ObjectAnimator f1453b;

    /* renamed from: c  reason: collision with root package name */
    public final ObjectAnimator f1454c;

    /* renamed from: d  reason: collision with root package name */
    public final ObjectAnimator f1455d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1456e;

    /* renamed from: f  reason: collision with root package name */
    public final FloatingActionsMenu f1457f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(FloatingActionsMenu floatingActionsMenu, ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f1457f = floatingActionsMenu;
        ObjectAnimator objectAnimator = new ObjectAnimator();
        this.f1452a = objectAnimator;
        ObjectAnimator objectAnimator2 = new ObjectAnimator();
        this.f1453b = objectAnimator2;
        ObjectAnimator objectAnimator3 = new ObjectAnimator();
        this.f1454c = objectAnimator3;
        ObjectAnimator objectAnimator4 = new ObjectAnimator();
        this.f1455d = objectAnimator4;
        objectAnimator.setInterpolator(FloatingActionsMenu.f1362o);
        objectAnimator2.setInterpolator(FloatingActionsMenu.f1364q);
        DecelerateInterpolator decelerateInterpolator = FloatingActionsMenu.f1363p;
        objectAnimator3.setInterpolator(decelerateInterpolator);
        objectAnimator4.setInterpolator(decelerateInterpolator);
        objectAnimator4.setProperty(View.ALPHA);
        objectAnimator4.setFloatValues(new float[]{1.0f, 0.0f});
        objectAnimator2.setProperty(View.ALPHA);
        objectAnimator2.setFloatValues(new float[]{0.0f, 1.0f});
        floatingActionsMenu.getClass();
        objectAnimator3.setProperty(View.TRANSLATION_Y);
        objectAnimator.setProperty(View.TRANSLATION_Y);
    }

    public final void a(View view) {
        String str = "۫ۥۜۘ۠ۥۜۘۧۗۗۙۘۘ۬ۢۢ۫ۧۘۘۚۜۤۖۛۥ";
        AnimatorSet animatorSet = null;
        FloatingActionsMenu floatingActionsMenu = null;
        ObjectAnimator objectAnimator = null;
        ObjectAnimator objectAnimator2 = null;
        ObjectAnimator objectAnimator3 = null;
        ObjectAnimator objectAnimator4 = null;
        while (true) {
            switch ((str.hashCode() ^ 422) ^ 1758938316) {
                case -1996533427:
                    animatorSet.play(objectAnimator);
                    str = "ۚ۠ۘۖ۬ۢ۬ۘۦۚۜۜۙۨ۫";
                    break;
                case -1961508109:
                    return;
                case -1928134289:
                    objectAnimator.setTarget(view);
                    str = "ۙۚۧۢۘ۠ۥۧۡۘۦۢۡۢۙۙۨۥۘ";
                    break;
                case -1637862431:
                    str = "ۡۘۙ۠ۦ۫ۖ۟ۥۥۢ۟ۤ۫ۖۘۦ۫ۢۙۧ۫۠۫۠";
                    objectAnimator2 = this.f1453b;
                    break;
                case -1511870840:
                    floatingActionsMenu.f1372h.play(objectAnimator4);
                    str = "ۛۧۚۘ۠ۦۘۘۗۤۜۨۛۛۡۨۘۛۨ۠ۜۘۤۥ۠ۨ";
                    break;
                case -1035531221:
                    String str2 = "ۙۙۨۨۙۛۥۗۨۘۤ۟ۜۘۡ۫ۦ۟ۦ";
                    while (true) {
                        switch (str2.hashCode() ^ -2019142721) {
                            case -442679397:
                                str = "ۤ۬ۜۘۤۨۥ۫۬ۘۘۧۧۡۘۗۛ";
                                continue;
                            case -95246025:
                                str2 = "ۙ۠ۡۘۥۦۦۘۦ۬ۨۙۛۤۘ۫ۧ۟ۙۨۜ۟ۜۘۗۧ۟";
                                break;
                            case 165350647:
                                if (this.f1456e) {
                                    str2 = "ۘ۟ۥۙۡ۟ۥ۟ۦ۫ۚۧۤۨ۫۠ۥۥۜۜ۟۫۟ۙ";
                                    break;
                                } else {
                                    str2 = "ۖۙۙۥ۬ۦۦۘۦۙۗۥۤۥۨۙۥۜۘۧ۫ۚ۟ۛۧ";
                                    break;
                                }
                            case 1139187418:
                                str = "ۚۧ۫ۛۖۨۘۨ۠ۥۘ۬ۙۛ۟۫ۦۘۧۜۖۚ۬۫";
                                continue;
                        }
                    }
                    break;
                case -952022252:
                    str = "ۛۧۜ۟۠۠ۗۖۙۢۙۗۖۗۚۤۗۦۘ۟ۙۨۘۥۙ۬";
                    objectAnimator = this.f1452a;
                    break;
                case -878567627:
                    animatorSet.play(objectAnimator2);
                    str = "ۘۡۖۛۧۡۘۘۦۥ۬ۧۜۘۗۦۡۘۙۨ۫ۘ۫ۚۗ۬۫۫۫";
                    break;
                case -776951713:
                    str = "ۧۢۗۥ۫ۛۥۙۦۘۡ۠ۧۚۜۙۨۜۡۘ";
                    objectAnimator4 = this.f1455d;
                    break;
                case -501869656:
                    str = "ۛۖۜۖۘۘۡۖۛۨۗۦۘۧۡۗۙۙۨۥۘۨۥۨۛ۫ۚۖ";
                    objectAnimator3 = this.f1454c;
                    break;
                case -282002615:
                    objectAnimator2.setTarget(view);
                    str = "ۤۧۜۘۚۛۨۘۖۗ۟ۧۖۙ۟ۜۗ";
                    break;
                case -143509912:
                    this.f1456e = true;
                    str = "ۤ۬ۜۘۤۨۥ۫۬ۘۘۧۧۡۘۗۛ";
                    break;
                case -84785193:
                    objectAnimator3.addListener(new b(this, view, 2));
                    str = "ۡۨۜۘۘۨ۬۫۟ۜۦۡۦۤۢ۟ۗۜۘ۠ۜ۫ۜ۠۠";
                    break;
                case 150550170:
                    objectAnimator.addListener(new b(this, view, 2));
                    str = "ۜ۟۠ۢۢۚۜۡۘۦۛۡۘۧۜۖۛۚۦۘۜ۟ۜۘۤۖۜۘ";
                    break;
                case 169525850:
                    floatingActionsMenu.f1372h.play(objectAnimator3);
                    str = "ۙۨ۬ۥۙۗۨۢۦۘۨۘۦۡۧۗۛۢۥ۫ۥۢ";
                    break;
                case 593563729:
                    str = "ۚۧۡۘ۫ۗۢۦۡۚ۫ۘۧۚۗ۬";
                    floatingActionsMenu = this.f1457f;
                    break;
                case 927970483:
                    objectAnimator4.setTarget(view);
                    str = "ۡۤۦۘۨۦۖ۬ۨۨۧۛۗۙۘۧۘۚۘۥۘۗۧۦ۠ۢ۠ۚۡ۬";
                    break;
                case 968969165:
                    objectAnimator3.setTarget(view);
                    str = "ۙۥۥۘۗۖۗۚۧۤۖۨۦۚۘۡۘ";
                    break;
                case 1209237079:
                    str = "ۨۤۨۘۘۡۛۤۜۘۨۜۧۤ۠ۛ";
                    break;
                case 1297104701:
                    animatorSet = floatingActionsMenu.f1371g;
                    str = "ۦۛ۠ۗۤۖۨۨۖۘۡۖۥۘۥ۠ۜۘ";
                    break;
                case 1545466700:
                    str = "ۙ۟۬ۧۦ۬۠ۡۛۧۙ۠ۦ۬ۛۨۛۥۥۢ";
                    break;
            }
        }
    }
}
