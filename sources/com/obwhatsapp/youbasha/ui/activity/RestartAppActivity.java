package com.obwhatsapp.youbasha.ui.activity;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.cat.ereza.customactivityoncrash.CustomActivityOnCrash;
import com.obwhatsapp.HomeActivity;
import com.obwhatsapp.settings.SettingsChat;
import com.obwhatsapp.yo.shp;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.task.utils;
import com.obwhatsapp.youbasha.ui.YoSettings.AllSettings;
import java.util.Random;

public class RestartAppActivity extends Activity {
    public static String a() {
        String str = "ۚ۟۟۠۟ۨۘ۟ۨۧۘۧۚۢۢۦۡ۫ۨۘ";
        int i2 = 0;
        while (true) {
            switch ((str.hashCode() ^ 775) ^ -886732046) {
                case -396099089:
                    return new String[]{"Rk1CdWdzQG91dGxvb2suY29t", "QnVnc0ZNQG91dGxvb2suY29t", "Q3Jhc2hSZXBvcnRzQGhvdG1haWwuY29t"}[i2];
                case 1201785599:
                    i2 = new Random().nextInt(3);
                    str = "ۡ۟ۨۘۧ۟ۢۙۧۜۘۛۨ۬ۙۧ۬ۖۢۢۚ۠۠ۚۛۨۘ";
                    break;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        String str = "ۧۧۘۘۙۢۙۨۡۡۘۤۚۜۙ۟ۛۚ۬۫";
        while (true) {
            switch ((str.hashCode() ^ 127) ^ -279340585) {
                case -1644381106:
                    super.onCreate(bundle);
                    str = "ۙ۟ۜۦۧۘۘۡۢۗۨۗۨۨۙ۫ۨ۬ۙ";
                    break;
                case -1496189731:
                    String str2 = "ۤۤۖ۟ۘۖۘۡۙۥ۬۬ۗ۟ۢۢۖۨۡۘۨۚۨۦ۠ۙ";
                    while (true) {
                        switch (str2.hashCode() ^ -287082973) {
                            case -1814908543:
                                str = "۫ۡۥۘۗۥۦۛۚۖۧۢۜۢۧۖۧۘ";
                                continue;
                            case -1501263509:
                                str = "ۡۜۥۘۥ۟ۛۜۨۧۚۚۚۧ۠ۛۗۜۜۘ";
                                continue;
                            case -93253405:
                                str2 = "۫ۢۚۛۜ۫ۘۘۡۘۚۢۗۛۘ۠ۤۦۖ";
                                break;
                            case 1765627925:
                                if (yo.getCtx() != null) {
                                    str2 = "ۢۧۡۘۨۖۖ۫ۘۘۨۢۖۘۖۤۥۛۥۖۘ";
                                    break;
                                } else {
                                    str2 = "۠ۗ۫ۤ۠ۨۢ۫ۢۗۦۚ۬ۡۨ۫ۜۡ۟ۨۘۖۚۦۦۧۛ";
                                    break;
                                }
                        }
                    }
                    break;
                case -460122200:
                    str = "ۗ۠ۜۘۛۢ۬ۛۥۦۘۧۚۖۘۡۖۘۘ";
                    break;
                case -327589064:
                    return;
                case 3906617:
                    setContentView(yo.getID("activity_customcrash", "layout"));
                    str = "ۖۨۡۖۙۦۥۥ۬۬ۥ۬ۧۗۛ";
                    break;
                case 366567298:
                    str = "ۦ۠ۗۢ۬ۘ۠ۖۘ۟ۦۧۘۙۖۘۧۥۘ۟ۖ۟";
                    break;
                case 1762710241:
                    yo.yo(this);
                    str = "ۡۜۥۘۥ۟ۛۜۨۧۚۚۚۧ۠ۛۗۜۜۘ";
                    break;
            }
        }
    }

    public void openWASettingsBackup(View view) {
        String str = "۫ۛۦۘۡ۟ۥۘ۫ۗۨۘۡۥۦۘ۠۫ۧۖ۫۫ۛۡۤۛۘۢۛۗۘ";
        while (true) {
            switch ((str.hashCode() ^ 60) ^ -1490038795) {
                case -1528734945:
                    str = "۫ۖۦۘۨۖۧ۟ۢۛۗ۠ۢۖۗۛۡۢۦۡۦۙ";
                    break;
                case -1143022040:
                    startActivity(new Intent(this, SettingsChat.class));
                    str = "۫ۛۜۘۤۦۗۥۢۙ۬ۨۘۧۜۤۤۦۡۜۤۖۥ۬ۡ";
                    break;
                case -346271508:
                    return;
                case 314429765:
                    str = "۬۫۫ۗۤۡۧۦ۬ۛۨۧۢۜۢۘۘۤ۠ۦۘ";
                    break;
            }
        }
    }

    public void resetPrefs(View view) {
        String str = "ۗۛ۫۫ۤۗۗۗۦۡۧۨ۟ۦۜۜ۬ۢ۠ۡۧۤ";
        Class<HomeActivity> cls = null;
        Class<HomeActivity> cls2 = null;
        Class<? extends Activity> cls3 = null;
        while (true) {
            switch ((str.hashCode() ^ 912) ^ 673607276) {
                case -2037344747:
                    cls3 = CustomActivityOnCrash.getRestartActivityClassFromIntent(getIntent());
                    str = "ۡۧ۠ۛۢۘۘۖۘۚۖۘۧۤۜ";
                    break;
                case -1873842402:
                    shp.init(this);
                    str = "ۗۚۡۘ۠ۥۥۢۢۘ۬ۧۙ۠ۨۥۘۚۤۦۛۦۦۘ۠۟ۤ";
                    break;
                case -1841777521:
                    utils.resetMod();
                    str = "ۖ۠ۜۘۡ۟ۢ۫۠ۢۢۤ۟ۥۖۤۛ۫ۢۢۧۧۧ۟ۨۢ۟ۡ";
                    break;
                case -1582293230:
                    str = "۫ۡۛ۬۠ۧۗۧ۬ۜ۠۠ۦۘۦۘۛ۫ۛۛ۠ۨۘ";
                    break;
                case -1285211458:
                    cls = HomeActivity.class;
                    str = "ۛۜۙ۟۠۬ۘۥۦۖ۬ۜ۫ۨۨ۬ۥۘۦ۟۬";
                    break;
                case -645802784:
                    String str2 = "ۖۢۥۘۤۗۚۜۢۖۘ۟۬ۘ۟ۢ۫ۥۚۡۧۦۡۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 2060096389) {
                            case -1493822929:
                                str2 = "ۧۛۚۢۨۥۘۧۥۤۙۡۡۘ۬ۚ۬";
                                break;
                            case 579904337:
                                str = "۠ۗۡۥۛۤۘۘۘۘۜ۟۠ۧۘ۟ۦۥۡۥۧ۟۠ۜۘ";
                                continue;
                            case 1308438717:
                                str = "۟ۦۤۖۘۜۘۧۡۥۛۡۨۚۜۘۨ۫ۖۙۡۙ";
                                continue;
                            case 1847644208:
                                if (cls3 != null) {
                                    str2 = "ۢ۬ۧۢۢۥۛۙ۫ۥۧۤۖ۫ۥ۬ۗۦۘۗ۬ۙ";
                                    break;
                                } else {
                                    str2 = "ۙۨ۟ۡۘۥۖۤۤۡۦۘۥۗۙۗۦۘۙۤۖۘ";
                                    break;
                                }
                        }
                    }
                    break;
                case -21038959:
                    return;
                case 508958106:
                    str = "۫۫ۜۘ۠ۙۦۡۡ۠ۦۚۢ۫ۧۖۡۡۗ";
                    cls2 = cls3;
                    break;
                case 535972259:
                    str = "۠ۗۡۥۛۤۘۘۘۘۜ۟۠ۧۘ۟ۦۥۡۥۧ۟۠ۜۘ";
                    cls2 = cls;
                    break;
                case 879543920:
                    CustomActivityOnCrash.restartApplicationWithIntent(this, new Intent(this, cls2), (CustomActivityOnCrash.EventListener) null);
                    str = "ۦ۟ۤۨۗ۫ۨۢۥۘۨۚۦۘۙۦ۟ۡۧۡۘ";
                    break;
                case 1772051602:
                    str = "ۚۤ۟ۙۚۡۘۥۤۦۘۤۖۖۤۜ۬ۡۦۗ۟ۛۢۧۥۢ";
                    break;
            }
        }
    }

