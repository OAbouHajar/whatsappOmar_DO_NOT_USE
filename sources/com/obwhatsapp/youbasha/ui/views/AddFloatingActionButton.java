package com.obwhatsapp.youbasha.ui.views;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import com.obwhatsapp.yo.yo;

public class AddFloatingActionButton extends FloatingActionButton {

    /* renamed from: n  reason: collision with root package name */
    public int f1343n;

    public AddFloatingActionButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public AddFloatingActionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AddFloatingActionButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public final void c(Context context, AttributeSet attributeSet) {
        String str = "ۜۙۘۘ۬ۛۙ۫ۛۢۨۦۘۦۨۜۛۙ۠۟ۥۢ۬ۢۘۘ";
        while (true) {
            switch ((str.hashCode() ^ 990) ^ -81034194) {
                case -2076721440:
                    this.f1343n = -1;
                    str = "ۛۡۛۚۛۜ۫۬ۘۘۨۦۛۥ۟ۧۡۢۧ";
                    break;
                case -1842210145:
                    super.c(context, attributeSet);
                    str = "ۙ۠ۥۘۢ۠ۘۥۘۧۘۤ۫ۦۡۜ۫ۚۜ۟ۤۧۗ";
                    break;
                case -1298441897:
                    str = "ۨۥۦ۫ۘۨۘۨ۬ۙۙۨ۠ۥۥۦۖۡۘ";
                    break;
                case -952239172:
                    return;
                case 792353145:
                    str = "ۥۨۧۘۧۘۥۘۡ۟ۗۤۘۨۦۘ۟۠ۥۦۛۤ";
                    break;
                case 1840035525:
                    str = "۬ۡ۬ۗ۠ۦۘ۠۬ۦۧۘۨۘۤ۠۬";
                    break;
            }
        }
    }

    public Drawable getIconDrawable() {
        String str = "ۧۨۢ۫ۥ۫ۚ۠۫۠ۘۧۥ۟ۧ";
        Paint paint = null;
        ShapeDrawable shapeDrawable = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        while (true) {
            switch ((str.hashCode() ^ 742) ^ -970031094) {
                case -2053590180:
                    str = "ۤ۟ۡۦ۠ۘۧۖۦۚۡۨۘۧۙۢ۠ۚۥۘ۟ۖۥ";
                    f4 = b(yo.getID("fab_icon_size", "dimen"));
                    break;
                case -1788593633:
                    paint.setStyle(Paint.Style.FILL);
                    str = "ۨۤۧۨ۠ۛۢۙۖۙۡۤۦۨۜۘۧۚۦۛۥ۟";
                    break;
                case -1680277447:
                    paint.setAntiAlias(true);
                    str = "۟ۛۧۨۖ۟ۙ۬ۦۘ۠ۨۨۤ۬ۦۗۨۙ۠ۜۘۧۗ۫ۛۗۘۘ";
                    break;
                case -1588313866:
                    return shapeDrawable;
                case -792072312:
                    paint.setColor(this.f1343n);
                    str = "ۥۢۛۜۖۦۘۗۚۙۙۦ۫ۛۡ۫ۢۥ۫ۦۤ";
                    break;
                case -430726732:
                    str = "ۢۥ۟ۦۤۨ۟۬ۧۦۗۨۘ۬ۛۥۘۧ۟ۧ۫ۜۘۘۘۡۖۘ";
                    shapeDrawable = new ShapeDrawable(new a((f4 - b(yo.getID("fab_plus_icon_size", "dimen"))) / 2.0f, f3, f2, f4));
                    break;
                case -299473389:
                    str = "ۢۜۤۖۗۤۛۜۘۧۡۥۥۖۥۧ۠ۨۢ۫ۦۡۛۧ";
                    f2 = b(yo.getID("fab_plus_icon_stroke", "dimen")) / 2.0f;
                    break;
                case -33963824:
                    paint = shapeDrawable.getPaint();
                    str = "۟ۨۘۦۛۡۚۗۥۘۘۨ۟ۗۧۜۨ۬ۗۢ۫ۖ";
                    break;
                case 1157305323:
                    str = "ۥۧۚ۟ۦۘ۟ۗۦۘۛۧۦۘۥۖ۟۟ۦۡۘ۫ۡ۟ۧۚ۫۠ۢۛ";
                    f3 = f4 / 2.0f;
                    break;
                case 1548825151:
                    str = "ۘ۠ۦۘۥۥۥۘۜۛ۬ۦۚۖۡۡۙۢۦ۟ۨۢۚۤ۬۠ۨۡۥ";
                    break;
            }
        }
    }

