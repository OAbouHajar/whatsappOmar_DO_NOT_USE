package com.obwhatsapp.youbasha.ui.views;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

public final class e extends LayerDrawable {

    /* renamed from: a  reason: collision with root package name */
    public final int f1448a;

    public e(int i2, Drawable... drawableArr) {
        super(drawableArr);
        this.f1448a = i2;
    }

    public final void draw(Canvas canvas) {
        String str = "۟ۢۥۘۦۨۡۗۤۡۘ۟ۖۨۢۦۖۘۛۨۧۘۚۗۦۘ";
        Rect rect = null;
        while (true) {
            switch ((str.hashCode() ^ 433) ^ 2022629521) {
                case -2097558409:
                    str = "ۨۗۤۚۨۖۘۙ۬ۚۥۙۖۤ۫ۜ";
                    break;
                case -827105131:
                    str = "ۥۨۦۢ۫۬ۡۛۚ۬ۨ۫ۜۨۜ";
                    break;
                case -190731877:
                    return;
                case 182417195:
                    super.draw(canvas);
                    str = "ۙۜۘ۬ۡۥۡۚۙ۠ۚۦ۫ۤ۫۟۫۬۫ۡۙ";
                    break;
                case 491171937:
                    str = "ۗۛۦۦۨۢۚۙۦۖۧۚۛۤ۬";
                    rect = getBounds();
                    break;
                case 684107363:
                    canvas.saveLayerAlpha((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom, this.f1448a, 31);
                    str = "ۙۧ۬ۙۢۢۤ۬ۦۘۙ۬ۥۙۨۧ۫ۢۥۜۥۘۨۗۘۘ";
                    break;
                case 1780810702:
                    canvas.restore();
                    str = "ۘۜۦۙۦۨۘ۫ۥ۠ۧۙۖۦۘۜۙۜۖ۟ۡۨۘۦۛۜ۫۠ۡۘ";
                    break;
            }
        }
    }
}