    public void sendLogsByEmail(View view) {
        try {
            String allErrorDetailsFromIntent = CustomActivityOnCrash.getAllErrorDetailsFromIntent(this, getIntent());
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse("mailto:"));
            intent.putExtra("android.intent.extra.EMAIL", new String[]{utils.dbsf("cmVwb3J0c29tYXIxQGdtYWlsLmNvbQ==", 1)});
            intent.putExtra("android.intent.extra.SUBJECT", "Crash: " + yo.getString("yowav") + "");
            intent.putExtra("android.intent.extra.TEXT", allErrorDetailsFromIntent);
            startActivity(Intent.createChooser(intent, "Send crash logs using..."));
        } catch (ActivityNotFoundException e2) {
            Toast.makeText(this, "No email clients installed.", 0).show();
        } catch (Exception e3) {
        }
    }

    public void startYoMods(View view) {
        Intent intent = null;
        String str = "۠ۢ۠۬۟ۖ۠ۤۗۨ۠ۤۚ۬۬ۜۥ۫ۦۦ";
        while (true) {
            switch ((str.hashCode() ^ 834) ^ -1834089001) {
                case -971694636:
                    finish();
                    str = "ۖ۟ۖۥۥۘۜۛۥۧۗۖۘۗۖ۟ۜۢۜۘۢۢۘۚۘۧۘۖۜۜ";
                    break;
                case -38844269:
                    str = "ۦۖۡۙۛۛۨۚۖۦۖ۫ۤ۟ۙۜۗۥۧ۬ۖۗۜ۬ۛ۬";
                    break;
                case 109257169:
                    return;
                case 675925159:
                    str = "ۖ۬۟ۖۧۖۖۨۖۘۢۜۧۖۚۡۘۗۡۜۘ";
                    break;
                case 1303862219:
                    intent = new Intent(this, AllSettings.class);
                    str = "ۘۡۨۘۧ۬ۤۖۥۙ۬ۜۧ۬ۚۡۥ۫ۚ۟ۘۘۘۥۖۤۚۦۦ";
                    break;
                case 1637442241:
                    intent.putExtra("fromCrash", true);
                    str = "ۖ۬ۗ۠۬ۘۘۨۚۨۜۛۖۖۗۤۤۤۡۥۡۦۘ۬ۧۡۘ";
                    break;
                case 2008781881:
                    startActivity(intent);
                    str = "ۖۨۖۡۛۗۜۧ۟ۖ۫ۖۘ۠ۖۘۘ۫ۨۜۘۘۘۘۘ";
                    break;
            }
        }
    }

    public void yoRestart(View view) {
        String str = "ۧۦۨۘ۠۬۬ۤۖۘۖۥۧۘۨ۠ۗۤۜۚۤۡۛ";
        Class<HomeActivity> cls = null;
        Class<HomeActivity> cls2 = null;
        Class<? extends Activity> cls3 = null;
        while (true) {
            switch ((str.hashCode() ^ 187) ^ 326106278) {
                case -1530577106:
                    str = "ۤۚۛۘ۫ۡۘۡۙۦۘۤۜۡۘ۟ۥ۬ۗ۬ۗۜۜۨۘۚۡۘۦۧۧ";
                    break;
                case -1261066576:
                    str = "ۙ۟ۨ۠ۘۖۘ۟ۚۡۘۗۤۘۚ۬ۜ۬ۧ۠ۘ۠ۖۘ۫ۡۙۦ۬";
                    cls2 = cls;
                    break;
                case -1081010217:
                    String str2 = "ۛۖۖۘ۫۟ۘۘ۬ۖۧۜ۠ۨۘ۟۟ۖۘۙۢۖ";
                    while (true) {
                        switch (str2.hashCode() ^ -1411534420) {
                            case -1258666396:
                                str = "ۙ۟ۨ۠ۘۖۘ۟ۚۡۘۗۤۘۚ۬ۜ۬ۧ۠ۘ۠ۖۘ۫ۡۙۦ۬";
                                continue;
                            case -56224473:
                                if (cls3 != null) {
                                    str2 = "ۗ۬ۖۧۥۚۤۤۨۗۘۖۘۦ۬ۥۘۡ۬ۜ";
                                    break;
                                } else {
                                    str2 = "ۨۥۦۘ۠ۖۛۨۗ۬۟۠ۛۨۘۛ۠ۨۘۧ۠ۖۘ";
                                    break;
                                }
                            case 1015754090:
                                str = "ۧۧۙۗۥۥ۟۫ۧۢۛۖۢۗ۫۫ۜۙ";
                                continue;
                            case 2016238655:
                                str2 = "ۦۖۙ۠۠۟ۚ۠ۜۘۧۜۘۘۦۙۖ۟۬ۨۚۤۡۘ";
                                break;
                        }
                    }
                    break;
                case -892007148:
                    cls3 = CustomActivityOnCrash.getRestartActivityClassFromIntent(getIntent());
                    str = "ۙ۫ۢ۬۬ۗۤۧۤۨۛ۟ۦ۫ۘۖۡۨۘ۫۬ۢ";
                    break;
                case -710128069:
                    str = "ۦۦۖ۬۠۠ۤۛۧۚۥ۟۟ۨ۟ۜ۠ۧۗۢۨۡۤ۬";
                    break;
                case -357739142:
                    CustomActivityOnCrash.restartApplicationWithIntent(this, new Intent(this, cls2), (CustomActivityOnCrash.EventListener) null);
                    str = "ۛۢۘۘۚ۠ۧۜۢۥۥۧ۟ۨ۫ۙۚۨۤ";
                    break;
                case -92739441:
                    cls = HomeActivity.class;
                    str = "ۢۖۜۘۘۚۨۘۡۚۛ۠ۗۘۘۛۧۘۘۡۛۦ۟ۤ۟۬ۨ";
                    break;
                case 505506904:
                    str = "ۚ۬ۙۙۜۧۘ۠ۤۖۘۖۡ۟ۤۙۥۗۥۖۘ۟ۡۚۛۧۥۘ";
                    cls2 = cls3;
                    break;
                case 1031329317:
                    return;
            }
        }
    }
}
