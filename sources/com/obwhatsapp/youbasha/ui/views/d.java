package com.obwhatsapp.youbasha.ui.views;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;

public final class d extends ShapeDrawable.ShaderFactory {

    /* renamed from: a  reason: collision with root package name */
    public final int f1443a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1444b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1445c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1446d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1447e;

    public d(int i2, int i3, int i4, int i5, int i6) {
        this.f1443a = i2;
        this.f1444b = i3;
        this.f1445c = i4;
        this.f1446d = i5;
        this.f1447e = i6;
    }

    public final Shader resize(int i2, int i3) {
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        Shader.TileMode tileMode = null;
        String str = "ۘۖۖۜۛۥ۬ۨۡۘۤۗۚۛۧۥۘۡۤۚ";
        int i7 = 0;
        int i8 = 0;
        while (true) {
            switch ((str.hashCode() ^ 913) ^ 1309242989) {
                case -1752219016:
                    str = "۠ۤۨۛۦۘۥۚۧۛۘۢۤۧۚۡۙۖۘ";
                    i7 = this.f1447e;
                    break;
                case -1748463999:
                    str = "ۘ۠ۧۙۤۦۤۙۡۢۛۡۘ۟ۧۦۘۘ۠ۦۘ";
                    break;
                case -708284184:
                    str = "ۦ۫ۥۘۛۙۗۥۜۢۚۛۗۥۚۢۛۚۨۨۨۡ";
                    break;
                case -685194747:
                    str = "ۤۨۚ۠۠ۥۘ۟ۜۦ۬ۡۖۜۖۨۘۦۜۡۘۖ۟۟";
                    i4 = this.f1443a;
                    break;
                case -383181347:
                    str = "ۨ۫۫۫ۗۖۘۤۖۧ۫ۨۜۘ۫۠ۜۗۖۡۥۨۗۚۘ۟۟ۧۜۘ";
                    i8 = this.f1446d;
                    break;
                case -290728978:
                    str = "ۗۗۜۙۗۚۚۛۛۦۥۦۖۨۚۦۘۧۘۢۥۜۥۧ";
                    break;
                case -204086650:
                    str = "۠ۖۤۗۜۧۘۨۙۖۨۘۥۘۗۗۥ";
                    i6 = this.f1445c;
                    break;
                case 697376133:
                    f2 = (float) (i2 / 2);
                    str = "ۙۛۛۨۡۜۘۚۗۨ۫ۦۥ۟ۖۤۘۗ۟۠ۜ۟ۗۗۗۢۖۙ";
                    break;
                case 878896777:
                    tileMode = Shader.TileMode.CLAMP;
                    str = "ۤ۬ۦۥۢۚۨۛۛۥ۬ۤۖۗۦۛۜۥۘ";
                    break;
                case 1440705005:
                    f3 = (float) i3;
                    str = "ۤ۫ۨۚۘۜۘۢۗۤۗ۫ۙ۠ۨۦۘۗ۟ۥۘۚ۠ۥ";
                    break;
                case 1736902489:
                    return new LinearGradient(f2, 0.0f, f2, f3, new int[]{i4, i5, i6, i8, i7}, new float[]{0.0f, 0.2f, 0.5f, 0.8f, 1.0f}, tileMode);
                case 1768640866:
                    str = "ۚۛۥۧۦۜ۬۬ۦۛۚۖۥۙۘ";
                    i5 = this.f1444b;
                    break;
            }
        }
    }
}