    public int getPlusColor() {
        String str = "ۗۚ۫ۛۚۡۘۤ۠ۢۧۥۧۘۘۚۘۘۤۙۘ";
        while (true) {
            switch ((str.hashCode() ^ 849) ^ 278239899) {
                case 810773054:
                    return this.f1343n;
                case 1237273824:
                    str = "ۜۧۢۨۗۜۙۧۗ۟ۖ۟ۦۖۚۢۡ";
                    break;
            }
        }
    }

    public void setIcon(@DrawableRes int i2) {
        String str = "ۘۙۙۧۥۧۗ۠ۨۘۦ۫ۛۙۙۚۡۥۦۘۙۘۤ۟ۜۧۘۙۦۧۘ";
        while (true) {
            switch ((str.hashCode() ^ 107) ^ 559420265) {
                case -1710890791:
                    str = "ۥۜۖۘۢۘۘ۠۠ۜۘ۠ۚۗۙ۬ۦ۬۠";
                    break;
                case -1193828627:
                    throw new UnsupportedOperationException("Use FloatingActionButton if you want to use custom icon");
                case -60182577:
                    str = "۟ۢ۠ۚۚۜۘۛ۬ۖۙۖۛۡ۬ۧۘۡ۟ۗۦۖ";
                    break;
            }
        }
    }

    public void setPlusColor(int i2) {
        String str = "ۢۦ۫ۦۛۜۡ۫ۥۘۜۜۘۘۧ۫ۜۚۙۡ۫ۧۥ";
        while (true) {
            switch ((str.hashCode() ^ 141) ^ -871251919) {
                case -1934175138:
                    str = "ۙۗۦۘۗ۬ۖۘۜۛ۟ۦۚۥۧۥۖۘ";
                    break;
                case -705858140:
                    str = "ۤۧ۠ۢ۬۬ۤۨۘۡۥۖۗۧۚۡۨۚۡۜۖۘۥۧۙ";
                    break;
                case 617049364:
                    this.f1343n = i2;
                    str = "ۛۚۥۘۗۨۖ۟ۥۙۤۚۘۨ۠۬ۜ۬ۥۘۦۘۦۘۡۛۘۘ";
                    break;
                case 805894351:
                    d();
                    str = "ۛ۟ۧۧۨۢ۬ۘۥ۬ۛۘۨۙۜۛۡۘۡۢۡ۫ۡۛۥ۫ۘ";
                    break;
                case 1260135634:
                    String str2 = "ۤ۠ۥۘۦۙۡۗ۟ۦ۬ۥۖۘۚۡۥۘۡۗۗۢۥۘۧۡۢ";
                    while (true) {
                        switch (str2.hashCode() ^ 2020943579) {
                            case -1021629581:
                                str2 = "۫ۙۜۦۘ۫ۨۡۙ۠ۚ۠ۘ۬ۡ";
                                break;
                            case 921484219:
                                if (this.f1343n == i2) {
                                    str2 = "ۛۢۥۜ۠ۤۤۜۦۘۨۦۜۘۦۖۥۡ۠ۗۧۛ";
                                    break;
                                } else {
                                    str2 = "ۙۚۜۘۢ۫ۚۛۡ۫ۜۚ۫۫۟ۧۤۡۢۥۧۘ";
                                    break;
                                }
                            case 1010556807:
                                str = "ۘۛۨۘۨۘۜۖۙۦۖۗ۫۬۬ۜۤۥۥ";
                                continue;
                            case 2102205158:
                                str = "ۛ۟ۧۧۨۢ۬ۘۥ۬ۛۘۨۙۜۛۡۘۡۢۡ۫ۡۛۥ۫ۘ";
                                continue;
                        }
                    }
                    break;
                case 1440095844:
                    return;
            }
        }
    }

    public void setPlusColorResId(@ColorRes int i2) {
        String str = "ۖ۫ۙ۟۫ۡۖۖ۫۫ۘ۬ۜ۬ۧ۠ۙۡ";
        while (true) {
            switch ((str.hashCode() ^ 407) ^ -1591498009) {
                case -1442840916:
                    return;
                case -175591386:
                    str = "ۧۖۙ۠ۛۨۦ۬ۘۘ۫ۦۧۘ۟ۦۦۗ۠ۡۘۦۦۘۘۗۨۦ";
                    break;
                case 131179683:
                    setPlusColor(getResources().getColor(i2));
                    str = "ۙۡۧۘۗۙۙۨۡۖۘ۬ۖۙ۠ۦۘ";
                    break;
                case 2086250011:
                    str = "ۢۚۜۘۗۜۥۘۤ۟ۦۘ۟ۖۢۖۨ۬ۥۙۡۘ";
                    break;
            }
        }
    }
}
