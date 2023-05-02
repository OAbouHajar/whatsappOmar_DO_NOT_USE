package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* renamed from: X.00T  reason: invalid class name */
public class AnonymousClass00T {
    public static final Object A00 = new Object();

    public static int A00(Context context, int i2) {
        return Build.VERSION.SDK_INT >= 23 ? AnonymousClass00W.A00(context, i2) : context.getResources().getColor(i2);
    }

    public static int A01(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static Context A02(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return AnonymousClass00U.A00(context);
        }
        return null;
    }

    public static ColorStateList A03(Context context, int i2) {
        return AnonymousClass00X.A01(context.getTheme(), context.getResources(), i2);
    }

    public static Drawable A04(Context context, int i2) {
        return Build.VERSION.SDK_INT >= 21 ? AnonymousClass00Y.A00(context, i2) : context.getResources().getDrawable(i2);
    }

    public static View A05(Activity activity, int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) C000600h.A00(activity, i2);
        }
        View findViewById = activity.findViewById(i2);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    public static File A06(Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            return AnonymousClass00Y.A01(context);
        }
        File file = new File(context.getApplicationInfo().dataDir, "no_backup");
        synchronized (A00) {
            if (!file.exists() && !file.mkdirs()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to create files subdir ");
                sb.append(file.getPath());
                Log.w("ContextCompat", sb.toString());
            }
        }
        return file;
    }

    public static Object A07(Context context, Class cls) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AnonymousClass00W.A01(context, cls);
        }
        String str = (String) AnonymousClass00c.A00.get(cls);
        if (str != null) {
            return context.getSystemService(str);
        }
        return null;
    }

    public static Executor A08(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? C000000a.A00(context) : new C000100b(new Handler(context.getMainLooper()));
    }

    public static void A09(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            AnonymousClass00V.A00(activity);
        } else {
            activity.finish();
        }
    }

    public static void A0A(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            AnonymousClass00V.A01(activity);
        }
    }

    public static void A0B(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new C000200d(activity));
        }
    }

    public static void A0C(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            AnonymousClass00V.A02(activity);
        }
    }

    public static void A0D(Activity activity, C000700i r3) {
        if (Build.VERSION.SDK_INT >= 21) {
            AnonymousClass00V.A03(activity, r3 != null ? new AnonymousClass0A6(r3) : null);
        }
    }

    public static void A0E(Activity activity, C000700i r3) {
        if (Build.VERSION.SDK_INT >= 21) {
            AnonymousClass00V.A04(activity, r3 != null ? new AnonymousClass0A6(r3) : null);
        }
    }

    public static void A0F(Activity activity, String[] strArr, int i2) {
        int length = strArr.length;
        int i3 = 0;
        while (i3 < length) {
            if (!TextUtils.isEmpty(strArr[i3])) {
                i3++;
            } else {
                StringBuilder sb = new StringBuilder("Permission request for permissions ");
                sb.append(Arrays.toString(strArr));
                sb.append(" must not contain null or empty values");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            C000300e.A00(activity, strArr, i2);
        } else if (activity instanceof C000400f) {
            new Handler(Looper.getMainLooper()).post(new C000500g(activity, strArr, i2));
        }
    }

    public static void A0G(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            C000800j.A00(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static boolean A0H(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C000300e.A02(activity, str);
        }
        return false;
    }

    public static boolean A0I(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return AnonymousClass00U.A01(context);
        }
        return false;
    }

    public static File[] A0J(Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            return AnonymousClass00Z.A00(context);
        }
        return new File[]{context.getExternalCacheDir()};
    }

    public static File[] A0K(Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            return AnonymousClass00Z.A01(context, (String) null);
        }
        return new File[]{context.getExternalFilesDir((String) null)};
    }
}
