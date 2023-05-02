package com.obwhatsapp.youbasha.ui.YoSettings;

import android.os.Bundle;
import com.obwhatsapp.yo.yo;

public class ConvoPicsInChat extends BasePreferenceActivity {
    public void onCreate(Bundle bundle) {
        String str = "ۚۘ۟ۨۤۖ۟۬ۜۘۧۥۖۘۨۛۖۘۡۙۥۘ";
        while (true) {
            switch ((str.hashCode() ^ 165) ^ -2124190663) {
                case 32425387:
                    super.onCreate(bundle);
                    str = "ۤۖ۬ۦۘۧۘۜۛۤۤۛۨۘۘۖۥۘ۟۬";
                    break;
                case 595549906:
                    str = "۟ۧ۬ۨۢۗۤ۫ۛۨۘۗۨۤۨۘۗۥۧۘ";
                    break;
                case 731228894:
                    str = "ۙۡۧۦۨۛ۬۫ۘۘۦۖۨ۟۬ۤۛۤۨۨۚۖۧۘ";
                    break;
                case 1420214545:
                    setContentView(yo.getID("yo_settings_prefsview", "layout"));
                    str = "ۙ۫ۥۘۜ۠ۖۘۛۙۗۘۛۚۜ۫ۜ۠۠ۡۘۙۤ";
                    break;
                case 1561198552:
                    return;
                case 1705917050:
                    addPreferencesFromResource(yo.getID("yo_convo_picsinchat", "xml"));
                    str = "۟ۚ۬ۦ۠ۚۨ۟ۦۡۘۦۡۦۘۘ۫ۛ";
                    break;
            }
        }
    }
}
