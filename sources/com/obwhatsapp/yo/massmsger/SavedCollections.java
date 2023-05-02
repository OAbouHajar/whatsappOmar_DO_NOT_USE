package com.obwhatsapp.yo.massmsger;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.ArrayMap;
import android.widget.ImageView;
import android.widget.ListView;
import androidx.appcompat.widget.Toolbar;
import com.obwhatsapp.yo.ColorStore;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;
import com.obwhatsapp.youbasha.ui.YoSettings.BaseSettingsActivity;
import h.b;
import h.e;
import java.util.Iterator;
import java.util.Map;

public class SavedCollections extends Activity {

    /* renamed from: a  reason: collision with root package name */
    public static SharedPreferences f819a;

    /* renamed from: b  reason: collision with root package name */
    public static ArrayMap f820b;

    /* renamed from: c  reason: collision with root package name */
    public static e f821c;

    public static String addNewCollection(String str, String str2) {
        String str3 = "۫ۚۖ۫ۥۨ۠ۤ۠۫۬ۗۜۢۦۥ۬ۧ";
        e eVar = null;
        ArrayMap<String, String> arrayMap = null;
        String str4 = null;
        StringBuilder sb = null;
        while (true) {
            switch ((str3.hashCode() ^ 254) ^ 1949803823) {
                case -1763747969:
                    eVar.f1752b = arrayMap;
                    str3 = "ۢۜ۠ۙۤۛ۬ۗۜۘ۟ۜۤۨۛۚ";
                    break;
                case -1133390429:
                    f819a.edit().putString(str4, str2).apply();
                    str3 = "ۨ۟ۜ۠ۘۜۜۙۜۘۛۗ۟ۢۡۗۙۨۧۘۢۜۥۘ";
                    break;
                case -369763312:
                    str3 = "ۦ۫ۖۘۧۙ۠ۨۜۨ۫ۢۤ۟ۛۦۦۡۚۦۜ۫";
                    break;
                case 10474411:
                    sb.append("_");
                    str3 = "ۡۜۢ۬ۡ۟ۨ۫ۡۙۛۘۜ۫۟۟۠ۘۘۢۤۡۘ";
                    break;
                case 79096465:
                    str3 = "۬ۧۚۢۜۤۢ۠ۛ۠ۛۧ";
                    break;
                case 153996224:
                    eVar.notifyDataSetChanged();
                    str3 = "ۢۥۜۘ۬ۨۥۢ۠ۧۧۤۤ۟ۘۢۦۢۖۧ۟ۤ۠ۧۘۨۖ";
                    break;
                case 470483595:
                    increaseCount();
                    str3 = "ۡۢ۫۫ۧۦۘۖۗۛ۫ۘۧۘۚۡۙ";
                    break;
                case 628804235:
                    str3 = "ۘ۫ۨۘۡ۟ۦۧۛۜۜ۟ۗۗ۬ۥۘۡ۟ۢ";
                    arrayMap = getSavedCollections();
                    break;
                case 641720438:
                    eVar = f821c;
                    str3 = "ۥ۟ۡۤ۠ۨۘ۫ۛۡۘۤۜۥۖۧۦۘ۠ۡۥ";
                    break;
                case 956788381:
                    return str4;
                case 1135320286:
                    sb.append(str);
                    str3 = "ۤۧۨۘ۟ۙ۫ۦۦۧۘۤ۠ۥۜ۫۬۫ۚۖۘ";
                    break;
                case 1276444051:
                    sb.append(getCount());
                    str3 = "ۚۨۥۦ۬ۜۙۨۦۨۗۡۘۢۨۙۢۛۥۘۦۜ۟ۦۖۖۘ";
                    break;
                case 1297497157:
                    str3 = "ۢۢۖۧۧۨۗ۠ۥۘۚ۫ۜۗۦۦ۠ۧۥۘ۫ۧۨ۟۫ۖ";
                    str4 = sb.toString();
                    break;
                case 1382222490:
                    f820b = arrayMap;
                    str3 = "ۢۢۜ۠ۤۚ۬ۖۢۥۙ۫ۚۨ۬۬ۙ۫ۤۜۘ";
                    break;
                case 1498568579:
                    str3 = "ۥۚۜۥ۟۟ۧۜۘۖۤۖۘۢۚۙۜ۬ۛۡۜ۬ۙ۫ۨۦۦۦ";
                    sb = new StringBuilder();
                    break;
            }
        }
    }

