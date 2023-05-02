package com.obwhatsapp.youbasha.ui.activity;

import android.content.Context;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.widget.Toolbar;
import com.obwhatsapp.yo.shp;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;
import com.obwhatsapp.youbasha.ui.YoSettings.BaseSettingsActivity;
import j.f;

public class VoiceNoteSounds extends BaseSettingsActivity {

    /* renamed from: e  reason: collision with root package name */
    public static final int f1263e = 0;

    /* renamed from: b  reason: collision with root package name */
    public float f1264b = 1.0f;

    /* renamed from: c  reason: collision with root package name */
    public float f1265c = 1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f1266d = 1.0f;

    public void attachBaseContext(Context context) {
        String str = "ۨۢۥۘ۫ۙ۠ۧ۟ۖۘۦ۬ۗۧ۫ۢۥ۠ۗ";
        while (true) {
            switch ((str.hashCode() ^ 70) ^ -1976671160) {
                case -1827233754:
                    str = "۠۠۟ۢۜۖ۠۬۠ۦۦۨ۠ۘ۠";
                    break;
                case -1723144444:
                    return;
                case 1453970206:
                    str = "ۦ۠ۨۙۥۨۢۢ۫ۖۘۨۡۧۡ۬ۢۨۘۜۧۦۘ۬ۥۦۘۨۤۤ";
                    break;
                case 1456572953:
                    super.attachBaseContext(yo.getCtx());
                    str = "ۦۥۥۘۡۡۧۚۗۗۤ۬ۥۘۛۧۦۧۨۜۘۖ۬ۗ";
                    break;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        String str = "ۦۛۨۘۙۦۚۜۦۘۘۤ۫ۙۙۤۛۘۘۤۧۗۨۜۥۦ";
        RadioGroup radioGroup = null;
        Toolbar toolbar = null;
        while (true) {
            switch ((str.hashCode() ^ 355) ^ -1068158231) {
                case -2113338728:
                    radioGroup.setOnCheckedChangeListener(new f(this, 1));
                    str = "ۜۡۙۨ۟ۢ۠ۧۗۗ۠ۥ۠ۗۢ۫ۡۜۘۗۨ۟ۥۖۜ";
                    break;
                case -2075276195:
                    return;
                case -1837810808:
                    str = "۬ۤۚۧ۟۬۬ۡۖۘ۠ۙۙۥۙ۬ۧ۬ۢۜۡ۟۟ۧۡۘ";
                    radioGroup = (RadioGroup) findViewById(yo.getID("rGroup", "id"));
                    break;
                case -1401556525:
                    str = "ۖ۟ۜۜۤۧ۠ۜۖۘۦ۬ۜۘ۟ۛۤۙۙ۫ۘۢۜ۟ۛۙ";
                    break;
                case -957615804:
                    toolbar.setTitle((CharSequence) yo.getString("voicechanger"));
                    str = "ۜۖۥۘۘ۫ۜۛۨۚۖ۫ۚۥۥ۬ۗۗ۟ۦۦۨۘ۬ۛۘۨۘ";
                    break;
                case 48406458:
                    setContentView(others.getID("activity_voicenotesounds", "layout"));
                    str = "ۧۢۢۜۦۖۜۡ۬ۡۤۖۛۖ۬ۘۤۡ";
                    break;
                case 94978126:
                    BaseSettingsActivity.configToolbar(toolbar, this);
                    str = "۟ۜۚ۠ۦۥ۫ۥ۫ۦ۟ۘ۬ۡۧۘۦۙۘۘۥۡۜۘۙۥۛ";
                    break;
                case 287616063:
                    str = "ۥ۬ۘۡ۟ۨۘۚۥۢۤۚۥۢۤ۫۬ۙۡۙۢ۟ۨۨۘ";
                    toolbar = (Toolbar) findViewById(others.getID("acjtoolbar", "id"));
                    break;
                case 1227789936:
                    str = "ۨ۟ۨۘۗۨۘۘۨۥۘۘۘ۬ۥۥۦ۠";
                    break;
                case 1864765047:
                    ((RadioButton) radioGroup.findViewWithTag(shp.getStringPriv("voicenotechanger_current", "disabled"))).setChecked(true);
                    str = "ۘۙۥۢ۟ۖۡۤۡۙۤۗۥ۠ۙۨ۟ۦۦۤ";
                    break;
                case 2080127561:
                    super.onCreate(bundle);
                    str = "ۧۚۢۨۗۥ۬ۛ۫ۤۨۘۘ۬ۙۨ۟ۘ۬ۨۧ";
                    break;
            }
        }
    }
}
