package com.obwhatsapp.youbasha.ui.lockV2;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import com.obwhatsapp.yo.CustomAlertDialogBuilder;
import com.obwhatsapp.yo.shp;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.task.utils;
import m.m;

public abstract class LockUtils {
    public static final String FINGERPRINT_LOCK = "lockedfp";
    public static final String PATTERN_LOCK = "locked";
    public static final String PIN_LOCK = "lockedpn";

    public static void changeAppLock(String str) {
        String str2 = "ۗۤۚ۫۟ۢ۟ۧ۫ۛۜۗ۫ۥ۬ۙۡ";
        while (true) {
            switch ((str2.hashCode() ^ 637) ^ -893054216) {
                case -1384315459:
                    shp.setBooleanPriv("applockV2", true);
                    str2 = "۫۫ۦۙۤۡۘۚۡۘۘۜۗۡۘۡۧۡ";
                    break;
                case -835099613:
                    str2 = "ۦۧۜۘۦ۠ۘۘۨۙۖۡ۫ۤۚۛۨۡۧ۬ۥۨۡۘۙۡۙۨ۬ۦۘ";
                    break;
                case -359757185:
                    String str3 = "ۡۨۧۘۦ۟ۚۡۡۚ۬ۙۙۧ۠ۙۢۚۘۘ۠ۗۘ";
                    while (true) {
                        switch (str3.hashCode() ^ -1836533263) {
                            case -1465469707:
                                if (!str.equals(FINGERPRINT_LOCK)) {
                                    str3 = "ۗۘ۟ۗ۠ۨۘ۫ۡۜۖۨۙۚۜۘ۫ۡۢۤۨۦۢۗۤ";
                                    break;
                                } else {
                                    str3 = "ۥۗۦۘ۫ۘۨۘۡۘۘۙۦ۫ۤ۠ۜۘ";
                                    break;
                                }
                            case -860321558:
                                str2 = "ۛ۬ۦۘۧۤۦۘۤۥ۠ۙۦۜۘ۬ۥ۬";
                                continue;
                            case -428431641:
                                str3 = "ۦۤۚ۠ۙۦۢ۬ۖۘۥ۟ۖۘۜۚۥۘ۫ۨ۠۠ۢۢ";
                                break;
                            case 795108662:
                                str2 = "ۜۦۜۘۖۘۨ۟ۗۦۗۙۜۜۛۥ";
                                continue;
                        }
                    }
                    break;
                case 688737959:
                    disableAppLock();
                    str2 = "ۘۥ۫ۙۖۧۨۨۦ۠ۧ۫ۧۦۦۘۤۤ";
                    break;
                case 1439564760:
                    return;
                case 1450844766:
                    shp.setBooleanPriv(str, true);
                    str2 = "ۤ۬ۖۖۗۦ۠ۢۦۘۤۤۡۘۨۨۖۘۤۚۥۘۤۛۥۘۧ۟ۦۚۖ۫";
                    break;
                case 2096715455:
                    shp.stockLightPrefs.putBoolean("privacy_fingerprint_enabled", true).commit();
                    str2 = "ۛ۬ۦۘۧۤۦۘۤۥ۠ۙۦۜۘ۬ۥ۬";
                    break;
            }
        }
    }

    public static void changeLockForJID(String str, String str2) {
        StringBuilder sb = null;
        String str3 = "۟ۦۡۢۧۨۥ۫ۢ۫ۢۘۘ۬ۗۛۗۨۧ۬ۘ۬ۡۛۙ";
        while (true) {
            switch ((str3.hashCode() ^ 385) ^ -1272889270) {
                case -1839062245:
                    sb = new StringBuilder();
                    str3 = "ۜۦۡۘۢۢۜۧۖۨ۫ۖۢۧ۟۟۟ۤ۫ۥۖۦۘۢۧۥ۟ۛۖ";
                    break;
                case -1563346917:
                    return;
                case -1515434273:
                    shp.setBooleanPriv(sb.toString(), true);
                    str3 = "۫ۢۤ۬ۥۗۨۥۗۚۨۤۖۘۖ۠ۡۘۥۥۘۘ";
                    break;
                case 258153384:
                    sb.append("_");
                    str3 = "۠ۡۦۘ۫ۗۨۘۗ۫ۦۢ۟۬ۚۚ۟ۢۙۜۘ۫ۧۙ۬ۧۡۧۨۢ";
                    break;
                case 405748158:
                    sb.append(str);
                    str3 = "ۚۢ۫ۜۡۤ۫ۧۘۨۖۗۛۘۙۥۢ۟ۦۘۙۥۤۢۧ۟";
                    break;
                case 962535063:
                    disableLockForJID(str);
                    str3 = "ۖۖۥۘۤۤۛۙۦۦۨۜۖۘۦۦۘ۠ۚۘۘۗۗۡۘۜ۠ۖ";
                    break;
                case 1106900676:
                    str3 = "ۛ۫ۡۘۤۦۖۖۘۚۛۙۨۘۢ۟ۨ";
                    break;
                case 1598749529:
                    sb.append(str2);
                    str3 = "ۥۥۗۨۗۡۙ۟ۘۧۢۖۘ۟ۦۛ۬۠";
                    break;
                case 1876087065:
                    str3 = "ۚۚۦ۫ۙۘۡۤۤۢۨۨۨۡۚ";
                    break;
            }
        }
    }

    public static void disableAppLock() {
        String str = "ۧ۫ۘۘۧ۫ۦۘ۠ۙۘۘۙ۫ۨ۠ۖۘۘۛ۬ۤ";
        while (true) {
            switch ((str.hashCode() ^ 816) ^ 2097086525) {
                case -1151859983:
                    return;
                case -719769577:
                    shp.setBooleanPriv(PATTERN_LOCK, false);
                    str = "ۥ۬ۡۖۧۚۡۤ۠ۤ۟ۖۜۨۦ";
                    break;
                case -354205859:
                    shp.setBooleanPriv("applockV2", false);
                    str = "ۦۘۙۙۦۗۨۙۚۧۙ۫ۧۢۜۘ۠ۖۜۘ";
                    break;
                case 1094691232:
                    shp.setBooleanPriv(PIN_LOCK, false);
                    str = "۟۫ۘۘۛ۠ۦۘۡۤۜۘۥۧۦۘ۫۫۫ۤۤۧۧۜۗ";
                    break;
                case 1274500093:
                    shp.setBooleanPriv(FINGERPRINT_LOCK, false);
                    str = "ۙۘۗۜ۫ۦۘۗ۬ۜۥۛ۫ۙ۟ۖۨۖۘۚۡۘۗۜۥ";
                    break;
            }
        }
    }

