package X;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.view.ViewConfiguration;

/* renamed from: X.0Q7  reason: invalid class name */
public class AnonymousClass0Q7 {
    public Context A00;

    public AnonymousClass0Q7(Context context) {
        this.A00 = context;
    }

    public int A00() {
        Configuration configuration = this.A00.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600) {
            return 5;
        }
        if (i2 < 500) {
            return i2 > 480 ? i3 > 640 ? 4 : 3 : i2 >= 360 ? 3 : 2;
        }
    }

    public boolean A01() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.A00).hasPermanentMenuKey();
    }
}
