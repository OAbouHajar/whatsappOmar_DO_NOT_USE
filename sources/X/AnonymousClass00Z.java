package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.00Z  reason: invalid class name */
public class AnonymousClass00Z {
    public static File[] A00(Context context) {
        return context.getExternalCacheDirs();
    }

    public static File[] A01(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }
}
