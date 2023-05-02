package com.obwhatsapp.youbasha.ui.YoSettings;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;
import com.obwhatsapp.youbasha.task.utils;

public class BaseSettingsActivity extends Activity {
    public static boolean mustRestart;

    /* renamed from: a  reason: collision with root package name */
    public boolean f1147a;

    public static Intent a(View view, Context context, Class cls) {
        Intent intent = null;
        String str = "ۛۗۤۗۛۦۛۙ۫۠ۢۨۘۛۡ۫ۖۨ۫";
        while (true) {
            switch ((str.hashCode() ^ 722) ^ -2092438074) {
                case -1406725075:
                    str = "ۥۨۗ۟ۖۗۥۦۦۘۘۧۖۘۢۗۦۜۡۘۘۖۗۜ۫۠ۚ";
                    break;
                case -751207017:
                    return intent;
                case 391846885:
                    str = "ۘ۫ۤۜۗۗۚۙۥ۫ۗۘۘۢۡۘۘۙۙۥۨۗۨ۠ۤۥۘۗ۟";
                    break;
                case 435979437:
                    str = "ۧ۫ۦۘ۠۫ۡۦۨۛۙۖۜ۬ۖۥۘۜۘۛۛۖۙ۫ۚ";
                    break;
                case 1012464164:
                    intent = new Intent(context, cls);
                    str = "ۖ۬ۗۢۘۘۤۥۜۢۡۦۘۘۧۨۘۗۥۛۖۜۘۘ";
                    break;
                case 1944371837:
                    intent.putExtra("title", String.valueOf(view.getTag()));
                    str = "ۡ۫ۥۘۖۧۘۘۚۦۦۘۚۦۤۤۖۛۤۘۘۨ۟ۡ";
                    break;
            }
        }
    }

