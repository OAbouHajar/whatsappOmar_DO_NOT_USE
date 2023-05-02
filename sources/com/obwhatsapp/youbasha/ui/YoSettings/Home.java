package com.obwhatsapp.youbasha.ui.YoSettings;

import android.os.Bundle;
import android.preference.ListPreference;
import android.view.View;
import com.obwhatsapp.yo.yo;
import m.e;
import okhttp3.internal.http.StatusLine;

public class Home extends BasePreferenceActivity {

    /* renamed from: e  reason: collision with root package name */
    public static final int f1170e = 0;

    public void onCreate(Bundle bundle) {
        String str = "ۦۢۨۘۢۚۖۙۛۛۙ۫ۚ۠ۖۙ";
        View view = null;
        View view2 = null;
        View view3 = null;
        View view4 = null;
        CharSequence charSequence = null;
        CharSequence charSequence2 = null;
        CharSequence charSequence3 = null;
        ListPreference listPreference = null;
        while (true) {
            switch ((str.hashCode() ^ StatusLine.HTTP_TEMP_REDIRECT) ^ -1851233320) {
                case -1904278113:
                    str = "۬ۦۥۤ۠ۙ۟ۦۖۘۡ۟ۗ۠ۙ۬";
                    view3 = findViewById(yo.getID("modRows", "id"));
                    break;
                case -1644410082:
                    view3.setOnClickListener(new e(this, view3, 1));
                    str = "ۦۛۢۜ۬ۥۘۥۛۥۘۗۖۢ۠ۗۖۘ";
                    break;
                case -1334895462:
                    view4.setOnClickListener(new e(this, view4, 0));
                    str = "ۘۖۢۧ۠ۢۦۛۨۚۧۨۘۛۨۜۨۘ";
                    break;
                case -1194330404:
                    return;
                case -1046040562:
                    str = "ۨۚۦۥ۬ۖۚۨۧ۟ۨۘۖ۠ۜۤۖۗ۬ۥ۬ۙۛۦۘ";
                    break;
                case -868589313:
                    str = "ۜ۫ۖ۬ۖۚۦۥۥۘۙ۬ۡۘ۟ۧۨ۬ۡ۟ۢۡۖۘ";
                    break;
                case -668476991:
                    str = "ۜ۫ۖ۬ۖۚۦۥۥۘۙ۬ۡۘ۟ۧۨ۬ۡ۟ۢۡۖۘ";
                    charSequence2 = charSequence;
                    break;
                case -545049557:
                    str = "۫ۘۖۘ۟ۖۦۘ۫۠ۘۧۚۛۡۖۖ۟۬ۜۢۗۥۨۤ۫";
                    charSequence = listPreference.getEntries()[0];
                    break;
                case -449869266:
                    view.setOnClickListener(new e(this, view, 3));
                    str = "ۥ۬ۤۡۖۜۘۖۥۥۘۖۗۘ۬ۖۘۚۤۥۘۚۢۘۘۘۦۢ۬ۥۘ";
                    break;
                case 65652793:
                    str = "۟ۜۥۤۦۛ۬ۧۦۘۦ۫ۘۘ۠ۚۗۘۜۡۖۗۥۦۥۧۘ";
                    view4 = findViewById(yo.getID("header", "id"));
                    break;
                case 278697070:
                    view2.setOnClickListener(new e(this, view2, 2));
                    str = "ۢۡ۠۟ۛۤ۬ۙۡ۬ۧۜۖۚۧ";
                    break;
                case 341691371:
                    charSequence3 = listPreference.getEntry();
                    str = "ۛۧۦۜۡۘۡ۠ۛ۠۬ۡۖۚۤۥۨۦۘۨۗۧ۟ۙ";
                    break;
                case 432006714:
                    addPreferencesFromResource(yo.getID("yo_home_mods", "xml"));
                    str = "ۦ۬ۤۗۙ۫۠۫ۖۘ۫۠ۜۢۧۤۨۙۢ۟ۖۘ۟ۧ";
                    break;
                case 434480264:
                    super.onCreate(bundle);
                    str = "ۢۘۧ۫ۙۡۘۧۚۛۦۦ۠ۛ۫ۢۨۜۘۘ";
                    break;
                case 476356900:
                    view = findViewById(yo.getID("status", "id"));
                    str = "ۧۛۥۘۗۤۜۘۖۚۥۘ۠ۘۧۚ۬ۤۨۡۛۤ۠ۙ";
                    break;
                case 690213320:
                    str = "ۛۤۦ۠ۥۢۖۛۖۦۢۛۢۘۨۤ۠۠ۧۚۦۘ";
                    view2 = findViewById(yo.getID("modFab", "id"));
                    break;
                case 747271716:
                    str = "ۗۙۦۘۖۛ۠ۜۘ۬۬ۛۡۘ۫ۜ۬ۡۖۦۘۜۦۙۡۜۨۘۧۢۦۘ";
                    charSequence2 = charSequence3;
                    break;
                case 978141371:
                    listPreference.setSummary(charSequence2);
                    str = "ۚۚۢۦۙۦۘۛۥۚۙۗۡۜ۬ۜۘۧۘۦۨ۟ۧۖۛۨۘ۬ۨ";
                    break;
                case 1142892330:
                    String str2 = "ۚۨۤۛۥۥۗ۬ۥۨۧۜۘ۟۟ۙ۫ۡۖۦ۟ۦۘۡ۠ۦۗۜۘۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 1547656163) {
                            case -978743785:
                                if (listPreference.getEntry() == null) {
                                    str2 = "ۦۥۦۘۦۜۡۘۗ۬ۗۤۙ۠ۡۙۘ";
                                    break;
                                } else {
                                    str2 = "ۗ۫ۥۜ۫۬ۘۙۜۘۦۘۘۗۚۢ";
                                    break;
                                }
                            case -38264582:
                                str = "ۦۧۨۨۧۢۘۦ۠ۨۘۗ۟ۤ۫۠۫ۨۤۜ";
                                continue;
                            case 539308801:
                                str2 = "ۙۛۥۥۙۛۗۙۜۛۚ۫ۘۨۨۘ";
                                break;
                            case 1901006645:
                                str = "ۖۥۧۘۦ۠ۡۡ۫ۤۡۚ۟ۤۙ۠ۙ۫۫ۚۘ۟";
                                continue;
                        }
                    }
                    break;
                case 1563203972:
                    String str3 = "۬ۦۢۘۧۘ۠ۤۜۙۙۜۖۘ۠۬ۦۢۛ۠۬";
                    while (true) {
                        switch (str3.hashCode() ^ -453319346) {
                            case -1788071791:
                                str = "ۚۚۢۦۙۦۘۛۥۚۙۗۡۜ۬ۜۘۧۘۦۨ۟ۧۖۛۨۘ۬ۨ";
                                continue;
                            case 88120342:
                                if (listPreference == null) {
                                    str3 = "ۡۥۢۤۦ۟ۗۛ۫ۖۦۙ۠ۨۜۦۢۨۘ";
                                    break;
                                } else {
                                    str3 = "ۖۚ۬۟۟۠ۜۨۥ۬۫ۦۘۤۖۛۢ۫ۖۘۜۥۘۘۘۦۥ۠ۜۨۘ";
                                    break;
                                }
                            case 209932630:
                                str3 = "۟ۡۦۤۨۛۚ۬ۤ۫ۜ۠ۘۡۘۛۨۘۘۦۛۦۘ۫ۡۜ";
                                break;
                            case 224848733:
                                str = "۬ۨ۬ۦۛۚۢ۟ۙۖۡۥۘۜ۬ۖ";
                                continue;
                        }
                    }
                    break;
                case 1676513833:
                    str = "ۧۜۦۢۜ۟ۨۜۘ۠۟۬ۛۦۤۥ۬ۖۘ";
                    break;
                case 2022597091:
                    str = "ۖۜۧۘۧ۬ۤۧ۠ۖۘۧۜۦۡۡۚۤۛۥۨۡۨۘ۫ۗۦ";
                    listPreference = (ListPreference) findPreference("chats_show_contact_online_toast_location");
                    break;
                case 2035064435:
                    setContentView(yo.getID("yo_settings_home", "layout"));
                    str = "ۨۡۡۘۤۦۧۘۙۗۡۘۘ۠ۢ۫ۚ";
                    break;
            }
        }
    }
}
