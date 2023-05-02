package com.obwhatsapp.youbasha.ui.YoSettings;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.obwhatsapp.yo.WidgetProvider;
import com.obwhatsapp.yo.d;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;

public class YoWAWidget extends BasePreferenceActivity implements IPreviewScreen {

    /* renamed from: e  reason: collision with root package name */
    public View f1228e;

    public void initPreview() {
        String str = "ۖۤۤۦ۟ۡۘۨ۟ۨۨۘۢۗ۟ۨۘ";
        while (true) {
            switch ((str.hashCode() ^ 891) ^ -1973672705) {
                case -1670638843:
                    this.f1228e = findViewById(yo.getID("preview", "id"));
                    str = "۟ۦۦۘۜ۟ۨۘۘۢۡۗ۠۠ۢۨ۟۟ۡۖۘ";
                    break;
                case -1280979371:
                    return;
                case -45666501:
                    str = "ۡ۠ۜ۬ۛ۬ۖۥۚۥ۫ۦۘۨۖۗۨۗۦۛ۠ۗ";
                    break;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        String str = "ۘۗۗۦۗۗۚۢۦۘۙۙۡۘۧۙۥۘ۠ۜۘۖۜۦۘ۠ۙۥۘۦ۬ۨۘ";
        while (true) {
            switch ((str.hashCode() ^ 166) ^ 1913921523) {
                case -1642061640:
                    super.onCreate(bundle);
                    str = "ۦ۫۠۠۬ۨۘۦۜۘۘ۬۠ۜۘ۠ۤۗۥۦۖۛۛۙۚ۬ۘۘۤۜۡۘ";
                    break;
                case -645785:
                    addPreferencesFromResource(yo.getID("yo_widget_style", "xml"));
                    str = "ۚۚۖۦۚۥۢۨۘۖ۟ۥۘ۫۬ۦۡۦۙۦۛۥۘۙۨۧۤۗ۟";
                    break;
                case 256554599:
                    str = "ۖۢۥۘۡۦۘۘۥۥۙۛۜۚۖۨ۠ۘ۬ۖۗۙۚ";
                    break;
                case 523222507:
                    initPreview();
                    str = "ۦ۠ۥۘ۟ۢ۠ۘۗۤ۬ۘۖۛۗۘۘ۠ۜۧۘۨ۫ۧۘۨۧۘ";
                    break;
                case 838028245:
                    str = "ۙۦۖۘۛۘۡ۟۫ۜۘۗۢۖۘۙۗۡۗ۠۬ۤۚ۬ۡۚۦۘۤ";
                    break;
                case 1466009582:
                    setContentView(yo.getID("yo_settings_yowawidget", "layout"));
                    str = "ۡۤۡۘۗۙۗۤۨۢۙۡۖۘۥۤۨۧۤ۬ۢۖۙ";
                    break;
                case 1487987346:
                    return;
            }
        }
    }

    public void onPause() {
        String str = "ۙۨۜ۫ۙۤۢۨۗۛۜۘ۠ۡۖۘۦۧۨ۟ۚۦۡۘۥۘۚۨ۟";
        while (true) {
            switch ((str.hashCode() ^ 228) ^ 1635139647) {
                case -1474177815:
                    return;
                case 285190730:
                    str = "ۡۡۙۗۧۛۚۛ۠ۡۦۡۘۖۦۖۘۤۚ۬ۧ۫۠ۡۢۚ";
                    break;
                case 1407046307:
                    super.onPause();
                    str = "ۛۘۜۘۘ۫ۥۘ۟ۥۨۘ۠ۨۥۘۙ۫ۨۘۚ۬ۦ";
                    break;
                case 1859327961:
                    WidgetProvider.updateYoWAWidget(yo.getCtx());
                    str = "ۤۖۚ۫۬۬ۦ۠ۡۗۜ۟ۛ۠ۦۘ۠ۥ";
                    break;
            }
        }
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        String str2 = "۫ۖۗۘۤۛ۟ۦۦۗۨۘ۬ۜۧۘ";
        while (true) {
            switch ((str2.hashCode() ^ 378) ^ -1952914689) {
                case -1856079311:
                    updatePreview();
                    str2 = "۠ۘۥ۫۫ۖۘۧۧۚۤ۫ۖۚۡۡۖۨۦۘۚ۠۬ۧۧۖۘ";
                    break;
                case -325117450:
                    super.onSharedPreferenceChanged(sharedPreferences, str);
                    str2 = "ۘۥ۫ۖۨۡ۠ۡۧۘۢ۬ۚۘۗۡۦۢۤۖۗۨ";
                    break;
                case 159062311:
                    str2 = "۫ۡ۫ۦۧۜۨۘۨۘۥ۟ۖۘۦۖۤۦۜۜۘۙۘۨۘ";
                    break;
                case 626470539:
                    return;
                case 696482985:
                    str2 = "۟۠ۡۘۗۙ۠ۚۚۜۤۤۙۚۤۡۤۚۜۘ۠ۖۦۘۦۧۡۘۖۛۜۘ";
                    break;
                case 2027248738:
                    str2 = "ۜۧۡۢۧۗۢۚۡۘ۠ۗ۬ۛۦۖۘۤ۬ۡ";
                    break;
            }
        }
    }

    public void onStart() {
        String str = "۠ۚ۫ۛۦۜۨۖ۫ۡۡ۟۟ۦۦۘۥ۠ۘۡۜ۬ۧۙۨۘ";
        while (true) {
            switch ((str.hashCode() ^ 840) ^ -1438803842) {
                case -1892290937:
                    str = "ۛۛۘۘۢۗ۠ۢۦۘۖۨ۬ۢۚۙۢۧۚ۬۬ۜۤۚ۬ۢۛۦ";
                    break;
                case -1583109097:
                    IPreviewScreen.mHandler.postDelayed(new d(this, 12), 300);
                    str = "ۚ۫ۙۘۡۥ۠ۧۙۡۙۧۜۢۛۨۦۜۘ";
                    break;
                case -444838120:
                    super.onStart();
                    str = "ۙ۬۬ۜۥۨۖۛۥۙۦۨۘۗۜۜۘۛۗۨۘۙۦۘ۬ۘۘ۠ۙ۟";
                    break;
                case 928269832:
                    return;
            }
        }
    }

    public void updatePreview() {
        int i2 = 0;
        String str = "ۖ۬ۜۦ۬۫ۥ۫۬ۛۗۗۗۘۘۡۜۥ";
        Button button = null;
        TextView textView = null;
        TextView textView2 = null;
        View view = null;
        View view2 = null;
        while (true) {
            switch ((str.hashCode() ^ 725) ^ 600336770) {
                case -1609625008:
                    str = "ۖۚۛۨۨۢ۫ۗ۬ۚۜۛۜ۠ۡۘۙۡ۟ۚۜۖۘۛ۟ۡ";
                    break;
                case -731627144:
                case 128659242:
                    return;
                case -527271847:
                    view.setBackgroundColor(others.getColor("ModWdgBKColor", Color.parseColor("#66282828")));
                    str = "۟ۧۨۘۢۛۙۦۢۡۘۖۤ۫ۥۧۨۚۗۘ";
                    break;
                case -401553184:
                    textView2.setTextColor(others.getColor("ModWdgTitleColor", -1));
                    str = "ۚۘۘۗۢۛ۠ۢ۫ۙۛۧ۫ۛ۬ۡۦۢ۟ۧۗ۫ۥۛۨۜۘ";
                    break;
                case -170573578:
                    str = "۫ۧۢۥۛۨۘۧۧۦۦۖۚۜۥۥ";
                    view2 = this.f1228e;
                    break;
                case -136919994:
                    str = "ۙۖۡۘۢۡۚۤ۟۟ۚۦۧۘ۟۠ۦۜۜۖۨۜۘ";
                    textView2 = (TextView) view.findViewById(others.getID("wdg_title", "id"));
                    break;
                case 79590009:
                    str = "ۗۖ۠ۜۜۨۘۨۤۤۢۙۖۘۧۘۛۡۙ۠";
                    button = (Button) view.findViewById(others.getID("wdg_utils", "id"));
                    break;
                case 907324710:
                    button.setTextColor(i2);
                    str = "۫ۦۜۤۤۘۘۨۡۡۨۨۛ۫۫ۖۘۛۙۗۧۜۜ۠۬";
                    break;
                case 981841499:
                    String str2 = "ۦ۟ۢ۟ۨۘۘۥۨۨۙۙۘۘۙۡۚۥۙۡۢۙۖۘ۟۫۬";
                    while (true) {
                        switch (str2.hashCode() ^ -835893358) {
                            case -2086874015:
                                str2 = "۠۠ۘۘۥۨۡ۫ۙۦۡۙۡۘ۬ۛۤۤۚۧ";
                                break;
                            case -1391548376:
                                str = "ۛۧۚۜۜ۟۟۠۬ۨۜۜۧۡ۫ۨۢۢ";
                                continue;
                            case 846700587:
                                if (view2 != null) {
                                    str2 = "ۥ۟ۨۧۚۘۤۥ۫ۢۥ۫ۖۘۗۚۤۦۨۗۦۙۖۖۘ";
                                    break;
                                } else {
                                    str2 = "ۛۨۜۗۛۙۗۦۛۢۨۤ۬ۤۜۥ۫ۦۢۡ";
                                    break;
                                }
                            case 1511915703:
                                str = "ۗۛۖۘۨ۟ۘۘۨۦۘۧ۫ۥۘ۫ۜ۬ۘۦۥۘۜۢۗۜۘۢ";
                                continue;
                        }
                    }
                    break;
                case 1103214887:
                    this.f1228e.invalidate();
                    str = "ۖ۫ۧۖۡۢۛۚۢۘۢۚۧۗۖۘ۟ۛۖۨۨۤۜۛۨۢۤۦۘ";
                    break;
                case 1113260974:
                    str = "۟۫۠ۦۚۦۘۦۢۜۘۨۨۡۘ۠ۤۘۘۖۜۨۡۛۥۘۥۤۥۗۦۡ";
                    textView = (TextView) view.findViewById(others.getID("wdg_status", "id"));
                    break;
                case 1216638057:
                    textView.setTextColor(i2);
                    str = "ۚۜۡۘۗۛ۟ۗ۫ۥۙ۬۫ۢۧۚۥ۟ۚۨۛۡۘۦۙ";
                    break;
                case 1500547720:
                    i2 = others.getColor("ModWdgStatusColor", -1);
                    str = "ۙۢۧۡ۠ۦۘۥۧۛۙۘۦۢۤۜۚۙۖۘ";
                    break;
                case 1996920658:
                    str = "ۨۗۢۤۘۨۚ۟ۨۗۜۥۘۥۜۡۧۤۜۘ۟ۥۖۘ";
                    view = view2.findViewById(others.getID("wdg_layout", "id"));
                    break;
            }
        }
    }
}
