package com.obwhatsapp.youbasha.task;

import android.content.DialogInterface;
import android.os.AsyncTask;
import c.d;
import com.joom.paranoid.Deobfuscator$app$Custom;
import com.obwhatsapp.yo.CustomAlertDialogBuilder;
import com.obwhatsapp.yo.shp;
import com.obwhatsapp.yo.x;
import com.obwhatsapp.yo.yo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

public class devMsg extends AsyncTask<Void, Void, Void> {

    /* renamed from: c  reason: collision with root package name */
    public static final int f1107c = 0;

    /* renamed from: a  reason: collision with root package name */
    public int f1108a;

    /* renamed from: b  reason: collision with root package name */
    public String f1109b;

    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        String str = "۫ۛۖۘۗۢۘۧۘۘۛ۫ۘۘۨۜۧۨۢ۟ۛ۫ۦۡۨۘۘۤ۠";
        while (true) {
            switch ((str.hashCode() ^ 400) ^ 931898192) {
                case -1252603426:
                    return doInBackground((Void[]) objArr);
                case -1194407376:
                    str = "۫ۛۡۘۛ۟ۡ۟ۗ۬ۚ۠ۨۗۗۖۤۘ۫ۤۡ۠";
                    break;
                case -804747893:
                    str = "ۜۖۦۘۡۦ۠ۘۦۡۘۨ۬ۘۢۨۦۙۘۜۘۦۘۘۚۗۜۘۢۖۨ";
                    break;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.net.URL, java.lang.String] */
    public Void doInBackground(Void... voidArr) {
        ? r0;
        try {
            String readLine = new BufferedReader(new InputStreamReader(new URL(utils.dbsf(r0, 2)).openStream())).readLine();
            String str = "ۖ۠ۜۘۛۖۖۤۨۘ۠ۙۢۧۙۙۨۤۛۥۘ۠ۗۧ";
            while (true) {
                switch (str.hashCode() ^ 854042963) {
                    case -1961057652:
                        return null;
                    case -2653112:
                        if (readLine == null) {
                            str = "ۛ۟ۙ۠ۦ۠ۖۖۘۘ۫ۛۦۘۙۗۤ";
                            break;
                        } else {
                            str = "ۢۥۡۘۛۦ۫ۤۢ۠ۧۡۘ۟ۢۖۡۧۚۜۨۜ";
                            break;
                        }
                    case 1731536630:
                        String str2 = "ۘ۫ۙ۬ۧ۫ۢۡ۬ۜۨۦ۫ۘۢ۟ۗ";
                        while (true) {
                            switch (str2.hashCode() ^ -327947262) {
                                case -1157180524:
                                    if (readLine.length() <= 1) {
                                        str2 = "ۙۛۦۘ۬ۘۧ۬۟ۥ۠ۗۦۘۦ۠۫ۧۛۡۘۤۖۗۜۤۚ";
                                        break;
                                    } else {
                                        str2 = "ۗۖ۠ۢۘۘۙۙۡۥ۟ۦ۬ۙۜۘ۫ۤ";
                                        break;
                                    }
                                case -1107402441:
                                    return null;
                                case -498203970:
                                    JSONObject jSONObject = new JSONObject(readLine);
                                    this.f1108a = jSONObject.getInt(Deobfuscator$app$Custom.getString(-21241253952961L));
                                    this.f1109b = jSONObject.getString(Deobfuscator$app$Custom.getString(-21258433822145L));
                                    return null;
                                case -10058996:
                                    str2 = "ۤۡۦۜۤۚۤ۬ۦۡ۬ۖۘ۬ۙۖ۫ۛۨۛ۠۫ۚ۟ۖ";
                                    break;
                            }
                        }
                        break;
                    case 1746903198:
                        str = "۫ۜۛۦ۟ۦۨ۠ۦۦۙۡۚۦۢۤۘۨۘۤۡۧۘ";
                        break;
                }
            }
        } catch (IOException | JSONException e2) {
            return null;
        }
    }

    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        String str = "ۜۨۨۘ۫۠ۘۖۖۖۥ۠۠ۥۦۚۢۨۤۨ۫ۨۦ۠ۦ";
        while (true) {
            switch ((str.hashCode() ^ 223) ^ 422279687) {
                case -1994055341:
                    onPostExecute((Void) obj);
                    str = "۟ۨۖۘ۫ۡۘۦۛۢۢۡۡۘۘۜۦ۬ۦ۠ۗۖۦ۟ۦ۬۫ۜۗ";
                    break;
                case -416951840:
                    return;
                case 95401658:
                    str = "ۨۢۙۘۢۜۘۤ۫ۖۧۗۖۘۗۥۜۘۖ۬۠۫ۦۧۘ۬ۨ۠";
                    break;
                case 583193996:
                    str = "ۚۥۧۘ۬ۚۦۘ۫ۥۧۖ۬ۗ۠۟ۜۘ";
                    break;
            }
        }
    }

