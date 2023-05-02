package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.Window;
import android.widget.ImageView;
import com.obwhatsapp.R;

/* renamed from: X.20f  reason: invalid class name and case insensitive filesystem */
public class C434920f {
    public static int A00(Context context, int i2, int i3) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        try {
            return AnonymousClass00T.A00(context, typedValue.resourceId);
        } catch (Resources.NotFoundException unused) {
            return AnonymousClass00T.A00(context, i3);
        }
    }

    public static AnonymousClass06V A01(Context context) {
        Configuration configuration = new Configuration();
        configuration.uiMode = (new Configuration().uiMode & -49) | 16;
        AnonymousClass06V r3 = context instanceof AnonymousClass06V ? (AnonymousClass06V) context : new AnonymousClass06V(context, (Resources.Theme) null);
        r3.A01(configuration);
        return r3;
    }

    public static void A02(int i2, Dialog dialog) {
        A06(dialog.getContext(), dialog.getWindow(), i2);
    }

    public static void A03(Activity activity, int i2) {
        Window window;
        if (Build.VERSION.SDK_INT >= 21 && (window = activity.getWindow()) != null) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(67108864);
            int A00 = AnonymousClass00T.A00(activity, i2);
        }
    }

    public static void A04(Activity activity, int i2) {
        A06(activity.getBaseContext(), activity.getWindow(), i2);
    }

    public static void A05(Activity activity, int i2, int i3) {
        if (C15450qv.A03()) {
            boolean z2 = true;
            if (i3 != 1 || A09(activity)) {
                z2 = false;
            } else if (!C15450qv.A07()) {
                return;
            }
            Window window = activity.getWindow();
            if (window != null) {
                window.setNavigationBarColor(AnonymousClass00T.A00(activity, i2));
                if (Build.VERSION.SDK_INT >= 27) {
                    int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
                    int i4 = systemUiVisibility & -17;
                    if (z2) {
                        i4 = systemUiVisibility | 16;
                    }
                    window.getDecorView().setSystemUiVisibility(i4);
                }
            }
        }
    }

    public static void A06(Context context, Window window, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            boolean z2 = !A09(context);
            if (window != null) {
                window.addFlags(Integer.MIN_VALUE);
                window.clearFlags(67108864);
                int A00 = AnonymousClass00T.A00(context, i2);
                A08(window, z2);
            }
        }
    }

    public static void A07(Context context, ImageView imageView) {
        AnonymousClass2SR.A08(imageView, A00(context, R.attr.attr0451, R.color.color070f));
    }

    public static void A08(Window window, boolean z2) {
        if (Build.VERSION.SDK_INT >= 23) {
            int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            int i2 = systemUiVisibility & -8193;
            if (z2) {
                i2 = systemUiVisibility | 8192;
            }
            window.getDecorView().setSystemUiVisibility(i2);
        }
    }

    public static boolean A09(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }
}
