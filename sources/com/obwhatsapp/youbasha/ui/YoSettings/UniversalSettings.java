package com.obwhatsapp.youbasha.ui.YoSettings;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import com.obwhatsapp.yo.yo;
import m.d;

public class UniversalSettings extends BasePreferenceActivity {

    /* renamed from: g  reason: collision with root package name */
    public static final int f1221g = 0;

    /* renamed from: e  reason: collision with root package name */
    public ListPreference f1222e;

    /* renamed from: f  reason: collision with root package name */
    public ListPreference f1223f;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long c() {
        /*
            r2 = 0
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x004e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004e }
            r1.<init>()     // Catch:{ Exception -> 0x004e }
            java.lang.String r4 = com.obwhatsapp.yo.yo.datafolder     // Catch:{ Exception -> 0x004e }
            r1.append(r4)     // Catch:{ Exception -> 0x004e }
            java.lang.String r4 = "files/Logs"
            r1.append(r4)     // Catch:{ Exception -> 0x004e }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x004e }
            r0.<init>(r1)     // Catch:{ Exception -> 0x004e }
            com.obwhatsapp.yo.r1 r1 = new com.obwhatsapp.yo.r1     // Catch:{ Exception -> 0x004e }
            r4 = 10
            r1.<init>(r4)     // Catch:{ Exception -> 0x004e }
            java.io.File[] r4 = r0.listFiles(r1)     // Catch:{ Exception -> 0x004e }
            int r5 = r4.length     // Catch:{ Exception -> 0x004e }
            r0 = 0
        L_0x0027:
            r6 = -1832524149(0xffffffff92c5e68b, float:-1.2489281E-27)
            java.lang.String r1 = "ۗ۟ۨۘۜۖۦۚۢۘۚۛۢۙ۟ۗ"
        L_0x002c:
            int r7 = r1.hashCode()
            r7 = r7 ^ r6
            switch(r7) {
                case -1353259833: goto L_0x0035;
                case -388778001: goto L_0x0040;
                case -199383043: goto L_0x004f;
                case 1821242921: goto L_0x003d;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x002c
        L_0x0035:
            if (r0 >= r5) goto L_0x003a
            java.lang.String r1 = "ۚۛ۠ۛ۠ۦۘۗۨۦ۟ۛۘۚ۫ۖۘۥۙۦ"
            goto L_0x002c
        L_0x003a:
            java.lang.String r1 = "ۜ۠ۘۘۦۜۥۘۤۢۥۢ۬ۨۘۗۨ۠ۚۙۧۥۖۗۥ۟ۧۨۢۤ"
            goto L_0x002c
        L_0x003d:
            java.lang.String r1 = "ۦۨۜۘۦ۬ۧ۟ۥۜۤۛۦۙۨۥۘۘۘۨۘۡۗۨۘۨۘ"
            goto L_0x002c
        L_0x0040:
            r1 = r4[r0]     // Catch:{ Exception -> 0x004e }
            long r6 = r1.length()     // Catch:{ Exception -> 0x004e }
            r8 = 1048576(0x100000, double:5.180654E-318)
            long r6 = r6 / r8
            long r2 = r2 + r6
            int r0 = r0 + 1
            goto L_0x0027
        L_0x004e:
            r0 = move-exception
        L_0x004f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.YoSettings.UniversalSettings.c():long");
    }

    @SuppressLint({"MissingSuperCall"})
    public void onCreate(Bundle bundle) {
        String str = "ۤۘۡ۟ۡۦۘۢ۫ۨۘ۫ۙۙۢ۟ۡۛۨۚ۠۟ۤ۫ۚۤۗ";
        StringBuilder sb = null;
        Preference preference = null;
        ListPreference listPreference = null;
        ListPreference listPreference2 = null;
        while (true) {
            switch ((str.hashCode() ^ 862) ^ -1804291618) {
                case -2028761176:
                    str = "ۨۨ۠ۢۧۖۘۛ۬ۡۘۗۘۤۢۦۧ";
                    break;
                case -1994698621:
                    str = "ۛۧۥۘ۬ۥۧۘۚۚۖۘۤۛۚۗۜۖۘۨۜۗ";
                    listPreference2 = (ListPreference) findPreference("Language");
                    break;
                case -1935637818:
                    str = "۬ۚۧ۫ۙۥۜۛۙۧۨۦۥۚۤ۫ۛۚ";
                    preference = findPreference("clear_logs");
                    break;
                case -1898094611:
                    str = "ۗۡۜۘۦۥۥۘۛۜۡۘۥۘۡۘۚ۟ۢۜۙۨۘۦۜۖۘ۬ۢۦ";
                    break;
                case -1862997889:
                    setContentView(yo.getID("yo_settings_prefsview", "layout"));
                    str = "ۤۥۖۦۧۘ۬۠ۙۦۛ۫ۙ۫ۚ۫ۢۛ";
                    break;
                case -1692876860:
                    this.f1222e = listPreference2;
                    str = "۠ۦۘۘ۫ۜۡۘ۟ۗۢۙۗ۠ۦۙۙۜۛۤۗۤۘۘۦۖۥۘ";
                    break;
                case -1605444489:
                    sb.append(" MB");
                    str = "ۘۚۤۦۚ۟ۤۨۜ۠۬ۦۧ";
                    break;
                case -1203782571:
                    sb.append(c());
                    str = "ۗۧۧۢۢۨۘۥۚۘۢۡۤ۫ۛ۠ۗۧ";
                    break;
                case -1100545116:
                    sb = new StringBuilder();
                    str = "ۦۚۨ۬ۗۡۘۥۡۡۜۦۡۡۙۘۘۖۦۚۤۤۦۙۛۡۘۤۤ";
                    break;
                case -714099243:
                    listPreference2.setSummary(yo.getCtx().getResources().getConfiguration().locale.getDisplayLanguage());
                    str = "ۛۗۨۘۜۗۛۗۛۖۘۘۤۖۘۤ۬ۛۢ۟ۦۘ۬ۛ۫ۧۙۨۘ";
                    break;
                case -397114705:
                    addPreferencesFromResource(yo.getID("yo_universal_settings", "xml"));
                    str = "۟ۖۧۘۨۜ۫ۜۤۡۗۦۘۗ۫ۥۘ۬۫ۢۘۨۜۘ۟ۙ";
                    break;
                case -135054358:
                    preference.setOnPreferenceClickListener(new d(this, 1));
                    str = "ۢ۟ۘۥۚۦۘۚ۟ۘۘۧۡۚۜۡ۫ۡۗۨۖۗۚۥۥۖۛ۠";
                    break;
                case 382289340:
                    preference.setSummary(sb.toString());
                    str = "۟ۙۦۘۢۡۧۘۚۙۗۧ۟ۘۘۖ۫۫۬ۡۧۦۙۢۜ۬ۙ";
                    break;
                case 445536295:
                    return;
                case 594519795:
                    this.f1223f = listPreference;
                    str = "ۤ۠ۗۙۚۡۘۘ۟ۛۥۜۡۘۥ۠ۖۘۦۨۨۘۘ۫ۧ۟ۤۧۖ۬ۜ";
                    break;
                case 798823364:
                    str = "ۤۙۦۘۥۨۡۘۚ۬ۤۥ۬ۢۛۜۖۘۨۖۚۤۗۥ";
                    listPreference = (ListPreference) findPreference("trans_def_to");
                    break;
                case 1168654031:
                    super.onCreatePrivate(bundle);
                    str = "ۤۚۥۘ۫ۥۡۘۡۖ۫ۘۛۘۘۨۧۢۧۨۗۖ۬ۙۦۡۡۘۛۗ";
                    break;
                case 1754051354:
                    listPreference.setSummary(listPreference.getEntry());
                    str = "ۙۗۘۤ۫ۢۤۘۡۘۙۥۗۖ۫ۦ۟ۥۘ۠ۘۖۘۗۤۨ۬۫ۦ";
                    break;
            }
        }
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        String str2 = "ۢ۟ۡۘۘۨۧۤۜۗ۬ۦۘۚۨۨۘ۫ۥۨۙۗۨ۟ۧ";
        ListPreference listPreference = null;
        ListPreference listPreference2 = null;
        while (true) {
            switch ((str2.hashCode() ^ 619) ^ 1810201025) {
                case -1634848594:
                    str2 = "ۖۗۚ۬۠۠۬۬ۘۘۚۖۖۘۗۜۗ";
                    break;
                case -1280043768:
                    listPreference2.setSummary(listPreference2.getEntry());
                    str2 = "ۥ۫ۚۖۙ۠ۛۤۚۡۖۤۦ۠ۖ۟ۦۘۘ۬ۜۤ۫ۡۗۢۢ۠";
                    break;
                case -613838133:
                    str2 = "ۘۛۨۢۜ۫ۧۧ۟ۨۥۨۥۧ";
                    break;
                case -464275030:
                    str2 = "ۢۥ۬ۤۘۥۘ۬۫۠۬ۤۙۜۖ۬";
                    listPreference2 = this.f1223f;
                    break;
                case -297223230:
                    return;
                case 174092861:
                    listPreference = this.f1222e;
                    str2 = "ۖۢۖۦۡۜۘۨۜۙۛۙۢۛۥۨ۫۬ۦ";
                    break;
                case 422327280:
                    super.onSharedPreferenceChanged(sharedPreferences, str);
                    str2 = "ۨۜۚۖۦۥۦۙۘۙۜۦۘۧۘۜ";
                    break;
                case 652332429:
                    listPreference.setSummary(listPreference.getEntry());
                    str2 = "ۙۧۛ۠ۜۗ۬ۢۗۜۧۖۘۥۢۧۖۜۗۢۡۘۤۨۖ۫ۨۥ";
                    break;
                case 997620270:
                    str2 = "ۥۛۨۘۢۥۖۜ۫ۡۜۤۖۘۖۨۘۜۧۜۘۚ۬ۤۧۦۧۘ";
                    break;
            }
        }
    }
}
