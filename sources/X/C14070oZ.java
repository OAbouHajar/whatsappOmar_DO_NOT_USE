package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0oZ  reason: invalid class name and case insensitive filesystem */
public class C14070oZ {
    public final Context A00;
    public final SharedPreferences A01;
    public final C13920oI A02;
    public final AtomicBoolean A03;

    public C14070oZ(Context context, C13920oI r6, String str) {
        boolean z2;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Context context2 = context;
        if (Build.VERSION.SDK_INT >= 24 && !AnonymousClass00T.A0I(context)) {
            context2 = AnonymousClass00T.A02(context);
        }
        this.A00 = context2;
        StringBuilder sb = new StringBuilder("com.google.firebase.common.prefs:");
        sb.append(str);
        SharedPreferences sharedPreferences = context.getSharedPreferences(sb.toString(), 0);
        this.A01 = sharedPreferences;
        this.A02 = r6;
        if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            z2 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            try {
                Context context3 = this.A00;
                PackageManager packageManager = context3.getPackageManager();
                if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context3.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled"))) {
                    z2 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            z2 = true;
        }
        this.A03 = new AtomicBoolean(z2);
    }
}
