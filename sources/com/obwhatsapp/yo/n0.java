package com.obwhatsapp.yo;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.media.MediaMetadataRetriever;
import c.d;
import com.obwhatsapp.mediacomposer.MediaComposerActivity;
import com.obwhatsapp.youbasha.task.utils;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;

public final class n0 extends Thread {

    /* renamed from: f  reason: collision with root package name */
    public static final int f826f = 0;

    /* renamed from: a  reason: collision with root package name */
    public boolean f827a;

    /* renamed from: b  reason: collision with root package name */
    public final Activity f828b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f829c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final ProgressDialog f830d;

    /* renamed from: e  reason: collision with root package name */
    public final File f831e;

    public n0(Activity activity) {
        this.f828b = activity;
        this.f827a = false;
        ProgressDialog progressDialog = new ProgressDialog(activity);
        this.f830d = progressDialog;
        progressDialog.setProgressStyle(1);
        progressDialog.setTitle(yo.getString("settings_backup_db_now_message"));
        progressDialog.setIndeterminate(false);
        progressDialog.setCancelable(true);
        progressDialog.setButton(-2, activity.getString(17039360), new d(this, 3));
        String dbsf = utils.dbsf("U3BsaXR0ZWRfU3RhdHVz", 1);
        this.f831e = new File(utils.getWAFolderPath() + dbsf + File.separator);
    }

    public final void a() {
        String str = "ۛ۫ۘۘ۬ۙۥۨۘۘۘۛۡۚۨۧۚۢۜۧ۠ۧۘۚۗۡ";
        Intent intent = null;
        Activity activity = null;
        while (true) {
            switch ((str.hashCode() ^ 186) ^ -1196957064) {
                case -2127070813:
                    str = "ۡۗ۬ۡۗۜۘ۟۬ۥۡۖۙۧ۬ۙ۠۠ۧ";
                    break;
                case -1636305986:
                    activity.startActivity(intent);
                    str = "ۖۦۜ۠ۖۨۖۚۡۘۚۢۗ۠۟۠ۨ۠ۡۘۦۙۢ";
                    break;
                case -1362613564:
                    String str2 = "۠۫ۨۘۦۚۨۦۧۛۙۛۜۘۖ۬ۧۚۤۧۦۧۦۘ۬ۤۢۨۛۗ";
                    while (true) {
                        switch (str2.hashCode() ^ -878458243) {
                            case -533034779:
                                if (Thread.interrupted()) {
                                    str2 = "ۤۤۜۘ۬۬ۨۘۦۡۡۥۦۡۘۨۜ۫ۘۨۧۘ۟ۚ۟ۥۜ۠";
                                    break;
                                } else {
                                    str2 = "ۖۡۢۙۡ۬۠ۙۖۘۤۛۛ۬ۨ۟";
                                    break;
                                }
                            case 133515574:
                                str = "ۖۦۜ۠ۖۨۖۚۡۘۚۢۗ۠۟۠ۨ۠ۡۘۦۙۢ";
                                continue;
                            case 1107949434:
                                str2 = "ۗۘۛۥ۟ۖۘۖۧۜۘ۟ۘۦۦۨۥۡۖۚ۟ۧۨۘۛۚۜ";
                                break;
                            case 1967463780:
                                str = "ۦۦ۠ۦۚۤ۫ۘۖۢۜۜۘ۠۬ۥۘۢۦ۠";
                                continue;
                        }
                    }
                    break;
                case -702010655:
                    intent = new Intent(activity, MediaComposerActivity.class);
                    str = "ۚۗۘ۬۠ۥ۬ۚ۬ۖۡۧۘۖۦۘۘۜۛۥ۬۠۟";
                    break;
                case -15374778:
                case 125701999:
                    return;
                case 349545349:
                    String str3 = "ۖۦۧۢ۟ۙ۫ۘۚۛۘ۬ۚ۟ۡۘۡ۫۠ۚۡۢۗۙۨۘ";
                    while (true) {
                        switch (str3.hashCode() ^ -124907822) {
                            case -1368390648:
                                str = "ۛ۬ۡۘ۬ۤۥۘۡ۟ۥۘۤۦۧۘۗۢۥۥۨ";
                                continue;
                            case -1091818597:
                                str3 = "ۧۧۚۘۖۥۧۦۤۘۛۡۛۚۜۡ۠ۙ۟۬ۖۘ";
                                break;
                            case 550756488:
                                if (!this.f827a) {
                                    str3 = "ۢ۟۠ۡ۫ۨۤۤۤ۠ۛۛ۠ۚ۫";
                                    break;
                                } else {
                                    str3 = "ۢۨۚۚۖۚۤ۟ۗ۬۫۬ۥۛۚ";
                                    break;
                                }
                            case 2093972384:
                                str = "ۜۜۨ۠ۧۘۘۨ۬ۙۤۢۖۘ۟ۙۤ";
                                continue;
                        }
                    }
                    break;
                case 423258107:
                    intent.putParcelableArrayListExtra("android.intent.extra.STREAM", this.f829c).putExtra("jid", "status@broadcast");
                    str = "ۜ۠۟ۡۖۨۘ۫ۧ۫۫ۙۖۘۖۘۖۘۗۗۨۧۦ۫۠ۙۛۢۧۜۘ";
                    break;
                case 913007922:
                    str = "ۥ۫ۢۖۦ۠۠ۦ۟۠ۗۛۢۢۢ";
                    activity = this.f828b;
                    break;
                case 1295970348:
                    d();
                    str = "۬ۧۛۛۦۦۘۗۢۖۥۛۚ۫ۤۨۘۛ۬ۘۘ";
                    break;
            }
        }
    }

