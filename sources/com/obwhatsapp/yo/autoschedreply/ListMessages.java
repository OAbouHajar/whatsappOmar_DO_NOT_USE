package com.obwhatsapp.yo.autoschedreply;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ListView;
import androidx.appcompat.widget.Toolbar;
import com.obwhatsapp.yo.ColorStore;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;
import com.obwhatsapp.youbasha.ui.YoSettings.BaseSettingsActivity;
import java.util.ArrayList;

public class ListMessages extends Activity {

    /* renamed from: d  reason: collision with root package name */
    public static final int f667d = 0;

    /* renamed from: a  reason: collision with root package name */
    public ListView f668a;

    /* renamed from: b  reason: collision with root package name */
    public SQLiteAdapter f669b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f670c;

    public void a() {
        String str = "ۗۚۤ۠ۦۢ۟ۨ۬ۘ۬ۨۥۙۙۗۗۡ۫";
        while (true) {
            switch ((str.hashCode() ^ 3) ^ 247407206) {
                case -2049331386:
                    str = "۟ۙ۠ۨۚۘۘ۫۟ۥۘ۬ۥۚۖۤۥۘۤ۟ۧۚ۬ۖۖ۟ۜ۬ۖۤ";
                    break;
                case -1310821523:
                    this.f668a.setAdapter(new c(this));
                    str = "ۦۨۜۧۚۡۤۤ۠ۚۧ۫ۨ۟ۨ";
                    break;
                case -1170131526:
                    return;
                case -1099547545:
                    new c(this).notifyDataSetChanged();
                    str = "ۡۜ۟ۡۢۨۘۨۥۢ۠ۖۧۦۨۦۘۘ۠ۥ";
                    break;
            }
        }
    }

    public void attachBaseContext(Context context) {
        String str = "ۤۙۢۗۘۧۘ۟ۚۥۚۦۥ۬ۢۛ۟ۛۛ۬ۗۘۘ۠ۧۥ";
        while (true) {
            switch ((str.hashCode() ^ 504) ^ -744777863) {
                case -1172765494:
                    str = "ۗ۟ۥۘ۟ۧ۬ۡۡۘۗ۠ۨۘۜۘ۟ۛ۠ۢ۟۠۫۠ۦۘۘ۫ۘۦۘ";
                    break;
                case -781332194:
                    return;
                case 679059404:
                    str = "ۦۜۧۘۗۛۙۖۘ۬ۚۦۧۙۦۘ۠۠ۚ۬ۗ۟۠۫۟";
                    break;
                case 1807566671:
                    super.attachBaseContext(yo.getCtx());
                    str = "ۡۘۛۢ۬۠ۘۥۡۘۨ۫۟۠ۨ۟۫ۚ۟";
                    break;
            }
        }
    }

    public void b() {
        try {
            this.f670c = new ArrayList();
            this.f669b.open();
            this.f670c = this.f669b.ii();
            this.f669b.close();
        } catch (Exception e2) {
        }
    }

