package X;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;

/* renamed from: X.0rR  reason: invalid class name and case insensitive filesystem */
public class C15570rR {
    public final Context A00;

    public C15570rR(Context context) {
        this.A00 = context;
    }

    public final boolean A00(int i2) {
        boolean z2 = false;
        if (Build.VERSION.SDK_INT >= 19) {
            z2 = true;
        }
        if (z2) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.A00.getSystemService("appops");
                if (appOpsManager != null) {
                    appOpsManager.checkPackage(i2, "com.google.android.gms");
                    return true;
                }
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            } catch (SecurityException unused) {
                return false;
            }
        } else {
            String[] packagesForUid = this.A00.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid != null) {
                for (String equals : packagesForUid) {
                    if ("com.google.android.gms".equals(equals)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
