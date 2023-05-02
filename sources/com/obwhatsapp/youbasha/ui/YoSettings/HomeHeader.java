package com.obwhatsapp.youbasha.ui.YoSettings;

import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.TwoStatePreference;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.obwhatsapp.yo.HomeUI;
import com.obwhatsapp.yo.shp;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;
import com.obwhatsapp.youbasha.ui.views.IBottomNavigation;
import m.f;
import rc.whatsapp.home.RCTABS.OneUiNavigationView;

public class HomeHeader extends BasePreferenceActivity implements IPreviewScreen {

    /* renamed from: e  reason: collision with root package name */
    public boolean f1173e;

    /* renamed from: f  reason: collision with root package name */
    public View f1174f;

    /* renamed from: g  reason: collision with root package name */
    public View f1175g;

    /* renamed from: h  reason: collision with root package name */
    public OneUiNavigationView f1176h;

    /* renamed from: i  reason: collision with root package name */
    public ViewGroup f1177i;

    /* renamed from: j  reason: collision with root package name */
    public ViewGroup f1178j;

    /* renamed from: k  reason: collision with root package name */
    public ViewGroup f1179k;

    /* renamed from: l  reason: collision with root package name */
    public ViewGroup f1180l;

    /* renamed from: m  reason: collision with root package name */
    public Toolbar f1181m;

    /* renamed from: n  reason: collision with root package name */
    public Toolbar f1182n;

    /* renamed from: o  reason: collision with root package name */
    public TextView f1183o;

    /* renamed from: p  reason: collision with root package name */
    public ImageView f1184p;

    /* renamed from: q  reason: collision with root package name */
    public ImageView f1185q;

    /* renamed from: r  reason: collision with root package name */
    public TextView f1186r;

    /* renamed from: s  reason: collision with root package name */
    public TextView f1187s;

    /* renamed from: t  reason: collision with root package name */
    public TextView f1188t;

    /* renamed from: u  reason: collision with root package name */
    public TextView f1189u;

    /* renamed from: v  reason: collision with root package name */
    public ListPreference f1190v;

    /* renamed from: w  reason: collision with root package name */
    public TwoStatePreference f1191w;

    /* renamed from: x  reason: collision with root package name */
    public TwoStatePreference f1192x;

    /* renamed from: y  reason: collision with root package name */
    public ListPreference f1193y;

    public static void d(Toolbar toolbar) {
        int i2 = 0;
        Menu menu = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        MenuItem menuItem = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        MenuItem menuItem2 = null;
        MenuItem menuItem3 = null;
        MenuItem menuItem4 = null;
        Drawable drawable = null;
        String str7 = "ۧۦۖۘ۟ۘۜۘۥۤۡۜۤۡۘۡۨۙ۟ۚۘۘ";
        while (true) {
            switch ((str7.hashCode() ^ 561) ^ -707325875) {
                case -2024535482:
                    menuItem4 = menu.add(4, 1, 0, "").setIcon(yo.getID("ic_camera_entry_outline", "drawable"));
                    str7 = "ۡۡۘۘۤۢۗۗۧۘۢۡۦۘۖۙۤ";
                    break;
                case -1649097481:
                    menuItem3 = menu.add(0, 1, 0, "").setIcon(yo.getID("ic_action_search", "drawable"));
                    str7 = "ۜ۫ۘۘۥۚۖ۫۬ۦۡۨۘۜۦۖۘۤۥۖ";
                    break;
                case -1628796053:
                    str4 = "sun";
                    str7 = "ۖ۠ۘۡۡۢۛۢۚۘۥۖۘۛۢۥۚۙۧۙۘۥ";
                    break;
                case -1595147296:
                    str = "airplane";
                    str7 = "ۖ۟ۖۦ۠ۜۘۡۘۦۥۨۘ۠ۢ۫";
                    break;
                case -1552886594:
                    str7 = "ۖۗۛ۟ۦۘۘ۟ۥۧۘۥۨۥۖۡۘۢۢۜۘ";
                    break;
                case -1028035787:
                    menuItem2.getIcon().setColorFilter(i2, PorterDuff.Mode.SRC_IN);
                    str7 = "ۢ۟ۢ۠ۨ۬۬ۜۖۘۡۛۨۘۛۥۚۡۧۘۛۥۥۘۙۗۦۙۢۢ";
                    break;
                case -966218053:
                    str2 = "airplane_off";
                    str7 = "ۦ۬ۡۘۙۦۖ۫ۖۘۖ۠ۦۘۛ۠۫۠ۖ۠ۜۡۗ";
                    break;
                case -838250854:
                    menuItem.setShowAsAction(2);
                    str7 = "ۧۗۥۘ۠ۗۦۘۜۛۙۧ۠ۜۘۨۙۡۜۙۖۘ۬ۜۦ";
                    break;
                case -816470549:
                    String str8 = "ۖۢۦۘۜۚۦۥۦ۠ۨۛ۫ۛۛۘ۠ۢ";
                    while (true) {
                        switch (str8.hashCode() ^ -549727483) {
                            case -531484284:
                                str7 = "۟ۛۘۘۤ۫ۖۘۦۖۦۘ۠ۦۥۘۧۚۧۜۦۥۨۨ";
                                continue;
                            case 1059601490:
                                if (!HomeUI.getAirplaneMode()) {
                                    str8 = "ۘ۠ۨۘۤۤ۠ۛۚۤۦۚ۬ۜۥۜۡۦۥۘۗۥ۠ۤ۬ۦۘۢۧۘۘ";
                                    break;
                                } else {
                                    str8 = "۫۫ۖۨۖۡۧۚۚۛۘۦ۬ۡۤۖۙۗۧۦۧ۟ۥۡۘۨۥۖ";
                                    break;
                                }
                            case 1118830587:
                                str7 = "ۤ۠ۖۘۗ۬ۧ۟ۧ۠۫ۦۖۘۥ۠";
                                continue;
                            case 2061033949:
                                str8 = "ۨۛۧۢۥۦۥۘۨۡۥۛۡ۫ۙ";
                                break;
                        }
                    }
                    break;
                case -732203064:
                    str7 = "۟ۖۛۘۦۥۘۧۚۦۘۖۚۖۘۡۖۖۘۡۤۛ";
                    str6 = str5;
                    break;
                case -685454438:
                    str7 = "۟ۖۛۘۦۥۘۧۚۦۘۖۚۖۘۡۖۖۘۡۤۛ";
                    break;
                case -599762330:
                    return;
                case -424123662:
                    str7 = "ۛ۠ۖۚۛۨۘ۬ۘۘۜۦ۟ۙۖۖۘۥۡ۠۠";
                    str6 = str4;
                    break;
                case -417893765:
                    str7 = "۫۟ۘۗۗۚۘۨۧۘۤۗۦۥۧۦۘۧ۠ۦۘۛۢ۟ۤۜۘۖۖ";
                    break;
                case -267398273:
                    menuItem = menu.add(2, 0, 0, "").setIcon(yo.getID(str3, "drawable"));
                    str7 = "ۙۧۦۘۡۚ۟ۖۘۥۘۢۥۘۛۥۘۙ۫";
                    break;
                case -251555507:
                    str7 = "۫۟ۘۗۗۚۘۨۧۘۤۗۦۥۧۦۘۧ۠ۦۘۛۢ۟ۤۜۘۖۖ";
                    str3 = str2;
                    break;
                case -220770539:
                    menu.add(0, 2, 0, "OBMods");
                    str7 = "ۦۗۖۘ۬۬ۥۗۥ۟ۧۜۢۚۙۤ";
                    break;
                case -164708469:
                    String str9 = "۠ۨۖ۫ۤ۬ۗۘ۠ۦۡۘۘ۬ۥۤۚۗۥۘ۬ۚۡۘ";
                    while (true) {
                        switch (str9.hashCode() ^ 1382979198) {
                            case 744803157:
                                if (!yo.isNightModeActive()) {
                                    str9 = "ۦۦۧ۠ۦۜۘۜۗۡۘۗ۬ۡۘۚۥۧ";
                                    break;
                                } else {
                                    str9 = "ۦۤۖۘۧۡۨۨۨۡۘۘۡۖۘۘ۟ۢ۬ۦ۟";
                                    break;
                                }
                            case 1154650852:
                                str7 = "ۚ۬ۦۘۦۖ۫ۧۡۘۢۙ۬ۥۧۨۘۚۛۛۦۦۥۘۦۚ۫ۦۡۜ";
                                continue;
                            case 1256644651:
                                str7 = "ۨۚۙۧ۫ۡ۟ۥ۠ۗ۟ۤۖۙۛۙ";
                                continue;
                            case 1612277764:
                                str9 = "ۤۨ۟ۗۦۨ۠ۛۚۦ۬۟ۗۨ۟۫ۥۙۚۘۥۘ";
                                break;
                        }
                    }
                    break;
                case 19426902:
                    menuItem4.getIcon().setColorFilter(i2, PorterDuff.Mode.SRC_IN);
                    str7 = "ۜۙ۬ۜۛ۬۫ۥۙۗۗۜۦۘۧ";
                    break;
                case 93983907:
                    i2 = HomeUI.TTextColor();
                    str7 = "۫ۛۧۡۡۧۘۗۚۡۘۤۛۤۚۨ۠";
                    break;
                case 385572517:
                    str5 = "moon";
                    str7 = "ۚ۫ۘۘ۫ۙۧۚۤۡۘۡۜۥۘۖۢ۠ۡۡۧۘۢۦۦ";
                    break;
                case 710243258:
                    menuItem3.getIcon().setColorFilter(i2, PorterDuff.Mode.SRC_IN);
                    str7 = "ۜۗۘۘۛۦۢ۬ۡۡ۬ۦۘۨ۟ۛۜۧۢۖ۫۟ۦۢ۟";
                    break;
                case 865674468:
                    toolbar.setOverflowIcon(drawable);
                    str7 = "ۙۨۛ۫ۡۖۛۧۡۡۖۘۡۙ";
                    break;
                case 1142610199:
                    menuItem3.setShowAsAction(2);
                    str7 = "ۡۨۛ۫ۡۤ۠ۡۖۘۜ۠ۙۤ۟ۜۚۗۡۘۨۗۗۤۜۜۘۡۖۦۘ";
                    break;
                case 1201900589:
                    menuItem2 = menu.add(3, 5, 0, "").setIcon(yo.getID(str6, "drawable"));
                    str7 = "ۙۜۜۘۨۡۧۗۛۙ۠ۤۦۛۡۢۗۦۘ";
                    break;
                case 1205078269:
                    menuItem4.setShowAsAction(2);
                    str7 = "ۦ۫ۚ۠ۦۦۘ۟۠ۙۗ۠ۜۘ۬ۗۘۦۦۚ۫ۤ۠";
                    break;
                case 1302126357:
                    menuItem2.setShowAsAction(2);
                    str7 = "ۛ۫ۚۖۘۖۚۤۧۗ۟ۙ۫۠ۜ";
                    break;
                case 1319283238:
                    drawable = toolbar.getOverflowIcon();
                    str7 = "ۡ۟ۘۘۧ۠ۡۘۘۨ۬ۚۦۥۤۜۚۖۗ۠ۧ۟ۡۘۛۗ۫ۛۨۘ";
                    break;
                case 1439964495:
                    String str10 = "ۦ۫ۚۡۡۧ۬ۙۖۘۜۘۡۘۗۢ۟ۤۖۨ";
                    while (true) {
                        switch (str10.hashCode() ^ 571095998) {
                            case -1345218456:
                                if (drawable == null) {
                                    str10 = "ۥۥۡۘۘۚۨۘۧ۟ۛۢۢ۠۫ۛۙۡۧۧۚۥۥۘ";
                                    break;
                                } else {
                                    str10 = "ۙ۟ۢۡۚۜ۫ۤۨۡۘۘۘ۬ۤ۬ۥۨۡ";
                                    break;
                                }
                            case -723134430:
                                str7 = "۠ۙۜۘۘۙ۬ۚ۫۟ۧۢۚۖۖۘۨۙۜ۠ۖۡۙۥۘۘۧۘۨ";
                                continue;
                            case 1319194775:
                                str10 = "ۛۧۜۚۖۨۘۨۤۧۨۜۚ۫ۘۛ۠ۤۗۚۨۘۚ۬ۜ";
                                break;
                            case 2093927970:
                                str7 = "ۙۨۛ۫ۡۖۛۧۡۡۖۘۡۙ";
                                continue;
                        }
                    }
                    break;
                case 1517437350:
                    drawable.setColorFilter(i2, PorterDuff.Mode.SRC_IN);
                    str7 = "۟ۡۗۦۚۦۘ۫۠ۢۧۚۥۨ۫ۧۢۥۧۘ";
                    break;
                case 1761832860:
                    str7 = "ۡۛۥۙۙۡۘۨ۟۬ۤۦۙۤۖۘۙۨۘ";
                    str3 = str;
                    break;
                case 1936095451:
                    menu = toolbar.getMenu();
                    str7 = "ۢۖۖۙۘۥۡۡۘ۟ۢۖ۬۫۫ۖ";
                    break;
                case 2074585142:
                    menuItem.getIcon().setColorFilter(i2, PorterDuff.Mode.SRC_IN);
                    str7 = "ۛۖۥۘۘۡۧۘۛۚۥ۫ۚۤ۫ۦۖۧۡۖۘۚ۠ۙۜ۠ۡۘ۫ۤۨۘ";
                    break;
            }
        }
    }

