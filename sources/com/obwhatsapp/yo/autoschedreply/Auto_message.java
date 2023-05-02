package com.obwhatsapp.yo.autoschedreply;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.obwhatsapp.yo.ColorStore;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.ui.YoSettings.BaseSettingsActivity;
import java.util.ArrayList;

public class Auto_message extends Activity {

    /* renamed from: d  reason: collision with root package name */
    public static final int f657d = 0;

    /* renamed from: a  reason: collision with root package name */
    public int f658a;

    /* renamed from: b  reason: collision with root package name */
    public AutoMessageAdapter f659b;

    /* renamed from: c  reason: collision with root package name */
    public RecyclerView f660c;

    /* renamed from: s  reason: collision with root package name */
    public AutoMessageSQLiteAdapter f661s;

    /* renamed from: t  reason: collision with root package name */
    public ArrayList<object_automsg> f662t;

    public interface w {
        void c(View view, int i2);
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.01X, com.obwhatsapp.yo.autoschedreply.AutoMessageAdapter] */
    /* JADX WARNING: type inference failed for: r3v3, types: [com.obwhatsapp.yo.autoschedreply.AutoMessageAdapter, X.01X] */
    /* JADX WARNING: type inference failed for: r1v11 */
    public void a() {
        AutoMessageAdapter autoMessageAdapter;
        String str = "ۡ۠ۧۜ۫ۤۖۘۧۘۤۡۖۥۙ۠ۥۦۘ۟۠ۦۘۗ۫ۖۘ";
        ? r1 = 0;
        while (true) {
            switch ((str.hashCode() ^ 866) ^ 121162063) {
                case -1706738560:
                    str = "ۧ۫ۤۚ۫ۡۘ۬ۦۘۘۚۜۦۘۛۘۤۖ۠ۛ۫ۦ";
                    autoMessageAdapter = r1;
                    break;
                case -533084098:
                    r1.A01();
                    str = "ۨۡۗۦۖۧ۟۟۫ۦۛۙۥ۠ۧۜۥۢۨۙۦ۠۬۫۠ۚ۬";
                    autoMessageAdapter = r1;
                    break;
                case 168857973:
                    this.f660c.setAdapter(this.f659b);
                    str = "ۗۙۙۘۗۖۘۢۡۤ۠ۡۜ۠ۦۙۤۘۧۘۥۡۡۘۗ۟";
                    autoMessageAdapter = r1;
                    break;
                case 271745480:
                    return;
                case 430353195:
                    this.f660c.setHasFixedSize(true);
                    str = "ۢۢۜۘ۬ۘۥۦۙۧۤۗۦ۫۫۟۠ۙۗۖۗۜۘ";
                    autoMessageAdapter = r1;
                    break;
                case 439010148:
                    this.f660c.setLayoutManager(new StaggeredGridLayoutManager(this, (AttributeSet) null, 1, 1));
                    str = "ۜۜۦ۟ۡۨۦۗۚ۠ۤۤۨۡۖ";
                    autoMessageAdapter = r1;
                    break;
                case 473320728:
                    this.f659b = r1;
                    str = "۟ۚۨۘۚۙۧۜۛ۬ۥۦۗۜۛۢ۫۟ۗۙۡ۟ۤۦ";
                    autoMessageAdapter = r1;
                    break;
                case 737215894:
                    str = "ۧ۟ۧۡۖۧۘ۠ۦۙۖۙ۫ۦ۠۟ۖ۬ۘ۟ۤۦۘ۟ۘۡ۬ۗ";
                    autoMessageAdapter = new AutoMessageAdapter(this);
                    break;
                default:
                    autoMessageAdapter = r1;
                    break;
            }
            r1 = autoMessageAdapter;
        }
    }

    public void attachBaseContext(Context context) {
        String str = "ۥ۟ۗۤۘۡۘۦۢۖ۠ۥۛۙ۠ۥ۫۟ۦۡۜۘۘ";
        Resources resources = null;
        Context context2 = null;
        Configuration configuration = null;
        while (true) {
            switch ((str.hashCode() ^ 292) ^ -1995872695) {
                case -1215807191:
                    resources = context2.getResources();
                    str = "۟۠۫ۛ۫ۥۘۨۦۚ۠۟ۖۙۥۘۘ۫ۙۡۦۥۧۢۖۜۖۧ";
                    break;
                case -864674497:
                    return;
                case -705092770:
                    str = "۟ۘۤۛۙۦۘ۠ۤۨۘۨۦۚۗ۬ۚۦۛۖۘۦۨۜۘ";
                    break;
                case 272823584:
                    str = "ۤۚۢۛۙۨۘ۠۠ۘۗۢۜۜۚۘۘۛۨۙ۠۬۟ۡۚ۠۫ۥ۬";
                    break;
                case 589603694:
                    str = "۟ۙ۫ۥۧۚ۠ۡۦۘۥ۫ۡۘۘۗۗۨۨۖۜۨ۠۬ۡ۠ۗۤ";
                    configuration = yo.getCtx().getResources().getConfiguration();
                    break;
                case 666494228:
                    str = "ۙۤ۫۠ۨۥۙ۠ۗۧۨۥۥۛۥۘ۬ۤۤۙۡ۬ۖۗۦۛۨۤ";
                    context2 = context.createConfigurationContext(configuration);
                    break;
                case 847769567:
                    super.attachBaseContext(context2);
                    str = "۟۠ۜۘۧۗۘۘۙۚۥۧۚۚۖۡۦۚۥۨ";
                    break;
                case 1065535229:
                    resources.updateConfiguration(configuration, resources.getDisplayMetrics());
                    str = "ۖ۠ۨۘ۬۠۫ۢ۠ۜۘۥ۠ۘۘۗۡ۫ۙۗ۟";
                    break;
            }
        }
    }