    public static void disableLockForJID(String str) {
        String str2 = "ۧ۟ۦۥ۟ۜۨۙ۬ۨ۫ۥۘۖ۫ۢۢۧ۟";
        StringBuilder sb = null;
        StringBuilder sb2 = null;
        StringBuilder sb3 = null;
        String str3 = null;
        while (true) {
            switch ((str2.hashCode() ^ 979) ^ 763967094) {
                case -1974031550:
                    sb3.append(str3);
                    str2 = "۟ۘۦۛۥۜۛۙۜۥ۫ۖۘۦۛۚۛ۫۬ۨۖۨۚ";
                    break;
                case -1953279524:
                    sb2.append("_lockedpn");
                    str2 = "ۗ۟ۢۤۢ۟۟ۘ۬ۤ۬ۛۙۥۡۤۥۨ۬ۘۥۘ";
                    break;
                case -1898386691:
                    sb3.append("_locked");
                    str2 = "ۤۧۥ۠ۤ۬ۜۤۚ۬ۗۥۖۗۗۢۤۛۚۘۜۘ";
                    break;
                case -1401127509:
                    sb.append("_lockedfp");
                    str2 = "۬ۢۙ۬ۘۚۗۤۚۨۧۥۙۤۨۘ";
                    break;
                case -1247643410:
                    shp.setBooleanPriv(sb3.toString(), false);
                    str2 = "ۦۗۦ۠ۛۡۛۦ۫ۗۡۧۘۘۡۛۡۜۦۘ۟۫۟۠ۛۨۘۧۛ";
                    break;
                case -953104846:
                    str2 = "۠ۨۨۘۡۢۨۘۚۦۙ۫۟۠ۖ۠ۡ۫ۛۧۘۧۛ";
                    str3 = yo.stripJID(str);
                    break;
                case -492561256:
                    sb2.append(str3);
                    str2 = "ۛۨ۠ۙۖۚۢۤ۟ۧۘۗ۟ۙۥۦ۬ۗ";
                    break;
                case 284376770:
                    sb.append(str3);
                    str2 = "ۢ۟۟۬ۨ۬ۡۨ۠ۜ۟ۘۘۘۚۖۘ۫ۥ۬ۡۤۚۘۨۨۘ۟ۢۨ";
                    break;
                case 343694159:
                    str2 = "ۘۦۧۛۜ۫ۚۥۘۘۜ۠ۗۡۙۖۦۜ۟ۨۛۧۢۖۢۨ۠۫";
                    break;
                case 706636218:
                    shp.setBooleanPriv(sb.toString(), false);
                    str2 = "ۧۛ۬ۡۢۥۘ۬ۢۙۦۚۥۘ۟ۡۥۘۦۙ۟ۚۖۥۘ۫ۘۜۜ۬ۘۘ";
                    break;
                case 927948594:
                    return;
                case 1019212129:
                    sb = new StringBuilder();
                    str2 = "ۡۡۡۨۖۦ۠ۙۚۖۜ۫ۖۦۛۗۛۘ۫ۥۢ۟ۛۧ";
                    break;
                case 1224651736:
                    str2 = "ۖۛۗۤۘ۟ۛۜۦ۫۠ۗۜ۟۟۬ۢ۫ۙۢۛۥ۟";
                    sb2 = new StringBuilder();
                    break;
                case 1357151041:
                    str2 = "ۨۘۙۨۢۙ۬ۜۨۘۖ۫ۚۧۘۧ";
                    sb3 = new StringBuilder();
                    break;
                case 1901662717:
                    shp.setBooleanPriv(sb2.toString(), false);
                    str2 = "ۦ۫ۗ۫۫ۙ۠ۘ۬ۚ۬۠ۧۢ۠ۦۤۡۚ۟";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Class getAppLockType() {
        /*
            r2 = 0
            r5 = 0
            java.lang.String r0 = "۠ۢۜ۫ۧۖۧ۠۟ۛ۫۟ۦۤۙ۟ۤ"
            r1 = r2
            r3 = r2
            r4 = r2
        L_0x0007:
            int r6 = r0.hashCode()
            r7 = 76
            r8 = -274112324(0xffffffffefa960bc, float:-1.0483982E29)
            r6 = r6 ^ r7
            r6 = r6 ^ r8
            switch(r6) {
                case -1895563340: goto L_0x0020;
                case -1502456093: goto L_0x009c;
                case -1416547935: goto L_0x0069;
                case -1265919692: goto L_0x00c9;
                case -210502779: goto L_0x0040;
                case -37508586: goto L_0x00aa;
                case -5159289: goto L_0x0016;
                case 9410533: goto L_0x0097;
                case 77356652: goto L_0x00c3;
                case 278427242: goto L_0x001d;
                case 481611466: goto L_0x00d2;
                case 610882836: goto L_0x0092;
                case 720193530: goto L_0x0024;
                case 1023406409: goto L_0x00aa;
                case 1280420924: goto L_0x008c;
                case 1991976831: goto L_0x0065;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x0007
        L_0x0016:
            boolean r5 = isWAStockFPEnabled()
            java.lang.String r0 = "ۛ۠ۥ۟ۥۨۙۜۥۘۛۜۡۜۡۘۘۙۙۥۘ۫ۡ۫ۢۙۢۨ۠ۨ"
            goto L_0x0007
        L_0x001d:
            java.lang.String r0 = "۠ۨۧۘۦۙۥۨ۠۫ۗ۬ۦۨۧ۠ۚۚۦۘۛۧ۬"
            goto L_0x0007
        L_0x0020:
            java.lang.String r0 = "ۢۨۨۘۖۙۙ۠ۜۤۜ۠ۛۦ۟ۙ۫ۚۜۚۘۨۘ"
            r4 = r2
            goto L_0x0007
        L_0x0024:
            r6 = 2131353386(0x7f09df2a, float:1.8326297E38)
            java.lang.String r0 = "۟ۘۖۤۡۥۘۛ۠ۦۢ۠ۛۨۗۥۘ"
        L_0x0029:
            int r7 = r0.hashCode()
            r7 = r7 ^ r6
            switch(r7) {
                case -1016184162: goto L_0x003d;
                case -415240786: goto L_0x00aa;
                case 153776798: goto L_0x0032;
                case 1274380449: goto L_0x0038;
                default: goto L_0x0031;
            }
        L_0x0031:
            goto L_0x0029
        L_0x0032:
            java.lang.String r0 = "۟ۘ۠ۗۨ۬ۡ۬ۖۘۦۦۦۘۦۦۙۖۛ۠"
            goto L_0x0007
        L_0x0035:
            java.lang.String r0 = "ۨ۫۟۬ۢۛۚ۠ۗۗۛۚۘۙ۫ۢ۠ۜۘۚۗۨۘۚۗ۠ۡۘۛ"
            goto L_0x0029
        L_0x0038:
            if (r5 != 0) goto L_0x0035
            java.lang.String r0 = "۠ۖۥۘۡۙ۟۬ۨۘۗۦۛ۫ۛۦۘۜۧۥۘ۟ۢۜۜۗۚ"
            goto L_0x0029
        L_0x003d:
            java.lang.String r0 = "ۦۢۨ۬ۡۗۘ۫ۨۘۘۖۦۥۥۦۘۨۦۡۘ۠۬ۢۙۧۢ"
            goto L_0x0029
        L_0x0040:
            r6 = 860122464(0x33446d60, float:4.5734282E-8)
            java.lang.String r0 = "۠ۛۦۘ۠ۥۦۘۙۘۦۘۗ۟ۙۧۦۦۜ۫ۧ"
        L_0x0045:
            int r7 = r0.hashCode()
            r7 = r7 ^ r6
            switch(r7) {
                case -1356245730: goto L_0x005f;
                case -1218320718: goto L_0x004e;
                case -162543849: goto L_0x0062;
                case 517582253: goto L_0x0054;
                default: goto L_0x004d;
            }
        L_0x004d:
            goto L_0x0045
        L_0x004e:
            java.lang.String r0 = "ۨۜۡ۠۬ۦۘۛۚۤۨۜ۠ۖۨۙ۟ۛ"
            goto L_0x0007
        L_0x0051:
            java.lang.String r0 = "۫۠ۗ۬ۤۚۖۤۜۘۘۙۥۘ۟ۛۜۘۤۤۡۢۤ۟"
            goto L_0x0045
        L_0x0054:
            java.lang.String r0 = "lockedfp"
            boolean r0 = com.obwhatsapp.yo.shp.getBooleanPriv(r0)
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = "ۢۚ۬ۦ۬ۥۘ۟ۨۘۘ۠ۛۦۥۤۡۘۦۤۙۤۚۤ"
            goto L_0x0045
        L_0x005f:
            java.lang.String r0 = "ۨۜ۠ۖۘ۫۟۫ۥۘۡ۟ۚۘۙۘ"
            goto L_0x0045
        L_0x0062:
            java.lang.String r0 = "ۧۤۜۨۡۖۘۡۡۚۖۧۖۖۚۡۘۘۗۦۘۢۛۙ"
            goto L_0x0007
        L_0x0065:
            java.lang.String r0 = "ۤۨۦۡۡۘۘۢۘۜۘۨۧ۫۠ۛۨۧۖۦۡۘۥۧ۠۫"
            r4 = r2
            goto L_0x0007
        L_0x0069:
            r6 = -846059545(0xffffffffcd9227e7, float:-3.06511072E8)
            java.lang.String r0 = "ۖۦۖۦۖۘۨۗ۠ۘۚۖۘۤ۟ۥۘۚ۟ۨۘۗ۫ۛۦۛۥۤۤ"
        L_0x006e:
            int r7 = r0.hashCode()
            r7 = r7 ^ r6
            switch(r7) {
                case -1780958054: goto L_0x0088;
                case -264912488: goto L_0x0077;
                case -72922115: goto L_0x00ce;
                case 1632146147: goto L_0x0085;
                default: goto L_0x0076;
            }
        L_0x0076:
            goto L_0x006e
        L_0x0077:
            java.lang.String r0 = "locked"
            boolean r0 = com.obwhatsapp.yo.shp.getBooleanPriv(r0)
            if (r0 == 0) goto L_0x0082
            java.lang.String r0 = "ۧۡۛۢۨ۠ۛۡۗۗۗۚ۠ۚ۠"
            goto L_0x006e
        L_0x0082:
            java.lang.String r0 = "۫ۛۨۜۜ۬ۙۛۗ۟ۥۜۘۜۙۚ"
            goto L_0x006e
        L_0x0085:
            java.lang.String r0 = "۬۠ۚ۠ۙۡۜ۟۟ۧۡۦۘۨۙۥۗ۫۟"
            goto L_0x006e
        L_0x0088:
            java.lang.String r0 = "ۡۚۤ۠ۜۚ۫ۡ۠ۢۜۘ۟۟ۦ۫"
            goto L_0x0007
        L_0x008c:
            java.lang.Class<com.obwhatsapp.youbasha.ui.lockV2.locktypes.Pattern> r3 = com.obwhatsapp.youbasha.ui.lockV2.locktypes.Pattern.class
            java.lang.String r0 = "ۗۛۜۘ۬ۗ۫ۛۦۖۘۦۨۜۘۡۧۦۤۢۖۘۙۡۡ"
            goto L_0x0007
        L_0x0092:
            java.lang.String r0 = "ۥۛۖۘۚۛ۬ۗۗ۠ۗۤۥۚۙۤۦۥ۫ۥ۠۠ۥۙۜۨ۬"
            r4 = r3
            goto L_0x0007
        L_0x0097:
            java.lang.String r0 = "ۘۢۜۥۜۨۘۖۥ۫۬ۨۥۘۥۗ۠ۚ۫ۘۘۚۦۧ۬ۥۚ"
            r4 = r2
            goto L_0x0007
        L_0x009c:
            r6 = -1019440332(0xffffffffc33c9334, float:-188.57501)
            java.lang.String r0 = "ۚۢ۬ۨۗۙ۬۬ۧۙۘۦۖۤۢۙ۫ۥ"
        L_0x00a1:
            int r7 = r0.hashCode()
            r7 = r7 ^ r6
            switch(r7) {
                case -1882974447: goto L_0x00b1;
                case -377671807: goto L_0x00bc;
                case 19330368: goto L_0x00aa;
                case 136823153: goto L_0x00bf;
                default: goto L_0x00a9;
            }
        L_0x00a9:
            goto L_0x00a1
        L_0x00aa:
            java.lang.String r0 = "ۗۚۡۘۙۤ۠۠ۤۦۤۚۥۘۤۦ۟ۜۗۡۘ۠ۛ"
            goto L_0x0007
        L_0x00ae:
            java.lang.String r0 = "ۙ۬۬ۗۘۘۘۛۜۢۚۜۨ۟ۘۡۙۛۧ۠ۗۘۢۤۛ"
            goto L_0x00a1
        L_0x00b1:
            java.lang.String r0 = "lockedpn"
            boolean r0 = com.obwhatsapp.yo.shp.getBooleanPriv(r0)
            if (r0 == 0) goto L_0x00ae
            java.lang.String r0 = "۠۟ۘۘۜ۠۠ۦۡۜۤ۬ۥۘ۟۬۟ۤۤۖۘ"
            goto L_0x00a1
        L_0x00bc:
            java.lang.String r0 = "ۥۜ۫ۨۖۧۘۚۦۘۤ۠ۥۘۦۘۙۡۘۡۗۥۘ۠ۥۦۨۡ۠"
            goto L_0x00a1
        L_0x00bf:
            java.lang.String r0 = "ۨ۟ۘۚۧۨۡۙ۠ۗۚ۫ۚ۫ۧۖۘۚۚۚ"
            goto L_0x0007
        L_0x00c3:
            java.lang.Class<com.obwhatsapp.youbasha.ui.lockV2.locktypes.Pin> r1 = com.obwhatsapp.youbasha.ui.lockV2.locktypes.Pin.class
            java.lang.String r0 = "۬ۤ۠ۛۥۦۘۘۧۨ۬ۙۡ۬ۡۜۧۘۚ۫ۘۖۚۦۘ"
            goto L_0x0007
        L_0x00c9:
            java.lang.String r0 = "ۗۚۡۘۙۤ۠۠ۤۦۤۚۥۘۤۦ۟ۜۗۡۘ۠ۛ"
            r4 = r1
            goto L_0x0007
        L_0x00ce:
            java.lang.String r0 = "ۗۦۛۦۦۜۢۤۡۘۥ۬ۥۘۗۤۥ"
            goto L_0x0007
        L_0x00d2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.lockV2.LockUtils.getAppLockType():java.lang.Class");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x011f, code lost:
        r0 = "۫ۘۧ۟ۖ۟ۖۡۜۘۗۧۖ۟ۥۢ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Class<?> getLockTypeByJID(java.lang.String r12) {
        /*
            r2 = 0
            java.lang.String r0 = "۠۫ۨ۟ۛۘۘ۬ۙۘۘ۟ۜۜۘ۫ۙۚۘۖۜۘ"
            r1 = r2
            r3 = r2
            r4 = r2
            r5 = r2
            r6 = r2
            r7 = r2
            r8 = r2
        L_0x000a:
            int r9 = r0.hashCode()
            r10 = 5
            r11 = 1164773426(0x456d0832, float:3792.5122)
            r9 = r9 ^ r10
            r9 = r9 ^ r11
            switch(r9) {
                case -2134395829: goto L_0x0031;
                case -1734040113: goto L_0x001b;
                case -1600976119: goto L_0x0074;
                case -1582704627: goto L_0x006c;
                case -1472082527: goto L_0x0103;
                case -1365259419: goto L_0x0029;
                case -1310743353: goto L_0x00a4;
                case -1244512274: goto L_0x0127;
                case -954017744: goto L_0x0018;
                case -687784506: goto L_0x00bd;
                case -606605024: goto L_0x0099;
                case -250279699: goto L_0x0123;
                case -91188226: goto L_0x0023;
                case -88503787: goto L_0x005a;
                case 232708927: goto L_0x009f;
                case 463629304: goto L_0x0055;
                case 543069096: goto L_0x00b4;
                case 712724860: goto L_0x010e;
                case 976688384: goto L_0x0112;
                case 1427231507: goto L_0x0109;
                case 1672142378: goto L_0x00e2;
                case 1681483846: goto L_0x005e;
                case 1758906795: goto L_0x00ad;
                case 1842759922: goto L_0x0066;
                case 1877655252: goto L_0x0123;
                case 2145506609: goto L_0x0123;
                default: goto L_0x0017;
            }
        L_0x0017:
            goto L_0x000a
        L_0x0018:
            java.lang.String r0 = "۫ۢۜۘۜۘۥۘۤۙۨۘۤۘۦۛۦۦۘ۬ۦ۬۫ۡۘ"
            goto L_0x000a
        L_0x001b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "ۚۦ۫ۗۗۦۨۜۘۘۙ۬ۥۘۢۤ۬"
            goto L_0x000a
        L_0x0023:
            r8.append(r12)
            java.lang.String r0 = "ۨۜۛ۠ۤ۬ۙۜۖۘۚ۟ۥۛ۠۫ۚۛۘۨۘۖۥۜ"
            goto L_0x000a
        L_0x0029:
            java.lang.String r0 = "_locked"
            r8.append(r0)
            java.lang.String r0 = "ۘۤۚۚۥۧۘۘۡۙ۟ۡۡۛۧۡۘ"
            goto L_0x000a
        L_0x0031:
            r9 = -1972132130(0xffffffff8a73a6de, float:-1.1731409E-32)
            java.lang.String r0 = "ۘۖ۫ۘۥۙۤۨۧۘۧۘۡ۫ۧۧۦۛۥۘۘ۬ۛۥۚۦۘ"
        L_0x0036:
            int r10 = r0.hashCode()
            r10 = r10 ^ r9
            switch(r10) {
                case -1989167227: goto L_0x0052;
                case 342425155: goto L_0x0117;
                case 1764917705: goto L_0x0045;
                case 1803760675: goto L_0x003f;
                default: goto L_0x003e;
            }
        L_0x003e:
            goto L_0x0036
        L_0x003f:
            java.lang.String r0 = "ۤۦۦۘ۠ۧۛۖۙ۟ۚۜۖۘۛ"
            goto L_0x0036
        L_0x0042:
            java.lang.String r0 = "ۖۤ۠ۥۚۨۘ۟ۨۢۛۗۨ۟۠ۜۘۖۗۥ"
            goto L_0x0036
        L_0x0045:
            java.lang.String r0 = r8.toString()
            boolean r0 = com.obwhatsapp.yo.shp.getBooleanPriv(r0)
            if (r0 == 0) goto L_0x0042
            java.lang.String r0 = "ۗ۠ۢۧ۫ۜۦۛۜۘۘ۟ۘۘۖۡۜۥۚۚۛۡۜۦۘۘۘ"
            goto L_0x0036
        L_0x0052:
            java.lang.String r0 = "۠۟۫ۥۤۙۖۚ۫ۦۖۡۘۤ۠ۡ۟ۧۨۘ۫ۡۥۘ۠ۧۖۘ"
            goto L_0x000a
        L_0x0055:
            java.lang.Class<com.obwhatsapp.youbasha.ui.lockV2.locktypes.Pattern> r7 = com.obwhatsapp.youbasha.ui.lockV2.locktypes.Pattern.class
            java.lang.String r0 = "ۦ۫۠ۤۢۖۘۖۛۖۘۜۙۡ۬۟ۘۜۤ۠۬ۚۥ"
            goto L_0x000a
        L_0x005a:
            java.lang.String r0 = "ۦۜۢ۫ۨۦۘۚۜۖۘۨۖۨۘۥۦۜۘۚ۬ۘ۬ۢۦۘۚۗۦۘ"
            r6 = r7
            goto L_0x000a
        L_0x005e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "ۙۥۗۨۥۥۘۥۦۗۙ۫ۥۛۚۘ۟ۢۢ۬ۗ۫ۢۖۛ"
            goto L_0x000a
        L_0x0066:
            r5.append(r12)
            java.lang.String r0 = "ۖ۫ۧۦۘ۠ۨۘۦۘۦۙۥۥۥۘۤ۟ۘۤۛۦۚ۫ۖۜ۫ۜۘ"
            goto L_0x000a
        L_0x006c:
            java.lang.String r0 = "_lockedpn"
            r5.append(r0)
            java.lang.String r0 = "ۙۤ۫ۦۢۗۖ۫ۧۢۖۘۥ۠۫ۜۤۡۘۙۙ۠"
            goto L_0x000a
        L_0x0074:
            r9 = -1563934096(0xffffffffa2c84270, float:-5.428045E-18)
            java.lang.String r0 = "۬ۦۤۙۤۦ۬ۤۢۦۡۛۦۚۗۡۛۨۘ۫ۢۨۦۧۘۨۘ۫"
        L_0x0079:
            int r10 = r0.hashCode()
            r10 = r10 ^ r9
            switch(r10) {
                case -1147615425: goto L_0x0082;
                case 250843866: goto L_0x0092;
                case 611923301: goto L_0x0095;
                case 1683712104: goto L_0x011b;
                default: goto L_0x0081;
            }
        L_0x0081:
            goto L_0x0079
        L_0x0082:
            java.lang.String r0 = r5.toString()
            boolean r0 = com.obwhatsapp.yo.shp.getBooleanPriv(r0)
            if (r0 == 0) goto L_0x008f
            java.lang.String r0 = "ۙۘ۠ۦۗ۫ۧۡۘۗ۠ۥۚۛ۬ۖۨۘۜۧۧ"
            goto L_0x0079
        L_0x008f:
            java.lang.String r0 = "ۢۥۗ۫۬ۥ۬ۨۤۨۛۨۖۦۜ۫ۥۡ"
            goto L_0x0079
        L_0x0092:
            java.lang.String r0 = "ۚۤۛۦۨۥۦۢۜۘۨۜۥۘۥۢۗ۠ۢۙۘۢۤۗۧۥۘۙۖۡ"
            goto L_0x0079
        L_0x0095:
            java.lang.String r0 = "۫۟ۨۘ۠ۚۖ۟۬۠ۗۧ۟ۧۙۧۗۛۦۘ"
            goto L_0x000a
        L_0x0099:
            java.lang.Class<com.obwhatsapp.youbasha.ui.lockV2.locktypes.Pin> r4 = com.obwhatsapp.youbasha.ui.lockV2.locktypes.Pin.class
            java.lang.String r0 = "ۖۨۚ۠ۡۗۖۖۨۘ۬ۢۡۦ۫ۖۘۙۧۜۜۛۖۛۦ"
            goto L_0x000a
        L_0x009f:
            java.lang.String r0 = "ۢ۟ۦۛۦۖۘۥۚۜ۫۬ۛۥۨ۬ۚ۟ۖۥۖ۠ۧۘۜۘ۠ۜۡ"
            r6 = r4
            goto L_0x000a
        L_0x00a4:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "ۖۛۥۘۖۦۙۤۘۦۘ۬ۜۨۘۖۧ۟ۗۛۤۤۥۘۨۥۧۨۨۘ"
            goto L_0x000a
        L_0x00ad:
            r3.append(r12)
            java.lang.String r0 = "ۦۘۜۘۤۚۦۚۙ۠ۗۖۘۘۜۛۖۘ"
            goto L_0x000a
        L_0x00b4:
            java.lang.String r0 = "_lockedfp"
            r3.append(r0)
            java.lang.String r0 = "ۖ۟ۘۧ۠ۨۘۙۥۥۢۗۖۙ۬ۤۦۦ"
            goto L_0x000a
        L_0x00bd:
            r9 = 682710349(0x28b1554d, float:1.9687941E-14)
            java.lang.String r0 = "ۢۚۜۘۡۚۥۚۘۙ۟۠ۡۘ۟ۨ"
        L_0x00c2:
            int r10 = r0.hashCode()
            r10 = r10 ^ r9
            switch(r10) {
                case -402334007: goto L_0x00db;
                case 363354613: goto L_0x00de;
                case 1667373385: goto L_0x00cb;
                case 1902548840: goto L_0x011f;
                default: goto L_0x00ca;
            }
        L_0x00ca:
            goto L_0x00c2
        L_0x00cb:
            java.lang.String r0 = r3.toString()
            boolean r0 = com.obwhatsapp.yo.shp.getBooleanPriv(r0)
            if (r0 == 0) goto L_0x00d8
            java.lang.String r0 = "۫ۧۢۦۙ۬ۢۦۥۜ۟ۗۧۥۨ"
            goto L_0x00c2
        L_0x00d8:
            java.lang.String r0 = "۠ۖۘۘۡۚۦۥۡۤ۠ۘۦ۟ۢۗۙۤۧ"
            goto L_0x00c2
        L_0x00db:
            java.lang.String r0 = "ۜ۠ۖۖۙۖ۬ۙۛ۬۟ۜۖۚ۬ۚۦ۬ۤۗۦۥۦۘ"
            goto L_0x00c2
        L_0x00de:
            java.lang.String r0 = "۬ۨۦۘ۟۬۠۟۫۫ۧۡۨۘ۟ۧۘۘۢ۠۟ۥۡۚۦۚ"
            goto L_0x000a
        L_0x00e2:
            r9 = -204939013(0xfffffffff3c8e0fb, float:-3.183052E31)
            java.lang.String r0 = "ۘ۬ۖۗۧۘۘۚ۠ۨۘ۠ۥۦ۫ۗۧۥۘۚ"
        L_0x00e7:
            int r10 = r0.hashCode()
            r10 = r10 ^ r9
            switch(r10) {
                case -885849458: goto L_0x00f0;
                case 628139267: goto L_0x0100;
                case 732483198: goto L_0x00f7;
                case 2105803618: goto L_0x011f;
                default: goto L_0x00ef;
            }
        L_0x00ef:
            goto L_0x00e7
        L_0x00f0:
            java.lang.String r0 = "ۙۜۡۥۜۨۘۚۥۜ۠ۚۨۘ۫ۛۨۘ"
            goto L_0x000a
        L_0x00f4:
            java.lang.String r0 = "۫ۢۧۡۥۡۘۖ۬ۘۡۙۚۦۨۗۗۘۘۘۡۙۛۛ۠ۜۘ"
            goto L_0x00e7
        L_0x00f7:
            boolean r0 = isFingerPrintAvailable()
            if (r0 == 0) goto L_0x00f4
            java.lang.String r0 = "۬ۙۢۖۥۨۡۜۛۘ۫ۡۙۥۨۘ۫ۚۖۗۢۜ"
            goto L_0x00e7
        L_0x0100:
            java.lang.String r0 = "۟ۙۨۘۤ۫۫ۥۙۤۗۜ۟۟ۙۡۘ"
            goto L_0x00e7
        L_0x0103:
            java.lang.Class<com.obwhatsapp.authentication.AppAuthenticationActivity> r1 = com.obwhatsapp.authentication.AppAuthenticationActivity.class
            java.lang.String r0 = "۟۟ۦۘۛۤۜ۫۬ۡۘ۟ۥۡۘۜۤۢ"
            goto L_0x000a
        L_0x0109:
            java.lang.String r0 = "ۧۡۡ۫ۨۙ۟۫۠ۜۤۜۨۖۘۢۛۖۘۘۤۨ۬ۢۨ"
            r6 = r1
            goto L_0x000a
        L_0x010e:
            java.lang.String r0 = "ۙۧۢ۫ۦۖۡۖۨۘ۟ۤۨۚۢۗۡ۬ۘۥۤ۫"
            goto L_0x000a
        L_0x0112:
            java.lang.String r0 = "ۚ۟۠ۥۚۖۙۡ۟ۗ۬ۜۘۗۖ۬۬ۜۦۘۦۤۜۚۛ۫"
            r6 = r2
            goto L_0x000a
        L_0x0117:
            java.lang.String r0 = "۬ۖ۬۫ۤۥۙۡۗ۬ۘۙۘۛۚ۬۠ۙۥ۠"
            goto L_0x000a
        L_0x011b:
            java.lang.String r0 = "ۘۨۜۘۖۢۘ۫ۚۜۘۡۡۘۢ۠ۛ"
            goto L_0x000a
        L_0x011f:
            java.lang.String r0 = "۫ۘۧ۟ۖ۟ۖۡۜۘۗۧۖ۟ۥۢ"
            goto L_0x000a
        L_0x0123:
            java.lang.String r0 = "ۚ۟۠ۥۚۖۙۡ۟ۗ۬ۜۘۗۖ۬۬ۜۦۘۦۤۜۚۛ۫"
            goto L_0x000a
        L_0x0127:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.lockV2.LockUtils.getLockTypeByJID(java.lang.String):java.lang.Class");
    }

    public static boolean isFingerPrintAvailable() {
        String str = "ۤۡۡۨۚۥۛۖۧۘۢۢۦۘۚۦۗۛۖۧۘۧۜۧۘۗ۫ۚۖۜۘ";
        while (true) {
            try {
                switch (str.hashCode() ^ 882146388) {
                    case -1195074372:
                        boolean hasFingerprintRegistered = utils.hasFingerprintRegistered();
                        String str2 = "ۤ۫ۜۛۡ۬ۜۗ۠۠ۛ۟ۢ۟ۖ";
                        while (true) {
                            switch (str2.hashCode() ^ 442182239) {
                                case -425040650:
                                    if (!hasFingerprintRegistered) {
                                        str2 = "ۗۡ۠ۗۧۛۤ۟ۖۘۢ۫ۢۚۖ۠۫ۡۦۤۜۜۘ";
                                        break;
                                    } else {
                                        str2 = "ۤ۬ۥۤۛۡ۟۫ۙۗۙۗۤ۫۬ۡۗۡۘۚۘ۟۫ۛۜ";
                                        break;
                                    }
                                case -357178539:
                                    return true;
                                case -232347848:
                                    return false;
                                case 1811696311:
                                    str2 = "ۙۦۨۦۙۢ۬ۜۥ۫ۤۦۘۙۤۖۖ۫ۢۛ۠ۦۘۨۚۦۘۗۦۢ";
                                    break;
                            }
                        }
                        break;
                    case -13934840:
                        if (!utils.isFingerprintAvailable()) {
                            str = "ۛۖۚۨ۠ۥۘۧۢۘۘۤ۬۬۫ۘۘۦۦۜۘ";
                            break;
                        } else {
                            str = "ۢ۬ۚۧۚۚۢۥۡۚۥۨۧۜ۠ۚ۠ۧ";
                            break;
                        }
                    case 180679096:
                        str = "۬ۜۜۤۚۦۡۜۨۖۢۚۡ۟۫";
                        break;
                    case 731231900:
                        return false;
                }
            } catch (Exception e2) {
                return false;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isJIDLocked(java.lang.String r11) {
        /*
            r5 = 0
            r2 = 0
            java.lang.String r0 = "ۙۙۡۘۚۖ۬ۡ۬ۘۘ۫ۢۜۘۜۦۧۘۤۥۦۘۘۨ۟ۦۘۥۘ۟ۢۖ"
            r1 = r2
            r3 = r2
            r4 = r5
            r6 = r5
            r7 = r5
            r8 = r5
        L_0x000a:
            int r5 = r0.hashCode()
            r9 = 877(0x36d, float:1.229E-42)
            r10 = 610758304(0x24676ea0, float:5.0183843E-17)
            r5 = r5 ^ r9
            r5 = r5 ^ r10
            switch(r5) {
                case -2142709806: goto L_0x003b;
                case -2129159388: goto L_0x0024;
                case -2083512932: goto L_0x0068;
                case -1626064727: goto L_0x0019;
                case -1480915522: goto L_0x002d;
                case -1140222067: goto L_0x00dd;
                case -1092501384: goto L_0x009b;
                case -1012383434: goto L_0x00f4;
                case -399533758: goto L_0x00f0;
                case -155637915: goto L_0x001c;
                case -18129623: goto L_0x00f8;
                case 346606742: goto L_0x005f;
                case 425505336: goto L_0x0076;
                case 459310330: goto L_0x00e7;
                case 1324463136: goto L_0x00d9;
                case 1357888935: goto L_0x00e2;
                case 1471508545: goto L_0x006e;
                case 1564333947: goto L_0x00b4;
                case 1566165770: goto L_0x0033;
                case 1864622445: goto L_0x00ab;
                case 1961472876: goto L_0x00a4;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x000a
        L_0x0019:
            java.lang.String r0 = "۫ۢۘۙۡ۬ۗۡۥۘۧۦۨۘۗۜۡۦ۫۠ۥۛ۬"
            goto L_0x000a
        L_0x001c:
            java.lang.String r5 = com.obwhatsapp.yo.yo.stripJID(r11)
            java.lang.String r0 = "ۧۨۥۚۘ۬۠۬ۦۨۜۥۨۖۘ"
            r8 = r5
            goto L_0x000a
        L_0x0024:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "ۧۖۦۖۢۚۗ۟ۨ۟ۜۘۘۨۙۗۦۙ"
            r7 = r5
            goto L_0x000a
        L_0x002d:
            r7.append(r8)
            java.lang.String r0 = "ۜ۟ۙۡۜۦ۬ۨۧۘۦۤۦۘۜۥۢ"
            goto L_0x000a
        L_0x0033:
            java.lang.String r0 = "_locked"
            r7.append(r0)
            java.lang.String r0 = "ۙۘۜۧ۬ۘ۬ۖ۟ۘ۫ۙۘۚۨ"
            goto L_0x000a
        L_0x003b:
            r5 = -1329738671(0xffffffffb0bdcc51, float:-1.380963E-9)
            java.lang.String r0 = "ۧۤۦۘۧۧۛ۟ۛ۫۬ۜۛۡۤۥۘۥۢۥۘ"
        L_0x0040:
            int r9 = r0.hashCode()
            r9 = r9 ^ r5
            switch(r9) {
                case -1550541313: goto L_0x0049;
                case -1318797772: goto L_0x00f0;
                case -1041014659: goto L_0x005c;
                case 644465258: goto L_0x0059;
                default: goto L_0x0048;
            }
        L_0x0048:
            goto L_0x0040
        L_0x0049:
            java.lang.String r0 = r7.toString()
            boolean r0 = com.obwhatsapp.yo.shp.getBooleanPriv(r0)
            if (r0 != 0) goto L_0x0056
            java.lang.String r0 = "ۧۢۖۙۤۦۘۥۥۗۢۖۧ۫ۘۖۗ۫ۤ"
            goto L_0x0040
        L_0x0056:
            java.lang.String r0 = "ۥ۟ۜۦۢۜۘ۫ۤ۠ۚۥۜۨۙۙ۬ۡۡۘۙۤۜۘۚ۠ۢ"
            goto L_0x0040
        L_0x0059:
            java.lang.String r0 = "ۦۚۨۘۢۚۙۗ۬ۚۖۜۘۢۨۖۘۢۤ۠"
            goto L_0x0040
        L_0x005c:
            java.lang.String r0 = "۠ۘۥ۟ۛۖۛۘۘۘۚۗۡۘ۫ۘۦ"
            goto L_0x000a
        L_0x005f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "ۛۢۚ۬ۨۚۛ۠ۚ۟ۚۢۧۛ۠ۨ۟ۡۡۡۦۖۜ"
            r6 = r5
            goto L_0x000a
        L_0x0068:
            r6.append(r8)
            java.lang.String r0 = "ۙۙۥۘۙۖ۬ۜ۫ۨۘۡۜۢۗ۫ۨۨۢ۫ۙۧ۠ۨۛۨۘ"
            goto L_0x000a
        L_0x006e:
            java.lang.String r0 = "_lockedpn"
            r6.append(r0)
            java.lang.String r0 = "ۡۙۦ۬ۘۚۗۡۘۖ۠ۖۘ۫ۧ۟ۧۦۘۧ۬ۘۘ"
            goto L_0x000a
        L_0x0076:
            r5 = -579345102(0xffffffffdd77e532, float:-1.11642115E18)
            java.lang.String r0 = "ۙ۫ۦۤۙۡ۠ۗۙ۫ۘۨۚۢ۠"
        L_0x007b:
            int r9 = r0.hashCode()
            r9 = r9 ^ r5
            switch(r9) {
                case 284267297: goto L_0x0094;
                case 357394743: goto L_0x00f0;
                case 575949060: goto L_0x0097;
                case 1552914709: goto L_0x0084;
                default: goto L_0x0083;
            }
        L_0x0083:
            goto L_0x007b
        L_0x0084:
            java.lang.String r0 = r6.toString()
            boolean r0 = com.obwhatsapp.yo.shp.getBooleanPriv(r0)
            if (r0 != 0) goto L_0x0091
            java.lang.String r0 = "ۗۨۦۙ۫ۤۨۙۜۨۦۘۧۗۨۘۚۛۖۘۧۥۥ۫ۤۖۘ"
            goto L_0x007b
        L_0x0091:
            java.lang.String r0 = "ۘۛۜۥۛ۬ۢۨ۬ۡ۬ۘۘۨ۠ۨۘۛۡۖۘۢۥ۬"
            goto L_0x007b
        L_0x0094:
            java.lang.String r0 = "ۙۙۥ۠۟ۗۢ۫۬ۖ۫ۘۘۛۜۨۘ"
            goto L_0x007b
        L_0x0097:
            java.lang.String r0 = "ۥۙۧۦۥۘ۫ۤۧۦۢۜۘ۫۬ۖ"
            goto L_0x000a
        L_0x009b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "ۦ۟ۖۡۛۥۘۚۛ۬ۗۦ۟ۦۛۥۤۛۘۢۘۗ"
            goto L_0x000a
        L_0x00a4:
            r4.append(r8)
            java.lang.String r0 = "۬ۜۨۘۚۧۗۛۘۥۜۗۜۚۦۤۖۢۦۘ۠ۦۘۘۨۥۙ۬ۡۘ"
            goto L_0x000a
        L_0x00ab:
            java.lang.String r0 = "_lockedfp"
            r4.append(r0)
            java.lang.String r0 = "ۚۥ۫ۙۡۗ۠ۥۥۧۥۜ۠ۘۚۛۤۘۦ۬ۧۖۘ۟"
            goto L_0x000a
        L_0x00b4:
            r5 = 1624543907(0x60d492a3, float:1.2253988E20)
            java.lang.String r0 = "ۧۧۘۡۗ۟ۡۜۦۘۙۡۡۥۤۦۘۨۗۜ۫ۦ۬ۖۗۨۘ"
        L_0x00b9:
            int r9 = r0.hashCode()
            r9 = r9 ^ r5
            switch(r9) {
                case -1515722558: goto L_0x00c8;
                case -72049662: goto L_0x00d5;
                case 162078040: goto L_0x00c2;
                case 1909044443: goto L_0x00ec;
                default: goto L_0x00c1;
            }
        L_0x00c1:
            goto L_0x00b9
        L_0x00c2:
            java.lang.String r0 = "ۤۜۡ۠ۧۦ۠ۤۨ۫ۤۜۘۧۥۜۘۡۤۨۜۡ۟۫ۚ"
            goto L_0x00b9
        L_0x00c5:
            java.lang.String r0 = "ۨ۬ۦۘۧۖۧۘۧۘۛۚۡۘۘۢ۫ۜ"
            goto L_0x00b9
        L_0x00c8:
            java.lang.String r0 = r4.toString()
            boolean r0 = com.obwhatsapp.yo.shp.getBooleanPriv(r0)
            if (r0 == 0) goto L_0x00c5
            java.lang.String r0 = "ۧۛۦۖۜ۟ۚ۠ۨۦۘۘۖۗۘۤ۠ۦۢۥۥۧ۬ۦۘ"
            goto L_0x00b9
        L_0x00d5:
            java.lang.String r0 = "ۢۤ۠ۥۚ۬۠ۖۚۜ۠ۨۦۡۡۚۜ"
            goto L_0x000a
        L_0x00d9:
            java.lang.String r0 = "ۛ۠۫ۤۚۙۛۜۘ۬۟ۨۢ۫ۨۨۡۦ۬ۧۤ۟ۧۦۘۨۚ۬"
            goto L_0x000a
        L_0x00dd:
            java.lang.String r0 = "۫ۜۡۥۧۚۖۚۨۘۢۛۦۘۨۨۦۦۡۙۙۛۙۦ۬ۙ"
            r3 = r2
            goto L_0x000a
        L_0x00e2:
            r1 = 1
            java.lang.String r0 = "ۛۨۤۗ۠ۨۘ۫ۛۡۘۢۥۥۘۚۖ۬ۤۧ۫ۨۦۦۘۦۥ۫"
            goto L_0x000a
        L_0x00e7:
            java.lang.String r0 = "ۜۛۢۙۖۨ۠ۖۨ۬۠ۦ۫ۛ۬ۛۙۦۘ"
            r3 = r1
            goto L_0x000a
        L_0x00ec:
            java.lang.String r0 = "ۖۦۦۜۦۢۢۨۗ۟ۥ۠ۨۡۘ۟ۛۡ۫ۦۜۘۡۦۗۦۥۖ"
            goto L_0x000a
        L_0x00f0:
            java.lang.String r0 = "ۗۨۘۢ۟ۡۘۥۤۥۧ۠ۘۜۢۡۦۚۨۘۤۥۙۢ۬ۚۦۡۨ"
            goto L_0x000a
        L_0x00f4:
            java.lang.String r0 = "ۜۛۢۙۖۨ۠ۖۨ۬۠ۦ۫ۛ۬ۛۙۦۘ"
            goto L_0x000a
        L_0x00f8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.lockV2.LockUtils.isJIDLocked(java.lang.String):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isWAStockFPEnabled() {
        /*
            java.lang.String r0 = "ۛۜۘ۠ۤۖۙۘۥۙۗۡۘۨۛۜۢۧۜۘۗ۬ۢ۟۠ۨۘۜۜۥۘ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 565(0x235, float:7.92E-43)
            r3 = 645156085(0x26744cf5, float:8.47588E-16)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -735390201: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            android.content.SharedPreferences r0 = com.obwhatsapp.yo.shp.stockPrefsLight
            java.lang.String r1 = "privacy_fingerprint_enabled"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.lockV2.LockUtils.isWAStockFPEnabled():boolean");
    }

    public static void showAvailableLockTypes(Activity activity, LockOptions lockOptions) {
        String str = "ۛۖۖۘۦۜۘۡۨۘۨۜۢۨۢۦۦۥۘ";
        Bundle bundle = null;
        CharSequence[] charSequenceArr = null;
        CharSequence[] charSequenceArr2 = null;
        CharSequence[] charSequenceArr3 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            switch ((str.hashCode() ^ 187) ^ -1419208401) {
                case -2131894725:
                    str = "ۙ۠ۛۤۜۘۘۥ۠ۙۥۦۦۘ۬ۙۡۗ۟ۙ۫ۜ۠ۘ۟۬";
                    break;
                case -2005415277:
                    charSequenceArr3[1] = str4;
                    str = "ۙۢۨۘۥ۠ۥۘۤۜۦۘۤۥۦۡۥۡۨۘۜۘ۬ۙۥ";
                    break;
                case -1794809156:
                    str = "۬ۥۦۘۜۦۨۘۗۖۘۛۦۧۘ۬۟ۤۜۨۥ";
                    charSequenceArr2 = charSequenceArr;
                    break;
                case -1645559164:
                    charSequenceArr[1] = str4;
                    str = "ۗۖۡۘۛۥۘۜۤۡۢۢۖۘ۫ۧۡۘۛ۠ۢۥۡ۫";
                    break;
                case -1524727621:
                    charSequenceArr3 = new CharSequence[3];
                    str = "ۖۘ۟ۚۦ۫ۙ۫ۧۥ۫ۗۙۖۤۡ۟ۘۘۘۘۜۘۘۚۖۧ۫۫";
                    break;
                case -1233168463:
                    str = "ۡۚۥۥۥۜۡۦۦ۠ۦۙۧ۟۬ۗۙۛۖۥۖۘ۬ۙۛ";
                    charSequenceArr = new CharSequence[2];
                    break;
                case -1168980766:
                    charSequenceArr3[0] = str3;
                    str = "ۛۨۡۘ۟ۗۙۨ۬ۘۥۖۨ۟ۦ";
                    break;
                case -1145589086:
                    charSequenceArr[0] = str3;
                    str = "ۖ۫ۛ۬۫۬ۚۗۥۘ۠ۛ۬ۖۛۘ۫ۦۜۘ";
                    break;
                case -806331642:
                    String str5 = "۠ۛۦۙۘۚۡۗۘ۬ۚۖۘ۬ۡۜ";
                    while (true) {
                        switch (str5.hashCode() ^ 1325766151) {
                            case -213723455:
                                str = "۟ۥۨۘ۬ۡۢۖ۟ۨۘ۬ۦۧۤۘۙۦۛ۟ۗۥۚ۟ۚۨۖۡۡۘ";
                                continue;
                            case -75045630:
                                if (!utils.isFingerprintAvailable()) {
                                    str5 = "ۧۘ۠ۙۘۜ۬ۢۦۘۗۤۖۘۤۙ۠";
                                    break;
                                } else {
                                    str5 = "۬ۨۚۙۗۥۜۚۧۖۢۥۨ۬";
                                    break;
                                }
                            case 878921819:
                                str = "ۜۙ۠ۘ۫ۜۘۙۤ۟ۛۨۢۧ۬ۤۙ۬ۖۦۗۛۦۜۘ";
                                continue;
                            case 2068277690:
                                str5 = "ۦۧۦۘۥ۬ۖۘ۠۠۬ۥۛۘۘ۠ۤۦۘۤۧۛ";
                                break;
                        }
                    }
                    break;
                case -682951849:
                    new CustomAlertDialogBuilder(activity).setTitle((CharSequence) yo.getString("Choose_lock")).setItems(charSequenceArr2, (DialogInterface.OnClickListener) new m(activity, bundle, lockOptions, 1)).create().show();
                    str = "۠۟ۥۘۨ۫۫ۗ۫ۖۘۥۛ۟۟ۦۦۜۨۨ۟ۗۗۗۜ";
                    break;
                case -225540009:
                    charSequenceArr3[2] = str2;
                    str = "ۤ۠ۧ۠ۦۘۘۡ۬ۚۙۘۡ۬ۘۖۘۘۦ۬ۚۡۘۥ۬ۜۘ";
                    break;
                case -60038138:
                    str = "ۗۜۙ۟۫۬ۛ۬ۖۘۙۦۘۗۖۜۜۙ۠";
                    str2 = yo.getString("locktype_fingerprint");
                    break;
                case -24359572:
                    str = "ۨۡۧۘۧۥۛۤ۫۫ۖۜۦۤ۬ۗۘۡۖۘۜۚۗ";
                    break;
                case 23377030:
                    str = "ۛۧۘۘۦ۠ۘۦۖۛ۟ۧۨۘۖۤۚۛۤۧۨۗ";
                    str3 = yo.getString("locktype_pattern");
                    break;
                case 404862245:
                    str = "۬ۥۦۘۜۦۨۘۗۖۘۛۦۧۘ۬۟ۤۜۨۥ";
                    break;
                case 445707692:
                    bundle = lockOptions.getBundle();
                    str = "ۗۡۜۘۨ۠۠ۖۚۜۘۥۚۥۘۦ۠ۧ";
                    break;
                case 997116798:
                    return;
                case 1994961946:
                    str = "ۤۗۘۘۘ۟ۙۢۛۧ۬ۛۘۨۗۘ۠ۦۤ۟ۥۧ";
                    str4 = yo.getString("locktype_pin");
                    break;
                case 2008972188:
                    str = "ۗ۟ۡۘۢۜۘۘ۟ۚ۬ۜۚۘۖۚ۟ۥۘ۫ۤۡ۟ۘۦ";
                    charSequenceArr2 = charSequenceArr3;
                    break;
            }
        }
    }
}
