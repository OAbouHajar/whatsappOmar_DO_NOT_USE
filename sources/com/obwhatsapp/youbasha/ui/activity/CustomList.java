package com.obwhatsapp.youbasha.ui.activity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.widget.Toolbar;
import com.obwhatsapp.yo.shp;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;
import com.obwhatsapp.youbasha.ui.YoSettings.BaseSettingsActivity;
import com.obwhatsapp.youbasha.ui.views.CustomListAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class CustomList extends BaseSettingsActivity {

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f1241b;

    /* renamed from: c  reason: collision with root package name */
    public CustomListAdapter f1242c;

    public static void deleteJidCustom(String str) {
        String str2 = "ۦۚۛۤۢۛۚۡۨۧۢ۬ۘۨۚ۬۬ۘ";
        int i2 = 0;
        StringBuilder sb = null;
        String[] strArr = null;
        int i3 = 0;
        while (true) {
            switch ((str2.hashCode() ^ 567) ^ -195692953) {
                case -1720389228:
                    sb = new StringBuilder();
                    str2 = "ۚۥۜۘ۫۟ۦۜۖ۟ۥۘۧۗ۠ۘۚۡ";
                    break;
                case -1703851499:
                    String str3 = "ۛ۠ۖۘ۠ۤۜۘۜۨۜۚۢۥۘ۟ۥۘ";
                    while (true) {
                        switch (str3.hashCode() ^ -705735890) {
                            case -1819584845:
                                str2 = "ۛۥۧۘۙۧۥۘۦۖۦۘۧۢۧۛۚۚ۫ۥۥ۠ۥۨۖۨۢ";
                                continue;
                            case 946549600:
                                if (i3 >= 6) {
                                    str3 = "۬ۥۘ۬ۛ۟۫ۨ۟ۢۖ۠ۥ۫۬ۨ";
                                    break;
                                } else {
                                    str3 = "۫ۚۖۘ۬ۢۖۚۖۘۘۙۦۦۗۥ۫ۘۗۖ";
                                    break;
                                }
                            case 1223991279:
                                str2 = "ۛ۠ۛۤۥۛۧۜۢۢۡۚۖۜۚۖۨۘ";
                                continue;
                            case 2109812422:
                                str3 = "ۢ۬ۢ۫ۨۨۢۥۘۤۡۢۗۗ۬ۤۨۘۦۜۘۘ";
                                break;
                        }
                    }
                    break;
                case -222613972:
                    sb.append(strArr[i3]);
                    str2 = "ۗۥۢ۬ۢ۬ۤۗۦۘ۫۫ۤۘۙۡۗۙۧۛۜۖۘ۟ۛۚۥۡۛ";
                    break;
                case -151513703:
                    str2 = "ۧۥۦۘ۬ۜۙ۫۠ۛ۟ۢۙۥۨۜۘ۟ۜۢ۟ۛ";
                    break;
                case 51285257:
                    str2 = "۬ۜ۫ۖۡۚۚۢ۬۟ۢۧۥۚۨۧۡۧۙ۠ۘۘۨۡۘۘ۫ۚۢ";
                    strArr = specPrivacy.f1276g;
                    break;
                case 271295534:
                    shp.removePrivKey(str);
                    str2 = "ۗۜۤۤۢۘۘۦۘۡۗۗ۬ۗۤ";
                    break;
                case 684178614:
                    sb.append(str);
                    str2 = "ۚۢۜۘۚۨۚۨۘۢۖۘۨۘۤۥۡۘ";
                    break;
                case 771674841:
                    str2 = "ۖۘ۠ۧۘۤۛ۠ۜۘۜۢۖۘۧۦ۠ۡۚۗۙۢۜۦۤ۟";
                    i3 = i2;
                    break;
                case 1356969376:
                    i2 = i3 + 1;
                    str2 = "۬ۦ۫ۗ۟ۚۚۤۗۖۢۛۖۚۖۘ";
                    break;
                case 1400884516:
                    shp.removePrivKey(sb.toString());
                    str2 = "ۛۥ۫۬ۥۗۜۜۡ۬۟ۧۢ۟ۜۘۤ۫";
                    break;
                case 1431612187:
                    return;
                case 1439785982:
                    str2 = "ۧۥۦۘ۬ۜۙ۫۠ۛ۟ۢۙۥۨۜۘ۟ۜۢ۟ۛ";
                    i3 = 0;
                    break;
                case 1763934180:
                    str2 = "ۨۗۙۤۜۥ۠ۜۦۘۢ۟ۡۘۚۦۤ۬ۧۥۗۗۢۡۚۢ";
                    break;
                case 2095183191:
                    str2 = "ۚ۠ۢۥۖ۬ۥۗۜۘۧۦۧۘۧۘ";
                    break;
            }
        }
    }

    public static ArrayList<String> getCustomJIDs() {
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            Iterator<Map.Entry<String, ?>> it = shp.getAllPriv().entrySet().iterator();
            while (true) {
                String str = "ۡۡۧۘۦ۫ۨۘۜۖۜۘۤۖۧۖۚۜۘۤۖۜ۫ۖ۟ۜۧۚ";
                while (true) {
                    switch (str.hashCode() ^ 1892203985) {
                        case -673729994:
                            return arrayList;
                        case 151150025:
                            String str2 = (String) it.next().getKey();
                            String str3 = "ۨۛ۟ۘۤ۫ۥۢۘۚۜ۬ۦۛۥ";
                            while (true) {
                                switch (str3.hashCode() ^ 75048025) {
                                    case -1554451503:
                                        arrayList.add(str2);
                                        continue;
                                    case -991918357:
                                        str3 = "ۙ۫ۢ۫ۘۘۘ۬۬ۖۘۧۨۧ۟ۧۡ۠۫ۚۤۡۢ";
                                        break;
                                    case -982762921:
                                        if (!str2.matches("[\\d+-]*")) {
                                            str3 = "ۥۨۢۘۡۧۘۘ۬ۘۘۦۦۢۖۡۘ۟ۦۚۖ۫ۛۢۦ۠ۦۧۘ";
                                            break;
                                        } else {
                                            str3 = "ۥۤۜ۟ۗۙۚۨ۠ۤۥ۠ۙ۬ۡۘۚۡۨۘ";
                                            break;
                                        }
                                    case 1153679551:
                                        break;
                                }
                            }
                            break;
                        case 327495809:
                            str = "ۖ۬ۖۘ۟ۥۙۡۥۦۘ۟ۜۗۥۘۢۙ۬ۤۦۧۤ";
                            break;
                        case 1843887421:
                            if (!it.hasNext()) {
                                str = "ۚ۫ۘۘ۬۠ۙ۬ۡ۠ۦۚۙۥۙۖۦۖۡۜۦ";
                                break;
                            } else {
                                str = "ۨ۫ۦ۠ۨۥ۟ۡۜۨۖۧۘۧ۬۠۫ۘۜۘۤۖۧ";
                                break;
                            }
                    }
                }
            }
        } catch (Exception e2) {
            return null;
        }
    }

    public void attachBaseContext(Context context) {
        String str = "ۤۜۖۘۡۢۥۢۡ۫ۦۥۦۘ۫ۜۢ۬ۦۦۘۡ۠ۨۚ۬ۘۘ۬ۖۚ";
        while (true) {
            switch ((str.hashCode() ^ 326) ^ 228619261) {
                case -2063104558:
                    return;
                case 110681413:
                    super.attachBaseContext(yo.getCtx());
                    str = "ۙۗۙ۫ۤ۟۟ۨۦۥۚ۠ۙۢۙ۬ۘ۠ۦ۟ۘۘۖۖۥۘ";
                    break;
                case 672078549:
                    str = "۬ۖۤۡۘۨۘۜۨۢۙۘ۟ۘۖۤۤۦۡۖۨۗۘ۬ۨ۫۟ۥ";
                    break;
                case 2067411588:
                    str = "ۚۢۛۨۢۡۚۘۘۥۡۘۘۗۘۖۘ۫۠ۨۜۜۘۘ";
                    break;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        Toolbar toolbar = null;
        String str = "ۘۛۥۨۡۡۘۧۖۦۘ۟۫ۡۘۤۡۛ";
        while (true) {
            switch ((str.hashCode() ^ 46) ^ 586098937) {
                case -1973732457:
                    super.onCreate(bundle);
                    str = "ۖۢۢۡۦۡۤۧۗۥۦۧۘۢۚۥۘۢۥۦ";
                    break;
                case -1844210043:
                    str = "ۗۘۜۘ۠ۖۖۘۦۧۗۗۧۧۖ۬۟ۥۜۦۙۗ۠۫ۤ۟";
                    break;
                case -1823695605:
                    BaseSettingsActivity.configToolbar(toolbar, this);
                    str = "ۢۧۨۘۚۙۥۦۜۦۘ۫ۦۛۘۧۗ";
                    break;
                case -1816372412:
                    this.f1242c = new CustomListAdapter(this, this.f1241b);
                    str = "ۜۨۡۢۖۚۛۧ۟ۨۖۨۘ۟ۜۧ۬ۤۛ";
                    break;
                case -1524175889:
                    setContentView(yo.getID("activity_customlist", "layout"));
                    str = "۫ۛۗۡۧۤۧۦۡۢۤۡۘۙۜۘۥ۠ۤۙۖۨۙۨۨۘ۬ۛۥۘ";
                    break;
                case -1474391572:
                    this.f1241b = getCustomJIDs();
                    str = "ۧ۟ۥۗۛۖۗۧۨۘ۬ۦۙ۠ۖۡۘۚۘۘ";
                    break;
                case -839187324:
                    return;
                case -715438026:
                    toolbar.setTitle((CharSequence) yo.getString("specificPrivacy"));
                    str = "ۥۖۥۘۥۥۛۨ۫ۧۢۛۡ۫ۛۚۛۜۖۗۚ۟ۧۢ۬";
                    break;
                case 176147263:
                    str = "ۗ۟ۖۘۙۚۗ۠ۢ۬۟ۛ۠ۙۛۥۘۖ۫ۖۘۜ۬ۖۘۨۖ";
                    break;
                case 648121646:
                    ((ListView) findViewById(yo.getID("list", "id"))).setAdapter(this.f1242c);
                    str = "ۚۙ۟۬ۖۚۥۛۨۘۦۤ۬ۚ۟ۗ۠ۦۥۘ";
                    break;
                case 1857088259:
                    str = "ۜۜۦ۫ۦۨۘۤۧۦۘۛۡۡۘۢ۟ۤۧ۬ۜۖۨۡ";
                    toolbar = (Toolbar) findViewById(others.getID("acjtoolbar", "id"));
                    break;
            }
        }
    }
}
