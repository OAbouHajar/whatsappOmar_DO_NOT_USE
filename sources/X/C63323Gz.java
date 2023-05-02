package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3Gz  reason: invalid class name and case insensitive filesystem */
public class C63323Gz implements AnonymousClass5S8 {
    public final C16980tz A00;

    public C63323Gz(C16980tz r1) {
        this.A00 = r1;
    }

    public Intent AG2(List list, int i2) {
        if (!(i2 == 7 || i2 == 6)) {
            String str = i2 == 1 ? "image/png" : i2 != 3 ? "*/*" : "video/mp4";
            String str2 = "com.facebook.lite.composer.activities.ShareIntentMultiPhotoAlphabeticalAlias";
            if (!(i2 == 4 || i2 == 1)) {
                str2 = "com.facebook.lite.composer.activities.ShareIntentVideoAlphabeticalAlias";
            }
            ArrayList A0u = AnonymousClass000.A0u();
            JSONArray jSONArray = new JSONArray();
            for (int i3 = 0; i3 < list.size(); i3++) {
                JSONObject A0J = C13700nu.A0J();
                C85274Nu r11 = (C85274Nu) list.get(i3);
                Uri uri = r11.A02;
                try {
                    A0J.put("story_media_caption", r11.A04);
                    A0J.put("story_media_uri", uri.toString());
                    A0J.put("story_media_video_length_sec", r11.A01);
                    A0J.put("story_media_aspect_ratio", r11.A00);
                    A0J.put("story_media_link_url", r11.A05);
                    jSONArray.put(A0J.toString());
                    A0u.add(uri);
                } catch (JSONException e2) {
                    Log.w("liteposter/json", e2);
                }
            }
            Intent putExtra = C13680ns.A09().setType(str).setPackage("com.facebook.lite").setComponent(new ComponentName("com.facebook.lite", str2)).addFlags(268435456).putExtra("com.facebook.platform.extra.APPLICATION_ID", "994766073959253").putExtra("editing_disabled", true).putExtra("media_list", jSONArray.toString());
            if (list.size() == 1) {
                putExtra.setAction("android.intent.action.SEND").putExtra("android.intent.extra.STREAM", ((C85274Nu) list.get(0)).A02);
            } else if (list.size() > 1) {
                putExtra.setAction("android.intent.action.SEND_MULTIPLE").putParcelableArrayListExtra("android.intent.extra.STREAM", A0u);
            }
            List<ResolveInfo> queryIntentActivities = this.A00.A00.getPackageManager().queryIntentActivities(putExtra, AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED);
            if (queryIntentActivities == null || queryIntentActivities.size() == 0) {
                return null;
            }
            return putExtra;
        }
        return null;
    }

    public boolean AJs() {
        Intent A09 = C13680ns.A09();
        A09.setPackage("com.facebook.lite").setType("image/png").setComponent(new ComponentName("com.facebook.lite", "com.facebook.lite.composer.activities.ShareIntentMultiPhotoAlphabeticalAlias"));
        Context context = this.A00.A00;
        try {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(A09, AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED);
            if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
                return false;
            }
            try {
                return Integer.parseInt(context.getPackageManager().getPackageInfo("com.facebook.lite", 0).versionName.split("\\.")[0]) >= 91;
            } catch (Exception e2) {
                Log.w("Cannot get FBLite version number", e2);
                return false;
            }
        } catch (Exception unused) {
            return false;
        }
    }
}