    public static void configToolbar(Toolbar toolbar, Activity activity) {
        String str = "ۦۡۧۨ۬ۥۘۙ۠ۧۤ۬۬ۖۦۖ";
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z2 = false;
        while (true) {
            switch ((str.hashCode() ^ 560) ^ 766093229) {
                case -1902331536:
                    str = "۠۟ۛ۫ۘۖۘۢۡۧۚۘۢ۫ۥ۫۬۫۟ۛ۫ۗ";
                    i3 = i2;
                    break;
                case -1650060875:
                    i2 = -12303292;
                    str = "ۧۙۖۘۘۨ۟۟ۧۥۛۘۜۡۛۤ";
                    break;
                case -1514277222:
                    str = "ۨۢۦۘۥۨۥۨۙ۟۬۠ۤۚ۠";
                    break;
                case -979788186:
                    str = "۠ۗۡۜۙۛۥۗۡۜ۟ۡۘۙۗ۟ۜ۫ۥۘ";
                    i3 = i4;
                    break;
                case -801736547:
                    str = "ۖۗۥۦۘۢ۬ۧۦۘۦۧۡۡ۬ۙۥۗۛۛۢۦۘ";
                    str3 = str4;
                    break;
                case -796786746:
                    str = "ۙۥۡۘۚ۠ۦۥۤۤ۫ۥۘۙۖ۬ۜۥ۫ۤۙۙۤۡۘ۬ۖ";
                    break;
                case -574188769:
                    utils.setStatusNavColors(activity, i5, i5);
                    str = "ۛۗۨۛۙۦۘۦۚۜۖۨۛۚۡۢۜۨۘ";
                    break;
                case -494277022:
                    str = "ۜۚۥۚۡۤۥ۬ۥ۟ۡۥۗۧ۟ۛۜۦۘ";
                    break;
                case -458277755:
                    str4 = "#080808";
                    str = "ۗۧۤۖ۟ۚۘۥۚۗ۠۫ۧ۟ۙۤۖۚۜ۬۬۟ۚۖۘ";
                    break;
                case -415548632:
                    str = "۠ۨۨ۬ۘۘۦ۫ۤۙۚۖۛۗۨۘ";
                    str2 = "#f2f2f2";
                    break;
                case -305641168:
                    return;
                case -234619177:
                    str = "ۥ۟ۥۘۜۢۜۘۢ۠۬۬۟ۗۗۙۘۘ۟ۥۙۥۖ۟";
                    i5 = Color.parseColor(str3);
                    break;
                case -214072685:
                    str = "ۙۥۡۘۚ۠ۦۥۤۤ۫ۥۘۙۖ۬ۜۥ۫ۤۙۙۤۡۘ۬ۖ";
                    str3 = str2;
                    break;
                case -184743869:
                    str = "ۡۜۦۘ۟ۧۢۥۖۢۤۘۢۤۛ۬۠۟۫";
                    z2 = yo.isNightModeActive();
                    break;
                case -93438765:
                    str = "۠۟ۛ۫ۘۖۘۢۡۧۚۘۢ۫ۥ۫۬۫۟ۛ۫ۗ";
                    break;
                case 276266099:
                    String str5 = "ۘۡۗۘۛۚۙۖۚۗ۫ۜۘ۬ۦۜۘۗۨۜۨۢۘ";
                    while (true) {
                        switch (str5.hashCode() ^ -41866671) {
                            case -1570282496:
                                str = "۬ۡ۟ۨۦۦۘۜ۟ۜۤۚ۬ۢۘ۬ۛۗۗۗۛۙۡ";
                                continue;
                            case -1356389476:
                                if (!z2) {
                                    str5 = "ۖۙۨ۟ۙۧۥۖۛۢۙ۫ۥ۫۫ۦ۟ۘۘۨۡۖ";
                                    break;
                                } else {
                                    str5 = "ۘۜۦۘۖ۫ۡۢۢۡ۟ۦۤۙۢۙۘۥۖۘ۫ۤۜۜۜ";
                                    break;
                                }
                            case 1022973927:
                                str5 = "ۘۢۦۚۖۤ۠ۗۛ۫ۦۗۨۗۙۧۘۖۥۡۜ";
                                break;
                            case 1213233776:
                                str = "۬ۡۗۤۧ۠ۘۥ۬۠ۢۘۙۤۙۢۥۥۙۦۖۘۦۖۜۘ";
                                continue;
                        }
                    }
                    break;
                case 473778028:
                    toolbar.setNavigationIcon(others.coloredDrawable("ic_back_gray", i3, PorterDuff.Mode.SRC_ATOP));
                    str = "ۘۥۥۘ۟۟ۡۘۗۜ۫ۨۘۖۘۜۢ۟ۥ۫۫";
                    break;
                case 1079048284:
                    String str6 = "۟ۛ۠ۨۢۥۨۗۨۘ۬ۢۧۚۗۜۥۛ۠۠ۘ۬";
                    while (true) {
                        switch (str6.hashCode() ^ -1237777305) {
                            case -1758004542:
                                str = "ۢ۬ۥۖۥۚ۟ۘ۬ۛ۟ۙۘۧۦۘۥۥ۬۬ۖۘ";
                                continue;
                            case 1460030777:
                                if (!z2) {
                                    str6 = "۟۠ۢۦۦۛۖۖۨۘۙۚۘۘۥۖ۫ۦۥۥ۟ۦۡۦۜۚۛ۟";
                                    break;
                                } else {
                                    str6 = "ۧۤۘۘۙۚۖۘۚ۟۟ۨۗۥۘۙۖ۠ۜۤۖۦ۟ۨ";
                                    break;
                                }
                            case 1845025231:
                                str6 = "ۗۧۨۘۖۥ۠ۙۨۘۖۗۢ۠۫ۖۘۙۦۗ۟ۛۨۘ";
                                break;
                            case 1857758727:
                                str = "ۢۚۘۥ۟۟ۧۖ۬ۧۡ۫ۡ۬ۜ";
                                continue;
                        }
                    }
                    break;
                case 1389549084:
                    i4 = -3355444;
                    str = "ۖ۠ۢۘۜۧۘۢ۫ۚۥۗۥۘۨۚۖۙ۠ۡۘۖۛۖۡۙۜۥۘۚ";
                    break;
            }
        }
    }

    public static void setMustRestart(boolean z2) {
        String str = "ۛۖۖۘ۟ۙۖ۫ۚ۫ۥۨۛۗۢۗۧۧۙ";
        while (true) {
            switch ((str.hashCode() ^ 119) ^ 757757056) {
                case 85859036:
                    mustRestart = z2;
                    str = "۬ۚ۠۠ۗۢۥۡۡۨ۠ۖ۠۫ۚۖۥۧۙۢۦۘ";
                    break;
                case 303262049:
                    return;
                case 1025408511:
                    str = "ۙۜۡۘۗۥۘ۫۬ۜۨ۠ۥۤۥۘۘۗۥۜ";
                    break;
            }
        }
    }

