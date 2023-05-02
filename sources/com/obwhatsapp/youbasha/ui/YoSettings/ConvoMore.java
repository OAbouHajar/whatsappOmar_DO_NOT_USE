package com.obwhatsapp.youbasha.ui.YoSettings;

import android.os.Bundle;
import com.obwhatsapp.yo.yo;

public class ConvoMore extends BasePreferenceActivity {
    public void onCreate(Bundle bundle) {
        String str = "ۗۦۖۘۖۖۥۥۢ۠۠ۤۜۛ۟ۜ۫ۖۙ۠ۗۧۘ۬ۖ";
        while (true) {
            switch ((str.hashCode() ^ 615) ^ -51077765) {
                case -449583764:
                    str = "ۧ۫ۖۘۦۗۛ۬ۙۥۘۚ۬ۧۘۗۜۢۨۦۘ۫ۥۘ";
                    break;
                case 108347277:
                    str = "ۙۧ۬ۙ۠ۨۘۥۚۗۚۤ۬ۘۛۖۘۚۤۨ۫ۘ۬۠ۘۦۘ۬ۢ۫";
                    break;
                case 231902073:
                    setContentView(yo.getID("yo_settings_prefsview", "layout"));
                    str = "ۨۚۙ۟ۢۥۧۢۥۘ۫ۥۘۘۜۖۘۦۖۨ۠ۙۙ";
                    break;
                case 449467974:
                    super.onCreate(bundle);
                    str = "ۙۨۙۖ۬ۡۛۡۘۧۦۗۗۨۘۤۡۨۘ۬ۤ";
                    break;
                case 1489395678:
                    return;
                case 1841960703:
                    addPreferencesFromResource(yo.getID("yo_convo_more", "xml"));
                    str = "ۚۚۦۡۥۥۘۥۤۨۘۗۙۥۘۗ۟۫";
                    break;
            }
        }
    }
}
