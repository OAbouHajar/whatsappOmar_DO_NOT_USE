package com.obwhatsapp.youbasha.ui.YoSettings;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.obwhatsapp.yo.d;
import com.obwhatsapp.yo.shp;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;

public class HomeStatus extends BasePreferenceActivity implements IPreviewScreen {

    /* renamed from: e  reason: collision with root package name */
    public View f1195e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f1196f;

    public void initPreview() {
        String str = "ۡۢۥۘۖۙۖۨۘ۬ۤۨۥۘۚۛ۬";
        TextView textView = null;
        TextView textView2 = null;
        View view = null;
        while (true) {
            switch ((str.hashCode() ^ 228) ^ -859839557) {
                case -1846918408:
                    str = "ۜۡۧۖۥۖ۫ۘۤۘۥۛۖ۟ۨ";
                    textView2 = (TextView) this.f1195e.findViewById(yo.getID("contact_name", "id"));
                    break;
                case -1228820376:
                    this.f1196f = (TextView) this.f1195e.findViewById(yo.getID("title", "id"));
                    str = "ۘۥۖۘۜۧۜۘۜۘ۠ۦۗۖۘۜۨۨۥۜۜۘۜۧ۫ۦۙۖۘ";
                    break;
                case -1199795170:
                    textView.setTextSize(2, (float) (shp.getPrefInt("main_text", 17) - 2));
                    str = "ۨۗۙۖۖۦۘۥۜۥۘۢۚۘۘۢۨ۟ۛۚۘۘۦۤۘۡ۬ۡ";
                    break;
                case -785676692:
                    str = "ۗ۫ۢۛۙۥۘ۫ۤۡ۟۠ۜۗۙۘ۫ۜۦۘ";
                    textView = (TextView) this.f1195e.findViewById(yo.getID("date_time", "id"));
                    break;
                case -164708664:
                    str = "ۚ۬۬۠۬ۨۘۤۤۘۘۙۙۨۘ۫ۥۚۛ۟ۥۙ۟ۦۚۡ۟ۖۗۚ";
                    break;
                case 577795119:
                    textView2.setTextSize(2, (float) (shp.getPrefInt("main_text", 17) + 0));
                    str = "ۘۗۥ۟ۘ۠۠ۡ۟ۗۢۧۚ۠ۙۖۖۧ";
                    break;
                case 613675685:
                    str = "ۥۤۧۚ۬۟ۛ۟ۨۖۤۚۙۘۛۗ۠۟";
                    view = findViewById(yo.getID("preview", "id"));
                    break;
                case 961728583:
                    others.MainBKC(view);
                    str = "۫ۙۘ۠ۥۜۚۦۧۘ۫ۥۥ۟ۖۘۖۜۢۤ۠ۘۖ۫ۖۘۡۥۜۘ";
                    break;
                case 1146611704:
                    others.setMainTVColor(textView);
                    str = "ۥۢۤ۫ۥۧۘ۠ۙۧ۬۫ۜۢ۬ۙ۫ۡۜۦۙ۬";
                    break;
                case 1224076553:
                    return;
                case 1686576476:
                    others.hContactName(textView2);
                    str = "ۖۛۢۜۡۘۧۢۥۘۥۡۤ۬ۙۤۡ۟ۦۘۖ۟ۜ";
                    break;
                case 1996212024:
                    this.f1195e = view;
                    str = "ۛۙۘۘۘۖۗ۠ۗ۬۟ۖۢۦۥۢۧۡۗ۫ۖۖۘ";
                    break;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        String str = "ۚۥ۟ۡ۬۠ۙۤۗۡۦ۠ۢۜۦۘ";
        while (true) {
            switch ((str.hashCode() ^ 387) ^ -565403044) {
                case -1479950128:
                    super.onCreate(bundle);
                    str = "ۥۘۥۥۗۖۜۥۙۖۧۨۘۨۚۗۜ۠ۚ";
                    break;
                case -638234061:
                    return;
                case 302024879:
                    setContentView(yo.getID("yo_settings_homestatus", "layout"));
                    str = "ۚۘۘۡۡۤۜۤۢ۟ۛۛۗۥۧۘ۬ۢۦۘۙۦ۫";
                    break;
                case 620991715:
                    initPreview();
                    str = "ۗۦۥۤۙ۬ۛۜۦۘۤ۬ۚۚۖۦۘ";
                    break;
                case 669049463:
                    addPreferencesFromResource(yo.getID("yo_home_status", "xml"));
                    str = "۟ۜۘۘ۫ۦۛۤۘۖۘۡۧۢ۬ۥۦۗۘۖۘۨۛۜۘ";
                    break;
                case 940934129:
                    str = "ۨۡۤ۟۫ۨۘۘ۟ۦۘۘۦۢ۬۫ۥ۬ۤۖۛ۫ۨۘ۬ۢۛ۬۠ۜ";
                    break;
                case 1177441475:
                    str = "ۧۗۥۘۤ۫ۖۘۙ۬ۘۧۦۥۖۡۦۘ۟ۗۜ۬ۘۤ۠ۤۖۘۘ۠ۚ";
                    break;
            }
        }
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        String str2 = "ۤۖۘۘ۟ۢۖۘۥۧۘۗۧ۫۫";
        while (true) {
            switch ((str2.hashCode() ^ 621) ^ -482158973) {
                case -2089825059:
                    updatePreview();
                    str2 = "ۦۜ۟ۚۡۚۧۗۧ۟ۙۛۨۨۦ";
                    break;
                case -1302350516:
                    super.onSharedPreferenceChanged(sharedPreferences, str);
                    str2 = "ۘۡۨ۬ۗۥۘۦۨ۫ۢۜ۟۬";
                    break;
                case -84332450:
                    str2 = "۫ۘۛۡۖۖ۟ۘۖۦۘ۫ۤۗۘۘ";
                    break;
                case 297953505:
                    str2 = "ۖۧ۫ۦۖۢۤ۟۫ۙۥ۬ۢۘۛۙۦۘۜۦۢۙ۟ۦۘۡۖ۫";
                    break;
                case 636053786:
                    str2 = "ۙۤ۟ۛۘۗۖۚۡ۬۫ۨۤۢۚۘۡۘۘۛۖۗۘۛۜ";
                    break;
                case 964869084:
                    return;
            }
        }
    }

    public void onStart() {
        String str = "۟ۡۡۛ۠ۥۤۚ۫ۡۨۙۤ۟ۢ";
        while (true) {
            switch ((str.hashCode() ^ 342) ^ -769555601) {
                case -2042690431:
                    IPreviewScreen.mHandler.postDelayed(new d(this, 10), 300);
                    str = "۟۟ۘۙۗۥۦۖۚ۟۟ۚۡۜۛۧۘۘ۬ۜۛ";
                    break;
                case 580522288:
                    str = "ۧۜۧۛۗۨۛۥۘۥۧۤۗۤۤ";
                    break;
                case 977231888:
                    super.onStart();
                    str = "۠ۚۜۗ۟۫ۥۘۡۢۗۥۘۗۤ۠ۨۛۨۘۡۦۨۘۙۡ۟ۢۤۛ";
                    break;
                case 1945317436:
                    return;
            }
        }
    }

    public void updatePreview() {
        String str = "۬ۥ۫ۥۗۥ۬ۚ۠۬ۦۘۙۖۘۛ۟ۦۘۨۚۥۘۜ۟ۥۘ";
        while (true) {
            switch ((str.hashCode() ^ 551) ^ 111683554) {
                case -1497745569:
                    return;
                case -1178841542:
                    str = "ۘۥ۠ۘۜۜۨۚۡۛۦۖۘۛۗۡۢۖۡۜۗ";
                    break;
                case 1783433535:
                    others.statusViewSeparator((FrameLayout) this.f1196f.getParent(), this.f1196f);
                    str = "ۛۦۨ۟ۚ۠ۥۜۡۘۜۖۡۥۜۦۘ";
                    break;
            }
        }
    }
}
