package android.support.v4.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;

public class ActivityCompat extends ContextCompat {
    public static boolean invalidateOptionsMenu(Activity activity) {
        if (Build.VERSION.SDK_INT < 11) {
            return false;
        }
        ActivityCompatHoneycomb.invalidateOptionsMenu(activity);
        return true;
    }

    public static void startActivity(Activity activity, Intent intent, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            ActivityCompatJB.startActivity(activity, intent, bundle);
        } else {
            activity.startActivity(intent);
        }
    }

    public static void startActivityForResult(Activity activity, Intent intent, int i2, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            ActivityCompatJB.startActivityForResult(activity, intent, i2, bundle);
        } else {
            activity.startActivityForResult(intent, i2);
        }
    }
}