    public final void c() {
        int i2 = 0;
        OneUiNavigationView oneUiNavigationView = null;
        Toolbar toolbar = null;
        int i3 = 0;
        View view = null;
        LinearLayout linearLayout = null;
        View view2 = null;
        Toolbar toolbar2 = null;
        Toolbar toolbar3 = null;
        String str = "ۘۧۜۘ۫۠۠۫۫ۧۗۦۦۘۢۚۚۨۡۧ۫ۨۙۥۥۧ";
        while (true) {
            switch ((str.hashCode() ^ 896) ^ -1179930941) {
                case -2040859617:
                    ((IBottomNavigation) this.f1175g).updateIconsColors();
                    str = "ۥۘ۬ۤ۠ۙ۟ۤ۫۠ۧۖ۟ۨۨۛۖۖ۫ۙ۟ۡۜۢ";
                    break;
                case -1759985416:
                    this.f1173e = HomeUI.isBottomBarEnabled();
                    str = "ۜۡۢۚ۫۬ۡ۠ۧۨۢ۬ۡۜۡۘۙۙۥ۠ۜۡۙۡ۫۟ۡۛ";
                    break;
                case -1716336848:
                    this.f1180l.addView(view);
                    str = "ۧۡۖ۬ۙ۠ۤۖۘۧۜۨۘۥۚۥۘۖۘ۫۫ۦۘۖۛۥۘ";
                    break;
                case -1687793930:
                    String str2 = "ۧۘۦۘۢ۟ۡۘۧ۫ۡۙۜۨۘ۟۫ۧ۠ۗۧۗۢۥ";
                    while (true) {
                        switch (str2.hashCode() ^ -523365048) {
                            case -1801693714:
                                str2 = "ۜۘۗ۫ۙۨۘۧۥۨۘۜۘۧۘۜۧۡۗۡۨۘ";
                                break;
                            case -910262780:
                                if (!this.f1173e) {
                                    str2 = "ۤ۬ۙ۬ۖۙۗ۠ۖۘ۠ۙۤۨۜۘۘۦۨۜۘ۫ۦۘۘۨ۫ۜ۠ۨۨ";
                                    break;
                                } else {
                                    str2 = "ۛۢۨۖۖۧۨۙۖۥۜۧۚۡۤۨۦۘۤۛ۫";
                                    break;
                                }
                            case -409702370:
                                str = "ۖۘۘۡۥۖۘۧۤۡۢۘ۫ۛۙۤۡۘۤۘۥۜۦۤۥۘۦ";
                                continue;
                            case 654743956:
                                str = "ۧۦ۬ۚۜۡۘ۫ۧۘۘۖۚ۫۠ۘ۬ۢ۟ۢۨۢ۟";
                                continue;
                        }
                    }
                    break;
                case -1622124218:
                    this.f1177i = (ViewGroup) this.f1174f.findViewWithTag("tabs_root");
                    str = "ۡۖۨۘۤۚۜۘۛۜۧۘۧۛۜۘۤ۬ۨۘۨۦۜۘ";
                    break;
                case -1577270437:
                    this.f1176h.setBadgeValue(1, "6");
                    str = "ۙۢۤۚۗ۠ۢۚۗۢۗۥۘۖۘۥ۠ۖ";
                    break;
                case -1533094038:
                    String str3 = "ۧۘ۬ۡۚۦۘۡۡۘۚۛۖۘۡۘۡۖۗ۠ۚۛۤۙۖۡۥۤۖۘ";
                    while (true) {
                        switch (str3.hashCode() ^ -218974715) {
                            case -1883726659:
                                str3 = "ۜۥۥۘۖۡۥۘۤۛۦۘ۟ۤۥۧۛۤ";
                                break;
                            case -1616520184:
                                str = "۬ۢۜ۬ۥۤۙۧۘۘۜۡۥ۟ۡ۫ۥۢۦۘۚۘۖۘ";
                                continue;
                            case 717232233:
                                if (!this.f1192x.isChecked()) {
                                    str3 = "ۙ۟ۨۛ۫ۜۡۘۦۘۙۤۙۧۚۛ";
                                    break;
                                } else {
                                    str3 = "ۢۗۜۘۛۖۖۘۛۙۙۖ۫ۖۗ۟ۜۘ";
                                    break;
                                }
                            case 744013718:
                                str = "ۨۡۘ۫ۗۛۢۘۘۘۚۗۛۢۘ۠۠ۖۤۜ۠ۡۘۢۜۧۙۦۘ";
                                continue;
                        }
                    }
                    break;
                case -1396599350:
                    toolbar3.setVisibility(0);
                    str = "۟۬۠ۢۙۦۘۥۦۙ۟ۢۨۘۚۘۥۘۨۥۥۢۘ۟ۖۦۙۘۜۘ";
                    break;
                case -1208714354:
                case -536650737:
                    str = "ۘۡۥۢۗۦۖۡۖۘۤۢۖۙ۠ۦۨۘۗ";
                    break;
                case -1086349727:
                    this.f1181m.setVisibility(8);
                    str = "ۚۤ۬ۖۛۦ۬ۡۚۥۧ۬ۚۖۤۙۜ";
                    break;
                case -1054377226:
                    linearLayout.setWeightSum((float) linearLayout.getChildCount());
                    str = "ۧ۠ۢۖۦۨۖۙۘ۟ۖۦۘ۬۟ۡ";
                    break;
                case -939428013:
                    this.f1175g = view;
                    str = "ۧۤۡۙۜۧۤ۬۠ۘۢۧۨۖ";
                    break;
                case -898113044:
                    i3 = HomeUI.getUIBottomStyleID();
                    str = "ۦۧۖۘۘۖۗۥۧۛۚ۫ۢۛۗۚ۟ۙ";
                    break;
                case -865916292:
                    str = "ۜۨ۟۟ۘۧۙۗۖۘ۠۟۟ۜۜ۠";
                    break;
                case -802221268:
                    str = "ۥۙۜۚۘۛۧۢۨۘۨ۬ۦۜۥ۠۠۟ۜۧۨ";
                    break;
                case -688668357:
                    others.pagerTabBk(this.f1176h);
                    str = "ۢۢ۬ۨۧۙۙۚۡۘۙۡ۬ۤۢۘۧ۠ۨۘ۫ۢۢ۠ۘ۠ۗۥۘ";
                    break;
                case -618717748:
                    this.f1180l.removeAllViews();
                    str = "ۤۡۘۚۙ۠۬ۨۨۦۢۘۚ۟ۦ۟۠ۢۘۘۙ۟ۥۜۘۚ۟ۙ";
                    break;
                case -577394520:
                    this.f1178j.setVisibility(8);
                    str = "ۗۘۧۧ۟ۘۘۧۤۦۘۚۖۘۘ۠ۘۜۤ۟ۘۘ۠ۥۙ۫ۦۨۙۖۧۘ";
                    break;
                case -472149133:
                    this.f1180l = (ViewGroup) findViewById(yo.getID("div2", "id"));
                    str = "ۖۗۨۖۦۗۘۖ۠ۤۥۨ";
                    break;
                case -313313838:
                    str = "ۘ۫ۤ۠ۢۢۗۨۥۨۡۦ۫ۦۚ۬ۦ۟ۘۢۧ";
                    toolbar3 = toolbar2;
                    break;
                case -309906008:
                    linearLayout.setWeightSum((float) (linearLayout.getChildCount() - 1));
                    str = "ۦۡ۫ۤۗ۬ۥۜۚۖۨۗۚ۟ۘۗۜۖ۠ۨۦۤۗ۟ۙ۫ۜۘ";
                    break;
                case -199592400:
                    this.f1181m.setVisibility(0);
                    str = "ۡۛۡۜۧۖۛۛۖۘ۠ۢۜۘۙۘۜۧۡۜۙۢۙ";
                    break;
                case -181090444:
                    view2 = this.f1177i.findViewWithTag("groups_tab");
                    str = "ۡۡۖۘۖۘۦۘۘۢۥۖۥۘۘۤۛۖۦ۫ۙ";
                    break;
                case -169799658:
                    this.f1176h = oneUiNavigationView;
                    str = "ۖۜۚ۫ۚۘۘۗ۫ۨ۬۫ۚۤۗۡ۫ۦۜۤ۠ۧۚۗۖۘ";
                    break;
                case 103590276:
                    str = "ۘۖۗ۬ۧ۫ۚۘ۫۬ۥۥۜۛ";
                    oneUiNavigationView = (OneUiNavigationView) LayoutInflater.from(this).inflate(i2, this.f1180l, false);
                    break;
                case 165810297:
                    str = "ۥۙۜۚۘۛۧۢۨۘۨ۬ۦۜۥ۠۠۟ۜۧۨ";
                    toolbar3 = toolbar;
                    break;
                case 209564043:
                    this.f1180l.setVisibility(0);
                    str = "ۨ۬ۤۚۨۜۘ۟ۜ۟ۜۢ۫ۦۚۖۘۘۧۧ۟ۡۧ۟ۖۘ";
                    break;
                case 331010969:
                    this.f1177i.setVisibility(8);
                    str = "ۨۤۛۦ۟ۧ۠ۚۥۘ۬۬ۛۘ۠ۜۘۗۙۛ";
                    break;
                case 377396199:
                    this.f1182n.setVisibility(8);
                    str = "ۚ۫۟ۢۘۘۘۙۚ۬ۜ۫ۚۛۜۜۘ۟۟۟ۧۨۤۛ۬ۡۘ";
                    break;
                case 377946219:
                    this.f1176h.updateIconsColors();
                    str = "۬ۛۡۘۛۡ۠۠ۚۧۖۤۦۘۨۧۡۨ۟ۙ۫۟ۢۘۦۧ۠ۚۖ";
                    break;
                case 451903375:
                    str = "ۨ۠۟ۖ۠ۖۤۖ۫ۤ۠۫ۘۙۥۥ۠ۥۘ";
                    linearLayout = (LinearLayout) this.f1177i.findViewById(yo.getID("tabs", "id"));
                    break;
                case 452764450:
                    this.f1180l.setVisibility(0);
                    str = "ۚۜ۬ۜۚۦۖ۠ۗۜۢۜۘۨۤۡۨۖۙۥۡۨۘ۬۬ۛ";
                    break;
                case 492356985:
                    str = "ۤ۫۫ۨۢۚ۬ۨۥۗ۠ۡۚۢۘۢ۬ۗۡۦۛۖۜۘ";
                    break;
                case 584049315:
                    this.f1180l.removeAllViews();
                    str = "ۤۥۖۘۧۜۘۙ۫ۦۙۦۡۘۡۧۙۡۤۘ";
                    break;
                case 594719812:
                    toolbar = this.f1182n;
                    str = "ۦ۟ۥۘۦۦۦۚۡۖۜۥۖ۬۠ۚۦۨۥۨۖ۬ۤۙۘ";
                    break;
                case 688838139:
                    this.f1177i.setVisibility(0);
                    str = "ۧۥۦ۬ۖۜۜۜۤۡۘۖ۟ۦ";
                    break;
                case 784559061:
                    this.f1178j.setVisibility(0);
                    str = "ۖۚۨۘۖۜۖۘۥۜۦ۟ۢ۠۠ۜۥۘۧۜ۟۠ۘۘۥۘ";
                    break;
                case 884411998:
                    this.f1182n.setVisibility(8);
                    str = "۬۬ۛۡ۫ۥ۟ۨۘۙ۫ۖۧۗۜۘۢ۟ۦۘۧۨۧۘۘۘۧۘ";
                    break;
                case 931732425:
                    view = LayoutInflater.from(this).inflate(i3, this.f1180l, false);
                    str = "ۦۥۧۘۜۖ۬ۨ۠ۘۘۢۨ۫ۢۧ۠";
                    break;
                case 946901853:
                    return;
                case 1120950056:
                    this.f1178j = (ViewGroup) this.f1174f.findViewWithTag("one_top_card");
                    str = "ۙۨۘۘ۟۬ۡۛۥۧۖۥۥۘۙ۟۬ۥۨۗۥۛۨۘۤۚۛۡۦۘ";
                    break;
                case 1156494962:
                    this.f1177i.setVisibility(8);
                    str = "ۢۦۢۖۡ۬۟ۖ۟ۖۙۖۘۡۙ۟ۢۙۡۘ";
                    break;
                case 1284594079:
                    String str4 = "ۘۦۢۗۜۖۘۗۚ۫ۦۧ۬ۤۨۦۘۚ۟۠ۤۦۘ";
                    while (true) {
                        switch (str4.hashCode() ^ 1001501269) {
                            case -234019651:
                                str = "۠ۘ۟ۛ۠ۧ۟ۦۨۘۘ۟ۖۘۘۛۦۘۙۢۙ";
                                continue;
                            case 1096262809:
                                str4 = "ۢۥۦ۟۫ۨۜ۫ۜۚۥۤۨۨۥ۫ۗۡۛۖۘ";
                                break;
                            case 1423756570:
                                if (!HomeUI.getUIHomeStyle().equals("one")) {
                                    str4 = "ۙ۬ۦۘۛۙۜۘ۠ۘۗۖۛۡۘۤۗۡ";
                                    break;
                                } else {
                                    str4 = "ۗ۟ۢۜ۟۬ۚ۠ۜۘۛ۠ۜۘۘۨۥۘۡ۠ۦۘۡۛۡۘۨۛۖۘ";
                                    break;
                                }
                            case 2038811239:
                                str = "ۘۗۜۘۦ۫ۦۚۡۘ۟ۨۗۙۡ۟ۧ۫ۨۘۡۛۜۧۥۨۡۦ";
                                continue;
                        }
                    }
                    break;
                case 1298677283:
                    this.f1178j.setVisibility(8);
                    str = "ۛۗۡۘۛ۟ۤۧۡۦۘۨۛۧۧ۟۫";
                    break;
                case 1391571470:
                    this.f1180l.addView(oneUiNavigationView);
                    str = "ۚۦ۫ۡۗۚۛۦۡۢۙۤۗۚۦ۬۬ۨ";
                    break;
                case 1431478276:
                    others.pagerTabBk(this.f1175g);
                    str = "ۤۗ۟۠ۡۦۘۧۢۜۨۦۜ۠۫ۜۛۖۦۘۨۤۢۧ۠ۙ";
                    break;
                case 1541855417:
                    i2 = yo.getID("rc_tab_oneui", "layout");
                    str = "۬۟ۖ۟ۗ۟ۤ۠ۧۜ۫ۤۙۨۦ۬ۚۨ۬ۢ";
                    break;
                case 1622389977:
                    this.f1180l.setVisibility(8);
                    str = "ۘ۟ۜۘۡۤۤۧۗۥۘۜۧۦۤۧۗۘۢۧۢۢۛۚۢۦۘۘ۟ۙ";
                    break;
                case 1660673382:
                    view2.findViewWithTag("groups_tab").setVisibility(8);
                    str = "ۤ۫۫ۨۢۚ۬ۨۥۗ۠ۡۚۢۘۢ۬ۗۡۦۛۖۜۘ";
                    break;
                case 1751903900:
                    view2.findViewWithTag("groups_tab").setVisibility(0);
                    str = "ۢۨۡۘۧۗۥۘۧ۠ۨۘۥ۬ۜۘۨۢۦ۬ۨۗ۟ۡ۬۫ۚ۟ۧۦۚ";
                    break;
                case 1843844974:
                    toolbar2 = this.f1181m;
                    str = "۠ۗ۠ۙۢۗۧۨۧۥۤۨ۠۟ۨۘۚۖۨ۠ۨۘۥۢۜۘ۠ۜۡ";
                    break;
                case 1915665820:
                    ((IBottomNavigation) this.f1175g).setBadgeValue(1, "");
                    str = "ۨۙۗۥۦۖ۠ۢۚۗۥۧۨۦۚۨ۠ۦۤۢۗۤۚ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0081, code lost:
        r0 = "ۦۢۨۘۢ۟۟ۜۦۘۦۜۗۦۨۦۘ۫ۖۖۘ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(androidx.appcompat.widget.Toolbar r15) {
        /*
            r14 = this;
            r13 = -11
            r2 = 0
            r4 = 0
            java.lang.String r0 = "۠ۗۘۘۤۤۢۦۖۛ۬۠ۤۨۤ۫ۚ۬ۤ"
            r1 = r2
            r3 = r4
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r4
            r9 = r4
            r10 = r2
            r11 = r2
        L_0x000f:
            int r2 = r0.hashCode()
            r4 = 566(0x236, float:7.93E-43)
            r12 = -1080291347(0xffffffffbf9c0fed, float:-1.219236)
            r2 = r2 ^ r4
            r2 = r2 ^ r12
            switch(r2) {
                case -2044819159: goto L_0x0065;
                case -1996507705: goto L_0x0149;
                case -1926144552: goto L_0x00ca;
                case -1739997528: goto L_0x001e;
                case -1392480377: goto L_0x0069;
                case -1337951409: goto L_0x002e;
                case -1167626312: goto L_0x0131;
                case -1146155294: goto L_0x0038;
                case -1145583494: goto L_0x0024;
                case -653884735: goto L_0x0114;
                case -447396948: goto L_0x0073;
                case -400554895: goto L_0x014d;
                case -299673355: goto L_0x00d6;
                case -192752405: goto L_0x005f;
                case -162611280: goto L_0x0093;
                case 77058400: goto L_0x0145;
                case 265538993: goto L_0x00c3;
                case 409196938: goto L_0x005b;
                case 483331255: goto L_0x00be;
                case 545860916: goto L_0x00cf;
                case 600965246: goto L_0x0054;
                case 617809765: goto L_0x010a;
                case 1058483920: goto L_0x00fd;
                case 1541147817: goto L_0x0021;
                case 1766889017: goto L_0x00b0;
                case 2017564508: goto L_0x0141;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x000f
        L_0x001e:
            java.lang.String r0 = "۠ۧۘۙۛۧ۬ۜۗۜۢۜۘ۠ۗۘۖ۠۫ۘۨۘۢ۫ۦ۟ۢ۟"
            goto L_0x000f
        L_0x0021:
            java.lang.String r0 = "ۦۤۥ۬ۖۥۥۢ۟ۨۚ۬ۤۚۥۢۡۦۧۖۚۤ۬ۚ۫ۛۜ"
            goto L_0x000f
        L_0x0024:
            java.lang.String r0 = "my_name"
            boolean r2 = com.obwhatsapp.yo.shp.getBoolean(r0)
            java.lang.String r0 = "ۥۤۛۧۚۚۖۦۘۘۨۢۤ۫۬۟ۦۘۖۘ۟۟ۨۜ۫ۛ۠ۤ۟"
            r11 = r2
            goto L_0x000f
        L_0x002e:
            java.lang.String r0 = "my_statusd"
            boolean r2 = com.obwhatsapp.yo.shp.getBoolean(r0)
            java.lang.String r0 = "ۙۗۥۘۘ۠ۧۥۘۦ۫ۘۘۘۥۢۨ"
            r10 = r2
            goto L_0x000f
        L_0x0038:
            r2 = -430275290(0xffffffffe65a8526, float:-2.5798301E23)
            java.lang.String r0 = "ۘۛۥۤۡۧۘۨۙۘۡۥۦۚۘ۟ۖۙۧۚۡۘۚ۟ۖۚ۠ۚ"
        L_0x003d:
            int r4 = r0.hashCode()
            r4 = r4 ^ r2
            switch(r4) {
                case -1929895773: goto L_0x0051;
                case -357177297: goto L_0x013d;
                case -85149536: goto L_0x0046;
                case 1706027569: goto L_0x004e;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x003d
        L_0x0046:
            if (r11 == 0) goto L_0x004b
            java.lang.String r0 = "ۡۤۗ۠ۥۚۦ۬ۡۘۡ۠ۘۘۢۡۚۡ۟ۧۜۦۘۘۚۨۚ"
            goto L_0x003d
        L_0x004b:
            java.lang.String r0 = "ۛۨۙۤۙۙ۟ۢۡۖۚۙۨۘ۟ۘ۬۟ۡ۟"
            goto L_0x003d
        L_0x004e:
            java.lang.String r0 = "۬ۡۧۡ۬ۚ۬ۦۖۘۨۙۖۖۥۖۘ۠ۘۚ"
            goto L_0x003d
        L_0x0051:
            java.lang.String r0 = "ۘۜۖۘۨۨۧۘ۟ۘۖۘۙ۬ۢۧۥۖۡ۫"
            goto L_0x000f
        L_0x0054:
            java.lang.String r9 = com.obwhatsapp.yo.dep.getMyName()
            java.lang.String r0 = "ۛۤۖ۬۟ۡۘ۟۟ۤۨ۬ۨۖۧۙ"
            goto L_0x000f
        L_0x005b:
            java.lang.String r0 = "ۡ۠ۨۜ۟ۜۜ۫ۘۘۤۖۘۘۖ۬ۘۘ"
            r8 = r9
            goto L_0x000f
        L_0x005f:
            java.lang.String r4 = com.obwhatsapp.yo.yo.pname
            java.lang.String r0 = "ۖ۬۫ۧ۠ۚۧ۬ۨۘ۟ۥۧۚۢۚۛۡ۬ۡ۟"
            r7 = r4
            goto L_0x000f
        L_0x0065:
            java.lang.String r0 = "ۗۛۨۘ۫ۙۢۢۧ۠ۡۘ۠ۤۨۙۦۖ۠ۛۛۨۥۦۘ۟ۥۚ"
            r8 = r7
            goto L_0x000f
        L_0x0069:
            android.text.SpannableString r0 = r14.getColoredToolbarTitle(r8)
            r15.setTitle((java.lang.CharSequence) r0)
            java.lang.String r0 = "۫ۙۤۙۢۤۖۜۡۗۥۦۧۚۨۘ۫ۘۘ۠۫ۨ"
            goto L_0x000f
        L_0x0073:
            r2 = 1587338306(0x5e9cdc42, float:5.6514909E18)
            java.lang.String r0 = "۬ۦ۬ۤۡۨۡۛۜ۬ۗۥۘ۫۬ۛۚ۫"
        L_0x0078:
            int r4 = r0.hashCode()
            r4 = r4 ^ r2
            switch(r4) {
                case -1875325224: goto L_0x008f;
                case 695450758: goto L_0x0087;
                case 706189040: goto L_0x008c;
                case 872960788: goto L_0x0081;
                default: goto L_0x0080;
            }
        L_0x0080:
            goto L_0x0078
        L_0x0081:
            java.lang.String r0 = "ۦۢۨۘۢ۟۟ۜۦۘۦۜۗۦۨۦۘ۫ۖۖۘ"
            goto L_0x000f
        L_0x0084:
            java.lang.String r0 = "ۖۧ۬ۛ۠ۗۨۚۥۘۨ۬ۨۜ۟ۡ"
            goto L_0x0078
        L_0x0087:
            if (r11 == 0) goto L_0x0084
            java.lang.String r0 = "ۨۘۛۙۦۘۜ۠ۦۘۧۛۥۘۛ۬ۢۡۘۡۧۡۢ"
            goto L_0x0078
        L_0x008c:
            java.lang.String r0 = "ۘۨۜۘۢۢۖۘۡ۫ۧۖۚۦۢۨۘۙۢۢ"
            goto L_0x0078
        L_0x008f:
            java.lang.String r0 = "۠ۦۦۘ۠ۤۦ۫۫ۦۖ۫ۡۜۜۘ۫ۜۤ"
            goto L_0x000f
        L_0x0093:
            r2 = 1333815755(0x4f8069cb, float:4.3088338E9)
            java.lang.String r0 = "ۚۨۨۡ۫ۛۗ۟ۚۡ۫ۖۘۙۨۦۛۤۘۘ۫۟ۙۧۗۦۡ"
        L_0x0098:
            int r4 = r0.hashCode()
            r4 = r4 ^ r2
            switch(r4) {
                case -1056173703: goto L_0x0081;
                case -894095218: goto L_0x00ac;
                case 1417433468: goto L_0x00a7;
                case 2038642117: goto L_0x00a1;
                default: goto L_0x00a0;
            }
        L_0x00a0:
            goto L_0x0098
        L_0x00a1:
            java.lang.String r0 = "ۙۥ۠ۢ۬ۥۖ۟ۘۘۘۘۙ۫ۡۛۢ۫"
            goto L_0x0098
        L_0x00a4:
            java.lang.String r0 = "۟ۡۧۘۘۢۘۘ۫ۚۡۘۜۘۢ۠ۥۧۤۦۡۘۖ۬ۡ۬ۧ۬ۦۖ۠"
            goto L_0x0098
        L_0x00a7:
            if (r10 != 0) goto L_0x00a4
            java.lang.String r0 = "ۛۧۧۜۨۜۘۙۤۨۘۢ۫ۙۢۨۧۧۡۛۦ۟ۨۥۚ۠"
            goto L_0x0098
        L_0x00ac:
            java.lang.String r0 = "ۖ۟ۛۥۥۖۨ۟ۢۦ۠ۢۨۡۜ"
            goto L_0x000f
        L_0x00b0:
            java.lang.String r0 = "-open 'Settings' page'-"
            java.lang.String r0 = com.obwhatsapp.yo.yo.getMyStatus(r0)
            android.text.SpannableString r6 = r14.getColoredToolbarTitle(r0)
            java.lang.String r0 = "۬ۘۜۜۤۡۘ۟ۜۡۨ۟ۗۚۖۘۘ۫ۗ۟۫۫"
            goto L_0x000f
        L_0x00be:
            java.lang.String r0 = "۠۠ۧۡۛۢ۫۠ۦۦۙ۠ۤۦۜۘ"
            r5 = r6
            goto L_0x000f
        L_0x00c3:
            java.lang.String r2 = ""
            java.lang.String r0 = "ۡ۠ۘۥۗ۠ۖۤ۟ۤ۫۫۫ۧۛۗۗۚ"
            r3 = r2
            goto L_0x000f
        L_0x00ca:
            java.lang.String r0 = "۬ۡۛۤۚ۫ۡۜۘ۫ۢۥۘۧۢۢ"
            r5 = r3
            goto L_0x000f
        L_0x00cf:
            r15.setSubtitle((java.lang.CharSequence) r5)
            java.lang.String r0 = "۟ۚ۬۬ۥۛۚۧۖۘۘۢ۟ۜۘۘۘۧۨ۠"
            goto L_0x000f
        L_0x00d6:
            r2 = 1209822652(0x481c6dbc, float:160182.94)
            java.lang.String r0 = "ۗۙۜۢۧ۟ۦ۬ۦۖۖۘ۠۬ۡ"
        L_0x00db:
            int r4 = r0.hashCode()
            r4 = r4 ^ r2
            switch(r4) {
                case -1145822060: goto L_0x00f9;
                case -277636687: goto L_0x00e4;
                case 299947070: goto L_0x00f6;
                case 452826849: goto L_0x00eb;
                default: goto L_0x00e3;
            }
        L_0x00e3:
            goto L_0x00db
        L_0x00e4:
            java.lang.String r0 = "ۘ۬ۥۤۥ۬۫ۤۚۢۖۡۘۙۖۥۛۚۨۘۡۘۖۘ"
            goto L_0x000f
        L_0x00e8:
            java.lang.String r0 = "ۙۢ۫ۡۤۚۚۛۡۘۗۧۜۧ۫ۢ۬ۨۨۤۗۛ۫۫ۥۘۡۥ۟"
            goto L_0x00db
        L_0x00eb:
            java.lang.String r0 = "ModConPickColor"
            boolean r0 = com.obwhatsapp.yo.shp.getIsGradiet(r0)
            if (r0 == 0) goto L_0x00e8
            java.lang.String r0 = "ۤۢۖۘ۟ۗۥۘۙۛۜۨۛۤۤۖۘۦ۠۠"
            goto L_0x00db
        L_0x00f6:
            java.lang.String r0 = "ۥۦ۫۬ۜۜۘۗۥۤۘۖۨۙۢۤۨۨۡۘ"
            goto L_0x00db
        L_0x00f9:
            java.lang.String r0 = "ۧۗ۫ۗۦۜ۫۫۬ۙۡ۠ۦۙۗۨۤۖۧ۬ۧۡۥ۫ۙ۫ۖ"
            goto L_0x000f
        L_0x00fd:
            java.lang.String r0 = "ModConPickColor"
            android.graphics.drawable.GradientDrawable r0 = com.obwhatsapp.yo.shp.getGradientDrawable(r0)
            r15.setBackground(r0)
            java.lang.String r0 = "ۦ۬ۦۘۡۗۦۗۢۗۛۢۖۢۜۧۙۥۨۦ"
            goto L_0x000f
        L_0x010a:
            java.lang.String r0 = "ModConPickColor"
            int r1 = com.obwhatsapp.youbasha.others.getColor(r0, r13)
            java.lang.String r0 = "۬۫ۥۘ۬ۖۖۦۤۖ۬ۘ۟ۜ۫ۚ۬۬ۥۘ۟ۘۜ"
            goto L_0x000f
        L_0x0114:
            r2 = -93331693(0xfffffffffa6fdf13, float:-3.1137086E35)
            java.lang.String r0 = "ۚۖۥۘۡ۫ۗۧۖ۫ۘۨۘۡۘۡۘ"
        L_0x0119:
            int r4 = r0.hashCode()
            r4 = r4 ^ r2
            switch(r4) {
                case -791219125: goto L_0x012d;
                case -423041109: goto L_0x0149;
                case 536328885: goto L_0x0122;
                case 730318059: goto L_0x0128;
                default: goto L_0x0121;
            }
        L_0x0121:
            goto L_0x0119
        L_0x0122:
            java.lang.String r0 = "ۜ۟ۦۘۡۜۡۚۦۛۘۡۘۙۖۦۘۦۛ۬ۡۨۖۙۤۛ"
            goto L_0x0119
        L_0x0125:
            java.lang.String r0 = "ۘۙۡۢۧۘ۬ۜۜۘۜۗۦۘۙۥ"
            goto L_0x0119
        L_0x0128:
            if (r1 == r13) goto L_0x0125
            java.lang.String r0 = "ۦۙ۬ۥۖۘۘ۠۬ۡۘۢۘۛۗۤۘۘ۫ۨۨ"
            goto L_0x0119
        L_0x012d:
            java.lang.String r0 = "ۧۥۡ۬ۢۗۨۖۥۨۖۖۧ۠ۘۛۤۨۧۥۚۙۜۥۘ"
            goto L_0x000f
        L_0x0131:
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r15.setBackground(r0)
            java.lang.String r0 = "۫ۥۛۗۚۡۘۥۤ۠ۤۘۖۘ۟ۗۧۢۨۧۘ"
            goto L_0x000f
        L_0x013d:
            java.lang.String r0 = "ۗۖۧۘ۠ۢۥ۫۠ۢۤۘۛۛۤۧۗۚ۠ۜۡۙۘ"
            goto L_0x000f
        L_0x0141:
            java.lang.String r0 = "ۗۛۨۘ۫ۙۢۢۧ۠ۡۘ۠ۤۨۙۦۖ۠ۛۛۨۥۦۘ۟ۥۚ"
            goto L_0x000f
        L_0x0145:
            java.lang.String r0 = "۬ۡۛۤۚ۫ۡۜۘ۫ۢۥۘۧۢۢ"
            goto L_0x000f
        L_0x0149:
            java.lang.String r0 = "۫ۥۛۗۚۡۘۥۤ۠ۤۘۖۘ۟ۗۧۢۨۧۘ"
            goto L_0x000f
        L_0x014d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.YoSettings.HomeHeader.e(androidx.appcompat.widget.Toolbar):void");
    }

    public SpannableString getColoredToolbarTitle(CharSequence charSequence) {
        SpannableString spannableString = null;
        String str = "۟۟ۘۘ۟ۖۥۘۢۡۗ۬ۙۥۘۗۜۡۤۚ۫ۢۙۜۘ";
        while (true) {
            switch ((str.hashCode() ^ 524) ^ 985747464) {
                case -1912605314:
                    str = "۠ۡۨۨۨۜ۠۠ۘۘۡ۟۟۟ۙ۟ۢۢۖۘ۫ۡۢۥ۫ۘ";
                    break;
                case -1024315576:
                    spannableString = new SpannableString(charSequence);
                    str = "ۘۙۨ۬ۛۛۥۗۢۗۧۧ۟۠ۥ۟ۦۥۘ";
                    break;
                case -622331451:
                    str = "ۛۨۨۡۧۘ۫ۚۖۘ۬ۚۡۘۡۙۦۘۡۤۥۘ۬۠ۛ۫ۢۘۘۧۡۗ";
                    break;
                case 189787862:
                    spannableString.setSpan(new ForegroundColorSpan(HomeUI.TTextColor()), 0, charSequence.length(), 33);
                    str = "ۘۤۤۨۛۛۖ۫ۨۘۨۥۦۧۦ۟ۧۗۘۥ۟";
                    break;
                case 1083932082:
                    return spannableString;
            }
        }
    }

    public void initPreview() {
        String str = "ۨۖۡۘۡۜۗۨۘۖۚۖۤ۬ۢۗۗۚۨۘۙۡۡۘ";
        int i2 = 0;
        int i3 = 0;
        ViewGroup viewGroup = null;
        View view = null;
        while (true) {
            switch ((str.hashCode() ^ 304) ^ -1700468738) {
                case -1778630221:
                    this.f1174f = view;
                    str = "ۧۘۜۘ۬ۡۨۘۢۥۥۘۗ۟ۘۘۜۡۜۘ";
                    break;
                case -1670006297:
                    this.f1188t = (TextView) this.f1177i.findViewWithTag("status_tab");
                    str = "۫۟ۜۘ۟ۡۜۘ۠ۢۙۢۜ۫ۢۘۗۙۚۧ۫ۙۜۜۘۘۘ۠ۤ۬";
                    break;
                case -1593639796:
                    str = "ۚۙۥۙ۬ۖۤۙ۬ۢ۠ۛۤ۫ۥ";
                    viewGroup = (ViewGroup) this.f1174f.findViewById(yo.getID("yo_igstories_holder", "id"));
                    break;
                case -1584047555:
                    this.f1182n = (Toolbar) this.f1174f.findViewById(yo.getID("one_toolbar", "id"));
                    str = "ۚۗۥۘۨ۠ۤۡۘۡۘۛۛۖۙۚۜۘۤۛۙ";
                    break;
                case -1116533932:
                    str = "۫ۜۡۘۗ۫ۨۢۡۦ۬ۖ۬ۗۡۘۛۧۖۘ۬۬ۡۘۗۨۜۘۗۧ";
                    break;
                case -978876649:
                    this.f1185q = (ImageView) this.f1177i.findViewWithTag("camera_tab");
                    str = "ۧۢۚۙۛۖۘۖۦۥۘۢۜ۫ۦۡۢۜۛۤ";
                    break;
                case -818910089:
                    this.f1186r = (TextView) this.f1177i.findViewWithTag("chats_tab");
                    str = "۫ۜۘۘۖ۟ۥۘۦۥۢۥۙۤۨۜۦۖ۟ۙۨۦۡ۟۟ۘۙۗ";
                    break;
                case -768730585:
                    d(this.f1182n);
                    str = "ۘ۫ۜۦ۬ۛۚۛۦۛ۟ۥ۬ۛۢۙۢۖۘۘ";
                    break;
                case -761698494:
                    return;
                case -649776715:
                    this.f1179k = viewGroup;
                    str = "۠ۙۧۖۘۘۘۚ۟ۦۜۘۜۘ۬۬ۖۘۧ۟ۤۖۚۨۘۙۢۢۜۖۘ";
                    break;
                case -558032677:
                    c();
                    str = "۬ۤۛۤۨۘۘۛ۠ۢۦۦۡۘۗۚۢۙۖۧۘ۠ۦۨۘ";
                    break;
                case -486542875:
                    updatePreview();
                    str = "ۜ۫ۨۘۨۘ۬ۨ۬ۥ۫ۜۧۘۥ۟۬";
                    break;
                case -394750697:
                    d(this.f1181m);
                    str = "ۥۜۡۘ۟ۗۖۘۙۡۨ۠ۤۘۥ۫ۤۧۙ۬۠۟۬ۘ۬";
                    break;
                case -383398314:
                    this.f1184p = (ImageView) this.f1177i.findViewById(yo.getID("divider", "id"));
                    str = "ۦۛۙ۠ۜۤۥ۠ۦۘۧۜۧۡ۫۠ۤۤۖۘ۠ۨۘ۫ۘ۟";
                    break;
                case -347513499:
                    this.f1189u = (TextView) this.f1177i.findViewWithTag("calls_tab");
                    str = "ۘ۫ۥۡۚۙۨۧۢۨۗۖۖۘۧۖۧۙ";
                    break;
                case -63025538:
                    this.f1183o = (TextView) this.f1177i.findViewById(yo.getID("badge", "id"));
                    str = "ۚ۬ۤۚ۠ۡۘ۠۬۠ۡۖۘ۟ۗۡۙۖۨۘۖۤۦۘ";
                    break;
                case 59386665:
                    str = "ۦۦۙۙۦۡۜۨۦۘۤ۠ۘۜۗۥ۫۬ۖۘۡۥۤۤۜ";
                    i3 = 0;
                    break;
                case 99652600:
                    this.f1179k.removeAllViews();
                    str = "ۖ۫ۤۚۢۨۚۧۚۨۘ۠ۨۨۥۘۘۚۙ";
                    break;
                case 195631956:
                    String str2 = "ۖ۫ۗ۫ۗۙۖۙۜۘۜۜۡۡۖۥۘۖ۫۫ۗ۫۫ۦ۫ۤ";
                    while (true) {
                        switch (str2.hashCode() ^ 353166909) {
                            case -987548126:
                                if (!this.f1191w.isChecked()) {
                                    str2 = "ۚۦۚ۬۟ۙۡۘۘ۟۫ۖۛۦۦۘۗۢۛ";
                                    break;
                                } else {
                                    str2 = "ۛۚۧۖۢ۬۠۠۟ۥ۫۟۠ۘۥۤۗۦۘ۠۟ۗۥۦ۬ۛ";
                                    break;
                                }
                            case -791934507:
                                str2 = "ۡۗۡۘۘۢۡۨۦۗۚۙۖۘۙ۟ۘۧ۠ۖ۫ۡۚۗ۠۫ۦۡۘ";
                                break;
                            case -695306065:
                                str = "ۥۘۨۘۛۜۘۗۛۤ۟۫۫ۘۜۨۧۥ";
                                continue;
                            case 1640528569:
                                str = "ۛ۫ۘۘۙۙۤۗۙۨۘ۫ۦۗۨۢۥۘۨۘۢۚۢۥۘۙۥۦۢ۫ۦ";
                                continue;
                        }
                    }
                    break;
                case 435690048:
                    str = "ۘۛۨۘۡۦۨۘۦۡۦۘ۬ۧۚۧۖۜۚۡ۫۬ۦ۟ۤۦ۬";
                    break;
                case 613836679:
                    str = "ۙ۠ۧ۟ۖۢۦۘۨۘۢۚ۟۟ۨ۟ۗۦۘۗۛۚۤ۠ۚ۠ۦۘ";
                    view = findViewById(yo.getID("preview", "id"));
                    break;
                case 678427491:
                    str = "ۤ۫۟ۢ۫ۨۘۛ۫ۜۘۤۙ۫ۘۘ۠";
                    break;
                case 945353544:
                    viewGroup.setVisibility(i3);
                    str = "۟ۘۘۧ۠ۨۘۦۘ۟ۛۙۧۧۚ۬";
                    break;
                case 1366790139:
                    this.f1187s = (TextView) this.f1177i.findViewWithTag("groups_tab");
                    str = "ۡۨۖۘۛ۟ۘۘۧۘ۠ۤۡۥۘ۠ۗۨۨۗۧ";
                    break;
                case 1764553445:
                    str = "ۘۛۨۘۡۦۨۘۦۡۦۘ۬ۧۚۧۖۜۚۡ۫۬ۦ۟ۤۦ۬";
                    i3 = i2;
                    break;
                case 1995561407:
                    this.f1181m = (Toolbar) view.findViewById(yo.getID("toolbar", "id"));
                    str = "ۜۜۨ۬ۗۗۖۦۘۚۚۜ۫ۥ۠ۤ۟ۨۧۚۖۙۨ";
                    break;
                case 2146368993:
                    i2 = 8;
                    str = "۟ۥۗۢۛۜۘ۠ۚۧۦۥۤۥۢۨۘ";
                    break;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        String str = "ۢ۠ۥۘۡۤۥۤۙۡۘۦۡۚۨۙۖۦۦۚ";
        CharSequence charSequence = null;
        ListPreference listPreference = null;
        ListPreference listPreference2 = null;
        CharSequence charSequence2 = null;
        CharSequence charSequence3 = null;
        ListPreference listPreference3 = null;
        ListPreference listPreference4 = null;
        while (true) {
            switch ((str.hashCode() ^ 940) ^ -691671204) {
                case -2028227722:
                    listPreference3 = this.f1190v;
                    str = "ۡۤۛۥۤۘۘۢۛۨۘۨ۫ۥ۟ۢۛۜۡۧۘۨ۠ۨۘۛۤۦ";
                    break;
                case -1831185750:
                    initPreview();
                    str = "ۨۨ۫ۜۙۢۦۦۛۜۡۙۜۤۦۘ";
                    break;
                case -1792216500:
                    str = "ۥۢۖۘۧۘۨۢۧۤۡۜۚۧۚۥۖ";
                    break;
                case -1333423308:
                    str = "ۖۨ۬ۧۨۘۘۡۤۨۘۦۖۥ۬ۛۖ";
                    listPreference2 = listPreference3;
                    break;
                case -976818617:
                    listPreference2.setSummary(charSequence2);
                    str = "ۖ۬ۤۢۖۡۘۥۛۡۡۙۜۢۡۘ";
                    break;
                case -730524622:
                    String str2 = "ۢ۠ۦۜۚۡۢۦۜۗۙۥۘۛ۟ۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 1790695671) {
                            case -1740790974:
                                str = "۟ۡۧ۬ۖۖۘۦۤۢ۫ۛۖۘ۟ۥ۠ۛۦۦ";
                                continue;
                            case -712676360:
                                str = "۟ۥۨۘۨ۠ۧ۬ۗۜۤ۠ۧۤۦۨ۠ۚۜۥۙۢ";
                                continue;
                            case 1258212682:
                                str2 = "ۙۧۡۡۗۜۘ۠ۨۘۡۜۙۧۙ۫ۗۜۛۧ۬ۦۧۗۖ";
                                break;
                            case 2022853685:
                                if (listPreference4.getEntry() == null) {
                                    str2 = "ۛۦۜۤۥۗ۟ۢۙۢ۬۬۠ۗۗ";
                                    break;
                                } else {
                                    str2 = "ۨۤۡۘ۠۬ۘ۬۫۟ۗۤۧۡۤۧۡۧ۬ۗۛۛۤ۟";
                                    break;
                                }
                        }
                    }
                    break;
                case -672930569:
                    this.f1191w = (TwoStatePreference) findPreference("enable_ig_stories");
                    str = "۫ۡۡۘۢۗۘۛ۟۠ۖۗ۠ۨۧۢۡۙۤۛ";
                    break;
                case -486346921:
                    setContentView(yo.getID("yo_settings_homeheader", "layout"));
                    str = "ۙۥۦۘۨۘۡۥۗۨۖۜۘ۫ۥۥۘۨۘۢۨۧۨۘ";
                    break;
                case -479419780:
                    str = "ۨ۠ۤۦۘۘ۬ۧۘ۠ۨۨۘۖۚۖ";
                    charSequence2 = charSequence;
                    break;
                case -324264488:
                    charSequence = listPreference.getEntries()[0];
                    str = "ۛۢۥۘۤ۫ۨ۠ۡ۬۠ۡۜۦ۬ۚۤۜۧۘۘ۠ۦ";
                    break;
                case -297071038:
                    this.f1193y = (ListPreference) findPreference("key_story_view");
                    str = "ۡ۟ۚۡۨۖۘ۫ۧۨۚۖۦۘۧ۬";
                    break;
                case 144043815:
                    str = "۠۟۬ۚۥۡۘۚۦۗۖ۫ۜۗۨۘ";
                    break;
                case 153987067:
                    str = "ۦۗ۫ۦۘۥۘۦۗۙۥ۬۫ۧۦۙۗۙۚۡۢۦۦۦۥ";
                    listPreference4 = (ListPreference) findPreference("ui_home_styleV3");
                    break;
                case 493640880:
                    str = "ۨ۠ۤۦۘۘ۬ۧۘ۠ۨۨۘۖۚۖ";
                    break;
                case 647032277:
                    addPreferencesFromResource(yo.getID("yo_home_header", "xml"));
                    str = "ۢ۫ۚۖۥۜ۬ۜۡۥۗۡۦ۬۠ۘۤۚ۫۬ۚ";
                    break;
                case 713008498:
                    str = "ۧۙۥ۟ۢۤ۟ۨۤۨۦۛۘۚۜ۟ۙۛۤۤۛ";
                    charSequence2 = charSequence3;
                    break;
                case 784921609:
                    this.f1190v = listPreference4;
                    str = "ۗۙ۠ۡ۠۟ۙۤ۬۫ۢ۟ۢۚۥۘ۬ۛۥ";
                    break;
                case 850012296:
                    str = "ۦۧۨۗۧۨۘۛۧۡۢۖۡۘۚۜ۟ۘ۟ۦۘۦ۠ۖۘ۠ۙۛ۟ۢ";
                    listPreference2 = listPreference;
                    break;
                case 1005647535:
                    str = "ۗۨۜۘۗ۬ۡۨۛ۟ۚۘ۠ۦۖۧۙ۟";
                    listPreference = this.f1190v;
                    break;
                case 1181940610:
                    return;
                case 1233033885:
                    this.f1193y.setEnabled(this.f1191w.isChecked());
                    str = "ۗۢۡۤ۠ۡۨۦۥۧ۟ۨۡۤۢ۟ۗۥۘ";
                    break;
                case 1429638188:
                    super.onCreate(bundle);
                    str = "ۜۨۥۘۦۜۥۘ۫ۖۤ۠ۤ۫ۛ۠ۖۘۧۥ۟ۛۢۢۨۡۡۘ";
                    break;
                case 1742921929:
                    this.f1192x = (TwoStatePreference) findPreference("enable_grp_separationV2");
                    str = "ۘۖۚ۟۫ۙۤ۫ۤۧۨ۬۬ۙۘۘۖۗ۟";
                    break;
                case 2065869081:
                    charSequence3 = listPreference3.getEntry();
                    str = "ۖۙۨۚ۟ۘۨ۠ۧۨۛۘۘۛۧۖ۠ۥۤۛۦۖ";
                    break;
            }
        }
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        int i2 = 0;
        int i3 = 0;
        char c2 = 0;
        char c3 = 0;
        char c4 = 0;
        char c5 = 0;
        char c6 = 0;
        char c7 = 0;
        ViewGroup viewGroup = null;
        int i4 = 0;
        int i5 = 0;
        ListPreference listPreference = null;
        String str2 = "ۗۖۧۤۥۘۤۥۡۘۙۤۤۘۢۙۚۧۚۧۚ۫";
        while (true) {
            switch ((str2.hashCode() ^ 235) ^ 561037119) {
                case -1990499889:
                    str2 = "۫ۢۡۛۧۤ۠ۗۢۥ۠ۨ۫ۡۘ";
                    c7 = c5;
                    break;
                case -1880990672:
                    String str3 = "ۘ۫۠ۙۨۡۘۖ۟ۡۘۧۨ۬ۢۗ۬ۨۧۗۛۛۙ۠ۜۧۘۘ۫ۨۘ";
                    while (true) {
                        switch (str3.hashCode() ^ -1317398324) {
                            case -1178140235:
                                str2 = "۬ۡۥۙ۟ۡۖ۬ۨۘۦۥۧۖۙۨ";
                                continue;
                            case 3313077:
                                str2 = "ۙۙۖۖۢۦۛۡۨۘۥۢۥۨ۬ۦۘۡۘۚۤۖۜ";
                                continue;
                            case 523574716:
                                if (!HomeUI.IGStoriesEnabled()) {
                                    str3 = "ۧ۬۟ۖۦۥۘۙۢ۬۟ۖۗۖ۬ۛۥۗۖ";
                                    break;
                                } else {
                                    str3 = "ۦۨۛ۬ۜۗ۬ۙۙۛۚۖۦۡۤۜۢ۟۬ۘۛۦ۟ۤۥۘ۠";
                                    break;
                                }
                            case 1873973668:
                                str3 = "ۚۖۦۘۘ۠۟ۥ۠ۢۙۙۗۥ۠ۛ۬ۤۚۢۡۨۖۜ۟ۦۢۦۘ";
                                break;
                        }
                    }
                    break;
                case -1847534115:
                    str2 = "ۢۛ۠۠ۧۚۚۜۧ۬ۨۜۘۤۗۖۘ";
                    break;
                case -1825713025:
                    str2 = "ۦۚۡۘۧۗۙۜ۬ۛ۠ۧۤۜ۫۫ۘۡۘ";
                    c7 = c4;
                    break;
                case -1817633880:
                    str2 = "۫ۜۨۘۛ۠ۢۙۚۥۥ۟ۨۚ۠۬ۤۡۧ۬ۢۘۡۨۥۘ";
                    c7 = c3;
                    break;
                case -1816881440:
                    str2 = "ۧۘۧ۟۫۟ۥۘۘ۠ۛۨۚۧ۬ۜۘۗۨۨۡۘۧۘۜ";
                    c7 = c2;
                    break;
                case -1720781924:
                    switch (i2) {
                        case -2042464135:
                            str2 = "ۡۨ۬ۡۦۛۚۢۧۡ۬۬ۗ۬۬۠۬ۜ۬ۖ۠ۜۘۙۡۦۘ";
                            break;
                        case -1102077553:
                            str2 = "ۦۢۖۥۡۗۛۚ۫ۙۛ۬ۦۧۨ";
                            break;
                        case 568313454:
                            str2 = "ۥۜ۫ۦۖۜۘ۟ۧۡۖ۫ۧۗۥۨ";
                            break;
                        case 956202168:
                            str2 = "ۗ۬ۦۘۧۘۘۚۗۦۙۥۙۖۙ۟ۥ۬۟ۧۨۙ۟ۙۚۨۘ";
                            break;
                        default:
                            str2 = "ۥۙۖۖ۠ۜۡۜ۟ۙۡ۠ۗۛۙۢ۬ۦۘ";
                            break;
                    }
                case -1705205635:
                    c2 = 65535;
                    str2 = "ۡۛ۫ۛ۠ۥۛۢ۫ۤۨۚۛۨۖ";
                    break;
                case -1558359879:
                    super.onSharedPreferenceChanged(sharedPreferences, str);
                    str2 = "۬ۨ۫ۙۥۡۘۦۨۗۛ۫ۘ۠ۚۡۘ۫ۥۜۘۦۘۘۘ";
                    break;
                case -1464430045:
                case -1291166849:
                case 611516244:
                    str2 = "ۗۡۧۘۛۧۚۡ۬ۖۡۦۧۘۙ۫ۛۜۢۢۧ۫ۨۨۤۥۦ۬";
                    break;
                case -1399895952:
                    c5 = 1;
                    str2 = "ۚۙۗۧۡ۬ۧۨۛۧۥۡۥۡۗۢۧۘ";
                    break;
                case -1327044238:
                case -1078450825:
                case -586821669:
                case -385434714:
                case -356813562:
                case 377819587:
                case 1505441759:
                case 1582660359:
                    str2 = "ۢۨۜۘ۟ۦۛۚۘۙۤ۫ۨۛ۠ۖۛۨۜ";
                    break;
                case -1012332810:
                    i3 = 0;
                    str2 = "ۡ۟ۗۦ۫ۢۡ۫۟ۛۛۖۦۡۥۘۜۖۖ";
                    break;
                case -974333894:
                    i4 = 8;
                    str2 = "ۦ۫ۨۘۜۦ۬۬ۤۘۗۙۖۘۥۙۘۘ۠۠ۤۚ۫ۥ";
                    break;
                case -852901802:
                    str2 = "ۘۡۘۘۨۚ۫ۚۦۜۚۥۘۚۘۗۙۥۦۘ";
                    break;
                case -845050763:
                    String str4 = "ۚ۠ۙ۟ۗۛۜۛۤ۬ۘۖۘۜۧۙۚ۠ۛۡۜ";
                    while (true) {
                        switch (str4.hashCode() ^ 881161066) {
                            case -573555200:
                                str2 = "۠ۨ۬۫ۨۨ۠ۛۘۘۤۨۛۘۜۜۢۡ۠ۗۢۚۥۨۢ";
                                continue;
                            case -492112851:
                                str2 = "ۢ۬ۘۘۦۛۤۜۘۦۘۨۜۥۗ۟ۢ۟۫ۧۜۡۤۖۗۜ";
                                continue;
                            case -58961905:
                                if (str.equals("enable_ig_stories")) {
                                    str4 = "ۢ۬ۨۘۢ۠ۜۨۦۧۖۗۨۘ۬ۜ۠ۡۜۘۥۚۦۘ";
                                    break;
                                } else {
                                    str4 = "ۜۚۡۘۡۘ۟۬ۘۡۘۥۧۡۛۦۖۡۛۡۖۥۥۘ";
                                    break;
                                }
                            case 1610078061:
                                str4 = "ۙۢۗۚۛۡۨۨۤۢۥۖۘۛۥۙۖۙ۬ۢۤۚ";
                                break;
                        }
                    }
                    break;
                case -602437420:
                    String str5 = "ۗۤۛۘۧۧۧۛۘۘۙۦۙ۠ۚۚ۠ۛ۠ۤۨۖۘ";
                    while (true) {
                        switch (str5.hashCode() ^ -79182783) {
                            case -1772811315:
                                str2 = "ۨۥۚۗۘۨۥۤۗۛۡۘۥۨۘۘۙۦۦۘ";
                                continue;
                            case -417697001:
                                str2 = "ۜۙۥۗۜۡۙۡۨۘۥۚۜۘ۠ۤۘۘۡۖۘۜۙ۬ۢۨۦۦۖۧۘ";
                                continue;
                            case -311908788:
                                str5 = "ۤ۟ۚۘۘۦۘۡۘ۠ۛۗۨۘۥۙۨۘۤۗۚۘۙۦۘۨ";
                                break;
                            case -73323528:
                                if (str.equals("ui_home_styleV3")) {
                                    str5 = "ۡۚۛۢۛۥ۫ۗۨۘ۠ۤۜۤۘۥ۫ۖۧۥۨۥۘۧۖۥ۫ۘۜۘ";
                                    break;
                                } else {
                                    str5 = "ۜۨۡۛ۬ۛۦۚۜۘۢۙۗۧۦۤۢۤۤۗۙۘۘ۫ۘۧۙۦ";
                                    break;
                                }
                        }
                    }
                    break;
                case -392173556:
                    String str6 = "ۜ۬ۛۙۨۥ۠ۧۘۚۥ۫۬۫ۗۢۖ";
                    while (true) {
                        switch (str6.hashCode() ^ -910582962) {
                            case -1710480232:
                                str6 = "ۡۛ۟ۨۗۚۛ۟ۥۘ۠ۗ۟ۢۗۜۘۜ۟";
                                break;
                            case -1350422223:
                                str2 = "۫ۥۦۤۛ۬ۙ۬ۖۘۘۛۗۤۘۦۢۚۘۗۦۖ";
                                continue;
                            case -198475546:
                                str2 = "ۚۜۜۜۨۨۨۦ۬ۗۘۧۥۥۧۘۘۤ۟ۖ۫ۡۜۜۨ";
                                continue;
                            case 145847452:
                                if (str.equals("enable_grp_separationV2")) {
                                    str6 = "۟ۡۚۗ۟۟ۨ۫ۨۘ۟ۜ۬ۧ۬ۥ۟ۤ";
                                    break;
                                } else {
                                    str6 = "ۤۙۗۗ۫۬ۜۦۨۘ۟ۦ۟۬ۙ۫۟۟";
                                    break;
                                }
                        }
                    }
                    break;
                case -368488529:
                    str2 = "ۙۘۜۘۡۥ۠ۡۥۢۗۡۗ۟ۘۚ۟ۜۖۜۦۗۧۖ۫";
                    c7 = c2;
                    break;
                case -327253671:
                    str2 = "ۗۨ۫ۧۧۨۗۘۜ۬ۚۛۥۘۥۢۛ";
                    c7 = c2;
                    break;
                case -181457145:
                    this.f1179k.removeAllViews();
                    str2 = "ۘۡۨۡۦ۠۠ۘۖۘۦۡ۫ۦۥ۟ۥۜۥۡۥۦۖۚۨ۫۬۫";
                    break;
                case -72758126:
                    viewGroup.setVisibility(i5);
                    str2 = "ۜۢۗۙۡۖۘۛۧۗۚ۟ۡۡۘۜۘ۟ۙ۠ۧۛۤۨۚۨۘ";
                    break;
                case 10118162:
                    IPreviewScreen.mHandler.postDelayed(new f(this, 1), 300);
                    str2 = "ۗۡۧۖۦۖۧۙۙۜۧۛۤۤ۫۬ۤ";
                    break;
                case 74580901:
                    return;
                case 212625455:
                    str2 = "ۢۛ۠۠ۧۚۚۜۧ۬ۨۜۘۤۗۖۘ";
                    i5 = i4;
                    break;
                case 412494651:
                    str2 = "ۢۨۜۘ۟ۦۛۚۘۙۤ۫ۨۛ۠ۖۛۨۜ";
                    c7 = c6;
                    break;
                case 662911970:
                    switch (c7) {
                        case 0:
                            str2 = "۟ۘۦۨ۠ۙ۬ۛ۟ۡۢۖۜ۟ۙ۟۠ۦ۟ۘۥ";
                            break;
                        case 1:
                            str2 = "ۙۧۡۘۙۥۧۘۨ۠۟ۥۧۢۘۖ۬";
                            break;
                        case 2:
                            str2 = "ۜۗ۫ۧۡۛ۟ۚۧۛ۟ۜۤۤ۫ۗۢۦۜۢۖ۟۟ۡۜۥۜ";
                            break;
                        case 3:
                            str2 = "ۦۨۙ۬۫ۘۗ۫۬ۛۗۥۢ۫ۖۚۧۛ۬ۖۗ۫ۤۨۘۖۡ۫";
                            break;
                        default:
                            str2 = "۟ۤۥۢۛۢ۫ۜۘۘ۫ۛۜۘۜۛۨۘ۫ۨۘۘۗۚۦۘۗۘۘ۠ۡۨ";
                            break;
                    }
                case 684341306:
                    c4 = 2;
                    str2 = "ۤۚۘۘۜۙۨۗ۫ۗۚۨۧ۬ۙۥۚۜۘ۠ۖۥۤ۬ۙ";
                    break;
                case 791132522:
                    str.getClass();
                    str2 = "ۤ۟ۗۧۘۜۘ۬۬ۛۖۙۘۥۚۗۗۤۜۖۖ۟";
                    break;
                case 962457467:
                    i2 = str.hashCode();
                    str2 = "۫ۗۘۘۦ۬ۙۨۘۧۦۚۙۜۜۘۛۨۤ۬ۖ۠";
                    break;
                case 980056424:
                    str2 = "ۨ۟۫ۗ۠ۤۛۦۧ۠ۛۢۦ۠ۘۘۜۙۚۢ۠ۘۘ";
                    c7 = c2;
                    break;
                case 1318389855:
                    str2 = "ۡۛۦۤ۟۫ۤ۟ۥۤۡۚ۠ۜۥۘ۬ۙۜ";
                    i5 = i3;
                    break;
                case 1508821944:
                    listPreference = this.f1190v;
                    str2 = "۫ۨ۟ۥۨۡۘۦۖۡ۟ۨۡۤۨۥۚۖۤۜۛۧۘۨۚۖۥۘ";
                    break;
                case 1514857121:
                    viewGroup = this.f1179k;
                    str2 = "ۢۧۜۚ۫۫ۢۡۖ۫ۡ۬۠۟ۗۨۛۙۦۨۖ";
                    break;
                case 1522249545:
                    listPreference.setSummary(listPreference.getEntry());
                    str2 = "ۦۨۙ۬۫ۘۗ۫۬ۛۗۥۢ۫ۖۚۧۛ۬ۖۗ۫ۤۨۘۖۡ۫";
                    break;
                case 1570034904:
                    this.f1193y.setEnabled(this.f1191w.isChecked());
                    str2 = "۫ۙۦۗۡۥۘۘۨۥۘۦ۠ۨۘۡۖۧۦۢۙۧۦۤ۫ۧۦۘ";
                    break;
                case 1752923260:
                    String str7 = "ۖ۟۫ۡۘۥۘۛۢ۟ۥۧ۫ۚۧۨۘ۫ۖۥۘۨۘۚۚۙۢ";
                    while (true) {
                        switch (str7.hashCode() ^ 1370830510) {
                            case -578644315:
                                str2 = "ۖ۠ۗۛۢۛۢۙۚۛۚۥۖۜۘۥۨۧ";
                                continue;
                            case -383592961:
                                if (str.equals("key_story_view")) {
                                    str7 = "ۥۦۨۘۦۥۨ۫۟ۥۘۚۧۙۚ۬ۚۚۙۨ";
                                    break;
                                } else {
                                    str7 = "۫۟۬۠ۤۖۘۧۢۢۘۗۧ۟ۡ";
                                    break;
                                }
                            case 40609120:
                                str2 = "ۘۨۖۗۜۡۘ۫ۚۨۜ۟ۘ۠۬ۙۡۗ۬ۙۦۘ";
                                continue;
                            case 355016239:
                                str7 = "ۡۘۢۦۦ۟ۧۤۗ۠۫ۤۜۘۧۨۗۖ۟ۘۥۘۛ۫";
                                break;
                        }
                    }
                    break;
                case 1840620919:
                    str2 = "ۤۛ۠۫ۢ۬ۤۜۦۘۙۛۦۘۘۡۢ۬ۚۘۘۛۢ۬ۥۙۢ";
                    c7 = c2;
                    break;
                case 1847211152:
                    c3 = 3;
                    str2 = "ۘۨۜۘۜۘۜۤ۫ۚۜۙۜۘۘۦۢ";
                    break;
                case 1909798716:
                    str2 = "۟ۡۡۘ۠ۦ۠۫ۤۦ۠ۘ۠ۡۛۗۙۢۨۘ۬ۡۙ۠ۧ۬ۡۜۘ";
                    break;
                case 1966664382:
                    str2 = "ۚۦ۫ۧۙۛۖ۬ۨۘۖۗۖۘۦۗۨۘۡ۬ۢۛ۫ۘۡۡ۟ۛۛۥۘ";
                    break;
                case 2044442096:
                    shp.putString("ui_bottom_style", this.f1190v.getValue());
                    str2 = "ۨ۬۠ۛۛۨۥۦ۫ۨۥۖ۟ۨۡ۬ۨۥۗۧۚۡ۬ۘ۬ۖۥ";
                    break;
                case 2087600106:
                    c();
                    str2 = "ۗۡۧۘۛۧۚۡ۬ۖۡۦۧۘۙ۫ۛۜۢۢۧ۫ۨۨۤۥۦ۬";
                    break;
                case 2094460146:
                    c6 = 0;
                    str2 = "۫ۘ۫۟۬۟ۡ۠ۖۘ۫ۗۜۖۖ۫ۘ۟ۖۤۛۨۘ۫ۢ۬";
                    break;
            }
        }
    }

    public void onStart() {
        String str = "ۜۧۨۘۚۤۘۚۦ۟ۘۘ۠ۥۖ۟ۖۦۨۘۙۧۤ۬ۚۢ";
        while (true) {
            switch ((str.hashCode() ^ 816) ^ -608611589) {
                case -1843862009:
                    str = "ۧۦۨۘۗۡ۟ۢۤۜۥۜۧۘ۠ۧۤۛۢ۠ۥۖۧۡۢۚۖۘۘ";
                    break;
                case -664513669:
                    return;
                case 2031564852:
                    IPreviewScreen.mHandler.postDelayed(new f(this, 0), 300);
                    str = "۬ۙۘۘۚۙۧۘۗۤ۬ۜۥۘۗۢۧ۫۫ۥۘۛۘۗۘۡۘ۫ۤ";
                    break;
                case 2116441232:
                    super.onStart();
                    str = "۟ۧۖۨ۟ۨۘۢۖۥۘۦۚۜۥۥ۫";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0126, code lost:
        r0 = "۫ۤۖۘۛ۬ۨ۬ۛۥۜۦ۠ۘۘۧۘۚ۫ۛ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void updatePreview() {
        /*
            r14 = this;
            r10 = 0
            r9 = 0
            r7 = 0
            r6 = 0
            r5 = 0
            r4 = 0
            r3 = 0
            r8 = 0
            r2 = 0
            r1 = 0
            java.lang.String r0 = "۫ۦۥۨۦۖۤۥۡۘۛۗۨۘۡ۟ۗۦۤۘۤۤۖۘ"
        L_0x000c:
            int r11 = r0.hashCode()
            r12 = 325(0x145, float:4.55E-43)
            r13 = -1361804073(0xffffffffaed484d7, float:-9.664241E-11)
            r11 = r11 ^ r12
            r11 = r11 ^ r13
            switch(r11) {
                case -1978360660: goto L_0x02b4;
                case -1905661956: goto L_0x0025;
                case -1821553900: goto L_0x001e;
                case -1693321225: goto L_0x0293;
                case -1652294681: goto L_0x01a5;
                case -1644293915: goto L_0x0051;
                case -1582898721: goto L_0x00dc;
                case -1462970679: goto L_0x0083;
                case -1444083843: goto L_0x0157;
                case -1420002757: goto L_0x0311;
                case -1320929879: goto L_0x02db;
                case -1305601259: goto L_0x0339;
                case -1300631991: goto L_0x0091;
                case -1171195594: goto L_0x0286;
                case -921275813: goto L_0x0339;
                case -903959860: goto L_0x00b4;
                case -893700928: goto L_0x007b;
                case -814417964: goto L_0x00af;
                case -771458243: goto L_0x0339;
                case -769211902: goto L_0x002f;
                case -750647529: goto L_0x02c7;
                case -738439666: goto L_0x01b7;
                case -662334889: goto L_0x0113;
                case -658009222: goto L_0x00d7;
                case -573689093: goto L_0x0255;
                case -537053049: goto L_0x001b;
                case -408326266: goto L_0x01f9;
                case -279114482: goto L_0x0279;
                case -269365238: goto L_0x01db;
                case -197972549: goto L_0x0059;
                case -165888103: goto L_0x0109;
                case -112617972: goto L_0x0341;
                case -76782257: goto L_0x00aa;
                case -27678824: goto L_0x0241;
                case -4716046: goto L_0x0193;
                case 18093888: goto L_0x0139;
                case 261515322: goto L_0x02ff;
                case 301264511: goto L_0x022f;
                case 323065663: goto L_0x007f;
                case 598336746: goto L_0x02a6;
                case 673207388: goto L_0x0104;
                case 697806707: goto L_0x02ed;
                case 783875148: goto L_0x0118;
                case 854766543: goto L_0x02d2;
                case 1013918762: goto L_0x01e4;
                case 1042429548: goto L_0x021d;
                case 1082560585: goto L_0x01d2;
                case 1142063601: goto L_0x010e;
                case 1328411497: goto L_0x0339;
                case 1337277238: goto L_0x02a0;
                case 1585449090: goto L_0x026a;
                case 1674844036: goto L_0x0175;
                case 1710278316: goto L_0x02b4;
                case 1729069592: goto L_0x00e1;
                case 1810176285: goto L_0x0339;
                case 1834737989: goto L_0x01c9;
                case 1839908017: goto L_0x01f0;
                case 2064684169: goto L_0x020b;
                case 2092283611: goto L_0x0238;
                case 2100567250: goto L_0x0055;
                case 2115684022: goto L_0x031a;
                case 2130104729: goto L_0x0264;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x000c
        L_0x001b:
            java.lang.String r0 = "ۤ۟ۖۢۦۛۘۘۘ۟ۛۖۘۧۜۦۦۚۚۖۗۖ"
            goto L_0x000c
        L_0x001e:
            java.lang.String r10 = com.obwhatsapp.yo.HomeUI.getUIHomeStyle()
            java.lang.String r0 = "ۚۨۘۡ۫ۡۚۙۘۗۡۙۘ۬ۚۘۡۚ"
            goto L_0x000c
        L_0x0025:
            int r0 = r10.hashCode()
            switch(r0) {
                case -1378241396: goto L_0x0335;
                case 104461: goto L_0x0331;
                case 110182: goto L_0x032d;
                case 93508654: goto L_0x0329;
                case 109770518: goto L_0x0325;
                default: goto L_0x002c;
            }
        L_0x002c:
            java.lang.String r0 = "۟ۖ۬ۨۡۘ۬ۤۨۢۦۚۢۖۨۘۚۨۡۛۦۥ"
            goto L_0x000c
        L_0x002f:
            r11 = -581946198(0xffffffffdd5034aa, float:-9.376752E17)
            java.lang.String r0 = "ۥۙۦ۟ۙۧۧۤۤۘۤۜۦۦ۬۠ۗۨۘۗۦۜۘۘۦۖۘۚۚۡۘ"
        L_0x0034:
            int r12 = r0.hashCode()
            r12 = r12 ^ r11
            switch(r12) {
                case -255328138: goto L_0x003d;
                case 512694487: goto L_0x0091;
                case 1039331275: goto L_0x0043;
                case 1439835566: goto L_0x004e;
                default: goto L_0x003c;
            }
        L_0x003c:
            goto L_0x0034
        L_0x003d:
            java.lang.String r0 = "ۗ۠ۨۘۙۥۤۙۥۥۘۧۡۜۨ۫ۨۘ"
            goto L_0x000c
        L_0x0040:
            java.lang.String r0 = "ۖ۫ۖۘۖ۬ۚۙۚۨۘۦۨۖۘ۫ۢۖۘۜۛۚۚۙۢۡۘۜۘۨۜۧ"
            goto L_0x0034
        L_0x0043:
            java.lang.String r0 = "stock"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0040
            java.lang.String r0 = "ۥ۠۫ۙۨۡ۟۠ۛ۠ۡۡۥۖۢۨ۬ۡۘ"
            goto L_0x0034
        L_0x004e:
            java.lang.String r0 = "ۦۨۥۘۖۦۧۨ۠ۡۚۜۡ۬ۗۘۘ۠ۤ۠۠ۙۜۘۚ۬ۜۘ"
            goto L_0x0034
        L_0x0051:
            r9 = 3
            java.lang.String r0 = "ۗۛ۬ۨۦۧۘ۬ۖۡۘ۟۫ۡۘۥۡۗۡ۟ۦۘۘ۫۫ۘۙۡۘ"
            goto L_0x000c
        L_0x0055:
            java.lang.String r0 = "۬۟ۚۦۤۤۗۨۖۘۛۡۨۥۤۚۙ۠ۦۘۦ۬ۡۘۢۧۙۦۦۜۘ"
            r8 = r9
            goto L_0x000c
        L_0x0059:
            r11 = -1629037821(0xffffffff9ee6db03, float:-2.4442778E-20)
            java.lang.String r0 = "ۥۦۜۢ۬ۢۦۨۖۘ۬ۙۜۘۛۘۘۜۡ۫ۜۥۨۖۖۨ"
        L_0x005e:
            int r12 = r0.hashCode()
            r12 = r12 ^ r11
            switch(r12) {
                case -936952995: goto L_0x0067;
                case -558272775: goto L_0x0091;
                case 29583342: goto L_0x0078;
                case 724947284: goto L_0x0075;
                default: goto L_0x0066;
            }
        L_0x0066:
            goto L_0x005e
        L_0x0067:
            java.lang.String r0 = "basic"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0072
            java.lang.String r0 = "ۜۙۧۡ۟ۘۙۥ۠۠ۗۘۤۦۘۨۡۨۚۤۛۡۤۨۙۦۘۘ"
            goto L_0x005e
        L_0x0072:
            java.lang.String r0 = "ۜ۫۠۟۠ۧ۟ۡۜۛۡۥۚۗۜۘ۫ۤۦ"
            goto L_0x005e
        L_0x0075:
            java.lang.String r0 = "ۛۛۨۤۦۦۙۚۜۛۘۘۧۢۨۧۥۡۘۚۦ۟"
            goto L_0x005e
        L_0x0078:
            java.lang.String r0 = "ۧۜ۟ۛۥۘۘ۫ۨۛۙۗۥۢۛۛ۟ۢۖۙۨۢۜۜۨۘۥۢ"
            goto L_0x000c
        L_0x007b:
            r7 = 2
            java.lang.String r0 = "۟۠ۡۘۗۗۙۛۡۘۘۙۘۧ۠ۖ۟ۙۖۗۦ۫۟ۗ۫ۢۚۡ"
            goto L_0x000c
        L_0x007f:
            java.lang.String r0 = "ۤۚۖۨۚۜۘۧۛۧۥۥۘۧۡ۫ۛۡۨۜۖۜۘۖۤۗ"
            r8 = r7
            goto L_0x000c
        L_0x0083:
            r11 = -57903259(0xfffffffffc8c7765, float:-5.8347454E36)
            java.lang.String r0 = "ۤۤۖۘۖ۟ۚ۠ۘۧۚ۠ۜۘۙۢۛۨ۟ۚۙۢۧ"
        L_0x0088:
            int r12 = r0.hashCode()
            r12 = r12 ^ r11
            switch(r12) {
                case -449409962: goto L_0x0091;
                case 224944489: goto L_0x00a6;
                case 627613646: goto L_0x0098;
                case 825253648: goto L_0x00a3;
                default: goto L_0x0090;
            }
        L_0x0090:
            goto L_0x0088
        L_0x0091:
            java.lang.String r0 = "ۡ۬۟ۢۢۢۦ۟ۗۤۥۖۜۥۥۘۛ۟ۙۨۗۧۘۗ"
            goto L_0x000c
        L_0x0095:
            java.lang.String r0 = "ۖۖۜ۬ۜ۫۬ۢۘۘۥۤۘۘۙۥۘۗۡۧۘ"
            goto L_0x0088
        L_0x0098:
            java.lang.String r0 = "one"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0095
            java.lang.String r0 = "۫۫ۖۘۦۘۨۨ۬ۥۘۘۚۖۘۖۚۖۘ"
            goto L_0x0088
        L_0x00a3:
            java.lang.String r0 = "۫ۛۥۡۗۧۗۖۥۘۘۛۗ۟ۖ۬۠۟ۚ"
            goto L_0x0088
        L_0x00a6:
            java.lang.String r0 = "۠ۘۘۘ۫۬ۤۨ۠۬ۥۜ۫ۛۡۧۦۤۜۦۛۚ"
            goto L_0x000c
        L_0x00aa:
            r6 = 4
            java.lang.String r0 = "ۚۘۦۘ۫ۡۥۘ۫ۧۧۘ۫ۗۥۙۚۘۨ۫۠ۧۧ۠ۚۙ"
            goto L_0x000c
        L_0x00af:
            java.lang.String r0 = "ۗۛۦۘۜۗۛۦۚۜۧ۠ۖۘۡۦۦۘۜۨۨ۬ۧ۫ۡۘ"
            r8 = r6
            goto L_0x000c
        L_0x00b4:
            r11 = -1588704890(0xffffffffa14e4986, float:-6.989282E-19)
            java.lang.String r0 = "ۛۥۥۘ۬ۦ۟۠ۖۖۘ۟۟ۧۛۢۤ"
        L_0x00b9:
            int r12 = r0.hashCode()
            r12 = r12 ^ r11
            switch(r12) {
                case -1754458441: goto L_0x00d3;
                case -654782147: goto L_0x0091;
                case 1676321618: goto L_0x00d0;
                case 1991633584: goto L_0x00c2;
                default: goto L_0x00c1;
            }
        L_0x00c1:
            goto L_0x00b9
        L_0x00c2:
            java.lang.String r0 = "ios"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x00cd
            java.lang.String r0 = "ۥۗۙۡ۫ۧۚۤ۬ۡۛۙۚۦۘۘۨۜۧ"
            goto L_0x00b9
        L_0x00cd:
            java.lang.String r0 = "۬ۙۘۘۙۧ۠ۙۢۦۛۙۡۡۦۦۗۖۗ۫ۥۤۤ۟ۘۜۢ"
            goto L_0x00b9
        L_0x00d0:
            java.lang.String r0 = "ۢ۬ۛۧۡ۠ۦۥ۠ۖ۫ۦۚۦ"
            goto L_0x00b9
        L_0x00d3:
            java.lang.String r0 = "ۚۥۛۢۜ۠ۨۨۨۛۧۚ۬۫۠ۡۜ۠ۦۤۡۙ۬ۚۛۚ۫"
            goto L_0x000c
        L_0x00d7:
            r5 = 0
            java.lang.String r0 = "ۦ۟ۦۘ۠۠ۙۛۘۖۘۜۧۘۘۛۧۢۨۘۙۧۢۡۙ۟ۦۘۤۜۘ"
            goto L_0x000c
        L_0x00dc:
            java.lang.String r0 = "ۚۢۥۘ۫ۜۤۥۦۘۗۢۥۗۜۖ۫ۧۛۦۙۡ۠ۧ۟ۢۖۘۘ"
            r8 = r5
            goto L_0x000c
        L_0x00e1:
            r11 = -1296305826(0xffffffffb2bbf15e, float:-2.1879426E-8)
            java.lang.String r0 = "ۜۧۢ۠ۛۛۛۦ۠ۛ۠ۜۧ۠ۗۛ"
        L_0x00e6:
            int r12 = r0.hashCode()
            r12 = r12 ^ r11
            switch(r12) {
                case 91262491: goto L_0x0100;
                case 1301769448: goto L_0x0091;
                case 1806040396: goto L_0x00ef;
                case 2038810582: goto L_0x00f5;
                default: goto L_0x00ee;
            }
        L_0x00ee:
            goto L_0x00e6
        L_0x00ef:
            java.lang.String r0 = "ۡ۬ۡۘ۠۬ۘۘۤۜۥۘ۠ۧۦۥۦ۫ۗۜۜۘ"
            goto L_0x00e6
        L_0x00f2:
            java.lang.String r0 = "۫ۗ۫ۘۨۜۖۨۦۘۡۤۖۘۢۜۦ"
            goto L_0x00e6
        L_0x00f5:
            java.lang.String r0 = "bubble"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x00f2
            java.lang.String r0 = "ۜۖۘۘ۟ۢۦۘۢۨۥۗ۬۬۟۬ۢۚۚ۠"
            goto L_0x00e6
        L_0x0100:
            java.lang.String r0 = "۠ۧۥ۟ۨۚۧۥۡۘۛۙۡۘۘۧۥۧ۟ۥۘۖ۠"
            goto L_0x000c
        L_0x0104:
            r4 = 1
            java.lang.String r0 = "ۡۜۙۘۢۜۡۥۘۘ۟ۢۦۘ۠ۤۜ"
            goto L_0x000c
        L_0x0109:
            java.lang.String r0 = "۫ۜ۠ۦۥ۬ۤۜ۟ۨۙۙۦۖ۠ۥۧۘ۠ۧۨۦۧۥۗۘ"
            r8 = r4
            goto L_0x000c
        L_0x010e:
            r3 = -1
            java.lang.String r0 = "۟ۙۢۤ۬ۨۘۡۗ۬ۢۨۡۚۚۖۘۘۥۚۛۘۤۨۙۗ"
            goto L_0x000c
        L_0x0113:
            java.lang.String r0 = "ۖۥۢۗۖۘۖ۟۠ۡۗۙۨۤۙ۠ۢۧۨۛۥۦۚۦۘ"
            r8 = r3
            goto L_0x000c
        L_0x0118:
            r11 = 1391052791(0x52e9c7f7, float:5.02041117E11)
            java.lang.String r0 = "۫۠ۖۧۤۚۚۧۜۨۜۜۗ۬ۧۙۨۖ"
        L_0x011d:
            int r12 = r0.hashCode()
            r12 = r12 ^ r11
            switch(r12) {
                case -526151587: goto L_0x012d;
                case -459046449: goto L_0x0126;
                case -67778277: goto L_0x0135;
                case 1907563860: goto L_0x0132;
                default: goto L_0x0125;
            }
        L_0x0125:
            goto L_0x011d
        L_0x0126:
            java.lang.String r0 = "۫ۤۖۘۛ۬ۨ۬ۛۥۜۦ۠ۘۘۧۘۚ۫ۛ"
            goto L_0x000c
        L_0x012a:
            java.lang.String r0 = "ۛ۬ۙۡۤۜۛۦ۟ۡۧۘۗۤ۠ۖۙۚ۟ۚ۟ۥۘۜ"
            goto L_0x011d
        L_0x012d:
            if (r8 == 0) goto L_0x012a
            java.lang.String r0 = "ۘۛۧۗۘۢۖ۟ۡۧۢۜۧۢۖۘ"
            goto L_0x011d
        L_0x0132:
            java.lang.String r0 = "ۛۘ۠ۙۘۡۢۧۡۘۨۡۨۘۛۦۛ"
            goto L_0x011d
        L_0x0135:
            java.lang.String r0 = "ۛۖۜۖۥۜۘۦۨ۟ۡۖ۟۫ۙۢۙۗ۫"
            goto L_0x000c
        L_0x0139:
            r11 = 1145434963(0x4445f353, float:791.80194)
            java.lang.String r0 = "ۖ۟ۨۘ۠ۧۜۦۜ۟ۡۘۡۖۢۢۢۖۦۨ۬۫"
        L_0x013e:
            int r12 = r0.hashCode()
            r12 = r12 ^ r11
            switch(r12) {
                case -1530483093: goto L_0x0153;
                case -1235964483: goto L_0x0147;
                case -84546804: goto L_0x0150;
                case 94458758: goto L_0x0126;
                default: goto L_0x0146;
            }
        L_0x0146:
            goto L_0x013e
        L_0x0147:
            r0 = 1
            if (r8 == r0) goto L_0x014d
            java.lang.String r0 = "ۖۨ۟۟ۖ۠۬۬۟ۢۧۨۛۚ"
            goto L_0x013e
        L_0x014d:
            java.lang.String r0 = "ۚ۟ۤ۟ۚۨۘۜۦۧۧۛۧۧۖۙۖ۠ۚۚۚۖۘۦۗۥۘۡۨۨ"
            goto L_0x013e
        L_0x0150:
            java.lang.String r0 = "ۘۜۜۘۥۚۧۢ۬ۚۡ۬ۨۦ۟"
            goto L_0x013e
        L_0x0153:
            java.lang.String r0 = "ۦۛ۬ۨۡۘۦ۬ۜۘۖۥۗۚ۠ۨۘۘۜۡۘۨۧۜۚۖۙ"
            goto L_0x000c
        L_0x0157:
            r11 = -963753279(0xffffffffc68e4ac1, float:-18213.377)
            java.lang.String r0 = "۟ۦۡۘۛۡۙ۬ۤۡۦۘ۬۠ۘۦۘ۫ۤۚ"
        L_0x015c:
            int r12 = r0.hashCode()
            r12 = r12 ^ r11
            switch(r12) {
                case -1954185925: goto L_0x016e;
                case 1521874128: goto L_0x0165;
                case 1956957230: goto L_0x0126;
                case 2039733601: goto L_0x0171;
                default: goto L_0x0164;
            }
        L_0x0164:
            goto L_0x015c
        L_0x0165:
            r0 = 2
            if (r8 == r0) goto L_0x016b
            java.lang.String r0 = "ۜۧۗۨۡۘۘۤۜۘۘۛۦۚ۬ۢۦۘ"
            goto L_0x015c
        L_0x016b:
            java.lang.String r0 = "ۢۛۙۚۜۖۘۘ۫ۛۚۡۧۘۗۚۖ۟۫۬ۛۙۗ۬ۥۘ"
            goto L_0x015c
        L_0x016e:
            java.lang.String r0 = "ۨۘۦۥۥۤۙۧۘۘۨۧۥۘۚۧۖۜ۟ۥۡ۟ۥ"
            goto L_0x015c
        L_0x0171:
            java.lang.String r0 = "ۚۚۧۚۥ۫۟ۗۙۧۗۙ۠۬ۡۘۚۤۤ"
            goto L_0x000c
        L_0x0175:
            r11 = 2096405009(0x7cf49a11, float:1.0160362E37)
            java.lang.String r0 = "ۨۘۨۙ۬ۤۚۤۥۦ۟۫۫ۤۖۘۨۦۨۘ۟ۜۗۥۘۡۗ"
        L_0x017a:
            int r12 = r0.hashCode()
            r12 = r12 ^ r11
            switch(r12) {
                case -1508132153: goto L_0x0183;
                case -1076481093: goto L_0x0189;
                case -531773250: goto L_0x033d;
                case 1191931208: goto L_0x018f;
                default: goto L_0x0182;
            }
        L_0x0182:
            goto L_0x017a
        L_0x0183:
            java.lang.String r0 = "ۗۚۥۘ۟۠ۘ۟۬۠ۜۤۨۤۘۡۘ"
            goto L_0x017a
        L_0x0186:
            java.lang.String r0 = "ۜۙۡۥۚ۟۠۟ۦۤۤ۬ۛۦۖۘۚۥۘۡۘۛ"
            goto L_0x017a
        L_0x0189:
            r0 = 3
            if (r8 == r0) goto L_0x0186
            java.lang.String r0 = "ۥۖ۬ۖۡۘۢۚ۬ۦۥۘۘۚ۟ۜۘۡ۟ۥۙۢۤ"
            goto L_0x017a
        L_0x018f:
            java.lang.String r0 = "ۦ۠۟ۗۧۢۧۨۚۧۘۚۢ۟ۧۨۚۡۙ۫ۘۘ۬ۖۤۙۡۦۘ"
            goto L_0x000c
        L_0x0193:
            androidx.appcompat.widget.Toolbar r0 = r14.f1182n
            android.view.Menu r0 = r0.getMenu()
            r11 = 2
            boolean r12 = com.obwhatsapp.yo.HomeUI.showAirplaneMode()
            r0.setGroupVisible(r11, r12)
            java.lang.String r0 = "ۙۨۖ۫ۤۥۘۙۤۡۘۤۗ۫ۥۦۧ۟۠۠ۛۢۘۘۘ۟۟"
            goto L_0x000c
        L_0x01a5:
            androidx.appcompat.widget.Toolbar r0 = r14.f1182n
            android.view.Menu r0 = r0.getMenu()
            r11 = 3
            boolean r12 = com.obwhatsapp.yo.HomeUI.showNightMode()
            r0.setGroupVisible(r11, r12)
            java.lang.String r0 = "ۡۨۡۘ۬ۢۘۘۜ۫ۛۥۤ۫۟ۤۛۢۡۘۧۡۨۢۥۖۘ"
            goto L_0x000c
        L_0x01b7:
            androidx.appcompat.widget.Toolbar r0 = r14.f1182n
            android.view.Menu r0 = r0.getMenu()
            r11 = 4
            boolean r12 = com.obwhatsapp.yo.HomeUI.showCameraStatusIcon()
            r0.setGroupVisible(r11, r12)
            java.lang.String r0 = "ۘۘ۟ۧۥۖۡۤۤۢۖۤۜۨۦۘۜۙۜۦۧۙ۟ۗ"
            goto L_0x000c
        L_0x01c9:
            androidx.appcompat.widget.Toolbar r0 = r14.f1182n
            r14.e(r0)
            java.lang.String r0 = "ۥۡ۟ۥۢۛۖۥۥۘۥۥۘۜۜ۟۟ۖۧۘۗۨۘ"
            goto L_0x000c
        L_0x01d2:
            rc.whatsapp.home.RCTABS.OneUiNavigationView r0 = r14.f1176h
            com.obwhatsapp.youbasha.others.pagerTabBk(r0)
            java.lang.String r0 = "ۚۜۜۤۤۦۨۥۥۨ۫ۧۥ۠ۛ"
            goto L_0x000c
        L_0x01db:
            rc.whatsapp.home.RCTABS.OneUiNavigationView r0 = r14.f1176h
            r0.updateIconsColors()
            java.lang.String r0 = "۫ۖۗۤ۫۫ۢۜۘۘ۟ۚۨۘۡۘۜۜۢۜۘۚۤۚ۫۫ۢۗۡۦۘ"
            goto L_0x000c
        L_0x01e4:
            rc.whatsapp.home.RCTABS.OneUiNavigationView r0 = r14.f1176h
            r11 = 1
            java.lang.String r12 = "6"
            r0.setBadgeValue(r11, r12)
            java.lang.String r0 = "ۙ۫۠ۛۚۖ۫ۛ۠ۜ۠ۥۘ۠۫ۚۢ۠ۙۡۨۛۥ۟ۢۡۤ۟"
            goto L_0x000c
        L_0x01f0:
            androidx.appcompat.widget.Toolbar r0 = r14.f1181m
            r14.e(r0)
            java.lang.String r0 = "ۙۗۧۤ۬ۙۥۛ۟ۘۡۚۙ۟ۨۖۧۧۢۡۧۗۙۡۘۦۛۦ"
            goto L_0x000c
        L_0x01f9:
            androidx.appcompat.widget.Toolbar r0 = r14.f1181m
            android.view.Menu r0 = r0.getMenu()
            r11 = 2
            boolean r12 = com.obwhatsapp.yo.HomeUI.showAirplaneMode()
            r0.setGroupVisible(r11, r12)
            java.lang.String r0 = "ۡۘۜۢۖۢۛۦۧۘۘۨۤ۫ۧۡۛۢ۫ۚۛۚۖ۫ۛ"
            goto L_0x000c
        L_0x020b:
            androidx.appcompat.widget.Toolbar r0 = r14.f1181m
            android.view.Menu r0 = r0.getMenu()
            r11 = 3
            boolean r12 = com.obwhatsapp.yo.HomeUI.showNightMode()
            r0.setGroupVisible(r11, r12)
            java.lang.String r0 = "ۜ۟ۘۤ۬۟ۙۡۨۖۜ۬ۘ۟ۜ۬۠ۘۛۙ۠۟ۤۘۘۙۧ"
            goto L_0x000c
        L_0x021d:
            androidx.appcompat.widget.Toolbar r0 = r14.f1181m
            android.view.Menu r0 = r0.getMenu()
            r11 = 4
            boolean r12 = com.obwhatsapp.yo.HomeUI.showCameraStatusIcon()
            r0.setGroupVisible(r11, r12)
            java.lang.String r0 = "ۨۜۚ۬ۢۖۘۨۧۚ۠ۚۚۙۧ۟ۛۨۨ"
            goto L_0x000c
        L_0x022f:
            android.view.ViewGroup r0 = r14.f1177i
            com.obwhatsapp.youbasha.others.pagerTabBk(r0)
            java.lang.String r0 = "۠ۛۘۘۙۛۘ۟ۚۧۛ۟ۡ۟۬ۨۘ"
            goto L_0x000c
        L_0x0238:
            android.widget.TextView r0 = r14.f1183o
            com.obwhatsapp.youbasha.others.setTabBadge(r0)
            java.lang.String r0 = "ۧۨۦۛۛۦۘۛ۬ۗ۠۟ۦۘۢۚۢ۫ۧۡۛۢۚۘۧۖ۟ۨۦۘ"
            goto L_0x000c
        L_0x0241:
            android.widget.TextView r0 = r14.f1183o
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            r11 = -1
            int r11 = com.obwhatsapp.youbasha.others.getTabBageBKColor(r11)
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r0.setColorFilter(r11, r12)
            java.lang.String r0 = "ۗۥۧۘ۬ۥۨ۫ۗۜۘۦ۫ۗۧۚۗۡ۬ۜۘۛۨۧ"
            goto L_0x000c
        L_0x0255:
            android.widget.ImageView r0 = r14.f1184p
            int r11 = com.obwhatsapp.youbasha.others.pagerIndicator()
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r0.setColorFilter(r11, r12)
            java.lang.String r0 = "۠۫ۘ۫ۙ۫ۤۘ۬ۡۦۧۘۙۛۥۘۚۛ۟"
            goto L_0x000c
        L_0x0264:
            android.widget.ImageView r2 = r14.f1185q
            java.lang.String r0 = "۫۫ۗ۬۫ۢۜۧۡۘۚۤۡ۠ۦۤۜۘۥۘۡ۠ۦۘۛۛۨۙۥۧۘ"
            goto L_0x000c
        L_0x026a:
            android.graphics.drawable.Drawable r0 = r2.getDrawable()
            android.graphics.drawable.Drawable r0 = com.obwhatsapp.youbasha.others.statuscamera(r0)
            r2.setImageDrawable(r0)
            java.lang.String r0 = "ۚۦۢۜۢ۫ۦ۬ۜۘ۠ۥۦۘۤۧۘۘۖۤۡۛۢۡۘۤۨۦۘ"
            goto L_0x000c
        L_0x0279:
            android.widget.TextView r0 = r14.f1186r
            int r11 = com.obwhatsapp.yo.ColorStore.getDefaultTabActiveColor()
            com.obwhatsapp.youbasha.others.pagerTitles(r0, r11)
            java.lang.String r0 = "ۛۚۖ۠ۦۖۛ۠۟ۤۗۘۧۡۙ۫ۖۥۚۢۚۨۚۘۘۗۨۚ"
            goto L_0x000c
        L_0x0286:
            android.widget.TextView r0 = r14.f1188t
            int r11 = com.obwhatsapp.yo.ColorStore.getDefaultTabInActiveColor()
            com.obwhatsapp.youbasha.others.pagerTitles(r0, r11)
            java.lang.String r0 = "ۨۛۙۢۖۙۡۦ۬ۨۗۡۘۙۙۨۨۢۧۖ۬ۜۘ"
            goto L_0x000c
        L_0x0293:
            android.widget.TextView r0 = r14.f1189u
            int r11 = com.obwhatsapp.yo.ColorStore.getDefaultTabInActiveColor()
            com.obwhatsapp.youbasha.others.pagerTitles(r0, r11)
            java.lang.String r0 = "ۙۚۘ۟ۗۚۢۗۧۙۢۡۘ۟ۡ۬۬ۡۦۘۢۦۧۘۤۤۢۛۚۖۘ"
            goto L_0x000c
        L_0x02a0:
            android.widget.TextView r1 = r14.f1187s
            java.lang.String r0 = "۠ۡۡۙۡۖۨۜۘۘ۬ۘۨۘ۬ۛۤۖۜ۟ۛۜۛ"
            goto L_0x000c
        L_0x02a6:
            r11 = -156390200(0xfffffffff6adacc8, float:-1.761273E33)
            java.lang.String r0 = "ۧ۫ۤ۬۫۠۟۫ۥۘۛۤۦۘۘۜ۫۠ۙۛ"
        L_0x02ab:
            int r12 = r0.hashCode()
            r12 = r12 ^ r11
            switch(r12) {
                case -1229783345: goto L_0x02b4;
                case -559576962: goto L_0x02c3;
                case 1221944270: goto L_0x02c0;
                case 1273984350: goto L_0x02bb;
                default: goto L_0x02b3;
            }
        L_0x02b3:
            goto L_0x02ab
        L_0x02b4:
            java.lang.String r0 = "ۤۤۦۘۙۚۥۜۥۗۛ۟ۥۘ۬۫ۡۘۨۦۘۘۡ۟ۜۘۗ۠ۥۤ۬ۡ"
            goto L_0x000c
        L_0x02b8:
            java.lang.String r0 = "ۛ۬ۘۘۧۛ۬ۘۨۙۖۜۧۘۡۢۧۘۡۧۘۧۖۧۚۚۘ"
            goto L_0x02ab
        L_0x02bb:
            if (r1 == 0) goto L_0x02b8
            java.lang.String r0 = "ۜۢۦۘۡۗۘۘ۟ۥۜۘۜۛ۫ۖ۫ۗ"
            goto L_0x02ab
        L_0x02c0:
            java.lang.String r0 = "ۡۦۜۘۖۜۜۘۤ۬ۦۘۘ۟ۜۡۙۤۜۦۜۘۗ۠ۙ"
            goto L_0x02ab
        L_0x02c3:
            java.lang.String r0 = "ۙۧۜۘۚۚۤ۫۠ۡۘۡۤۨۘۦۥ۟۬ۚۖۙۘۢۜ۟ۥۦۦۥ"
            goto L_0x000c
        L_0x02c7:
            int r0 = com.obwhatsapp.yo.ColorStore.getDefaultTabInActiveColor()
            com.obwhatsapp.youbasha.others.pagerTitles(r1, r0)
            java.lang.String r0 = "ۥۖۤۛۗۛۥ۠ۘۘۚۚۙۗۜۡۘۤۡۥۘ"
            goto L_0x000c
        L_0x02d2:
            androidx.appcompat.widget.Toolbar r0 = r14.f1181m
            r14.e(r0)
            java.lang.String r0 = "ۘۘۜۛۤۨ۠ۥۘۘ۬ۦۖۘ۫ۚۢۖ۠ۘۘۗۜۧۧۢۡۘ"
            goto L_0x000c
        L_0x02db:
            androidx.appcompat.widget.Toolbar r0 = r14.f1181m
            android.view.Menu r0 = r0.getMenu()
            r11 = 2
            boolean r12 = com.obwhatsapp.yo.HomeUI.showAirplaneMode()
            r0.setGroupVisible(r11, r12)
            java.lang.String r0 = "ۚۨۥۛۛۧOۢۤۜ۠ۢۜۘ۠ۖۛۙۤۙۙۛۛۗۡ"
            goto L_0x000c
        L_0x02ed:
            androidx.appcompat.widget.Toolbar r0 = r14.f1181m
            android.view.Menu r0 = r0.getMenu()
            r11 = 3
            boolean r12 = com.obwhatsapp.yo.HomeUI.showNightMode()
            r0.setGroupVisible(r11, r12)
            java.lang.String r0 = "ۗ۠ۛۗۡۚۤ۠ۧۤ۬ۚۘۜۖۘ۫۠ۨۘ۟ۢۛ"
            goto L_0x000c
        L_0x02ff:
            androidx.appcompat.widget.Toolbar r0 = r14.f1181m
            android.view.Menu r0 = r0.getMenu()
            r11 = 4
            boolean r12 = com.obwhatsapp.yo.HomeUI.showCameraStatusIcon()
            r0.setGroupVisible(r11, r12)
            java.lang.String r0 = "ۧۧۙۙۙۦۘۜۗۖۘۖۛۥۨ۬ۗۚۦۘ۬ۘۧۗ۟ۛ"
            goto L_0x000c
        L_0x0311:
            android.view.View r0 = r14.f1175g
            com.obwhatsapp.youbasha.others.pagerTabBk(r0)
            java.lang.String r0 = "ۜۚۥۘۚ۟ۜۘۘۦۦۜ۫ۦۗۥۖۘ۠ۛۜۘۨۤۦۘۚۦۛ۠ۗۤ"
            goto L_0x000c
        L_0x031a:
            android.view.View r0 = r14.f1175g
            com.obwhatsapp.youbasha.ui.views.IBottomNavigation r0 = (com.obwhatsapp.youbasha.ui.views.IBottomNavigation) r0
            r0.updateIconsColors()
            java.lang.String r0 = "ۤۤۦۘۙۚۥۜۥۗۛ۟ۥۘ۬۫ۡۘۨۦۘۘۡ۟ۜۘۗ۠ۥۤ۬ۡ"
            goto L_0x000c
        L_0x0325:
            java.lang.String r0 = "ۗۘۦۘۖۥۘۘۨ۠ۗ۟ۨ۫۠۟ۨۘۨۖۚۚۘۘۘۢۗۛ"
            goto L_0x000c
        L_0x0329:
            java.lang.String r0 = "۬ۧۗۛۦۘۘۤۤۡۢۘۚۙۡۡۘ۟ۧۢۖۘۜ"
            goto L_0x000c
        L_0x032d:
            java.lang.String r0 = "ۘۡۡ۠ۚۢۥۚۡۤۖۙۜۗۧۤۘۥۙۜ۫۫ۥۙۢۖۖ"
            goto L_0x000c
        L_0x0331:
            java.lang.String r0 = "ۡۦۡۚ۬ۚۜۘۨۙ۬ۜۘۗۥ۠ۥۜۘ"
            goto L_0x000c
        L_0x0335:
            java.lang.String r0 = "۠ۗۦ۬ۤ۬ۗۖۦ۟۠ۛۙ۫"
            goto L_0x000c
        L_0x0339:
            java.lang.String r0 = "ۖۥۢۗۖۘۖ۟۠ۡۗۙۨۤۙ۠ۢۧۨۛۥۦۚۦۘ"
            goto L_0x000c
        L_0x033d:
            java.lang.String r0 = "ۘۥۦۨۗۤ۠ۚۧۦ۫۟ۨۨ۬"
            goto L_0x000c
        L_0x0341:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.YoSettings.HomeHeader.updatePreview():void");
    }
}
