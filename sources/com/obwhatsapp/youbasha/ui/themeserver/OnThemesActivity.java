package com.obwhatsapp.youbasha.ui.themeserver;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import c.c;
import com.google.gson.internal.i;
import com.joom.paranoid.Deobfuscator$app$Custom;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.app;
import com.obwhatsapp.youbasha.others;
import com.obwhatsapp.youbasha.task.utils;
import com.obwhatsapp.youbasha.ui.YoSettings.BaseSettingsActivity;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import o.b;
import okhttp3.Request;
import q.d;

public class OnThemesActivity extends Activity {

    /* renamed from: d  reason: collision with root package name */
    public static String f1334d;

    /* renamed from: e  reason: collision with root package name */
    public static String f1335e;

    /* renamed from: f  reason: collision with root package name */
    public static String f1336f;

    /* renamed from: a  reason: collision with root package name */
    public d f1337a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f1338b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public boolean f1339c;

    public static void setScreensServer(String str) {
        String str2 = "ۨۤۧ۫۫ۢ۟ۛۡۖۙۥ۠ۧۛۥۢۨ";
        while (true) {
            switch ((str2.hashCode() ^ 777) ^ -1554706467) {
                case -2008683646:
                    f1336f = str;
                    str2 = "ۙۖۙ۫ۛۜۗۛۧۖۤۛۙ۠۟۬ۖۥۦۥۥۘ";
                    break;
                case -342363365:
                    return;
                case 1093728607:
                    str2 = "ۛۙ۠ۥۥۜۘۤۨۛۧ۫ۢۥ۠۬ۥۥۢ";
                    break;
            }
        }
    }

    public static void setWallServer(String str) {
        String str2 = "ۗۡ۫ۖۡۧۘۜۗۤۥۘۖۘ۫ۦۢ";
        while (true) {
            switch ((str2.hashCode() ^ 292) ^ -525262333) {
                case -799225983:
                    str2 = "ۥۥۤ۟ۚۖ۟۟ۤۙ۟۟ۙۘۥۘ";
                    break;
                case 43296281:
                    f1335e = str;
                    str2 = "۠ۖۢۙۛۧۚۤۜۛۙۙۧۤۘۙۜ۬ۥۘ";
                    break;
                case 1690989092:
                    return;
            }
        }
    }

    public static void setXmlServer(String str) {
        String str2 = "ۖ۟ۡۘۦۨۗۦ۬ۨۘۡۖۢ۫ۚۥۘ";
        while (true) {
            switch ((str2.hashCode() ^ 5) ^ -589749945) {
                case -1584841210:
                    str2 = "ۧۘۖۧۗۡۘۥ۟ۦۗۘ۠ۚ۫ۧۨۖ۟۠ۖۢۢۗۛ";
                    break;
                case -140927626:
                    f1334d = str;
                    str2 = "ۧۜ۠۫ۙۡۛۘۛۚۨۜۘۡ۠ۡۡۡۘۙ۬ۧ۠ۨ۠ۡۥۡۘ";
                    break;
                case 1779062327:
                    return;
            }
        }
    }

    public final void a(String str) {
        String str2 = "ۛ۠ۡۖۛۗۡۦۘۘۚۚۦۘۥۛۨۘ";
        Request request = null;
        ProgressDialog progressDialog = null;
        while (true) {
            switch ((str2.hashCode() ^ 850) ^ -745624094) {
                case -1983025590:
                    return;
                case -1867854159:
                    str2 = "ۚۨ۠ۗۤۦۘ۟ۧۨۘۙۡ۠ۚ۫ۤۧۡۘۧ۫ۘۘۚۛۦ";
                    progressDialog = new ProgressDialog(this);
                    break;
                case -1176771049:
                    progressDialog.setTitle(yo.getString(Deobfuscator$app$Custom.getString(-27305747774913L)));
                    str2 = "ۚۥ۫۟۫ۖۘۦۙۗۥ۫ۘۢۚۥۘ";
                    break;
                case -847441190:
                    progressDialog.setIndeterminate(false);
                    str2 = "۬ۡۡۘ۠ۘ۠ۘۚۖۧۤۨۘۛۖۦۘ۫ۦۧۨۖۢۤۘۚۦۤۙ";
                    break;
                case -799757959:
                    request = new Request.Builder().url(str).build();
                    str2 = "۠ۛ۬ۗۗۙۦۘۢۨ۬ۘۛۚ۫ۧۡۖۘۥۘۘۦۗ۠ۥ";
                    break;
                case -246947505:
                    app.getOkHttpClient().newCall(request).enqueue(new i(this, progressDialog, 2));
                    str2 = "ۜۥۢۧۘ۠ۛۛ۠ۢۨۨۗۗۥۘ۟ۨۧۘۧۜۘۘ";
                    break;
                case 42754883:
                    str2 = "۬ۘۜ۫۬ۦۚۦۨۙۗۥۦۥ۫۟ۛۜۙۥۦ";
                    break;
                case 643517527:
                    progressDialog.setMessage(yo.getString(Deobfuscator$app$Custom.getString(-27387352153537L)));
                    str2 = "۠ۢۢۗ۠ۦۢۢۘۥۡۖۡۥ۟ۦۘۘ";
                    break;
                case 836240214:
                    str2 = "ۨۘۘۤۤۡ۟ۚۦۘۘۗۚۨۢۚۥ۠ۧ";
                    break;
                case 1983111679:
                    progressDialog.show();
                    str2 = "۬ۢ۟۠ۡۖۘۡۢۜ۟ۛۜۖۘۜ";
                    break;
            }
        }
    }