    public void b() {
        String str = "ۢۚ۫ۙۛۗ۫ۦ۬۬ۡۢۛۥۗۡۧۨ۬ۙۦۦۖۖۘۘۙۘ";
        while (true) {
            switch ((str.hashCode() ^ 722) ^ -1473050270) {
                case -1011823236:
                    this.f662t = new ArrayList<>();
                    str = "۬۫ۧۜۙۙ۠ۥ۬۬ۘۜۘۤۥۘۘۚۢۥۘ";
                    break;
                case -264909064:
                    this.f662t = this.f661s.ii();
                    str = "ۡۡۙۧ۠ۡۘۚۜۖۘۤۛ۬۠ۨۜۘ";
                    break;
                case 49870823:
                    this.f661s.open();
                    str = "۠ۜۘۘۛۘۧۘۡۙۥۘۤۦۛۗۥۚ";
                    break;
                case 1318782100:
                    return;
                case 1391554172:
                    this.f661s.close();
                    str = "ۜۖۘۚۖۢ۬ۨۤۡۢۤ۬ۛۥ۫ۤ۟ۗ";
                    break;
                case 1625839471:
                    str = "ۨۡۨۡۢ۠۟ۙۜۜۨ۬ۧ۠ۖۘ۠ۧۢۤ۫ۖ۫ۖۘۦ۠ۖۘ";
                    break;
            }
        }
    }

