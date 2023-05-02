package com.cat.ereza.customactivityoncrash.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import c.a;
import c.b;
import c.c;
import com.cat.ereza.customactivityoncrash.CustomActivityOnCrash;
import com.obwhatsapp.yo.yo;

public final class DefaultErrorActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    public static final int f219a = 0;

    public void onCreate(Bundle bundle) {
        String str = "ۧۥ۫۬۟ۡۘۥۤۥۘۗۡۨ۬ۙ۟۬ۨ۟ۧ۬ۢ";
        int i2 = 0;
        Button button = null;
        CustomActivityOnCrash.EventListener eventListener = null;
        Class<? extends Activity> cls = null;
        Button button2 = null;
        while (true) {
            switch ((str.hashCode() ^ 772) ^ -111179235) {
                case -1940783675:
                    button2.setOnClickListener(new b(this, eventListener, 0));
                    str = "ۦۛۛۧۧۡۘۦۧۧ۠ۛۙۡۢۨۤ۠ۗۛۛۚ";
                    break;
                case -1742357306:
                    String str2 = "ۢۥۦۦۚۨۙۛۖۘۧۚۡۘۙۜ۠";
                    while (true) {
                        switch (str2.hashCode() ^ -94545041) {
                            case -1736098302:
                                str2 = "۟۬ۡ۫ۦۢ۬ۗۗ۫ۤۗۜۜۢۧ۬۫ۘ۫ۙۦۤۢ۟ۦۗ";
                                break;
                            case -622849103:
                                str = "ۚۖۦۘۢ۟ۡۢۖۨۘ۫ۜۨۥ۫ۦۘ۠ۥ۫ۙۘۦۘۖ۫ۛۤۨۤ";
                                continue;
                            case 1385617713:
                                if (cls == null) {
                                    str2 = "ۚ۟ۥۘۤۘۖ۬ۧ۟ۗۛۖۛۤۢۨۥۘۘ";
                                    break;
                                } else {
                                    str2 = "ۦۨۚ۠ۡۘۘۤۜۚۢۘۖۘۨۖۦۘ۬ۖۖۘ";
                                    break;
                                }
                            case 2000067686:
                                str = "۫ۧۚۜ۫ۜۖۨۙۦۧ۟ۧۖۥ۬۠ۖ۠ۛۥۘۚۚۖ";
                                continue;
                        }
                    }
                    break;
                case -1573225392:
                    ((ImageView) findViewById(yo.getID("customactivityoncrash_error_activity_image", "id"))).setImageDrawable(getResources().getDrawable(i2, getTheme()));
                    str = "ۧۧۗ۫ۖۦ۫ۡۙۛۜ۠ۡۙۡۘ۟ۧۦ";
                    break;
                case -1395505834:
                    return;
                case -1354584032:
                    str = "ۘ۬۟ۡۙۙۖ۟۟ۘۥۦ۟۠۫ۡۥۘۙۡۥۘ";
                    cls = CustomActivityOnCrash.getRestartActivityClassFromIntent(getIntent());
                    break;
                case -1136550712:
                    str = "ۙۗۡۘۤۨۚۦۦۖۘۘۚ۟ۧ۠ۥۚ۫ۛۛۗۛۖۧ۟";
                    button = (Button) findViewById(yo.getID("customactivityoncrash_error_activity_more_info_button", "id"));
                    break;
                case -801842753:
                    i2 = CustomActivityOnCrash.getDefaultErrorActivityDrawableIdFromIntent(getIntent());
                    str = "ۘۖۜۘۛۙۙۤۙۢۧۢۥۧۡۨ۠ۧۡۘۦ۬ۛۡ۠ۡۘ۟۫";
                    break;
                case -214159418:
                    str = "۫ۗۘۘ۬۟۟ۗۡۢۤۖ۫ۙۘۚ۫ۗۧۖۢۧۙۦۦۘ";
                    break;
                case -90568807:
                    button2.setOnClickListener(new a(this, cls, eventListener, 0));
                    str = "ۖۖۘۙۦۙۤۥ۬ۡۚۧۙۦۘۡ۟ۜۘۛۦۛ";
                    break;
                case 123738590:
                    setContentView(yo.getID("activity_customcrash", "layout"));
                    str = "ۜۗۨۘۡۢ۫ۗۘۖۤۨۚۨۡ۬";
                    break;
                case 390420935:
                    str = "ۗ۠ۥۗۛۜۤۖۢۖۧۜۚۢ";
                    eventListener = CustomActivityOnCrash.getEventListenerFromIntent(getIntent());
                    break;
                case 392534127:
                    button.setVisibility(8);
                    str = "۫ۡۚۦ۠ۢۙ۟۠ۧۥۨۛ۬۬ۗۗۡ۬ۢۦۖۦ۬";
                    break;
                case 1023995936:
                    super.onCreate(bundle);
                    str = "ۢۦ۟ۜۧۦۥۙۘ۫ۨۡۜۤۨۘۥۘۖۘۧۧ۬ۙۨۘۙۦۨۘ";
                    break;
                case 1309158706:
                    str = "۫ۡۚۦ۠ۢۙ۟۠ۧۥۨۛ۬۬ۗۗۡ۬ۢۦۖۦ۬";
                    break;
                case 1398663503:
                    button2.setText("Restart App");
                    str = "ۖ۫۟ۖۡۜۘۗۤۥۦۖۡۘۖۜۡۖ۫۟ۘۤۖۘۦۖۛ";
                    break;
                case 1406782319:
                    button.setOnClickListener(new c(this, 0));
                    str = "ۢ۫۠ۡۚۖۘۙۘۖۘۥۘۘۜۛۜ";
                    break;
                case 1612141726:
                    String str3 = "۬ۢۙۢۦۡۘ۠ۡۦۤ۫ۗ۫۠ۜۘۖۗۥۡۢۜۘ";
                    while (true) {
                        switch (str3.hashCode() ^ 714452841) {
                            case -1729203346:
                                str = "ۦۡۤۢۘۤۜۖۘۘۧۛۧۗ۬ۡۧۥ";
                                continue;
                            case 544885181:
                                str3 = "ۘۙۗۗۨ۫ۨۚۥۖ۟ۘۤۗۜۘۨۨۘ۠ۨۥۘۡۗۛۡۨۦ";
                                break;
                            case 977423534:
                                if (!CustomActivityOnCrash.isShowErrorDetailsFromIntent(getIntent())) {
                                    str3 = "ۢۨ۠ۤۡ۠۟ۙۘۘۙ۫ۥ۫ۡ۬ۢۚ۬۫ۛ۠ۡۦ";
                                    break;
                                } else {
                                    str3 = "۫ۖ۠ۡۘ۬ۙۘۙۜۨۘۥۘۖۦۘۧۘۧۤۥ";
                                    break;
                                }
                            case 1427602615:
                                str = "ۗ۫۠ۙ۟۫۬ۛۘۗۤ۬ۜۖۘۛۜۨۘۧۜۧۘۘۘۜ";
                                continue;
                        }
                    }
                    break;
                case 1624250698:
                    str = "ۛ۠ۦۘ۟ۢۦۘ۠ۤۙۡۦۢ۬ۡۨۘ";
                    button2 = (Button) findViewById(yo.getID("customactivityoncrash_error_activity_restart_button", "id"));
                    break;
                case 1679427694:
                    str = "۠ۚۧۤۧۙۚۙۧ۫ۥۧۛۛۥۘۚۘ";
                    break;
                case 1772579291:
                    str = "ۦۛۛۧۧۡۘۦۧۧ۠ۛۙۡۢۨۤ۠ۗۛۛۚ";
                    break;
            }
        }
    }
}
