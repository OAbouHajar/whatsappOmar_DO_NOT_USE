package com.obwhatsapp.youbasha.ui.YoSettings;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.app;

public class Updates extends BaseSettingsActivity {
    public void checkForUpdates(View view) {
        String str = "ۛۦ۬۠۠۬ۤ۬ۧۦۧۘۘۘۢ۬ۛۤ۠۟۫ۡۘ";
        while (true) {
            switch ((str.hashCode() ^ 447) ^ 754630096) {
                case -1440848030:
                    str = "ۗۨۧۨۙ۟ۡ۬ۘۘۨۜۙۛۘۛ";
                    break;
                case -407375926:
                    Toast.makeText(this, yo.getString("network_required"), 0).show();
                    str = "۫ۧۘۘۡ۬ۘۘۘۜۡۘۜۡۤ۟ۖۖۘ";
                    break;
                case 1312207052:
                    yo.checkV(this, true);
                    str = "ۖۧۦۤۡۨۘۨۖۖۘۤ۬۬ۦۘۥۘۡۘ۬۟ۙۖۘ";
                    break;
                case 1319242505:
                    String str2 = "۟ۧ۫ۙۤۛۙ۬ۖۡۚۙۛۖۧ۟ۢ";
                    while (true) {
                        switch (str2.hashCode() ^ 28764392) {
                            case -543770547:
                                if (!app.checkInternetNow()) {
                                    str2 = "ۧ۫ۛۖ۫ۧ۫ۤۨ۫ۛ۬ۙ۬ۚۤ۠ۘۘۖۙۤۚ۬ۤۗۙ۬";
                                    break;
                                } else {
                                    str2 = "ۢۢۘۘ۟ۥۥۘۧۧۨۘ۟ۡۤۡۥۜۖ۬۫";
                                    break;
                                }
                            case -140685545:
                                str = "۬ۦۨۘۜۤۙۨ۫ۖۘۤ۟ۥۘۨۙ۟ۗۜۜۜۖ۠ۦ۟۠ۦۥ";
                                continue;
                            case 160038942:
                                str2 = "ۧۤۧۧۘۥۢۥۤۖۧۛۘۦۨۘۘۨۛۡۚۜۘۗۤۛ";
                                break;
                            case 803555990:
                                str = "۬ۤۢۥۤۨۘۚۦۘۘۤۖۧۖۗ۟۬ۡۖۘ";
                                continue;
                        }
                    }
                    break;
                case 1726447349:
                    str = "۫ۧۘۘۡ۬ۘۘۘۜۡۘۜۡۤ۟ۖۖۘ";
                    break;
                case 1861144723:
                    str = "۫ۙۦۘۥۗۗۖۚ۬ۦۙۥۗ۠ۡۘۡۡۜۥۖۤ";
                    break;
                case 1950782681:
                    return;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        String str = "ۧۥۡۘ۟ۥۛۦۦۥۘۧۙۜۨۛۜۨۡۨۘۗ۟ۚ";
        while (true) {
            switch ((str.hashCode() ^ 841) ^ 206426294) {
                case -1128332618:
                    super.onCreate(bundle);
                    str = "ۜۘۜۘۢۧ۠۠ۧۘۚۨ۟ۜۛۥۘۦۢۥۘۧ۫۟ۥۜ۬۟ۤ";
                    break;
                case 1000433481:
                    return;
                case 1509451036:
                    setContentView(yo.getID("yo_settings_updates", "layout"));
                    str = "۫ۗۨۧۖۜۘۤۚۜ۫ۦۧ۫ۡۦۘ۟۠ۛۨۤۗ";
                    break;
                case 1531943048:
                    str = "ۤ۟ۜۘۘ۟ۛۢۖۡۧ۬۫ۨۜۘ";
                    break;
                case 2093754385:
                    str = "ۦۥ۫۟ۤ۟ۛۚۜۘۖۧۦۘ۠ۘۖۜ۟ۜۦۚۨۗۢۜۘ۬۫ۜ";
                    break;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0007 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void openChangelog(android.view.View r5) {
        /*
            r4 = this;
            com.obwhatsapp.youbasha.task.changelog r0 = new com.obwhatsapp.youbasha.task.changelog
            r0.<init>(r4)
            java.lang.String r0 = "ۛۖۘۘۜۥۘ۬۟ۤۧۘ۠ۧ۬ۨۘ"
        L_0x0007:
            int r1 = r0.hashCode()
            r2 = 575(0x23f, float:8.06E-43)
            r3 = -1495217282(0xffffffffa6e0cb7e, float:-1.5598279E-15)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -720694522: goto L_0x0016;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x0007
        L_0x0016:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.YoSettings.Updates.openChangelog(android.view.View):void");
    }
}