    public int getPosition() {
        String str = "ۖۧ۫۬ۛۖۡۛۚۤۚۘۘۚ۟ۖۚۙ۬ۜۜ۠ۦۘۨۙۨۧۘ";
        while (true) {
            switch ((str.hashCode() ^ 589) ^ -1391561824) {
                case -336823244:
                    return this.f658a;
                case 725646966:
                    str = "۬ۛۢۛ۠ۥ۟ۛۦۘۛ۬ۜۘ۠ۘۜۘ۠ۛۥۘ۬ۤۖۘ۠ۗۘۖ";
                    break;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        String str = "۟ۛۡۨۙۤۘۚۥۘ۟۠ۘۦ۫ۗ۟۠۟ۚۛۘۘۚ۟۫ۛۥۗ";
        AutoMessageSQLiteAdapter autoMessageSQLiteAdapter = null;
        Toolbar toolbar = null;
        while (true) {
            switch ((str.hashCode() ^ 770) ^ -1537964242) {
                case -1833608752:
                    BaseSettingsActivity.configToolbar(toolbar, this);
                    str = "۬۟ۗۘۨۖۘۦۨۧۦۜ۠ۦۗ۬ۙۗ۬ۦۛ۬ۜۖۥۨۥ";
                    break;
                case -1768168171:
                    a();
                    str = "ۛ۟۫۫ۚۘۘۚ۟ۡۜ۫ۛۛۗۙۥ۠ۖۘۡۛۙ";
                    break;
                case -1748442783:
                    b();
                    str = "۠ۛ۬ۦۗۖۥۥۦۘ۠ۜۢ۬ۧ۟ۙۗۛ";
                    break;
                case -1727822620:
                    str = "ۜۙۖۢۦۘ۟ۢ۬ۢۡۘ۬ۖ۟ۧۛۛۤۦۡۘۤ۟ۘۘۘۚ";
                    break;
                case -774481046:
                    toolbar.setTitleTextColor(ColorStore.getPrimaryTextColor());
                    str = "ۢۚۤۙۘۢ۠ۛۥ۟ۢۜۚ۬۬ۥۗۢ";
                    break;
                case -381708585:
                    ((ImageView) findViewById(yo.getID("add_msg", "id"))).setOnClickListener(new m(this, 1));
                    str = "ۥۚۗۦۚۥۙۙۙ۬ۗۨۚۛۧ";
                    break;
                case -326716823:
                    this.f660c = (RecyclerView) findViewById(yo.getID("list_view", "id"));
                    str = "ۨۜۢۜ۬ۗۢۡۘۤۗ۠ۦۢۦۘ";
                    break;
                case -146720909:
                    autoMessageSQLiteAdapter.open();
                    str = "ۛۥۘۢ۫ۤۨۖۖۘۦ۬ۖۘۙۡ۫ۢۥۛ۫ۤ۠";
                    break;
                case -31526113:
                    str = "ۜۨۡۦۧۖ۟ۧۦۘۗۖ۬۬ۜۘۘۥ۠ۗۖۖۢ۫ۗۥۘ۬ۧۗ";
                    break;
                case 685207495:
                    toolbar.setTitle((CharSequence) yo.getString("msg_autoreply_title"));
                    str = "۟ۢۥۘۤۡۘۛۚۘ۠ۢۨۘۢ۫ۚ۠۠ۘۡ۠ۡۢ۬ۨۜۨۧۘ";
                    break;
                case 844187984:
                    setContentView(yo.getID("automessging_list", "layout"));
                    str = "ۧۙۜۘۙۙ۬ۚۡۜۧۥۘۢۧ۟ۚ۟ۦۖۤۦۧۨۧۘۖ۟ۚ";
                    break;
                case 850708984:
                    super.onCreate(bundle);
                    str = "ۡۢۥۘۨۧۦۤۡۜۤۢۘۙ۫ۜۘ";
                    break;
                case 1032012551:
                    this.f661s.close();
                    str = "ۧۙۦۘۥۖۜۘۘۚۖ۬ۖۖۘۘۖۨۛ۟ۨۘ";
                    break;
                case 1401225535:
                    autoMessageSQLiteAdapter = new AutoMessageSQLiteAdapter(getApplicationContext());
                    str = "ۧۗ۟ۢۢۚۙۥۢۤۗ۠۠ۖۡۘ";
                    break;
                case 1481621715:
                    toolbar.setNavigationOnClickListener(new m(this, 0));
                    str = "ۡۧ۠ۥۜۜۘۗۘۘۛۦۡ۟ۙۖۚۧ۟ۙۛۦۘۦۨۨ۟ۥۛ";
                    break;
                case 1715057507:
                    return;
                case 1935191395:
                    this.f661s = autoMessageSQLiteAdapter;
                    str = "۫ۨۖ۟ۤۚۘۘۤۥۘۨۤ۟ۚ۠ۗۜۘۘۖۢ";
                    break;
                case 2129206717:
                    str = "ۢۢۨۖۨۖۘ۬ۜۥۘۧ۬ۧۘۜۙۚ۫ۜۡۜ۟ۨۨۖ";
                    toolbar = (Toolbar) findViewById(yo.getID("acjtoolbar", "id"));
                    break;
            }
        }
    }

    public void onResume() {
        String str = "ۛۢۘ۬۠ۧۦ۟ۦۘۤ۫ۖۘۡۜۜۘۗۡۗۚۗۧ۫ۤ۫ۥ۬ۜ";
        while (true) {
            switch ((str.hashCode() ^ 739) ^ -1902032378) {
                case -1872796920:
                    str = "ۖۤۖۘ۬۟ۨۡۧۧ۫ۜ۫۬ۖ۟ۛۗۥ";
                    break;
                case -1246370448:
                    b();
                    str = "ۥ۫ۢ۟ۖۖۘۘۗ۫ۘۙۦۦۚۜۘ";
                    break;
                case -538987476:
                    return;
                case 1176625691:
                    a();
                    str = "۬۠ۤۛۧۨۘۜۚۜۘۘۙۘۘ۬ۤۥۘۖ۬ۖۘۘۤۥۘ";
                    break;
                case 1680766647:
                    super.onResume();
                    str = "ۚۘۤۖ۫ۜۘۨ۟ۡۘۜۛۢۛۥۚۢۥۘۘ";
                    break;
            }
        }
    }

    public void setPosition(int i2) {
        String str = "ۚۥ۠۠ۙۥۧۨۛۜۡۘۡۚۦۘۙ۟ۙ";
        while (true) {
            switch ((str.hashCode() ^ 287) ^ 1669519830) {
                case -1898655631:
                    str = "ۥۜۢۚۛۖۘۤ۟۠۟ۘۡۧۚۥۘۤۖۖۘ";
                    break;
                case -840844841:
                    this.f658a = i2;
                    str = "ۨ۫ۛۧۚۚۙۚۡ۟ۥۡۘ۠ۨۘۙۘۥۘۡۧۘ";
                    break;
                case -427065278:
                    str = "ۖۢۛۥۜۚۨۙۧ۫ۜۧۘۢۤۤ";
                    break;
                case 1883878391:
                    return;
            }
        }
    }
}
