package com.obwhatsapp.youbasha.ui.YoSettings;

import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.obwhatsapp.yo.ColorStore;
import com.obwhatsapp.yo.d;
import com.obwhatsapp.yo.shp;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;
import com.obwhatsapp.youbasha.ui.views.AddFloatingActionButton;
import com.obwhatsapp.youbasha.ui.views.FloatingActionButton;
import com.obwhatsapp.youbasha.ui.views.FloatingActionsMenu;

public class HomeFAB extends BasePreferenceActivity implements IPreviewScreen {

    /* renamed from: e  reason: collision with root package name */
    public View f1171e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1172f = false;

    public void initPreview() {
        View view = null;
        String str = "ۗۛۥۥۦۖۖۤۥ۠ۙۖۤۤ۫ۜ۫۠ۤۖۥۘۥۙۘۘۚۜۜ";
        while (true) {
            switch ((str.hashCode() ^ 140) ^ 1356998913) {
                case -2088651554:
                    view = findViewById(yo.getID("preview", "id"));
                    str = "ۛۙۛۙۚۦۘۖۛ۫ۙۧۨۙۨۜۘۧۨۗۘۚۥ";
                    break;
                case -1303054504:
                    return;
                case 102688972:
                    str = "ۗ۫ۡۘ۠ۦۙ۠ۛ۟ۘۧۦۜۚۦۘ۠ۗۘۘۜۥۗ۬۟ۡۘۡۗ۟";
                    break;
                case 639863728:
                    others.MainBKC(view);
                    str = "ۡۦۦۘۨۨۧۘۖۙۤۘ۫ۢۦ۟۬ۙۨ۟ۚ۬ۦۖ";
                    break;
                case 2117708465:
                    this.f1171e = view;
                    str = "ۘۛۙۦۧۢ۟ۦۘۦۥ۟۫ۖ۬ۦۡۦۘۤۚۤۜ۠ۛ";
                    break;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        String str = "۟ۚۡۘ۟ۡۖ۫ۘۘۨ۫ۘۘۖۥۦ۫ۥ۟";
        while (true) {
            switch ((str.hashCode() ^ 848) ^ 831768219) {
                case -2092089927:
                    str = "ۨۧ۫ۘ۠ۤۖ۫۠ۗۥۖۘۥۚۙۤۖۥۙۥ";
                    break;
                case -423586227:
                    super.onCreate(bundle);
                    str = "ۜۚ۟ۜ۠ۥۘۚۜ۠ۡۢۙۤ۬۠";
                    break;
                case 767668825:
                    addPreferencesFromResource(yo.getID("yo_home_fab", "xml"));
                    str = "ۗ۬ۖۦۡۘۤ۠ۦۘۦ۠ۡۘ۫ۤۧ";
                    break;
                case 1068689464:
                    initPreview();
                    str = "۟ۗۡۘ۬۫ۖۨۖۦۚۧۖۘ۠ۢۢۜۨۜۘۘۥۨۨۤۘۘۘۛۨ";
                    break;
                case 1122716049:
                    str = "ۖۡۧ۫۟۫ۧ۫ۦۘۧ۬ۘۥۖۥ";
                    break;
                case 1237116828:
                    return;
                case 1549032941:
                    setContentView(yo.getID("yo_settings_homefab", "layout"));
                    str = "ۢ۫ۖ۟۬ۙۧۘۤۤۜۖۘۡۨۧ";
                    break;
            }
        }
    }

    public void onPause() {
        String str = "ۦۦۧۘۢۛ۠ۧۥۡۥ۟ۨ۠ۡۘۡۨۢۦۖۜ۟ۙۨۜۛ۫";
        while (true) {
            switch ((str.hashCode() ^ 147) ^ 1947637241) {
                case -1656864278:
                    return;
                case 482253551:
                    str = "ۚۙ۫۫ۚۜ۟ۘۢۚۨۖۧۜۤۦۨۧۘ";
                    break;
                case 1969745224:
                    super.onPause();
                    str = "ۡۜۧۘ۠ۢۢ۟ۚ۫ۧۡۘۘۖۘۥۘۤۙۘۗ۟۠";
                    break;
            }
        }
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        String str2 = "ۙ۫ۢۖۦۚۙ۬ۘۨۤۥ۫ۘۡۙ۬ۘ۠۠ۗۛۧ۟";
        while (true) {
            switch ((str2.hashCode() ^ 973) ^ -1492281360) {
                case -969694715:
                    str2 = "ۥۡۜۦۥۤۚۜۜۘ۠۠ۚۜۨۢ";
                    break;
                case -787187390:
                    str2 = "ۢۨۥۗ۟ۖۘۨۦۘۚۜ۠۬۠ۜ";
                    break;
                case -702166082:
                    updatePreview();
                    str2 = "۬ۢۚۤ۟ۥۘۙۡۡۘۤ۫ۖۘۤۚۡۘۤۜۡۨ۠۬";
                    break;
                case -310954673:
                    return;
                case 892463894:
                    str2 = "ۨۖ۫ۥۧۢۨۜۜۘۘۗ۫ۦۛۜۨ۠ۨۜۨۦ";
                    break;
                case 1591692230:
                    super.onSharedPreferenceChanged(sharedPreferences, str);
                    str2 = "ۥ۬ۡۘۤۛۥۘۤۙۨۘۘۚ۬ۡۦۡۙ۬ۦۚۙۨۘ";
                    break;
            }
        }
    }

    public void onStart() {
        String str = "ۦۗۢۚۘۡۘ۬ۧ۬ۖۜ۠ۥ۬ۖۘ۟۠ۗۤۚۢ";
        while (true) {
            switch ((str.hashCode() ^ 532) ^ 1581096413) {
                case -1571437693:
                    super.onStart();
                    str = "ۧۢۘۘۧۢۤۚۤۛۖۘۘۘۖ۟۠ۢۗۜ۬ۨۨ۟۟ۛ";
                    break;
                case -747626749:
                    return;
                case 1143612359:
                    str = "۫ۚۚۜ۬ۜۘ۟ۙ۟ۡۢۦۙۙ۫۠ۡۘۖ۟ۨۚۜۨ";
                    break;
                case 1941492973:
                    IPreviewScreen.mHandler.postDelayed(new d(this, 8), 300);
                    str = "ۙۜۧۘۚۛۜۘ۠ۡۥۨۛ۬ۚۛۖۘۨۘۡۘۢ۬ۤ";
                    break;
            }
        }
    }

    public void updatePreview() {
        String str = "۠ۢۚۨۧۜۘۥ۠ۖۙۧۜۖۤۦ";
        AddFloatingActionButton addFloatingActionButton = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z2 = false;
        FloatingActionsMenu floatingActionsMenu = null;
        ImageView imageView = null;
        while (true) {
            switch ((str.hashCode() ^ 156) ^ -1215335053) {
                case -1943977531:
                    imageView.setVisibility(i6);
                    str = "ۡۡۘۦۢ۟۫ۗۘۥۖ۠ۦۦۖ۟ۛۘ";
                    break;
                case -1641187399:
                    str = "ۜۢ۫ۥۦۡۘۖۛ۟ۚۛۡۘۙۢۛ۠ۘۘۦۚۤ۠ۡۘ";
                    i6 = i5;
                    break;
                case -1550909598:
                    addFloatingActionButton.setColorPressed(others.getColor("ModFabPressedColor"));
                    str = "ۙۨۡۦۨۜۥۧۨۛۘۘۦۘ۟ۚ۫۠ۥۥۜۚۘۘ";
                    break;
                case -1104860210:
                    str = "ۨۘۥۤۥۥۗۖۜۗۜۨۥۖۦۜۧۖۘۡۘ۫ۗ۠ۢۢ۠۠";
                    i4 = i3;
                    break;
                case -935825157:
                    str = "ۢۨۨۘ۫ۖۘ۫ۡۦۛۗۖۘۦۢۖۘۖ۟ۖۘۛ۟ۡ۟ۜ۫";
                    floatingActionsMenu = (FloatingActionsMenu) findViewById(yo.getID("multiple_actions", "id"));
                    break;
                case -903930393:
                    str = "ۤۦۦۧۧۥۘۦۖۨۘۦ۠ۖۘۡۚ۬ۛۨۥۘ";
                    i2 = others.getColor("ModFabNormalColor", ColorStore.getFabColorNormal());
                    break;
                case -881265889:
                    floatingActionsMenu.setVisibility(i4);
                    str = "ۗۖۜۘۖۦۜۥۦۘۥ۠ۥ۠ۦۘۤۗ۬ۙۢۥۛۧۚۧۡ۟";
                    break;
                case -816458825:
                    str = "ۦ۟ۡۦۙۥۥۖۘۧۦۘ۟ۜ۟";
                    i6 = 0;
                    break;
                case -701658755:
                    str = "ۤۘ۟۠ۜۜۘۢۡ۬ۚۤۡۘۨۙۢۖۙ۬";
                    break;
                case -214486706:
                    imageView.getBackground().setColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
                    str = "ۙ۠ۢۨۨۜۘ۬۫ۚۙ۬ۥۘ۬ۘ۫ۙۙۛ۫۠ۥ";
                    break;
                case -198901930:
                    str = "ۗۘ۟۠ۛ۫ۘۗۥۘۡۗۜۙۨۨۘ";
                    i3 = 4;
                    break;
                case -68920707:
                    String str2 = "ۛۤۨۘۘ۠ۥۘۥۡۗۘۘ۬ۛۛۢ۟ۖۨۙۖۘ";
                    while (true) {
                        switch (str2.hashCode() ^ -801881953) {
                            case -1644735762:
                                str = "ۥ۠ۨۡۜۦۘۦۖۘۡۥ۬۟ۧ۟ۨۧۢۙۜۨۡۡۘ";
                                continue;
                            case -545871446:
                                str2 = "ۡ۟ۧۢۨ۟ۜۙۚۘۛۗۗۥۧۗۖ";
                                break;
                            case -257709837:
                                str = "ۨۘۥۤۥۥۗۖۜۗۜۨۥۖۦۜۧۖۘۡۘ۫ۗ۠ۢۢ۠۠";
                                continue;
                            case 1298001528:
                                if (!this.f1172f) {
                                    str2 = "ۖۚۖ۫۠ۥۨۙۖۘۥۨ۫۟ۜۥۡۘۘۤۛۡۥ۫۬";
                                    break;
                                } else {
                                    str2 = "ۡۧۚۙۜ۠۫ۦۖۧۦۢۖۛۥۙۛۖۘ۫ۨ۟۟ۗ۠ۢ۫ۗ";
                                    break;
                                }
                        }
                    }
                    break;
                case 148097477:
                    str = "ۤۖۨۘۚۜۦ۠۟ۥۘ۫ۤۧۨۦۘ";
                    addFloatingActionButton = (AddFloatingActionButton) floatingActionsMenu.findViewById(yo.getID("fab_expand_menu_button", "id"));
                    break;
                case 164819877:
                    imageView.setColorFilter(FloatingActionButton.getFABIconsColor(), PorterDuff.Mode.SRC_IN);
                    str = "ۦ۟ۦۘۢۥۡ۫ۙۛۙۚ۬۬ۥۨۙۘۘ۫ۖۗۢۥ";
                    break;
                case 530174194:
                    this.f1171e.invalidate();
                    str = "ۥۗۜۘ۫ۛۧۢۥۛۗۦۤۥۖۚ";
                    break;
                case 541493164:
                    this.f1172f = shp.getBoolean("hide_fab");
                    str = "ۙۙۘۤۙۜۘ۫۬ۦ۟ۙ۬ۧۤۧ";
                    break;
                case 543601720:
                    str = "ۨۛۥۜ۟ۙ۟ۙۧۗۡۘۗۤۥۦۘۘۡۤۜۢۨۢ";
                    i5 = 4;
                    break;
                case 698926421:
                    addFloatingActionButton.setPlusColor(FloatingActionButton.getFABIconsColor());
                    str = "ۨۜۥۘۨ۫ۢۦۦۥۘۗۚ۬ۙ۬ۘۙ۬ۧۗۥۤۨ۟ۙۨۜ";
                    break;
                case 1101375401:
                    str = "ۜۢ۫ۥۦۡۘۖۛ۟ۚۛۡۘۙۢۛ۠ۘۘۦۚۤ۠ۡۘ";
                    break;
                case 1166201439:
                    str = "ۢۡۛ۬ۘۨۘۨۖۢۤۡۚ۫ۗۧۨۜۦ";
                    break;
                case 1172457900:
                    return;
                case 1390512943:
                    addFloatingActionButton.setColorNormal(i2);
                    str = "۫ۙۙ۬ۚۘۚ۟ۦۘۦۤۘۥۜۧۗۥۗۛۡۡۜۘ";
                    break;
                case 1523666973:
                    String str3 = "ۘۢۨۚۤۥۖۧۦۗۗۨۗۥۘۡۛۢۡۤۘ";
                    while (true) {
                        switch (str3.hashCode() ^ -1763059191) {
                            case -67079545:
                                str = "۟۟ۘ۫ۙۥۘۜۚۤ۟ۥ۟۟ۖۜۘۗۤۜۜۜ";
                                continue;
                            case 509534642:
                                str = "ۢۦۖۛ۬ۜۧۜۤۚۧۤ۠ۥۨۘۛۥۡۘ";
                                continue;
                            case 1136524939:
                                str3 = "ۗۗۢۨ۟ۥۗۖۘ۟ۨ۠ۗۗۤۜۥۗ۫ۦۦۘۤۡ۬";
                                break;
                            case 1706146638:
                                if (!z2) {
                                    str3 = "ۢۛ۫۠ۚۡۥۦۜۘۛۘۙۧۢ۠";
                                    break;
                                } else {
                                    str3 = "ۢۢۡۦ۟۬۟۟ۛۢۜۦۘۖ۟۫ۦۖ۟";
                                    break;
                                }
                        }
                    }
                    break;
                case 1600691759:
                    str = "ۨۧ۬ۗۢۥۛۜۜۘۦۙۥۘۛ۟ۦ";
                    break;
                case 1606366235:
                    str = "ۙۨۡۦۨۜۥۧۨۛۘۘۦۘ۟ۚ۫۠ۥۥۜۚۘۘ";
                    break;
                case 1676892763:
                    str = "ۤۛۤۛۙۨۧۢۚۧۧۤۘۧۥ";
                    imageView = (ImageView) findViewById(yo.getID("fab", "id"));
                    break;
                case 1895181915:
                    str = "۬ۜۤۨۚۙۦ۟ۗۢۡۘۢۖۨۘ";
                    i4 = 0;
                    break;
                case 1937542814:
                    str = "۬ۤۖۘۡۤۗۢۚۜۢۨۤۨۡ۬ۢۘۥۨۘ";
                    z2 = this.f1172f;
                    break;
                case 2053892559:
                    String str4 = "۫ۜۢۜۜۛ۬ۘ۫۠ۨۧۘۨۥۥۗ۫ۥۢۥۙۙۛۡۘ";
                    while (true) {
                        switch (str4.hashCode() ^ -1312247404) {
                            case -1203732020:
                                if (!this.f1172f) {
                                    str4 = "ۙ۬ۖۛۖۡۘۙۗۘۘ۬ۢۛ۟۫ۗۧۚ۫۠ۨۥۘۗۢۦۘ";
                                    break;
                                } else {
                                    str4 = "ۗ۫ۜۡۚۚۖۥۘۦۨۥۘ۫ۘۙ";
                                    break;
                                }
                            case -1124858365:
                                str = "ۗ۟ۡۥ۫ۛۛۤۢۨۡۤ۠ۨۘۤۥ۬۫ۘ۠";
                                continue;
                            case 1025138419:
                                str4 = "ۧ۟ۧ۬ۖۖۘ۬ۤۜۖۖ۫ۤۚۚۥۗۜ۟ۥۦۘ";
                                break;
                            case 1316998996:
                                str = "ۙۥ۬ۘۘ۟ۥۦۥ۬ۦۤۢ۠ۦۘۖۜۢۡۚ۟ۥۜۗۜۚ۠";
                                continue;
                        }
                    }
                    break;
            }
        }
    }
}
