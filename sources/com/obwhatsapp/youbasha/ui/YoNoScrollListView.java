package com.obwhatsapp.youbasha.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;

public class YoNoScrollListView extends ListView {
    public YoNoScrollListView(Context context) {
        super(context);
    }

    public YoNoScrollListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public YoNoScrollListView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    @TargetApi(21)
    public YoNoScrollListView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        String str = "ۡ۠ۖۘ۠۫ۜۘۨۨۙۥۡۘۦۦ۠ۛۢۜۘۜ۟ۥۘۧۥ۫ۢۘۖۘ";
        while (true) {
            switch ((str.hashCode() ^ 484) ^ -1958065776) {
                case -1464036208:
                    str = "۠ۤۛۡۨۧ۫ۗۖۗۜ۟۠ۚ۠۟ۙۨ";
                    break;
                case -1178202392:
                    super.onLayout(z2, i2, i3, i4, i5);
                    str = "ۗۦۤۜ۫ۚۖۙۢۙۧۦۘ۟ۙۖۘ";
                    break;
                case -1123647700:
                    str = "ۢۥۦۘ۠ۖ۫ۛۙۜۤۗۜۘۛ۬ۦۢۗۦۢۘۖۢۨۧۘ";
                    break;
                case 685915158:
                    str = "ۤۚ۫ۖ۠ۦۘۛ۬ۛۖۢۥۘۢۢۘۘ";
                    break;
                case 885663089:
                    return;
                case 1233161045:
                    str = "ۘ۬ۜۘۢۥ۟ۖ۠ۖۘۜۚۥۘۦۡۗۚ۬۫ۤۨۡۘۤۖ۠ۥۛ۟";
                    break;
                case 1552147610:
                    str = "۫ۛۛۦۥۡۘۥۧۘ۠ۖۨۘۤۤۜۘۙۖۘ";
                    break;
                case 2011334403:
                    str = "ۦۚۘۧۜۥۘ۫ۥۨ۠ۜۡۘۡ۫ۡۡۤۤۚۘ۟";
                    break;
            }
        }
    }

    public void onMeasure(int i2, int i3) {
        String str = "ۘ۫ۗۖۙۙۥۛۡۘۧۨۥۘۛۨ۫ۜ۬ۧۤۦۘ";
        while (true) {
            switch ((str.hashCode() ^ 669) ^ 1569266495) {
                case -1913519900:
                    str = "ۨ۬ۦۖۨۘۘ۠ۜ۟ۙۙۨۘۦۛۖۘۖ۟ۡۧ۬ۘۘ۫۬ۨ";
                    break;
                case -1183084272:
                    return;
                case -500916008:
                    getLayoutParams().height = getMeasuredHeight();
                    str = "ۦ۬ۛۡ۟ۦۘ۫ۤ۟ۢۖۜۛۧۦۘۗ۠۠";
                    break;
                case 321846786:
                    str = "ۨۘۥۘۛ۬ۖ۠ۥۙۗۚۦۘ۫ۛۥۘ";
                    break;
                case 545948552:
                    str = "ۛۧۤۙۨۘۥۡۘۘ۠۫ۗ۬۠ۥۨۙۡۘۛۘۨۘۖ۫ۢ";
                    break;
                case 1504926440:
                    super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
                    str = "ۛۘۛۖۨ۫ۨۚۨۚۥۦۘۢۧۛ۠۠ۛۖۖۗ";
                    break;
            }
        }
    }
}
