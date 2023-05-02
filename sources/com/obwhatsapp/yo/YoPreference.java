package com.obwhatsapp.yo;

import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;

public class YoPreference extends Preference {
    public YoPreference(Context context) {
        super(context);
    }

    public YoPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String str = "۬۫ۥۘۜ۫ۙۗ۠ۚۜۤۙ۫۟۫ۧۚۖۢۥۡ";
        while (true) {
            try {
                switch (str.hashCode() ^ 1535301745) {
                    case -1453512265:
                        return;
                    case -892414933:
                        if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res-auto", "WaString", false)) {
                            str = "ۙۡۜۘ۫ۙ۬ۦۚۙۧۙۥۜ۫ۙۥۢۛ۬ۖۥۘۜۖۙ";
                            break;
                        } else {
                            str = "ۧۖ۬ۥۢ۫ۖۡۜۘۧۛۦۘۘۥۚ۟ۘ۬ۡۥۖ۟۫ۦۘ";
                            break;
                        }
                    case -617929458:
                        int attributeResourceValue = attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "title", -1);
                        String str2 = "۠ۛۚۡۦۜۘۤۗۗۢۡۙۡۥ";
                        while (true) {
                            switch (str2.hashCode() ^ -1848508095) {
                                case -1429693988:
                                    break;
                                case -416641093:
                                    if (attributeResourceValue != -1) {
                                        str2 = "ۗۢۖۘۘۖ۬ۖۦ۬ۧ۠ۧ۠ۖۙ۟۬ۦ۠ۛۙ۬۬۠ۡۡ";
                                        break;
                                    } else {
                                        str2 = "ۤۨۙ۬۟۠۫ۨۜۘ۟۬ۢۥۡۘۙۨ۠ۗ۬ۜۘۦۨۧۘ";
                                        continue;
                                    }
                                case 1156022589:
                                    setTitle(yo.getString(attributeResourceValue));
                                    break;
                                case 1926218762:
                                    str2 = "ۡ۟ۥۘ۬۠ۗۥۚ۠۬۟ۚۧۨ۠ۢۦۜۘۤ۫ۦۘۦ۫۫";
                                    continue;
                                default:
                                    continue;
                            }
                        }
                        int attributeResourceValue2 = attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "summary", -1);
                        String str3 = "ۡۨۧ۬ۚۥۗۘۧۗۗۡۛۖۘ۫ۥۨۖۜۘۘۨۥۖۘ۠ۧۥ";
                        while (true) {
                            switch (str3.hashCode() ^ -690763910) {
                                case 89763660:
                                    if (attributeResourceValue2 == -1) {
                                        str3 = "ۢۤۗۤۨۢۡۙ۟ۚۧۥۘۤۥ";
                                        break;
                                    } else {
                                        str3 = "ۡۧۡۘ۟ۛ۫۫۬۟۟ۡ۠ۢۚۢ۬ۡۛۙۗۤۗۤۡۡۜۖۘ";
                                        break;
                                    }
                                case 149210595:
                                    str3 = "ۗۢ۟ۘۙ۠ۖۡۜۦ۬۟۠ۗ";
                                    break;
                                case 1294433168:
                                    setSummary(yo.getString(attributeResourceValue2));
                                    return;
                                case 1611580581:
                                    return;
                            }
                        }
                        break;
                    case 1147065277:
                        str = "ۧۨ۬ۙۙۡۘۨۛۨ۟ۨۥۘۗۧۜۤۨۧۘۨ۟۬ۨۧۘۘۙۖ";
                        break;
                }
            } catch (Exception e2) {
                return;
            }
        }
    }
}
