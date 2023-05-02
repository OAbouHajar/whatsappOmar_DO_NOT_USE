package com.obwhatsapp.youbasha.ui.YoSettings;

import android.content.Context;
import android.os.Bundle;
import android.widget.RadioGroup;
import androidx.appcompat.widget.Toolbar;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;
import m.g;

public class IconChoose extends BaseSettingsActivity {

    /* renamed from: c  reason: collision with root package name */
    public static final int f1197c = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f1198b = 0;

    public void attachBaseContext(Context context) {
        String str = "ۥۥۙۧ۟ۡۘۙۢ۠ۖۡ۬۠۠ۤۥۜۘ۟ۤۗۦۨ۟ۤۜ۟";
        while (true) {
            switch ((str.hashCode() ^ 694) ^ 1263442674) {
                case -1853956178:
                    return;
                case -819495802:
                    str = "ۥۗۤۡ۠۫ۦۚۨ۠ۨۜۢۧۚ۟ۛۗۙۧۨۘۤۗۦۘ";
                    break;
                case 1005851369:
                    str = "ۜ۬ۜۘۘۨۘۥ۠ۘۜۦۜۘۗۦۦۙۡۤۛۨۜۗۨۖ";
                    break;
                case 1942757863:
                    super.attachBaseContext(yo.getCtx());
                    str = "ۘۨۨۨۜۜۘۚۨۡ۠ۛۛۦۛۡۙۖۘ۬۟ۤۥۘۚۜ۬";
                    break;
            }
        }
    }

    public void onBackPressed() {
        String str = "ۦ۫ۨۘۖ۫ۥۚ۠ۧ۟ۨۛۛۗۙۛۙۡ۠ۧۖۙۤ۫ۖۥۤ";
        while (true) {
            switch ((str.hashCode() ^ 949) ^ -1290047920) {
                case -1109199721:
                    str = "ۛۘۛۦۨۦۘ۟ۛۘۘۚ۫۬ۖۤۗۧۡۖۘ۫ۥۡۘۖۖۨۘۤۜۚ";
                    break;
                case -572101620:
                    finish();
                    str = "ۢۗ۟۠۬ۗۖۦۜ۠ۡۤۙ۟۠";
                    break;
                case 135354343:
                    return;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        RadioGroup radioGroup = null;
        String str = "ۜۙۥ۫ۡ۠ۜۥۨۡۘ۟ۙۖۗۨۡۘۙۧۧۡۡۘ";
        while (true) {
            switch ((str.hashCode() ^ 942) ^ 444371645) {
                case -2103769405:
                    BaseSettingsActivity.configToolbar((Toolbar) findViewById(others.getID("acjtoolbar", "id")), this);
                    str = "ۤۥۨۘۦ۟۠ۚۨۜۘۢۥۘۜ۫ۢ۬ۜۡۘۨۨ۟ۡۨۘ";
                    break;
                case -1584234465:
                    this.f1198b = radioGroup.getChildCount() - 1;
                    str = "ۘۙۧۘۛۤۙۙۚ۠ۦۜۖ۟ۘۨۥۢۛ۬ۜۘۛۨۘۘ";
                    break;
                case -1352046500:
                    str = "ۦۗۡۡ۠۫ۙ۬ۜ۫ۚۙ۫ۢ۟";
                    break;
                case -354653079:
                    setContentView(others.getID("activity_icon_choose", "layout"));
                    str = "ۡۧۤۘۖۥۘۚ۬ۜۧۚۦۤۢۥۘۙۨۧۘ۠ۜۖۛۚ";
                    break;
                case 298845682:
                    super.onCreate(bundle);
                    str = "ۨ۠ۨ۬ۘۡۖۛۡۚۚۥۜۗۛۗۢۚۖۘۙ";
                    break;
                case 370074412:
                    return;
                case 1584145396:
                    radioGroup.setOnCheckedChangeListener(new g(this, radioGroup));
                    str = "ۗ۫ۘۢۤ۟۠ۙۨۘۥۥ۠ۗۧۦۘۚۛ۫ۤۧ۬";
                    break;
                case 1689446884:
                    str = "ۡۘۜۘۨ۬ۛۚۙۤۜۚۡۘۡۙۚ";
                    radioGroup = (RadioGroup) findViewById(others.getID("rGroup", "id"));
                    break;
                case 2061156920:
                    str = "ۧۚۖ۠ۘۙ۟ۛ۬ۧۖۜۘۛ۠ۧۚۡۢۡۡۗ";
                    break;
            }
        }
    }
}
