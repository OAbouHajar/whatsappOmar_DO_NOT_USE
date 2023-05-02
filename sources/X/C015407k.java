package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;

/* renamed from: X.07k  reason: invalid class name and case insensitive filesystem */
public final class C015407k {
    public static String A00(ComponentName componentName, Context context) {
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 640;
        if (i2 >= 29) {
            i3 = 269222528;
        } else if (i2 >= 24) {
            i3 = 787072;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i3);
        String str = activityInfo.parentActivityName;
        if (str == null) {
            Bundle bundle = activityInfo.metaData;
            str = null;
            if (!(bundle == null || (string = bundle.getString(NavUtils.PARENT_ACTIVITY)) == null)) {
                if (string.charAt(0) != '.') {
                    return string;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(context.getPackageName());
                sb.append(string);
                return sb.toString();
            }
        }
        return str;
    }
}