    public void onPostExecute(Void voidR) {
        try {
            int intPriv = shp.getIntPriv(Deobfuscator$app$Custom.getString(-21279908658625L));
            String str = "۫۟ۨۘۜ۫ۡۘۖ۫ۦۘۖۤۥۘ۬ۘۛۡۤ۬۟ۢۦۛۙۖ";
            while (true) {
                switch (str.hashCode() ^ -252197407) {
                    case -25082572:
                        String str2 = this.f1109b;
                        String str3 = "ۡۢۦۨۦۘۦ۫ۘۘۤۘۖۘ۟ۗۗۛۡۚۦۡۖ۫۫ۦۘ";
                        while (true) {
                            switch (str3.hashCode() ^ -1338497255) {
                                case -470030535:
                                    str3 = "ۡۦۥۗ۫ۦۚۤۘۘۨۗۗۙۘۥۘۥۧۧۜ۬ۖ۬۫ۨۘ";
                                    break;
                                case -153084639:
                                    return;
                                case 1651909815:
                                    String[] split = str2.split(Deobfuscator$app$Custom.getString(-21309973429697L));
                                    CustomAlertDialogBuilder customAlertDialogBuilder = new CustomAlertDialogBuilder(yo.Homeac);
                                    customAlertDialogBuilder.setCancelable(false).setTitle((CharSequence) Deobfuscator$app$Custom.getString(-21318563364289L)).setMessage((CharSequence) split[this.f1108a - 1]).setPositiveButton(17039370, (DialogInterface.OnClickListener) new d(this, 10)).setNegativeButton((CharSequence) Deobfuscator$app$Custom.getString(-21481772121537L), (DialogInterface.OnClickListener) new x(14));
                                    String str4 = "ۤۖ۠۬ۗۡۥۥۨۛ۟۫ۜۡۗ";
                                    while (true) {
                                        switch (str4.hashCode() ^ 1811238994) {
                                            case -1915361223:
                                                if (yo.Homeac.isFinishing()) {
                                                    str4 = "ۢ۟ۚۘ۠ۗۥۜۖۨۢۜۡۛۜۘۘۖ۫";
                                                    break;
                                                } else {
                                                    str4 = "ۖ۠ۥۧۥۨۖۗۛۙۧۙ۫ۘ۬ۚۚۙۘ۟";
                                                    break;
                                                }
                                            case -1562246996:
                                                customAlertDialogBuilder.create();
                                                customAlertDialogBuilder.show();
                                                return;
                                            case 467060208:
                                                return;
                                            case 1162107539:
                                                str4 = "ۛۗۢۙۢۨۘۛۛۢۨۥۧۜ۟ۨ";
                                                break;
                                        }
                                    }
                                    break;
                                case 1959176657:
                                    if (str2 == null) {
                                        str3 = "ۡۨۢ۫ۘۡۘۛۙۜۘۗۘۗۡۜ";
                                        break;
                                    } else {
                                        str3 = "ۢۖۙ۟ۙۜۘۗۤ۠ۗۨۖۗۦۤۤۙۥۘۤۚۖۜۤۥ۬۟ۘۘ";
                                        break;
                                    }
                            }
                        }
                        break;
                    case 81761536:
                        str = "۫ۜۥۘۜۖۘۘۚۢ۬۟ۗ۬ۜ۫۟ۧ۫ۛ";
                        break;
                    case 1768625061:
                        return;
                    case 1780248000:
                        if (this.f1108a <= intPriv) {
                            str = "ۜۖۛۚۚۡۘۤۚۛۙۘۛۤۛۢ۫ۜۡۘ";
                            break;
                        } else {
                            str = "ۗۜۖ۠ۤ۫۬ۗۨۘۦۖۖۘۖ۟ۤۡ۫ۛۦ۬۠";
                            break;
                        }
                }
            }
        } catch (Exception e2) {
        }
    }
}
