package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* renamed from: X.4Z5  reason: invalid class name */
public final class AnonymousClass4Z5 {
    public static int A00;
    public static boolean A01;
    public static final Object A02 = C13690nt.A0Y();

    public static int A00(Context context) {
        synchronized (A02) {
            if (!A01) {
                A01 = true;
                try {
                    Bundle bundle = C15560rQ.A00(context).A00.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        bundle.getString("com.google.app.id");
                        A00 = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e2);
                }
            }
        }
        return A00;
    }
}
