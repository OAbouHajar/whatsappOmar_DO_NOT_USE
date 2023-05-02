package X;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;

/* renamed from: X.0KU  reason: invalid class name */
public enum AnonymousClass0KU {
    AUTOMATIC,
    TRUNCATE,
    WRITE_AHEAD_LOGGING;

    public final AnonymousClass0KU A00(Context context) {
        Object systemService = context.getSystemService("activity");
        C18450wi.A0M(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        return (Build.VERSION.SDK_INT < 19 || !AnonymousClass0M7.A00((ActivityManager) systemService)) ? WRITE_AHEAD_LOGGING : TRUNCATE;
    }
}
