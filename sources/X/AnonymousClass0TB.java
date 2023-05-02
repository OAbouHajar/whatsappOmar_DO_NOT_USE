package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* renamed from: X.0TB  reason: invalid class name */
public class AnonymousClass0TB {
    public static final String A00 = C06530Wm.A01("PackageManagerHelper");

    public static void A00(Context context, Class cls, boolean z2) {
        String str = "enabled";
        try {
            PackageManager packageManager = context.getPackageManager();
            String name = cls.getName();
            ComponentName componentName = new ComponentName(context, name);
            int i2 = 2;
            if (z2) {
                i2 = 1;
            }
            packageManager.setComponentEnabledSetting(componentName, i2, 1);
            C06530Wm A002 = C06530Wm.A00();
            String str2 = A00;
            StringBuilder A0q = AnonymousClass000.A0q(name);
            A0q.append(" ");
            String str3 = "disabled";
            if (z2) {
                str3 = str;
            }
            A002.A02(str2, AnonymousClass000.A0h(str3, A0q));
        } catch (Exception e2) {
            C06530Wm A003 = C06530Wm.A00();
            String str4 = A00;
            StringBuilder A0o = AnonymousClass000.A0o();
            A0o.append(cls.getName());
            A0o.append("could not be ");
            if (!z2) {
                str = "disabled";
            }
            String A0h = AnonymousClass000.A0h(str, A0o);
            if (A003.A00 <= 3) {
                Log.d(str4, A0h, e2);
            }
        }
    }
}
