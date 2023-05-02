package com.obwhatsapp.youbasha.ui.YoSettings;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import c.d;
import com.joom.paranoid.Deobfuscator$app$Custom;
import com.obwhatsapp.yo.CustomAlertDialogBuilder;
import com.obwhatsapp.yo.g;
import com.obwhatsapp.yo.shp;
import com.obwhatsapp.yo.x;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.app;
import com.obwhatsapp.youbasha.filechooser.ChooserDialog;
import com.obwhatsapp.youbasha.ui.themeserver.OnThemesActivity;
import java.io.File;
import m.l;

public class Themes extends BaseSettingsActivity {
    public static String newFMThemes_folder;

    /* renamed from: b  reason: collision with root package name */
    public final File f1217b = new File(newFMThemes_folder);

    static {
        StringBuilder sb = null;
        String str = "ۗۧۘ۠ۥۛ۫ۙۤۥۨ۬ۢۙۜۢۤۡ";
        while (true) {
            switch ((str.hashCode() ^ 982) ^ 405744868) {
                case -1611928510:
                    return;
                case -811932856:
                    newFMThemes_folder = sb.toString();
                    str = "ۤ۟ۚۡ۠ۡ۠ۧۡۘۤۜۙۦۚۦۛۗۛۜۖ۫ۥ۫ۘۛ۫ۦۘ";
                    break;
                case -658174170:
                    sb.append("/OBThemes/");
                    str = "ۦۜۚۚۜ۠ۚۨۡۡۚۘۘۥۘ۟";
                    break;
                case 877820713:
                    sb = new StringBuilder();
                    str = "ۥۢۦۡ۬ۦۘ۠۫ۨۜۙ۟ۡۚۡۘ۫۫ۘۘ";
                    break;
                case 1631167689:
                    sb.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
                    str = "ۤۗۜۢۡ۬ۡۘۖۘۘ۫ۢۥۤۥ";
                    break;
            }
        }
    }