    public final void b() {
        m0 m0Var = null;
        String str = "ۢ۬۬۫۟ۢۧ۬ۥۘۤۘۚۧۛۧۤۥ۠ۖۧۨ";
        while (true) {
            switch ((str.hashCode() ^ 883) ^ -249106558) {
                case -334115752:
                    str = "ۚۗۨۘ۬ۛۢۚ۫ۤۚۥۘۘۤ۬۠ۨۜۡۤۦۨۘۢ۫۫۠ۜۡۘ";
                    break;
                case 1440158279:
                    m0Var = new m0(this, 2);
                    str = "ۥ۬ۜۘۖ۟ۛۜۥۘۥۢۙۖۗ۬";
                    break;
                case 1516782219:
                    return;
                case 2018838183:
                    d();
                    str = "۟ۛۜۘ۟ۚۖۘۥۜۧۘۙۘۧ۬ۚۖۗۤۘۘۡۗۦۘۨۛ۟";
                    break;
                case 2121415678:
                    this.f828b.runOnUiThread(m0Var);
                    str = "ۥ۬ۤۖۨۛ۠ۜۘ۬ۜۜۘۙۨۡ";
                    break;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r52v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r44v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r52v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r44v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r52v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r44v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v4, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r48v3 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0095, code lost:
        r2 = "ۨۧۖۢۡۘۛۛۚ۠ۥۜۘۦ۫۬ۤۢۘ۫ۤۜ۠ۢۡۘ";
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(java.io.File r63, long r64) {
        /*
            r62 = this;
            r61 = 0
            r34 = 0
            r60 = 0
            r59 = 0
            r58 = 0
            r56 = 0
            r57 = 0
            r55 = 0
            r54 = 0
            r53 = 0
            r52 = 0
            r48 = 0
            r51 = 0
            r4 = 0
            r50 = 0
            r49 = 0
            r46 = 0
            r47 = 0
            r45 = 0
            r41 = 0
            r43 = 0
            r39 = 0
            r40 = 0
            r42 = 0
            r38 = 0
            r44 = 0
            r17 = 0
            r36 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r26 = 0
            r30 = 0
            r24 = 0
            r6 = 0
            r8 = 0
            r7 = 0
            r14 = 0
            r5 = 0
            r3 = 0
            r28 = 0
            r16 = 0
            java.lang.String r2 = "ۜۨۜۘۨۥۖۨۖۧۙۙۦ۠ۙۡۚ۬ۡۘ"
            r18 = r3
            r19 = r5
            r20 = r6
            r22 = r8
            r21 = r7
            r32 = r12
            r29 = r10
            r35 = r16
            r37 = r17
        L_0x0061:
            int r3 = r2.hashCode()
            r5 = 167(0xa7, float:2.34E-43)
            r6 = 1263222027(0x4b4b3d0b, float:1.3319435E7)
            r3 = r3 ^ r5
            r3 = r3 ^ r6
            switch(r3) {
                case -2119881697: goto L_0x02e6;
                case -2119586560: goto L_0x03e4;
                case -2119420122: goto L_0x03b7;
                case -1975328004: goto L_0x0459;
                case -1972620531: goto L_0x02d9;
                case -1918773638: goto L_0x02bb;
                case -1903111528: goto L_0x0082;
                case -1772587929: goto L_0x00b7;
                case -1739459466: goto L_0x047e;
                case -1721812255: goto L_0x02f8;
                case -1645433414: goto L_0x034f;
                case -1589425508: goto L_0x0298;
                case -1563725177: goto L_0x0079;
                case -1482704713: goto L_0x012f;
                case -1454948887: goto L_0x024c;
                case -1402196549: goto L_0x0342;
                case -1354918330: goto L_0x0129;
                case -1281112970: goto L_0x0223;
                case -1203925502: goto L_0x048a;
                case -1148737956: goto L_0x00a6;
                case -1122885697: goto L_0x0070;
                case -1075288375: goto L_0x0420;
                case -951498136: goto L_0x019d;
                case -890052988: goto L_0x016f;
                case -854295515: goto L_0x0365;
                case -849614745: goto L_0x045f;
                case -823245805: goto L_0x0202;
                case -821829000: goto L_0x01d2;
                case -798736503: goto L_0x0271;
                case -793263790: goto L_0x029e;
                case -641603266: goto L_0x0188;
                case -623667078: goto L_0x00c1;
                case -602993210: goto L_0x03fd;
                case -599169051: goto L_0x00f1;
                case -590406900: goto L_0x03bd;
                case -537831156: goto L_0x0073;
                case -476413835: goto L_0x03ab;
                case -460958392: goto L_0x0433;
                case -450333420: goto L_0x0246;
                case -348770187: goto L_0x0166;
                case -260652708: goto L_0x00ff;
                case -230457717: goto L_0x0319;
                case -186779437: goto L_0x047a;
                case -131128794: goto L_0x0403;
                case -114908978: goto L_0x01cc;
                case -89537661: goto L_0x00bc;
                case 14703508: goto L_0x0197;
                case 201858812: goto L_0x02ec;
                case 206850741: goto L_0x015f;
                case 285115376: goto L_0x0383;
                case 333662085: goto L_0x044a;
                case 383094943: goto L_0x0123;
                case 465518851: goto L_0x0292;
                case 615448113: goto L_0x048e;
                case 728577459: goto L_0x0087;
                case 748547296: goto L_0x0285;
                case 779657229: goto L_0x0374;
                case 835368905: goto L_0x03ea;
                case 872619342: goto L_0x035a;
                case 1045375609: goto L_0x048a;
                case 1094097054: goto L_0x037d;
                case 1100975978: goto L_0x01e5;
                case 1118843535: goto L_0x01df;
                case 1136617690: goto L_0x00af;
                case 1206890392: goto L_0x01be;
                case 1216144209: goto L_0x0109;
                case 1288038697: goto L_0x02f2;
                case 1360676471: goto L_0x03b1;
                case 1544167859: goto L_0x01d9;
                case 1556436083: goto L_0x0076;
                case 1611220423: goto L_0x03f7;
                case 1714456387: goto L_0x0113;
                case 1738505676: goto L_0x03de;
                case 1745056178: goto L_0x02c5;
                case 1755362175: goto L_0x00f9;
                case 1792089725: goto L_0x0442;
                case 1819302676: goto L_0x028b;
                case 1859389422: goto L_0x0208;
                case 1903464836: goto L_0x0229;
                case 1951458749: goto L_0x038c;
                case 1984127980: goto L_0x014c;
                case 2014546369: goto L_0x0466;
                case 2036313438: goto L_0x0453;
                case 2050186417: goto L_0x011d;
                case 2078190086: goto L_0x0492;
                case 2080765613: goto L_0x02cb;
                case 2114582462: goto L_0x040a;
                case 2118190385: goto L_0x00e1;
                default: goto L_0x006f;
            }
        L_0x006f:
            goto L_0x0061
        L_0x0070:
            java.lang.String r2 = "ۚۗ۟ۨ۠۬ۙۡۡۘۢۦۦۨۧۘۗۛ۠ۦۚۥۘ۟ۤۘۘ"
            goto L_0x0061
        L_0x0073:
            java.lang.String r2 = "ۨ۫ۚۘۧۚۤۥۨۚۧۙۘۜۦۢۜۢ"
            goto L_0x0061
        L_0x0076:
            java.lang.String r2 = "ۨۘۘۦۘۡۦۥۘ۫ۢۡۦۦۘۙ۟ۢۗۘۨ"
            goto L_0x0061
        L_0x0079:
            boolean r3 = r63.isDirectory()
            java.lang.String r2 = "ۤۜۢۨۧۡۛۗۘۘۦ۠ۡۦۡۢ"
            r61 = r3
            goto L_0x0061
        L_0x0082:
            r34 = 0
            java.lang.String r2 = "۬ۦۘۘۜۤۥ۟ۗۖ۟ۡ۟ۖ۬ۥ۬ۘۡۨۢۡ۠ۙۗ"
            goto L_0x0061
        L_0x0087:
            r3 = -671014849(0xffffffffd801203f, float:-5.6790198E14)
            java.lang.String r2 = "ۨۚ۬۫ۗۡ۟ۚ۠۟ۗ۫ۢۦۖۙۖۖۘۗۜۘۘۨۢۨ"
        L_0x008c:
            int r5 = r2.hashCode()
            r5 = r5 ^ r3
            switch(r5) {
                case -441787743: goto L_0x00a3;
                case -11023618: goto L_0x009b;
                case 551367253: goto L_0x00a0;
                case 2004329776: goto L_0x0095;
                default: goto L_0x0094;
            }
        L_0x0094:
            goto L_0x008c
        L_0x0095:
            java.lang.String r2 = "ۨۧۖۢۡۘۛۛۚ۠ۥۜۘۦ۫۬ۤۢۘ۫ۤۜ۠ۢۡۘ"
            goto L_0x0061
        L_0x0098:
            java.lang.String r2 = "ۘ۟۫۠ۖۦۘۥ۬ۙۨ۬ۚۘۤۖۘ۟ۤۖۘۗ۠ۥۘۙۦۧۘۤۤۨۘ"
            goto L_0x008c
        L_0x009b:
            if (r61 == 0) goto L_0x0098
            java.lang.String r2 = "ۤۘۥۘۤۖۧۡۘۥۜ۫۫۠۬ۦۘۢۥۨۘۦۨۙ"
            goto L_0x008c
        L_0x00a0:
            java.lang.String r2 = "ۙ۫ۗۗۚۚۥ۟ۖۘۧ۬ۘۘ۠۫ۘۘ"
            goto L_0x008c
        L_0x00a3:
            java.lang.String r2 = "ۨۢ۬۫ۜ۬ۗۚۡۢۦۘۦۛ۫ۛۥۗ۟۟ۜۛۜۗ"
            goto L_0x0061
        L_0x00a6:
            java.lang.String[] r3 = r63.list()
            java.lang.String r2 = "ۢۘ۠۫ۙۨ۠۠ۦۘۦۤۨۘۧ۠ۥۜۥۥۘۚۨۜۖۜۙۨۡۘۘ"
            r60 = r3
            goto L_0x0061
        L_0x00af:
            r0 = r60
            int r3 = r0.length
            java.lang.String r2 = "ۧۢ۫۬ۗۨۛۗۦۖۖۘۢۙ۬ۦۦۧۘ"
            r59 = r3
            goto L_0x0061
        L_0x00b7:
            r58 = 0
            java.lang.String r2 = "ۥۘۨۘۛۤۖۘۛۖۦ۠ۨ۟ۦۖۘ۠۠ۥ۬ۦۡۘۘ۫ۘۘ۫ۦۥ"
            goto L_0x0061
        L_0x00bc:
            java.lang.String r2 = "ۢۙۖۜۙ۫ۨ۬ۜ۟۟ۖۘۤۛۡۘ۟ۢۛ۫ۥۖۘ۠ۛ"
            r57 = r58
            goto L_0x0061
        L_0x00c1:
            r3 = 1724855665(0x66cf3571, float:4.8925784E23)
            java.lang.String r2 = "ۙۙۘۤۧ۫ۤ۟۫ۘۦ۠ۚۥۚۤۖۙ۬ۛ۟ۖۘۘۘۨۡۜۘ"
        L_0x00c6:
            int r5 = r2.hashCode()
            r5 = r5 ^ r3
            switch(r5) {
                case -1537220163: goto L_0x00db;
                case -1307807230: goto L_0x00de;
                case -1158014589: goto L_0x0095;
                case 1075289260: goto L_0x00cf;
                default: goto L_0x00ce;
            }
        L_0x00ce:
            goto L_0x00c6
        L_0x00cf:
            r0 = r57
            r1 = r59
            if (r0 >= r1) goto L_0x00d8
            java.lang.String r2 = "ۤۗۢۡۚۗۤۦۨۚ۟ۨۦۢ۟ۤۢۖۘۥ۫ۙۡۡۨ"
            goto L_0x00c6
        L_0x00d8:
            java.lang.String r2 = "ۧۙۜۘ۟۫ۜۘ۬ۜۜ۟۠ۥۘۤۖۦ۠ۦۛۜۖۧۘۧۡۖۘ"
            goto L_0x00c6
        L_0x00db:
            java.lang.String r2 = "ۛۖۡ۠ۘۨۘۧۘۘ۠ۨۧۘۛۙۛۦۨۥۘۧۢۢۖۡۨۘۥۜ۬"
            goto L_0x00c6
        L_0x00de:
            java.lang.String r2 = "ۤ۠ۛۚۥۘۘۚ۬ۚ۠۫ۨۘۚ۫ۖۘۦۗۚ"
            goto L_0x0061
        L_0x00e1:
            java.io.File r2 = new java.io.File
            r3 = r60[r57]
            r0 = r63
            r2.<init>(r0, r3)
            r2.delete()
            java.lang.String r2 = "ۙ۫ۨۘۢۨۘۘ۠ۦۜۗ۠ۢۤۥ۫ۘۖۜ۬ۚ۟ۧۤۘ"
            goto L_0x0061
        L_0x00f1:
            int r3 = r57 + 1
            java.lang.String r2 = "ۜۨ۟۟ۥۦۘ۬۫ۢۡۖۦۛۧ۟ۡ۫ۗ"
            r56 = r3
            goto L_0x0061
        L_0x00f9:
            java.lang.String r2 = "ۙ۠ۨۘۡ۬ۤۚۧۘۖۜۥۘۛۤۘ"
            r57 = r56
            goto L_0x0061
        L_0x00ff:
            com.obwhatsapp.yo.k0 r2 = com.obwhatsapp.yo.k0.f792b
            android.net.Uri r3 = r2.f793a
            java.lang.String r2 = "ۤ۠ۙۢۗۤۥۘۙۡۢۢۖۢۤۜۥۖۡۜ"
            r55 = r3
            goto L_0x0061
        L_0x0109:
            r0 = r62
            android.app.Activity r3 = r0.f828b
            java.lang.String r2 = "۟ۘۦۛۗ۟ۨ۬ۡۖۡۘۜ۠ۙ"
            r54 = r3
            goto L_0x0061
        L_0x0113:
            boolean r3 = android.provider.DocumentsContract.isDocumentUri(r54, r55)
            java.lang.String r2 = "ۙۧۡۘۨۚ۬۟۟ۤۘ۠ۜۥۜۙ"
            r53 = r3
            goto L_0x0061
        L_0x011d:
            r52 = 0
            java.lang.String r2 = "ۘۥۨۘۨ۬ۘۘ۠۟۟ۙۚ۠ۦۨۗ۫۬ۨۘۡ۫ۢۗ۟ۧ۟ۘۙ"
            goto L_0x0061
        L_0x0123:
            r48 = 0
            java.lang.String r2 = "ۗۘۡۦۥۨ۠ۛۜۘۦۨۢ۫۠۟"
            goto L_0x0061
        L_0x0129:
            java.lang.String r2 = "ۦۥۧۧۖۨۦۜۘۛۜۙۤۢ۠"
            r45 = r52
            goto L_0x0061
        L_0x012f:
            r3 = 56383940(0x35c59c4, float:6.4755235E-37)
            java.lang.String r2 = "۫ۜۨۖۙۤۚۜۦۖۧۥۘۘۢۤۨۘۡۜۖ۟۠ۘۗۡۗۘ"
        L_0x0134:
            int r5 = r2.hashCode()
            r5 = r5 ^ r3
            switch(r5) {
                case -134948729: goto L_0x046e;
                case -31037605: goto L_0x013d;
                case 1429655191: goto L_0x0144;
                case 1838526104: goto L_0x0149;
                default: goto L_0x013c;
            }
        L_0x013c:
            goto L_0x0134
        L_0x013d:
            java.lang.String r2 = "ۥۥۧۘۦۘۧۘۙۘۦۘۗۖۖۘۤۧۤۜۤ۟ۜۦۦ"
            goto L_0x0061
        L_0x0141:
            java.lang.String r2 = "ۦ۠ۦۘ۫ۜۜۘۛۢۨۘ۬ۨ۟ۨۗۦ۠ۦۛۘۜۘ"
            goto L_0x0134
        L_0x0144:
            if (r53 == 0) goto L_0x0141
            java.lang.String r2 = "ۧۥ۠۟ۜۛۜۥۗۜۜۧۢۗۨۘۢ۬۠"
            goto L_0x0134
        L_0x0149:
            java.lang.String r2 = "ۛۦۖۘۜ۠ۜۘۢ۬ۦۖۥۧۘۢۛ۠ۚۚۦۛۡۤۢۘۘۢۖۥ"
            goto L_0x0134
        L_0x014c:
            java.lang.String r2 = android.provider.DocumentsContract.getDocumentId(r55)
            java.lang.String r3 = ":"
            java.lang.String[] r2 = r2.split(r3)
            r3 = 1
            r3 = r2[r3]
            java.lang.String r2 = "ۚۚۤۦۨۘۚۖ۬ۙۨۧۗۖۗۜۗۤۡ۟ۢ"
            r51 = r3
            goto L_0x0061
        L_0x015f:
            r2 = 1
            java.lang.String[] r4 = new java.lang.String[r2]
            java.lang.String r2 = "ۘ۟ۥۘۘۡۡۘۢۧۡۘۤۘۡۘۙۧۡ۠ۛۡۜۚ۟ۨۙۗ"
            goto L_0x0061
        L_0x0166:
            r2 = 0
            java.lang.String r3 = "_data"
            r4[r2] = r3
            java.lang.String r2 = "ۛۦۨۘۗۢۦۘ۬ۛۡۘ۟ۗۨۥ۫۠"
            goto L_0x0061
        L_0x016f:
            android.content.ContentResolver r2 = r54.getContentResolver()
            android.net.Uri r3 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            java.lang.String r5 = "_id=?"
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]
            r7 = 0
            r6[r7] = r51
            r7 = 0
            android.database.Cursor r3 = r2.query(r3, r4, r5, r6, r7)
            java.lang.String r2 = "ۙ۬ۡۗۤۜۡ۫ۗۘۛۗۤۗ۫ۡ۬ۜۡ۠ۨۗۡ"
            r50 = r3
            goto L_0x0061
        L_0x0188:
            r2 = 0
            r2 = r4[r2]
            r0 = r50
            int r3 = r0.getColumnIndex(r2)
            java.lang.String r2 = "ۖۦۦۨۨ۟ۗۛۨۘۧۨۜ۫ۜ۟۟ۛۜۡۙ۟۬ۥ۠ۢۛۡ"
            r49 = r3
            goto L_0x0061
        L_0x0197:
            java.lang.String r2 = "ۧ۟ۙ۟۟ۧ۟ۗ۟ۗۨۢۨۙ۬۟ۘۗۤۡ۠۫۟ۘۘ"
            r47 = r48
            goto L_0x0061
        L_0x019d:
            r3 = 1068582858(0x3fb147ca, float:1.3850033)
            java.lang.String r2 = "ۖ۠ۦۘ۬ۧۘۤۖ۬۠ۡۦۘۙۢ۠ۙۜۘ"
        L_0x01a2:
            int r5 = r2.hashCode()
            r5 = r5 ^ r3
            switch(r5) {
                case -1582947744: goto L_0x01b1;
                case -1177364994: goto L_0x046a;
                case -540406038: goto L_0x01ba;
                case 225453236: goto L_0x01ab;
                default: goto L_0x01aa;
            }
        L_0x01aa:
            goto L_0x01a2
        L_0x01ab:
            java.lang.String r2 = "ۡۙۧۧۨۚۤۖۚۚۢۗۥۡۥۘۛۛۗۖۦۨۘ۬۫ۖ"
            goto L_0x01a2
        L_0x01ae:
            java.lang.String r2 = "۫ۙۗۢۛ۟ۖۦ۟ۛ۟ۗۖ۫ۡۘۜۥۜۘۘ۬ۦۛۘۡۘ"
            goto L_0x01a2
        L_0x01b1:
            boolean r2 = r50.moveToFirst()
            if (r2 == 0) goto L_0x01ae
            java.lang.String r2 = "ۤۥۖۘۙۖۥۘۢۦۘۘۦۢ۠۟ۧۦۚۧ۬ۖۥ۟ۚۚ۠"
            goto L_0x01a2
        L_0x01ba:
            java.lang.String r2 = "۫ۗ۠ۧ۠ۥۘ۫ۖۡۘۦ۫ۦۘۙۗۨۥ"
            goto L_0x0061
        L_0x01be:
            r0 = r50
            r1 = r49
            java.lang.String r3 = r0.getString(r1)
            java.lang.String r2 = "ۦۢ۟ۘۖ۟ۦۜ۬ۖۦۘۨ۠ۚۨۘ"
            r46 = r3
            goto L_0x0061
        L_0x01cc:
            java.lang.String r2 = "ۚۧۘۘۚۘۖۨۘۢۘۧۧۦ۬۫"
            r47 = r46
            goto L_0x0061
        L_0x01d2:
            r50.close()
            java.lang.String r2 = "۟۠ۦۗۛۜۘ۫ۧ۟ۧۤۢۢۢۜۢۗۘۚ۫ۜۘ۫ۘۡۘ"
            goto L_0x0061
        L_0x01d9:
            java.lang.String r2 = "ۖۡۨۥ۫ۡۛۧ۬۬ۥۜۛۖۘ۫ۙۥۨۡۗ"
            r45 = r47
            goto L_0x0061
        L_0x01df:
            java.lang.String r2 = "ۛۡۥ۟ۨۜ۠ۜۙۛۚۜۘۧۡۜۦۨۦۘ۠ۨۦۤۚۨ"
            r41 = r45
            goto L_0x0061
        L_0x01e5:
            r3 = -1108450293(0xffffffffbdee640b, float:-0.116401754)
            java.lang.String r2 = "ۛ۬ۚۤۛ۟ۤ۟۫ۗۡۙۖۛۧۚۜۤۨۤۡ"
        L_0x01ea:
            int r5 = r2.hashCode()
            r5 = r5 ^ r3
            switch(r5) {
                case -1857123304: goto L_0x0472;
                case 1590818316: goto L_0x01f3;
                case 1792892496: goto L_0x01fb;
                case 2099122843: goto L_0x01fe;
                default: goto L_0x01f2;
            }
        L_0x01f2:
            goto L_0x01ea
        L_0x01f3:
            if (r41 == 0) goto L_0x01f8
            java.lang.String r2 = "ۖۙۦۨۗۨۡۘۡۤۜۜۤۡۖۢۥۘۙ۠ۜۘ۬ۘ"
            goto L_0x01ea
        L_0x01f8:
            java.lang.String r2 = "ۢ۠ۜۜۤۦۘۧ۟ۨۦ۠ۦۘۗ۬ۨۢ"
            goto L_0x01ea
        L_0x01fb:
            java.lang.String r2 = "ۢ۟۬ۦۤۜۘ۬ۢ۟ۖۢۨۚۘۚ۬۬ۡۤۨ۫ۥۧۘ"
            goto L_0x01ea
        L_0x01fe:
            java.lang.String r2 = "۠ۜۥۘۘ۠ۢۡ۬۬ۖۘ۠ۗۧۨۧ۬ۛۤ۠ۛۦ۬"
            goto L_0x0061
        L_0x0202:
            java.lang.String r2 = "ۜۢ۠ۗۛ۫ۘ۫ۗۡۘۗ۬ۨۡ۠ۤۗۧۥۨۘۜ۠ۨۥۢۛ"
            r44 = r41
            goto L_0x0061
        L_0x0208:
            android.content.ContentResolver r5 = r54.getContentResolver()
            r2 = 1
            java.lang.String[] r7 = new java.lang.String[r2]
            r2 = 0
            java.lang.String r3 = "_data"
            r7[r2] = r3
            r8 = 0
            r9 = 0
            r10 = 0
            r6 = r55
            android.database.Cursor r3 = r5.query(r6, r7, r8, r9, r10)
            java.lang.String r2 = "۠ۛۚۦۤۜۘۗ۠ۧۛۖۦ۠"
            r43 = r3
            goto L_0x0061
        L_0x0223:
            java.lang.String r2 = "ۛ۟ۜۡۗۚۦۧۦۘ۟ۧۙۘۘۗ۬ۦ۟ۗۙ۠ۦ"
            r42 = r41
            goto L_0x0061
        L_0x0229:
            r3 = -2101396955(0xffffffff82bf3a25, float:-2.80983E-37)
            java.lang.String r2 = "ۢۚۜۖ۟ۜۦۛۚۤۥۤۤۜۦ"
        L_0x022e:
            int r5 = r2.hashCode()
            r5 = r5 ^ r3
            switch(r5) {
                case -1454038200: goto L_0x0476;
                case -793509112: goto L_0x0237;
                case -760258862: goto L_0x0242;
                case 1785372356: goto L_0x023d;
                default: goto L_0x0236;
            }
        L_0x0236:
            goto L_0x022e
        L_0x0237:
            java.lang.String r2 = "ۡۜ۠ۨۖ۟ۦۗۨۘۗۨۧۡ۠ۡۘۢۜۥۘۨۜۡۘ"
            goto L_0x022e
        L_0x023a:
            java.lang.String r2 = "ۘۢۨۘۥۢۦۘۥۘۨۘۖۛۨۘۙۘۖۘۗ۫ۛ۬ۡۖۘۡۘ۠"
            goto L_0x022e
        L_0x023d:
            if (r43 == 0) goto L_0x023a
            java.lang.String r2 = "ۖۜۜۦۢۚۜۜۦۙۗۚۨۨۧۘۤ۟۠ۜۥۤۦۛۧ"
            goto L_0x022e
        L_0x0242:
            java.lang.String r2 = "ۚۚ۟ۥ۟ۥۘۖ۫ۜۘ۬ۧ۫ۘۡۖۘۘۦۘۘۘۖۢ"
            goto L_0x0061
        L_0x0246:
            java.lang.String r2 = "ۖۨۢۜۜۛۜ۠ۛۛۜۘۥ۬ۤۨۡۖۘ۫۬ۨۘۦۧۙ۠ۨۧ"
            r40 = r41
            goto L_0x0061
        L_0x024c:
            r3 = 59732564(0x38f7254, float:8.431033E-37)
            java.lang.String r2 = "ۥۡ۟ۢۥۜۘۤۖۡۘۗۢۨۘۛۤۧ۫ۙۚۛۙۡۘ"
        L_0x0251:
            int r5 = r2.hashCode()
            r5 = r5 ^ r3
            switch(r5) {
                case 620766406: goto L_0x026d;
                case 1225566217: goto L_0x025a;
                case 1305816798: goto L_0x026a;
                case 1705975581: goto L_0x0261;
                default: goto L_0x0259;
            }
        L_0x0259:
            goto L_0x0251
        L_0x025a:
            java.lang.String r2 = "ۘۚۗۘۤۢ۬۟۫۬ۢۜۗۦۘۥۜ۠ۡۘۧۜۥۢ"
            goto L_0x0061
        L_0x025e:
            java.lang.String r2 = "۬ۘۨۗ۫۟۟ۢ۫ۥۘۦۘۢ۫ۡۡۤۚۥۥ"
            goto L_0x0251
        L_0x0261:
            boolean r2 = r43.moveToFirst()
            if (r2 == 0) goto L_0x025e
            java.lang.String r2 = "ۢۖۨ۬۟ۖۘۗۙۧۙۤۜۘۖۚۘۘ۫ۛۥۘ"
            goto L_0x0251
        L_0x026a:
            java.lang.String r2 = "ۗۦۦۧۧۘۘۜۘۧۥۡۦۘۢ۬ۨۘ۠۫ۚۜۧۥۙۧ۬ۡۗ۟"
            goto L_0x0251
        L_0x026d:
            java.lang.String r2 = "ۦۡۜۡۘ۠ۘ۫ۦۛ۬ۘۖۦۙ۠ۛۙ۠ۤۚ"
            goto L_0x0061
        L_0x0271:
            java.lang.String r2 = "_data"
            r0 = r43
            int r2 = r0.getColumnIndexOrThrow(r2)
            r0 = r43
            java.lang.String r3 = r0.getString(r2)
            java.lang.String r2 = "ۤ۠۬۠ۥ۟ۥۢۥۘۖۤ۟ۜ۟ۦ"
            r39 = r3
            goto L_0x0061
        L_0x0285:
            java.lang.String r2 = "ۘۚۗۘۤۢ۬۟۫۬ۢۜۗۦۘۥۜ۠ۡۘۧۜۥۢ"
            r40 = r39
            goto L_0x0061
        L_0x028b:
            r43.close()
            java.lang.String r2 = "ۢۥۗۖۤۘۘۘۙۗۙۚ۫ۘ۫ۗۚۤۙۙ۫ۢ"
            goto L_0x0061
        L_0x0292:
            java.lang.String r2 = "ۘۨۘۡۡۧ۟۫ۜ۫ۨۥۖۦۗ"
            r42 = r40
            goto L_0x0061
        L_0x0298:
            java.lang.String r2 = "ۚ۠ۥۛۜۥۜۥۘۘۥۡۡۘ۫۠ۖ۟۫ۚۦۗۤۦۡ۬ۖۨ"
            r44 = r42
            goto L_0x0061
        L_0x029e:
            r3 = 1929233961(0x72fdc629, float:1.00530264E31)
            java.lang.String r2 = "ۜۡۘ۫ۘۧۘۘ۬ۘۖۦۡۘۜ۬ۜۘ"
        L_0x02a3:
            int r5 = r2.hashCode()
            r5 = r5 ^ r3
            switch(r5) {
                case -2002605534: goto L_0x047a;
                case 986556731: goto L_0x02b7;
                case 1682923256: goto L_0x02ac;
                case 1788282095: goto L_0x02b2;
                default: goto L_0x02ab;
            }
        L_0x02ab:
            goto L_0x02a3
        L_0x02ac:
            java.lang.String r2 = "ۦۢۗۦۙۛ۟ۨۘۨۦۦۘۘ۟ۢۖۘۤ۬ۗۦ۟ۜۥۘ"
            goto L_0x02a3
        L_0x02af:
            java.lang.String r2 = "۬ۖۗۜۖۡۘ۠ۜۚ۠۟ۡۙۜ۫ۖۖۖۘۗۨۤ"
            goto L_0x02a3
        L_0x02b2:
            if (r42 != 0) goto L_0x02af
            java.lang.String r2 = "ۡ۟ۨۘ۟ۤ۫ۤۖ۟۫ۨۤۘۛۚ۟ۡۘ"
            goto L_0x02a3
        L_0x02b7:
            java.lang.String r2 = "۫ۧۨۡۙۘۘۙۥۧۦ۬ۘۖۤۦۘۚۨۜۢۜۡۤۡۛۖۚۤ"
            goto L_0x0061
        L_0x02bb:
            java.lang.String r3 = r55.getPath()
            java.lang.String r2 = "۬ۙ۫ۜۖۚ۬۬۠۠۬ۦۨۨۚ"
            r38 = r3
            goto L_0x0061
        L_0x02c5:
            java.lang.String r2 = "ۤ۬ۙۨۥۗۛ۫ۗۜۛۛۙۘ۠ۧ۫ۨ"
            r44 = r38
            goto L_0x0061
        L_0x02cb:
            android.media.MediaExtractor r2 = new android.media.MediaExtractor
            r2.<init>()
            r0 = r44
            r2.setDataSource(r0)
            java.lang.String r2 = "ۗۙۚۦۢۥۘۜۜ۫ۥۚۤۡۤۡۘ۠ۨۘ۠۠ۙۢۛ۬ۦ"
            goto L_0x0061
        L_0x02d9:
            java.io.File r3 = new java.io.File
            r0 = r44
            r3.<init>(r0)
            java.lang.String r2 = "ۜۖۘۤۡۙۘۙ۫ۚۚ۠ۘۧۖ"
            r37 = r3
            goto L_0x0061
        L_0x02e6:
            r36 = 1
            java.lang.String r2 = "ۚۘۡ۟ۤ۠ۡۖۖۧۢۖۘۧۛۦۚ۟ۡ"
            goto L_0x0061
        L_0x02ec:
            java.lang.String r2 = "ۛۘۨۗ۫ۥۘۧ۬ۘۥۡۥ۟۠ۜۘ۫۫ۜۘۦۚۘۘۚۜۖۜ۠ۨ"
            r35 = r36
            goto L_0x0061
        L_0x02f2:
            java.lang.String r2 = "ۨۥۥۧۡۡۘ۠ۘۦۘۨۙ۟ۨۗۥۘ"
            r28 = r34
            goto L_0x0061
        L_0x02f8:
            r3 = -308750990(0xffffffffed98d572, float:-5.91247E27)
            java.lang.String r2 = "ۨۡۛۧۡۖۘۨۧۧۢۚۨۘ۟ۚ۫ۡ۟ۛۧۢۗ"
        L_0x02fd:
            int r5 = r2.hashCode()
            r5 = r5 ^ r3
            switch(r5) {
                case -1684394514: goto L_0x0306;
                case -1282784355: goto L_0x048e;
                case 469703246: goto L_0x0315;
                case 1998367535: goto L_0x030c;
                default: goto L_0x0305;
            }
        L_0x0305:
            goto L_0x02fd
        L_0x0306:
            java.lang.String r2 = "ۖۖۡۘ۫ۤ۟۬۠ۦۘۘۦۜۘۤۧۥۘۘ۟"
            goto L_0x02fd
        L_0x0309:
            java.lang.String r2 = "ۨۤۥۘۚ۠ۥۚۖۗۡۦ۠ۘۖۥۚ۟ۥۘ"
            goto L_0x02fd
        L_0x030c:
            boolean r2 = java.lang.Thread.interrupted()
            if (r2 != 0) goto L_0x0309
            java.lang.String r2 = "ۦۙۗۡۜ۬ۧۛۤ۬۟۬۫۠ۤۙۥۖ۫ۗۙ"
            goto L_0x02fd
        L_0x0315:
            java.lang.String r2 = "ۙۗۧۤ۠ۖۗۙۢۛۤۙۨۙۙ"
            goto L_0x0061
        L_0x0319:
            r3 = 1297759846(0x4d5a3e66, float:2.28845152E8)
            java.lang.String r2 = "۫ۜۖۖۨۚۗ۫۟ۧۛۜۚ۠ۥۘ۬ۦۘۤۨۥۤۥۜۥ۟ۘ"
        L_0x031e:
            int r5 = r2.hashCode()
            r5 = r5 ^ r3
            switch(r5) {
                case -1427631588: goto L_0x0327;
                case -9085478: goto L_0x033b;
                case 176308348: goto L_0x033e;
                case 546293721: goto L_0x032e;
                default: goto L_0x0326;
            }
        L_0x0326:
            goto L_0x031e
        L_0x0327:
            java.lang.String r2 = "ۜ۫ۤ۬ۖۛ۬ۗۤۛ۬۫۠ۗۖ۫ۛۦۘۜۛۦۘۢ۬ۖ"
            goto L_0x0061
        L_0x032b:
            java.lang.String r2 = "ۜۖۨۘۡ۟ۨۘۚۙۥۡۡۧۘۦ۫ۡۥ۫ۨۘۜۨۥۘۘۤۘ"
            goto L_0x031e
        L_0x032e:
            r0 = r28
            double r6 = (double) r0
            r0 = r64
            double r8 = (double) r0
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 < 0) goto L_0x032b
            java.lang.String r2 = "ۛ۟ۜۤۢۛۘۨۗۛۚۙۢۚۖۘۧۚۡۘ"
            goto L_0x031e
        L_0x033b:
            java.lang.String r2 = "ۚۛ۟ۨۛۥۘ۠ۡ۟ۛۗۦۘۛۨ۠ۙ۟ۥۖۗ۬ۗۛ۬ۥ۬ۖۘ"
            goto L_0x031e
        L_0x033e:
            java.lang.String r2 = "ۜۡۜۘۛۘۜۘۤۢۖۘۢۤۨۚۛۙ۬ۗۘۘۚۜۚۚۤۨ"
            goto L_0x0061
        L_0x0342:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r2 = "P"
            r3.<init>(r2)
            java.lang.String r2 = "ۧۖ۫ۨ۟ۦۚۛۚۜۗۗۚ۠ۨۘۚ۟ۜۘ۠ۨ۫"
            r29 = r3
            goto L_0x0061
        L_0x034f:
            r0 = r29
            r1 = r35
            r0.append(r1)
            java.lang.String r2 = "ۤ۠ۢ۟ۡ۟ۜۜۖۨۢۚۢۧۦۘ۬ۜۡ۟ۘۤۨ۟۫"
            goto L_0x0061
        L_0x035a:
            java.lang.String r2 = ".mp4"
            r0 = r29
            r0.append(r2)
            java.lang.String r2 = "ۛۨۜۡۤۧ۠ۗ۠ۥ۬ۚۛۥۢۧۙۨۥۘۙ"
            goto L_0x0061
        L_0x0365:
            java.io.File r11 = new java.io.File
            java.lang.String r2 = r29.toString()
            r0 = r63
            r11.<init>(r0, r2)
            java.lang.String r2 = "ۖۘ۫ۜۦۜۘ۟ۢۥۘۗۦۦ۬۫ۚۥۙۜۧۡۚ"
            goto L_0x0061
        L_0x0374:
            r0 = r28
            long r6 = (long) r0
            java.lang.String r2 = "۠ۤۘۨۤۛ۬ۘۙۙۢۡۥۥۜۘ"
            r32 = r6
            goto L_0x0061
        L_0x037d:
            long r26 = r64 - r32
            java.lang.String r2 = "ۚ۟ۢۜۘۥۖۖۡۘۧۡۧۘۦۚۛۢۤۗ"
            goto L_0x0061
        L_0x0383:
            r2 = 30000(0x7530, float:4.2039E-41)
            long r0 = (long) r2
            r30 = r0
            java.lang.String r2 = "ۘ۬ۗۜ۠ۤۗ۠۫ۨۛۛۙ۟ۨۢۖۤ"
            goto L_0x0061
        L_0x038c:
            r3 = 416264461(0x18cfb10d, float:5.368702E-24)
            java.lang.String r2 = "ۢ۫ۦۘۜۛۡۚۤۨۘۨۘۦۚ۠ۥ۬۠ۤۗۡ۫ۚۥ۠ۡۧ۟"
        L_0x0391:
            int r5 = r2.hashCode()
            r5 = r5 ^ r3
            switch(r5) {
                case -1115310153: goto L_0x03a4;
                case 916425443: goto L_0x0482;
                case 1298857906: goto L_0x039a;
                case 1712717878: goto L_0x03a7;
                default: goto L_0x0399;
            }
        L_0x0399:
            goto L_0x0391
        L_0x039a:
            int r2 = (r26 > r30 ? 1 : (r26 == r30 ? 0 : -1))
            if (r2 < 0) goto L_0x03a1
            java.lang.String r2 = "۫ۛۥۚ۫۬۫ۛۤ۠ۚ۠ۙ۟ۘۘۙۙۘ"
            goto L_0x0391
        L_0x03a1:
            java.lang.String r2 = "ۚ۟ۖۘۨۗۘ۟۟ۦۘۗ۟ۘۘ۟۬ۗ"
            goto L_0x0391
        L_0x03a4:
            java.lang.String r2 = "ۤۨۛۘۙۧۗ۫ۖۛۦۦۘۚۡۨۘۘۧۗ۬ۦۖ"
            goto L_0x0391
        L_0x03a7:
            java.lang.String r2 = "۫ۗۦۘۤ۠ۖۘۢۡۗۘۨۤۜۗ۫ۨۙۨۘ"
            goto L_0x0061
        L_0x03ab:
            java.lang.String r2 = "ۛۡ۬ۡۚۜۘۦۤۧۛۦۜۘۘۢ۬ۤۜ۠"
            r24 = r30
            goto L_0x0061
        L_0x03b1:
            java.lang.String r2 = "ۨۤۙۡۢۨ۟ۚۤ۠ۜۙۘۡۥۘۨۗۡۘ۬ۛۛ۟ۨۚۨ۟ۦ"
            r21 = r28
            goto L_0x0061
        L_0x03b7:
            java.lang.String r2 = "ۗۢۧۤۜۧۤۚۤۜۨۜ۫ۨۛۘۨۘۢۘۖ۫ۦۛ۠ۗ۫"
            r22 = r24
            goto L_0x0061
        L_0x03bd:
            r3 = 421743627(0x19234c0b, float:8.442259E-24)
            java.lang.String r2 = "ۧ۟ۛۗۚۙۧۜۜۤۚۜۚۖۗۥۛۡۘۥۘۘۘ۠۫"
        L_0x03c2:
            int r5 = r2.hashCode()
            r5 = r5 ^ r3
            switch(r5) {
                case -1699371937: goto L_0x0486;
                case -216340892: goto L_0x03db;
                case -8909893: goto L_0x03cb;
                case 1384612063: goto L_0x03d2;
                default: goto L_0x03ca;
            }
        L_0x03ca:
            goto L_0x03c2
        L_0x03cb:
            java.lang.String r2 = "ۛۤۘ۟۟۫۠ۨۨۤۘ۬ۗۡۗۢۡۘ۠ۜۥۘۢۚۜۘۥۦۤ"
            goto L_0x0061
        L_0x03cf:
            java.lang.String r2 = "ۙۡۡ۫ۥۦۘۛۡۧۘۡۡۨۢۥۚۨۡۛۙۖ"
            goto L_0x03c2
        L_0x03d2:
            r6 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r26 > r6 ? 1 : (r26 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x03cf
            java.lang.String r2 = "ۙۥ۠ۧۧۧۢۗۨ۬ۜۡۥۗۨۛۤۡۘۥ۟ۜۘۧۥۨ"
            goto L_0x03c2
        L_0x03db:
            java.lang.String r2 = "ۛۥ۟ۥۧۡۘۤۗۘۛۦۡۘۙۤۨۚۜۘۛۤ۫"
            goto L_0x03c2
        L_0x03de:
            java.lang.String r2 = "۫۬ۖۚ۬ۧۢۧۥۘۜ۬۬۟ۧ۠ۘۙۡ"
            r21 = r28
            goto L_0x0061
        L_0x03e4:
            java.lang.String r2 = "۠ۘۘۨۚۡۘۖۨۘۘۘۢۖۘۡۗ۬ۡ۫۟ۖۜۤۤۥۦۘ۬۫ۘ"
            r22 = r26
            goto L_0x0061
        L_0x03ea:
            r2 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 - r26
            long r2 = r32 - r2
            int r3 = (int) r2
            java.lang.String r2 = "ۗۙ۠۠ۧۙۖۛۡۘۥۦۥۚۗۦۗۖۛ۟ۙۨۘۡۖۙۚۗۛ"
            r20 = r3
            goto L_0x0061
        L_0x03f7:
            java.lang.String r2 = "ۘۘۗ۠ۘۧۘۜ۫ۘ۬ۗۨ۫ۘۨۦۗۢ"
            r22 = r26
            goto L_0x0061
        L_0x03fd:
            java.lang.String r2 = "ۡۗۛۨۨۛۘۨ۫۫ۧۤۖۢۦۗۗ۟ۤۜۘ۟ۗۚ"
            r21 = r20
            goto L_0x0061
        L_0x0403:
            r0 = r21
            long r14 = (long) r0
            java.lang.String r2 = "ۦۚۚۡ۬ۜۘۥۧۛۘ۟ۡۘۡ۠۫۬۟۠ۜۘۙۛۛۘۘ"
            goto L_0x0061
        L_0x040a:
            X.1zl r5 = new X.1zl
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r12 = 0
            r13 = -1
            long r16 = r32 + r22
            r10 = r37
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r16)
            r5.A0B()
            java.lang.String r2 = "ۥۛ۟ۘۜۜۘۙۦۨۘۨۜۥۖۜۨۢۗۖۦۡ"
            goto L_0x0061
        L_0x0420:
            com.obwhatsapp.yo.l0 r2 = new com.obwhatsapp.yo.l0
            r3 = 1
            r0 = r62
            r1 = r35
            r2.<init>(r0, r1, r3)
            r0 = r54
            r0.runOnUiThread(r2)
            java.lang.String r2 = "ۜۙۢۡۥۜۘۖۤۨ۫ۖۢۦ"
            goto L_0x0061
        L_0x0433:
            r0 = r62
            java.util.ArrayList r2 = r0.f829c
            android.net.Uri r3 = android.net.Uri.fromFile(r11)
            r2.add(r3)
            java.lang.String r2 = "ۖۗ۟۠ۢۘۘۥۤۥۘۘۨۧۡ۟۬ۖۢۤ۠ۚۚ"
            goto L_0x0061
        L_0x0442:
            int r3 = r35 + 1
            java.lang.String r2 = "ۧۨ۟ۛۥۛ۠ۙۡ۟ۦۙۧۗۜۘ"
            r19 = r3
            goto L_0x0061
        L_0x044a:
            long r2 = r14 + r22
            int r3 = (int) r2
            java.lang.String r2 = "ۜۜۗۜۡ۟ۨ۟ۖۦۧۖۘ۬ۨۡۘ"
            r18 = r3
            goto L_0x0061
        L_0x0453:
            java.lang.String r2 = "ۤۜۗ۫ۚۧۘ۠ۥ۬ۚۙۚ۫ۡۙۘ۟ۦۡۢ"
            r28 = r18
            goto L_0x0061
        L_0x0459:
            java.lang.String r2 = "ۥۦۦۖۛۡۘ۠ۖ۟۠ۛ۬ۗۨۙ۫ۗ۬ۧۜۖۘۡۤۡۚۛۡ"
            r35 = r19
            goto L_0x0061
        L_0x045f:
            r62.a()
            java.lang.String r2 = "ۥۦۧۜۡۨۘ۠ۘۖۡۢۖۡۧۢ"
            goto L_0x0061
        L_0x0466:
            java.lang.String r2 = "ۢۙۖۜۙ۫ۨ۬ۜ۟۟ۖۘۤۛۡۘ۟ۢۛ۫ۥۖۘ۠ۛ"
            goto L_0x0061
        L_0x046a:
            java.lang.String r2 = "ۚۧۘۘۚۘۖۨۘۢۘۧۧۦ۬۫"
            goto L_0x0061
        L_0x046e:
            java.lang.String r2 = "ۖۡۨۥ۫ۡۛۧ۬۬ۥۜۛۖۘ۫ۙۥۨۡۗ"
            goto L_0x0061
        L_0x0472:
            java.lang.String r2 = "ۖۘۡۘۚۨۜۘۛۚۜۘۚۚۖۧ۫ۥۜ۬ۚۖۥۤۙۗۨۡ۫ۢ"
            goto L_0x0061
        L_0x0476:
            java.lang.String r2 = "ۘۨۘۡۡۧ۟۫ۜ۫ۨۥۖۦۗ"
            goto L_0x0061
        L_0x047a:
            java.lang.String r2 = "ۤ۬ۙۨۥۗۛ۫ۗۜۛۛۙۘ۠ۧ۫ۨ"
            goto L_0x0061
        L_0x047e:
            java.lang.String r2 = "ۨۥۥۧۡۡۘ۠ۘۦۘۨۙ۟ۨۗۥۘ"
            goto L_0x0061
        L_0x0482:
            java.lang.String r2 = "۬ۦۡ۬۫ۡۘ۬ۤۙۥۜۦۗۚۡۘۗۖۗۥ۟ۗۥ۟ۜۘ"
            goto L_0x0061
        L_0x0486:
            java.lang.String r2 = "ۗ۟۫ۙۥۨۘ۬ۦۦۘۦ۫ۨۖۗۜۙ۫ۙۧۖۤۛ۬ۧ"
            goto L_0x0061
        L_0x048a:
            java.lang.String r2 = "ۡۗۛۨۨۛۘۨ۫۫ۧۤۖۢۦۗۗ۟ۤۜۘ۟ۗۚ"
            goto L_0x0061
        L_0x048e:
            java.lang.String r2 = "ۙۙۡۧۘۡۘۡۘۜۚۙۘۘۨ۠ۚۚۙۘۘۤ۫ۖۘۗۗۜۘ"
            goto L_0x0061
        L_0x0492:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.n0.c(java.io.File, long):void");
    }

    public final void d() {
        m0 m0Var = null;
        String str = "ۖۤۙۖ۬۟ۤ۫ۛۦۤۚۨ";
        while (true) {
            switch ((str.hashCode() ^ 545) ^ -1094877841) {
                case -1962160694:
                    interrupt();
                    str = "۠ۖ۫ۦۙ۠ۛ۫ۥۘۥۢۥۘۜۚۖۥ۫ۦۘ";
                    break;
                case 77399468:
                    str = "۟ۧۜۚۜ۟ۦۖۢۧ۫ۜۗ۬ۨ";
                    break;
                case 404737579:
                    m0Var = new m0(this, 1);
                    str = "ۛۢۛۘۙۛۖۢۘۘۤۗۦۘ۟۟ۥۘۜۘ۫ۗۛۚ";
                    break;
                case 1842159039:
                    this.f828b.runOnUiThread(m0Var);
                    str = "ۤۧۧۦۜۡۘۢ۟۬ۨۤۨۘۛ۫ۜ";
                    break;
                case 2130864108:
                    return;
            }
        }
    }

    public final void run() {
        synchronized (this) {
            super.run();
            String str = "ۨۙۚۚۤۧۤۨۖۛۧۢۥۧۘ۫۫ۘۘۘۚۦ";
            while (true) {
                try {
                    switch (str.hashCode() ^ 681652335) {
                        case -429137045:
                            this.f831e.mkdirs();
                            break;
                        case -263405770:
                            break;
                        case -261360943:
                            str = "ۢۦ۟ۥۦۥۘۡۛۡۘۦ۟ۦۡۖۧ۠ۤ۠ۦۤۦۚۛۖ";
                            continue;
                        case 2006119625:
                            if (!this.f831e.exists()) {
                                str = "۠۟ۖۤۗۦۘۢۧ۫ۙۘۘۘ۬ۡ";
                                break;
                            } else {
                                str = "ۧۜۥۖۗۛۚۜ۠ۦۤۚۡۛۥۘۤۜۥۘۥۨ۫ۖۘۘۘۡۗۙ";
                                continue;
                            }
                        default:
                            continue;
                    }
                } catch (IOException | SecurityException e2) {
                    b();
                } catch (Throwable th) {
                    String str2 = "۬ۧۤۤۖۧۜۚۚۧ۠ۖۘۥۤۘ۫ۢۜ";
                    while (true) {
                        switch (str2.hashCode() ^ 1872553289) {
                            case -2086242410:
                                str2 = "۠ۢۡۘۖ۫۠ۨۤۥۘ۬ۨۙۡۧۜۘ";
                                continue;
                            case -1693979163:
                                a();
                                break;
                            case 312387678:
                                if (this.f829c.isEmpty()) {
                                    str2 = "ۢ۬ۤۙۨ۠ۚ۫ۧ۠ۥۖۘۢ۫ۦۘۜۤ۟ۡۧۧ۬ۜ۬ۙۧ";
                                    break;
                                } else {
                                    str2 = "ۚۦۨۘۜۧۖۘۥۛۘۘۧۧۙۥۤ۫۬ۦۘ";
                                    continue;
                                }
                            case 1361582615:
                                d();
                                this.f828b.runOnUiThread(new m0(this, 0));
                                break;
                            default:
                                continue;
                        }
                    }
                }
            }
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            Activity activity = this.f828b;
            k0 k0Var = k0.f792b;
            mediaMetadataRetriever.setDataSource(activity, k0Var.f793a);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
            mediaMetadataRetriever.release();
            BigDecimal bigDecimal = new BigDecimal(Long.parseLong(extractMetadata));
            String str3 = "ۗۙۥۤۛ۠ۙۙۢ۠۟۫ۛۢۘۘ۟۫۠";
            while (true) {
                switch (str3.hashCode() ^ 1270445903) {
                    case -1882512643:
                        str3 = "ۡۧۙۘۢ۫۫۫ۦ۬ۛ۫۬ۧۥۘۛۚ۠ۨ۟ۦۘۙۜۧۘ";
                        continue;
                    case -1822477718:
                        this.f829c.add(k0Var.f793a);
                        a();
                        break;
                    case -1005473469:
                        this.f828b.runOnUiThread(new l0(this, (int) Math.round(bigDecimal.doubleValue() / 30000.0d), 0));
                        c(this.f831e, bigDecimal.longValue());
                        break;
                    case 960580018:
                        if (bigDecimal.doubleValue() > 30500.0d) {
                            str3 = "ۡۦ۟ۧۤۥۧ۬ۡۥۦۨۘۘۤۜۘۦ۟۬ۜۦۘۘ۫ۦۦۜۚۥ";
                            break;
                        } else {
                            str3 = "۬ۢۘۢۜۧ۟۟ۦۘ۟ۖ۟ۧۢ۠ۖۖۘۡۖۘ";
                            continue;
                        }
                    default:
                        continue;
                }
            }
        }
        return;
    }
}
