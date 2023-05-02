package com.obwhatsapp.yo;

import a.a;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.Toast;
import com.obwhatsapp.youbasha.task.YTranslate;
import com.obwhatsapp.youbasha.task.utils;
import com.obwhatsapp.youbasha.ui.YoSettings.UniversalStyle;
import java.io.File;

public final /* synthetic */ class o implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final int f834a;

    /* renamed from: b  reason: collision with root package name */
    public final String f835b;

    public /* synthetic */ o(int i2, String str) {
        this.f834a = i2;
        this.f835b = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        String str = null;
        String str2 = "ۘۡۘۤۚۚ۫ۨۘۘۚ۠ۦۘ۬ۤۢۛۢۨۘ۠ۥۦ";
        int i3 = 0;
        while (true) {
            switch ((str2.hashCode() ^ 34) ^ -595022630) {
                case -1965773993:
                case -249741929:
                case 102970788:
                    return;
                case -1848331780:
                    str = this.f835b;
                    str2 = "ۗۡۚۧۥ۠ۦ۠ۘۘۗۡۗۢۙۜۘ";
                    break;
                case -1633477035:
                    shp.setStringPriv("font", "Custom (Load font)");
                    str2 = "۟ۦۥۘۙۛ۟۬ۖۖۘۢۤ۫ۨۥۥۤۡۧ";
                    break;
                case -1214679262:
                    String str3 = UniversalStyle.f1224h;
                    str2 = "۟ۗۦۘۦۢۦۤۛۧۜ۟۟ۛۤۜۚۜۜۘ";
                    break;
                case -866954548:
                    str2 = "ۢۙۘۖۤۜۘۚۧۥۜۨۨۘۧ۟ۛ";
                    break;
                case -647056462:
                    str2 = "ۙۨۨۘۤ۬۬ۙۧۦۧ۫ۖۚۚ۬ۘۛۨ";
                    break;
                case -573930209:
                    ((ClipboardManager) yo.getCtx().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text", str));
                    str2 = "ۚۥۗۖۢۨۘۦۚۖۘۘۦۛ۠ۙ۠ۗۛ۟ۚ۟ۜۚۤ";
                    break;
                case 13377116:
                    str2 = "ۖ۬ۛۘۖۧۘۜ۬ۖۘۜۥۛۡ۫ۖۘۙ۬ۧۥۤ";
                    break;
                case 60676997:
                    int i4 = Conversation.f512a;
                    str2 = "ۡ۟ۢۛۢۤۘۗۗۧۖۡۘۛۘۢۛ۫ۡۨۢۤۜۢ۫";
                    break;
                case 314446132:
                    int i5 = tf.f107a;
                    str2 = "ۢ۟ۖۘۗۘۤ۠۬ۧۨۡۨۜۡۧۡۜ۟ۖۡۛۨۙ";
                    break;
                case 688474237:
                    utils.copyFile(str, new File(a.f(new StringBuilder(), yo.datafolder, "files/customFont")).getPath());
                    str2 = "ۛ۬ۘۘۦۛۧۨۗۨۤۥۦۖۖۘۥۘۨۘۦۚۜۘۘۗ۬ۡۚۨ";
                    break;
                case 1111553228:
                    a.i("message_copied", (Context) YTranslate.f1100a.get(), 0);
                    str2 = "ۜ۠ۛ۟۟۟ۧۧۢۖ۠ۡ۫ۡ۟۫ۦۖ۬ۛ۠ۘۦ۟";
                    break;
                case 1335907904:
                    str2 = "ۘۖۗ۠ۙۢۖۡۨ۬ۜۚۗۚۤ";
                    break;
                case 1341374636:
                    switch (i3) {
                        case 0:
                            str2 = "ۨۥ۟ۖۢۥۘ۠ۗۥۚۜۥۘ۬ۢۙۨۥۘۘۘۙۦۤ";
                            break;
                        case 1:
                            str2 = "ۡۖۧۡ۫ۧۖ۫ۥۚۗۤۙۜ۟";
                            break;
                        default:
                            str2 = "ۖ۬ۧۨۤۘ۬ۜۖۘۗۘۗ۠ۥ۬۟ۦ۫ۤۢۖۘۙۥۦۘ";
                            break;
                    }
                case 1582216323:
                    i3 = this.f834a;
                    str2 = "ۜۖۖۘ۠ۗۛۘۧۥۜۘۗۧۦۖۘۦۡۦ۟ۙۦۤۥۚۢۚۦ";
                    break;
                case 1594464706:
                    ((ClipboardManager) yo.getCtx().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text", str));
                    str2 = "ۧ۠ۢۜ۬ۙۛ۟ۙۥۘۧ۟ۢۧۖ۫ۢۜۘۘ";
                    break;
                case 1732853734:
                    Toast.makeText(Conversation.f515d, yo.getString("link_copied"), 0).show();
                    str2 = "ۦۚۧۘۜۨۦۘۖۧۧۥۚۚۦۡۖۘ";
                    break;
                case 2002319448:
                    yo.rebootYo();
                    str2 = "ۤۛۦۘۧۧۘۗ۫ۦۤۗ۠ۤۧۚ";
                    break;
            }
        }
    }
}