    public void deleteAllThemes(View view) {
        String str = "ۚۚۖ۫ۜۦۘۜۤۨۘۗۛۚۦۘۢ";
        while (true) {
            switch ((str.hashCode() ^ 370) ^ -1742808094) {
                case -1770133767:
                    str = "ۘۜۚ۫ۨۖۙۚ۫ۚۗۛۦ۟ۨۙۦۜۘۚۨۘ";
                    break;
                case -717965061:
                    return;
                case 1671701689:
                    new CustomAlertDialogBuilder(this).setTitle((CharSequence) yo.getString(Deobfuscator$app$Custom.getString(-33164083166657L))).setPositiveButton(17039379, (DialogInterface.OnClickListener) new d(this, 14)).setNegativeButton(17039369, (DialogInterface.OnClickListener) new x(20)).show();
                    str = "ۜۥۡۘۤ۟ۘ۫ۚۙۨۗۗۢۢۨۘ";
                    break;
                case 2107762011:
                    str = "ۢ۠ۛ۫ۙۛۡۥۥۘۥۡۡۡۦۖۘۜۢۖۘۧۡۖۘ";
                    break;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        TextView textView = null;
        String str = "ۢۗۥۘۢۤۜۘ۠ۜۧۛۛۘۘ۬ۗۡۘ۠ۛۦۜۡۡۘ۬۠۟ۧ۟ۨ";
        while (true) {
            switch ((str.hashCode() ^ 606) ^ 1972277499) {
                case -1456362925:
                    textView.setText(yo.getString(Deobfuscator$app$Custom.getString(-31914247683521L), new String[]{newFMThemes_folder}));
                    str = "ۚۙ۬ۘۜۦۘۛۤۜۘۡۛ۫ۧ۠ۦ۠ۤۡۨۖۦۤۢ";
                    break;
                case -1434280456:
                    return;
                case -1398339030:
                    str = "۟ۙ۟ۘۤۖۘۘۘۗ۬۬ۛ۠ۖ";
                    textView = (TextView) findViewById(yo.getID(Deobfuscator$app$Custom.getString(-31879887945153L), Deobfuscator$app$Custom.getString(-31901362781633L)));
                    break;
                case -1240429024:
                    str = "۫۫ۥ۟۫ۖۛۤۖۧۚۚ۬۠ۦ";
                    break;
                case -274717914:
                    super.onCreate(bundle);
                    str = "ۚۤۛۧ۟ۚۙۢۖۘۙۙۖۘۢۤۘۘۧۨۥۘ۟۫ۗۡۙۛۖۥۤ";
                    break;
                case 109975414:
                    str = "ۖۛۡۘۦۛۨۘۖۡۡۘۢ۠ۨۗۡۦۘ";
                    break;
                case 637713356:
                    setContentView(yo.getID(Deobfuscator$app$Custom.getString(-31759628860865L), Deobfuscator$app$Custom.getString(-31849823174081L)));
                    str = "ۛ۠ۧۚ۫ۜۚۜۖۢۘۘۜۜۘ۠ۦۖ";
                    break;
                case 1167555080:
                    String str2 = "ۗۖۤۤۥ۟ۡۚۦ۟ۚۚ۟ۙۖۘۚۚۦۘ۬ۧۤ۫ۘۙ";
                    while (true) {
                        switch (str2.hashCode() ^ 703746161) {
                            case -2096386146:
                                str = "ۚۙ۬ۘۜۦۘۛۤۜۘۡۛ۫ۧ۠ۦ۠ۤۡۨۖۦۤۢ";
                                continue;
                            case 502127981:
                                if (textView == null) {
                                    str2 = "ۢ۫۟۠ۚۙۨ۠ۘۘۚۙۛۦۡۥ";
                                    break;
                                } else {
                                    str2 = "ۥۜ۟ۦۥۧ۫ۤۥۨۥۛۥۤۨۢۢۥۢۖۘۘۖۦۜۘۨۚ";
                                    break;
                                }
                            case 788820465:
                                str2 = "ۦۚۢۖۤ۫ۧۗۦۘ۟۟ۥۘۖۥ۬ۘۨۨۢ۠ۨۘ";
                                break;
                            case 1577823804:
                                str = "ۖۘ۟۟۟ۖۧۙۤ۠ۜۛۛۘۖۘۦۖۙۜۗۙۧۧۜۘ";
                                continue;
                        }
                    }
                    break;
            }
        }
    }

    public void theme_download(View view) {
        String str = "ۦۤۗ۬ۗۨۢۛۧ۫ۤۛۡۦۨۡۛۖۘ";
        while (true) {
            switch ((str.hashCode() ^ 828) ^ 1870800408) {
                case -1384138013:
                    str = "ۥ۠ۚ۫ۢۦۘۡۛۦۘۛ۬۫ۥۘۗ";
                    break;
                case -966961502:
                    str = "ۢۖ۬۬ۘۖۜۨۜۛۖۦۘۨۤ۟ۨۙۗۧۨۥۘۙۨ۠ۢۥ۠";
                    break;
                case 59002714:
                    str = "ۖ۫ۚۨۘۧ۫ۖۚۢۗۢۚۘۘۚۖۘۚۨۥۘ۠ۨ۠ۧ۫ۜۘ";
                    break;
                case 409526794:
                    return;
                case 537069284:
                    startActivity(new Intent(this, OnThemesActivity.class));
                    str = "۟ۖۜۙۜۨۘۦۛۜ۬ۛۜۘۚۙۡۜۚۘۘ";
                    break;
                case 850945121:
                    String str2 = "ۚۙ۫ۧۙۥۘۛۗۦ۬ۧ۟ۧ۟ۢۧۘۙ";
                    while (true) {
                        switch (str2.hashCode() ^ 714009442) {
                            case -569119960:
                                str = "ۥۖۛۨۛۥۘ۠ۤۗۤۨۘۖۙۨۘۘۡ۟ۘۦ";
                                continue;
                            case -319696247:
                                str = "۠ۚۜۦ۠ۤۚۢۨ۫ۜۘۤ۠ۘۧۚۚۚۧ۬ۥۗۢۛ۫";
                                continue;
                            case 734969165:
                                str2 = "ۡ۠۟ۢۥۚ۫۬ۡۘ۬ۚۜ۬ۡ۠ۧ۟ۧۦۗۚۦۙ۬ۡۥۡ";
                                break;
                            case 2030438059:
                                if (!app.checkInternetNow()) {
                                    str2 = "ۨ۟۬ۙۢ۟ۢۛۘ۫ۡۨۘ۫ۢۦ";
                                    break;
                                } else {
                                    str2 = "ۚۖۤۙۛۙ۟ۜۛۘۨۜۘۜۛ۠۠ۦۦۘ۠۠ۜۛۖۙۧۙۡ";
                                    break;
                                }
                        }
                    }
                    break;
                case 2091646943:
                    Toast.makeText(this, yo.getString(Deobfuscator$app$Custom.getString(-32013031931329L)), 0).show();
                    str = "ۢۖ۬۬ۘۖۜۨۜۛۖۦۘۨۤ۟ۨۙۗۧۨۥۘۙۨ۠ۢۥ۠";
                    break;
            }
        }
    }

    public void theme_load(View view) {
        String str = "ۜۤۘۘۚ۬ۦۙۖۨۘۢ۟ۡۘۗۥۘۨۛۥۘۥۢۨ۫ۙۥ";
        while (true) {
            switch ((str.hashCode() ^ 650) ^ 2059538661) {
                case -2077533696:
                    str = "ۦۖ۟۫ۜۥ۠ۚۖۧۦۥ۠ۜۜۡۤ۫ۧۙۜۛۘۜ";
                    break;
                case -338584683:
                    new ChooserDialog().with(this).withFilterRegex(false, false, Deobfuscator$app$Custom.getString(-32086046375361L)).withStartFile(Environment.getExternalStorageDirectory().getPath()).withChosenListener(new g(this, 2)).build().show();
                    str = "۬۟ۥۧ۫ۚۖۨۖۙۦۥۘ۟ۡ۠ۧ۠ۧ۟ۤ۠ۡۛ۟ۚۜۛ";
                    break;
                case 226975971:
                    str = "ۨۚ۫ۧۗۤۖ۠ۢۘۘۗۨۡۘۛ۫ۚۗۘۢ۠۟ۦ۠ۚ۟";
                    break;
                case 2018749072:
                    return;
            }
        }
    }

    public void theme_reset(View view) {
        String str = "۠ۥۢۗ۟ۡۘۗۛ۫ۤۦۜۡۖۗ۫ۜۘ";
        while (true) {
            switch ((str.hashCode() ^ 608) ^ -2029251098) {
                case -1975538753:
                    return;
                case -1061441806:
                    str = "۟ۢۨۘۚۢۖۘ۟۠ۨۘۙۙۥۗ۬ۡۦ۟ۡۘ۠ۡۥۘۡۜۖۢۦۙ";
                    break;
                case -928562070:
                    new CustomAlertDialogBuilder(this).setTitle((CharSequence) yo.getString(Deobfuscator$app$Custom.getString(-32992284474817L))).setMessage((CharSequence) yo.getString(Deobfuscator$app$Custom.getString(-33069593886145L))).setPositiveButton(17039379, (DialogInterface.OnClickListener) new x(21)).setNegativeButton(17039369, (DialogInterface.OnClickListener) new x(22)).show();
                    str = "ۖۥۥ۫ۥۙۛۘۘۥۧۧ۬ۘۘ";
                    break;
                case -887401835:
                    str = "ۨ۬۠ۢۘۧۜ۬ۥ۫۫ۡۘۚۨۥۛۦۗ";
                    break;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Cloneable, java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ff, code lost:
        r0 = "۠ۜۙۙ۟ۢۘۘ۟ۚۖ۫ۥۧۚ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0008, code lost:
        r4 = r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void theme_restore(android.view.View r10) {
        /*
            r9 = this;
            r8 = 1
            r2 = 0
            java.lang.String r0 = "ۚۢۘۨۛۥۘ۬ۙ۠ۗۦۨۘۜۥۖۘۢۨۖۘۙۦۧۜۘ"
            r1 = r2
            r3 = r2
            r4 = r2
            r5 = r2
        L_0x0008:
            int r2 = r0.hashCode()
            r6 = 763(0x2fb, float:1.069E-42)
            r7 = 1984197300(0x764472b4, float:9.9611E32)
            r2 = r2 ^ r6
            r2 = r2 ^ r7
            switch(r2) {
                case -1109838050: goto L_0x0050;
                case -1054439290: goto L_0x0070;
                case -1003334259: goto L_0x001d;
                case -686992052: goto L_0x0023;
                case -685792474: goto L_0x00eb;
                case -526503631: goto L_0x0107;
                case -347210372: goto L_0x001a;
                case 39591829: goto L_0x008d;
                case 143266621: goto L_0x0030;
                case 178510000: goto L_0x0103;
                case 235185757: goto L_0x009a;
                case 524229704: goto L_0x0017;
                case 1173804667: goto L_0x00aa;
                case 1298168952: goto L_0x00a3;
                default: goto L_0x0016;
            }
        L_0x0016:
            goto L_0x0008
        L_0x0017:
            java.lang.String r0 = "ۢۚۜۗۙۦۘۚۜۚۚۨۚ۬ۢۙۚۖۘۘ"
            goto L_0x0008
        L_0x001a:
            java.lang.String r0 = "ۥۥۖۨ۬ۨۤۘۦۘۤ۠ۜۘۥ۠ۥۘ۫ۧۘ"
            goto L_0x0008
        L_0x001d:
            java.io.File r2 = r9.f1217b
            java.lang.String r0 = "ۢۥۧۘۜۦۥۢۥۖۛ۟ۙۡ۫۬ۚۗۦ۬ۘ۟"
            r5 = r2
            goto L_0x0008
        L_0x0023:
            com.obwhatsapp.yo.h0 r0 = new com.obwhatsapp.yo.h0
            r0.<init>(r8)
            java.lang.String[] r2 = r5.list(r0)
            java.lang.String r0 = "۟ۤۖۢۨۜۚۥ۬ۧۛۜۘ۬ۦۧۘۘۛۦۜ۠ۘ۬ۤۦۘ"
            r4 = r2
            goto L_0x0008
        L_0x0030:
            r2 = -562071969(0xffffffffde7f765f, float:-4.60200125E18)
            java.lang.String r0 = "ۖۛۨۛۦۘۗ۠ۥۨ۠ۨۘ۟ۚۥۘۢۧۨۖ۫۬۫ۡۗ"
        L_0x0035:
            int r6 = r0.hashCode()
            r6 = r6 ^ r2
            switch(r6) {
                case -1740638623: goto L_0x003e;
                case -1685275240: goto L_0x004d;
                case 1012402325: goto L_0x00ff;
                case 1765797562: goto L_0x0044;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x0035
        L_0x003e:
            java.lang.String r0 = "ۛۦۛۙۤۖ۟ۚۛۦۖۨۘ۬ۛۛ"
            goto L_0x0035
        L_0x0041:
            java.lang.String r0 = "۫ۨۧۘۚۨ۟ۙۚۥۙۥۛ۫ۛۢ۟۠ۨ۟ۦۚۚۜۗۤۗۦۘ"
            goto L_0x0035
        L_0x0044:
            boolean r0 = r5.exists()
            if (r0 == 0) goto L_0x0041
            java.lang.String r0 = "۬۬ۡۘۚۡۢۡۜۘۤۛۗۨۖۡۘۗۤۜۦۘ۫ۧۤۖۘۗۦۢ"
            goto L_0x0035
        L_0x004d:
            java.lang.String r0 = "ۡۧۡۘۖۚۨۘۨۥۢۤۗۦۦۖۖۘ"
            goto L_0x0008
        L_0x0050:
            r2 = -1148865537(0xffffffffbb85b3ff, float:-0.004080295)
            java.lang.String r0 = "ۖۤۚ۠ۥۙۢۨۦ۟ۦۛۨ۟۫ۖ۬۫"
        L_0x0055:
            int r6 = r0.hashCode()
            r6 = r6 ^ r2
            switch(r6) {
                case 795280656: goto L_0x00ff;
                case 1295173346: goto L_0x0064;
                case 1317216926: goto L_0x006d;
                case 1667007757: goto L_0x005e;
                default: goto L_0x005d;
            }
        L_0x005d:
            goto L_0x0055
        L_0x005e:
            java.lang.String r0 = "ۘۢۘۚۛ۟ۖۛ۫۫ۡۡۘۛۗۖۘ"
            goto L_0x0055
        L_0x0061:
            java.lang.String r0 = "ۚۘۘ۫ۤۖۢ۬ۛۧۘۦۤۜۘۘ۫۬ۜۙ۬ۖۘۙۖۤ۠ۦۥۘ"
            goto L_0x0055
        L_0x0064:
            boolean r0 = r5.isDirectory()
            if (r0 == 0) goto L_0x0061
            java.lang.String r0 = "ۛۦۨۘۤۗۘۘۖۙ۫ۥۗۛۥۦۖۘ"
            goto L_0x0055
        L_0x006d:
            java.lang.String r0 = "ۤ۬ۖۘۘۘۡۘۖۢۘۘ۟ۖۗۙ۬ۙۡۖۥۘ۟ۤۗ۠ۧۗۗۗۢ"
            goto L_0x0008
        L_0x0070:
            r2 = -617478943(0xffffffffdb3204e1, float:-5.010791E16)
            java.lang.String r0 = "ۡۗۛ۫ۢۨۗۨۨ۠ۜۘ۟ۦۙ"
        L_0x0075:
            int r6 = r0.hashCode()
            r6 = r6 ^ r2
            switch(r6) {
                case -1727131296: goto L_0x007e;
                case -1428812188: goto L_0x0086;
                case -1092893486: goto L_0x00ff;
                case -33345251: goto L_0x0089;
                default: goto L_0x007d;
            }
        L_0x007d:
            goto L_0x0075
        L_0x007e:
            if (r4 == 0) goto L_0x0083
            java.lang.String r0 = "ۚۚۨۘۖۦۙ۫۫ۙۨۖ۠ۙۖۡۚۚۡ۟ۙۜۘ۬ۙۥۘ"
            goto L_0x0075
        L_0x0083:
            java.lang.String r0 = "۠ۦۤۨۡۡ۫ۥۚ۠۟۠ۨۘ۬ۘۧۘۗ۬ۖۘ۫ۢ۟ۧۡۦ"
            goto L_0x0075
        L_0x0086:
            java.lang.String r0 = "ۖۜۛۙ۫۬ۡۡۖۙۗۡۡ۫"
            goto L_0x0075
        L_0x0089:
            java.lang.String r0 = "۠۟ۢۗۛۧۨۦۘ۠ۤۖۘ۬ۙۚۗ۫ۧ۠"
            goto L_0x0008
        L_0x008d:
            android.widget.ArrayAdapter r2 = new android.widget.ArrayAdapter
            r0 = 17367046(0x1090006, float:2.5162943E-38)
            r2.<init>(r9, r0, r4)
            java.lang.String r0 = "ۘۖۛ۟ۨ۠ۘۥۖۤۨۥۘۥۜۧۦۚۜۘ۫۫۬"
            r3 = r2
            goto L_0x0008
        L_0x009a:
            android.widget.Spinner r1 = new android.widget.Spinner
            r1.<init>(r9)
            java.lang.String r0 = "۬ۜۗۧۖۧ۠۠ۧۥۜۧۡۦ۟ۛۥۚۥ۟ۖۘۨۛۥۘۗ۬ۨۘ"
            goto L_0x0008
        L_0x00a3:
            r1.setAdapter(r3)
            java.lang.String r0 = "ۢۗۥۘۤۙ۠۟ۧۘۘ۫ۚۥ۬ۚ۠ۦۜ۠ۨۚۜۧۧ۫۠۠ۨۘ"
            goto L_0x0008
        L_0x00aa:
            com.obwhatsapp.yo.CustomAlertDialogBuilder r0 = new com.obwhatsapp.yo.CustomAlertDialogBuilder
            r0.<init>(r9)
            r6 = -32713111600577(0xffffe23f629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r6)
            com.obwhatsapp.yo.CustomAlertDialogBuilder r0 = r0.setTitle((java.lang.CharSequence) r2)
            com.obwhatsapp.yo.CustomAlertDialogBuilder r0 = r0.setView((android.view.View) r1)
            r6 = -32794715979201(0xffffe22c629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r6)
            java.lang.String r2 = com.obwhatsapp.yo.yo.getString((java.lang.String) r2)
            m.m r6 = new m.m
            r7 = 0
            r6.<init>(r9, r4, r1, r7)
            com.obwhatsapp.yo.CustomAlertDialogBuilder r0 = r0.setPositiveButton((java.lang.CharSequence) r2, (android.content.DialogInterface.OnClickListener) r6)
            r2 = 17039360(0x1040000, float:2.424457E-38)
            com.obwhatsapp.yo.x r6 = new com.obwhatsapp.yo.x
            r7 = 24
            r6.<init>(r7)
            com.obwhatsapp.yo.CustomAlertDialogBuilder r0 = r0.setNegativeButton((int) r2, (android.content.DialogInterface.OnClickListener) r6)
            r0.show()
            java.lang.String r0 = "ۚۚۗ۫ۙۨ۬ۤ۬۬ۙۦۚۢۢۜۙۨۦۦۘ"
            goto L_0x0008
        L_0x00eb:
            r6 = -32859140488641(0xffffe21d629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r6)
            android.widget.Toast r0 = android.widget.Toast.makeText(r9, r0, r8)
            r0.show()
            java.lang.String r0 = "ۢۖۨۘۜۤۡۤۥۛۜۦۤۛۨ۬ۢ۟۟ۘۜۙ۫ۨۘ"
            goto L_0x0008
        L_0x00ff:
            java.lang.String r0 = "۠ۜۙۙ۟ۢۘۘ۟ۚۖ۫ۥۧۚ"
            goto L_0x0008
        L_0x0103:
            java.lang.String r0 = "ۢۖۨۘۜۤۡۤۥۛۜۦۤۛۨ۬ۢ۟۟ۘۜۙ۫ۨۘ"
            goto L_0x0008
        L_0x0107:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.YoSettings.Themes.theme_restore(android.view.View):void");
    }

    public void theme_save(View view) {
        try {
            boolean z2 = shp.getBoolean(Deobfuscator$app$Custom.getString(-32352334347713L));
            File file = new File(newFMThemes_folder);
            String str = "ۗۛۨۘۚۤۚۨ۬ۡۘۚۦۡۤۙۜۘۚۤۛ۠۫ۧ";
            while (true) {
                switch (str.hashCode() ^ -1393584389) {
                    case -1184566336:
                        file.mkdir();
                        break;
                    case 164113057:
                        if (!file.exists()) {
                            str = "۫ۢۤۥ۬ۜۘ۬ۛۘۢۛۤ۟ۜۘۙۨۨۙۧۗۖۜۨۘ";
                            break;
                        } else {
                            str = "ۛ۫ۛۨۛۡۘۧۛۖۥۘۛۚ۬ۙۡ۬ۧۖۙۨۥۢۖۧ";
                            continue;
                        }
                    case 328913332:
                        str = "ۥۤۦۘۤ۫ۘۘۨۖۧۘۢۨۥۘۤۙ۟ۢۙ۬";
                        continue;
                    case 1960776920:
                        break;
                    default:
                        continue;
                }
            }
            EditText editText = new EditText(this);
            editText.setHint(Deobfuscator$app$Custom.getString(-32399578987969L));
            new CustomAlertDialogBuilder(this).setTitle((CharSequence) Deobfuscator$app$Custom.getString(-32403873955265L)).setView((View) editText).setPositiveButton(17039370, (DialogInterface.OnClickListener) new l(this, editText, z2)).setNegativeButton(17039360, (DialogInterface.OnClickListener) new x(23)).show();
        } catch (SecurityException e2) {
            Toast.makeText(this, yo.getString(Deobfuscator$app$Custom.getString(-32519838072257L)), 0).show();
        } catch (Exception e3) {
        }
    }
}
