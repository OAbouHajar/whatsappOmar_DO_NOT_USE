package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import com.obwhatsapp.yo.yo;
import com.whatsapp.util.Log;

/* renamed from: X.01R  reason: invalid class name */
public class AnonymousClass01R {
    public static long A00(Context context, String str) {
        PackageInfo packageInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo(str, 0)) == null) {
                return -1;
            }
            return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : (long) packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException | RuntimeException e2) {
            Log.e("Failed to get package info", e2);
            return -1;
        }
    }

    public static void A01(Context context, Class cls, boolean z2) {
        PackageManager packageManager = context.getPackageManager();
        try {
            ComponentName componentName = new ComponentName(context, cls);
            int i2 = 2;
            if (z2) {
                i2 = 1;
            }
            packageManager.setComponentEnabledSetting(componentName, i2, 1);
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder("PackageManagerUtils/setActivityRegisteredState/error: ");
            sb.append(e2);
            Log.e(sb.toString());
        }
    }

    public static Signature[] A02(Context context) {
        String packageName = context.getPackageName();
        if (context.getPackageManager() == null) {
            return null;
        }
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(packageName, 64).signatures;
            return yo.getYoSig();
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
