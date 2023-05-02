package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3H0  reason: invalid class name */
public class AnonymousClass3H0 implements AnonymousClass5S8 {
    public final C16980tz A00;

    public AnonymousClass3H0(C16980tz r1) {
        this.A00 = r1;
    }

    public Intent AG2(List list, int i2) {
        String str = (i2 == 1 || i2 == 4) ? "image/png" : "video/mp4";
        ArrayList A0u = AnonymousClass000.A0u();
        for (int i3 = 0; i3 < list.size(); i3++) {
            C85274Nu r8 = (C85274Nu) list.get(i3);
            Bundle A0D = C13690nt.A0D();
            A0D.putString("story_media_caption", r8.A04);
            A0D.putParcelable("story_media_uri", r8.A02);
            A0D.putInt("story_media_video_length_sec", r8.A01);
            A0D.putDouble("story_media_aspect_ratio", r8.A00);
            if (r8.A05 != null) {
                A0D.putString("story_media_link_url", r8.A05);
            }
            A0u.add(A0D);
        }
        Intent putParcelableArrayListExtra = C13680ns.A09().setAction("com.facebook.stories.ADD_TO_STORY").setPackage("com.facebook.katana").putExtra("com.facebook.platform.extra.APPLICATION_ID", "994766073959253").putExtra("editing_disabled", true).setType(str).putParcelableArrayListExtra("media_list", A0u);
        List<ResolveInfo> queryIntentActivities = this.A00.A00.getPackageManager().queryIntentActivities(putParcelableArrayListExtra, AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED);
        if (queryIntentActivities == null || queryIntentActivities.size() == 0) {
            return null;
        }
        return putParcelableArrayListExtra;
    }

    public boolean AJs() {
        Intent A02 = C13700nu.A02("com.facebook.stories.ADD_TO_STORY");
        A02.setPackage("com.facebook.katana");
        A02.setType("image/png");
        Context context = this.A00.A00;
        try {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(A02, AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED);
            if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
                return false;
            }
            try {
                return Integer.parseInt(context.getPackageManager().getPackageInfo("com.facebook.katana", 0).versionName.split("\\.")[0]) >= 227;
            } catch (Exception e2) {
                Log.w("Cannot get FB version number", e2);
                return false;
            }
        } catch (Exception unused) {
            return false;
        }
    }
}