    public static void deleteCollection(String str) {
        String str2 = "ۚۧۦۘ۠ۗۖۦۜۢ۠ۡۧۛۡۥۘۨۙ۬ۗۗۘۦۤ۬";
        e eVar = null;
        ArrayMap<String, String> arrayMap = null;
        while (true) {
            switch ((str2.hashCode() ^ 573) ^ -502383434) {
                case -1910351024:
                    f819a.edit().remove(str).apply();
                    str2 = "ۢۡۗۚۚۜ۠ۨ۬ۖۤ۫ۦۡۚ۬ۜۘۥۨۢ";
                    break;
                case -1098506153:
                    eVar.notifyDataSetChanged();
                    str2 = "ۤۨۢۚ۬ۙۜ۫ۙۖۙ۟ۜۙۥۥۤۜۘ";
                    break;
                case -988326180:
                    eVar = f821c;
                    str2 = "ۖۙۚ۟۬ۘۘۨۡ۠۬ۥۜۘۨۤۧ۟۬ۗۘۚۘۘۥۚۨۧۧۥ";
                    break;
                case 68678133:
                    str2 = "۠ۨۗ۫ۙ۟ۦۖۦۦۡۘۘ۠ۡ۫";
                    break;
                case 645488855:
                    f820b = arrayMap;
                    str2 = "ۡۗۢۖ۟ۥۗۗۙۚ۬ۖۘۜۨۗۤۛ۫۠ۨۥ";
                    break;
                case 758640131:
                    return;
                case 813134144:
                    eVar.f1752b = arrayMap;
                    str2 = "ۥ۬ۤۤۡۙ۠ۡۖۘۨۗۦۘۤ۬ۧ";
                    break;
                case 1542524146:
                    str2 = "ۧۨۧۘۤۡۙۛۘۜۘۖۛۥۚۦۥۘ";
                    arrayMap = getSavedCollections();
                    break;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getCount() {
        /*
            java.lang.String r0 = "ۖۡ۬۠ۜۖۘۙۦ۬ۜۨۘۘۘۨۘۘۦۙۡۧۥۤۖۦۧ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 994(0x3e2, float:1.393E-42)
            r3 = -1178171982(0xffffffffb9c685b2, float:-3.7865114E-4)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 155528723: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            android.content.SharedPreferences r0 = f819a
            java.lang.String r1 = "index"
            r2 = 0
            int r0 = r0.getInt(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.massmsger.SavedCollections.getCount():int");
    }

    public static ArrayMap<String, String> getSavedCollections() {
        String str = "ۜۨۧۡۡۧۘۖۤۚۛ۫ۥۘۦۙۖ۬ۦۥۘۙۡۨۘۨۥۢ";
        Map.Entry entry = null;
        Iterator<Map.Entry<String, ?>> it = null;
        ArrayMap<String, String> arrayMap = null;
        while (true) {
            switch ((str.hashCode() ^ 579) ^ 2040795400) {
                case -937315044:
                    String str2 = "ۥۜۖ۬ۚۦۘ۠ۧ۫ۧۧۜۤۛۜ۟ۥۥۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 322850204) {
                            case -2126436165:
                                if (!it.hasNext()) {
                                    str2 = "ۨۗۗۙۛۘۘۚ۟۫ۡۖۨۘۛۥۜۘ";
                                    break;
                                } else {
                                    str2 = "ۤۢۙ۫۫ۘۙ۫ۡۘۧۨۥۘۘۧۧ";
                                    break;
                                }
                            case -2031542558:
                                str2 = "۫ۥۘۘۧۘۘۛۡۧ۫۟۠۟ۙ";
                                break;
                            case -1948869157:
                                str = "ۨۥۛۤۘۗ۠ۗۡۘۥۚۛۢۜ۬۠ۡۚ";
                                continue;
                            case 1582764494:
                                str = "ۥۗۡۦۘۥ۬۠ۧۧۡۚۡۛ۫۬ۡ۬ۦۜ۟۫ۚۧ۬ۛۜ";
                                continue;
                        }
                    }
                    break;
                case -826158029:
                    return arrayMap;
                case -2517482:
                    arrayMap.put((String) entry.getKey(), entry.getValue().toString());
                    str = "ۗۖۥۘۘۢۧۜۨ۫ۦ۟ۖۘۤۧۦ۫ۚۚۡۖۡ۬ۚۥۙ";
                    break;
                case 209833963:
                    str = "ۨۖۘۘۚۨۡۘۚۖۖۘۗ۠ۗ۠ۚۖۘۧۘۤ۠ۛ۠ۦۘۡ";
                    arrayMap = new ArrayMap<>();
                    break;
                case 1096320268:
                    str = "ۜ۫ۜۘۙۦۨۘۜ۫ۦۡۥۖۘۢۜۜۛۗۛ۠۫ۘۘ";
                    entry = it.next();
                    break;
                case 1185378447:
                    str = "ۢۡۙۧۤۨۘۘۥۘۘۥۡۡۘۘۥۚۤ۬ۚۘۡۘۧ۠ۡۨۚۘۘ";
                    it = f819a.getAll().entrySet().iterator();
                    break;
                case 1765829692:
                    str = "ۢۡۙۧۤۨۘۘۥۘۘۥۡۡۘۘۥۚۤ۬ۚۘۡۘۧ۠ۡۨۚۘۘ";
                    break;
                case 2041315409:
                    arrayMap.remove("index");
                    str = "ۚۙ۫ۛۡ۠۠ۤۥۘ۫ۖۛۖۢۧۨۚۖۘۛ۫ۘۘۛۜۦۘۨۡۘ";
                    break;
            }
        }
    }

    public static void increaseCount() {
        int i2 = 0;
        String str = "ۦۙۥۘ۠ۚۢۙۢ۠ۘۦۧۡۦۦۘۗۗۥ۬ۚۙۦۥۜۘ۫۟ۧ";
        while (true) {
            switch ((str.hashCode() ^ 132) ^ 1841281213) {
                case -765386674:
                    i2 = getCount();
                    str = "۟ۙ۠ۚۨۘۛۤۜۘۦۢۙۡ۠۬";
                    break;
                case 435626272:
                    f819a.edit().putInt("index", i2 + 1).commit();
                    str = "ۖۘۧۘ۬ۦۡۘۗۘۜۛۨۡۘۦ۫ۗ";
                    break;
                case 916183854:
                    return;
            }
        }
    }

    public static String updateCollection(String str, String str2, String str3) {
        String str4 = "ۧ۫ۜۚۛۖۢۥۘۘۘۥۜۘۧۦۦۘ۬ۡۦۘۗ۠۫ۖۛۥۘۦ۠ۢ";
        e eVar = null;
        ArrayMap<String, String> arrayMap = null;
        String str5 = null;
        StringBuilder sb = null;
        String str6 = null;
        while (true) {
            switch ((str4.hashCode() ^ 247) ^ 1963219631) {
                case -2093717174:
                    str4 = "ۤۦ۬ۤ۫ۧ۠۬ۚۦۨۜۘۙۤۥۘ";
                    break;
                case -2011774144:
                    str4 = "۫ۥۧۛۗۨ۟ۨۘۘۚۨۥۘۛۤۢۨۚۙ۫ۨۤۥ۠ۘۧۙۥۘ";
                    break;
                case -1730535498:
                    f820b = arrayMap;
                    str4 = "ۘۥ۟ۨ۠ۥۗۙ۬ۧۥۘۗۘ۫۫ۘۥۘ";
                    break;
                case -1698303080:
                    eVar.f1752b = arrayMap;
                    str4 = "ۤۜ۫ۨ۬ۘۘۥۗۗۦۥۥۘۖۡ۬ۘۗۤ";
                    break;
                case -1677423049:
                    str4 = "ۙ۟ۨۘ۠ۛۦۦ۫۫ۛۡۖۘۧۨ";
                    sb = new StringBuilder();
                    break;
                case -1586149460:
                    str4 = "ۥ۠ۘۘۦ۬ۘۚۗۤ۫ۘۡۥۢۨۘۘۢۖۘ۫ۦۗۨۘ";
                    str6 = str.substring(0, str.indexOf("_"));
                    break;
                case -1398327537:
                    return str5;
                case -1281758617:
                    eVar = f821c;
                    str4 = "ۡۖۜۘۜۡۦۚ۫۫ۥ۟ۙۥۨۧۘۗۗۦۘۧۨۡۧۡ۟";
                    break;
                case -466962654:
                    sb.append(str6);
                    str4 = "۬ۙۤۘۡۦ۠۫ۤۖۨۥۘۙۚ۟ۤۙۧ";
                    break;
                case -369316460:
                    sb.append("_");
                    str4 = "۟۬ۨ۫ۤۙۘۜ۬ۢۚۡۘۗ۬۬ۛۤ";
                    break;
                case -192198601:
                    str4 = "ۘۙۨۘۤۢ۬ۚۗۥۡۨۘۤۛ۬ۦۚۛ";
                    break;
                case 527053551:
                    str4 = "ۛۦ۟۟ۜۧۘ۬ۤۘۘۘۧۛ۟ۨ۠ۗۗۦ";
                    str5 = sb.toString();
                    break;
                case 623145364:
                    str4 = "ۗۦۤۗۧۚۘۡۘۛۥۙۢۤۧۦۤ";
                    arrayMap = getSavedCollections();
                    break;
                case 1387035862:
                    sb.append(str2);
                    str4 = "ۘ۠ۖۖۡۦۦۧۘ۠ۥ۬ۜ۠۟ۘۡۙۛۙۦ۫ۖۛۢ۫ۚ";
                    break;
                case 1562930841:
                    f819a.edit().remove(str).putString(str5, str3).apply();
                    str4 = "ۜۨۗ۬۬ۖۘۦۨۧۥۘ۫ۜۧ۬ۗۦۘ۫ۨۥۘۖ۠ۘۘۨۜۢ";
                    break;
                case 2014573884:
                    eVar.notifyDataSetChanged();
                    str4 = "ۗ۫ۥ۫ۙۚ۫ۘۨۘۘۨۚۥۥ۠ۙۥۤۗ۫ۢ۠ۙۜۤۦۘ";
                    break;
            }
        }
    }

    public void attachBaseContext(Context context) {
        String str = "ۨۥۧۙۤۖۙۥۨۦۧۘۘۨۨۦ";
        while (true) {
            switch ((str.hashCode() ^ 905) ^ -1116741822) {
                case -1065313002:
                    super.attachBaseContext(yo.getCtx());
                    str = "۬ۨۛۦۘ۫ۥۧۦۛۚۡۖ۟۟ۢ۫۫ۡۗۨۡۨۘ۟ۨۡۘ";
                    break;
                case -1000617944:
                    return;
                case 971852078:
                    str = "ۙۨۧۘ۟ۛۦۘۚۤۘۘ۟ۦۨۘۡۧۡۘ۫ۙ۠ۦۡۨۘۡۚۨۡ۬ۦ";
                    break;
                case 1136754881:
                    str = "ۡۦۧۘۤ۠ۦۘ۠ۖۙ۠ۖ۬۟ۥۘۗۖۖۛۜۦ۠ۖ۬ۖ۫ۧ";
                    break;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        Toolbar toolbar = null;
        String str = "ۚۦۛ۠ۢۜۘ۟ۗۘ۠۫ۡۘۜ۫ۧۖۧ۫۫ۗۡۘ";
        while (true) {
            switch ((str.hashCode() ^ 833) ^ -1581399380) {
                case -846679809:
                    f820b = getSavedCollections();
                    str = "۫ۨۘۘ۫ۛۦۢۢۘۘۚۡۨ۫ۘۖۘۢۙ۠ۦۦ۟ۖۤۡۘۙۜۘۘ";
                    break;
                case -778403776:
                    str = "۠ۨۡۦۡۢ۫ۧۥۘۨۛۖۙ۟ۡۘۡ۠ۨ";
                    toolbar = (Toolbar) findViewById(others.getID("acjtoolbar", "id"));
                    break;
                case -559255907:
                    str = "ۡ۫ۛۡۚۜۜۚۤۡۖۤۨۖۧۤ۬ۘۘ۟۟ۛ";
                    break;
                case -476572200:
                    super.onCreate(bundle);
                    str = "ۘ۬۫ۡۡۨ۠ۗۦۘۚ۫ۦۘۨۜۨۘۡۖۧۘۡۥۤۢۚۡۘۚۥ۬";
                    break;
                case -416558353:
                    toolbar.setNavigationOnClickListener(new b(this, 0));
                    str = "ۨ۠ۥۘ۠ۜ۟ۥۧۙۗۡۘۘۗۛۦ";
                    break;
                case -201736793:
                    return;
                case 33908294:
                    ((ImageView) findViewById(yo.getID("add_schedule", "id"))).setOnClickListener(new b(this, 1));
                    str = "۬ۗۨۘۧۛۖۘۗۖۦۦۦۥۘ۟ۨۨۢۢۧۤ۬ۚۗۨ";
                    break;
                case 36949661:
                    toolbar.setTitle((CharSequence) yo.getString("massmsgr_title"));
                    str = "ۡۜۤۨۚۡۡۜۧۘ۫۬ۚۢۤ۟ۖ۬ۗۨۘۦۜۗۘ";
                    break;
                case 282598036:
                    f819a = yo.getCtx().getSharedPreferences("massCollections", 0);
                    str = "ۧ۬ۚۛۙۧ۟ۧۥۘ۫ۘۥۘۜۚ۫ۦۙۢۦۡۘۘۘۢۢۙۤۢ";
                    break;
                case 543443211:
                    BaseSettingsActivity.configToolbar(toolbar, this);
                    str = "ۖۦۦۘ۠ۢۨۡۚۘۘ۟ۢۗ۠ۥۧۦۦۢۜۗۗۥۙۡۘ";
                    break;
                case 820301495:
                    str = "ۦۘۥۘ۠ۤۥ۟ۖۧۖۨۘۘۦ۠ۨۘ";
                    break;
                case 1155827547:
                    ((ListView) findViewById(yo.getID("list_Scheduler", "id"))).setAdapter(f821c);
                    str = "۬ۘۨ۬ۛۜ۠ۤ۫ۥۙۧۤ۠ۡۘۚۧۜۧۙۘۖۚ۟۟ۘۗ";
                    break;
                case 1233090036:
                    setContentView(yo.getID("autoscheduler_list", "layout"));
                    str = "ۨ۟ۡۤۨۙۨۤۘۘۥۡۖۘۖۥۡ";
                    break;
                case 1616722431:
                    toolbar.setTitleTextColor(ColorStore.getPrimaryTextColor());
                    str = "ۚۗ۟ۤ۟ۥۘۛۤۨۜۧۥۘۢۛ۫ۘۘۧ";
                    break;
                case 1720766328:
                    f821c = new e(this, f820b);
                    str = "۠ۤۥۖۘۘۖۖۢۚ۟ۗۙ۬ۥۡۨۘۥۨۨۙۘۖ";
                    break;
            }
        }
    }

    public void onResume() {
        String str = "ۖ۠۬ۗۖۤ۫۫ۖۧۚۦۘۡۤ۟";
        e eVar = null;
        ArrayMap<String, String> arrayMap = null;
        while (true) {
            switch ((str.hashCode() ^ 259) ^ -409062697) {
                case -1695585868:
                    eVar = f821c;
                    str = "ۨ۟۟۬ۦۗۡۡۧۜۧ۠ۚ۫ۦۘۢ۫ۛۨۦ";
                    break;
                case -1026870634:
                    eVar.notifyDataSetChanged();
                    str = "۟۫۬ۧۙۦۡۢۡۘۤۗۛۤۨۨ";
                    break;
                case -619540002:
                    eVar.f1752b = arrayMap;
                    str = "ۙ۬ۖۘۥۦ۠ۨۜۘۘۦ۫ۖۘۢ۟";
                    break;
                case -113824176:
                    str = "ۡۧۢۜۧۚۜۧۜۗۛۚۜۘۘۚۡۗۨ۬۬ۜۥ۠۠ۢ";
                    break;
                case 862419695:
                    f820b = arrayMap;
                    str = "ۤۨۦۦۙۗۜۥۚۤۦۡۘۚ۟ۜۚۢۗ";
                    break;
                case 1415173417:
                    super.onResume();
                    str = "ۚ۫ۘۛۜۜۧۛ۠۠ۧۥۘۗۜۛ";
                    break;
                case 1509157436:
                    return;
                case 1573964496:
                    str = "۟۬ۗۗۖۡۨۡۢۛۤ۠ۥ۫ۧ";
                    arrayMap = getSavedCollections();
                    break;
            }
        }
    }
}