    public void attachBaseContext(Context context) {
        String str = "ۚ۠ۖۘۚۥۛۚۙۛۖۗۘۡۙۢۢۨۘۘۧۖ۟ۧۗۥۘۘ";
        while (true) {
            switch ((str.hashCode() ^ 968) ^ -686782036) {
                case -1878295394:
                    str = "ۤ۬ۥۘۙ۟ۨۢۖۗ۬ۚۗۧۢۦۘ";
                    break;
                case -869095214:
                    yo.yo(context);
                    str = "ۚۗۦۤۨۦۘۖۨۡۙۘۦۢ۟ۨۦ۫ۘۚۦۘۚۡۤ";
                    break;
                case -462431605:
                    super.attachBaseContext(context.createConfigurationContext(yo.getCtx().getResources().getConfiguration()));
                    str = "ۛۖۤۨۙۢ۬ۜۛ۬۬ۨۜۧۥۘۙۡۚۜ۠ۢۖۚۨ";
                    break;
                case -428668716:
                    yo.setLanguage();
                    str = "ۦۛۥۘۤۦۜۚۤۡۘۧۥ۬ۦۧ۫";
                    break;
                case -369617642:
                    str = "ۤۛۥۘۛ۫ۗۛۡۦۡۗۘۘ۠ۨۖۚۨۡۧۧ۠ۤۢۚ";
                    break;
                case 1850737:
                    return;
                case 1137579998:
                    String str2 = "۟ۖۤۢۙ۫ۡۧۙ۠ۦۛۜۧۖۤۖۘۛ۠ۦ۟ۜۙ";
                    while (true) {
                        switch (str2.hashCode() ^ -2109560851) {
                            case -1237169070:
                                if (yo.getCtx() != null) {
                                    str2 = "ۘۨۜۘۜ۟ۨۘۖۚۡۗۘۦۚۘۧۘ۫ۗۢۥ۬ۥۘ";
                                    break;
                                } else {
                                    str2 = "ۙۚۘۘ۫ۢۨۧۧۥۘ۬ۜۥۘۦۡۘۤۦۧۘۡۖۘۘ";
                                    break;
                                }
                            case -241380370:
                                str = "ۖۤۘۘۦ۫ۘۥۚۗۨۚۢۚ۠ۦۛ۬ۚۥۛۨ";
                                continue;
                            case 337961746:
                                str2 = "ۢۤۧ۟ۖۘۧۙۥۨۧۦۡۨۧ۫ۘۘۢۨۧۘۢۨۛ";
                                break;
                            case 1766379959:
                                str = "ۦۛۥۘۤۦۜۚۤۡۘۧۥ۬ۦۧ۫";
                                continue;
                        }
                    }
                    break;
            }
        }
    }

    public void downInstaLink(View view) {
        utils.openLink(this, utils.dbsf("aHR0cHM6Ly93d3cud2hhdHNvbWFyLmFwcC8yMDIxLzAzL29iaW5zdGFncmFtLmh0bWw=", 1));
    }

    public void downTeleLink(View view) {
        utils.openLink(this, utils.dbsf("aHR0cHM6Ly93d3cud2hhdHNvbWFyLmFwcC8yMDIxLzA5L3RlbGVncmFtLW9tYXIuaHRtbA==", 1));
    }

    public void downWaAG2Link(View view) {
        utils.openLink(this, utils.dbsf("aHR0cDovL3VwZGF0ZW9tYXIuY29tL29id2g=", 1));
    }

    public void downWaAGLink(View view) {
        utils.openLink(this, utils.dbsf("aHR0cDovL3VwZGF0ZW9tYXIuY29tL29iMndo", 1));
    }

    public void downWaBlueLink(View view) {
        utils.openLink(this, utils.dbsf("aHR0cDovL3VwZGF0ZW9tYXIuY29tL29iM3do", 1));
    }

    public void downWaGoldLink(View view) {
        utils.openLink(this, utils.dbsf("aHR0cDovL3VwZGF0ZW9tYXIuY29tL29iNndo", 1));
    }

    public void downWaPlusLink(View view) {
        utils.openLink(this, utils.dbsf("aHR0cDovL3VwZGF0ZW9tYXIuY29tL29iNHdo", 1));
    }

