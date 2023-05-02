package com.obwhatsapp.yo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Button;

@SuppressLint({"AppCompatCustomView"})
public class btn extends Button {
    public btn(Context context) {
        super(context);
    }

    public btn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16843087}, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        String str = "ۤۦ۟ۦۖۙۗۙۡۘ۠ۥۥۦۛۡۘ";
        while (true) {
            switch (str.hashCode() ^ 91080513) {
                case -1387423210:
                    str = "ۖۡ۠ۧۢۜۘۛۨۨۘ۬ۘ۫۫ۖۤۤۥۦۘۦ۟ۘۖۖۗ";
                    continue;
                case -1260391226:
                    break;
                case 336264879:
                    setText(yo.getString(resourceId));
                    break;
                case 1944362438:
                    if (!freqObfStringMapping.isFMString(resourceId)) {
                        str = "ۢۙۥۘۗۛۘۙۧۥۘۢۧ۟ۧۖۡۘۥۤ۬ۘۨ۟";
                        break;
                    } else {
                        str = "ۗ۬۠ۢ۠۠ۘۧۥۘۨۙۗ۬۟۬ۘۥۘۤۢۘۦۜۘ";
                        continue;
                    }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public btn(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16843087}, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        String str = "ۖۧۖۛۚۜۤۥۡۘۜۗۥۘۛۗۚۢ۬ۗ۟ۤۦۤۨ۠";
        while (true) {
            switch (str.hashCode() ^ 1544637223) {
                case -1679212326:
                    setText(yo.getString(resourceId));
                    break;
                case -809087217:
                    if (!freqObfStringMapping.isFMString(resourceId)) {
                        str = "۠ۨۡ۫ۡ۠ۖۡۦۚۥۥۘۤ۬ۧۢۗۥۘ۠ۤۜۘ";
                        break;
                    } else {
                        str = "۫ۥۘۨۡۥۘ۫ۖۧۘۥۧۛ۫ۥۜۘۤۜۛۨۛۚ۫۠ۥۧ";
                        continue;
                    }
                case -672898429:
                    break;
                case -366115816:
                    str = "۠۬ۡۢۜۘ۫ۡۖۜۗۖۥۢۗۚۡ";
                    continue;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
