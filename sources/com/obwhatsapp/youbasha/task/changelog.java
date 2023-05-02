package com.obwhatsapp.youbasha.task;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.AssetManager;
import android.view.View;
import android.webkit.WebView;
import com.joom.paranoid.Deobfuscator$app$Custom;
import com.obwhatsapp.yo.CustomAlertDialogBuilder;
import com.obwhatsapp.yo.x;
import com.obwhatsapp.yo.yo;
import java.io.InputStream;

public class changelog {

    /* renamed from: a  reason: collision with root package name */
    public final String f1106a = Deobfuscator$app$Custom.getString(-20532584349121L);

    public changelog(Activity activity) {
        String str = "ۚۤۢۜۦۤۗۢۛ۠ۢۘۨۚۜۥۗ۫ۗۨۥۙۛ";
        while (true) {
            switch (str.hashCode() ^ 2119283628) {
                case -1302329613:
                    if (utils.isArabic()) {
                        str = "ۜۚۦۖۚۦۡ۬ۦۚۘۖۧۛۥۜۢۨۦۨۥۘ";
                        break;
                    } else {
                        str = "۫۬ۘۡۦۖۘۢۚۢۖ۬ۙۢۨۘ";
                        continue;
                    }
                case 632683633:
                    str = "ۨۛۦۥۘۤ۟ۖۦۗۦۜۦۥۦۘۢۥۜۘۘۦ۫ۧۖۥۘۦۖۥۘ";
                    continue;
                case 785915898:
                    this.f1106a = Deobfuscator$app$Custom.getString(-20536879316417L);
                    break;
                case 1856605815:
                    break;
            }
        }
        try {
            CustomAlertDialogBuilder customAlertDialogBuilder = new CustomAlertDialogBuilder(activity);
            customAlertDialogBuilder.setTitle((CharSequence) yo.getString(Deobfuscator$app$Custom.getString(-20554059185601L)));
            WebView webView = new WebView(activity);
            AssetManager assets = yo.getCtx().getAssets();
            InputStream open = assets.open(Deobfuscator$app$Custom.getString(-20609893760449L) + this.f1106a + Deobfuscator$app$Custom.getString(-20652843433409L));
            byte[] bArr = new byte[open.available()];
            open.read(bArr);
            open.close();
            String str2 = new String(bArr);
            String str3 = "ۧ۟ۡۘۥۛۜۗۨۨۘۤۜۤۢۛۛ۬ۘۘ";
            while (true) {
                switch (str3.hashCode() ^ 831372635) {
                    case -1052707956:
                        str3 = "ۤۡۤۚ۠ۨۨۧۨۧۥۘۨۤۦۘ";
                        continue;
                    case 11700261:
                        if (yo.isNightModeActive()) {
                            str3 = "ۘۖۦ۠ۢ۠ۛ۬ۡ۫۬ۖۗۤۙۗۧۘۖ۬ۤ";
                            break;
                        } else {
                            str3 = "ۙ۫ۖۧ۟ۤ۬ۨۘۢۗۨۙۘۨۘ";
                            continue;
                        }
                    case 1812372961:
                        str2 = str2.replace(Deobfuscator$app$Custom.getString(-20678613237185L), Deobfuscator$app$Custom.getString(-20712972975553L)).replace(Deobfuscator$app$Custom.getString(-20747332713921L), Deobfuscator$app$Custom.getString(-20781692452289L));
                        break;
                    case 1818543925:
                        break;
                    default:
                        continue;
                }
            }
            webView.loadDataWithBaseURL((String) null, str2, Deobfuscator$app$Custom.getString(-20824642125249L), Deobfuscator$app$Custom.getString(-20867591798209L), (String) null);
            customAlertDialogBuilder.setView((View) webView);
            customAlertDialogBuilder.setNegativeButton(17039370, (DialogInterface.OnClickListener) new x(13));
            customAlertDialogBuilder.show();
        } catch (Exception e2) {
        }
    }
}