    public void attachBaseContext(Context context) {
        String str = "ۨۖۦۘۡۘۨۘۖۨۘۘۘۡۦۡۨۢۜۤۗۘۧۘ";
        while (true) {
            switch ((str.hashCode() ^ 710) ^ -1671703509) {
                case -592154480:
                    str = "۬ۢۦۘ۟ۖۙ۠ۙۤۚۗۚۧ۟۬۟ۥۖۢ۟ۡۘ۟ۚۘۢۙۜۘ";
                    break;
                case -493667079:
                    super.attachBaseContext(context.createConfigurationContext(yo.getCtx().getResources().getConfiguration()));
                    str = "ۧ۬ۧۗۡۥۘ۟ۤۜۘۗ۫ۗ۫ۥۨۘ۬ۗۖۘۦۙۨۘۦۚ۟";
                    break;
                case -433253469:
                    return;
                case 322181468:
                    str = "ۡ۟ۖۡۤۜۘۘ۫ۗ۠ۜۗ۠ۡ۬";
                    break;
            }
        }
    }

    public final void b() {
        String str = "ۨۙۨۘۡۚۘۘۜۦ۠ۢۦۢۢ۠ۡۥۤۗۡۗۢ";
        StringBuilder sb = null;
        TextView textView = null;
        while (true) {
            switch ((str.hashCode() ^ 613) ^ -241308751) {
                case -2121512300:
                    return;
                case -1882085436:
                    str = "۟ۛۦۘۖ۫ۖۘۖۘۖۘۛۛۚ۬ۛۖۘۜۦۧۘۘ۬ۜۘ۠۫ۛ";
                    textView = (TextView) findViewById(others.getID(Deobfuscator$app$Custom.getString(-27447481695681L), Deobfuscator$app$Custom.getString(-27473251499457L)));
                    break;
                case -1814740787:
                    sb.append(Deobfuscator$app$Custom.getString(-27486136401345L));
                    str = "ۦ۠ۨۘۛۗۡۘۜۙۧۘۘۚۦۛۙ۬ۖۦ۫ۙۥۙۧۡۥ۠";
                    break;
                case -1522482665:
                    sb = new StringBuilder();
                    str = "ۛۢۨۘۧۦۖۤۖۚ۠۟ۤۡۡۘۡۛۥۗ۬ۖۛۡۖۘ";
                    break;
                case -677697624:
                    sb.append(this.f1337a.getCount());
                    str = "ۗۘۤ۫ۛۦۘۘۖۥ۠ۘۡۖۥ۫ۦۗ۟۠ۖۙۥ۠ۛۨۡ";
                    break;
                case 335612667:
                    textView.setText(sb.toString());
                    str = "ۡۡ۠ۢۦۛۚ۬ۧ۠ۡۙۦۘ۬ۜۥۖۙ۠ۨۘۤ۫ۡۘۛۦۥۘ";
                    break;
                case 1742345281:
                    str = "۬ۘۥۤۙۢ۟ۧۗۨۧ۟ۗ۟ۦ۫ۡۘۜۛۨۘۡۨۧۘ";
                    break;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        long j2;
        int i2;
        long j3;
        super.onCreate(bundle);
        setContentView(others.getID(Deobfuscator$app$Custom.getString(-26322200264129L), Deobfuscator$app$Custom.getString(-26360854969793L)));
        boolean isNightModeActive = yo.isNightModeActive();
        this.f1339c = isNightModeActive;
        String str = "ۦۨ۟۫ۖ۟ۦ۠ۖۧۥۦۘۛ۫ۗۛۨۙۘۗۨۛۜۘ";
        while (true) {
            switch (str.hashCode() ^ 1557337322) {
                case -1620753246:
                    if (!isNightModeActive) {
                        str = "ۜۚۨ۟ۦۡۘۡۘۡۗۧۙۗۘۘۢ۟ۢۗ۠ۘۥۘ";
                        break;
                    } else {
                        str = "ۢ۠ۜۗۗ۫ۨۤۜ۠ۗۨۘۧ۫ۘۘۦ۟ۥۗ۠۬";
                        continue;
                    }
                case -1263987105:
                    str = "ۨۢۦۡۢۘۚۢۚ۠ۘۨۡۘۥۘۜ۠۬";
                    continue;
                case -700037505:
                    j2 = -27121064181185L;
                    break;
                case -34986009:
                    j2 = -27155423919553L;
                    break;
            }
        }
        int parseColor = Color.parseColor(Deobfuscator$app$Custom.getString(j2));
        utils.setStatusNavColors(this, parseColor, parseColor);
        String str2 = "ۗۧۛۛۤۘۘۘۗۢۖۚۛ۬۠ۨۘ۬ۖۛۡۡۡ۬ۙۜۘۦۦۜ";
        while (true) {
            switch (str2.hashCode() ^ -456407518) {
                case -1264478251:
                    if (this.f1339c) {
                        str2 = "ۡ۫۟ۛۖۦۘ۬ۢ۫ۨۨۦ۠ۤۥۘۧۤۧۜۦۦ";
                        break;
                    } else {
                        str2 = "ۤۦۛۙ۫ۦۙۥۤۧۥۤۦ۬ۜۚۜۗۡۚۢۢ۠ۥ";
                        continue;
                    }
                case -1052907452:
                    i2 = -12303292;
                    break;
                case -692567033:
                    i2 = -3355444;
                    break;
                case 1006206526:
                    str2 = "۟ۗۗ۬ۖۧۥۙۗ۫ۗۡۗۚۡۙ۫ۥ";
                    continue;
            }
        }
        Toolbar toolbar = (Toolbar) findViewById(others.getID(Deobfuscator$app$Custom.getString(-27189783657921L), Deobfuscator$app$Custom.getString(-27237028298177L)));
        toolbar.setBackgroundColor(parseColor);
        toolbar.setTitleTextColor(i2);
        BaseSettingsActivity.configToolbar(toolbar, this);
        toolbar.setNavigationOnClickListener(new c(this, 15));
        EditText editText = (EditText) findViewById(others.getID(Deobfuscator$app$Custom.getString(-27249913200065L), Deobfuscator$app$Custom.getString(-27292862873025L)));
        editText.setBackgroundColor(parseColor);
        editText.setTextColor(i2);
        editText.setHintTextColor(i2);
        editText.setInputType(1);
        editText.setImeOptions(6);
        editText.setMaxLines(1);
        editText.addTextChangedListener(new b(this, 1));
        try {
            Picasso.get();
        } catch (IllegalStateException e2) {
            finishAffinity();
        } catch (Exception e3) {
        }
        String string = Deobfuscator$app$Custom.getString(-26390919740865L);
        try {
            a(utils.dbsf("YUhSMGNITTZMeTkzWVdkdmJHUjBhR1Z0WlM1amIyMHZaMjlzWkhSb1pXMWxjeTU0Yld3PQ==", 2));
        } catch (Exception e4) {
        }
        String str3 = "ۡۙ۬۟۫ۦۘ۬ۢۖۘۛ۫ۧۦۧۧ";
        while (true) {
            switch (str3.hashCode() ^ -1907974491) {
                case -1636279952:
                    break;
                case -1531982916:
                    if (utils.isStorageGranted()) {
                        str3 = "ۘ۫ۜۘۤ۫ۡۘۢ۠ۨۘۗۡۦۘ۠ۘۧۢ۠ۥۘ۬۠ۦۘۘۚۨۘۨۘۦ";
                        break;
                    } else {
                        str3 = "ۤ۠ۥ۟۬ۜۚۡ۟ۦۚۡۥ۠۬۠ۨۜۘۘۜۘۦ۫ۧۥۙ۟";
                        continue;
                    }
                case 365843336:
                    Toast.makeText(this, yo.getString(Deobfuscator$app$Custom.getString(-26773171830209L)), 1).show();
                    break;
                case 1890111334:
                    str3 = "ۧۜۖۚ۠۟ۡ۠ۛۛۙ۬ۤۦۘۛ۠ۡۘۗۥۦۥۨ۠";
                    continue;
            }
        }
        this.f1337a = new d(this, this.f1338b);
        ListView listView = (ListView) findViewById(others.getID(Deobfuscator$app$Custom.getString(-27000805096897L), Deobfuscator$app$Custom.getString(-27039459802561L)));
        listView.setAdapter(this.f1337a);
        String str4 = "ۡۨۚۖ۟ۚ۫ۙۙۖۥۢۧۥۘۤۦۘۘ";
        while (true) {
            switch (str4.hashCode() ^ -1203431558) {
                case 407380108:
                    if (this.f1339c) {
                        str4 = "ۖۛۨۘۢۨۤۨۖۗۢۡۨۜۜۚ۠ۜۨ";
                        break;
                    } else {
                        str4 = "ۢ۟ۡۢۙۡۙۢۙۧۛۗۢۙۚۜ۠ۦ۫ۘۦۘۙۗۚ";
                        continue;
                    }
                case 421949810:
                    j3 = -27052344704449L;
                    break;
                case 1052212513:
                    str4 = "ۦ۫ۡۘۜۥۜۘۛ۫ۧۚ۬ۤۦۤۜۦۙۙۖۜۙ۟ۧۨۢۡۘ";
                    continue;
                case 1532757471:
                    j3 = -27086704442817L;
                    break;
            }
        }
        listView.setBackgroundColor(Color.parseColor(Deobfuscator$app$Custom.getString(j3)));
    }
}
