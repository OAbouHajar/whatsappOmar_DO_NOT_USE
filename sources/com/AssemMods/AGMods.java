package com.AssemMods;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.widget.Toast;
import com.obwhatsapp.yo.shp;
import com.obwhatsapp.yo.yo;
import java.io.File;

public class AGMods {

    /* renamed from: h  reason: collision with root package name */
    public static boolean f190h;

    public static boolean A0C(File file) {
        Context ctx = yo.getCtx();
        if (!abu3rab_media_video()) {
            return false;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(file.getAbsolutePath()), "video/*");
            intent.addFlags(268435456);
            yo.getCtx().startActivity(intent);
            printLog("customVideoPlayer/[played]/");
            return true;
        } catch (Exception e2) {
            printLog("customVideoPlayer/error/" + e2.getMessage());
            Toast.makeText(yo.getCtx(), yo.getString("abu3rab_video_play"), 0).show();
            return true;
        }
    }

    public static void A0U(String str, String str2) {
        Log.e("Auto = " + str, str2);
    }

    public static boolean abu3rab_media_video() {
        return shp.getBoolean("abu3rab_media_video_player", false);
    }

    public static int getDocSendLimit(int i2) {
        return shp.getBoolean("key_more_docs_send", true) ? 100 : 1;
    }

    public static int getImgShareLimit(int i2) {
        return shp.getBoolean("Img_share_limit", true) ? 100 : 1;
    }

    public static void printLog(String str) {
        if (str != null) {
            A0U("MyApp", str);
        }
    }
}
