package com.obwhatsapp.yo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.RadioButton;

@SuppressLint({"AppCompatCustomView"})
public class radiobtn extends RadioButton {
    public radiobtn(Context context) {
        super(context);
    }

    public radiobtn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16843087}, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        String str = "ۘۚۨ۠۫ۘۘ۬ۙۖۨ۫ۗ۟ۜۥۤ۬۟";
        while (true) {
            switch (str.hashCode() ^ 1408132978) {
                case -683088271:
                    setText(yo.getString(resourceId));
                    break;
                case 1614128685:
                    break;
                case 1770731161:
                    if (!freqObfStringMapping.isFMString(resourceId)) {
                        str = "ۡ۬ۘۥۧۘۧۡ۬ۗۥۙ۬ۙۥۘ۫ۤ۟۠ۗ۟ۢۧ۫۠ۙۥۘ";
                        break;
                    } else {
                        str = "ۥ۠ۘۘۜۖۡۘ۬۫ۢۨۗۖۘۧۘۘ";
                        continue;
                    }
                case 2141876668:
                    str = "ۡۦۖۘۜۤۦ۬ۖ۫ۚۨۗۦ۟ۜۘۨۘ۠ۗۜ۫ۢۜۘۦۥۖ";
                    continue;
            }
        }
        obtainStyledAttributes.recycle();
    }

    public radiobtn(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16843087}, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        String str = "ۘۤۛۤۧ۟ۢۗۖۘۡۜ۬ۛۤۢۙ۫ۡۢ۠ۛۧۢ۠ۗۧ۫";
        while (true) {
            switch (str.hashCode() ^ -553370002) {
                case -1816221058:
                    if (!freqObfStringMapping.isFMString(resourceId)) {
                        str = "ۢۤۨۘۖ۫ۘۨ۟ۜۛۜ۠ۙۖۧۘۘ۬ۜۗ۟۟ۦۨۢۥۢۥ";
                        break;
                    } else {
                        str = "۠۠ۘۘۙ۠ۘۘۡ۬ۚۤۡۜۘ۟ۖۚۜۜۘۜ۬ۜۘ۟ۡۗ";
                        continue;
                    }
                case -425557891:
                    break;
                case 295351694:
                    setText(yo.getString(resourceId));
                    break;
                case 741440062:
                    str = "۫ۜ۬ۙۘۘۘۧۚۡۘۛۥ۬ۘۘۗۢۡۗۥۦۚۜۨۦ";
                    continue;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
