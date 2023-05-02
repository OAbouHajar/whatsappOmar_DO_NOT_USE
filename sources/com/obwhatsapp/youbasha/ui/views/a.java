package com.obwhatsapp.youbasha.ui.views;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.shapes.Shape;

public final class a extends Shape {

    /* renamed from: a  reason: collision with root package name */
    public final float f1432a;

    /* renamed from: b  reason: collision with root package name */
    public final float f1433b;

    /* renamed from: c  reason: collision with root package name */
    public final float f1434c;

    /* renamed from: d  reason: collision with root package name */
    public final float f1435d;

    public a(float f2, float f3, float f4, float f5) {
        this.f1432a = f2;
        this.f1433b = f3;
        this.f1434c = f4;
        this.f1435d = f5;
    }

    public final void draw(Canvas canvas, Paint paint) {
        String str = "ۛۗۦۘ۫ۗۥۛۤۙۥۡۖۘۘۙۙۥۗۖ۫ۤۗۛۖۡۘ۬ۘ۫";
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        while (true) {
            switch ((str.hashCode() ^ 61) ^ 765199446) {
                case -1187900826:
                    str = "۟ۨۛۢۧۢۥۨ۫ۡۧۢۧۚۖۘۤ۠ۗۖۗ۫ۦۥۡۘۡۦۚ";
                    f5 = this.f1433b;
                    break;
                case -968174059:
                    str = "۠ۜۜۤۗ۫ۤۥۢۤ۬۠ۦ۟ۤۡۘۛ۠۠";
                    break;
                case 57862424:
                    f6 = this.f1432a;
                    str = "ۧۚۖۘۗۥۦۘۧۗۘۘۙۜۤۖ۠ۨ۬۟۫ۖۘۦۙۚۢۜۤۨ";
                    break;
                case 357190658:
                    str = "۬ۦۡۨ۟۬ۤۛۦۧۘۢۛۤۨۛ۟";
                    break;
                case 552648380:
                    str = "ۗۗۘۘۨۙ۫۬ۡۚۛۥ۠ۛۥ۬ۨ۫ۛۛ۠ۥۘۛۥۘۤ۬ۡۘ";
                    f2 = this.f1432a;
                    break;
                case 651283066:
                    str = "ۜۢ۬ۨ۫ۤۜۖۡۘۜۘۥۤ۟ۢۚ۬۬ۜۨۙۨۘۜۗۧ";
                    f3 = this.f1435d;
                    break;
                case 714041672:
                    return;
                case 971076311:
                    str = "ۧۦۘۘۧ۟۬ۚۖۜۧۚۨۘۗۚۨۥۡۢۢۤۨۘۡۗۨ";
                    f4 = this.f1434c;
                    break;
                case 1059127427:
                    str = "ۢۘ۫۫ۥۡۘۡۚ۟ۖ۬ۖۨۜۦۘ۟ۡۨۘۨۧۦۘ";
                    break;
                case 1150779615:
                    canvas.drawRect(f5 - f4, f2, f4 + f5, f3 - f2, paint);
                    str = "۫ۤۦۘۛۙۥۢۢۘۘۙۜۡۘۥۗ۬۫ۤۜۖۖۢ";
                    break;
                case 1206457332:
                    canvas.drawRect(f6, f5 - f4, f3 - f6, f4 + f5, paint);
                    str = "ۧۨۨۡ۠ۛۢ۠۬۠ۧۨۨۥ۟ۘۖۧۘۨۤ۫ۨۘۤۘۡ";
                    break;
            }
        }
    }
}