    public void downWaRedLink(View view) {
        utils.openLink(this, utils.dbsf("aHR0cDovL3VwZGF0ZW9tYXIuY29tL29iNXdo", 1));
    }

    public void downYTLink(View view) {
        utils.openLink(this, utils.dbsf("aHR0cHM6Ly9tZWRpYWZpcmUud2hhdHNvbWFyLmNvbS9maWxlL2did2hhdHNhcHAtYXBr", 1));
    }

    public void downYmateLink(View view) {
        utils.openLink(this, utils.dbsf("aHR0cHM6Ly95bWF0ZS5hcHAvZW40MQ==", 1));
    }

    public void onCreate(Bundle bundle) {
        String str = "ۧ۫ۨۘۦۗۗۗ۫ۢۗ۫ۖۘۚ۠۠";
        int i2 = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z2 = false;
        while (true) {
            switch ((str.hashCode() ^ 339) ^ -841886689) {
                case -2113930348:
                    utils.setStatusNavColors(this, i2, i2);
                    str = "ۜۤ۠ۡۛۡۢ۠ۖۘۚۗۗۤۘۧۘۥۡۧۘۡۡ";
                    break;
                case -2032929078:
                    str = "ۖ۬ۦۛۡۢ۟۬ۖۘۥۗۘۘۤۢۚۗۢۨۛ۟ۘ";
                    str2 = "#f2f2f2";
                    break;
                case -1366207119:
                    return;
                case -1017971889:
                    str = "۬ۦۦ۬۟ۦۙۡۙ۬ۨ۫ۢ۬ۡۦۢۨۘۢ۠ۨۥ۟ۙ";
                    break;
                case -819312633:
                    str = "ۜۨۥۜ۫ۨۛۥۘ۠ۨۧۘۜۤ۫ۤۢ۠۬ۘۡۘۘۨۜۘۦۛۦ";
                    str3 = str4;
                    break;
                case -632905849:
                    this.f1147a = z2;
                    str = "۬ۥۘۥۙۘۧ۬ۧۨۥۨۘۘۥۜۡۗۦۙ۠ۨۘۥۙۨۥۙۘۘ";
                    break;
                case -326871286:
                    i2 = Color.parseColor(str3);
                    str = "ۢۦۨۚ۟۠۠ۥۡۘۘۨۥۘ۠ۛۗۢۥۡ";
                    break;
                case 215843338:
                    String str5 = "ۜۡۧۘۧ۟ۡ۫۫ۡ۟۟۟ۛۦۥۘۘۛۤۚۧۦۘ";
                    while (true) {
                        switch (str5.hashCode() ^ 536494176) {
                            case -1362380431:
                                str = "۫ۧۢۘۢۗۗۗۨۘۧۧ۠ۡۤۘۚۙۢۤۛۜۘ۟ۥۘ";
                                continue;
                            case 83252957:
                                str = "ۙۚۧۙۢۜ۫ۤۛۤ۬۬۫ۦۜۘ";
                                continue;
                            case 531515174:
                                str5 = "ۗۜ۠ۛ۠ۤۗۘۜۙۛۦۘۛۧ۟ۨۙۘۧۗ۠ۧۖۡۨۘ";
                                break;
                            case 1215977329:
                                if (!z2) {
                                    str5 = "ۢۦۜۘۥ۫ۙۘۘۢۜ۟ۖۤۥۦۘۥ۫ۢ۬ۙۜۤ۟ۢ";
                                    break;
                                } else {
                                    str5 = "ۙۚۧۙۗۤۤۢۗۖۨۡ۫ۛ";
                                    break;
                                }
                        }
                    }
                    break;
                case 806340902:
                    str = "ۗۧۗۖ۟ۥ۠ۚۦ۫۟ۖ۬ۚۤ";
                    z2 = yo.isNightModeActive();
                    break;
                case 1132622730:
                    str = "ۜۖۡۘۤۨۥۦۙۘۙۡۧۘ۬ۗ۟";
                    str3 = str2;
                    break;
                case 1236576868:
                    str4 = "#080808";
                    str = "۟ۨۚۚ۟ۦۘۖ۟ۤۤۨ۬۫۫۠";
                    break;
                case 1462519807:
                    super.onCreate(bundle);
                    str = "۠ۢۖ۬ۚۨۢۡۘ۬ۡ۬۟ۚ۟ۧۘۙۢ۬ۜ";
                    break;
                case 1478646628:
                    str = "ۨ۠ۤۛۘۙ۬ۨۜۘۡۢۤۢۧۤۤۨۘۚ۟ۘ";
                    break;
                case 2007716848:
                    str = "ۜۖۡۘۤۨۥۦۙۘۙۡۧۘ۬ۗ۟";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x014d, code lost:
        r1 = "ۛۙۘۘۨۦۧۘۙۜۦۙ۫۠۠ۖ۬ۥۘ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPostCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            r3 = 0
            r5 = 0
            java.lang.String r0 = "ۢۗۛۚۦ۠ۗۥۙ۫ۙۘۨ۟ۘ۫ۤۧ"
            r1 = r0
            r2 = r3
            r4 = r5
            r6 = r3
            r7 = r5
            r8 = r5
            r9 = r5
            r10 = r3
        L_0x000c:
            int r0 = r1.hashCode()
            r3 = 445(0x1bd, float:6.24E-43)
            r5 = 1440746300(0x55e00b3c, float:3.0792357E13)
            r0 = r0 ^ r3
            r0 = r0 ^ r5
            switch(r0) {
                case -2144462501: goto L_0x001b;
                case -2132386350: goto L_0x0073;
                case -2052147710: goto L_0x011c;
                case -1898003728: goto L_0x0152;
                case -1680981366: goto L_0x006b;
                case -1669032549: goto L_0x005f;
                case -1250741876: goto L_0x0066;
                case -1249560241: goto L_0x009d;
                case -1221792528: goto L_0x00c9;
                case -801665760: goto L_0x001f;
                case -462726403: goto L_0x0023;
                case -439116002: goto L_0x002a;
                case 92930862: goto L_0x00e0;
                case 136625605: goto L_0x003c;
                case 440497887: goto L_0x0078;
                case 534543843: goto L_0x0148;
                case 1170033026: goto L_0x00ab;
                case 1217555844: goto L_0x00fe;
                case 1316479389: goto L_0x0140;
                case 1413994176: goto L_0x008d;
                case 1468406050: goto L_0x007f;
                case 1728448478: goto L_0x00d5;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x000c
        L_0x001b:
            java.lang.String r0 = "ۨۢۖۛۢۜۥۤۦ۫ۦ۟۬ۢۚۙۥۜۨۜۘۦۛۤۥ۟ۨ"
            r1 = r0
            goto L_0x000c
        L_0x001f:
            java.lang.String r0 = "ۘۚۧۚۙۘۘۚۦۘ۟ۢۦۘۤۦۨۛ۫ۜۘ۠ۧ"
            r1 = r0
            goto L_0x000c
        L_0x0023:
            super.onPostCreate(r12)
            java.lang.String r0 = "ۛ۬ۘۡۗۡۘۡۢ۟ۖ۠ۤۜۜۜۘۧ۬ۥ۬ۤۦۡ۬ۡۤ۟ۖ"
            r1 = r0
            goto L_0x000c
        L_0x002a:
            java.lang.String r0 = "acjtoolbar"
            java.lang.String r1 = "id"
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r1)
            android.view.View r0 = r11.findViewById(r0)
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            java.lang.String r1 = "ۥۛۧۢۤ۠ۨ۟ۙۛۥۦۘۦۦۧۘ۫ۤۛۡۨۙۨ۟۫ۥۥۦ"
            r10 = r0
            goto L_0x000c
        L_0x003c:
            r1 = -855613270(0xffffffffcd0060aa, float:-1.34613664E8)
            java.lang.String r0 = "۬۠ۘۢۤۘۘۢ۠ۜۘ۬ۖ۫ۡۤۖۖۥۚۥۜۧۘۖۜ"
        L_0x0041:
            int r3 = r0.hashCode()
            r3 = r3 ^ r1
            switch(r3) {
                case -449360964: goto L_0x004a;
                case 894519735: goto L_0x005b;
                case 1327255405: goto L_0x0051;
                case 1373529241: goto L_0x0058;
                default: goto L_0x0049;
            }
        L_0x0049:
            goto L_0x0041
        L_0x004a:
            java.lang.String r0 = "ۙۡۜۜۘ۬ۧۤۚۡۖۖۜ۠ۚۢۦۗ۫ۢۡۘ"
            r1 = r0
            goto L_0x000c
        L_0x004e:
            java.lang.String r0 = "ۘۖۥۘۖۤ۬ۨۖۘ۟ۢ۬ۡۛۖ۟ۧۥۙۖ۫۫۬ۘ"
            goto L_0x0041
        L_0x0051:
            boolean r0 = r11.f1147a
            if (r0 == 0) goto L_0x004e
            java.lang.String r0 = "ۛۙ۫۟۟ۢ۬ۡۙۤۘۜۘۦۘ۠ۘۙۢۗۥۨۘۡۚۜ"
            goto L_0x0041
        L_0x0058:
            java.lang.String r0 = "ۗۛۖۘۛۥۦۥۧۛ۠ۧۧۤۘۘۛۗ۠ۖۨۖۘۨۖۧۚۗۢ"
            goto L_0x0041
        L_0x005b:
            java.lang.String r0 = "۟ۚۤۦۗۚۢۤۛۢۙۖۢ۠۬ۚۙۡ"
            r1 = r0
            goto L_0x000c
        L_0x005f:
            r9 = -3355444(0xffffffffffcccccc, float:NaN)
            java.lang.String r0 = "۟ۡۖۘۤ۫ۢۨ۫ۡۜۤۥۘ۫ۨ۬"
            r1 = r0
            goto L_0x000c
        L_0x0066:
            java.lang.String r0 = "۫ۨۧۘ۫ۖۥۨۚۖۜۛۜۡۘۡۗۘۨ"
            r1 = r0
            r8 = r9
            goto L_0x000c
        L_0x006b:
            r5 = -12303292(0xffffffffff444444, float:-2.6088314E38)
            java.lang.String r0 = "ۖ۠ۦۘۢۙۛۘ۫ۘۘۖ۫ۛ۠۠ۢ۬ۨۘۜ۬ۥۢۚۨۘۥۡۧ"
            r1 = r0
            r7 = r5
            goto L_0x000c
        L_0x0073:
            java.lang.String r0 = "۠۟ۡۘۚۦۛۢۚۖۛ۟ۖۘۢۘۘۧۘۘۘ۠ۛۡ"
            r1 = r0
            r8 = r7
            goto L_0x000c
        L_0x0078:
            r10.setTitleTextColor((int) r8)
            java.lang.String r0 = "ۜۖۛۡۜۤۛۤ۠ۙۢۤ۠ۘۧ"
            r1 = r0
            goto L_0x000c
        L_0x007f:
            c.c r0 = new c.c
            r1 = 8
            r0.<init>(r11, r1)
            r10.setNavigationOnClickListener(r0)
            java.lang.String r0 = "ۨۗۧۤۛ۬۫۠ۦۗ۬ۖۢۦۘۡۡۜۘۦۗۛۧۢۘ۬۫ۖ"
            r1 = r0
            goto L_0x000c
        L_0x008d:
            java.lang.String r0 = "ic_back_gray"
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_ATOP
            android.graphics.drawable.Drawable r0 = com.obwhatsapp.youbasha.others.coloredDrawable(r0, r8, r1)
            r10.setNavigationIcon((android.graphics.drawable.Drawable) r0)
            java.lang.String r0 = "ۨ۫ۡۘ۠ۥۥۘۢ۫ۤۛۤ۠ۙۘ۬ۘۡۖ"
            r1 = r0
            goto L_0x000c
        L_0x009d:
            android.content.Intent r0 = r11.getIntent()
            android.os.Bundle r3 = r0.getExtras()
            java.lang.String r0 = "ۙۘۢۜۡۢ۠ۡۘۙۚۖ۠ۘ۟۫ۥ۬"
            r1 = r0
            r6 = r3
            goto L_0x000c
        L_0x00ab:
            r1 = -209772117(0xfffffffff37f21ab, float:-2.0213601E31)
            java.lang.String r0 = "ۧ۟ۗۦۗۜۘۜۦۥۘۡۡۘۥۨ۟ۖ۫ۗ۬۠ۜۚۡۘۤۛۖۘ"
        L_0x00b0:
            int r3 = r0.hashCode()
            r3 = r3 ^ r1
            switch(r3) {
                case -1715156733: goto L_0x00b9;
                case -1242037444: goto L_0x00bf;
                case -1200757315: goto L_0x00c4;
                case -257974100: goto L_0x014d;
                default: goto L_0x00b8;
            }
        L_0x00b8:
            goto L_0x00b0
        L_0x00b9:
            java.lang.String r0 = "ۢ۬ۡۘۛ۬۠۬ۛۚۧۚۙۗۤۜۘۜۡۡۘۥۘۘ۬۬ۛۖۡۥ"
            goto L_0x00b0
        L_0x00bc:
            java.lang.String r0 = "ۡۨ۬ۢ۫ۤۨۖۦۥۤۜۜۘ۫ۡۡۧ۬ۜۡۘۖ۠۫"
            goto L_0x00b0
        L_0x00bf:
            if (r6 == 0) goto L_0x00bc
            java.lang.String r0 = "ۢۚۦۘ۟ۜ۬ۛۤۦۘۛۜۚۘ۫۬۬ۥۘۧ۟ۥۘۧ۫ۖ"
            goto L_0x00b0
        L_0x00c4:
            java.lang.String r0 = "ۦۚۡ۟ۡۗ۠ۨۜۢۘۥۘۨۙۧۚۙۧۗۚۖۙۖۜۦۜۚ"
            r1 = r0
            goto L_0x000c
        L_0x00c9:
            java.lang.String r0 = "title"
            boolean r3 = r6.containsKey(r0)
            java.lang.String r0 = "ۗۨۨۘۘۢ۠ۡۢ۫۬ۘ۠ۢ۠۬ۨۘ"
            r1 = r0
            r4 = r3
            goto L_0x000c
        L_0x00d5:
            java.lang.String r0 = "title"
            java.lang.String r2 = r6.getString(r0)
            java.lang.String r0 = "ۢ۟ۤۙۖۦۘۢۧۧۨۗۖۘۜۨۧۛۚۘۙۧ۟ۥۙۖۦۖۥۘ"
            r1 = r0
            goto L_0x000c
        L_0x00e0:
            r1 = -1335982293(0xffffffffb05e872b, float:-8.0955215E-10)
            java.lang.String r0 = "ۙ۫ۥۘ۬۫ۥۤ۬ۜۢۛۡۘ۟ۘۗۛۙ۟ۛ۬ۚۛ۬ۤ۠۬ۡۘ"
        L_0x00e5:
            int r3 = r0.hashCode()
            r3 = r3 ^ r1
            switch(r3) {
                case -1688140360: goto L_0x00ee;
                case 465318330: goto L_0x00f9;
                case 1203794062: goto L_0x014d;
                case 1321338761: goto L_0x00f6;
                default: goto L_0x00ed;
            }
        L_0x00ed:
            goto L_0x00e5
        L_0x00ee:
            if (r4 == 0) goto L_0x00f3
            java.lang.String r0 = "ۛۢۖۘ۫ۜۗۜۗۖۘۡۙۘۘۡ۬۟۫ۙۦۘ"
            goto L_0x00e5
        L_0x00f3:
            java.lang.String r0 = "ۚۤ۫۠ۗۨ۫ۘۡ۠ۡۦۘۗۢۧ"
            goto L_0x00e5
        L_0x00f6:
            java.lang.String r0 = "ۦۙۦۘ۬ۚۤۧۢ۟۠ۜ۟ۢ۬ۛۚۘۙۥ۟ۘۨۚۧ"
            goto L_0x00e5
        L_0x00f9:
            java.lang.String r0 = "۬ۦۡۘۚۘ۬ۛۢ۫۟ۘۧۦۛ۫ۖۚۘ"
            r1 = r0
            goto L_0x000c
        L_0x00fe:
            r1 = 1019102544(0x3cbe4550, float:0.02322641)
            java.lang.String r0 = "ۖۘۥۧ۠ۡۘۨ۫ۨۧۛۚۦۢۖۘۦ۫ۤۧۡۗۧۗۚۗۗۜ"
        L_0x0103:
            int r3 = r0.hashCode()
            r3 = r3 ^ r1
            switch(r3) {
                case -1557605289: goto L_0x0117;
                case 379160100: goto L_0x010c;
                case 939784770: goto L_0x014d;
                case 1201323794: goto L_0x0112;
                default: goto L_0x010b;
            }
        L_0x010b:
            goto L_0x0103
        L_0x010c:
            java.lang.String r0 = "ۢ۫ۘ۬ۛ۫ۦۦۜۖۖۤۤۧۤ۬ۧ"
            goto L_0x0103
        L_0x010f:
            java.lang.String r0 = "ۢۘۖۘۘۤۥۘۧۥ۫۟ۚۖۘ۬ۘۖ۠ۥۦۦ۠ۖۙۡ۠ۡ۟ۖ"
            goto L_0x0103
        L_0x0112:
            if (r2 == 0) goto L_0x010f
            java.lang.String r0 = "ۛۡۜ۠ۗۙۙ۟ۚۙۙۧۚۤۨۚۚۘ۫ۢۤ"
            goto L_0x0103
        L_0x0117:
            java.lang.String r0 = "ۖۡۜۥ۟ۥۘۦۧۖۢۚ۠۬ۚۨۘۚۥۨۘۛۦۨۨۦۦۘ"
            r1 = r0
            goto L_0x000c
        L_0x011c:
            r1 = -621787761(0xffffffffdaf0458f, float:-3.38152374E16)
            java.lang.String r0 = "ۢۤۦۘۜۤ۬ۚۘۘ۬ۥۦۘۚ۟ۨۘ۠ۚۙ۟ۚۗۗۤۨۘ"
        L_0x0121:
            int r3 = r0.hashCode()
            r3 = r3 ^ r1
            switch(r3) {
                case -2012305145: goto L_0x013b;
                case -1373063349: goto L_0x0130;
                case -85356694: goto L_0x014d;
                case 263114130: goto L_0x012a;
                default: goto L_0x0129;
            }
        L_0x0129:
            goto L_0x0121
        L_0x012a:
            java.lang.String r0 = "ۗۘ۬ۢۚۡۘۗۗۜۘۚ۟ۨ۠۬ۢۖۢۜۘۚۘۘۘۙۦۘۘ۠۬"
            goto L_0x0121
        L_0x012d:
            java.lang.String r0 = "ۦۛ۫۬ۖۗۥۚۦۘۚ۬۬ۖۙۧ۫ۢۤ"
            goto L_0x0121
        L_0x0130:
            java.lang.String r0 = "null"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x012d
            java.lang.String r0 = "ۥ۟ۡۙ۬۬ۗۤۜۘ۟ۧۢۗۤۥۡۙ۫ۡۚۧۜۨۥۢ"
            goto L_0x0121
        L_0x013b:
            java.lang.String r0 = "۬۫ۘۗۗۡۖۦۘۘۜۨۚ۬ۚۜۨ۫ۦۘۜۦ۠ۧ۫ۗۖۘۨۘ"
            r1 = r0
            goto L_0x000c
        L_0x0140:
            r10.setTitle((java.lang.CharSequence) r2)
            java.lang.String r0 = "ۛۙۘۘۨۦۧۘۙۜۦۙ۫۠۠ۖ۬ۥۘ"
            r1 = r0
            goto L_0x000c
        L_0x0148:
            java.lang.String r0 = "۠۟ۡۘۚۦۛۢۚۖۛ۟ۖۘۢۘۘۧۘۘۘ۠ۛۡ"
            r1 = r0
            goto L_0x000c
        L_0x014d:
            java.lang.String r0 = "ۛۙۘۘۨۦۧۘۙۜۦۙ۫۠۠ۖ۬ۥۘ"
            r1 = r0
            goto L_0x000c
        L_0x0152:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.YoSettings.BaseSettingsActivity.onPostCreate(android.os.Bundle):void");
    }

    public void openWebsite(View view) {
        String str = "ۡۗۨ۠ۥۥۜۚۙۙ۠۬۬ۘۧۦۙۘ۟ۡۧۙۦ۠";
        while (true) {
            switch ((str.hashCode() ^ 518) ^ 1158483075) {
                case -983528182:
                    str = "ۙۘۗۧ۠ۨۘۗۨۢۥ۟ۤ۫۠ۘ۫ۚۘۦۜۤ";
                    break;
                case 1207108040:
                    return;
                case 1280381813:
                    str = "ۗۘۡۘ۬۫ۨۘۨۖۗ۠ۥۥۤ۬ۚۥۧۤ۠ۛ۬۬۬ۨۘۢ";
                    break;
                case 1652479307:
                    utils.openLink(this, utils.dbsf("YUhSMGNEb3ZMM1Z3WkdGMFpXOXRZWEl1WTI5dEwyOWlkMmc9", 2));
                    str = "ۤۖۧۡۦۛۚۖۧۘ۬ۛ۬ۨۤۚۨۖۤۧۛۨ";
                    break;
            }
        }
    }
}
