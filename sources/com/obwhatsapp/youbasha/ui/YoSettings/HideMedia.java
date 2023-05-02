package com.obwhatsapp.youbasha.ui.YoSettings;

import a.a;
import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.os.Bundle;
import android.preference.SwitchPreference;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;
import com.obwhatsapp.youbasha.task.UpdateMediaStore;
import com.obwhatsapp.youbasha.task.utils;
import java.io.File;
import m.d;

public class HideMedia extends BasePreferenceActivity {
    public static final int IMAGES = 222;
    public static final int VIDEOS = 333;

    /* renamed from: e  reason: collision with root package name */
    public final String f1163e;

    /* renamed from: f  reason: collision with root package name */
    public final String f1164f;

    /* renamed from: g  reason: collision with root package name */
    public final String f1165g;

    /* renamed from: h  reason: collision with root package name */
    public SwitchPreference f1166h;

    /* renamed from: i  reason: collision with root package name */
    public SwitchPreference f1167i;

    /* renamed from: j  reason: collision with root package name */
    public SwitchPreference f1168j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1169k = false;

    public HideMedia() {
        String str = utils.getWAFolderPath() + "Media" + File.separator;
        this.f1163e = a.f(a.g(str), yo.pname, " Images");
        this.f1164f = a.f(a.g(str), yo.pname, " Video");
        this.f1165g = a.f(a.g(str), yo.pname, " Animated Gifs");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isHideGIFs() {
        /*
            java.lang.String r0 = "ۥۛ۬ۙۗۙ۟۫ۨۛۡۥۘۜۢۡۡۗ۠۬ۘۢ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 971(0x3cb, float:1.36E-42)
            r3 = -990327558(0xffffffffc4f8ccfa, float:-1990.4055)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -45227162: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "yohide_ingifs"
            boolean r0 = com.obwhatsapp.yo.shp.getBooleanPriv(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.YoSettings.HideMedia.isHideGIFs():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isHideImages() {
        /*
            java.lang.String r0 = "۫ۙۡۘ۫ۦۗ۠۫ۖۘ۟۬ۡۘۡۖۖ۠ۚ۟"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 921(0x399, float:1.29E-42)
            r3 = 314181974(0x12ba0956, float:1.1740552E-27)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 327887235: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "yohide_inimages"
            boolean r0 = com.obwhatsapp.yo.shp.getBooleanPriv(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.YoSettings.HideMedia.isHideImages():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isHideVideos() {
        /*
            java.lang.String r0 = "ۚ۟ۘۘۥۦۦۘۧ۬۟ۖۧ۟ۦ۟ۘۘ۬ۜۗۤۘ۟۫ۜۘ۬ۘ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 244(0xf4, float:3.42E-43)
            r3 = 1840000610(0x6dac2e62, float:6.660937E27)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -2068917060: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "yohide_invideos"
            boolean r0 = com.obwhatsapp.yo.shp.getBooleanPriv(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.YoSettings.HideMedia.isHideVideos():boolean");
    }

    public final void c(String str, int i2, boolean z2) {
        try {
            new UpdateMediaStore(this, i2, str, new File(str + File.separator + ".nomedia"), z2, this.f1169k).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        } catch (Exception e2) {
        }
    }

    @SuppressLint({"MissingSuperCall"})
    public void onCreate(Bundle bundle) {
        String str = "ۗۧۡۘۘۖۧۘ۠ۜۘۤۦ۠ۤۙۡ";
        while (true) {
            switch ((str.hashCode() ^ 237) ^ -1121833134) {
                case -1588135785:
                    this.f1167i = (SwitchPreference) findPreference("yohide_invideos");
                    str = "ۧۧۤۤۧۤۙۦۚۗۛۚۛۨۘۜ۫ۢۦۡۘۧۤۡۚۚ۫";
                    break;
                case -1505064885:
                    str = "۟ۗۜۘۢۦ۬ۢۗۤۢۛۖۘۧۙ۫";
                    break;
                case -1373466359:
                    this.f1168j = (SwitchPreference) findPreference("yohide_ingifs");
                    str = "ۜ۠ۧۨۙۥۘۥۘۥۘ۫ۛ۠۠ۗۨۘۙ۟ۖۘۨۛ۟";
                    break;
                case -1306761636:
                    str = "ۦ۟ۢۚۧۦۘۨۥۘۘ۠ۥ۠ۗ۟ۦۘۙۛۙۨۦۦ۟ۖۜۘۢۗۜۘ";
                    break;
                case -1053968617:
                    setContentView(yo.getID("yo_settings_prefsview", "layout"));
                    str = "ۨۡۦۘ۬ۖۚ۫ۜ۟۠ۦ۠ۧۡۡۘۘۛۨۘۢۖۘۘۗۖۥۜ۫ۥ";
                    break;
                case -976866758:
                    super.onCreatePrivate(bundle);
                    str = "ۧۛ۠ۢۡۤۨۢۘۘۡۖۜۘ۫ۚۛ";
                    break;
                case -541388614:
                    this.f1166h = (SwitchPreference) findPreference("yohide_inimages");
                    str = "ۧۦۖۘۨۦۦۜۖۧۘۘۨۜۛۨۘۧۧۡۘ";
                    break;
                case 939597510:
                    addPreferencesFromResource(others.getID("yo_media", "xml"));
                    str = "ۡۧۦۘۛۖ۟۠ۧۡۛۧۡ۬ۥۘۡۢۡۚۗۡۘ۬ۙۜۘ";
                    break;
                case 1183843749:
                    findPreference("yohide_mediashow").setOnPreferenceClickListener(new d(this, 0));
                    str = "۫ۗۨۧۡۗۚۦۧۚۦۢۧۙۡۘ";
                    break;
                case 1977519066:
                    return;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSharedPreferenceChanged(android.content.SharedPreferences r25, java.lang.String r26) {
        /*
            r24 = this;
            r20 = 0
            r19 = 0
            r17 = 0
            r16 = 0
            r15 = 0
            r18 = 0
            r14 = 0
            r13 = 0
            r8 = 0
            r11 = 0
            r6 = 0
            r4 = 0
            r3 = 0
            r12 = 0
            r9 = 0
            r2 = 0
            r5 = 0
            r7 = 0
            r10 = 0
            java.lang.String r1 = "ۧۗ۬۬ۖۧ۬ۦۘۘۡۦۗۖ۟ۖۘ"
        L_0x001a:
            int r21 = r1.hashCode()
            r22 = 860(0x35c, float:1.205E-42)
            r23 = 1445616703(0x562a5c3f, float:4.6828293E13)
            r21 = r21 ^ r22
            r21 = r21 ^ r23
            switch(r21) {
                case -2146503731: goto L_0x0244;
                case -2076350060: goto L_0x026b;
                case -2008568242: goto L_0x00db;
                case -1919232211: goto L_0x019a;
                case -1818837749: goto L_0x003a;
                case -1814511439: goto L_0x0218;
                case -1748521760: goto L_0x0107;
                case -1721091269: goto L_0x0227;
                case -1650158117: goto L_0x0101;
                case -1597755501: goto L_0x0287;
                case -1586745164: goto L_0x0273;
                case -1457886603: goto L_0x0171;
                case -1390469571: goto L_0x027b;
                case -1353942339: goto L_0x023c;
                case -1326883623: goto L_0x0176;
                case -1306580436: goto L_0x01ec;
                case -1123591886: goto L_0x01e0;
                case -942782838: goto L_0x0273;
                case -903961639: goto L_0x0165;
                case -796913177: goto L_0x0031;
                case -686957301: goto L_0x0212;
                case -484699905: goto L_0x016b;
                case -314922318: goto L_0x026b;
                case -279909309: goto L_0x0222;
                case -159988425: goto L_0x020a;
                case -136431245: goto L_0x01f9;
                case 12749320: goto L_0x0230;
                case 270696696: goto L_0x021d;
                case 485869454: goto L_0x026b;
                case 539338294: goto L_0x0273;
                case 541531347: goto L_0x008d;
                case 627267352: goto L_0x013f;
                case 655560042: goto L_0x010d;
                case 711208057: goto L_0x0061;
                case 866850037: goto L_0x002e;
                case 988544046: goto L_0x0133;
                case 1122426237: goto L_0x028b;
                case 1125766419: goto L_0x0034;
                case 1137143233: goto L_0x002b;
                case 1245551191: goto L_0x0068;
                case 1320919636: goto L_0x0139;
                case 1347346479: goto L_0x01f4;
                case 1378345379: goto L_0x0259;
                case 1383764454: goto L_0x005b;
                case 1502346056: goto L_0x024e;
                case 1637678950: goto L_0x01fe;
                case 1702847045: goto L_0x01bb;
                case 1723468443: goto L_0x0287;
                case 1927788977: goto L_0x025e;
                case 1966095351: goto L_0x0283;
                case 1968128018: goto L_0x0254;
                case 2064145794: goto L_0x00b4;
                case 2080764566: goto L_0x017c;
                case 2097135925: goto L_0x0249;
                default: goto L_0x002a;
            }
        L_0x002a:
            goto L_0x001a
        L_0x002b:
            java.lang.String r1 = "۠ۤۛۚۦۚ۬ۦۧۘۡ۠۫۬ۗ۟ۖۚۖۘۘۤۨ۫ۨ۟"
            goto L_0x001a
        L_0x002e:
            java.lang.String r1 = "ۥۧۜۘۦۧۘ۠ۜۧۨ۠ۖۘۢۧۛ۟ۨۧۘ"
            goto L_0x001a
        L_0x0031:
            java.lang.String r1 = "ۨۘۜۘۜۗۘۘۘۗ۬ۖۖۘۘۥۥۨۤۢۨۘ"
            goto L_0x001a
        L_0x0034:
            super.onSharedPreferenceChanged(r25, r26)
            java.lang.String r1 = "ۥۡۘۘ۫ۥۡۦۡۜۦۖۛۢۢۖۦۜۙ۟ۤۖۙۢ۠"
            goto L_0x001a
        L_0x003a:
            r21 = -1267584059(0xffffffffb47233c5, float:-2.255684E-7)
            java.lang.String r1 = "ۛۡۧۥۤۥۢۨۦ۠۬ۚۢۦۥۘۘۜۙ"
        L_0x003f:
            int r22 = r1.hashCode()
            r22 = r22 ^ r21
            switch(r22) {
                case -1880448188: goto L_0x0287;
                case -1670995570: goto L_0x0049;
                case -910742157: goto L_0x0058;
                case 569677408: goto L_0x0055;
                default: goto L_0x0048;
            }
        L_0x0048:
            goto L_0x003f
        L_0x0049:
            r0 = r24
            boolean r1 = r0.f1169k
            if (r1 != 0) goto L_0x0052
            java.lang.String r1 = "۫۟ۖۨۧۖ۠ۡۥۘۚۜۨۘ۠۠ۖۡۤۨۘۧ۬ۛۢۚۤۙۦۖ"
            goto L_0x003f
        L_0x0052:
            java.lang.String r1 = "ۧۧۙۚۥۨ۫ۜۘۢۤۙ۠ۥۦۘۙۨ۠ۘ۟ۛۨ۬ۙۥ۟"
            goto L_0x003f
        L_0x0055:
            java.lang.String r1 = "ۤۚۜۧ۫ۢۡ۠ۙۦۦۙ۬ۡۖۘۜۛۛۘ۠ۙۤۨۖۘۙۛۡ"
            goto L_0x003f
        L_0x0058:
            java.lang.String r1 = "ۚۗۥ۬ۚۜۚۛۨۖۜۛۧۛۧۨ۫۟ۙۨ۟ۨۘۨ"
            goto L_0x001a
        L_0x005b:
            r26.getClass()
            java.lang.String r1 = "ۚ۟ۘۢۤۘ۟ۧۤ۬ۖۘۘۥۡ۬ۙۡۘۧۢۘ"
            goto L_0x001a
        L_0x0061:
            int r20 = r26.hashCode()
            java.lang.String r1 = "ۚ۟ۨۘۗۨ۬ۡۘۡۘۢ۫ۨۘ۬۟ۦ۬۫ۖۘۧۥ۟ۘۖۦۥۘۥۘ"
            goto L_0x001a
        L_0x0068:
            r21 = 331124177(0x13bc8dd1, float:4.7597714E-27)
            java.lang.String r1 = "ۖۙۘۘۙۢۖ۫ۗۛۧۜ۫ۗ۬ۡۢۗۖۘۥۤ"
        L_0x006d:
            int r22 = r1.hashCode()
            r22 = r22 ^ r21
            switch(r22) {
                case -1002391940: goto L_0x008a;
                case -810876893: goto L_0x0087;
                case -810354006: goto L_0x0077;
                case 467969344: goto L_0x007d;
                default: goto L_0x0076;
            }
        L_0x0076:
            goto L_0x006d
        L_0x0077:
            java.lang.String r1 = "ۨۖ۟ۙۖۨۨۡۦۜۨۖ۠ۛۖۖۡۖۖۨۨۘۥ۠ۡۘ"
            goto L_0x001a
        L_0x007a:
            java.lang.String r1 = "۟ۜ۫ۗۢۦۘۚۖ۬ۧۚۙ۟ۤۖۜ۬ۛۗۜۖۛۘۘۥۜۗ"
            goto L_0x006d
        L_0x007d:
            r1 = 40514715(0x26a349b, float:1.7206702E-37)
            r0 = r20
            if (r0 == r1) goto L_0x007a
            java.lang.String r1 = "ۦۘۘۦۢۛۤۢۘۘۢۛۨۘ۠ۡۙۥۘۥۘ۠ۖۘۘۢۜ۠"
            goto L_0x006d
        L_0x0087:
            java.lang.String r1 = "ۛ۠ۖۚۨۧۘ۟ۧۜۖ۠۫۫ۛۘۘۗ۠ۖۘۡۨۡۛۦ"
            goto L_0x006d
        L_0x008a:
            java.lang.String r1 = "ۧ۫ۢۜۘۧۘ۬۟۟ۧ۬ۤۛ۟ۘۘۤۚۨ"
            goto L_0x001a
        L_0x008d:
            r21 = 1969639673(0x756650f9, float:2.919606E32)
            java.lang.String r1 = "ۖ۟۠ۜۛۖۗ۬ۥۘۦۜۦۘۡۖۛۨۦۥ"
        L_0x0092:
            int r22 = r1.hashCode()
            r22 = r22 ^ r21
            switch(r22) {
                case -1074990168: goto L_0x00a3;
                case 153270436: goto L_0x00b0;
                case 570486754: goto L_0x009c;
                case 1838081804: goto L_0x00ad;
                default: goto L_0x009b;
            }
        L_0x009b:
            goto L_0x0092
        L_0x009c:
            java.lang.String r1 = "ۥۜۥۘۦۗۦۘ۫ۥۜۧۜۘۢۨۡۘۡۨۦۛۦۛۥۧ۬۟۟ۗ"
            goto L_0x001a
        L_0x00a0:
            java.lang.String r1 = "ۡۛۙ۬ۦۗ۫ۨۛۗۧۤۚۡۘۨۚۜۘۜۗۘۘۜۦ۫"
            goto L_0x0092
        L_0x00a3:
            r1 = 340730596(0x144f22e4, float:1.045771E-26)
            r0 = r20
            if (r0 == r1) goto L_0x00a0
            java.lang.String r1 = "ۗ۟ۖۧۗ۠ۛۖ۬ۙ۟ۦۘۗۢۖۘۤۦۘۦۧۜۘۙۥۥۘۦۛۖۘ"
            goto L_0x0092
        L_0x00ad:
            java.lang.String r1 = "۟ۡۜۘۦۛۜۡ۬ۗۥۘۘ۫ۦ"
            goto L_0x0092
        L_0x00b0:
            java.lang.String r1 = "ۙۖۘۥۥۤۜۜۢۨۚۥۘۤ۠ۛ"
            goto L_0x001a
        L_0x00b4:
            r21 = -1544561768(0xffffffffa3efdb98, float:-2.6005433E-17)
            java.lang.String r1 = "ۖۡۦۨۚۗۧۘۦۘۚ۟۟۬ۡۙۘۛۡ"
        L_0x00b9:
            int r22 = r1.hashCode()
            r22 = r22 ^ r21
            switch(r22) {
                case -2052581680: goto L_0x00c3;
                case -1882923105: goto L_0x00ca;
                case 714509937: goto L_0x00d7;
                case 832002878: goto L_0x00d4;
                default: goto L_0x00c2;
            }
        L_0x00c2:
            goto L_0x00b9
        L_0x00c3:
            java.lang.String r1 = "ۥۘۡۘۧ۬ۚۗۛ۠ۖۖۥۘۧۚۢۖۥۧ"
            goto L_0x001a
        L_0x00c7:
            java.lang.String r1 = "۠۠ۥ۠ۖۡۘ۠ۚۨۛۨۦۘۗۦۧۦۡۚ۟۟ۙۥۖ"
            goto L_0x00b9
        L_0x00ca:
            r1 = 709303236(0x2a471bc4, float:1.7684384E-13)
            r0 = r20
            if (r0 == r1) goto L_0x00c7
            java.lang.String r1 = "ۘۘۗ۫ۦۘۖۤۖۘۛۜۡۘۛ۠ۥۘ"
            goto L_0x00b9
        L_0x00d4:
            java.lang.String r1 = "ۘۢۙۢۦۘۘۤۨۚۛۨۧۖ۬ۢۥۨۢۡۛۦۘۜۧۛۖۚۧ"
            goto L_0x00b9
        L_0x00d7:
            java.lang.String r1 = "ۡۥۛۡ۬ۡۘۡۘۜۛۗۥۘۨۥۜۨۤۡۘ"
            goto L_0x001a
        L_0x00db:
            r21 = -70370491(0xfffffffffbce3b45, float:-2.1416306E36)
            java.lang.String r1 = "۫ۥۧۧۜۡۧ۫۟ۖ۟ۨۜۦۨ۬۬ۘ۠ۜۢۚۘۧ"
        L_0x00e0:
            int r22 = r1.hashCode()
            r22 = r22 ^ r21
            switch(r22) {
                case -1301046556: goto L_0x00fe;
                case -911858949: goto L_0x0263;
                case 1502891749: goto L_0x00f1;
                case 1587457105: goto L_0x00ea;
                default: goto L_0x00e9;
            }
        L_0x00e9:
            goto L_0x00e0
        L_0x00ea:
            java.lang.String r1 = "۠ۛۘ۬ۚۖۘۗۡۘۘۤ۟ۤۦ۬ۛۙ۟ۥۘۢۧۧۖۡ"
            goto L_0x001a
        L_0x00ee:
            java.lang.String r1 = "ۘۘ۬ۖ۟ۚۥۦ۟ۨ۠ۜۘۦۤۙۡۛۜۗۜۢ۫۠ۘۘ"
            goto L_0x00e0
        L_0x00f1:
            java.lang.String r1 = "yohide_invideos"
            r0 = r26
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x00ee
            java.lang.String r1 = "۫۬ۛ۫ۢۧۖۧ۟ۥ۟۫۠ۥۢۖۤۧ۬۬ۦۘۡۚۡ"
            goto L_0x00e0
        L_0x00fe:
            java.lang.String r1 = "۫ۙ۠ۥۖ۫۫۬ۗۘۤۥۘۙ۟ۧ"
            goto L_0x00e0
        L_0x0101:
            r19 = 2
            java.lang.String r1 = "ۢۡ۫۬ۚ۬ۡۗۜ۬ۚۜۘۧ۫ۗۖۘۙ۠ۢۡ۟ۥ"
            goto L_0x001a
        L_0x0107:
            java.lang.String r1 = "ۡ۫ۢۡۢۡ۠ۥۡۨۜۖۘۛۜۡۚۡۙۖۖۨۘ۬۠ۦۘۥۧ۫"
            r18 = r19
            goto L_0x001a
        L_0x010d:
            r21 = 54099741(0x3397f1d, float:5.4512533E-37)
            java.lang.String r1 = "ۨۨ۬ۢۛۛۢ۫ۜۡۤۘۛۛ۬۬ۢ"
        L_0x0112:
            int r22 = r1.hashCode()
            r22 = r22 ^ r21
            switch(r22) {
                case -1411184806: goto L_0x0267;
                case 1089722628: goto L_0x011c;
                case 1298659767: goto L_0x0123;
                case 1491997046: goto L_0x0130;
                default: goto L_0x011b;
            }
        L_0x011b:
            goto L_0x0112
        L_0x011c:
            java.lang.String r1 = "ۗۤۡۛۗۘۘۘۜۨۘۢۥۜۛۨۖۘ۟ۙ۫۫ۛۜۘۢۢۦ"
            goto L_0x001a
        L_0x0120:
            java.lang.String r1 = "ۢۡۧۧۤۚ۟۬ۢۚۢ۫ۧۧۖۘۘۜۜۨ۠ۦ۟ۚۜۘ۬ۗۤ"
            goto L_0x0112
        L_0x0123:
            java.lang.String r1 = "yohide_inimages"
            r0 = r26
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x0120
            java.lang.String r1 = "ۚۙۡ۟ۖۨۘۘۛۤۥۨۨۜ۟ۜۘۘۤۜ۬ۖۥۚۧۚۘۛۤ"
            goto L_0x0112
        L_0x0130:
            java.lang.String r1 = "۟ۥۘۡ۟ۖۘۨ۠ۧۘۦۗۤ۠۬ۦ۫ۨۘ"
            goto L_0x0112
        L_0x0133:
            r17 = 1
            java.lang.String r1 = "ۧۥۗۥۗۙۛۖ۫ۗۡۜ۬ۜۥۘۧۗ۫ۤۡۦۘ"
            goto L_0x001a
        L_0x0139:
            java.lang.String r1 = "۟۫ۛۦۦۛۜ۫ۘۦۨۧۘ۠ۤۨۚۜۜۗۧ۫"
            r18 = r17
            goto L_0x001a
        L_0x013f:
            r21 = -1949854530(0xffffffff8bc794be, float:-7.6875814E-32)
            java.lang.String r1 = "۟ۛ۬ۗۢ۬۟ۥ۫ۦۨۖۘۡۦۡۨ۟ۥۢۨۙ"
        L_0x0144:
            int r22 = r1.hashCode()
            r22 = r22 ^ r21
            switch(r22) {
                case 652158: goto L_0x015e;
                case 313291994: goto L_0x026f;
                case 909017719: goto L_0x014e;
                case 2117219821: goto L_0x0161;
                default: goto L_0x014d;
            }
        L_0x014d:
            goto L_0x0144
        L_0x014e:
            java.lang.String r1 = "yohide_ingifs"
            r0 = r26
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x015b
            java.lang.String r1 = "ۚ۫۬ۥۚۦ۬ۨۛ۟ۦۙۘۜۡۦۙۧ"
            goto L_0x0144
        L_0x015b:
            java.lang.String r1 = "ۡۗۥۛۛۢۦۢ۟ۛۦۖۙۚۨۘ۠۟ۘۘۢۨۤۛۜۘ"
            goto L_0x0144
        L_0x015e:
            java.lang.String r1 = "ۖ۟ۖۥۛۖۘ۠ۥۢۚۢۙۥۘ۟"
            goto L_0x0144
        L_0x0161:
            java.lang.String r1 = "ۤۖۘ۫ۦۧۘۗۙ۫۬۫ۢۧۘۗ"
            goto L_0x001a
        L_0x0165:
            r16 = -1
            java.lang.String r1 = "ۨۥۨ۬ۗۘۘۡۚۖۖۡۤۖ۠ۨۘۥۜۜۘ۠۬ۖۦۧۨۘ"
            goto L_0x001a
        L_0x016b:
            java.lang.String r1 = "ۚۢۖۘۙۘۡۤۗۛۤ۠ۖۘ۫ۙۥ"
            r18 = r16
            goto L_0x001a
        L_0x0171:
            r15 = 0
            java.lang.String r1 = "ۚۦۥۘۨ۟۠ۢۥۦۖ۠۫۫ۙۗۤۢۙ"
            goto L_0x001a
        L_0x0176:
            java.lang.String r1 = "ۜۤۜۘ۬ۜۥ۬۠ۖ۠ۙۥۧۡۘۘ"
            r18 = r15
            goto L_0x001a
        L_0x017c:
            r21 = -632909841(0xffffffffda468fef, float:-1.39725755E16)
            java.lang.String r1 = "ۥۨۢ۠ۚۥۖۨ۠ۖۙ۟ۙۜۨۛۘۜۘۜۨۨۘۤۥ۫"
        L_0x0181:
            int r22 = r1.hashCode()
            r22 = r22 ^ r21
            switch(r22) {
                case 26369958: goto L_0x0193;
                case 73148229: goto L_0x018b;
                case 948271054: goto L_0x027f;
                case 1637836403: goto L_0x0196;
                default: goto L_0x018a;
            }
        L_0x018a:
            goto L_0x0181
        L_0x018b:
            if (r18 == 0) goto L_0x0190
            java.lang.String r1 = "۫ۤۦۘۥ۟ۦۙۙ۬۟۫ۨۘ۠ۧۧۚۦۘۘۘۡۥۖۡۘۥۡۛ"
            goto L_0x0181
        L_0x0190:
            java.lang.String r1 = "ۗۗۦۨۤۥۘۚۙ۟ۖۚۨۜۛۗۜۘۘۡۢۛ۬ۙ۟۟ۢۙ"
            goto L_0x0181
        L_0x0193:
            java.lang.String r1 = "ۚۤۤۚۡۛۗ۟ۨۧۛۗۤۜۘۙۖۜ"
            goto L_0x0181
        L_0x0196:
            java.lang.String r1 = "ۦۢۡۘۢۥۨۘۖۘۖۗۜۧ۠ۜۘ۠ۢ۬ۧۖ۟"
            goto L_0x001a
        L_0x019a:
            r21 = 1931137341(0x731ad13d, float:1.2265893E31)
            java.lang.String r1 = "ۤۙۧۢۚۘۘ۬ۤ۬۫ۤۜۘۗۡۢۗۙۦۘ"
        L_0x019f:
            int r22 = r1.hashCode()
            r22 = r22 ^ r21
            switch(r22) {
                case -1909416743: goto L_0x01b4;
                case 324053643: goto L_0x0277;
                case 1296110544: goto L_0x01a9;
                case 1443548545: goto L_0x01b7;
                default: goto L_0x01a8;
            }
        L_0x01a8:
            goto L_0x019f
        L_0x01a9:
            r1 = 1
            r0 = r18
            if (r0 == r1) goto L_0x01b1
            java.lang.String r1 = "ۥ۟ۗۢ۠ۡۘۨۚۡۤۤۙۜۧۥۘۘۦ۬"
            goto L_0x019f
        L_0x01b1:
            java.lang.String r1 = "ۤۗۨۧۦۛۘۦۖۤۨۛۙۤۗۘۙ۠ۘۥ"
            goto L_0x019f
        L_0x01b4:
            java.lang.String r1 = "ۦۧۙ۬ۦۤۚۨۧۦ۟ۖۘۙۗۖۜۜۦۘۙ۫ۢۛۗۤۖۜۢ"
            goto L_0x019f
        L_0x01b7:
            java.lang.String r1 = "۫۬ۡۘۗۥۡ۟ۦ۠ۜ۠ۖۘ۬۠ۥۘ۬ۥۡۙۚۥۘۥۨۚ"
            goto L_0x001a
        L_0x01bb:
            r21 = 584531076(0x22d73c84, float:5.833994E-18)
            java.lang.String r1 = "ۘۖۘۢۥۤۦ۟ۥۛۚۙۦۡۜۘ۫۠ۖ۫۠ۦۘۗ۟ۤ"
        L_0x01c0:
            int r22 = r1.hashCode()
            r22 = r22 ^ r21
            switch(r22) {
                case -196091580: goto L_0x01d9;
                case 871111560: goto L_0x01ca;
                case 888952452: goto L_0x01d1;
                case 1952454250: goto L_0x01dc;
                default: goto L_0x01c9;
            }
        L_0x01c9:
            goto L_0x01c0
        L_0x01ca:
            java.lang.String r1 = "۬ۗۛۥۤ۠ۙۘۛ۠۟ۡۗ۠ۗۨ"
            goto L_0x001a
        L_0x01ce:
            java.lang.String r1 = "ۙۥۖ۬ۨ۟ۥۚ۟ۗۢۙۥۧۗۥۙ"
            goto L_0x01c0
        L_0x01d1:
            r1 = 2
            r0 = r18
            if (r0 == r1) goto L_0x01ce
            java.lang.String r1 = "۫ۡۧۜ۫ۘۘۖۙۖۚۛۗ۫ۧۘۘۚۨۥۘ"
            goto L_0x01c0
        L_0x01d9:
            java.lang.String r1 = "ۚۘۜۡۙۥۡۨۡ۟ۢۗ۟ۨۨ۫ۨۦۘ۟ۥ۠ۖ۟۬"
            goto L_0x01c0
        L_0x01dc:
            java.lang.String r1 = "ۘۖۧۚ۠۬ۖ۠ۤۜۙۘۧۥۦۘۡۗۜ"
            goto L_0x001a
        L_0x01e0:
            r0 = r24
            android.preference.SwitchPreference r1 = r0.f1167i
            boolean r14 = r1.isChecked()
            java.lang.String r1 = "ۦۦۚ۠ۤۨۘۖۛۡ۬۫ۨ۠۬ۡۘۖۡ۠۫ۡۗۢۥۜ"
            goto L_0x001a
        L_0x01ec:
            r0 = r24
            java.lang.String r13 = r0.f1164f
            java.lang.String r1 = "ۘۘ۬ۚۖ۟۟ۗۨۧ۠ۜۘۥۦۘۙۥۜۘ۫ۦۘۘ"
            goto L_0x001a
        L_0x01f4:
            java.lang.String r1 = "۠ۖۨۜۘۦۘۡۡۛ۟ۖۛۨ۟ۡۘۛۥۧۘۚۙۡ"
            r9 = r14
            goto L_0x001a
        L_0x01f9:
            java.lang.String r1 = "ۗۗ۫ۚۦۙ۟ۡۖ۠۠ۗۤۢۨ۬۟۟ۨ۬ۜۙۥۡۘ۫ۛۨۘ"
            r12 = r13
            goto L_0x001a
        L_0x01fe:
            r0 = r24
            android.preference.SwitchPreference r1 = r0.f1166h
            boolean r8 = r1.isChecked()
            java.lang.String r1 = "۟ۤۨۘۥۛۦۢۥ۟ۖۥۘۚۥۙ۟ۤ۟۫ۙۖ"
            goto L_0x001a
        L_0x020a:
            r0 = r24
            java.lang.String r11 = r0.f1163e
            java.lang.String r1 = "ۛۢۖۢۥۛۡ۬ۛۥۥۡۜۚۡۤ۠ۖۤۢۗ"
            goto L_0x001a
        L_0x0212:
            r6 = 222(0xde, float:3.11E-43)
            java.lang.String r1 = "ۨ۠ۖۘۤۜۦۘۧۜۚۛۧۜۘۛۜۤۤ۬ۨۘ"
            goto L_0x001a
        L_0x0218:
            java.lang.String r1 = "ۖۖ۠ۚۦۘۘۜ۫ۖۚۨۘۗۤۘۗ۬ۡۘ۠۟ۨۘۖۜۗۨۛۨ"
            r10 = r11
            goto L_0x001a
        L_0x021d:
            java.lang.String r1 = "ۢ۟ۖۘۧۖ۠ۚۘۖ۟ۢۨۘۡۘۛۨ۫ۦۘ"
            r7 = r8
            goto L_0x001a
        L_0x0222:
            java.lang.String r1 = "ۖۖ۟ۗۜۗۜۖۤۦۢۡۘۦۚۖ"
            r5 = r6
            goto L_0x001a
        L_0x0227:
            r0 = r24
            r0.c(r10, r5, r7)
            java.lang.String r1 = "ۢۡۡۗۘۨۨۡۚۧ۠ۛۤۡۚۚۤۢۧۖ"
            goto L_0x001a
        L_0x0230:
            r0 = r24
            android.preference.SwitchPreference r1 = r0.f1168j
            boolean r4 = r1.isChecked()
            java.lang.String r1 = "۬ۘۖۧۗۙۚۖۖ۠ۖۢۦ۫ۛ۠ۙ"
            goto L_0x001a
        L_0x023c:
            r0 = r24
            java.lang.String r3 = r0.f1165g
            java.lang.String r1 = "ۡۡۦۧۘۧۘۥۤۨۖۥۤۙۗ۠"
            goto L_0x001a
        L_0x0244:
            java.lang.String r1 = "ۥۢۤۚۥۢ۠ۙۤ۬ۡۜ۠ۖۘ۠ۜۡۘۥۤۤۘۡۛ"
            r12 = r3
            goto L_0x001a
        L_0x0249:
            java.lang.String r1 = "۫۠ۧۚ۠ۥۖۛۡۘۘۚۖۡۦۗۙۙۢۥ۠ۖۘۧۤۜۘ۟ۙ"
            r9 = r4
            goto L_0x001a
        L_0x024e:
            r2 = 333(0x14d, float:4.67E-43)
            java.lang.String r1 = "ۙۙۥۨۡۧ۫ۘ۟۠۠ۨ۬ۖۚ"
            goto L_0x001a
        L_0x0254:
            java.lang.String r1 = "۫۟ۥۘۖۛۘۤۖۘۘۘۚۗۛۗۡۜۛۨۘۜۦۦۙۨۦۘ"
            r5 = r2
            goto L_0x001a
        L_0x0259:
            java.lang.String r1 = "ۚۨۧۚۥۜۜۗۥ۠ۦۥۘۥ۬"
            r7 = r9
            goto L_0x001a
        L_0x025e:
            java.lang.String r1 = "ۨۛۧ۠۠ۦۘ۬ۥۘۘۛۜۡۨۛۙۜۧۘۦۚۖۘ"
            r10 = r12
            goto L_0x001a
        L_0x0263:
            java.lang.String r1 = "ۜ۟ۜۘۙۢ۠ۥۜ۠ۗ۫۟ۗۦۡ"
            goto L_0x001a
        L_0x0267:
            java.lang.String r1 = "ۥۜ۫ۖۨۨ۟ۛۘۛۜۤۙۖۡۥۜ۟"
            goto L_0x001a
        L_0x026b:
            java.lang.String r1 = "ۤۖۘ۫ۦۧۘۗۙ۫۬۫ۢۧۘۗ"
            goto L_0x001a
        L_0x026f:
            java.lang.String r1 = "ۦۨۨ۠ۦۙۢۧۨ۬ۤۜۘۤۢۡۥۢۙۦ۠ۤۙۙۖۘۨۥۨۘ"
            goto L_0x001a
        L_0x0273:
            java.lang.String r1 = "ۜۤۜۘ۬ۜۥ۬۠ۖ۠ۙۥۧۡۘۘ"
            goto L_0x001a
        L_0x0277:
            java.lang.String r1 = "ۧۡۗۛ۬ۜ۬۠ۖۘۦۗۨۜۜۘ"
            goto L_0x001a
        L_0x027b:
            java.lang.String r1 = "ۖۖ۟ۗۜۗۜۖۤۦۢۡۘۦۚۖ"
            goto L_0x001a
        L_0x027f:
            java.lang.String r1 = "۟ۖۢ۬ۘ۟ۛۖۨ۫ۗۨۘۨۧۜۘۙۘۨۘ۟ۤۥۘۘۘۚۧۤۡۘ"
            goto L_0x001a
        L_0x0283:
            java.lang.String r1 = "۫۠ۧۚ۠ۥۖۛۡۘۘۚۖۡۦۗۙۙۢۥ۠ۖۘۧۤۜۘ۟ۙ"
            goto L_0x001a
        L_0x0287:
            java.lang.String r1 = "۟ۤۨۙۡۖۡۦۜۘۛۜۗۨۛۘۘۡ۟ۙ"
            goto L_0x001a
        L_0x028b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.YoSettings.HideMedia.onSharedPreferenceChanged(android.content.SharedPreferences, java.lang.String):void");
    }
}
