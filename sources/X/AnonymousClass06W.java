package X;

import android.content.Context;
import android.content.res.Configuration;

/* renamed from: X.06W  reason: invalid class name */
public class AnonymousClass06W {
    public static Context A00(Context context, Configuration configuration) {
        return context.createConfigurationContext(configuration);
    }

    public static void A01(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        int i2 = configuration.densityDpi;
        int i3 = configuration2.densityDpi;
        if (i2 != i3) {
            configuration3.densityDpi = i3;
        }
    }
}