    public void onCreate(Bundle bundle) {
        String str = "ۦۗۡۜ۫ۘۘ۬ۤۡ۫ۦۨۘۧ۠ۘۘۗ۬ۜۜۛۘۘ";
        SQLiteAdapter sQLiteAdapter = null;
        Toolbar toolbar = null;
        while (true) {
            switch ((str.hashCode() ^ 872) ^ -490863739) {
                case -2079715744:
                    b();
                    str = "۬۟ۛۢۡۤ۫ۚ۟ۘۡ۫ۨۧۡۤۥۗۙ۟ۗۦ۫ۗ";
                    break;
                case -1883243924:
                    return;
                case -1847148104:
                    this.f669b.close();
                    str = "ۖۥۘۘۤ۬ۥۘۛۡۜ۟۬ۜۘۨۙۥۘۧۙ۬";
                    break;
                case -961185643:
                    toolbar.setNavigationOnClickListener(new o(0, this));
                    str = "ۙۚۖۢۡۥۘ۫ۚۡۘۜۛۡۘۗۢۜۧ۟ۢۦۢۘۙ۫ۨ۬ۜۙ";
                    break;
                case -860023768:
                    BaseSettingsActivity.configToolbar(toolbar, this);
                    str = "ۥ۬ۨۘۥۜ۬ۡۢۖۘۡۘۥۥۙۘۨۚۦ۫ۤ۟";
                    break;
                case -753266795:
                    str = "۫ۦۤۢۘۨۡ۫ۜۧۤۙۜۘۜۗۤ۫ۖ۫ۨۘۤۦ۬ۨۛ";
                    break;
                case -665348215:
                    this.f669b = sQLiteAdapter;
                    str = "ۤۖ۟۟ۨۗ۟ۦۘۘ۠ۥۜۘۡۡ۫ۤۙۦ۫ۙۨۧۨۥۙۛ۫";
                    break;
                case -240305994:
                    this.f668a = (ListView) findViewById(yo.getID("list_Scheduler", "id"));
                    str = "ۚ۟ۜۘۖۙۥۘۗۗۦۘ۟ۦۦ۟ۡ۫ۧۦۡۘ۟۬ۗۦ۬ۘ";
                    break;
                case -72181220:
                    ((ImageView) findViewById(yo.getID("add_schedule", "id"))).setOnClickListener(new o(1, this));
                    str = "ۗۥ۬ۛۖۨۘۢ۟۫ۜۦۥۙۦۨۘ";
                    break;
                case 40230968:
                    setContentView(yo.getID("autoscheduler_list", "layout"));
                    str = "ۨۥۙ۟ۜۖۘۤ۫ۗۜۧۢ۬ۤۜۤ۠ۡۘ";
                    break;
                case 210223471:
                    super.onCreate(bundle);
                    str = "۟ۛۘۘۢۧۦۥۢۧۥۨۘۘۛ۠ۢ";
                    break;
                case 342861572:
                    toolbar.setTitle((CharSequence) yo.getString("msg_scheduler_title"));
                    str = "ۥۡۖۘۢۖ۟ۘۖۥۖۦۧۘۘۧۤۡۧۢ";
                    break;
                case 619869385:
                    a();
                    str = "ۧۚۜۥۖۛ۬۟ۨ۫ۜۚۡۘۘ۠۠ۤ۠۠ۥۘۚۤ";
                    break;
                case 874862122:
                    str = "ۦۨۨۢۛۖۨ۟ۢۨۜۨ۠ۦ۬ۜۘ";
                    break;
                case 1276689853:
                    sQLiteAdapter.open();
                    str = "ۦۢۚۢۥۦ۠۠ۤۜۧ۬ۗۤۘۘۨ۫ۘۘۤۧۘ۠ۚۗۦۗۘ";
                    break;
                case 1353183774:
                    sQLiteAdapter = new SQLiteAdapter(getApplicationContext());
                    str = "۟ۙ۬۟ۖۢۧۗۘ۫ۜۤۦۖۘ";
                    break;
                case 1580622712:
                    str = "ۡ۫ۜۖۜۨۡۚ۫ۛ۫۟۟ۦۤ۬ۢ۫ۖۤۚۤۤ۬";
                    toolbar = (Toolbar) findViewById(others.getID("acjtoolbar", "id"));
                    break;
                case 2043431023:
                    toolbar.setTitleTextColor(ColorStore.getPrimaryTextColor());
                    str = "ۜۦۧۘۧۗۦۘۘۡۗۦۘ۟۟ۖۚۨ۟ۖۧۖۘۛۢۖۘ۟ۥۘ";
                    break;
                case 2105144574:
                    q();
                    str = "ۗۨۥۛۧ۟ۚۜۡ۫ۢۨۘۨ۠ۘۡۥۛۗۖۘ";
                    break;
            }
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem menuItem = null;
        String str = "ۧ۟ۗۨۡۗۦۚۢۧۘۘۥۨۦۘۨۖۨۗۛ";
        while (true) {
            switch ((str.hashCode() ^ 698) ^ -706564583) {
                case -1923379737:
                    others.menuItemColor(menuItem);
                    str = "ۢۚۢۡۡۢ۫ۨۢۡ۠ۧۖ۠";
                    break;
                case -1719311871:
                    menuItem = menu.add(yo.getString("delete_all"));
                    str = "ۗۡۗۗۙۜۘۛۚۖۦۤۦۘۢۨۨۨۘۜۘ۬ۚۗۥ";
                    break;
                case -52749774:
                    str = "۠ۤۨۛۡۖ۬۟ۜۙۗۨۚۨۘۘۗ۫ۜ۟ۜۜ";
                    break;
                case 72536419:
                    super.onCreateOptionsMenu(menu);
                    str = "ۜۢۥۧۡۥۚ۠ۛۗۨۖۘ۟ۥۚ۬ۚۜۘ";
                    break;
                case 468624621:
                    menuItem.setIcon(yo.getID("ic_delete_sweep_white_24dp", "drawable")).setOnMenuItemClickListener(new n(this, 0)).setShowAsAction(2);
                    str = "ۛۨۡۘۡۡۘۘ۠ۨۥۜ۬۬ۚۛ";
                    break;
                case 703580902:
                    return true;
                case 901413649:
                    str = "ۘ۟ۜ۫ۥۖۘۜۡ۫ۙۚۦۘۡۙ";
                    break;
            }
        }
    }

    public void onResume() {
        String str = "ۦۥۨۘۛۡۜۥۚۜۘۥ۬ۜۘۨۚۡۘ۟ۦ۫ۙ۟ۜۘ";
        while (true) {
            switch ((str.hashCode() ^ 698) ^ -1204107648) {
                case -1098932776:
                    str = "ۛۧۖۘۢۦ۬ۤۦۛ۟۠ۜۛۥ۠ۚۘۗ۟ۚۛۛۗۨ";
                    break;
                case 1581956322:
                    b();
                    str = "ۧۡ۬ۜۖۚۦۜۥۘۙ۠۠ۖۘۙ";
                    break;
                case 1747593359:
                    a();
                    str = "ۡۜۥۜۨۧۙۖۢۧ۠ۥۘۘۦۘۖ۬ۦ۬۫ۖۘۥۜ۠ۡۥ۟";
                    break;
                case 1994910467:
                    return;
                case 2135353041:
                    super.onResume();
                    str = "ۘ۫ۚۘۘ۟ۜۖۜۖ۟ۘۘۗۦۨۧ۫۫ۖۢۦۘۤۨۛ";
                    break;
            }
        }
    }

    public void q() {
        String str = "ۛۚۡۙ۬ۖۘ۠۫ۜۜۚۜ۬۟ۗ";
        while (true) {
            switch ((str.hashCode() ^ 413) ^ 347788203) {
                case -984279108:
                    return;
                case -836009066:
                    str = "ۥ۫ۦۖۡۧۚۧ۠ۛۜۜۖۦۙ";
                    break;
                case -16841347:
                    getApplicationContext().getPackageManager().setComponentEnabledSetting(new ComponentName(getApplicationContext(), Receiver.class), 1, 1);
                    str = "ۛۜۜۘۛۜ۬۟ۙ۠ۙ۟ۘۘ۬ۨۘۖۖۨۤۤ";
                    break;
                case 497753779:
                    ((AlarmManager) getSystemService("alarm")).setInexactRepeating(0, System.currentTimeMillis(), 60000, PendingIntent.getBroadcast(this, Receiver.REQUEST_CODE, new Intent(getApplicationContext(), Receiver.class), 134217728));
                    str = "ۖۨۜۗۗ۠ۙۖ۠ۗۥۧ۟۫ۧۖۧ۫";
                    break;
            }
        }
    }
}
